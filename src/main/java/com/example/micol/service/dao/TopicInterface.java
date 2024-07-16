package com.example.micol.service.dao;

import com.example.micol.Model.entity.Topidemrda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicInterface extends JpaRepository<Topidemrda, Integer> {
}
