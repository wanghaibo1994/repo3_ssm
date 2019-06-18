package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @RequestMapping("findAll.do")
    public ModelAndView findAll() throws Exception {

        ModelAndView mav = new ModelAndView();
        List<Product> all = iProductService.findAll();
        mav.addObject("productList",all);
        mav.setViewName("product-list1");
        return mav;
    }
}
