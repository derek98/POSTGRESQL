package entidades;

public class user {

	

	private int id;
	private String datos;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getdatos() {
		return datos;
	}
	public void setNombre(String datos) {
		this.datos = datos;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", datos=" + datos + "]";
	}
	
	

	
	
}
