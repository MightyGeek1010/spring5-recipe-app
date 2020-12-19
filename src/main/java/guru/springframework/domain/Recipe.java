package guru.springframework.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Entity
@Slf4j
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;
	@Getter
	@Setter
	private String description;
	@Getter
	@Setter
	private Integer prepTime;
	@Getter
	@Setter
	private Integer cookTime;
	@Getter
	@Setter
	private Integer servings;
	@Getter
	@Setter
	private String source;
	@Getter
	@Setter
	private String url;
	@Getter
	@Setter
	private String directions;
	// Difficulty
	@Getter
	@Setter
	private Byte[] image;
	@OneToOne(cascade = CascadeType.ALL)
	@Getter
	@Setter
	@Lob
	private Notes notes;

}
