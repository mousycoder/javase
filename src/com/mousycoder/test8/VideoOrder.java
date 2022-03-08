package com.mousycoder.test8;

import java.util.Objects;

class VideoOrder {

    private int price;

    private String title;

    public VideoOrder(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoOrder that = (VideoOrder) o;
        return price == that.price && Objects.equals(title, that.title);

    }

    @Override
    public int hashCode() {

        return Objects.hash(price, title);

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "VideoOrder{" +

                "price=" + price +

                ", title='" + title + '\'' +

                '}';

    }

}