/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.codingChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

/**
 *
 * @author sreek
 */
public class AgeCounter1 {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    System.setProperty("http.agent", "Chrome");
    try {
      URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
      try {
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        System.out.println(inputStream);
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
       
        StringBuffer buf = new StringBuffer();
        String line;
        //System.out.println(r.readLine());
         int count = 0;
        while ((line = r.readLine())!=null) {
             buf.append(line);
             
        }
       System.out.println(buf);
       JSONObject jsonObj = new JSONObject(buf.toString());
       String[] last = jsonObj.get("data").toString().split(",");
        for (String one : last) {
           String[] age = one.split("=");
           if(age[0].trim().equals("age")){
               if(Integer.parseInt(age[1])>=50)                         
                   count++;
           }
       }
       System.out.println(count);

      } catch (IOException ioEx) {
        System.out.println(ioEx);
        
      }
    } catch (MalformedURLException malEx) {
      System.out.println(malEx);
    }
    }
    
}
