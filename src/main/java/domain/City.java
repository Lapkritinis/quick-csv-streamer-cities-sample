package domain;


import uk.elementarysoftware.quickcsv.api.CSVRecordWithHeader;

public class City {

    private final String network;
    private final String geonameId;
    private final String registeredCountryGeonameId;
    private final String representedCountryGeonameId;
    private final String isAnonymousProxy;
    private final String isSatelliteProvider;
    private final String postalCode;
    private final String latitude;
    private final String longitude;
    private final String accuracyRadius;

    public City(CSVRecordWithHeader<CSVFields> r) {
        this.network = r.getField(CSVFields.network).asString();
        this.geonameId = r.getField(CSVFields.geoname_id).asString();
        this.registeredCountryGeonameId = r.getField(CSVFields.registered_country_geoname_id).asString();
        this.representedCountryGeonameId = r.getField(CSVFields.represented_country_geoname_id).asString();
        this.isAnonymousProxy = r.getField(CSVFields.is_anonymous_proxy).asString();
        this.isSatelliteProvider = r.getField(CSVFields.is_satellite_provider).asString();
        this.postalCode = r.getField(CSVFields.postal_code).asString();
        this.latitude = r.getField(CSVFields.latitude).asString();
        this.longitude = r.getField(CSVFields.longitude).asString();
        this.accuracyRadius = r.getField(CSVFields.accuracy_radius).asString();
    }

    public String getNetwork() {
        return network;
    }

    public String getGeonameId() {
        return geonameId;
    }

    public String getRegisteredCountryGeonameId() {
        return registeredCountryGeonameId;
    }

    public String getRepresentedCountryGeonameId() {
        return representedCountryGeonameId;
    }

    public String getIsAnonymousProxy() {
        return isAnonymousProxy;
    }

    public String getIsSatelliteProvider() {
        return isSatelliteProvider;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getAccuracyRadius() {
        return accuracyRadius;
    }

    @Override
    public String toString() {
        return "City{" +
                "network='" + network + '\'' +
                ", geonameId=" + geonameId +
                ", registeredCountryGeonameId=" + registeredCountryGeonameId +
                ", representedCountryGeonameId=" + representedCountryGeonameId +
                ", isAnonymousProxy='" + isAnonymousProxy + '\'' +
                ", isSatelliteProvider='" + isSatelliteProvider + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", accuracyRadius=" + accuracyRadius +
                '}';
    }

    public static enum CSVFields {
        network,
        geoname_id,
        registered_country_geoname_id,
        represented_country_geoname_id,
        is_anonymous_proxy,
        is_satellite_provider,
        postal_code,
        latitude,
        longitude,
        accuracy_radius
    }
}