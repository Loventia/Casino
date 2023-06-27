package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository

public interface PlayerRepository extends JpaRepository<Player, Long> {
    //query method
    Player findByPlayerId (Long playerId);
    Player findByUsername(String username);


}
