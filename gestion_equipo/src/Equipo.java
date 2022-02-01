
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		boolean correcto = true;
		
		for (int i = 0; i < nombreEquipo.length(); i++) {
			char letra = nombreEquipo.charAt(i);
			if((letra >= 65 && letra<=90)||(letra >= 97 && letra<=122)||letra==32) {
				//Es un caracter normal si ser alfanumerico y incluye los espacios
			}
			else {
				correcto=false;
			}
		}
		if(correcto&&(nombreEquipo.length()>=4&&nombreEquipo.length()<=20)) {
			this.nombreEquipo=nombreEquipo;
		}
		
		
		
	}
	public void setRanking(int ranking) {
		if(ranking>=0&&ranking<=10) {
			this.ranking=ranking;
		}
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
}

