package io.devpass.parky.repository

import io.devpass.parky.entity.ParkingSpot
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ParkingSpotRepository : CrudRepository<ParkingSpot, Int>, JpaSpecificationExecutor<ParkingSpot> {
    fun findByFloorAndSpot(floor: Int, spot: Int): ParkingSpot?
    fun findByInUseBy(inUseBy: String): ParkingSpot?
    fun findByInUseByIsNull(): List<ParkingSpot>
}