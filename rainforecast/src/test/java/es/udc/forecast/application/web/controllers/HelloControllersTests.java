package es.udc.forecast.application.web.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import es.udc.forecast.application.business.SpringappBusinessConfig;
import es.udc.forecast.application.web.SpringappWebConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {SpringappBusinessConfig.class, SpringappWebConfig.class})
@WebAppConfiguration
public class HelloControllersTests {
	@Autowired
	private HelloController controller;

	@Test
	public void testHandleRequestView() {
		ModelAndView modelAndView = controller.handleRequest();
		assertEquals("hello.jsp", modelAndView.getViewName());
	}
}
