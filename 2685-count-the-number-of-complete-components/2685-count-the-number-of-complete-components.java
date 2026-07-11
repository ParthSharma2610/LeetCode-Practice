class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[n];
        int complete = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                Queue<Integer> q = new LinkedList<>();
                List<Integer> component = new ArrayList<>();
                q.add(i);
                visited[i] = true;
                while (!q.isEmpty()) {
                    int curr = q.poll();
                    component.add(curr);
                    for (int j = 0; j < graph[curr].size(); j++) {
                        int next = graph[curr].get(j);
                        if (!visited[next]) {
                            visited[next] = true;
                            q.add(next);
                        }
                    }
                }
                int vertices = component.size();
                int edgeCount = 0;
                for (int j = 0; j < component.size(); j++) {
                    int node = component.get(j);
                    edgeCount += graph[node].size();
                }
                edgeCount /= 2;
                if (edgeCount == (vertices * (vertices - 1)) / 2) {
                    complete++;
                }
            }
        }
        return complete;
    }
}