package io.devpass.parky.entity

import io.devpass.parky.enums.EnumCheckInOut
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class ParkingSpotEvent(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int = 0,

    @Column(name = "parking_spot_id", nullable = false)
    var parkingSpotId: Int,

    @Column(name = "event", nullable = false)
    var event: EnumCheckInOut,

    @Column(name = "vehicle_id", nullable = false)
    var vehicleId : String,

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    var createdAt: LocalDateTime? = LocalDateTime.now()
)
