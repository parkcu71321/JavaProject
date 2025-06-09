package Chapter07.access;


public class DiceTest {
    public static void main(String[] args){
        Dice d1=new Dice();
        Dice d2=new Dice();
        Dice d3=new Dice();

        int count=0;        //주사위 돌린 횟수

        while(true){
            count++;

            d1.setNumber((int)(Math.random()*6+1));             //Math.random은 0<=rand<1까지. +1하고 형변환 하면 1<=ran<7 즉 1부터 6사이의 정수
            d2.setNumber((int)(Math.random()*6+1));
            d3.setNumber((int)(Math.random()*6+1));

            if((d1.getNumber()==d2.getNumber()) && (d2.getNumber()==d3.getNumber())){
                break;
            }
        }
        System.out.println("d1: "+d1.getNumber()+", d2: "+d2.getNumber()+", d3: "+d3.getNumber()+
                ". 횟수: "+count);
    }
}
