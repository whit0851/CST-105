import java.util.*;
public class Chapter10_Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class MyString1{
	char[] x;
	
	public MyString1(char[] x){
	
		this.x = new char[x.length];
		for (int i = 0; i < x.length;i++)
			this.x[i]= x[i];
	}
	
	public char charAt(int index){
		return	x[index];
	}
	
	public int length(){
		return  x.length;
	}
	
	public MyString1 substring(int begin, int end){
		char [] x1 = new char[begin - end];
			for (int i = begin; i <end ; i ++)
				x1[i - begin] = x[i];
			return new MyString1(x1);
	}
	
	public MyString1 toLowerCase(){
		char [] x1 = new char[x.length];
		for (int i = 0; i < x.length; i ++)
			if( x[i]>= 'A'&& x[i]<='Z')
				x1[i] =(char)( x[i] + 32);
			else
				x1[i] = x[i];
		return new MyString1(x1);
	}
	
	public boolean equals(MyString1 s){
		for (int i = 0; i < x.length;i++){
			if (s.charAt(i) != x[i])
				return false;
		}
				return true;
	}
	
	public static MyString1 valueOf(int i){
		char [] x1 = new char[i];
		for(int j = 0; j<i; j++)
			x1[i] = x
	}
}
