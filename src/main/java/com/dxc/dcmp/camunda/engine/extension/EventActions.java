package com.dxc.dcmp.camunda.engine.extension;

public class EventActions
{
}
/*@RestController
public class TaskFields {
    private final static Logger logger = LoggerFactory.getLogger(TaskFields.class);

    @Autowired
    private ProcessEngine processEngine;

    @ResponseBody
    @SuppressWarnings("unchecked")
    @GetMapping("/engine-rest-ext/task/{id}/fields")
    public List<Map<String, Object>> getTaskProps(@PathVariable(required = false) String id) {
        TaskService taskService = processEngine.getTaskService();
        Task task = taskService.createTaskQuery().taskId(id).initializeFormKeys().singleResult();
        TaskFormHandler formHandler = ((TaskEntity) task).getTaskDefinition().getTaskFormHandler();
        if (formHandler instanceof DelegateFormHandler) {
            DelegateFormHandler delegateFormHandler = (DelegateFormHandler) formHandler;
            if (delegateFormHandler.getFormHandler() instanceof DefaultFormHandler) {
                DefaultFormHandler defaultFormHandler = (DefaultFormHandler) delegateFormHandler.getFormHandler();
                try {
                    List<Map<String, Object>> fields = new ArrayList<>();
                    Field field = DefaultFormHandler.class.getDeclaredField("formFieldHandlers");
                    field.setAccessible(true);
                    List<FormFieldHandler> o = (List<FormFieldHandler>) field.get(defaultFormHandler);
                    o.forEach(f -> {
                        Map<String, Object> entry = new HashMap<>();
                        entry.put("name", f.getId());
                        entry.put("label", f.getLabel().getExpressionText());
                        entry.put("type", f.getType().getName());
                        entry.put("properties", f.getProperties());
                        fields.add(entry);
                    });
                    return fields;
                } catch (Exception ex) {
                    logger.error("getTaskProps failed for task " + id, ex);
                }
            }
        }

        return Collections.emptyList();
    }
}
*/
