package com.claudsaints.spring.entities.enums;

public enum OrderStatus {
    WAITTING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVER(4),
    CANCELED(5);
    private int code;

    OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }

    public static OrderStatus valueOf(int code){
        for (OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code) return value;
        }
        throw new IllegalArgumentException("Invalid Order Status Code");
    }
}
