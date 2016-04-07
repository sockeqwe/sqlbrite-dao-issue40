package com.hannesdorfmann.sqlbrite_dao_issue40;

import com.hannesdorfmann.sqlbrite.objectmapper.annotation.Column;
import com.hannesdorfmann.sqlbrite.objectmapper.annotation.ObjectMappable;
import java.util.List;

@ObjectMappable
public class Location {

public static final String TABLE_NAME = "locations";
public static final String COL_ID = "_id";
public static final String COL_CITY_ID = "city_id";
public static final String COL_CITY_NAME = "city_name";
public static final String COL_AUTOLOCATED = "autolocated";
public static final String COL_LAST_ONLINE_UPDATE = "last_online_update";
public static final String COL_LATITUDE = "lat";
public static final String COL_LONGITUDE = "lon";

private long id;
private long cityId;
private String cityName;
private boolean autolocated;
private long lastOnlineUpdate;
private float latitude;
private float longitude;
private List<LocationForecast> forecasts;

public long getId() {
    return id;
}

@Column( COL_ID )
public void setId( final long id ) {
    this.id = id;
}

public long getCityId() {
    return cityId;
}

@Column( COL_CITY_ID )
public void setCityId( final long cityId ) {
    this.cityId = cityId;
}

public String getCityName() {
    return cityName;
}

@Column( COL_CITY_NAME )
public void setCityName( final String cityName ) {
    this.cityName = cityName;
}

public boolean isAutolocated() {
    return autolocated;
}

@Column( COL_AUTOLOCATED )
public void setAutolocated( final boolean autolocated ) {
    this.autolocated = autolocated;
}

public float getLatitude() {
    return latitude;
}

@Column( COL_LATITUDE )
public void setLatitude( final float latitude ) {
    this.latitude = latitude;
}

public float getLongitude() {
    return longitude;
}

@Column( COL_LONGITUDE )
public void setLongitude( final float longitude ) {
    this.longitude = longitude;
}

public long getLastOnlineUpdate() {
    return lastOnlineUpdate;
}

@Column( COL_LAST_ONLINE_UPDATE )
public void setLastOnlineUpdate( long lastOnlineUpdate ) {
    this.lastOnlineUpdate = lastOnlineUpdate;
}

public List<LocationForecast> getForecasts() {
    return forecasts;
}

public void setForecasts( List<LocationForecast> forecasts ) {
    this.forecasts = forecasts;
}
  }