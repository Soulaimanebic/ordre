package ma.mission.ordre;

import java.util.Date;

public class Form {

    private long id;
    private String fait;

    public Form() {
        this.id = id;
        this.fait = fait;
        this.datecre = datecre;
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.chantier_destination = chantier_destination;
        this.affect_analytique = affect_analytique;
        this.date_deb = date_deb;
        this.date_fin = date_fin;
        this.duree = duree;
        this.la_mission_suivante = la_mission_suivante;
        this.mr_1 = mr_1;
        this.fonction1 = fonction1;
        this.mr_2 = mr_2;
        this.fonction2 = fonction2;
        this.véhicule_de_létablissement = véhicule_de_létablissement;
        this.vehicule_personnel = vehicule_personnel;
        this.véhicule_personnel_de_mr = véhicule_personnel_de_mr;
        this.transport_en_commun = transport_en_commun;
        this.autre = autre;
    }

    private Date datecre;
    private String nom;
    private String prenom;
    private String fonction;
    private String chantier_destination;
    private String affect_analytique;
    private Date date_deb;
    private Date date_fin;
    private long duree;
    private String la_mission_suivante;
    private String mr_1;
    private String fonction1;
    private String mr_2;
    private String fonction2;
    private Boolean véhicule_de_létablissement;
    private Boolean vehicule_personnel;
    private String véhicule_personnel_de_mr;
    private String transport_en_commun;
    private String autre;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFait() {
        return fait;
    }

    public void setFait(String fait) {
        this.fait = fait;
    }

    public Date getDatecre() {
        return datecre;
    }

    public void setDatecre(Date datecre) {
        this.datecre = datecre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getChantier_destination() {
        return chantier_destination;
    }

    public void setChantier_destination(String chantier_destination) {
        this.chantier_destination = chantier_destination;
    }

    public String getAffect_analytique() {
        return affect_analytique;
    }

    public void setAffect_analytique(String affect_analytique) {
        this.affect_analytique = affect_analytique;
    }

    public Date getDate_deb() {
        return date_deb;
    }

    public void setDate_deb(Date date_deb) {
        this.date_deb = date_deb;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public long getDuree() {
        return duree;
    }

    public void setDuree(long duree) {
        this.duree = duree;
    }

    public String getLa_mission_suivante() {
        return la_mission_suivante;
    }

    public void setLa_mission_suivante(String la_mission_suivante) {
        this.la_mission_suivante = la_mission_suivante;
    }

    public String getMr_1() {
        return mr_1;
    }

    public void setMr_1(String mr_1) {
        this.mr_1 = mr_1;
    }

    public String getFonction1() {
        return fonction1;
    }

    public void setFonction1(String fonction1) {
        this.fonction1 = fonction1;
    }

    public String getMr_2() {
        return mr_2;
    }

    public void setMr_2(String mr_2) {
        this.mr_2 = mr_2;
    }

    public String getFonction2() {
        return fonction2;
    }

    public void setFonction2(String fonction2) {
        this.fonction2 = fonction2;
    }

    public Boolean getVéhicule_de_létablissement() {
        return véhicule_de_létablissement;
    }

    public void setVéhicule_de_létablissement(Boolean véhicule_de_létablissement) {
        this.véhicule_de_létablissement = véhicule_de_létablissement;
    }

    public Boolean getVehicule_personnel() {
        return vehicule_personnel;
    }

    public void setVehicule_personnel(Boolean vehicule_personnel) {
        this.vehicule_personnel = vehicule_personnel;
    }

    public String getVéhicule_personnel_de_mr() {
        return véhicule_personnel_de_mr;
    }

    public void setVéhicule_personnel_de_mr(String véhicule_personnel_de_mr) {
        this.véhicule_personnel_de_mr = véhicule_personnel_de_mr;
    }

    public String getTransport_en_commun() {
        return transport_en_commun;
    }

    public void setTransport_en_commun(String transport_en_commun) {
        this.transport_en_commun = transport_en_commun;
    }

    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", fait='" + fait + '\'' +
                ", datecre=" + datecre +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", fonction='" + fonction + '\'' +
                ", chantier_destination='" + chantier_destination + '\'' +
                ", affect_analytique='" + affect_analytique + '\'' +
                ", date_deb=" + date_deb +
                ", date_fin=" + date_fin +
                ", duree=" + duree +
                ", la_mission_suivante='" + la_mission_suivante + '\'' +
                ", mr_1='" + mr_1 + '\'' +
                ", fonction1='" + fonction1 + '\'' +
                ", mr_2='" + mr_2 + '\'' +
                ", fonction2='" + fonction2 + '\'' +
                ", véhicule_de_létablissement=" + véhicule_de_létablissement +
                ", vehicule_personnel=" + vehicule_personnel +
                ", véhicule_personnel_de_mr='" + véhicule_personnel_de_mr + '\'' +
                ", transport_en_commun='" + transport_en_commun + '\'' +
                ", autre='" + autre + '\'' +
                '}';
    }
}
