package com.marceramirez;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int totalBuckets = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        totalBuckets = (int)(Math.ceil(area / areaPerBucket));

        return totalBuckets - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int totalBuckets = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        totalBuckets = (int)(Math.ceil(area / areaPerBucket));

        return totalBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int totalBuckets = 0;
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        totalBuckets = (int)(Math.ceil(area / areaPerBucket));

        return totalBuckets;
    }
}