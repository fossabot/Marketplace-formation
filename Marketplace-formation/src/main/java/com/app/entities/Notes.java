package com.app.entities;

import java.io.Serializable;
import java.util.Date;


public class Notes implements Serializable {

private float notes;

private Date dateN;

private String Commentaire;

public float getNotes() {
	return notes;
}

public void setNotes(float notes) {
	this.notes = notes;
}

public Date getDateN() {
	return dateN;
}

public void setDateN(Date dateN) {
	this.dateN = dateN;
}

public String getCommentaire() {
	return Commentaire;
}

public void setCommentaire(String commentaire) {
	Commentaire = commentaire;
}


}
