package com.deppatori.jeanapp;

import com.deppatori.jeanapp.model.Message;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MessageTest {

    @Test
    public void testConstruct(){
        Message message = new Message("A Message");
        assertTrue(message.getText() == "A Message");
    }

    @Test
    public void testSetText(){
        Message message = new Message();
        message.setText("A New Message");
        assertTrue(message.getText() == "A New Message");
    }
}
