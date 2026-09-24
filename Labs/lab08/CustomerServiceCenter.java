import java.util.LinkedList;
import java.util.Queue;

public class CustomerServiceCenter {
    private Queue<String> requestQueue;

    public CustomerServiceCenter() {
        requestQueue = new LinkedList<>();
    }


    public void addRequest(String request) {
        requestQueue.offer(request);
    }

    public String processNextRequest() {
        if (requestQueue.isEmpty()) {
            return "No requests to process";
        }
        return requestQueue.poll();
    }

    public void displayQueue() {
        for (String request : requestQueue) {
            System.out.println(request);
        }
    }
}