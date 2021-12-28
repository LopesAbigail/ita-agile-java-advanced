package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileRepository {
    
    private String FILE_NAME = "words.txt";
    StringUtils utils = new StringUtils();
    
    // TODO: Add new words
    public void writeFile() {
        try {
            FileWriter myWriter = new FileWriter(FILE_NAME);
            myWriter.write("\nLove!Amor");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) { 
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public String seachWordInFile(String word) 
    {
        if (word == null || "".equals(word)) return "Hey, insira uma palavra; valores nulos nao sao permitidos!";
        
        String translate = word;
        
        try 
        {
            word = utils.prepareWord(word);
            // Decorator
            FileInputStream fis = new FileInputStream(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            
            String line = br.readLine();
            
            while (line != null && !line.contains(word)) 
            {
                line = br.readLine();
            }
            
            br.close();
            
            if (line != null) translate = utils.getTranslation(line);
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(FileRepository.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(FileRepository.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return translate;
    }
  
}