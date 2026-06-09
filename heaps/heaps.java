import java.util.Comparator;
import java.util.PriorityQueue;

//Operations in heaps[add , remove , peek ]
public class heaps {
    static class Student implements Comparable<Student>{
        String name ;
        int rank ;
        public Student (String name , int rank){
            this.name = name ;
            this.rank = rank ;
        }
        @Override 
        public int compareTo (Student s2){
            return this.rank - s2.rank ; // by default ascending order 
        }
    }
    public static void main (String args []){
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder()); // descending order 
        pq.add(new Student ("A" , 4));
        pq.add(new Student ("B" , 5));
        pq.add(new Student ("C" , 6));

        while (!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }

    }
    
}
