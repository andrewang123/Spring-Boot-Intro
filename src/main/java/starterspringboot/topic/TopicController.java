package starterspringboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired // means that this instance is declared somewhere else in another class
    private TopicService topicService; // create a SINGLE instance

    // ############ GET REQUESTS ################
    @RequestMapping("/topics")
    // gets converted to json automatically
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}") // make it mapped to a token
    public Topic getTopic(@PathVariable String id) { // @PathVariable makes it connect make same name
        return topicService.getTopic(id);// if not same name as function can use "@PathVariable("PathVarNameHere")"

    }

    // ############ POST REQUEST ################
    // @RequestMapping (type of HTTP request, where the end point is)
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    // ############ UPDATE REQUEST ################
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic, id);
    }

    // ############ DELETE REQUEST ################
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }


















}
