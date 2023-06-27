package com.example.demo;


import java.math.BigDecimal;

@Entity
public class Player {
    private Long playerId;
    private BigDecimal balance;
    private String username;
    //Constructors , getters and setters

    public Player(BigDecimal balance, String username, Long playerId){
        this.balance=balance;
        this.username=username;


    }
    public Long getPlayerId(){
        return playerId;

    }

    public void setPlayerId(Long PlayerId){
        this.playerId=playerId;

    }

    public BigDecimal getBalance(){
        return balance;
    }

    public void setBalance(BigDecimal balance){
        this.balance=balance;
    }
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username=username;



    }

}
