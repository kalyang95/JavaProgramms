package com.pavan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Runner {
    private HashMap<Integer, Object> resources = new HashMap<Integer, Object>();
     ArrayList<String> tasks = new ArrayList<String>();

    public Iterable<Object> getResources() {
        return this.resources.values();
    }

    public Resource21 acquireResource(int id) {
        Resource21 w = (Resource21) this.resources.getOrDefault(id, null);
        if (w == null) {
            w = new Resource21(id);
            this.resources.put(id, w);
        }

        return w;
    }

    public void releaseResource(int id) {
        Resource21 w = (Resource21) this.resources.getOrDefault(id, null);
        if (w == null)
            throw new IllegalArgumentException();

        w.dispose();
    }

    public class Resource21 {

        private int id;
        

        public int getId() {
            return this.id;
        }

        public Iterable<String> getTasks() {
            return this.tasks;
        }

        public Resource21(int id) {
            this.id = id;
        }

        public void performTask(String task) {
            if (this.tasks == null)
                throw new IllegalStateException(this.getClass().getName());

            this.tasks.add(task);
        }

        public void dispose() {
            this.tasks = null;
        }
    }

    public static void main(String[] args) {
        Runner d = new Runner();

        
        d.acquireResource(2).performTask("Task21");
        System.out.println(String.join(", ", d.acquireResource(2).getTasks()));
        d.releaseResource(2);
        d.acquireResource(1).performTask("Task11");
        d.acquireResource(1).performTask("Task12");
        System.out.println(String.join(", ", d.acquireResource(1).getTasks()));
        d.releaseResource(1);
    }
}