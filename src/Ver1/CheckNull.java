package Ver1;

import entity.ObservationFilter;
import entity.Windown.Endpoint;
import entity.Windown;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class CheckNull {
    public static void main(String[] args) {
        ObservationFilter filter = new ObservationFilter();
        filter.postDays = 10;
        filter.priorDays = 5;

        Windown window = new Windown();
        window.start = new Windown.Endpoint();
        window.end = new Windown.Endpoint();
        window.start.days = 0;
        window.start.timeUnit = "second";
        window.start.timeUnitValue = 30;
        window.start.coeff = -1;

        window.end.days = 0;
        window.end.timeUnit = "second";
        window.end.timeUnitValue = 75;
        window.end.coeff = 1;

        System.out.println(compareTo(filter, window));
        
    }
    public static int compareTo(ObservationFilter filter, Windown window) {
        int range1 , range2Start , range2End;
        if(Objects.nonNull(window.start) && (Objects.nonNull(window.start.days)) && window.start.days != 0){
            range1 = filter.postDays + filter.priorDays;
            range2Start = window.start.coeff * window.start.days;
            range2End = Objects.nonNull(window.end) && Objects.nonNull(window.end.days) ? window.end.coeff * window.end.days : 0;
        }else {
            range1 = (filter.postDays + filter.priorDays) * 24 * 60 * 60;
            range2Start = getTimeInSeconds(window.start);
            range2End = getTimeInSeconds(window.end);
        }
        return range1 - (range2End - range2Start);
    }
    private static int getTimeInSeconds(Windown.Endpoint endpoint) {
//        return Optional.ofNullable(endpoint)
//                .map(ep -> {
//                    int convertRate = TIME_UNIT_CONVERSION.getOrDefault(ep.timeUnit, 1);
//                    return Objects.nonNull(ep.timeUnitValue) ? ep.coeff * ep.timeUnitValue * convertRate : 0;
//                }).orElse(0);
        int convertRate;
        if (endpoint.timeUnit.equals("day")) {
            convertRate = 24 * 60 * 60;
        } else if (endpoint.timeUnit.equals("hour")) {
            convertRate = 60 * 60;
        } else if (endpoint.timeUnit.equals("minute")) {
            convertRate = 60;
        } else convertRate = 1;
        return Objects.nonNull(endpoint.timeUnitValue)
                ? endpoint.coeff * endpoint.timeUnitValue * convertRate
                : 0;
    }
    private static final Map<String, Integer> TIME_UNIT_CONVERSION = new HashMap<>();
    static {
        TIME_UNIT_CONVERSION.put("hour", 60 * 60);
        TIME_UNIT_CONVERSION.put("minute", 60);
    }
}
