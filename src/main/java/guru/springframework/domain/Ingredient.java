package guru.springframework.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Ingredient {
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
	private BigDecimal amount;
	@Getter
	@Setter
	@ManyToOne
	private Recipe recipe;
	@Getter
	@Setter
	@OneToOne(fetch = FetchType.EAGER)
	private UnitOfMeasure uom;
}
