package com.dehghan.Builder;

public class main {

    public static void main(String[] args) {

        //builder dorost mikonam

        H264PropertiesBuilder  builder = new H264PropertiesBuilder();
        H264properties h264properties = builder.frames(12)
                .keyInt(15).minKeyInt(2).sceneCut(2)
                .build();
    }
}
