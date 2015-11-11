package entities;
// Generated 10 nov. 2015 12:53:16 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Typerayon generated by hbm2java
 */
public class Typerayon  implements java.io.Serializable {


     private Integer idTypeRayon;
     private String libelle;
     private Set videos = new HashSet(0);
     private Set diffusionses = new HashSet(0);
     private Set magasins = new HashSet(0);

    public Typerayon() {
    }

	
    public Typerayon(String libelle) {
        this.libelle = libelle;
    }
    public Typerayon(String libelle, Set videos, Set diffusionses, Set magasins) {
       this.libelle = libelle;
       this.videos = videos;
       this.diffusionses = diffusionses;
       this.magasins = magasins;
    }
   
    public Integer getIdTypeRayon() {
        return this.idTypeRayon;
    }
    
    public void setIdTypeRayon(Integer idTypeRayon) {
        this.idTypeRayon = idTypeRayon;
    }
    public String getLibelle() {
        return this.libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public Set getVideos() {
        return this.videos;
    }
    
    public void setVideos(Set videos) {
        this.videos = videos;
    }
    public Set getDiffusionses() {
        return this.diffusionses;
    }
    
    public void setDiffusionses(Set diffusionses) {
        this.diffusionses = diffusionses;
    }
    public Set getMagasins() {
        return this.magasins;
    }
    
    public void setMagasins(Set magasins) {
        this.magasins = magasins;
    }




}

