package com.ll.sb231206.global.init;

import com.ll.sb231206.domain.article.article.entity.Article;
import com.ll.sb231206.domain.article.article.mapper.ArticleMapper;
import com.ll.sb231206.domain.article.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class NotProd {
    private final ArticleService articleService;
    private final ArticleMapper articleMapper;

    @Bean
    public ApplicationRunner initNotProd() {
        return args -> {
            articleService.write("제목 1", "내용 1");
            articleService.write("제목 2", "내용 2");
            articleService.write("제목 3", "내용 3");

            Article article1 = articleMapper.findById(1L).get();
            article1.setContent("내용 1 수정");
            articleMapper.save(article1);

            System.out.println("article1 = " + article1);

            Article article4 = articleMapper.save(
                    Article.builder()
                            .title("제목 4")
                            .content("내용 4")
                            .build()
            );

            System.out.println("article4 = " + article4);
        };
    }
}
