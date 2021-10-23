package employee;

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
@Table(name="EmployeeDetails")
public class Details {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String bankAccount;
	private String phoneNo;
	
	@ManyToOne
	private Employee employee;

}
