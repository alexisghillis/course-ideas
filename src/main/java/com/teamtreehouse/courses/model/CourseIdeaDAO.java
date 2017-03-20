package com.teamtreehouse.courses.model;

import java.util.List;

/**
 * Created by alexis-toma.ghillis on 3/20/2017.
 */
public interface CourseIdeaDAO {

    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();

}
