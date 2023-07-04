////find min. reorder of the routes to reach zero...
//
//public class min_reorder {
//    public static int reorder(int [][]arr){
//        int count=0;
//        for (int i=0;i< arr.length;i++){
//            for (int j=0;j<arr[0].length;j++){
//                if (arr[i][0]<arr[0][j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        int [][]arr={{0,1},{1,3},{2,3},{4,0},{4,5}};
//
//        System.out.println(reorder(arr));
//    }
//}

import java.util.ArrayList;
import java.util.List;

//-----------------------------------------------------------------//
public class min_reorder {
     int minreorder(int n,int [][]connections){
        List<List<Edge>>graph=new ArrayList<>();
        for (int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for (int i=0;i< connections.length;i++){
            //1 denotes original edge
            graph.get(connections[i][0]).add(new Edge(connections[i][1],1));

            //0 denotes reversed edge
            graph.get(connections[i][1]).add(new Edge(connections[i][0],0));
        }
        return dfs(graph,0,new boolean[n]);
    }
    //dfs
    private int dfs(List<List<Edge>>graph,int source,boolean[] isvisited){
        int cost=0;
        isvisited[source]=true;

        for (Edge neighbour:graph.get(source)){
            if (!isvisited[neighbour.vertex]){
                cost+=neighbour.count+dfs(graph,neighbour.vertex,isvisited);
            }
        }
        return cost;
    }

    private class Edge{
        int vertex,count;
        public Edge(int vertex,int count){
            this.vertex=vertex;
            this.count=count;
        }
    }
    public static void main(String[] args) {

    }
}