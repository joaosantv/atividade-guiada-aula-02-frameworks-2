package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Class;

public interface ClassRepository extends JpaRepository<Class, Long> {
    List<Class> findByTaught(boolean taught);
    List<Class> findByTitleContaining(String title);
}