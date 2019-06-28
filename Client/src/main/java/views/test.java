package views;

import com.fasterxml.jackson.core.type.TypeReference;
import controllers.IdController;
import controllers.MessageController;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

import kong.unirest.Unirest;
import models.Message;
import org.json.JSONArray;
import com.fasterxml.jackson.databind.ObjectMapper;
import sun.misc.resources.Messages;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<Message> test = new ArrayList<Message>();
        HttpResponse<JsonNode> response = Unirest.get("http://zipcode.rocks:8085/messages")
                .header("accept", "application/json").asJson();
        String node = response.getBody().toString();
        ObjectMapper mapper = new ObjectMapper();


        try {
            test = Arrays.asList(mapper.readValue(node,Message[].class));


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(test.get(0).getMessage());
    }
}
