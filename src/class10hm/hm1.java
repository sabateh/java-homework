package class10hm;

public class hm1 {
    /*
    Create a 2D array(shorter way) in which first array consists of 4 names and second array will contain grades.
   Then your program should print name of the students that has A and B grade.
     */
    public static void main(String[] args) {


    String [][] names={{"saba","saye","eli","goli"},
            {"A","B","C","D"}};
        for (int i = 0; i < names[0].length ; i++) {
            String name = names[0][i];
            String grade = names[1][i];
            if(grade.equals("A") || grade.equals("B")){
                System.out.print(name + " ");

        }
}}}
