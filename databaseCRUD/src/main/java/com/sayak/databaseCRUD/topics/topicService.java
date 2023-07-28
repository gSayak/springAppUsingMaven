package com.sayak.databaseCRUD.topics;

import java.util.ArrayList;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class topicService {
    @Autowired
    private topicRepository TopicRepository;

    public List<topics> getAllTopics() {
        // return Topics;
        List<topics> Topics = new ArrayList<>();
        TopicRepository.findAll()
                .forEach(Topics::add);
        return Topics;
    }

    public topics getTopic(String id) {
        return TopicRepository.findById(id).orElse(null);
    }

    public void addTopic(topics topic) {
        TopicRepository.save(topic);
    }

    public void updateTopic(String id, topics topic) {
        TopicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        TopicRepository.deleteById(id);
    }
}
