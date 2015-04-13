
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.util.Enumeration;

/**
 *
 * @author Taha Emara 
 * Email: tahaemara.eng@gmail.com
 * LinkedIn: https://www.linkedin.com/in/tahaemara
 */
public class WhatIsMyIP {
     
      public static boolean checkInternetConnection() throws SocketException {
        Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface interf = (NetworkInterface) interfaces.nextElement();
            if (interf.isUp() && !interf.isLoopback()) {
                return true;
            }
        }
        return false;
    }

    public static String readIP() throws MalformedURLException, IOException {
        URL myIP = new URL("http://icanhazip.com/");
        BufferedReader in = new BufferedReader(new InputStreamReader(myIP.openStream()));
        return in.readLine();
    }

    public static void main(String args[]) throws MalformedURLException, IOException {
         if (checkInternetConnection()) {
            System.out.println("Your Public Ip is: " + readIP());
        } else {
            System.out.println("No Internet connectio !!!");
        }
    }
}
