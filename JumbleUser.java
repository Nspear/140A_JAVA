public class JumbleUser
{
	private static int largest;
	private static int size;
	private static int previous, curr;
	public static int lengthLongestNDCSS1(Jumble j)
	{
		largest = 0;
		size = 0;
		JumbleIt iter = new JumbleIt(j);
		while(iter.hasNext()){
			try{
				if(size == 0){
					previous = iter.next();
					size++;
					if(!iter.hasNext())
						return 1;
					continue;

				}
				curr = iter.next();
			}catch(UsingIteratorPastEndException e){
					return largest; //1
			}
			if(curr >= previous)
				size++;
			else{
				if(size > largest)
					largest = size;
					size = 1;
			}
			if(!iter.hasNext())
			{
				if(size > largest)
					return size;
			}
			previous = curr;
		}
		return largest;
	}
	public static int lengthLongestNDCSS2(Jumble j){
		largest = 0;
		size = 0;
		JumbleIt iter = new JumbleIt(j);
		while(true){
                        try{
                                if(size == 0){
                                        previous = iter.next();
                                        size++;
                                        //if(!iter.hasNext())
                                        //        return 1;
                                        continue;

                                }
                                curr = iter.next();
                        }catch(UsingIteratorPastEndException e){
				if(size > largest)
					return size;
				else
                                        return largest; //largest
                        }
                        if(curr >= previous)
                                size++;
                        else{
                                if(size > largest)
                                        largest = size;
                                        size = 1;
                        }
                        //if(!iter.hasNext())
                        //{
                        //       if(size > largest)
                        //                return size;
                        //}
                        previous = curr;
                }
		
	}	
}




















