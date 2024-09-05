import java.util.*;
class listimplement{
    private static final int initialcapacity=16;
    private int arr[];
    private int size;
    private int capacity;
   listimplement(){
        size=0;
        arr=new int[initialcapacity];
        capacity=initialcapacity;

    }
    public void add(int val){
        if(size==capacity)
            expandArray();
        arr[size++]= val;
            
    }
    private void expandArray(){
        capacity *=2;
        java.util.Arrays.copyOf(arr,capacity);
    }
    public void display(){
        System.out.print(" Elements in the list:  " );
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }
    public void insertposAt(int pos,int val){
        if(size==capacity)
           expandArray();
        for(int i=size-1;i>=pos;i--)
            arr[i+1]=arr[i];
        arr[pos]=val;
        size++;  

    }
    public void deleteposAt(int pos){
        for (int i=pos+1;i<size;i++)
           arr[i-1]=arr[i];
        size--;

        if(capacity> initialcapacity && capacity>*3)
            shrinkArray();
    }
    public void deleteEnd(){
          arr[size-1]=arr[size];
          size--;
    }
    public void deleteBegin(){
        for(int i=1;i<size;i++)
       arr[i-1]=arr[i];
       size--;
        
    }
    public void insertbegin(int val){
        for(int i=size-1;i>=0;i--)
          arr[i+1]=arr[i];
      arr[0]=val;
      size++;
    }
    public void getIndex(int val){
        for(int i=0;i<size-1;i++){
        if(arr[i]==val)
            System.out.println(i); 
        }
    }
    public void updateVal(int pos, int val){
        arr[pos]=val;
    }
    public void valSearch(int val){
        for(int i=0;i<size-1;i++){
            if(arr[i]==val)
            System.out.println(i);
        }
    }
    public void cleararr(){
        size=0;
    }
    private void shrinkArray(){
        capacity/=2;
        arr=java.util.Arrays.copyOf(arr, capacity);
    }
    public int length(){
        return size;
    }
    

}
public class listImplementation {
    public static void main(String[] args){
        int val,pos;
        listimplement list=new listimplement();
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("\n --------------List Menu--------------------\n");
        System.out.println("1. Insert at End \n");
        System.out.println("2. Display the list \n");
        System.out.println("3. Insert at specified position \n");
        System.out.println("4. Delete from Specified position\n");
        System.out.println("5. Exit\n");
        System.out.println("6. Delete an end\n");
        System.out.println("7. Delete from beginning\n");
        System.out.println("8. Insert at beginning\n");
        System.out.println("9. get(index)\n");
        System.out.println("10. update(index)\n");
        System.out.println("11. Search(val) -> return index \n");
        System.out.println("12. clear\n");
        System.out.println("---------------------------------------------\n");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1: System.out.print("Enter the data: ");
            val=sc.nextInt();
            list.add(val);
            break;
            case 2: list.display();
            break;
            case 3:
            System.out.print("Enter the pos(pos starts from 0): ");
            pos = sc.nextInt();
            if(pos<0){
                System.out.println("Invalid position");
                break;
            }
            System.out.print("Enter the val:");
              val=sc.nextInt();
            list.insertposAt(pos,val);
            break;
            case 4:
            System.out.print("Enter the pos(pos starts from 0):");
            pos = sc.nextInt();
            if(pos<0){
                System.out.println("Invalid position");
                break;
            }
            list.deleteposAt(pos);
            break;
            case 5:
            System.exit(0);
            case 6:
            list.deleteEnd();
            break;
            case 7:
            list.deleteBegin();
            break;
            case 8:
            System.out.println("Enter the val: ");
            val = sc.nextInt();
            list.insertbegin(val);
            break;
            case 9:
            System.out.println("Enter the value: ");
            val = sc.nextInt();
            list.getIndex(val);
            break;
            case 10:
            System.out.println("Enter the pos (pos starts from 0): ");
            pos = sc.nextInt();
            System.out.println("Enter the val: ");
            val = sc.nextInt();
            list.updateVal(pos,val);
            break;
            case 11:
            System.out.println("Enter a val: ");
            val = sc.nextInt();
            list.valSearch(val);
            break;
            case 12:
            list.cleararr();
            break;


            default:
            System.out.println("Enter a valid choice");
        }
        }

    }
    
}
   
