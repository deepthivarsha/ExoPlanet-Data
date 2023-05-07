package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExoPlanet {

    @JsonProperty("PlanetIdentifier")
    private String planetIdentifier;
    @JsonProperty("TypeFlag")
    private long typeFlag;
    @JsonProperty("PlanetaryMassJpt")
    private String planetaryMassJpt;
    @JsonProperty("RadiusJpt")
    private Double radiusJpt;
    @JsonProperty("PeriodDays")
    private String periodDays;
    @JsonProperty("SemiMajorAxisAU")
    private String semiMajorAxisAU;
    @JsonProperty("Eccentricity")
    private String eccentricity;
    @JsonProperty("PeriastronDeg")
    private String periastronDeg;
    @JsonProperty("LongitudeDeg")
    private String longitudeDeg;
    @JsonProperty("AscendingNodeDeg")
    private String ascendingNodeDeg;
    @JsonProperty("InclinationDeg")
    private String inclinationDeg;
    @JsonProperty("SurfaceTempK")
    private String surfaceTempK;
    @JsonProperty("AgeGyr")
    private String ageGyr;
    @JsonProperty("DiscoveryMethod")
    private String discoveryMethod;
    @JsonProperty("DiscoveryYear")
    private String discoveryYear;
    @JsonProperty("LastUpdated")
    private String lastUpdated;
    @JsonProperty("RightAscension")
    private String rightAscension;
    @JsonProperty("Declination")
    private String declination;
    @JsonProperty("DistFromSunParsec")
    private String distFromSunParsec;
    @JsonProperty("HostStarMassSlrMass")
    private String hostStarMassSlrMass;
    @JsonProperty("HostStarRadiusSlrRad")
    private String hostStarRadiusSlrRad;
    @JsonProperty("HostStarMetallicity")
    private String hostStarMetallicity;
    @JsonProperty("HostStarTempK")
    private Double hostStarTempK;
    @JsonProperty("HostStarAgeGyr")
    private String hostStarAgeGyr;

    public String getPlanetIdentifier() {
        return planetIdentifier;
    }

    public void setPlanetIdentifier(String planetIdentifier) {
        this.planetIdentifier = planetIdentifier;
    }

    public long getTypeFlag() {
        return typeFlag;
    }

    public void setTypeFlag(long typeFlag) {
        this.typeFlag = typeFlag;
    }

    public String getPlanetaryMassJpt() {
        return planetaryMassJpt;
    }

    public void setPlanetaryMassJpt(String planetaryMassJpt) {
        this.planetaryMassJpt = planetaryMassJpt;
    }

    public Double getRadiusJpt() {
        return radiusJpt;
    }

    public void setRadiusJpt(Double radiusJpt) {
        this.radiusJpt = radiusJpt;
    }

    public String getPeriodDays() {
        return periodDays;
    }

    public void setPeriodDays(String periodDays) {
        this.periodDays = periodDays;
    }

    public String getSemiMajorAxisAU() {
        return semiMajorAxisAU;
    }

    public void setSemiMajorAxisAU(String semiMajorAxisAU) {
        this.semiMajorAxisAU = semiMajorAxisAU;
    }

    public String getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(String eccentricity) {
        this.eccentricity = eccentricity;
    }

    public String getPeriastronDeg() {
        return periastronDeg;
    }

    public void setPeriastronDeg(String periastronDeg) {
        this.periastronDeg = periastronDeg;
    }

    public String getLongitudeDeg() {
        return longitudeDeg;
    }

    public void setLongitudeDeg(String longitudeDeg) {
        this.longitudeDeg = longitudeDeg;
    }

    public String getAscendingNodeDeg() {
        return ascendingNodeDeg;
    }

    public void setAscendingNodeDeg(String ascendingNodeDeg) {
        this.ascendingNodeDeg = ascendingNodeDeg;
    }

    public String getInclinationDeg() {
        return inclinationDeg;
    }

    public void setInclinationDeg(String inclinationDeg) {
        this.inclinationDeg = inclinationDeg;
    }

    public String getSurfaceTempK() {
        return surfaceTempK;
    }

    public void setSurfaceTempK(String surfaceTempK) {
        this.surfaceTempK = surfaceTempK;
    }

    public String getAgeGyr() {
        return ageGyr;
    }

    public void setAgeGyr(String ageGyr) {
        this.ageGyr = ageGyr;
    }

    public String getDiscoveryMethod() {
        return discoveryMethod;
    }

    public void setDiscoveryMethod(String discoveryMethod) {
        this.discoveryMethod = discoveryMethod;
    }

    public String getDiscoveryYear() {
        return discoveryYear;
    }

    public void setDiscoveryYear(String discoveryYear) {
        this.discoveryYear = discoveryYear;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getRightAscension() {
        return rightAscension;
    }

    public void setRightAscension(String rightAscension) {
        this.rightAscension = rightAscension;
    }

    public String getDeclination() {
        return declination;
    }

    public void setDeclination(String declination) {
        this.declination = declination;
    }

    public String getDistFromSunParsec() {
        return distFromSunParsec;
    }

    public void setDistFromSunParsec(String distFromSunParsec) {
        this.distFromSunParsec = distFromSunParsec;
    }

    public String getHostStarMassSlrMass() {
        return hostStarMassSlrMass;
    }

    public void setHostStarMassSlrMass(String hostStarMassSlrMass) {
        this.hostStarMassSlrMass = hostStarMassSlrMass;
    }

    public String getHostStarRadiusSlrRad() {
        return hostStarRadiusSlrRad;
    }

    public void setHostStarRadiusSlrRad(String hostStarRadiusSlrRad) {
        this.hostStarRadiusSlrRad = hostStarRadiusSlrRad;
    }

    public String getHostStarMetallicity() {
        return hostStarMetallicity;
    }

    public void setHostStarMetallicity(String hostStarMetallicity) {
        this.hostStarMetallicity = hostStarMetallicity;
    }

    public Double getHostStarTempK() {

        return hostStarTempK;
    }

    public void setHostStarTempK(Double hostStarTempK) {
        this.hostStarTempK = hostStarTempK;
    }

    public String getHostStarAgeGyr() {
        return hostStarAgeGyr;
    }

    public void setHostStarAgeGyr(String hostStarAgeGyr) {
        this.hostStarAgeGyr = hostStarAgeGyr;
    }
}
