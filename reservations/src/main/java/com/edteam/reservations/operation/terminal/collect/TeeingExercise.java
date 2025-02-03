package com.edteam.reservations.operation.terminal.collect;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeeingExercise {

    public static void main(String[] args) {
        showCountReservations();
    }

    // Usar teeing para contar las reservas y obtener la fecha de creación más reciente en un Map<Integer, LocalDate>.
    private static void showCountReservations() {
        List<ReservationDTO> reservations = DataFakerUtil.generateFakeReservations();
        Map<String, Object> result = getCountReservations(reservations);

        System.out.println("Total de reservas: " + result.get("count"));
        System.out.println("Fecha de creación más reciente: " + result.get("latestDate"));
    }

    private static Map<String, Object> getCountReservations(List<ReservationDTO> reservations) {
        return reservations.stream()
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.mapping(ReservationDTO::getCreationDate,
                                Collectors.maxBy(Comparator.naturalOrder())
                        ),
                        (count, maxDateOpt) -> {
                            Map<String, Object> map = new HashMap<>();
                            map.put("count", count.intValue());
                            map.put("latestDate", maxDateOpt.orElse(null));
                            return map;
                        }
                ));
    }
}
