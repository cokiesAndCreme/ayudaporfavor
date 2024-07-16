package com.example.micol.controller;

import com.example.micol.Model.entity.dto.TopicDto;

import com.example.micol.service.TopicI;
import com.example.micol.service.dao.TopicInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topic")
public class Controllwe {

    @Autowired
    TopicI topicI;


    @PostMapping
    public void create(@RequestBody TopicDto topicDto){
        topicI.save(topicDto);
    }


}
