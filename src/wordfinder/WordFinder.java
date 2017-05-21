/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordfinder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author usman
 */
public class WordFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException 
    {
        // TODO code application logic here
        if(args.length != 2)
        {
            System.out.println ("Please insert 2 arguments");
            System.exit(0);
        }
        File inputFile = new File(args[0]);
        Scanner in = new Scanner(inputFile);
        
        String wordToFind = args[1];
        Map<String,Integer> wordOutput = new HashMap<String,Integer>();
        
        while (in.hasNext())
        {
            String nextWord= in.next();
            if(wordOutput.containsKey(nextWord))
            {
                int count = wordOutput.get(nextWord).intValue()+1;
                wordOutput.put(nextWord, new Integer(count));
            }
            else
            {
                wordOutput.put(nextWord,new Integer(1));
            }
          /*  if (in.next().equalsIgnoreCase(wordToFind))
            {
                System.out.println("Yes");
                System.exit(0);
            }*/
        }
        for(String word:wordOutput.keySet())
        {
            System.out.println(word+" "+ wordOutput.get(word).toString());
            
        }

    }
}
