package com.proyectos2.Pastillero;

import javax.persistence.*;

@Entity
@Table(name="tabla_medicamento")
public class Medicamento {
    @Id
    @SequenceGenerator(name="tabla_medicamento_id_medicamento_seq",
            sequenceName="tabla_medicamento_id_medicamento_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="tabla_medicamento_id_medicamento_seq")
    @Column(updatable = false)
    private int id_medicamento;
    @Column
    private int id_usuario;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private String dias_semana;
    @Column
    private int horas_entre_toma;
    @Column
    private int pastillas_toma;
    @Column
    private int pastillas_caja;


    public Medicamento() {
    }

    public Medicamento(int id_usuario, String nombre, String descripcion, String dias_semana, int horas_entre_toma,
                       int pastillas_toma, int pastillas_caja) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dias_semana = dias_semana;
        this.horas_entre_toma = horas_entre_toma;
        this.pastillas_toma = pastillas_toma;
        this.pastillas_caja = pastillas_caja;
    }

    public int getId_medicamento() {
        return id_medicamento;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDias_semana() {
        return dias_semana;
    }

    public void setDias_semana(String dias_semana) {
        this.dias_semana = dias_semana;
    }

    public int getHoras_entre_toma() {
        return horas_entre_toma;
    }

    public void setHoras_entre_toma(int horas_entre_toma) {
        this.horas_entre_toma = horas_entre_toma;
    }

    public int getPastillas_toma() {
        return pastillas_toma;
    }

    public void setPastillas_toma(int pastillas_toma) {
        this.pastillas_toma = pastillas_toma;
    }

    public int getPastillas_caja() {
        return pastillas_caja;
    }

    public void setPastillas_caja(int pastillas_caja) {
        this.pastillas_caja = pastillas_caja;
    }
}
