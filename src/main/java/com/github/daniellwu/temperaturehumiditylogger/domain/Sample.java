package com.github.daniellwu.temperaturehumiditylogger.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@IdClass(value = Sample.SamplePK.class)
@Entity
public class Sample implements Serializable {
    @Id
    private long device;
    @Id
    private Timestamp timestamp;
    @Min(-273)
    private Double temperature; // celsius
    @Min(0)
    @Max(100)
    private Double humidity; // percentage

    public long getDevice() {
        return device;
    }

    public void setDevice(long device) {
        this.device = device;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sample)) return false;
        Sample sample = (Sample) o;
        return device == sample.device &&
                Objects.equals(timestamp, sample.timestamp) &&
                Objects.equals(temperature, sample.temperature) &&
                Objects.equals(humidity, sample.humidity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(device, timestamp, temperature, humidity);
    }

    public static class SamplePK implements Serializable {
        private long device;
        private Timestamp timestamp;

        public long getDevice() {
            return device;
        }

        public void setDevice(long device) {
            this.device = device;
        }

        public Timestamp getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Timestamp timestamp) {
            this.timestamp = timestamp;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof SamplePK)) return false;
            SamplePK samplePK = (SamplePK) o;
            return device == samplePK.device &&
                    Objects.equals(timestamp, samplePK.timestamp);
        }

        @Override
        public int hashCode() {

            return Objects.hash(device, timestamp);
        }
    }
}
