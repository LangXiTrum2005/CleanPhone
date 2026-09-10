package com.startapp.sdk.internal;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class b7 extends ByteArrayOutputStream {
    public b7(int i2) {
        super(i2);
    }

    public final byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public final int b() {
        return ((ByteArrayOutputStream) this).count;
    }
}
