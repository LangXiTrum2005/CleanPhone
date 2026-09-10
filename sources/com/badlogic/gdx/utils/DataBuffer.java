package com.badlogic.gdx.utils;

import java.io.DataOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class DataBuffer extends DataOutput {
    private final StreamUtils.OptimizedByteArrayOutputStream outStream;

    public DataBuffer() {
        this(32);
    }

    public byte[] getBuffer() {
        return this.outStream.getBuffer();
    }

    public byte[] toArray() {
        return this.outStream.toByteArray();
    }

    public DataBuffer(int i) {
        super(new StreamUtils.OptimizedByteArrayOutputStream(i));
        this.outStream = (StreamUtils.OptimizedByteArrayOutputStream) ((DataOutputStream) this).out;
    }
}
