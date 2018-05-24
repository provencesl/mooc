package com.edu.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.edu.pojo.Course;
import com.edu.pojo.User_info;
import com.edu.service.impl.CourseServiceImpl;
import com.edu.service.impl.UserServiceImpl;
import com.edu.util.CookieManage;

@Controller
public class UserInfoController {
	@Autowired
	private UserServiceImpl userInfoService;
	@Autowired
	private CourseServiceImpl courseService;
	/*
	 * 获取所有的用户信息，返回json
	 */
	@RequestMapping("/getAllUsers")
	@ResponseBody
	public List<User_info>  getList() {
		List<User_info> list = userInfoService.getAllUsers();
		//ModelAndView modelAndView=new ModelAndView("userManage");
		//modelAndView.addObject("users", list);
		return list;
	}
	/*
	 * 跳转到login.jsp
	 */
	@RequestMapping("/login")
	public ModelAndView toLogin(HttpServletRequest request) {
		Cookie username = CookieManage.getCookieByName(request, "username");
		Cookie password = CookieManage.getCookieByName(request, "uesrpwd");
		ModelAndView modelandview = new ModelAndView("login");
		if(username!=null&&password!=null){
			modelandview.addObject("username", username);
			modelandview.addObject("userpwd", password);
		}
		return modelandview;
	}
	/*
	 * 注册
	 */
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public ModelAndView regest(HttpServletRequest request,HttpServletResponse response) {
		String username=request.getParameter("username");
		String password=request.getParameter("userpwd");
		User_info user = new User_info();
		user.setUsername(username);
		user.setUserpwd(password);
		user.setUsertype(0);
		int flag = userInfoService.insertUser(user);
		ModelAndView modelandview = new ModelAndView("login");
		//输出提示
		if(flag==1){
			response.setContentType("text/html; charset=UTF-8"); //转码
			 PrintWriter out;
			 try {
				out = response.getWriter();
				out.flush();
				out.println("<script>");
				out.println("alert('注册成功！');");
				//out.println("history.back();");
				out.println("</script>");
			 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
			 
		}
	
		return modelandview;
	}
	@RequestMapping("/logout")
	public ModelAndView logOut(HttpSession session,HttpServletRequest request){
		session.removeAttribute("username");
		Cookie username = CookieManage.getCookieByName(request, "username");
		Cookie password = CookieManage.getCookieByName(request, "uesrpwd");
		ModelAndView modelandview = new ModelAndView("login");
		if(username!=null&&password!=null){
			modelandview.addObject("username", username);
			modelandview.addObject("userpwd", password);
		}
		return modelandview;
	}
	//跳转到addcourse.jsp
	@RequestMapping("/toAddCourse")
	public ModelAndView toAddCourse(){
		ModelAndView modelandview = new ModelAndView("teacher/add_course");
		return modelandview;
	}
	@RequestMapping(value = "/studentlogin",method = RequestMethod.POST)
	public ModelAndView studentLogin(HttpServletRequest request,HttpServletResponse response,HttpSession session) {
		String username=request.getParameter("username");
		String password=request.getParameter("userpwd");
		String usertype=request.getParameter("usertype");
		ModelAndView modelAndView=null;
		System.out.println(username+"..."+password+"..."+usertype);
		boolean res=userInfoService.checkLogin(username, password);
		User_info user = userInfoService.selectByUsername(username);
		//System.out.println(user.getUserid());
		List<Course> course_list = courseService.getCourseByTeacherId(user.getUserid());
		//System.out.println("url:..."+course_list.get(0).getPicurl());
		if(res==true){
			session.setAttribute("username", username);
			session.setAttribute("userid", user.getUserid());
			//添加cookie
			CookieManage.addCookie(response, "username", username);
			CookieManage.addCookie(response, "userped", password);
			if(usertype.equals("0")){
				modelAndView=new ModelAndView("index");
				modelAndView.addObject("user",user);
				//当前四种类型的所有课程
				List<Course> course_list0 =courseService.getCourseByType(0); 
				List<Course> course_list1 =courseService.getCourseByType(1);
				List<Course> course_list2 =courseService.getCourseByType(2);
				List<Course> course_list3 =courseService.getCourseByType(3);
				modelAndView.addObject("course_list0",course_list0);
				modelAndView.addObject("course_list1",course_list1);
				modelAndView.addObject("course_list2",course_list2);
				modelAndView.addObject("course_list3",course_list3);
			}else if(usertype.equals("1")){
				modelAndView=new ModelAndView("teacher/home");
				modelAndView.addObject("usertype","教师");
				modelAndView.addObject("user",user);
				//还需要获取user所有的课程，传递给home
				modelAndView.addObject("course_list",course_list);
			}else if(usertype.equals("2")){
				modelAndView=new ModelAndView("admin");
				modelAndView.addObject("user",user);
			}
			
		}else{
			modelAndView=new ModelAndView("login");
			modelAndView.addObject("errorMessage","用户名或密码错误");
		}
		return modelAndView;
	}
	/*@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request){
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String resSTR="";
		boolean res=userInfoService.checkLogin(username, password);
		if(res==true){
			resSTR="redirect:getAllUsers";
		}else{
			resSTR="error";
		}
		return resSTR;
	}
	@RequestMapping("add")
	public String add(){
		return "userEdit";
	}
	@RequestMapping(value = "/edit",method = RequestMethod.GET)
	public String edit(HttpServletRequest request){
		String id=request.getParameter("id");
		UserInfo user=userInfoService.selectByPrimaryKey(Integer.valueOf(id));
		request.setAttribute("user", user);
		
		return "userEdit";
	}
	@RequestMapping(value = "/editsubmit",method = RequestMethod.POST)
	public String saveOrUpdate(UserInfo user){
		System.out.println(user);
		if(user.getId()==null){
			userInfoService.insert(user);
		}else{
			userInfoService.updateByPrimaryKey(user);
		}
		return "redirect:getAllUsers";
	}
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public String delete(HttpServletRequest request){
		String id=request.getParameter("id");
		int res=userInfoService.deleteByPrimaryKey(Integer.valueOf(id));
		
		return "redirect:getAllUsers";
	}*/
}
