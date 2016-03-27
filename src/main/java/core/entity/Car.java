package core.entity;

import javax.persistence.*;

@Entity(name = "brand_model")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @OneToMany
//    @JoinColumn(name = "brand_id")
//    private Brand brand;

//    @OneToMany
//    @JoinColumn(name = "model_id")
//    private Model model;

    @Column(name = "price")
    private Double price;

    public Car() {
    }

//    public Car(Brand brand, Model model, Double price) {
//        this.brand = brand;
////        this.model = model;
//        this.price = price;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public Brand getBrand() {
//        return brand;
//    }
//
//    public void setBrand(Brand brand) {
//        this.brand = brand;
//    }

//    public Model getModel() {
//        return model;
//    }
//
//    public void setModel(Model model) {
//        this.model = model;
//    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
