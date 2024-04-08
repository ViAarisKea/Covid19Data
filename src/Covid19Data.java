public class Covid19Data {

    private String region;
    private String aldergruppe;
    private int bekræftedeTilfældeIAlt;
    private int døde;
    private int indlagtePеrIntensivAfdeling;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldergruppe, int bekræftedeTilfældeIAlt, int døde, int indlagtePеrIntensivAfdeling, int indlagte, String dato) {
        this.region = region;
        this.aldergruppe = aldergruppe;
        this.bekræftedeTilfældeIAlt = bekræftedeTilfældeIAlt;
        this.døde = døde;
        this.indlagtePеrIntensivAfdeling = indlagtePеrIntensivAfdeling;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    public Covid19Data() {
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "region='" + region + '\'' +
                ", aldergruppe='" + aldergruppe + '\'' +
                ", bekræftedeTilfældeIAlt=" + bekræftedeTilfældeIAlt +
                ", døde=" + døde +
                ", indlagtePеrIntensivAfdeling=" + indlagtePеrIntensivAfdeling +
                ", indlagte=" + indlagte +
                ", dato='" + dato + '\'' +
                '}';
    }

    public String getRegion() {
        return region;
    }

    public String getAldergruppe() {
        return aldergruppe;
    }
}
