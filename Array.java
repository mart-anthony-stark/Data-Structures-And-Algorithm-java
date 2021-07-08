import java.util.*;
public class Array{
  private int arr[];
  private int count;

  Array(int length){
    this.arr = new int[length];
  }

  void insert(int item){
    if(arr.length == count){
      int[] newItems = new int[count*2];

      for(int i=0; i < count; i++)
        newItems[i] = arr[i];

      arr = newItems;
    }

    arr[count++] = item;
  }

  void removeAt(int index){
    if(index < 0 || index >= count){
      throw new IllegalArgumentException();
    }

    for(int i=index; i < count-1; i++){
      arr[i] = arr[i+1];
    }
    count--;
  }

  int indexOf(int item){
    for(int i=0; i<count; i++){
      if(arr[i] == item)
        return i;
    }
    return -1;
  }

  void print(){
    System.out.println(Arrays.toString(this.arr));
  }
}
// kl;j: