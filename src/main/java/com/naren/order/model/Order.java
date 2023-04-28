package com.naren.order.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VETA_ORDER",schema = "idea")
@Data
public class Order {
    @Id
    private Long id;
    private String  orderName;
    private String orderStatus;
    private String orderLocation;
    private String paymentStatus;


}
