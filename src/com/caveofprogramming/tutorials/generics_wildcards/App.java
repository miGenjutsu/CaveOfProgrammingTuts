package src.com.caveofprogramming.tutorials.generics_wildcards;

import java.util.ArrayList;

class Machine {

    public String toString() {
        return "I'am a machine";
    }
}

class Camera extends Machine {
    public String toString() {
        return "I'am a camera";
    }
}

public class App {
    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Machine> machines = new ArrayList<Machine>();

        machines.add(new Machine());
        machines.add(new Machine());
//        list.add("one");
//        list.add("two");
//
//        showList(list);

        showList(machines);

        ArrayList<Machine> cameras = new ArrayList<Machine>();

        cameras.add(new Camera());
        cameras.add(new Camera());

        showList(cameras);

    }

    public static void showList(ArrayList<Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
        }
    }

//    public static void  showList(ArrayList<String> list) {
//        for (String value : list) {
//            System.out.println(value);
//        }
//    }
}
