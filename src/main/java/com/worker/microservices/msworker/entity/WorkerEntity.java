package com.worker.microservices.msworker.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_worker")
public class WorkerEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private long document;

    @Column
    private String name;

    @Column
    private long phone;

    @Column
    private byte isWhatsapp;

    @Column
    private byte isTelegram;

    @Column
    private String email;

    @Column
    private String description;

    @Column
    private String address;

    @Column
    private String complement;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private long cep;

    @Column
    private String facebook;

    @Column
    private String instagram;

    @Column
    private String linkedin;

    public WorkerEntity() {
    }

    public WorkerEntity(Long id, long document, String name, long phone, byte isWhatsapp, byte isTelegram, String email,
            String description, String address, String complement, String city, String state, long cep, String facebook,
            String instagram, String linkedin) {
        this.id = id;
        this.document = document;
        this.name = name;
        this.phone = phone;
        this.isWhatsapp = isWhatsapp;
        this.isTelegram = isTelegram;
        this.email = email;
        this.description = description;
        this.address = address;
        this.complement = complement;
        this.city = city;
        this.state = state;
        this.cep = cep;
        this.facebook = facebook;
        this.instagram = instagram;
        this.linkedin = linkedin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getDocument() {
        return document;
    }

    public void setDocument(long document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public byte getIsWhatsapp() {
        return isWhatsapp;
    }

    public void setIsWhatsapp(byte isWhatsapp) {
        this.isWhatsapp = isWhatsapp;
    }

    public byte getIsTelegram() {
        return isTelegram;
    }

    public void setIsTelegram(byte isTelegram) {
        this.isTelegram = isTelegram;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (document ^ (document >>> 32));
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + (int) (phone ^ (phone >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkerEntity other = (WorkerEntity) obj;
        if (document != other.document)
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (phone != other.phone)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "WorkerEntity [address=" + address + ", cep=" + cep + ", city=" + city + ", complement=" + complement
                + ", description=" + description + ", document=" + document + ", email=" + email + ", facebook="
                + facebook + ", id=" + id + ", instagram=" + instagram + ", isTelegram=" + isTelegram + ", isWhatsapp="
                + isWhatsapp + ", linkedin=" + linkedin + ", name=" + name + ", phone=" + phone + ", state=" + state
                + "]";
    }

    
}
