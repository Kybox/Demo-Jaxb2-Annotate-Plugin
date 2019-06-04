

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_role")
public class test {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name", length = 50)
    @ManyToMany
    @NotNull
    @javax.persistence.JoinColumn
    private String name;
}
