package com.gabriel.imageliteapi.application.images;

import com.gabriel.imageliteapi.domain.entity.Image;
import com.gabriel.imageliteapi.domain.enums.ImageExtension.ImageExtension;
import com.gabriel.imageliteapi.domain.service.ImageService;
import com.gabriel.imageliteapi.infra.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {
    private final ImageRepository repository;
    @Override
    @Transactional
    public Image save(Image image) {
        return repository.save(image);
    }

    @Override
    public Optional<Image> getById(String id) {
        return repository.findById(id);
    }

    @Override
    public List<Image> search() {
        return repository.findByExtensionAndNameOrTagsLike();
    }
}
