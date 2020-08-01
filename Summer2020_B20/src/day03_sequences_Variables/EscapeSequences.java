package day03_sequences_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class EscapeSequences {
   public static void main(String [] args ) {
       System.out.println("Hello Everyone \nMy name is Cybertek");
       System.out.println("\tI am in Virginia\n);");
       System.out.println("\n\n\t\t\tI Love programming");

       System.out.println("\\"); // this prints me one back slash
       System.out.println("/"); //this prints me one front slash

       System.out.println("\\\\"); // this prints me two back slash
       System.out.println("////"); // this prints me two front slash

       System.out.println("My name is Mu\'htar\'"); // 'Muhtar'
       System.out.println("My name is 'Muhtar'"); // 'Muhtar'

       System.out.println("My favorite TV-series: \"Game Of Throne\"");




   }

}
