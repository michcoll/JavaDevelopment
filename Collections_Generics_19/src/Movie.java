
public class Movie implements Comparable {	

	public String title;
	public String category;
	
	public Movie(String title, String category) {	
		this.title = title;
		this.category = category;
	}	
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", category=" + category + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
