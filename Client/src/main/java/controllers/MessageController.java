package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.jar.JarEntry;

import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import models.Id;
import models.Message;
import org.json.JSONArray;

public class MessageController {
    List<Message> test = new ArrayList<Message>();
    private HashSet<Message> messagesSeen;
    // why a HashSet??

    public ArrayList<Message> getMessages() {

        HttpResponse<JsonNode> response = Unirest.get("http://zipcode.rocks:8085/messages")
                .header("accept", "application/json").asJson();
        String node = response.getBody().toString();
        ObjectMapper mapper = new ObjectMapper();
        try {
            test = Arrays.asList(mapper.readValue(node,Message[].class));

        } catch (IOException e) {
            e.printStackTrace();
        }




        return (ArrayList<Message>) test;
    }
    public ArrayList<Message> getMessagesForId(Id Id) {
        for (Message message : test) {
            //if(message.getToid().equals(Id.getGitHubId));

        }


        return null;
    }
    public Message getMessageForSequence(String seq) {
        return null;
    }
    public ArrayList<Message> getMessagesFromFriend(Id myId, Id friendId) {
        return null;
    }

    public Message postMessage(Id myId, Id toId, Message msg) {
        return null;
    }


 
}