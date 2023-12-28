package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Game {
    public static ArrayList <Toy> toys = new ArrayList<>();

    public static ArrayList<Toy> put(int howMany){
        for (int i = 0; i < howMany; i++) {
            toys.add(new Toy());
        }
        return toys;

    }

    public static void queue (ArrayList <Toy> toys) {
        toys.sort(new Comparator<Toy>() {
            @Override
            public int compare(Toy o1, Toy o2) {
                return o2.quantity - o1.quantity;
            }
        });
    }
    
    public static void printList (ArrayList <Toy> toys) {
        toys.forEach((n) -> System.out.println(n.toString()));
    }

    public static void getToy (ArrayList <Toy> toys) {
        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter("Game result", true));
            writer.write(toys.get(0).toString());
            writer.write("\n");
            toys.remove(0);
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
