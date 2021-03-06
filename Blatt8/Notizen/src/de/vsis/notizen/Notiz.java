package de.vsis.notizen;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Notiz {

	private int id;
	private String text;
	private String author;
	private long timestamp;
	
	public Notiz(int id, long timestamp, String text, String author) {
		setId(id);
		setTimestamp(timestamp);
		setText(text);
		setAuthor(author);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	private String formatTimestamp(long timestamp) {
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		return formatter.format(new Date(timestamp));
	}
	
	@Override
	public String toString() {
		return text + ", author=" + author + " (" + formatTimestamp(timestamp) + ")";
	}
	
	
}
