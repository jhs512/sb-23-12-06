package com.ll.sb231206.domain.article.article.entity;

import com.ll.sb231206.global.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@SequenceGenerator(name = "article_seq", sequenceName = "ARTICLE_SEQ", allocationSize = 1)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(callSuper = true)
public class Article extends BaseEntity {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_seq")
    private Long id;
    private String title;
    private String content;
}
