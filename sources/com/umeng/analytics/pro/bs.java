package com.umeng.analytics.pro;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class bs extends ByteArrayOutputStream {
    public bs(int i) {
        super(i);
    }

    public byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public int b() {
        return ((ByteArrayOutputStream) this).count;
    }

    public bs() {
    }
}
