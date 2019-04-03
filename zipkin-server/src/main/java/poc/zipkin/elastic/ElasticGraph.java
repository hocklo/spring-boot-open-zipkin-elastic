package poc.zipkin.elastic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import zipkin.dependencies.elasticsearch.ElasticsearchDependenciesJob;

@Profile("elastic")
@Configuration
@EnableScheduling
public class ElasticGraph {

	@Value("${zipkin.storage.elasticsearch.hosts}")
	private String hosts;

	@Value("${zipkin.storage.elasticsearch.index}")
	private String index;

	@Scheduled(fixedRate = 60000)
	public void generateGraph() {
		ElasticsearchDependenciesJob.builder().hosts(hosts).index(index).build().run();
	}
}
