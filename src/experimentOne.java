public class experimentOne {
    static void primitiveArray(int[] arr){
        for (int i: arr){
            System.out.print(i + " ");
        }
    }

    static void objectArray(Object[] arr){
        for (Object i: arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args){
        System.out.println("Tanay " + 1955991593);
        int[] intArray = {1, 2, 3, 4, 5};
        Object[] objectArray = {"a", "b", "c", "d", "e"};

        primitiveArray(intArray);
        System.out.println();
        objectArray(objectArray);
        System.out.println();
    }
}
