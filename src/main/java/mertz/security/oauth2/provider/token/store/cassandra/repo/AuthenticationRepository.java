package mertz.security.oauth2.provider.token.store.cassandra.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mertz.security.oauth2.provider.token.store.cassandra.model.Authentication;

@Repository
public interface AuthenticationRepository extends CrudRepository<Authentication, String> {

}
