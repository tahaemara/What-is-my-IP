
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Taha Emara 
 * Email: tahaemara.eng@gmail.com
 * LinkedIn: https://www.linkedin.com/in/tahaemara
 */
public class WhatIsMyIP {

    static String readIP() throws MalformedURLException, IOException {
        URL myIP = new URL("http://icanhazip.com/");
        BufferedReader in = new BufferedReader(new InputStreamReader(myIP.openStream()));
        return in.readLine();
    }

    public static void main(String args[]) throws MalformedURLException, IOException {
        System.out.println("Your Public Ip is: " + readIP());

    }
}
