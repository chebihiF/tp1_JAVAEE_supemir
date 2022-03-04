package supemir.irm.tp1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="produit")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id @Column(length = 30, name = "reference")
    private String ref ;
    @Column(unique = true)
    private String label ;
    private double price ;
    private int quantity ;
}
