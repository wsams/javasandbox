package com.wjsams.javasandbox.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayUtils {

    public static void main(String[] args) {
        List<String> marbles = new ArrayList<>();
        marbles.add("red");
        marbles.add("blue");
        marbles.add("yellow");
        List<List<String>> allSetsOfMarbles = ArrayUtils.getAllSubsets(marbles);
        for (List<String> setOfMarbles : allSetsOfMarbles) {
            System.out.println("setOfMarbles: " + setOfMarbles);
        }

        List<String> cats = new ArrayList<>();
        cats.add("siamese");
        cats.add("burmese");
        cats.add("bengal");
        cats.add("maine coon");
        cats.add("persian");
        List<List<String>> allSetsOfCats = ArrayUtils.getAllSubsets(cats);
        for (List<String> setOfCats : allSetsOfCats) {
            System.out.println("setOfCats: " + setOfCats);
        }

        List<String> audiences = new ArrayList<>();
        audiences.add("audience1");
        audiences.add("audience2");
        audiences.add("audience3");
        audiences.add("audience4");
        audiences.add("audience5");
        audiences.add("audience6");
        audiences.add("audience7");
        audiences.add("audience8");
        audiences.add("audience9");
        audiences.add("audience10");
        audiences.add("audience11");
        Collections.sort(audiences);
        List<List<String>> allSetsOfAudiences = ArrayUtils.getAllSubsets(audiences);
        for (List<String> setOfAudiences : allSetsOfAudiences) {
            System.out.println("setOfAudiences: " + setOfAudiences);
        }
        System.out.println("There were " + allSetsOfAudiences.size() + " subsets of " + audiences.size() + " audiences.");
    }

    private static List<List<String>> getAllSubsets(List<String> set) {
        List<List<String>> allSubsets = new ArrayList<>();

        if (set.isEmpty()) {
            allSubsets.add(new ArrayList<String>());
        } else {
            List<String> reducedSet = new ArrayList<>();

            reducedSet.addAll(set);

            String first = reducedSet.remove(0);
            List<List<String>> subsets = getAllSubsets(reducedSet);
            allSubsets.addAll(subsets);

            subsets = getAllSubsets(reducedSet);

            for (List<String> subset : subsets) {
                subset.add(0, first);
            }

            allSubsets.addAll(subsets);
        }

        return allSubsets;
    }

}
