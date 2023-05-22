package com.hayder.kidsstories;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import Model.Scene;
import Model.Story;

public class Data {
    public static List<Story> storyList = new ArrayList<Story>();
    public static List<Story> FavList = new ArrayList<Story>();

  public static Context context;

    public static void setContext(Context context) {
        Data.context = context;
    }

    static {
        storyList.add(new Story("Blanch Neige", "Une histoire sur une princesse dune très grande beauté", R.drawable.blancheneige, new Scene[]
                {
                        new Scene("Scene 1", "Rachid is the handsome guy i've ever met", R.drawable.blancheneige),
                        new Scene("Scene 2", "description2", R.drawable.blancheneige),
                        new Scene("Scene 3", "description3", R.drawable.blancheneige),
                }));
        storyList.add(new Story("Chaperon Rouge", "Une jeune fille qui rencontre un loup en chemin", R.drawable.chaperonrouje, new Scene[]
                {new Scene("Scene 1", "description1", R.drawable.chaperonrouje),
                        new Scene("Scene 2", "description2", R.drawable.chaperonrouje),
                        new Scene("Scene 3", "description3", R.drawable.chaperonrouje),
                }));
        storyList.add(new Story("Le Chat Botté", "Un chat astucieux qui aide son maître à devenir riche", R.drawable.chat, new Scene[]
                {
                        new Scene("Scene 1", "description1", R.drawable.chat),
                        new Scene("Scene 2", "description2", R.drawable.chat),
                        new Scene("Scene 3", "description3", R.drawable.chat),
                }));
        storyList.add(new Story("Le Vilain Petit Canard", "Canard qui se sent différent des autres canards", R.drawable.petit_canard, new Scene[]
                {
                        new Scene("Scene 1", "description1", R.drawable.petit_canard),
                        new Scene("Scene 2", "description2", R.drawable.petit_canard),
                        new Scene("Scene 3", "description3", R.drawable.petit_canard),
                }));
        storyList.add(new Story("La Belle et la Bête", "Histoire d'amour entre une femme et une bete", R.drawable.belle_bete, new Scene[]
                {
                        new Scene("Scene 1", "description1", R.drawable.belle_bete),
                        new Scene("Scene 2", "description2", R.drawable.belle_bete),
                        new Scene("Scene 3", "description3", R.drawable.belle_bete),

                }));

        storyList.add(new Story("Don't jump on the bed", "Margot story with jumping on the bed.", R.drawable.bed3, new Scene[]
                {
                        new Scene("First Scene","It's bedtime, but Margot still wants to play.", R.drawable.bed1),
                        new Scene("Seconde Scene","In her bed with small bars, she gets up and does not want to sleep.",R.drawable.bed2),
                        new Scene("Third Scene","She plays with her dolls, then decides to jump on her bed.",R.drawable.bed3),
                        new Scene("Fourth Scene","She gets up and plays trampoline.",R.drawable.bed4),
                        new Scene("Fifth Scene","Mom enters the room at this time.",R.drawable.bed5),
                        new Scene("Sixth Scene","You must not jump standing on your bed, it's dangerous!",R.drawable.bed6),
                        new Scene( "Seven Scene","You could tip over, fall on your head, hurt yourself badly.",R.drawable.bed7),
                        new Scene("Last Scene","Come, I'll read you a story.",R.drawable.bed8),

                }));









        storyList.add(new Story("April Fool", "Today is the first of april , lets get people fooled! ", R.drawable.firstavril_image, new Scene[]
                {
                        new Scene("First Scene"," Today is April 1st! I prepared lots of paper fish to stick behind the backs of my family and friends.", R.drawable.firstavril_image),
                        new Scene("Seconde Scene","  I find Mom and Dad at breakfast, giving them a big kiss, I discreetly stick a fish each on their back." ,R.drawable.firstapril_2scene),
                        new Scene("Third Scene","I arrive at school and I decide to stick fish behind my classmates backs. Everyone laughs but wonders who the big prankster is!" ,R.drawable.firstapril_scene3),
                        new Scene("Fourth Scene","In the playground all the students have fish on their backs, its so funny! But I feel a lot of them laughing looking at me. They must have understood that it was me?",R.drawable.firstapril_scene4),
                       new Scene("The Last Scene","  The day ends, I go home, I find Papa and Mama who explode with laughter! I turn around and see in the ice in the entrance, that my back is covered with fish. Olalalala! Its the watered sprinkler!" ,R.drawable.april1_lastscene),



              }));


        storyList.add(new Story("Birthday of Nala", "Today is Nala Birthday . So should we suprise her ? Read the story to know everything", R.drawable.anniversaire_image, new Scene[]
                {
                        new Scene("First Scene","Today is the birthday of Nala, a great friend of Ron-Ron! And Ron-ron wants to surprise the goat.", R.drawable.anniversaire_image),
                        new Scene("Seconde Scene","He gathers all the animals to organize a party.",R.drawable.anniversaire2),
                        new Scene("Third Scene","“If I have brought you together, it is to organize a surprise for our friend Nala. And I would like you to help me.” explains Ron-ron.",R.drawable.anniversaire3),
                        new Scene("Fourth Scene","“You fish and frogs are going to invent a nice song for our friend Nala. “Pascal “the horse” and Pati “the cow” will pick flowers and fresh grass while I take Nala for a walk to get her away from the farm”.",R.drawable.anniversaire4),
                        new Scene("Fifth Scene","Everyone is happy to participate." ,R.drawable.annivairsaire5),
                        new Scene("Sixth Scene","While Ron-ron walks with Nala, all the animals get to work.",R.drawable.anniversaire6),
                        new Scene( "Seven Scene","When the two friends return, everything is ready for the surprise.",R.drawable.anniversaire7),
                        new Scene("Eight Scene","Frogs and fish sing in chorus “Happy birthday Nala!”. And the friends gather to taste together the clod of grass and flowers offered to the little goat.",R.drawable.anniversaire8),
                        new Scene("Last Scene","Nala is over the moon, and Ron-ron is very proud of his surprise." ,R.drawable.anniversaire9),
                }));



    }
}

