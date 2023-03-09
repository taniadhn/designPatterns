package com.dehghan.Builder;

public class H264properties {

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
    public H264properties() {
    }

    public void setKeyInt(int keyInt) {
        this.keyInt = keyInt;
    }

    public void setMinKeyInt(int minKeyInt) {
        this.minKeyInt = minKeyInt;
    }

    public void setSceneCut(int sceneCut) {
        this.sceneCut = sceneCut;
    }

    public void setBFrames(int bFrames) {
        this.bFrames = bFrames;
    }


}
