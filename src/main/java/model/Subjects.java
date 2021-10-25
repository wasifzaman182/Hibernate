package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="subject")
public class Subjects {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String subjectName;
	
	@ManyToOne
	private Student student;
}
