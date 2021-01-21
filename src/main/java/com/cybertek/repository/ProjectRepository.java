package com.cybertek.repository;

import com.cybertek.entity.Project;
import com.cybertek.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    Project findByProjectCode(String code);
    List<Project> findAllByAssignedManager(User manager);
}
