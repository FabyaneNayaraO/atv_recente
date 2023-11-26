tarefaController.java

@RestController
@RequestMapping("/api/tarefas")
public class tarefaController {

    @Autowired
    private tarefaService service;

    // Get all tarefas.
    @GetMapping(produces = {"application/json", "application/xml"})
    public Collection<tarefa> getItarefas() {
        return service.gettarefas();
    }

    // Get a specific tarefa.
    @GetMapping(value = "/{id}", produces = {"application/json", "application/xml"})
    public tarefa getItem(@PathVariable int id)