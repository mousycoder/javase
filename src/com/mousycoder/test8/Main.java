package com.mousycoder.test8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 12:26 PM
 */
public class Main {

    public static void main(String[] args) {
        List<VideoOrder> videoOrders1 = new ArrayList<>();

        videoOrders1.add(new VideoOrder("a课程", 22));
        videoOrders1.add(new VideoOrder("w课程", 200));
        videoOrders1.add(new VideoOrder("c课程", 100));
        videoOrders1.add(new VideoOrder("d课程", 33));
        videoOrders1.add(new VideoOrder("f课程", 1));
        List<VideoOrder> videoOrders2 = new ArrayList<>();

        videoOrders2.add(new VideoOrder("a课程", 22));
        videoOrders2.add(new VideoOrder("b课程", 18));
        videoOrders2.add(new VideoOrder("d课程", 33));
        videoOrders2.add(new VideoOrder("f课程", 1));
        videoOrders2.add(new VideoOrder("z课程", 22));


//        videoOrders1.retainAll(videoOrders2);
//        System.out.println(videoOrders1);
//
//
//        List<VideoOrder> intersectionList = new ArrayList<>();
//        for (VideoOrder videoOrder : videoOrders1) {
//            if (videoOrders2.contains(videoOrder)){
//                intersectionList.add(videoOrder);
//            }
//        }
//
//        System.out.println(intersectionList);




//        videoOrders1.removeAll(videoOrders2);
//
//        System.out.println(videoOrders1);


//        List<VideoOrder> diffList = new ArrayList<>();
//        for (VideoOrder videoOrder : videoOrders1) {
//            if (!videoOrders2.contains(videoOrder)){
//                diffList.add(videoOrder);
//            }
//        }
//
//        System.out.println(diffList);



//        videoOrders2.removeAll(videoOrders1);
//        System.out.println(videoOrders2);
//        List<VideoOrder> diffList = new ArrayList<>();
//        for (VideoOrder videoOrder : videoOrders2) {
//            if (!videoOrders1.contains(videoOrder)){
//                diffList.add(videoOrder);
//            }
//        }
//
//        System.out.println(diffList);

        videoOrders1.addAll(videoOrders2);
        System.out.println(videoOrders1);

        Set<VideoOrder> set = new HashSet<>(videoOrders1);
        System.out.println(set);










    }
}
