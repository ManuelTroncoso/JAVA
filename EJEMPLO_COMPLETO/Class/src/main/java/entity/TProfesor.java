package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;


@Entity
@Table(name = "TProfesor")
public class TProfesor {
	
	@Id
	@Column (name = "Id")
	@Getter @Setter
	private int Id;
	
	@Column (name = "Name")
	@Getter @Setter
	private String Name;
	

}
