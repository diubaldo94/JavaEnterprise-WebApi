package diubaldo.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import diubaldo.entity.Todo;
import diubaldo.service.TodoService;

@Path("todo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoRest {
	
	@Inject 
	TodoService todoService;
	
	@Path("new")
	@POST
	public Response createTodo(Todo todo) {
		Todo newTodo = todoService.createTodo(todo);
		return Response.ok(newTodo).build();
	}
}