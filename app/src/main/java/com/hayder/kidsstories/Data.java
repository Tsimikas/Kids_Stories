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
        storyList.add(new Story("Blanch Neige", "A story about a princess of great beauty", R.drawable.blancheneige, new Scene[]
                {
                        new Scene("Scene 1", "Once upon a time there was an evil queen who questioned her magic mirror every day:\n" +
                                "“Mirror, who is the most beautiful in my kingdom? »\n" +
                                "  One day, the mirror answers him:\n" +
                                "\"Snow White is the prettiest.\"", R.drawable.bn1),
                        new Scene("Scene 2", "The queen flew into a violent rage. She orders her gamekeeper to kill Snow White. At the last moment, he doesn't have the courage and lets Snow White run away. Terrified, the\n" +
                                "young girl is taken in by forest animals. They lead her to the house of the seven\n" +
                                "dwarfs. These work in a diamond mine. Snow White settles in and puts\n" +
                                "order in the house.", R.drawable.bn2),
                        new Scene("Scene 3", "The queen learns from her mirror that Snow White is still alive. She uses\n" +
                                "spells to change into an old woman. One day she brings him an apple\n" +
                                "poisonous which plunges Snow White into a deep sleep.\n" +
                                "  The dwarves arrive too late. They pursue the witch who falls over a precipice. Then\n" +
                                "they lock up Snow White in a glass coffin.", R.drawable.bn3),
                        new Scene("Scene 4", "Mais lorsque le prince charmant embrasse Blanche-Neige, elle se réveille.", R.drawable.bn4),
                }));
        storyList.add(new Story("Red Riding Hood", "A young girl who meets a wolf on the way", R.drawable.chaperonrouje, new Scene[]
                {new Scene("Scene 1", "The prettiest little girl in the village, Little Red Riding Hood,\n" +
                        "leaves to visit her sick grandmother at her mother's request.\n" +
                        "Her mission is to bring him a pancake and a small pot of butter and to do this,\n" +
                        "she must cross the village through the forest.", R.drawable.cr1),
                        new Scene("Scene 2", "Little Red Riding Hood will cross paths with the Wolf and will not be suspicious.\n" +
                                "She gives him directions on his destination and accepts the Wolf's proposal, which is akin to a game.", R.drawable.cr2),
                        new Scene("Scene 3", "When she arrives at her destination, the Wolf has already devoured the grandmother and taken her place in her bed.\n" +
                                "When the little girl finally arrives, she falls into the trap and is devoured in turn.", R.drawable.cr3),
                }));
        storyList.add(new Story("Leon is not well", "The story of Leon.", R.drawable.leon6, new Scene[]
                {
                        new Scene("Scene 1","Léon is my best friend, he is in the same class as me. We laugh all the time, we play and sometimes we even go home together after school because we live next door. We've known each other since we were little, even if we're not very big.", R.drawable.leon1),
                        new Scene("Scene 2","For the past few weeks, Léon has been a little weird.." , R.drawable.leon2),
                        new Scene("Scene 3","He doesn't laugh with me anymore. He looks so sad and when I talk to him, he refuses to answer..." , R.drawable.leon3),
                        new Scene("Scene 4", "I know playing ball is his favorite game. So I had to propose to her! Yet he remains alone at recess and no longer wants to play with me.", R.drawable.leon4),
                        new Scene("Scene 5","In the canteen, Léon doesn't eat much anymore. I give him my dessert thinking that it would make him happy to have a second chocolate cookie. I know he loves them, but he doesn't want them." , R.drawable.leon5),
                        new Scene("Scene 6","As we were coming home from recess, I went to the toilet and it was very, very rushed! I find myself face to face with Leon, who comes out of the toilet with wet eyes. I decide to talk to the teacher about it." , R.drawable.leon6),
                        new Scene("Scene 7","If you see that one of your friends no longer wants to play, loses their appetite or cries often. Tell an adult, your mistress, one of your parents or 119 (National Telephone Reception Service for Children in Danger) because they can help." , R.drawable.leon7),
                }));

        storyList.add(new Story("The Wolf and the Lamb", ".", R.drawable.louplogo, new Scene[]
                {
                        new Scene("Scene 1", "The reason of the strongest is always the best :\n" +
                                "We will show it presently.", R.drawable.loup1),
                        new Scene("Scene 2", "A Lamb quenched his thirst in the current of a pure wave. A wolf comes fasting looking for adventure.", R.drawable.loup2),
                        new Scene("Scene 3", "And that hunger in these places attracted.\n" +
                                "Who makes you so bold to disturb my drink?\n" +
                                "Says this animal full of rage:\n" +
                                "You will be punished for your temerity.", R.drawable.loup3),
                        new Scene("Scene 4", "— Sire, replies the Lamb, may your Majesty\n" +
                                "Don't get angry;\n" +
                                "But rather that she considers that I am quenching my thirst in the current, More than twenty paces below Her, And that consequently, in no way, I cannot disturb her drink.", R.drawable.loup4),
                        new Scene("Scene 5", "\"You disturb her,\" resumed this cruel beast, \"And I know that you slander me last year.\"\n" +
                                "\"How would I have done it if I hadn't been born?\" Said the Lamb, I'm still suckling my mother.\n" +
                                "\"If it's not you, then it's your brother.\"\n" +
                                "— I have none.\n" +
                                "\"So it's one of yours:", R.drawable.loup5),
                        new Scene("Scene 6", "For you hardly spare me, You, your shepherds, and your dogs. I have been told: I must take my revenge.\n" +
                                "Thereupon, in the depths of the forest The Wolf takes it away, and then eats it, Without any other form of trial.", R.drawable.loup6),

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

