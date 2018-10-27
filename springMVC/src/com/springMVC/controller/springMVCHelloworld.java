/**
 * 
 */
package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Asif Bilakhiya
 *
 */
@Controller
public class springMVCHelloworld {
@RequestMapping("/welcome")
public ModelAndView helloworld()
{
	String message="Message from springMVCHelloworld.java";
	return new ModelAndView("welcome","message",message);
}
}
