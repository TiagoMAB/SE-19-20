package pt.ulisboa.tecnico.socialsoftware.tutor.question.dto;

import pt.ulisboa.tecnico.socialsoftware.tutor.question.domain.Image;

import java.io.Serializable;


public class ImageDto implements Serializable {
    private Integer id;
    private String url;
    private Integer width;

    public ImageDto() {

    }

    public ImageDto(Image image) {
        this.id = image.getId();
        this.width = image.getWidth();
        this.url = image.getUrl();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}