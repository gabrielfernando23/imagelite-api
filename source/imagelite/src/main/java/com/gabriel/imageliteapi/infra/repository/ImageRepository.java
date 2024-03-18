package com.gabriel.imageliteapi.infra.repository;

import com.gabriel.imageliteapi.domain.entity.Image;
import com.gabriel.imageliteapi.domain.enums.ImageExtension.ImageExtension;
import com.gabriel.imageliteapi.infra.repository.specs.GenericSpecs;
import com.gabriel.imageliteapi.infra.repository.specs.ImageSpecs;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.util.StringUtils;

import java.util.List;

import static com.gabriel.imageliteapi.infra.repository.specs.GenericSpecs.*;
import static com.gabriel.imageliteapi.infra.repository.specs.ImageSpecs.*;
import static org.springframework.data.jpa.domain.Specification.*;

public interface ImageRepository extends JpaRepository<Image, String> {

    default List<Image> findByExtensionAndNameOrTagsLike() {
        return findAll();
    }
}
