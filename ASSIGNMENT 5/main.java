class shape{
void displayshape(){
System.out.println("this is shape");}
}

class circle extends shape{
void displaycircle(){
System.out.println("this is circle");}
}

class rectangle extends shape{
void displayrectangle(){
System.out.println("this is rectangle ");}
}

class square extends rectangle{
void displays(){
System.out.println("Square is rectangle");} 
}


class main{
public static void main(String[] args){
square sq = new square();
sq.displayshape();
sq.displayrectangle();
System.out.println("AADITIYA CHAUHAN 24CSU362");
}}