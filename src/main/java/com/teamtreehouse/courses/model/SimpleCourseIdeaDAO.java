package com.teamtreehouse.courses.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexis-toma.ghillis on 3/20/2017.
 */
public class SimpleCourseIdeaDAO implements CourseIdeaDAO {

    private List<CourseIdea> ideas;

    public SimpleCourseIdeaDAO() {
        ideas = new ArrayList<>();
    }

    @Override
    public boolean add(CourseIdea idea) {
        return ideas.add(idea);
    }

    @Override
    public List<CourseIdea> findAll() {
        return new ArrayList<>(ideas);
    }
}