package ma.enset.tp_elasticsearch_bdcc.repositories;


import ma.enset.tp_elasticsearch_bdcc.entities.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ArticleRepository extends ElasticsearchRepository<Article, String> {

}
