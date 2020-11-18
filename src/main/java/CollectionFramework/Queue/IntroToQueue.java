package CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class IntroToQueue {
  
  /*
    1. PriorityQueue = Object with priority (FiFo)
    2. Deque
    3. ArrayDeque
   */
  
  public static void main(String[] args) {
	
	PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
	priorityQueue.add(12);
	priorityQueue.add(13);
	priorityQueue.add(14);
	
	//First Value
	System.out.println(priorityQueue.peek());
	
	//Next value
	System.out.println(priorityQueue.poll());
	System.out.println(priorityQueue.poll());
	System.out.println(priorityQueue.poll());
	
	// Initializing an deque
	ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);
	
	// add() method to insert
	de_que.add(10);
	de_que.add(20);
	de_que.add(30);
	de_que.add(40);
	de_que.add(50);
	
	System.out.println(de_que);
	
	de_que.clear();
	System.out.println(de_que);
	
	de_que.add(11);
	de_que.addFirst(101);
	de_que.addLast(201);
	System.out.println(de_que);
	
  }
  
}
