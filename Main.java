public class Main {

    public static void main(String[] args) {

        MyQueue q = new MyQueue(5);

        for (int i = 0; i < q.getArr().length; i++) {
            q.enqueue((Integer) i); // * Eklenen elemanlar */
        }

        q.print();

        System.out.println("Cikarilan eleman " + q.dequeue());
        System.out.println("Cikarilan eleman " + q.dequeue());
        System.out.println("Cikarilan eleman " + q.dequeue());

        q.print();
        q.enqueue(1); // * Eklenen eleman */
        q.enqueue(2); // * Eklenen eleman */

        q.print();

        System.out.println("En bastaki eleman " + q.peek());
        System.out.println("Kuyruktaki eleman sayisi " + q.size());
        q.print();
        q.clear();
        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);

        q.print();

    }

}
