public class Delta extends Seq{
        protected int D_num;
        protected int D_initial;
        protected int D_delta;
        public Delta(int num, int initial, int delta){
                D_num = num;
                if(num == 0){
			D_initial = 0;
			D_delta = 0;
		}
		else{
		D_initial = initial;
                D_delta = delta;
		}
		
        }
        public String toString(){
		int temp = D_delta;
                return "< "+D_num+" : "+D_initial+" &"+temp+" >";
        }
	public int min(){
		if(D_delta < 0)
			return (D_initial + (D_delta * (D_num -1))); 
		else
			return D_initial;

        }
	public DeltaIt createSeqIt(){
                DeltaIt D_Object = new DeltaIt(new Delta(D_num, D_initial, D_delta));
		return D_Object;
        }

}




