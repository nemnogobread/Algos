public class Main {
    public static void main(String[] args){
        int maxN = 100;
        MyOrderedArray myArray = new MyOrderedArray(maxN);

        myArray.insert(2);
        myArray.insert(5);

        myArray.display();

        System.out.println(myArray.find(2));
    }
}