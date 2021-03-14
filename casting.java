public class casting {
    public static void main(String[] args){
        int num1=43;
        double num2double=num1;
        System.out.println("int2double="+num2double);//widening
        int num2=(int)num2double;
        System.out.println("double2int="+num2);//narrowing
         float var=90;
         System.out.println("float value="+var);
         int var2=(int)var;
         System.out.println("narrowing:-float2int="+var2);
        
    }
    
}
