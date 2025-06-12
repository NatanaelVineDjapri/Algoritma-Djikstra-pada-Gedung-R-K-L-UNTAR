package com.datastruct;

import java.util.*;

public class Graph {
    int V;
    List<List<Node>> adj; 

    class Node implements Comparable<Node> {
        int id;             
        double weight;     

        Node(int id, double weight) {
            this.id = id;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node other) {
            return Double.compare(this.weight, other.weight);
        }
    }

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());  
        }
    }

    public void addEdge(int from, int to, double weight) {
        adj.get(from).add(new Node(to, weight));
        adj.get(to).add(new Node(from, weight));
    }

    public static class Result {
        public double[] distance;
        public int[] predecessor;

        public Result(double[] distance, int[] predecessor) { 
            this.distance = distance;
            this.predecessor = predecessor;
        }
    }

    public Result dijkstra(int start) {
        double[] distance = new double[V]; 
        int[] predecessor = new int[V];
        Arrays.fill(distance, Double.POSITIVE_INFINITY);
        Arrays.fill(predecessor, -1); 

        distance[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(); 
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.id;

            if (current.weight > distance[u]) continue;

            for (Node neighbor : adj.get(u)) {
                int v = neighbor.id;
                double weight = neighbor.weight;

                if (distance[u] + weight < distance[v]) {
                    distance[v] = distance[u] + weight;
                    predecessor[v] = u;  
                    pq.offer(new Node(v, distance[v]));
                }
            }
        }
        return new Result(distance, predecessor);
    }

    public List<Integer> getPath(int[] predecessor, int target) {
        List<Integer> path = new ArrayList<>();
        for (int at = target; at != -1; at = predecessor[at]) {
            path.add(at); 
        }
        return path;
    }

    public static int findRoom(String[] roomName, String inputName) {
        for (int i = 0; i < roomName.length; i++) {
            if (roomName[i] != null && roomName[i].equalsIgnoreCase(inputName)) {
                return i;
            }
        }
        return -1;
    }
}
