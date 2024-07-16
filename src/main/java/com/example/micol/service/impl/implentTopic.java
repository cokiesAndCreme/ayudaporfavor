package com.example.micol.service.impl;


import com.example.micol.Model.entity.Topidemrda;
import com.example.micol.Model.entity.dto.TopicDto;
import com.example.micol.service.TopicI;
import com.example.micol.service.dao.TopicInterface;
import com.example.micol.service.mapstrucket.MapperComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class implentTopic  implements TopicI {

    @Autowired
    TopicInterface topicInterface;

    @Autowired
    MapperComponent mapperComponent;

    @Override
    public void save(TopicDto topicDto) {
        topicInterface.save(mapperComponent.toObject(topicDto));
    }

    @Override
    public TopicDto findbyid(Integer id) {
        return null;
    }

    @Override
    public void deletebyid(Integer id) {

    }

    @Override
    public TopicDto uploadbyid(Integer id) {
        return null;
    }

    @Override
    public List<TopicDto> findAll() {
        return List.of();
    }
}
