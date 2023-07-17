package applicazione.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import applicazione.model.Token;

@Repository
public class TokenRepository {

	public List<Token> findAllValidTokenByUser(Integer id) {
		return new ArrayList<>();
	}

	public Optional<Token> findByToken(String token) {
		return Optional.of(new Token());
	}

	public Token save(Token token) {
		return new Token();
	}

	public void saveAll(List<Token> validUserTokens) {
		
	}
}
