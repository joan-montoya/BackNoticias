package com.example.demo.DTO;

public class MiembroDTO {
    private Long idMiembro;
    private Long idUsuario;
    private Long idGrupo;

    public MiembroDTO(Long idMiembro, Long idUsuario, Long idGrupo) {
        this.idMiembro = idMiembro;
        this.idUsuario = idUsuario;
        this.idGrupo = idGrupo;
    }

	public Long getIdMiembro() {
		return idMiembro;
	}

	public void setIdMiembro(Long idMiembro) {
		this.idMiembro = idMiembro;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

    
}
