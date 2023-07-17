package applicazione.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import applicazione.model.User;

@Repository
public class UserRepository {
	
	private List<User> repo = new ArrayList<>();

	public User save(User user) {
		repo.add(user);
		return user;
	}

	public Optional<User> findByEmail(String email) {
		return repo.stream()
				.filter(u -> email.equalsIgnoreCase(u.getEmail()))
				.findAny();
	}

}
