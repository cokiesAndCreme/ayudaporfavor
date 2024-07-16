package com.example.micol.service.mapstrucket;


import com.example.micol.Model.entity.Topidemrda;
import com.example.micol.Model.entity.dto.TopicDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperComponent {
    Topidemrda toObject(TopicDto topicDto);
    TopicDto toDto(Topidemrda topidemrda);
}
