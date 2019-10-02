/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author sinsentido
 */
public class Charac {
    private String charName,player, chronicle, nature, demeanor, concept, clan, generation, sire, history;
    private Byte strength, dexterity, stamina, charisma, manipulation, appearence, perception, intelligence, wits;

 
    /*Constructors*/
    //This is the basic constructor, only with the basic information of the character
    public Charac(String charName, String player, String chronicle,
            String nature, String demeanor, String concept,
            String clan, String generation, String sire){
        
        this.charName = charName;
        this.player = player;
        this.chronicle = chronicle;
        this.nature = nature;
        this.demeanor = demeanor;
        this.concept = concept;
        this.clan = clan;
        this.generation = generation;
        this.sire = sire;
    }
    
    //This is the constructor with all the attributes of the character
    public Charac(String charName, String player, String chronicle,
            String nature, String demeanor, String concept,
            String clan, String generation, String sire,
            Byte strength, Byte dexterity, Byte stamina,
            Byte charisma, Byte manipulation, Byte appearence,
            Byte perception, Byte intelligence, Byte wits,
            String history){
        
        this.charName = charName;
        this.player = player;
        this.chronicle = chronicle;
        this.nature = nature;
        this.demeanor = demeanor;
        this.concept = concept;
        this.clan = clan;
        this.generation = generation;
        this.sire = sire;
        this.strength = strength;
        this.dexterity = dexterity;
        this.stamina = stamina;
        this.charisma = charisma;
        this.manipulation = manipulation;
        this.appearence = appearence;
        this.perception = perception;
        this.intelligence = intelligence;
        this.wits = wits;
        this.history = history;
    }
    
    /*
    *Getters and setters
    */
    
    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getChronicle() {
        return chronicle;
    }

    public void setChronicle(String chronicle) {
        this.chronicle = chronicle;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getDemeanor() {
        return demeanor;
    }

    public void setDemeanor(String demeanor) {
        this.demeanor = demeanor;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }
    
    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Byte getStrength() {
        return strength;
    }

    public void setStrength(Byte strength) {
        this.strength = strength;
    }

    public Byte getDexterity() {
        return dexterity;
    }

    public void setDexterity(Byte dexterity) {
        this.dexterity = dexterity;
    }

    public Byte getStamina() {
        return stamina;
    }

    public void setStamina(Byte stamina) {
        this.stamina = stamina;
    }

    public Byte getCharisma() {
        return charisma;
    }

    public void setCharisma(Byte charisma) {
        this.charisma = charisma;
    }

    public Byte getManipulation() {
        return manipulation;
    }

    public void setManipulation(Byte manipulation) {
        this.manipulation = manipulation;
    }

    public Byte getAppearence() {
        return appearence;
    }

    public void setAppearence(Byte appearence) {
        this.appearence = appearence;
    }

    public Byte getPerception() {
        return perception;
    }

    public void setPerception(Byte perception) {
        this.perception = perception;
    }

    public Byte getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Byte intelligence) {
        this.intelligence = intelligence;
    }

    public Byte getWits() {
        return wits;
    }

    public void setWits(Byte wits) {
        this.wits = wits;
    }
}
