package it.lamiapizzeria.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class ModelOfSpecialPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nameOfSpecialPrice;

    public void setSpecialPriceDate(LocalDateTime specialPriceDate) {
        this.specialPriceDate = specialPriceDate;
    }

    @DateTimeFormat(pattern = "dd-MM-YYYY")
    @Column(name = "special_price", nullable = false)
    private LocalDateTime specialPriceDate;


    private String description;

    @DateTimeFormat(pattern = "dd-MM-YYYY")
    private LocalDateTime endOfSpecialPrice;


    @ManyToOne
    @JoinColumn(name = "pizza_id", nullable = false)
    private ModelofmenuDB pizze;



    public Integer getId() {
        return id;
    }


    public ModelofmenuDB getPizze() {
        return pizze;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public void setNameOfSpecialPrice(String nameOfSpecialPrice) {
        this.nameOfSpecialPrice = nameOfSpecialPrice;
    }


    public void setSpecialPrice(LocalDateTime specialPrice) {
        this.specialPriceDate = specialPrice;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setEndOfSpecialPrice(LocalDateTime endOfSpecialPrice) {
        this.endOfSpecialPrice = endOfSpecialPrice;
    }


    public String getNameOfSpecialPrice() {
        return nameOfSpecialPrice;
    }


    public LocalDateTime getSpecialPriceDate() {
        return specialPriceDate;
    }


    public String getDescription() {
        return description;
    }


    public LocalDateTime getEndOfSpecialPrice() {
        return endOfSpecialPrice;
    }


    public void setPizze(ModelofmenuDB pizze) {
        this.pizze = pizze;
    }


}
