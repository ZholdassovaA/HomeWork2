package lesson2;

public class MovieDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Поймай меня, если сможешь";
        one.genre = "Драма";
        one.rating = 5;

        Movie two = new Movie();
        two.title = "Зеркало";
        two.genre = "Ужастик";
        two.rating = 7;

        Movie three = new Movie();
        three.title = "Мы Миллеры";
        three.genre = "Комедия";
        three.rating = 9;

        one.printMovieInfo();
        two.printMovieInfo();
        three.printMovieInfo();
    }
}
