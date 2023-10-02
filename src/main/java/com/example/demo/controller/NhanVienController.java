package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/admin/nhan-vien")
public class NhanVienController {

    @GetMapping("/hien-thi")
    public String index(){
        return "/admin/nhanvien/nhan-vien.html";
    }
    @GetMapping("/add")
    public String add(){
        return "/admin/nhanvien/add.html";
    }
    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") UUID id){
        model.addAttribute("id",id);
        return "/admin/nhanvien/update.html";
    }
}
