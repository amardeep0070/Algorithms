package sprialMatrix;

import java.util.ArrayList;
import java.util.List;

public class spriaMatrix {
	private static int top, bottom, left , right, direction;
public static ArrayList spiralPrint(List <ArrayList<Integer>> a){
	ArrayList <Integer> result = new ArrayList<>();
	top=0;
	bottom=a.size()-1;
	left=0;
	right=a.get(0).size()-1;
	direction=0;
	while(left<=right && top<=bottom){
	if(direction==0){
		for (int i=left; i<=right; i++){
			result.add(a.get(top).get(i));
		}
		System.out.println(result.toString());
		top++;
		direction++;
	}
	else if(direction==1){
		for(int i=top; i<=bottom;i++){
			result.add(a.get(i).get(right));
		}
		System.out.println(result.toString());
		right--;
		direction++;
	}
	else if(direction==2){
		for(int i=right;i>=left;i--){
			result.add(a.get(bottom).get(i));
		}
		System.out.println(result.toString());
		bottom--;
		direction++;
	}
	else if(direction==3){
		for(int i=bottom;i>=top; i--){
			result.add(a.get(i).get(left));
		}
		System.out.println(result.toString());
		left++;
		
	}
	direction=0;
	}
	return result;
	
}
public static void main(String[] args) {
	ArrayList<Integer> a= new ArrayList<>();
	ArrayList<Integer> b= new ArrayList<>();
	ArrayList<Integer> c= new ArrayList<>();
	ArrayList<Integer> d= new ArrayList<>();
	a.add(1);
	//a.add(2);
	//a.add(3);
	//b.add(4);
	b.add(4);
	//b.add(6);
	//c.add(7);
	//c.add(8);
	c.add(7);
	d.add(10);
	List<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
	input.add(a);
	input.add(b);
	input.add(c);
	input.add(d);
	spriaMatrix s = new spriaMatrix();
	System.out.println(s.spiralPrint(input).toString());
	//System.out.println(input.get(0));
}
}
