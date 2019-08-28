package com.bridgelabz.interceptors.interceptor;

import java.net.URI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class InterceptorDemo extends HandlerInterceptorAdapter {

	 @Override
	    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	            throws Exception {
		 	
		 	//System.err.println("getheader : "+request.getHeader("referer"));
		 ///	System.err.println("getheader : "+request.getHeader("Referer"));
		// System.err.println("request origin: "+request.getHeader("Origin"));
	//	System.err.println( request.getRemotePort());
		//System.err.println( "Remote Address : "+request.getRemoteAddr());
		//System.err.println( "url : "+request.getRequestURL().toString());
	
//		 	System.out.println("content type :"+request.getContentType());
//		 	System.out.println("auth type : "+request.getAuthType());
//		 	//System.out.println("get date header :"+request.getDateHeader("token"));
//		 	System.out.println("local address :"+request.getLocalAddr());
//		 	System.out.println("get param :"+request.getParameter("msg"));
//		 	System.out.println(" http servlet mapping:"+request.getHttpServletMapping());
//		 	//System.out.println(request.);
//
//	        long startTime = System.currentTimeMillis();
//	        System.out.println("\n-------- LogInterception.preHandle --- ");
//	        System.out.println("Request URL: " + request.getRequestURL());
//	        System.out.println("Start Time: " + System.currentTimeMillis());
//	 
//	        request.setAttribute("startTime", startTime);
	 
	        return true;
	    }
	 
	    @Override
	    public void postHandle(HttpServletRequest request, HttpServletResponse response, //
	            Object handler, ModelAndView modelAndView) throws Exception {
	 
	       // System.out.println("\n-------- LogInterception.postHandle --- ");
	      //  System.out.println("Request URL: " + request.getRequestURL());
	 
	        // You can add attributes in the modelAndView
	        // and use that in the view page
	    }
	 
	    @Override
	    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, //
	            Object handler, Exception ex) throws Exception {
	        //System.out.println("\n-------- LogInterception.afterCompletion --- ");
	 
	        //long startTime = (Long) request.getAttribute("startTime");
	       // long endTime = System.currentTimeMillis();
	       // System.out.println("Request URL: " + request.getRequestURL());
	       // System.out.println("End Time: " + endTime);
	 
	        //System.out.println("Time Taken: " + (endTime - startTime));
	    }
}
