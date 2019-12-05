package com.bharat.operationsclasses;



public class Controller {
	
	@RequestMapping("Authentication")
	public ModelAndView checkloginstatus(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndV
		String a=request.getParameter("username");
		String b=request.getParameter("password");
		
		ServiceClass s1= new ServiceClass();
		
		return s1.conditionscheck(a,b);
		
	}

}
