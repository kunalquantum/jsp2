package com.management.web;

import com.management.dao.UserDao;
import com.management.bean.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    UserDao userdao;
    
    public UserServlet() {
        super();
    }

    public void init(ServletConfig config) throws ServletException {
        // Initialization code if needed
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        try {
            switch(action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertUser(request, response);
                    break;    
                case "/delete":
                    deleteUser(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateUser(request, response);
                    break;
                default:
                    listUser(request, response);
                    break;
            }
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        dispatcher.forward(request, response);
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        User user = new User(name, email, country);
        UserDao userDao = new UserDao();
		userDao.insert_user(user);
        response.sendRedirect("list");
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        try {
        	userdao.deleteUsersByID(id);
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
    	int id=Integer.parseInt(request.getParameter("id"));
    	User existinguser;
        existinguser =userdao.SelectUser(id);
        request.setAttribute("user", existinguser);
        RequestDispatcher rd=request.getRequestDispatcher("list");
        rd.forward(request, response);
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	int id=Integer.parseInt( request.getParameter("id"));
    	String  name=request.getParameter("name");
    	String email=request.getParameter("email");
    	String country=request.getParameter("country");
    	
    	try {
    		User user=new User(id,name,email,country);
    		userdao.UpdateUser(user);
    		response.sendRedirect("list");
    	}catch(Exception e ) {
    		e.printStackTrace();
    	}
    	
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
    	List<User> list=userdao.SelectallUsers();
    	request.setAttribute("listUsers", list);
    	RequestDispatcher rd=request.getRequestDispatcher("user-list.jsp");
    	rd.forward(request, response);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
