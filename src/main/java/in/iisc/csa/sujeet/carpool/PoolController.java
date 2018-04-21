package in.iisc.csa.sujeet.carpool;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class PoolController {
	RedisClient redis = new RedisClient();

	@RequestMapping(value = "/api/add-to-pool", method = RequestMethod.POST)
	public ResponseEntity<Pool> createPoolRequest(@RequestBody Pool pool, UriComponentsBuilder ucBuilder) {
		System.out.printf("Creating Pool : " + pool);
		String key = pool.destination + "-" + pool.origin;
		redis.push(key, pool);
		return new ResponseEntity<Pool>(pool, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/api/query-pool", method = RequestMethod.POST)
	public ResponseEntity<String> queryPoolRequest(@RequestBody Pool pool, UriComponentsBuilder ucBuilder) {
		System.out.printf("Requesting Pool : " + pool);
		String key = pool.destination + "-" + pool.origin;
		String retPool = redis.query(key);

		return new ResponseEntity<String>(retPool, HttpStatus.CREATED);
	}

}