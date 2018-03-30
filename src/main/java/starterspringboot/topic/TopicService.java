package starterspringboot.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service // used to create a single instance of
public class TopicService {
    // hardcode the data
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "Javascript", "Javascript Description")
        ));


    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id)
    {
        //                              uses lambdas
        // iterates over the various topics and find the id that matches
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

        // check every topic and if they match return the on that matches
//       for (int i = 0; i < topics.size(); i++)
//       {
//           Topic t = topics.get(i);
//           if (t.getId().equals(id)) // if the item is found than change it (its "id")
//           {
//               return t;
//           }
//
//       }
       //Topic dummy = new Topic("dummy", "not a language", "alternative description");
       //return null; // else return nothing
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }


    public void updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++)
        {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) // if the item is found than change it (its "id")
            {
                topics.set(i, topic); // topics[i] = parameter passed in which is topic
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        for (int i = 0; i < topics.size(); i++)
        {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) // if the item is found
            {
                topics.remove(i); // remove from array
            }
        }
    }
}
