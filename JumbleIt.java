public class JumbleIt implements SeqIt {
	protected Jumble J;	
	protected int index;
	public JumbleIt(Jumble s){
		this.J = s;
		this.index = 0;
	} 

	public boolean hasNext(){
		if(index < J.J_values.length)
			return true;
		else
			return false;
	}
        public int next() throws UsingIteratorPastEndException{
		if(hasNext())
			return J.J_values[index++]; 
		else{
			throw new UsingIteratorPastEndException("= caught UsingIteratorPastEndException from JumbleIt");
			//System.err.println("JumbleIt called past end");
			//System.exit(1);i
			//return 1;
		}
	}
}
