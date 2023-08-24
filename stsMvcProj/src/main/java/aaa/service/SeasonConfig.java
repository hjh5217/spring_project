package aaa.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import aaa.model.Season;

@Configuration
public class SeasonConfig {

	@Bean
	String [] spring() {
		return "sp1.png,sp2.png,sp3.png".split(",");
	}
	@Bean
	String [] summer() {
		return "sua.png,sub.png".split(",");
	}
	@Bean
	String [] fall() {
		return "fa_1.png,fa_2.png,fa_5.png,fa_6.png".split(",");
	}
	@Bean
	String [] winter() {
		return "ww.png,ee.png".split(",");
	}
	
	/*
	 * @Bean Season spring() { return new
	 * Season("spring","sp1.png,sp2.png,sp3.png".split(",")); }
	 * 
	 * @Bean Season summer() { return new
	 * Season("summer","sua.png,sub.png".split(",")); }
	 * 
	 * @Bean Season fall() { return new
	 * Season("fall","fa_1.png,fa_2.png,fa_5.png,fa_6.png".split(",")); }
	 * 
	 * @Bean Season winter() { return new
	 * Season("winter","ww.png,ee.png".split(",")); }
	 */
}
