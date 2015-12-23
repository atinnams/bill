package com.medical.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medical.bean.ItemMaster;
import com.medical.services.ItemService;

@Controller
@Scope(value = "session")
public class HomeController extends AbstractController {

    @Autowired
    @Qualifier("itemService")
    ItemService itemService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getMusicForYearsAndDecades(HttpServletRequest request, ModelMap model) {
        model.addAttribute("item", new ItemMaster());
        return "item";
    }

    @RequestMapping("/a")
    public String saveClient(@ModelAttribute("item") ItemMaster itemMaster, BindingResult result) {

        itemMaster.setCode("aa");
        itemService.save(itemMaster);
        System.out.println("executing insert:::");

        return "item";

    }

}
