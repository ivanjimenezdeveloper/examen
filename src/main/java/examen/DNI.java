package examen;

public class DNI {

	
	static String DNIstring;
	
	static String letras[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};


	public static void main(String[] args) {
		DNI ivandni = new DNI("");
		DNI.crearDNI("43228678", ivandni);
		if(ivandni.formato(ivandni)== true) {
			
			System.out.println(ivandni.getDNI());

			
		}
		else {
			System.out.println("ERROR");
		}
	}

	public DNI(String dNI) {
		DNIstring = dNI;
	}


	
	public static DNI crearDNI(String numeros, DNI dni) {
		
		int indice = Integer.parseInt(numeros) % 23;
		
		if(numeros.length() == 8 && (Integer.parseInt(numeros) % 23) >= 0 && (Integer.parseInt(numeros) % 23) <= 23) {
			
			 dni.setDNI("" +numeros + "" +letras[indice]);
			 
			 return dni;
		}else {
			System.out.println("NUMEROS INCORRECTOS");
			
			return null;
		}
		
	}

	public static boolean formato(DNI dni) {
		
		
		try {
			
			Integer.parseInt(dni.getDNI().substring(0, 8));
			
			boolean letra = dni.getDNI().substring(8, 9).matches("[a-zA-Z]+");
			
			if(letra == false) {
				return false;
			}else {
				return true;

			}
			
			
		} catch (Exception e) {
			return false;
		}
		

		
	}


	public static String getDNI() {
		return DNIstring;
	}



	public void setDNI(String dNI) {
		DNIstring = dNI;
	}
}
