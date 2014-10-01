public class Constant extends Seq{
        protected int C_num;
        protected int C_value;
        public Constant(int num, int value){
                C_num = num;
                if(num == 0)
			C_value = 0;
		else
			C_value = value;
		
        }
        public String toString(){
                return "[ "+C_num+" : "+C_value+" ]";
        }
	public int min(){
		return C_value;
	}
	public ConstantIt createSeqIt(){
		ConstantIt C_Object = new ConstantIt(new Constant(C_num, C_value));
		return C_Object;
	}
}





