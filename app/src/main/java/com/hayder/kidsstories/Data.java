package com.hayder.kidsstories;

import java.util.ArrayList;
import java.util.List;

import Model.Scene;
import Model.Story;

public class Data {
    public static List<Story> storyList = new ArrayList<Story>();
    public static List<Story> FavList = new ArrayList<Story>();

    static {
        storyList.add(new Story("Blanch Neige","Une histoire sur une princesse dune très grande beauté", R.drawable.blancheneige,new Scene[]
                {
                    new Scene("Scene 1","description1",R.drawable.blancheneige),
                        new Scene("Scene 2","description2",R.drawable.blancheneige),
                        new Scene("Scene 3","description3",R.drawable.blancheneige),
                }));
        storyList.add(new Story("Chaperon Rouge","Une jeune fille qui rencontre un loup en chemin",R.drawable.chaperonrouje,new Scene[]
                { new Scene("Scene 1","description1",R.drawable.chaperonrouje),
                        new Scene("Scene 2","description2",R.drawable.chaperonrouje),
                        new Scene("Scene 3","description3",R.drawable.chaperonrouje),
                }));
        storyList.add(new Story("Le Chat Botté","Un chat astucieux qui aide son maître à devenir riche",R.drawable.chat, new Scene[]
                {
                        new Scene("Scene 1","description1",R.drawable.chat),
                        new Scene("Scene 2","description2",R.drawable.chat),
                        new Scene("Scene 3","description3",R.drawable.chat),
                }));
        storyList.add(new Story("Le Vilain Petit Canard","Canard qui se sent différent des autres canards",R.drawable.petit_canard, new Scene[]
                {
                        new Scene("Scene 1","description1",R.drawable.petit_canard),
                        new Scene("Scene 2","description2",R.drawable.petit_canard),
                        new Scene("Scene 3","description3",R.drawable.petit_canard),
                }));
        storyList.add(new Story("La Belle et la Bête","Histoire d'amour entre une femme et une bete",R.drawable.belle_bete,new Scene[]
                {
                        new Scene("Scene 1","description1",R.drawable.belle_bete),
                        new Scene("Scene 2","description2",R.drawable.belle_bete),
                        new Scene("Scene 3","description3",R.drawable.belle_bete),

                }));
        storyList.add(new Story("Le Roman de Renart"," Un Renart et ses aventures à travers la campagne française",R.drawable.renard_romain,new Scene[]
                {
                        new Scene("Scene 1","description1",R.drawable.renard_romain),
                        new Scene("Scene 2","description2",R.drawable.renard_romain),
                        new Scene("Scene 3","description3",R.drawable.renard_romain),
                }));
    }
}
