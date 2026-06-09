

import java.util.PriorityQueue;

//NEARBY CARS OR NEARBY HOTELS PROBLEM [FIND THE NEAREST K POINTS]
public class Knearest {
    //the point class here represents the car 
    static class Point implements Comparable<Point>{
        int x ; // x coordinate 
        int y; // y coordinate 
        int distSq ; //distance square from origin 
        int idx ; //car number or the index C0 , C1..

        public Point( int x , int y , int distSq , int idx){
            this.x = x ;
            this.y = y ;
            this.distSq = distSq;
            this.idx = idx ;
            
        }
        //define the ordering for the priority queue
        @Override
        public int compareTo(Point p2){
             return this.distSq - p2.distSq ; //smaller distance first -> priority
        }
    }
    public static void main (String args []){
        int pts [][] = {{3,3} , {5,-1} ,{-2,4}};
        int k = 2 ; //number of nearby cars to find 

        //insert all cars into a priority queue 
        PriorityQueue <Point> pq = new PriorityQueue<>();
        for(int i = 0 ; i < pts.length ; i ++){
            int x = pts[i][0];
            int y = pts[i][1];
            int distSq = (x*x) + (y*y);
            //insert into heap 
            pq.add(new Point(x, y, distSq, i));
        }
        System.out.println("k nearest cars : ");
            for(int i = 0 ; i <k ; i++){
                System.out.println("C" + pq.remove().idx); //removes the nearest element or the first element from the queue 
            }
    }
    
}
