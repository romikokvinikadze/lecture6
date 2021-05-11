/*
 * This file is generated by jOOQ.
 */
package ge.tsu.spring.lecture6.db.tables.records;


import ge.tsu.spring.lecture6.db.tables.Weather;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WeatherRecord extends UpdatableRecordImpl<WeatherRecord> implements Record4<Integer, String, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.weather.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.weather.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.weather.country</code>.
     */
    public void setCountry(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.weather.country</code>.
     */
    public String getCountry() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.weather.city</code>.
     */
    public void setCity(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.weather.city</code>.
     */
    public String getCity() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.weather.temperature</code>.
     */
    public void setTemperature(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.weather.temperature</code>.
     */
    public Integer getTemperature() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Weather.WEATHER.ID;
    }

    @Override
    public Field<String> field2() {
        return Weather.WEATHER.COUNTRY;
    }

    @Override
    public Field<String> field3() {
        return Weather.WEATHER.CITY;
    }

    @Override
    public Field<Integer> field4() {
        return Weather.WEATHER.TEMPERATURE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCountry();
    }

    @Override
    public String component3() {
        return getCity();
    }

    @Override
    public Integer component4() {
        return getTemperature();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCountry();
    }

    @Override
    public String value3() {
        return getCity();
    }

    @Override
    public Integer value4() {
        return getTemperature();
    }

    @Override
    public WeatherRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public WeatherRecord value2(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public WeatherRecord value3(String value) {
        setCity(value);
        return this;
    }

    @Override
    public WeatherRecord value4(Integer value) {
        setTemperature(value);
        return this;
    }

    @Override
    public WeatherRecord values(Integer value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WeatherRecord
     */
    public WeatherRecord() {
        super(Weather.WEATHER);
    }

    /**
     * Create a detached, initialised WeatherRecord
     */
    public WeatherRecord(Integer id, String country, String city, Integer temperature) {
        super(Weather.WEATHER);

        setId(id);
        setCountry(country);
        setCity(city);
        setTemperature(temperature);
    }
}