package lecture464.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lecture464.db.MovieShowingDB;
import lecture464.db.MoviesDB;
import lecture464.model.Movie;
import lecture464.model.MovieShowing;

/**
 * Servlet implementation class MovieSearch
 */
public class MovieSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String query = request.getParameter("Res");
		boolean movieExists = false;
		
		Movie aMovie = new Movie();
		MoviesDB aMovieDB = new MoviesDB();
		
		MovieShowing ms = new MovieShowing();
		MovieShowingDB msdb = new MovieShowingDB();
		
		
		
		movieExists = aMovieDB.validateMovieByName(query);
		if (movieExists) {
			aMovie = aMovieDB.getMovie(query);
			ms = msdb.getMovieShowing(aMovie.getID());

			HttpSession session = request.getSession();
			session.setAttribute("movieBean", aMovie);
			session.setAttribute("showingBean", ms);
			String address ="MovieSearchResults.jsp";
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher(address);
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
