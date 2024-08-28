package ma.enset.tp_elasticsearch_bdcc.services;

import ma.enset.tp_elasticsearch_bdcc.entities.Article;
import ma.enset.tp_elasticsearch_bdcc.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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
