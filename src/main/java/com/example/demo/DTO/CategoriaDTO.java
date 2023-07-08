package com.example.demo.DTO;

public class CategoriaDTO {
	 private Long idCategoria;
	    private String nombreCategoria;
	    private Long idGrupo;

	    public CategoriaDTO(Long idCategoria, String nombreCategoria, Long idGrupo) {
	        this.idCategoria = idCategoria;
	        this.nombreCategoria = nombreCategoria;
	        this.idGrupo = idGrupo;
	    }

		public Long getIdCategoria() {
			return idCategoria;
		}

		public void setIdCategoria(Long idCategoria) {
			this.idCategoria = idCategoria;
		}

		public String getNombreCategoria() {
			return nombreCategoria;
		}

		public void setNombreCategoria(String nombreCategoria) {
			this.nombreCategoria = nombreCategoria;
		}

		public Long getIdGrupo() {
			return idGrupo;
		}

		public void setIdGrupo(Long idGrupo) {
			this.idGrupo = idGrupo;
		}


}
