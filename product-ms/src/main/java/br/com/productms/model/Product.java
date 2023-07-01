package br.com.productms.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tb_product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "isAvailable")
    private boolean isAvailable;
}
