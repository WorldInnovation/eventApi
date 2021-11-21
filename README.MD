#   <h2>  This is a simple api example <h6>

example add:
POST http://localhost:8080/v1/events/item
Content-Type : application/json
{"type":"startEvent","workflowParameters":{"workflowName":"start.v1","payload":{"customerId":"customerId","foo":"foo"}}}

All fields in one object:
{"type":"startEven", "workflowName":"workflowName1", "customerId":"customerId1", "foo":"foo1" }

