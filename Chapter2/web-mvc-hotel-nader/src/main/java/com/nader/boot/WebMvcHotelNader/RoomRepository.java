package com.nader.boot.WebMvcHotelNader;

import com.nader.boot.WebMvcHotelNader.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PotatoSauceVFX <rj@potatosaucevfx.com>
 */
@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
