package com.travelwink.opensearch_demo.opensearch.controller;

import com.travelwink.opensearch_demo.opensearch.entity.UserManual;
import com.travelwink.opensearch_demo.opensearch.service.UserManualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/es")
public class UserManualController {

    @Autowired
    private UserManualService userManualService;

    @PostMapping("/userManual/add")
    public UserManual save(@RequestBody UserManual userManual) {
        return userManualService.addEntity(userManual);
    }

    @PostMapping("/userManual/query")
    public List<UserManual> save(@RequestBody String keyword) {
        return userManualService.findByText(keyword);
    }
}
