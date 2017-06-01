package com.microservice.base.client;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.base.config.FeignConfiguration;
import com.microservice.base.entity.ComplexBean1;
import com.microservice.base.entity.ComplexBean2;
import com.microservice.base.entity.Role;
import com.microservice.base.entity.User;

import feign.RequestLine;

@FeignClient(name="microservice-provider-user2", configuration=FeignConfiguration.class)
public interface UserFeignClient2 {
	@RequestLine("GET /user/{id}")
	public User getUser(@PathVariable("id") Long id);

	@RequestLine("POST /user/post-add")
	public User addUser(User user);
	/**
	 * 这种方法，通过浏览器可以调用，但是通过RestTemplate和FeignClient都调用不到
	 * 
	 * @param user
	 * @return
	 */
	@RequestLine("GET /user/get-add")
	public User addUser2(User user);

	@RequestLine("GET /role/{id}")
	public Role getRole(@PathVariable("id") Long id);

	@RequestLine("POST /role/post-add")
	public Role addRole(  Role role);

	@RequestLine("GET /complex1/{id}")
	public ComplexBean1 testComplexBean1(@PathVariable("id") Long id);

	@RequestLine("POST /complex1/post-add")
	public ComplexBean1 postAddComplexBean1(  ComplexBean1 bean);

	@RequestLine("GET /complex1/get-add")
	public ComplexBean1 getAddTestComplexBean1(ComplexBean1 bean) ;

	@RequestLine("GET /complex2/{id}")
	public ComplexBean2 getComplexBean2(@PathVariable("id") Long id);
	@RequestLine("POST /complex2/post-add")
	public ComplexBean2 postAddComplexBean2(  ComplexBean2 bean);
	@RequestLine("GET /complex2/get-add")
	public ComplexBean2 getAddTestComplexBean2(ComplexBean2 bean);
	/**
	 * 用于测试数据参数的传入和传出
	 * 
	 * @param ulist
	 * @return
	 */
	@RequestLine("POST /user-list")
	public List<User> testList(  List<User> ulist);
	@RequestLine("POST /user-map")
	public Map<Long, User> testMap(  Map<Long, User> umap);

	@RequestLine("POST /user-set")
	public Set<User> testSet(  Set<User> uset);

	@RequestLine("GET /test-hystrix/{arg}")
	public String testHystrix(@PathVariable("arg") String arg);
}
