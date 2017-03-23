package xyz.hardik.dao;
import java.io.*;
import java.net.*;

/**
 * 
 * Created by hpatel on 07-02-2017.
 * 
 * This one is Example for how to process Web Page output(Response) and process.
 * 
 */

public class Example4JavaGetUrl {

   public static void main (String[] args) {
	   
      URL u;
      InputStream is = null;
      DataInputStream dis;
      String s;

      try {

         u = new URL("https://maps.googleapis.com/maps/api/geocode/xml?address=chennai");
         is = u.openStream();        

         // Convert the InputStream to a buffered DataInputStream.      //
         // Buffering the stream makes the reading faster; the          //
         // readLine() method of the DataInputStream makes the reading  //
         // easier.                                                     //

         dis = new DataInputStream(new BufferedInputStream(is));

         // Now just read each record of the input stream, and print   //
         // it out.  Note that it's assumed that this problem is run   //
         // from a command-line, not from an application or applet.    //

         while ((s = dis.readLine()) != null) {
            System.out.println(s);
         }

      } catch (MalformedURLException mue) {

         System.out.println("Ouch - a MalformedURLException happened.");
         mue.printStackTrace();
         System.exit(1);

      } catch (IOException ioe) {

         System.out.println("Oops- an IOException happened.");
         ioe.printStackTrace();
         System.exit(1);

      } finally {
    	  
         try {
            is.close();
         } catch (IOException ioe) {
        	 
         }

      } // end of 'finally' clause

   }  // end of main

} // end of class definition