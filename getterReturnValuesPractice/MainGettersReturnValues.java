import javax.swing.plaf.synth.SynthOptionPaneUI;

class Personss {
    int age;
    String name;

    void speak(){
        System.out.println("Hello my name is " +name);
    }

//  Created a 'return' method
    int yearsLeftTilRetirement() {
        int yearsLeft = 65 - age;
//        System.out.println(yearsLeft);

        return yearsLeft;
    }
}

public class MainGettersReturnValues {
    public static void main(String[] args) {
        Personss personOne = new Personss();
        personOne.name = "Link";
        personOne.age = 27;
        personOne.speak();

        int calcYearsLeft = personOne.yearsLeftTilRetirement();
        System.out.println("Years left until retire: " +calcYearsLeft);
    }
}

//TODO:
// > create a "person" class
//   >> set age and name then call from 'manin'
// > create within "person" an int return method of calculated years until retirement == 65years
//   >> call it from 'main'