package application;

public class Anime {
	
	private String name;
	private String status;
	
	public Anime(String name, String status) {
		super();
		this.name = name;
		this.status = status;
	}

	public Anime(String name) {
		super();
		this.name = name;
	}

	public Anime() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
