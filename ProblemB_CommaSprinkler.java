/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemb_commasprinkler;

import java.util.*;

/**
 *
 * @author 139673
 */
public class ProblemB_CommaSprinkler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

       String[] words = str.split(" ");
       
       
       // loop the entire line
       for (int i = 0; i < str.split(" ").length; i++) {
           // if the preceeding word has a comma
           if (i != 0 && str.split(" ")[i - 1].endsWith(",")) {
               // get all the occurences of the word and add preceeding commas on all occurences
               // aside from the words in the beginning of sentences and if it already has preceeding comma
               for (int j = 0; j < str.split(" ").length; j++) {
                   if (j != 0 && words[i].replace(",", "").replace(".", "").equals(words[j].replace(",", "").replace(".", "")) && !words[j - 1].endsWith(",") && !words[j - 1].endsWith(".")) {
                       System.out.print(str.split(" ")[j] + " ");
                       words[j-1] = str.split(" ")[j-1] + ",";
                   }
               }
               System.out.println("");
           }
           
           if (i != str.split(" ").length - 1 && str.split(" ")[i].endsWith(",")) {
               // get all the occurences of the word and add preceeding commas on all occurences
               // aside from the words in the beginning of sentences and if it already has preceeding comma
               for (int j = 0; j < str.split(" ").length; j++) {
                   if (j != str.split(" ").length - 1 && words[i].replace(",", "").replace(".", "").equals(words[j].replace(",", "").replace(".", "")) && !words[j].endsWith(", ") && !words[j].endsWith(".")) {
                       System.out.print(str.split(" ")[j] + " ");
                       words[j] = str.split(" ")[j] + ",";
                   }
               }
               System.out.println("");
           }
       }
       
       for (String word : words) {
           System.out.print(word + " ");
       }
    }

}
