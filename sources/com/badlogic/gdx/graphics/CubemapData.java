package com.badlogic.gdx.graphics;

/* JADX INFO: loaded from: classes.dex */
public interface CubemapData {
    void consumeCubemapData();

    int getHeight();

    int getWidth();

    boolean isManaged();

    boolean isPrepared();

    void prepare();
}
