package _19_Heap;
import java.util.PriorityQueue;

public class pqobject {
    static class Student implements Comparable<Student> {
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;  // smaller rank -> higher priority
        }
    }

    public static void main(String[] args) {
        // PriorityQueue for Student objects
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A",4));
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));

        while(!pq.isEmpty()){
            Student s = pq.poll(); // poll() returns and removes element
            System.out.println(s.name+" -> "+s.rank);
        }
    }
}

// package _19_Heap;
// import java.util.PriorityQueue;

// public class pqobject {
//     static class Student implements Comparable<Student>{
//         String name;
//         int rank;
//         public Student(String name,int rank){
//             this.name=name;
//             this.rank=rank;
//         }
//         @Override
//         public int compareTo(Student s2) {
//             // TODO Auto-generated method stub
//             return this.rank-s2.rank;
//         }
        
            
//     }
//     public static void main(String[] args) {
//         PriorityQueue<Integer>pq=new PriorityQueue<>();

//         pq.add(new Student("A",4));
//         pq.add(new Student("B",5));
//         pq.add(new Student("C",2));
//         pq.add(new Student("D",12));

//         while(!pq.isEmpty()){
//             System.out.println(pq.peek().name+"->"+pq.peek().rank);
//             pq.remove();
//         }
//     }
   
//  }
