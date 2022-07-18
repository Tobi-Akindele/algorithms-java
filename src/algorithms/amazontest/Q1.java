package algorithms.amazontest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1 {

	public static void main(String[] args) {
		List<List<String>> queries = new ArrayList<>();
        List<String> sub = new ArrayList<>();
        sub.add("INSERT");
        sub.add("A");
        queries.add(sub);

        sub = new ArrayList<>();
        sub.add("INSERT");
        sub.add("B");
        queries.add(sub);

        sub = new ArrayList<>();
        sub.add("INSERT");
        sub.add("C");
        queries.add(sub);

        sub = new ArrayList<>();
        sub.add("INSERT");
        sub.add("D");
        queries.add(sub);

        sub = new ArrayList<>();
        sub.add("INSERT");
        sub.add("E");
        queries.add(sub);

        sub = new ArrayList<>();
        sub.add("SHIP");
        sub.add("-");
        queries.add(sub);

        sub = new ArrayList<>();
        sub.add("INSERT");
        sub.add("F");
        queries.add(sub);

        sub = new ArrayList<>();
        sub.add("SHIP");
        sub.add("-");
        queries.add(sub);

        System.out.println(performWarehouseQueries(queries));
	}

	public static List<List<String>> performWarehouseQueries(List<List<String>> queries) {
        if (queries == null || queries.isEmpty()) {
            return new ArrayList<>();
        }
        Queue<String> queue = new LinkedList<>();
        List<List<String>> soln = new ArrayList<>();
        for (List<String> query : queries) {
            if (query == null || query.isEmpty() || query.size() > 2) {
                continue;
            }
            String request = query.get(0);//trim
            String value = query.get(1);//trim
            if (request.equals("INSERT")) {
                queue.add(value);
            } else if (request.equals("SHIP")) {
                List<String> result = new ArrayList<>();
                if (queue.size() >= 3) {
                    int count = 3;
                    while (count != 0 && !queue.isEmpty()) {
                        result.add(queue.poll());
                        count--;
                    }
                } else {
                    result.add("N/A");
                }
                soln.add(result);
            }
        }
        return soln;
    }
}
