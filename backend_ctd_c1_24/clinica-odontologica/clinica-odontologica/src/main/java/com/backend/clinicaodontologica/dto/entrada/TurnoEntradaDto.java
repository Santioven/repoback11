package com.backend.clinicaodontologica.dto.entrada;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.Valid;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class TurnoEntradaDto {

    @NotNull(message = "El Odontologo no puede ser nulo")
    @Valid
    private OdontologoEntradaDto odontologoEntradaDto;

    @NotNull(message = "El Paciente no puede ser nulo")
    @Valid
    private PacienteEntradaDto pacienteEntradaDto;

    @FutureOrPresent(message = "La fecha no puede ser anterior al dia de hoy")
    @NotNull (message = "La fecha no puede ser nula")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime fechaYHora;

    public TurnoEntradaDto(){

    }

    public TurnoEntradaDto(OdontologoEntradaDto odontologoEntradaDto, PacienteEntradaDto pacienteEntradaDto, LocalDateTime fechaYHora) {
        this.odontologoEntradaDto = odontologoEntradaDto;
        this.pacienteEntradaDto = pacienteEntradaDto;
        this.fechaYHora = fechaYHora;
    }

    public OdontologoEntradaDto getOdontologoEntradaDto() {
        return odontologoEntradaDto;
    }

    public void setOdontologoEntradaDto(OdontologoEntradaDto odontologoEntradaDto) {
        this.odontologoEntradaDto = odontologoEntradaDto;
    }

    public PacienteEntradaDto getPacienteEntradaDto() {
        return pacienteEntradaDto;
    }

    public void setPacienteEntradaDto(PacienteEntradaDto pacienteEntradaDto) {
        this.pacienteEntradaDto = pacienteEntradaDto;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
}
