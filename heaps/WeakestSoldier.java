import java.util.PriorityQueue;

public class WeakestSoldier {
    static class Row implements Comparable<Row>{
        int soldiers ;//soldier count 
        int idx ; //index of rows 

        public Row (int soldiers , int idx ){
            this.soldiers = soldiers ;
            this.idx = idx ;
        }

        @Override
        public int compareTo(Row r2){
            //when the soldier count is same 
            if(this.soldiers == r2.soldiers){
                return this.idx - r2.idx;// compare the index , the index with lowest value -> priority 
            }
            else {
                return this.soldiers - r2.soldiers; //otherwise compare the soldier count 
            }
        }
    }
    public static void main (String args []){
        int army [][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0},};
        int k = 2 ;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i = 0 ; i < army.length ; i++){
            int count = 0 ;
            for(int j = 0 ; j <army[0].length ; j++){ // iterates row from the matrix 
                count+= army [i][j] == 1 ? 1 : 0 ; //if element at i,j == 1 then add 1 to count else add 0 to count 
            }
            pq.add(new Row(count, i));
        }
        for(int i = 0 ; i < k ; i++){
            System.out.println ("R" + pq.remove().idx);
        }

        
    }
    
}
