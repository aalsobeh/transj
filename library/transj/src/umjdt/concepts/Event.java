package umjdt.concepts;

import java.util.UUID;

public class Event {

		private TransactionThread transactionThread = new TransactionThread();
		private char type;
		private Timestamp minTime = new Timestamp();
		private Timestamp maxTime = new Timestamp();
		private Timestamp localTime = new Timestamp();
		private TransId id ;
		private TransId transId;

		
		public Event()
		{
		}
		public char getType() {
			return type;
		}
		public void setType(char type) {
			this.type = type;
		}
		
		public TransactionThread getTransctionThread() {
			return transactionThread;
		}
		public void setTransactionThread(TransactionThread _transactionThread) {
			this.transactionThread = _transactionThread;
		}
		public TransId getId() {
			return id;
		}
		public void setId(TransId id) {
			this.id = id;
		}
		public Timestamp getMinTime() {
			return minTime;
		}
		public void setMinTime(Timestamp minTime) {
			this.minTime = minTime;
		}
		public Timestamp getMaxTime() {
			return maxTime;
		}
		public void setMaxTime(Timestamp maxTime) {
			this.maxTime = maxTime;
		}
		
		public boolean threadEventHappensBefore(Event e)
		{
			if(e.getTransctionThread().getThisThread().getId() == this.getTransctionThread().getThisThread().getId())
				if(e.getLocalTime().compareTo(this.getLocalTime()) > 0)
						return true;
			return false;
		}
		
		public Timestamp getLocalTime() {
			return localTime;
		}
		
		public void setLocalTime(Timestamp localTime) {
			this.localTime = localTime;
		}
		public TransId getTransId() {
			return transId;
		}
		public void setTransId(TransId transId) {
			this.transId = transId;
		}
	}
