package models;

import java.util.ArrayList;
import java.util.List;

/*
 * POJO for an Message object
 */
public class Message {
    private String sequence;
    private String timestamp;
    private String fromid;
    private String message;

    public String getToid() {
        return this.toid;
    }

    private String toid;
    public void setToid(final String toid) {
        this.toid = toid;
    }



    public Message(final String sequence, final String timestamp, final String fromid, final String message, final String toid) {
        this.sequence = sequence;
        this.timestamp = timestamp;
        this.fromid = fromid;
        this.message = message;
        this.toid = toid;
    }

    public Message() {
    }


    public String getSequence() {
        return this.sequence;
    }

    public void setSequence(final String sequence) {
        this.sequence = sequence;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(final String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFromid() {
        return this.fromid;
    }

    public void setFromid(final String fromid) {
        this.fromid = fromid;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }



    public Message(String message, String fromId, String toId) {
    }



}