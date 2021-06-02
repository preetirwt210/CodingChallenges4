package academy.learnprogramming;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      /*  Theatre theatre= new Theatre("Olumpian", 8,12);
        //theatre.getSeats();
        if(theatre.reserveSeat("D12")){
            System.out.println("Please Pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }
//        if(theatre.reserveSeat("H11")){
//            System.out.println("Please Pay");
//        }else{
//            System.out.println("Sorry, seat is taken");
//        }

   /*     Properties p = System.getProperties();
        Set set = p.entrySet();

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }*/
        Main2 main= new Main2();
        main.command();
    }


}