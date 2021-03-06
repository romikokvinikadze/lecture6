/*
 * This file is generated by jOOQ.
 */
package ge.tsu.spring.lecture6.db.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Weather implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String  country;
    private String  city;
    private Integer temperature;

    public Weather() {}

    public Weather(Weather value) {
        this.id = value.id;
        this.country = value.country;
        this.city = value.city;
        this.temperature = value.temperature;
    }

    public Weather(
        Integer id,
        String  country,
        String  city,
        Integer temperature
    ) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.temperature = temperature;
    }

    /**
     * Getter for <code>public.weather.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.weather.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.weather.country</code>.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for <code>public.weather.country</code>.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for <code>public.weather.city</code>.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for <code>public.weather.city</code>.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for <code>public.weather.temperature</code>.
     */
    public Integer getTemperature() {
        return this.temperature;
    }

    /**
     * Setter for <code>public.weather.temperature</code>.
     */
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Weather (");

        sb.append(id);
        sb.append(", ").append(country);
        sb.append(", ").append(city);
        sb.append(", ").append(temperature);

        sb.append(")");
        return sb.toString();
    }
}
