import java.util.*;
public class Solution{
    public static void main(String[] args){

        Movie[] movies = new Movie[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            int movieId = sc.nextInt();
            sc.nextLine();
            String director = sc.nextLine();
            int rating = sc.nextInt();
            int budget = sc.nextInt();
            movies[i] = new Movie(movieId,director,rating,budget);
        }
        sc.nextLine();
        String director = sc.nextLine();
        int rating = sc.nextInt();
        int budget = sc.nextInt();

        int ans = findAvgBudgetByDirector (movies,director);
        if(ans!=0){
            System.out.println(ans);
        }
        else{
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        Movie[] result = getMovieByRatingBudget(movies,rating,budget);
        if(result == null){
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
        else{
            for(int i=0;i<result.length;i++){
                System.out.println(result[i].getMovieId());
            }      
        }
    }
    public static int findAvgBudgetByDirector (Movie[] movies, String director)
    {
        int ans=0;
        int num=0;
        for(int i=0;i<4;i++){
            if ((movies[i].getDirector()).equalsIgnoreCase(director)){
                ans=ans+movies[i].getBudget();
                num=num+1;
            }
        }
        if(ans==0){
            return 0;
        }
        else{
            return ans/num;
        }
    }

  public static Movie[] getMovieByRatingBudget(Movie[] movies, int rating, int budget)
    {
        Movie[] result = new Movie[0];
        for(int i=0;i<4;i++){
            if(((movies[i].getRating())==rating)&&(((movies[i].getBudget())==budget))&&(budget%rating==0)){
                result = Arrays.copyOf(result,result.length+1);
                result[result.length-1]=movies[i];
            }
        }
        if(result.length==0){
            return null;
        }
        else{
            return result;
        }
    }
}

class Movie{
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    public void setMovieId(int movieId){
        this.movieId=movieId;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public void setRating(int rating){
        this.rating=rating;
    }
    public void setBudget(int budget){
        this.budget=budget;
    }

    public int getMovieId(){
        return movieId;
    }
    public String getDirector(){
        return director;
    }
    public int getRating(){
        return rating;
    }
    public int getBudget(){
        return budget;
    }

    public Movie(int movieId,String director,int rating,int budget){
        this.movieId=movieId;
        this.director=director;
        this.rating=rating;
        this.budget=budget;
    }
}