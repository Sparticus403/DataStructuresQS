package structure.controller;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import structure.model.*;

public class StructureController
{
	private Queue<Customer> aQueue;
	private Stack<Customer> stacktastic;
	
	public StructureController()
	{
		aQueue = new LinkedList<Customer>();
		stacktastic = new Stack<Customer>();
	}
	
	public void start()
	{
		changedLinkedList();
		stacktastic.push(new Customer("something", 89));
		stacktastic.peek();
		stacktastic.pop();
		stacktastic.peek();
	}
	
	public void changedLinkedList()
	{
		aQueue.add(new Customer("Something here", 6));
		aQueue.peek();
		aQueue.remove();
	}
}
