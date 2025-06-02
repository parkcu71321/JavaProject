package Chapter_06;

public class ForTest10 {
    public static void main(String[] args){
        String[][] team={
                {"1","1","2","3"},
                {"2","4","4"},
                {"5","6","7","8"}
        };
        for(int i=0; i<team.length; i++)
        {
            System.out.print((i+1) + "팀: ");
            for (int j = 0; j < team[i].length; j++)
            {
                System.out.print(team[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
