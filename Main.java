//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertFirst(10);
        list.display();
        System.out.println();
        list.insertEnd(5);
        list.display();
        System.out.println();
        list.insertLast(9);
        //issues

//        10 -> 9 -> 6 -> 7 -> 3 -> end
//        10 -> 9 -> 6 -> 7 -> 3 -> 5 -> end
//        10 -> 9 -> 6 -> 7 -> 3 -> 9 -> end
        //solved using updating tail in both function last and end;
//        10 -> 9 -> 6 -> 7 -> 3 -> end
//        10 -> 9 -> 6 -> 7 -> 3 -> 5 -> end
//        10 -> 9 -> 6 -> 7 -> 3 -> 5 -> 9 -> end
        list.display();
        System.out.println();
        list.insertAtK(2,2);
        list.display();
        System.out.println();
        list.insertRec(88,2);
        list.display();

    }
}