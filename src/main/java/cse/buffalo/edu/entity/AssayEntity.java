package cse.buffalo.edu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assay")
public class AssayEntity {

	@Id
	@Column(name = "as_id")
	private int as_id;

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private String type;

	@Column(name = "setting")
	private String setting;

	@Column(name = "description")
	private String description;
}
