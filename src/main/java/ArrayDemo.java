public class ArrayDemo {

    public static void main(String[] args) {

        //declaring an array
        int [] array1 ;
        array1 = new int [10];
try {
    array1[0] = 100;
    array1[1] = 200;
    array1[2] = 300;
    array1[3] = 400;
    array1[4] = 500;
    array1[5] = 600;
    array1[6] = 700;
    array1[7] = 800;
    array1[8] = 900;
    array1[9] = 1000;
    //array1[10] = 1100;

    for (int i = 0; i < array1.length; i++) {
        System.out.println("The number at index " + i + " is: " + array1[i]);
    }


}
catch(IndexOutOfBoundsException e){
    System.out.println("Index out of bounds");
}
catch(Exception ee){
    System.out.println("Exception occured");
}

    }
}
