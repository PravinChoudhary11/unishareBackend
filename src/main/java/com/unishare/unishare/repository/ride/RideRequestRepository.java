package com.unishare.unishare.repository.ride;

import com.unishare.unishare.dto.ride.RidePassengerDto;
import com.unishare.unishare.entity.ride.RideRequest;
import com.unishare.unishare.enums.ride.RideRequestStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface RideRequestRepository extends JpaRepository<RideRequest, UUID> {

    Page<RideRequest> findByRideId(UUID rideId,Pageable pageable);

    Optional<RideRequest> findByRideIdAndPassengerIdAndStatus(
            UUID rideId,
            Long passengerId,
            RideRequestStatus status
    );

    Page<RideRequest> findByPassengerId(
            Long passengerId,
            Pageable pageable
    );

    Page<RideRequest> findByRideIdAndStatus(
            UUID rideId,
            RideRequestStatus status,
            Pageable pageable
    );

    @Query("""
    SELECT new com.unishare.unishare.dto.ride.RidePassengerDto(
        u.id,
        u.email,
        u.username,
        u.userProfilePictureURL,
        u.userBio,
        rr.seatsRequested
    )
    FROM RideRequest rr
    JOIN User u ON rr.passengerId = u.id
    WHERE rr.rideId = :rideId
    AND rr.status = com.unishare.unishare.enums.ride.RideRequestStatus.CONFIRMED
    """)
    Page<RidePassengerDto> findConfirmedPassengers(UUID rideId, Pageable pageable);
}
