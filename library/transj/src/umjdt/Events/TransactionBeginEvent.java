package umjdt.Events;

import java.beans.PropertyChangeEvent;
import java.util.Timer;

import umjdt.concepts.TransId;
import umjdt.concepts.Transaction;

public class TransactionBeginEvent extends TransactionEvent{
	
	private Timer timer;
	private String state;
	private TransId transactionId;
	private int timeout;
	private int status;
	
	public TransactionBeginEvent(Transaction _transaction)
	{
		super.setTransaction(_transaction);
		transactionId = _transaction.getId();
		super.setId(transactionId);
		timeout = _transaction.getTimeout();
		super.setTimeout(timeout);
		_transaction.setCurrentState(state);
		
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public TransId getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(TransId transactionId) {
		this.transactionId = transactionId;
	}

}