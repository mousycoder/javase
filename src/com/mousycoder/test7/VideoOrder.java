package com.mousycoder.test7;

import java.util.Date;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/25 9:05 PM
 */
public class VideoOrder {

    private int id;

    private String title;

    private Date createTime;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoOrder that = (VideoOrder) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(createTime, that.createTime);
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", VideoOrder.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("title='" + title + "'")
                .add("createTime=" + createTime)
                .toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, createTime);
    }
}
