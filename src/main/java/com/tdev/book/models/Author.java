package com.tdev.book.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Author {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;

	  @Column(name = "name", nullable = false)
	  private String name;

	  @Column(name = "age")
	  private Integer age;
	  
	  public Author(Long id) {
		    this.id = id;
		  }
	  public Author() {
	  }
}
