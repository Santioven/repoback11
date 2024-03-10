package com.backend.clinicaodontologica.dto.salida;

import com.backend.clinicaodontologica.dto.entrada.OdontologoEntradaDto;

import java.time.LocalDateTime;

public class TurnoSalidaDto {

    private int id;
    private PacienteSalidaDto pacienteSalidaDto;
    private OdontologoSalidaDto odontologoSalidaDto;
    private LocalDateTime fechaYHora;

    public TurnoSalidaDto() {
    }

    public TurnoSalidaDto(int id, PacienteSalidaDto pacienteSalidaDto, OdontologoSalidaDto odontologoSalidaDto, LocalDateTime fechaYHora) {
        this.id = id;
        this.pacienteSalidaDto = pacienteSalidaDto;
        this.odontologoSalidaDto = odontologoSalidaDto;
        this.fechaYHora = fechaYHora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PacienteSalidaDto getPacienteSalidaDto() {
        return pacienteSalidaDto;
    }

    public void setPacienteSalidaDto(PacienteSalidaDto pacienteSalidaDto) {
        this.pacienteSalidaDto = pacienteSalidaDto;
    }

    public OdontologoSalidaDto getOdontologoSalidaDto() {
        return odontologoSalidaDto;
    }

    public void setOdontologoSalidaDto(OdontologoSalidaDto odontologoSalidaDto) {
        this.odontologoSalidaDto = odontologoSalidaDto;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
}
