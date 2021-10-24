package manyToManyRelation;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
@Table(name="people")
public class People {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String count;

	@ManyToMany
	@JoinColumn(name="movie_id")
	private List<Movies> movies;

}
