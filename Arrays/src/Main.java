public class Main {
    public static void main(String[] args){
        int maxN = 100;
        MyArray myArray = new MyArray(maxN);

        myArray.insert(3);
        myArray.insert(8);
        myArray.insert(4);
        myArray.insert(-4);
        myArray.insert(8);
        myArray.insert(7);
        myArray.insert(6);
        myArray.insert(5);
        myArray.insert(2);
        myArray.insert(2);
        myArray.insert(9);

        myArray.display();

        System.out.println(myArray.find(2));

        myArray.mergeSort(0, myArray.size() - 1);

        myArray.display();

    }
}