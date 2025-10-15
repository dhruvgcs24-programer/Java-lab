class complex {
    public int real;
    public int imag;
    public complex(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
}
public class calculator{
    public int add(int a,int b){
        return a+b;
    }
    public complex add(complex c1,complex c2){
        return new complex(c1.real+c2.real,c1.imag+c2.imag);
    }   

    public static void main(String[] args){
        complex C1=new complex(5, 7);
        complex C2=new complex(6, 8);
        calculator c= new calculator();
        System.out.println(c.add(10,200));

        complex s=c.add(C1, C2);
        System.out.println("Sum of compex number: "+s.real+" +"+s.imag+"i" );
        


    }

}