// CODE FROM HERE: https://www.thymeleaf.org/doc/articles/springmail.html


// import org.springframework.context.ApplicationContextAware;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// @PropertySource("classpath:mail/emailconfig.properties")
// public class SpringMailConfig implements ApplicationContextAware, EnvironmentAware {

//     private static final String JAVA_MAIL_FILE = "classpath:mail/javamail.properties";

//     private ApplicationContext applicationContext;
//     private Environment environment;

//     ...

//     @Bean
//     public JavaMailSender mailSender() throws IOException {

//         final JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

//         // Basic mail sender configuration, based on emailconfig.properties
//         mailSender.setHost(this.environment.getProperty(HOST));
//         mailSender.setPort(Integer.parseInt(this.environment.getProperty(PORT)));
//         mailSender.setProtocol(this.environment.getProperty(PROTOCOL));
//         mailSender.setUsername(this.environment.getProperty(USERNAME));
//         mailSender.setPassword(this.environment.getProperty(PASSWORD));

//         // JavaMail-specific mail sender configuration, based on javamail.properties
//         final Properties javaMailProperties = new Properties();
//         javaMailProperties.load(this.applicationContext.getResource(JAVA_MAIL_FILE).getInputStream());
//         mailSender.setJavaMailProperties(javaMailProperties);

//         return mailSender;

//     }

//     ...

// }