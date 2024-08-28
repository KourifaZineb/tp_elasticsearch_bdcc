package ma.enset.tp_elasticsearch_bdcc.repositories;


import ma.enset.tp_elasticsearch_bdcc.entities.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ArticleRepository extends ElasticsearchRepository<Article, String> {
    List<Article> findByTitleContainingOrContentContainingOrAuthorContainingOrPublishDateContaining(String titleKeyword, String contentKeyword, String authorKeyword, String publishDateKeyword);

}
