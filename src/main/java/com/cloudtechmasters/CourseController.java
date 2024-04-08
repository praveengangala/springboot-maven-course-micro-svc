package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class CourseController {
    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);
//create two endpoints getAllAwsServices and getAllDevopsTools
    @GetMapping("/getnames")
    public List<String> getAllAwsServices(){
        System.out.println("added for failing sonar build");
        return Arrays.asList("saha","praveen","jani");
    }

    @GetMapping("/getAllDevopsTools")
    public List<String> getAllDevopsTools(){
        return Arrays.asList("git","maven","sonar","nexus","jenkins");
    }
}
