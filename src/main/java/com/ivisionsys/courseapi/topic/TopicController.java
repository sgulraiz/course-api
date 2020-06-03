package com.ivisionsys.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * To make this class a rest controller which will map the incoming requests to specific URI
 * use the annotation to tell the spring that this class is the Rest Controller
 */
@RestController
public class TopicController {

    //to get the singleton instance of the business service use the auto wired annotation
    //this annotation will create the dependency of this controller on the business service
    //and will inject the instance to this private variable
    @Autowired
    private TopicService topicService;

    //To map the request to specific URI use Request Mapping annotation
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }


}
