package sn.edu.isepdiamniadio.coursspring.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "etudiant")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_etudiant")
    private Long numeroEtudiant;

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false)
    private String nom;

    @Column
    private String adresse;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "professeur_id")
    private Long professeurId;

    //  Getters & Setters

    public Long getNumeroEtudiant() { return numeroEtudiant; }
    public void setNumeroEtudiant(Long numeroEtudiant) { this.numeroEtudiant = numeroEtudiant; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public Long getRoleId() { return roleId; }
    public void setRoleId(Long roleId) { this.roleId = roleId; }

    public Long getProfesseurId() { return professeurId; }
    public void setProfesseurId(Long professeurId) { this.professeurId = professeurId; }

    @Override
    public String toString() {
        return "je suis l'etudiant: " + numeroEtudiant
                + " repondant au nom de: " + prenom
                + " " + nom
                + " habitant: " + adresse
                + " | Professeur ID : " + professeurId
                + " | Rôle ID : " + roleId;
    }
}
