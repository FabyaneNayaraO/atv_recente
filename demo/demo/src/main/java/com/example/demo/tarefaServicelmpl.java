tarefaServicelmpl.java

@Service
public class tarefaServicelmpl implements tarefaService {

    private static Map<Integer, tarefa> tarefas = new HashMap<>();
    private int nextId = 1;

    // Populate collection with some simple Items, to get the ball rolling.
    {
        insert(new tarefa("tarefa de mobile", true));
        insert(new tarefa("atividade de matematica", true));
        insert(new tarefa("atividade de português", false));
        insert(new tarefa("atividade de lógica", true)

        