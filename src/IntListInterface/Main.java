package src.IntListInterface;
//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

public class Main {
    public static void main(String[] args) {

        IntArrayList l1=new IntArrayList();
        IntVector l2=new IntVector();

        for(int i=0;i<35;i++){
            l1.add(i+1);
            l2.add(i+2);
        }

        for(int i=0;i<l1.size;i++){
            System.out.println(l1.get(i));
            System.out.println(l2.get(i));
        }
    }
}
