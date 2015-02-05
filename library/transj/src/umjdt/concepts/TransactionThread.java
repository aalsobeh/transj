package umjdt.concepts;

import java.util.*;

public class TransactionThread implements Runnable{

	private List<Event> events = new ArrayList<Event>();
	private Thread thisThread;
	
	public TransactionThread(){
		
	}
	
	public TransactionThread(Thread t){
		setThisThread(new Thread());
	}
	
	public List<Event> getEvents() {
		return events;
	}

	public Timestamp getTimestamp(){
		return new Timestamp();
	}
	public void setEvents(List<Event> events) {
		this.events = events;	
	}
	
	public void addEvent(TransactionEvent event){
		events.add(event);
	}
	
	public void removeEvent(TransactionEvent event){
		events.remove(event);
	}
	
	public boolean contains(Event e) {
		return events.contains(e);
	}
	
	@Override
	public void run() {		
	}
	
	public Thread getThisThread() {
		return thisThread;
	}
	
	public void setThisThread(Thread thisThread) {
		this.thisThread = thisThread;
	}
}