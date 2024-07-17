
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Role {
 @Id
 private Integer id;
 @NotBlank
 private String name;
}
