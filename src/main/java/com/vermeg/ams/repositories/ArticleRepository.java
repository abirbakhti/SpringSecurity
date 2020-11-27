package com.vermeg.ams.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import com.vermeg.ams.entities.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>{

}
