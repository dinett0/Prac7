package com.example.prac5_r.Data_layer.DataSource;

public class Custom {
    Integer imageId;
    String itemText;

    public Custom(Integer imageId, String itemText) {
        super();
        this.imageId = imageId;
        this.itemText = itemText;
    }

    public void setText(String itemText) {
        this.itemText = itemText;
    }

    public String getText() {
        return itemText;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }
}
