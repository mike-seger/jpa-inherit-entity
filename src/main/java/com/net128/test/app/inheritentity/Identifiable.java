package com.net128.test.app.inheritentity;

import lombok.*;
import java.util.Objects;
import javax.persistence.*;
@MappedSuperclass
@Data
public abstract class Identifiable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Identifiable that)) return false;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}