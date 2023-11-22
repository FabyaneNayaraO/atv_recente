
public class Tarefa {

	private int id;
	private String descricao;
	private boolean feita;

	public CatalogItem() {
	}

	public Tarefa(String descricao, boolean feita) {
		this.descricao = descricao;
		this.feita = feita;
	}

	public void Update(Tarefa) {
		if (Tarefa != null) {
			this.descricao  = descricao;
			this.feita = false;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFeita() {
		return feita;
	}

	public void setFeita(boolean feita) {
		this.feita = feita;
	}

	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", descricao=" + descricao + ", feita=" + feita + "]";
	}
}
