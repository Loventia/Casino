package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/casino")

public class CasinoController {
    private final PlayerRepository playerRepository;

    public CasinoController(PlayerRepository playerRepository) {

        this.playerRepository = playerRepository;
    }

    @GetMapping("/player/{playerId}/balance")
    public ResponseEntity<?> getBalance(@PathVariable Long playerId) {
        ResponseEntity<?> result;

        Player player = playerRepository.findByPlayerId(playerId);
        if (player == null) {
            result = ResponseEntity.badRequest().build();

        } else {
            BigDecimal balance = player.getBalance();
            result = ResponseEntity.ok(balance);
        }
        return result;
    }

    @PostMapping("player/{playerId}/balance")
    public BigDecimal getBalance(@PathVariable Long PlayerId) {
       /* Player player = playerRepository.findByPlayerId(playerId);
        if (player == null) {
            return ResponseEntity.badRequest().build();
        }*/
        BigDecimal balance = player.getBalance();
        return (balance);

    }

    @PostMapping("/player/{playerId}/balance/update")
    public ResponseEntity<?> updateBalance(
            @PathVariable Long playerId,
            @RequestBody UpdateBalanceRequest request) {
        Player player = playerRepository.findByPlayerId(playerId);
        if (player == null) {
            return ResponseEntity.badRequest().build();
        }
        BigDecimal amount = request.getAmount();
        if(amount.compareTo(BigDecimal.ZERO<O)){
            return ResponseEntity.badRequest().build();
        }
        if(request.getTransactionType()== TransactionType.WAGER &&
        amount.compareTo(player.getBalance())>0 ){
            return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();

            //perform balance update and save transaction






            return ResponseEntity.okay().build();

        }

    }


}


}
