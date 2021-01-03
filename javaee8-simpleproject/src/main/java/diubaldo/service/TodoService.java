package diubaldo.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import diubaldo.entity.Todo;

@Transactional
public class TodoService {

	@PersistenceContext
	EntityManager entityManager;
	
	public Todo createTodo(Todo todo) {
		entityManager.persist(todo);
		return todo;
	}
	
	public Todo findToDoById(Long id) {
		return entityManager.find(Todo.class, id);
	}
	
	public List<Todo> getTodos(){
		return entityManager.createQuery("select t from Todo t", Todo.class).getResultList();
	}
}
