package com.i3tv.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private Map<Integer, User> users = new HashMap<Integer, User>();

	/**
	 * Crea un usuario
	 * @param user
	 */
	public void create(User user) {
		users.put(user.getId(), user);
	}

	/**
	 * Recupera un usuario por id
	 * @param id
	 * @return
	 */
	public User read(Integer id) {
		validate(id);
		return users.get(id);
	}

	/**
	 * Actualiza un usuario
	 * @param user
	 */
	public void update(User user) {
		validate(user.getId());
		users.put(user.getId(), user);
	}

	/**
	 * Elimina un usuario
	 * @param userId
	 */
	public void delete(Integer id) {
		validate(id);
		users.remove(id);
	}

	/**
	 * Valida existencia de un usuario
	 * @param id
	 */
	private void validate(Integer id) {
		if (!users.containsKey(id)) {
			throw new UserNotFounException("No se ha encontrado el usuario");
		}
	}
}
