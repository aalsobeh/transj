package umjdt.concepts;

import umjdt.Events.ExceptionThrownEvent;
import umjdt.Events.IsBlockedEvent;
import umjdt.Events.LockEvent;
import umjdt.Events.RequestTimestampEvent;
import umjdt.Events.TimeoutEvent;


public class Resource {

	private String name;
	private int resourceId;
	private Transaction transaction;
	private String status;	
	private ResourceManager resourceManager;
	private TransactionManager transactionManager;
	private TimeoutEvent timeoutEvent;
	private IsBlockedEvent isblockedEvent;
	private RequestTimestampEvent requestTimestampEvent;
	private ExceptionThrownEvent exceptionThrownEvent;
	
	public Resource(){
	}
	public Resource(int _id){
	}
	public Resource(String _name){
	}
	public Resource(ResourceManager _rm){
	}
	public Resource(TransactionManager _tm){
	}
	public Resource(TransactionManager _tm, ResourceManager _rm){	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ResourceManager getResourceManager() {
		return resourceManager;
	}
	public void setResourceManager(ResourceManager resourceManager) {
		this.resourceManager = resourceManager;
	}
	public TransactionManager getTransactionManager() {
		return transactionManager;
	}
	public void setTransactionManager(TransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	public TimeoutEvent getTimeoutEvent() {
		return timeoutEvent;
	}
	public void setTimeoutEvent(TimeoutEvent timeoutEvent) {
		this.timeoutEvent = timeoutEvent;
	}
	public IsBlockedEvent getIsblockedEvent() {
		return isblockedEvent;
	}
	public void setIsblockedEvent(IsBlockedEvent isblockedEvent) {
		this.isblockedEvent = isblockedEvent;
	}
	public RequestTimestampEvent getRequestTimestampEvent() {
		return requestTimestampEvent;
	}
	public void setRequestTimestampEvent(RequestTimestampEvent requestTimestampEvent) {
		this.requestTimestampEvent = requestTimestampEvent;
	}
	public ExceptionThrownEvent getExceptionThrownEvent() {
		return exceptionThrownEvent;
	}
	public void setExceptionThrownEvent(ExceptionThrownEvent exceptionThrownEvent) {
		this.exceptionThrownEvent = exceptionThrownEvent;
	}
}
