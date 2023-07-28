package com.sayak.databaseCRUD.topics;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class topicController {

    @Autowired
    private topicService TopicService;

    @RequestMapping("/topics")
    public List<topics> getAllTopics() {
        return TopicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public topics getTopic(@PathVariable String id) {
        return TopicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody topics topic) {
        TopicService.addTopic(topic);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody topics topic, @PathVariable String id) {
        TopicService.updateTopic(id, topic);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        TopicService.deleteTopic(id);
    }
}
