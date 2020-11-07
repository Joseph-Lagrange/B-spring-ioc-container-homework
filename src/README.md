1.@Component使用类路径扫描自动检测和配置Bean，而@Bean显式声明一个Bean，而不是让Spring自动执行。

2.@Component没有将bean的声明与类定义分离，而@bean将bean的声明与类定义分离。

3.@Component是一个类级别的注解，而@Bean是一个方法级的注解，方法的名称作为Bean的名称。

4.@Component不需要与@Configuration注解一起使用，其中@Bean注解必须在用@Configuration注解的类中使用。

5.如果类在spring容器之外，我们不能使用@Component创建类的bean，而可以使用@bean创建类的bean，即使类出现在spring容器之外。

6.@Component有不同的专门化，比如@Controller、@Repository和@Service，而@Bean没有专门化。

7.在@Component注解的类中不能定义类内依赖，@Bean注解及@Configuration注解的搭配则可以。