package com.unishare.unishare.entity.ride;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(
        name = "ride_passengers",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"ride_id", "passenger_id"})
        }
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RidePassenger {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "ride_id", nullable = false)
    private UUID rideId;

    @Column(name = "passenger_id", nullable = false)
    private Long passengerId;

    @Column(name = "seats_booked", nullable = false)
    private short seatsBooked;
}
