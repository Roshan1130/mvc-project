package com.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dtos.SellerDto;


@Controller
public class SellerController {

	@RequestMapping(value = "form", method = RequestMethod.GET)
	public ModelAndView showProductPage() {
		SellerDto sd = new SellerDto();
		ModelAndView mv = new ModelAndView("form");
		mv.addObject("mvo1", sd);
		System.out.println();
		

		return mv;
	}

	@RequestMapping(value = "confirmation", method = RequestMethod.POST)
	public ModelAndView saveProduct(SellerDto sd) {
		/*
		 * Price Service ps; int p = ps.getPrice();
		 */
		ModelAndView mv = new ModelAndView("confirmation");
		mv.addObject("mvo2", sd);
		/*
		 * mv.addObject(mvo2, ps);
		 */		return mv;
	}

}