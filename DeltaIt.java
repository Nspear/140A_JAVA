public class DeltaIt implements SeqIt{
	protected int index;
	protected int initial;
	protected int delta;
	protected int num;
	public DeltaIt(Delta X){
		this.initial = X.D_initial;
		this.index = 0;
		this.delta = X.D_delta;
		this.num = X.D_num;
	}
	public boolean hasNext(){
		if(index < num)
			return true;
		else
			return false;		
	}
        public int next() throws UsingIteratorPastEndException{
		if(hasNext())
			return initial+(delta * index++);
		//System.err.println("DeltaIt called past end");
		//System.exit(1);
		//return 1;
		else
			throw new UsingIteratorPastEndException("= caught UsingIteratorPastEndException from DeltaIt");
	}

}
