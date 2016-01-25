//package org.test.skeleton.core.auth;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//
//
//@Configuration
//@EnableResourceServer
//public class ResourceServer extends ResourceServerConfigurerAdapter {
//
//		@Override
//       public void configure(HttpSecurity http) throws Exception {
//			// Just for laughs, apply OAuth protection to only 2 resources
//           http
//               .requestMatchers().antMatchers("/","/admin/beans")
//               .and()
//               .authorizeRequests().anyRequest().access("#oauth2.hasScope('read')");
//       }
//
//       @Override
//       public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//           resources.resourceId("sparklr");
//       }
//}
