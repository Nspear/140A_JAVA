public class ConstantIt implements SeqIt
{
	private int seqlength;
	private int val;
	private int counter = 0;
	ConstantIt(Constant c)
	{
		seqlength = c.C_num;
		val = c.C_value;
	}
	public boolean hasNext()
	{
		return counter < seqlength;
	}
	public int next() throws UsingIteratorPastEndException
	{
		if(hasNext())
		{
			counter++;
			return val;
		}
		//System.err.println("ConstantIt called past end");
		//System.exit(1);
		//return 1;
		else{ 
			throw new UsingIteratorPastEndException("= caught UsingIteratorPastEndException from ConstantIt");
		}
	}
}
