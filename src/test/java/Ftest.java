import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Ftest {                                                 //
    @Test
    void test1() {
        int floors = 3;
        List<String> tower = buildShape( floors);

        for (String s : tower) {
            System.out.println(s);
        }

    }

    private List<String> buildShape(int floors) {
        List<String> tower = new ArrayList<>();
tower.add("*");
tower.add("**");

        return tower;
    }

    @Test
    void test2() {
        List<String> tower = new ArrayList<>();

        int number = 6;
        for (int i=0; i<number; i++){
            StringBuilder sb = new StringBuilder();
            int space = number-i-1;
            int star = 2*i+1;
            for (int s = 0; s<space; s++){
                sb.append(" ");
            }
            for (int s = 0; s<star; s++){
                sb.append("*");
            }
            for (int s = 0; s<space; s++){
                sb.append(" ");
            }
            tower.add(sb.toString());
            }

        }

    }

