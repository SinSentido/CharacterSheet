/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import dto.Charac;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sinsentido
 */
public class Logic {
    public static void createSaveFolder(){
        File save = new File("./save");
        
        if(!save.exists()){
            save.mkdir();
        }
    }
    
    public static List<Charac> readSavedFiles(){
        List<Charac> characters = new ArrayList<>();
        File save = new File("./save/");
        
        File[] savedFiles = save.listFiles();
        
        for(int i=0; i<savedFiles.length; i++){
            characters.add(buildCharacFromFile(savedFiles[i]));
        }
        
        return characters;
    }
    
    /*
    *This method returns a Charac object build from a saved file with the information of the object.
    */
    public static Charac buildCharacFromFile(File characFile){
        List<String> data = new ArrayList<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(characFile));
            br.lines().map(s -> s.split(":")).forEach(s -> {
                data.add(0, s[0]); //characterName
                data.add(1, s[1]); //player
                data.add(2, s[2]); //chronicle
                data.add(3, s[3]); //nature
                data.add(4, s[4]); //demeanor
                data.add(5, s[5]); //concept
                data.add(6, s[6]); //clan
                data.add(7, s[7]); //generation
                data.add(8, s[8]); //sire
                data.add(9, s[9]); //strength
                data.add(10, s[10]); //dexterity
                data.add(11, s[11]); //stamina
                data.add(12, s[12]); //charisma
                data.add(13, s[13]); //manipulation
                data.add(14, s[14]); //appearence
                data.add(15, s[15]); //perception
                data.add(16, s[16]); //intelligence
                data.add(17, s[17]); //wits
                data.add(18, s[18]); //history
            });
            
        } catch (IOException ex) {
            Logger.getLogger(Logic.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new Charac(data.get(0), data.get(1), data.get(2),
                    data.get(3), data.get(4), data.get(5),
                    data.get(6), data.get(7), data.get(8),
                    Byte.parseByte(data.get(9)),Byte.parseByte(data.get(10)),Byte.parseByte(data.get(11)),
                    Byte.parseByte(data.get(12)),Byte.parseByte(data.get(13)),Byte.parseByte(data.get(14)),
                    Byte.parseByte(data.get(15)),Byte.parseByte(data.get(16)),Byte.parseByte(data.get(17)),
                    data.get(18));
    }
    
    public static void saveNewCharac(Charac charac){
        File newFile;
        FileWriter fw;
        
        String data = String.format("%s:%s:%s:%s:%s:%s:%s:%s:%s:%s:%s:%s:%s:%s:%s:%s:%s:%s:%s", 
                charac.getCharName(), charac.getPlayer(), charac.getChronicle(),
                charac.getNature(), charac.getDemeanor(), charac.getConcept(),
                charac.getClan(), charac.getGeneration(), charac.getSire(),
                charac.getStrength().toString(), charac.getDexterity().toString(), charac.getStamina().toString(),
                charac.getCharisma().toString(), charac.getManipulation().toString(), charac.getAppearence().toString(),
                charac.getPerception().toString(), charac.getIntelligence().toString(), charac.getWits().toString(),
                charac.getHistory().replaceAll("\n", "&lj"));
        
        try {
            newFile = new File("./save/" + charac.getCharName().replaceAll(" ", "") + 
                    charac.getPlayer().replaceAll(" ", "") + 
                    charac.getChronicle().replaceAll(" ", "") +".lola");
            newFile.createNewFile();
            
            fw = new FileWriter(newFile);
            fw.write(data);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Logic.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static File lookForCharacFile(String filename){
        File file = new File("./save/" + filename + ".lola");
        
        if(!file.exists()){
            return null;
        }
        return file;
    }
    
    public static void removeCharacFile(String filename){
        File file = new File("./save/" + filename + ".lola");
        
        if(!file.exists()){
            return;
        }
        file.delete();
    }
}
