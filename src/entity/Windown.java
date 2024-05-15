package entity;

public class Windown {
    public static class Endpoint {
        public Integer days;

        public int coeff;
        public Integer timeUnitValue;

        public String  timeUnit = "day";

        public Integer getDays() {
            return days;
        }

        public void setDays(Integer days) {
            this.days = days;
        }

        public int getCoeff() {
            return coeff;
        }

        public void setCoeff(int coeff) {
            this.coeff = coeff;
        }

        public Integer getTimeUnitValue() {
            return timeUnitValue;
        }

        public void setTimeUnitValue(Integer timeUnitValue) {
            this.timeUnitValue = timeUnitValue;
        }

        public String getTimeUnit() {
            return timeUnit;
        }

        public void setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
        }

        public Endpoint(Integer days, int coeff, Integer timeUnitValue, String timeUnit) {
            this.days = days;
            this.coeff = coeff;
            this.timeUnitValue = timeUnitValue;
            this.timeUnit = timeUnit;
        }

        public Endpoint() {
        }
    }

    public Endpoint start;

    public Endpoint end;

    public Boolean useIndexEnd;

    public Windown(Endpoint start, Endpoint end, Boolean useIndexEnd, Boolean useEventEnd) {
        this.start = start;
        this.end = end;
        this.useIndexEnd = useIndexEnd;
        this.useEventEnd = useEventEnd;
    }

    public Boolean useEventEnd;

    public Windown() {
    }

    public Endpoint getStart() {
        return start;
    }

    public void setStart(Endpoint start) {
        this.start = start;
    }

    public Endpoint getEnd() {
        return end;
    }

    public void setEnd(Endpoint end) {
        this.end = end;
    }

    public Boolean getUseIndexEnd() {
        return useIndexEnd;
    }

    public void setUseIndexEnd(Boolean useIndexEnd) {
        this.useIndexEnd = useIndexEnd;
    }

    public Boolean getUseEventEnd() {
        return useEventEnd;
    }

    public void setUseEventEnd(Boolean useEventEnd) {
        this.useEventEnd = useEventEnd;
    }
}
