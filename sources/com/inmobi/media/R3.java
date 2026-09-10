package com.inmobi.media;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class R3 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream[] f23118a;

    public R3(InputStream[] inputStreamArr) {
        this.f23118a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f23118a) {
            Ge.a(inputStream);
        }
    }
}
