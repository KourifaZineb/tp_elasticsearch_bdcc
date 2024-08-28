package ma.enset.tp_elasticsearch_bdcc.services;

import ma.enset.tp_elasticsearch_bdcc.entities.Article;
import ma.enset.tp_elasticsearch_bdcc.repositories.ArticleRepository;
import org.springframework.stereotype.Service;


@Service
public class ArticleService {
    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Article saveArticle(Article article){
        return articleRepository.save(article);
    }
}
