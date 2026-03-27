package com.example.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.Dept;
import com.example.backend.service.DeptService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DeptController {

    private final DeptService deptService;

    @GetMapping("/backend")
    public String getApi() {
        return "backend";
    }
    
    @GetMapping("/depts")
    public List<Dept> getAll() {
        return deptService.findAll();
    }
    
    @PostMapping("/depts")  // POST 요청을 받겠다는 선언!
    public Dept saveDept(@RequestBody Dept dept) {
        return deptService.save(dept);
    }
}