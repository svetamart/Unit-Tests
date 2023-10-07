import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = ListGenerator.generateRandomList();
        List<Integer> list2 = ListGenerator.generateRandomList();

        ListComparer listComparer = new ListComparer(list1, list2);

        ListGenerator.printList(list1, 1);
        ListGenerator.printList(list2, 2);

        String result = listComparer.compareLists();
        System.out.println(result);
    }
}
