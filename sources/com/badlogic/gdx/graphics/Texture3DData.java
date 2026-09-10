package com.badlogic.gdx.graphics;

/* JADX INFO: loaded from: classes.dex */
public interface Texture3DData {
    void consume3DData();

    int getDepth();

    int getGLType();

    int getHeight();

    int getInternalFormat();

    int getWidth();

    boolean isManaged();

    boolean isPrepared();

    void prepare();

    boolean useMipMaps();
}
