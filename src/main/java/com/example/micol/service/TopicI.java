package com.example.micol.service;

import com.example.micol.Model.entity.dto.TopicDto;

import java.util.List;

public interface TopicI {

    public void save(TopicDto topicDto);
    public TopicDto findbyid(Integer id);
    public void deletebyid(Integer id);
    public TopicDto uploadbyid(Integer id);
    public List<TopicDto> findAll();
}
