package Module02.module02.Lesson14;

public class Main {
    public static void main(String[] args) {
        LinkedArrayList<Integer> list = new LinkedArrayList<>();

        list.addHead(2);
        list.addHead(6);
        list.addHead(8);

        System.out.println("Listin olcusu " + list.getSize()); //  2
        System.out.println("1 ci elementin indexi" + list.getIndex(1)); // 5

        list.deleteIndex(1);
        System.out.println("1 ci element silindikden sonraki olcu " + list.getSize()); //  1

        list.updateIndex(0, 9);
        System.out.println("updateden sonra 0 ci element " + list.getIndex(0)); //10

        list.deleteObjects(9);
        System.out.println("Melumat olan obyektleri sildikden sonra olcu 9: " + list.getSize()); // 1
    }
}

