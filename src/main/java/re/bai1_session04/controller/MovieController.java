package re.bai1_session04.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList; import java.util.List;

@RestController
public class MovieController {
    static class Movie {
        private String movieId; private String title;
        private String genre; private double rating;

        public Movie(String movieId, String title, String genre, double rating) {
            this.movieId=movieId; this.title=title;
            this.genre=genre; this.rating=rating;
        }

        public String getMovieId() {
            return movieId;
        }

        public void setMovieId(String movieId) {
            this.movieId = movieId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("M001", "Inception", "Sci-Fi", 8.8));
        movies.add(new Movie("M002", "Parasite", "Drama", 8.6));

        // đổi thành return về List ob để cho Spring boot tự covert về dạng JSON
        return movies;
    }
}