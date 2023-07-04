package Assignment7.task2;

/*
Create a class movie that has the following attributes: name, director, year of release.
In the main method create two different movies and check which one is of a newer date.
 */
public class Task2 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Pulp fiction", "Quentin Tarantino", 1994);

        Movie movie2 = new Movie("Fight Club", "David Fincher", 1999);

        if (movie1.releaseYear > movie2.releaseYear){
            System.out.println("More recent is " + movie1.name);
        } else if (movie2.releaseYear > movie1.releaseYear) {
            System.out.println("More recent is " + movie2.name);
        } else {
            System.out.println("Movies premiered in the same year!");
        }

    }
}
