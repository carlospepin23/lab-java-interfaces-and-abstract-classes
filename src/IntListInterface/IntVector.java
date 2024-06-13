package src.IntListInterface;
//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

public class IntVector implements IntList{
    private int[] arr;
    private int size;

    public IntVector() {
        arr=new int[20];
        this.size=0;
    }

    @Override
    public void add(int number) {
        reallocate();
        this.arr[this.size]=number;
        size++;
    }

    private void reallocate(){
        if(this.size==arr.length){
            int[] modArr=new int[arr.length*2];
            for(int i=0;i< arr.length;i++){
                modArr[i]=arr[i];

            }
            arr=modArr;

        }
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + size);
        }
        return arr[id];
    }
}