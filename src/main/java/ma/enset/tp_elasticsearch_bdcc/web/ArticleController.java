package ma.enset.tp_elasticsearch_bdcc.web;

import ma.enset.tp_elasticsearch_bdcc.services.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class ArticleController {
    private ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }


}
