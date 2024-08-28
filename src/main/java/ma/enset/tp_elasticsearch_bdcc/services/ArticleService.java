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

    public Article updateArticle(String id, Article updatedArticle) {
        return articleRepository.findById(id).map(existingArticle -> {
            existingArticle.setTitle(updatedArticle.getTitle());
            existingArticle.setContent(updatedArticle.getContent());
            // Mettez à jour d'autres champs si nécessaire
            return articleRepository.save(existingArticle);
        }).orElse(null);
    }

    // Méthode pour supprimer un article par ID
    public void deleteArticle(String id) {
        articleRepository.deleteById(id);
    }

    // Méthode pour rechercher des articles par mot spécifique
    public List<Article> searchArticles(String keyword) {
        return articleRepository.findByTitleContainingOrContentContainingOrAuthorContainingOrPublishDateContaining(keyword, keyword, keyword, keyword);
    }

    // Méthode pour obtenir un article par ID
    public Optional<Article> getArticleById(String id) {
        return articleRepository.findById(id);
    }
}
