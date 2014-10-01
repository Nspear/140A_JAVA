public class Plus
{
	public static Seq plus(Seq x, Seq y)
	{
		SeqIt xiter = x.createSeqIt();
		SeqIt yiter = y.createSeqIt();

		int xinit, yinit, diff, previous, current, count = 0;
		boolean isJumble = false;
		try
		{
			xinit = xiter.next();
			yinit = yiter.next();
			previous = xinit + yinit;
			count++;
		}
		catch(UsingIteratorPastEndException e)
		{
			return new Constant(0,0);
		}
		try
		{
			current = xiter.next() + yiter.next();
			diff = current - previous;
			previous = current;
			count++;
		}
		catch(UsingIteratorPastEndException e)
		{
			return new Constant(1,previous);
		}

		while(true)
		{
			try
			{
				current = xiter.next() + yiter.next();
				if(current - previous != diff)
					isJumble = true;
				previous = current;
				count++;
			}
			catch(UsingIteratorPastEndException e)
			{
				break;
			}
		}
	
		if(!isJumble)
			if(diff == 0)
				return new Constant(count,xinit+yinit);
			else
				return new Delta(count,xinit+yinit,diff);
		
		int temp[] = new int[count];
		xiter = x.createSeqIt();
		yiter = y.createSeqIt();		
		
		int counter = 0;
		while(true)
		{
			try
			{
				temp[counter++] = xiter.next() + yiter.next();
			}
			catch(UsingIteratorPastEndException e)
			{
				return new Jumble(temp);
			}
		}
	}
}
