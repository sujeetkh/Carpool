package in.iisc.csa.sujeet.carpool;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisClient {
	Jedis jedis;

	public RedisClient() {
		super();
		this.jedis = new Jedis("localhost");
		;
	}

	public void push(String key, Pool pool) {
		// TODO Auto-generated method stub
		jedis.lpush(key, pool.toString());
	}

	public String query(String key) {
		// TODO Auto-generated method stub
		List<String> list = jedis.lrange(key, 0, 5);
		return list.toString();
	}

}
