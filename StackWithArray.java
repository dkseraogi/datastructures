import java.util.Scanner;

public class StackWithArray{

static int[] ds;
static int index=-1;
public static void main(String args[]){

int[]  arr;
ds= new int[5];
System.out.println("Hello World");
arr=new int[10];
arr[0]=1;
System.out.println(arr[0]);
System.out.println(arr.length);
Scanner input= new Scanner(System.in);
int option=0,data;

while(true){

System.out.print("Your choice:");
option= input.nextInt();

switch(option){

case 0:
System.out.println("Data: ");
data=input.nextInt();
push(data);
break;
case 1:
System.out.println("In 1st case");
pop();
break;

case 2:
System.out.println("In 2nd case");
System.exit(0);
break;

}//switch
}

}

//Get a data from an array
//Insert a data in an array
//delete a data from an array
//serach an element in an array
//using array as an stack

public static void push(int x){

if(index>=ds.length-1){
System.out.println("Stack overflow");
return;
}//if
else{
index++;
ds[index]=x;
//index++;

}//el
}

public static void pop(){
if(index==-1){
System.out.println("stack underflow");
//return;
}else{
System.out.println(ds[index]);
index--;
//return;
}//el
}//pop

}
