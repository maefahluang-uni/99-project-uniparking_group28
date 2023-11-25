package th.mfu.services;

import java.util.List;

import org.springframework.stereotype.Service;

import th.mfu.model.Reservation;
import th.mfu.repository.ReservationRepository;

@Service
public class ReservationService {

    private ReservationRepository repository;

    private ReservationService(ReservationRepository repository){
        this.repository = repository;
    }

    public List<Reservation> findAll(){
        return repository.findAll();
    }

    public List<Reservation> findByUserId(Integer userId){
        return repository.findByUserID(userId);
    }

    public Reservation createReservation(Reservation reservation){
        return repository.save(reservation);
    }

    public Reservation updateReservation(Reservation reservation){
        var reservationData = new Reservation();
        reservationData.setReservationID(reservation.getReservationID());
        reservationData.setLocation(reservation.getLocation());
        reservationData.setDuration(reservation.getDuration());

        return repository.save(reservationData);
    }

    public void deleteReservation(Integer userId){
        repository.deleteById(userId);
    }
}
