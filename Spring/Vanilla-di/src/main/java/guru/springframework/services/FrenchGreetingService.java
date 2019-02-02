package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("fr")
@Primary
public class FrenchGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "bonjour madame!!";
	}

}
