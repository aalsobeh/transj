package umjdt.concepts;

import com.arjuna.ats.internal.jta.transaction.jts.BaseTransaction;
import java.io.Serializable;
import java.util.*;

import umjdt.Events.Event;
import umjdt.Events.TransactionEvent;

public class Transaction{

	private static final long serialVersionUID = 1L;
	private TransId id;
	private String currentState;
	private int timeout;
	private List<TransactionEvent> events = new ArrayList<TransactionEvent>();
	private List<Operation> operations = new ArrayList<Operation>();
	private List<Resource> resources = new ArrayList<Resource>();
	private TransactionManager transactionManager = new TransactionManager();
	private ResourceManager resourceManager= new ResourceManager();
	private TwoPhaseCommitProtocol twoPhaseCommitProtocol = new TwoPhaseCommitProtocol();
	private TransactionThread transactionThread; 
	private List<TransactionManager> listTMs = new ArrayList<>();
	private List<ResourceManager> listRMs= new ArrayList<>();
	
	public Transaction(TransId id, String _currentState){	
		super();
		this.id= id;
		this.currentState = _currentState;
	}
	
	public Transaction(String _currentState){
		super();
		this.currentState = _currentState;
	}

	public Transaction(TransId _id){
		super();
		this.setId(_id);		
	}

	public String getBeginState(){
		return "begin";			
	}

	public String getCommitState(){
		return "commit";			
	}
	
	public String getAbortState(){
		return "rollback";			
	}
	
	public TransId getId(){
		return id;
	}

	public void setId(TransId _id) {
		this.id = _id;
	}
	
	public List<TransactionEvent> getEvents() {
		return events;
	}
	public void setEvents(List<TransactionEvent> _events) {
		this.events = _events;
	}
	
	public void addEvent(TransactionEvent _event){		
		events.add(_event);
	}
	
	public void removeEvent(TransactionEvent _event){
		events.remove(_event);
	}
		
	public Event getEventForOperation(String _data, char _type){
		synchronized(events){
			for(TransactionEvent event : events){
				if(event.getOperation().getData().toString().equals(_data) && event.getType()==_type)
					return event;
			}
		}
		return null;
	}
	
	public String getCurrentState() {
		return currentState;
	}
	
	public void setCurrentState(String _currentState) {
		this.currentState = _currentState;
	}
	
	// we have in JTA transaction an equal method to check the similarity between transaction
	@Override
	public boolean equals(Object _obj){ 
		Transaction  tempTransaction = (Transaction)_obj;
		if(tempTransaction.getId().equals(this.getId()))
			return true;
		return false;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public TransactionManager getTransactionManager() {
		return transactionManager;
	}

	public void setTransactionManager(TransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public ResourceManager getResourceManager() {
		return resourceManager;
	}

	public void setResourceManager(ResourceManager resourceManager) {
		this.resourceManager = resourceManager;
	}

	public TwoPhaseCommitProtocol getTwoPhaseCommitProtocol() {
		return twoPhaseCommitProtocol;
	}

	public void setTwoPhaseCommitProtocol(
			TwoPhaseCommitProtocol twoPhaseCommitProtocol) {
		this.twoPhaseCommitProtocol = twoPhaseCommitProtocol;
	}

	public TransactionThread getTransactionThread() {
		return transactionThread;
	}

	public void setTransactionThread(TransactionThread transactionThread) {
		this.transactionThread = transactionThread;
	}
	public List<TransactionManager> getListTMs() {
		return listTMs;
	}

	public void setListTMs(List<TransactionManager> listTMs) {
		this.listTMs = listTMs;
	}

	public List<ResourceManager> getListRMs() {
		return listRMs;
	}

	public void setListRMs(List<ResourceManager> listRMs) {
		this.listRMs = listRMs;
	}
}