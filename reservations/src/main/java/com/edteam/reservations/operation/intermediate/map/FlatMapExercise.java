package com.edteam.reservations.operation.intermediate.map;

import com.edteam.reservations.model.ItineraryDTO;
import com.edteam.reservations.model.SegmentDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExercise {

    public static void main(String[] args) {
        showSegments();
    }

    // Obtener todos los segmentos de una lista de itinerarios
    private static void showSegments() {
        List<ItineraryDTO> fakeItineraries = DataFakerUtil.generateFakeItineraries(5);
        List<SegmentDTO> allSegments = getSegments(fakeItineraries);

        System.out.println("Los segmentos son: ");
        allSegments.forEach(segment -> System.out.println(segment.toString()));
    }

    private static List<SegmentDTO> getSegments(List<ItineraryDTO> itineraries) {
        return itineraries.stream()
                .flatMap(itinerary -> itinerary.getSegment().stream())
                .collect(Collectors.toList());
    }
}
