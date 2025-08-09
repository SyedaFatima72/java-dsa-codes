package Graph;

import java.util.ArrayList;

public class graph {

    public static class edge {
        int src;
        int dest;

        int weight;
        edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight=weight;
        }
    }
        static void createGraph(ArrayList<edge>[] graph){
        for (int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
            graph[0].add(new edge(0,1,2));

            graph[1].add(new edge(1,2,10));
            graph[1].add(new edge(1,3,0));

            graph[2].add(new edge(2,0,2));
            graph[2].add(new edge(2,1,10));
            graph[2].add(new edge(2,3,-1));

            graph[3].add(new edge(3,1,0));
            graph[3].add(new edge(3,2,-1));


      }



    public static void main(String[] args) {
        int v=4;

        ArrayList<edge>[] graph=new ArrayList[v];
        createGraph(graph);
        for (int i=0;i<graph[1].size();i++){
            edge e=graph[1].get(i);
            System.out.println(e.src+" this to this "+e.dest+" with weight "+ e.weight);
        }

    }

}
