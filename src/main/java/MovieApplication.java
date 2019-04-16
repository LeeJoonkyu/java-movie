import domain.Movie;
import domain.MovieRepository;
import domain.PlaySchedule;
import view.InputView;
import view.OutputView;

import java.util.List;

public class MovieApplication {

    public void printSelectedMovieInfo(int movieId, List<Movie> movies) {
        for (Movie movie : movies) {
            printSelectedMovieInformation(movie, movieId);
        }
    }

    public void printSelectedMovieInformation(Movie movie, int movieId) {
        if (movie.checkMovieId(movieId)) {
            System.out.println(movie);
        }
    }

    public static void main(String[] args) {
        List<Movie> movies = MovieRepository.getMovies();
        OutputView.printMovies(movies);

        int movieId = InputView.inputMovieId();
        MovieApplication m = new MovieApplication();
        //movie List 를 가져와서 파싱하면서 해결해야함.
        //ID를 받아서,

        //MovieRepository.printMovieInfo(movieId);
        //Id 에 맞는 무비 정보를 가져온다.
        //해당 무비의 info를 출력한다.
        //해당 무비의 플레이스케쥴을, 새로운 List에 추가한다.
        //해당 리스트를 돌면서,
        /*for (Movie movie : movies){
            movie.getPlayScehdules().get[selectedTable];
            for (PlaySchedule playSchedule : movie.)
        }*/
        //TODO : 바깥 루프 필요함
        m.printSelectedMovieInfo(movieId, movies);


        int selectedTable = InputView.inputTimeTable();
        int reseravationNumber = InputView.inputReservationNumber();
        int payOrAdditionalReservation = InputView.inputPayOrAdditionalReservation();
        //예약 내역 프린트. 이건 movie 정보를 받아야겟지

        InputView.printPaymentRunningMessage();
        int amountOfPointToUse = InputView.inputAmountOfPointToUse();
        int payByCreditOrCash = InputView.inputPayByCreditCardOrCash();


    }
    // TODO 구현 진행

}

