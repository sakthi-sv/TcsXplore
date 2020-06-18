
import java.util.*;


public class Solution {
   public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       Player[] p=new Player[4];
       for(int i=0;i<4;++i) {
            int playerId=sc.nextInt();sc.nextLine();
            String skill=sc.nextLine();
            String level=sc.nextLine();
            int points=sc.nextInt();
             p[i]=new Player(playerId,skill,level,points);
       }
       sc.nextLine();
       String key=sc.nextLine();
       String l=sc.nextLine();
       System.out.println(findPointsForGivenSkill(p, key));
       System.out.println(getPlayerBasedOnLevel(p,key,l).playerId);
    }

    public static int findPointsForGivenSkill(Player[] p, String skill)
      {
          //method logic
        int sum=0;
        for(int i=0;i<4;i++) {
            if(p[i].getSkill().equals(skill)) {
                sum+=p[i].getPoints();
            }
        }
        return sum;
      }

    public static Player getPlayerBasedOnLevel(Player[] p, String skill, String level)
      {
          //method logic
        for(int i=0;i<5;i++) {
            if(p[i].getSkill().equals(skill) && 
                    p[i].getLevel().equals(level) &&
                    p[i].getPoints()>=20) {
                return p[i];
            }
      }
        return null;
}
}

class Player
{
    //code to build Player class
    int playerId;
    String skill;
    String level;
    int points;
    public Player(int playerId, String skill, String level, int points) {
        super();
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
}