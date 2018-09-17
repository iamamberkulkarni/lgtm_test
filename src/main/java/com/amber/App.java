package com.amber;

import java.io.FileWriter;
import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class App {

    public static void main(String[] args) {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
        obj.writeKey(obj.generateUniqueKey());
    }

    private void writeKey(String string) {
        try {
            FileWriter fw = new FileWriter("/tmp/amber_lgtm_test");
            fw.write("key: " + string);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }

    public String generateUniqueKey() {

        String id = UUID.randomUUID().toString();
        return id;

    }
}
