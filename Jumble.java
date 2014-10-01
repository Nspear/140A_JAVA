public class Jumble extends Seq{
        protected int [] J_values;
        public Jumble(int [] values){
                J_values = new int [values.length];
		System.arraycopy(values, 0, J_values, 0, values.length);
        }
        public String toString(){
                String temp = "{ "+Integer.toString(J_values.length)+" : ";
                for (int i = 0; i < J_values.length; i++)
                {
                        temp = temp+Integer.toString(J_values[i])+" ";
                }
                temp = temp+"}";
                return temp;
        }
	public int min(){
	       int min = 9999999;		
               for(int i = 0; i<J_values.length; i++){
	                if(J_values[i] < min)
				min = J_values[i];	
	       } 
	       if (J_values.length == 0)
			return 0;
	       else
	       	        return min;
        }
	public JumbleIt createSeqIt(){
                 JumbleIt J_Object = new JumbleIt(new Jumble(J_values));
		return J_Object;
        }

}
