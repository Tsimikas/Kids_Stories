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
        storyList.add(new Story("Le Roman de Renart", " Un Renart et ses aventures à travers la campagne française", R.drawable.renard_romain, new Scene[]
                {
                        new Scene("Scene 1", "description1", R.drawable.renard_romain),
                        new Scene("Scene 2", "description2", R.drawable.renard_romain),
                        new Scene("Scene 3", "description3", R.drawable.renard_romain),
                }));


        storyList.add(new Story("April Fool", "1 april", R.drawable.firstavril_image, new Scene[]
                {
                        new Scene("First Scene"," Today is April 1st! I prepared lots of paper fish to stick behind the backs of my family and friends.", R.drawable.firstavril_image),
                        new Scene("Seconde Scene","  I find Mom and Dad at breakfast, giving them a big kiss, I discreetly stick a fish each on their back." ,R.drawable.firstapril_2scene),
                        new Scene("Third Scene","I arrive at school and I decide to stick fish behind my classmates backs. Everyone laughs but wonders who the big prankster is!" ,R.drawable.firstapril_scene3),
                        new Scene("Fourth Scene","In the playground all the students have fish on their backs, its so funny! But I feel a lot of them laughing looking at me. They must have understood that it was me?",R.drawable.firstapril_scene4),
                       new Scene("The Last Scene","  The day ends, I go home, I find Papa and Mama who explode with laughter! I turn around and see in the ice in the entrance, that my back is covered with fish. Olalalala! Its the watered sprinkler!" ,R.drawable.img),



              }));

    }
}

