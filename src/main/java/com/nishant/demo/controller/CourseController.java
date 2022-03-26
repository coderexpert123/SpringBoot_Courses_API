package com.nishant.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.nishant.demo.models.Course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private List<Course> allcourses = new ArrayList<>();

    public CourseController() {

        allcourses.add(new Course(100, "React.Js", "Nishant Singh"));

        allcourses.add(new Course(101, "Anglar.Js", "A Singh"));
        allcourses.add(new Course(102, "Next.Js", "B Singh"));

    }

    @GetMapping("/courses")

    public List<Course> allcourses() {
        System.out.println(allcourses.get(0));
        return allcourses;

    }

    @GetMapping("/courses/{cid}")
    public Course singleCourse(@PathVariable("cid") Integer courseids) {
        return allcourses.get(1);

    }

    @PostMapping("/postCourses")
    public List<Course> postcourses(@RequestBody Course course) {
        allcourses.add(course);

        return allcourses;

    }

}
