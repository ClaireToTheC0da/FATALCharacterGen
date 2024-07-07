package Chapters;
import Base.DiceRoll;

public class Chap1Race {

    public DiceRoll roll = null;
    public String race;

    public void rollRace(){
        double raceNum = roll.rollD100();

        if(raceNum == 1){
            race = "Anakim";
        } else if (raceNum >= 2 && raceNum <= 16){
            race = "Bugbear";
        } else if (raceNum >= 17 && raceNum <= 19){
            race = "Black Dwarf";
        } else if (raceNum == 20){
            race = "Brown Dwarf";
        } else if (raceNum == 21){
            race = "White Dwarf";
        } else if (raceNum == 22){
            race = "Dark Elf";
        } else if (raceNum == 23){
            race = "Light Elf";
        } else if (raceNum >= 24 && raceNum <= 53){
            race = "Human";
        } else if (raceNum >= 54 && raceNum <= 73){
            race = "Kobold";
        } else if (raceNum >= 74 && raceNum <= 79){
            race = "Ogre";
        } else if (raceNum >= 80 && raceNum <= 81){
            race = "Cliff Ogre";
        } else if (raceNum >= 82 && raceNum <= 84){
            race = "Gruagach Ogre";
        } else if (raceNum == 85){
            race = "Kinder-fresser";
        } else if (raceNum >= 86 && raceNum <= 87){
            race = "Borbytingama";
        } else if (raceNum >= 88 && raceNum <= 90){
            race = "Hill Troll";
        } else if (raceNum >= 91 && raceNum <= 100){
            race = "Subterranean Troll";
        }

    }

    public void rollRacialHatred(){
        double index = roll.rollD10() + roll.rollD10() + roll.rollD10();

    }


    /*********************************************
     * STATIC VARIABLES AND FUN SHIT
     *********************************************/

    int[] AnakimHate = {1,5,5,5,5,5,5,4,5,4,4,4,4,5,5,5};
    int[] BugbearHate = {5,1,5,5,5,5,5,5,4,5,5,5,5,5,5,5};
    int[] BlackDwarfHate = {5,5,1,5,5,5,5,5,5,5,4,5,5,5,5,5};
    int[] BrownDwarfHate = {5,5,5,1,3,5,3,2,5,5,5,5,5,5,5,5};
    int[] WhiteDwarfHate = {5,5,5,3,1,5,4,3,5,5,5,5,5,5,5,5};
    int[] DarkElfHate = {5,5,5,5,5,1,5,5,5,5,5,5,5,5,5,5};
    int[] LightElfHate = {5,5,5,3,4,5,1,2,5,5,5,5,5,5,5,5};
    int[] HumanHate = {4,5,5,2,3,5,2,1,5,5,5,5,5,5,5,5};
    int[] KoboldHate = {5,4,5,5,5,5,5,5,1,4,5,4,5,5,5,5};
    int[] OgreHate = {4,5,5,5,5,5,5,5,4,1,4,4,4,5,5,5};
    int[] CliffOgreHate = {4,5,4,5,5,5,5,5,5,4,1,4,4,5,5,5};
    int[] GruOgreHate = {4,5,5,5,5,5,5,5,4,4,4,1,4,5,5,5};
    int[] KinFressHate = {4,5,5,5,5,5,5,5,5,4,4,4,1,5,5,5};
    int[] BorbHate = {5,5,5,5,5,5,5,5,5,5,5,5,5,4,5,5};
    int[] HillTrollHate = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,4,5};
    int[] SubTrollHate = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,1};

}