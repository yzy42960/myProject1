package com.yzy.controller;

import com.yzy.bean.Items;

import com.yzy.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping(value = "/demo")
    public String findById(int id, Model model){
        Items items = itemsService.findById(id);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
