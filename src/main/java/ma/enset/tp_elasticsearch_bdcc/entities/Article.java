package ma.enset.tp_elasticsearch_bdcc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.UUID;


@Document(indexName = "articles")
@NoArgsConstructor @AllArgsConstructor @Data
public class Article {
    @Id
    private UUID id;
    private String title;
    private String author;
    private String content;
    private String publishDate;
}
