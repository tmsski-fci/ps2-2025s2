package ps2.teoriab3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Professor {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private int matricula;
    private String area;
    @ManyToOne
    private Faculdade faculdade;
}
