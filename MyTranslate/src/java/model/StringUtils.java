/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.StringUtils to edit this template
 */
package model;

import java.text.Normalizer;

/**
 *
 * @author conta
 */
public class StringUtils {
    
    public String prepareWord(String src) 
    {
		return Normalizer
				.normalize(src, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "")
                                .toLowerCase()
                                .replaceAll("ç", "c")
                                .trim();
    }
    
    public String getTranslation(String line) 
    {
        return line.split("!")[1];
    }
    
}
