package com.dehghan.Builder;

public class H264PropertiesBuilder {


    private int keyInt;
    private int minKeyInt;
    private int sceneCut;
    private int bFrames;
    private int bAdapt;
    private int qp;
    private int bitrate;
    private boolean bFrameBias;
    private int crf;
    private int qpStep;
    private int pbRatio;
    private int chromeOffset;
    private float rateTol;
    private byte pass;
    private boolean status;
    private int direct;
    private int meRange;
    private  boolean weightB;
    private  boolean noFastPSkip;


    //void kendi tipine çeviriyorum
    public H264PropertiesBuilder keyInt(int keyInt) {
        this.keyInt = keyInt;
        return this;
    }

    public H264PropertiesBuilder minKeyInt(int minKeyInt) {
        this.minKeyInt = minKeyInt;
        return this;
    }

    public H264PropertiesBuilder sceneCut(int sceneCut) {
        this.sceneCut = sceneCut;
        return this;
    }

    public H264PropertiesBuilder frames(int bFrames) {
        this.bFrames = bFrames;
        return this;
    }

    //Ilk sınıf bu builden sonucu alması için bu method yazarız
    public H264properties build(){
        H264properties h264properties = new H264properties();
        h264properties.setBFrames(bFrames);
        return h264properties;
    }
}
