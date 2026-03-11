package com.unishare.unishare.service.ride;

import com.unishare.unishare.enums.ride.RideStatus;
import com.unishare.unishare.repository.ride.RideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class RideCleanUpService {

    private final RideRepository rideRepository;

    // Runs every 1 hour
    @Scheduled(fixedRate = 3600000)
    @Transactional
    public void deleteExpiredCancelledRides() {

        LocalDateTime threshold = LocalDateTime.now().minusHours(48);

        rideRepository.deleteByStatusAndCancelledAtBefore(
                RideStatus.CANCELLED,
                threshold
        );
    }
}
