package mimmoo.mimmoo_back.service;

import jakarta.transaction.Transactional;
import mimmoo.mimmoo_back.domain.Image;
import mimmoo.mimmoo_back.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Transactional
@Service
public class ImageService {
    @Autowired
    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public Image save(Image image) {
        String base64Image = image.getPath();
        image.setPath("");
        Image savedImage = imageRepository.save(image);
        String filePath = savedImage.getProductId()+"/"+savedImage.getId()+".txt";
        File file = new File("src/main/resources/static/"+filePath);

        File directory = new File("src/main/resources/static/"+savedImage.getProductId());
        if (!directory.exists()) {
            directory.mkdir(); // 디렉토리 생성
        }

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(base64Image);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return savedImage;
    }
}
