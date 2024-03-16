package com.gabriel.imageliteapi.domain.service;

import com.gabriel.imageliteapi.domain.entity.Image;
import com.gabriel.imageliteapi.domain.enums.ImageExtension.ImageExtension;

import java.util.List;
import java.util.Optional;

public interface ImageService {
    Image save(Image image);

    Optional<Image> getById(String id);

    List<Image> search(ImageExtension extension, String query);
}
