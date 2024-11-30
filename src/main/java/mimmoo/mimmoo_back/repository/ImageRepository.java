package mimmoo.mimmoo_back.repository;

import mimmoo.mimmoo_back.domain.Image;

import java.util.List;

public interface ImageRepository {
    List<Image> findAll();
    Image save(Image product);
}
