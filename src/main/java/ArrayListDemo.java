import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> listDemo = new ArrayList<>();

            listDemo.add(100);
            listDemo.add(200);
            listDemo.add(300);
            listDemo.add(400);
            listDemo.add(500);
            listDemo.add(600);
            listDemo.add(700);
            listDemo.add(800);
            listDemo.add(900);
            listDemo.add(1000);
            listDemo.add(2000);

            enhancedLoop(listDemo);
            for (int i : listDemo) {
                System.out.println(i);
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
    public static void enhancedLoop(ArrayList<Integer> listArray) {
        for (int i : listArray) {
            System.out.println("The number at index " + i + " is " + listArray.get(i));
        }
    }

}

