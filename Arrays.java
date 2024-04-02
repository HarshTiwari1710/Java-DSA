public class Arrays{
    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 23;
        marks[1] = 12;
        marks[2] = 45;
        marks[3] = 34;
        marks[4] = 56;
        // for (int i = 0; i < marks.length; i++) {
        //     System.err.println(marks[i]);  
        // }
        try {
            System.out.println(marks[5]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error aaya tha");
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println('A');

    }
}