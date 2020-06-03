package com.ivisionsys.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**This is the Topic business service. A singleton (single) instance of this service
 will be created during runtime.
 To tell Spring that this is the Business Service use Spring Stereotype Service annotation
 */
@Service
public class TopicService {

    //Create an instance of the TopicRepository by creating a new member variable and Auto wiring it.
    //When this instance is created, spring will inject the Topic Repository in this member variable.

    @Autowired
    private TopicRepository topicRepository;

    //Get all topics
    public List<Topic> getAllTopics(){
        //Create an array list to store all the topics returned from the database
        List<Topic> topics = new ArrayList<>();
        //find all method goes out to the database and gets all the rows from the Topic table
        //and converts those rows to Topic instances and returns it.
        //findAll() is iterable - iterate and add to the list
        topicRepository.findAll().forEach(topics::add);
        return topics;

    }

    //Get a single topic



}
