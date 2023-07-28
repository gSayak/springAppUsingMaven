package com.sayak.helloworld.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class topicService {

    private List<topics> Topics = new ArrayList<>(Arrays.asList(
            new topics("spring", "Spring Framework", "Spring Framework Description"),
            new topics("python", "python Framework", "python Framework Description"),
            new topics("java", "java Framework", "java Framework Description"),
            new topics("react", "react Framework", "react Framework Description")));

    public List<topics> getAllTopics() {
        return Topics;
    }

    public topics getTopic(String id) {
        return Topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(topics topic) {
        Topics.add(topic);
    }

    public void updateTopic(String id, topics topic) {
        for (int i = 0; i < Topics.size(); i++) {
            topics t = Topics.get(i);
            if (t.getId().equals(id)) {
                Topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id){
        for(int i=0; i< Topics.size(); i++){
            topics t = Topics.get(i);
            if(t.getId().equals(id)){
                Topics.remove(i);
                return;
            }
        }
    }
}
