package entities;
// Generated 10 nov. 2015 12:53:16 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Video generated by hbm2java
 */
public class Video  implements java.io.Serializable {


     private Integer idVideo;
     private Client client;
     private Compte compte;
     private String titre;
     private int frequence;
     private int duree;
     private Date dateDebut;
     private Date dateFin;
     private Date dateReception;
     private Date dateValidation;
     private double tarif;
     private int statut;
     private Set diffusionses = new HashSet(0);
     private Set regions = new HashSet(0);
     private Set typerayons = new HashSet(0);

    public Video() {
    }

	
    public Video(Client client, Compte compte, String titre, int frequence, int duree, Date dateDebut, Date dateFin, Date dateReception, Date dateValidation, double tarif, int statut) {
        this.client = client;
        this.compte = compte;
        this.titre = titre;
        this.frequence = frequence;
        this.duree = duree;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.dateReception = dateReception;
        this.dateValidation = dateValidation;
        this.tarif = tarif;
        this.statut = statut;
    }
    public Video(Client client, Compte compte, String titre, int frequence, int duree, Date dateDebut, Date dateFin, Date dateReception, Date dateValidation, double tarif, int statut, Set diffusionses, Set regions, Set typerayons) {
       this.client = client;
       this.compte = compte;
       this.titre = titre;
       this.frequence = frequence;
       this.duree = duree;
       this.dateDebut = dateDebut;
       this.dateFin = dateFin;
       this.dateReception = dateReception;
       this.dateValidation = dateValidation;
       this.tarif = tarif;
       this.statut = statut;
       this.diffusionses = diffusionses;
       this.regions = regions;
       this.typerayons = typerayons;
    }
   
    public Integer getIdVideo() {
        return this.idVideo;
    }
    
    public void setIdVideo(Integer idVideo) {
        this.idVideo = idVideo;
    }
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    public Compte getCompte() {
        return this.compte;
    }
    
    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    public String getTitre() {
        return this.titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public int getFrequence() {
        return this.frequence;
    }
    
    public void setFrequence(int frequence) {
        this.frequence = frequence;
    }
    public int getDuree() {
        return this.duree;
    }
    
    public void setDuree(int duree) {
        this.duree = duree;
    }
    public Date getDateDebut() {
        return this.dateDebut;
    }
    
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    public Date getDateFin() {
        return this.dateFin;
    }
    
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
    public Date getDateReception() {
        return this.dateReception;
    }
    
    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }
    public Date getDateValidation() {
        return this.dateValidation;
    }
    
    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }
    public double getTarif() {
        return this.tarif;
    }
    
    public void setTarif(double tarif) {
        this.tarif = tarif;
    }
    public int getStatut() {
        return this.statut;
    }
    
    public void setStatut(int statut) {
        this.statut = statut;
    }
    public Set getDiffusionses() {
        return this.diffusionses;
    }
    
    public void setDiffusionses(Set diffusionses) {
        this.diffusionses = diffusionses;
    }
    public Set getRegions() {
        return this.regions;
    }
    
    public void setRegions(Set regions) {
        this.regions = regions;
    }
    public Set getTyperayons() {
        return this.typerayons;
    }
    
    public void setTyperayons(Set typerayons) {
        this.typerayons = typerayons;
    }




}


