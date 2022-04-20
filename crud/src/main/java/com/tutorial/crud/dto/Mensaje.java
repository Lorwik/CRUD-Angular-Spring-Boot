package com.tutorial.crud.dto;

public class Mensaje {
    private String mensasje;

    public Mensaje(String mensasje) {
        this.mensasje = mensasje;
    }

    public String getMensasje() {
        return mensasje;
    }

    public void setMensasje(String mensasje) {
        this.mensasje = mensasje;
    }
}
