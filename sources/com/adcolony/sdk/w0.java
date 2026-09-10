package com.adcolony.sdk;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
class w0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InputStream f9456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f9457b;

    public w0(InputStream inputStream, int i2, int i3) throws IOException {
        this.f9456a = inputStream;
        while (i2 > 0) {
            i2 -= (int) inputStream.skip(i2);
        }
        this.f9457b = i3;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        int iAvailable = this.f9456a.available();
        int i2 = this.f9457b;
        return iAvailable <= i2 ? iAvailable : i2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9456a.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i2 = this.f9457b;
        if (i2 == 0) {
            return -1;
        }
        this.f9457b = i2 - 1;
        return this.f9456a.read();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        int iSkip = (int) j;
        if (iSkip <= 0) {
            return 0L;
        }
        int i2 = this.f9457b;
        if (iSkip > i2) {
            iSkip = i2;
        }
        this.f9457b = i2 - iSkip;
        while (iSkip > 0) {
            iSkip -= (int) this.f9456a.skip(j);
        }
        return j;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f9457b;
        if (i4 == 0) {
            return -1;
        }
        if (i3 > i4) {
            i3 = i4;
        }
        int i5 = this.f9456a.read(bArr, i2, i3);
        if (i5 == -1) {
            return -1;
        }
        this.f9457b -= i5;
        return i5;
    }
}
