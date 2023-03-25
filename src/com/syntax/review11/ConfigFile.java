package com.syntax.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args) {
        // Location of the file
        String path="Files/Config.properties";
        //navigate to the file
        //whenever we have to read the data from file we use FileInputStream.
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fileInputStream);

            System.out.println(properties.get("userName"));
        } catch (FileNotFoundException e) {
            System.out.println("Something gone wrong");
        }catch (NullPointerException e){
            System.out.println("You are trying to call a method on Null object");
        } catch (IOException e) {
            System.out.println("IO Exception occurred");
        }
    }
}
