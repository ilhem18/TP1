package simulationreseauxsocial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Utilisateur {
	String nom;
	String prenom;
	String email;
	int numtelephone;
	
	public Utilisateur() {
		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumtelephone() {
		return numtelephone;
	}

	public void setNumtelephone(int numtelephone) {
		this.numtelephone = numtelephone;
	}
	public void ajouterPost(byte[] post) {
		FileOutputStream p = null;
		try{
		p = new FileOutputStream(new File("postsaver.txt")); 
		while(post!=null) {
			p.write(post);
		}
		}catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 catch (IOException e) {
		 e.printStackTrace();
		 } finally { 
		 try {
		
		 if (p != null) p.close();
		 } catch (IOException e) {
		 e.printStackTrace();
		 } 
}
	
	}
}

