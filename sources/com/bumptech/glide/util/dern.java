package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ContentLengthInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern extends FilterInputStream {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f17930arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final long f17931kowloon;

    public dern(InputStream inputStream, long j) {
        super(inputStream);
        this.f17931kowloon = j;
    }

    public static InputStream saneness(InputStream inputStream, long j) {
        return new dern(inputStream, j);
    }

    public final int attabal(int i) throws IOException {
        if (i >= 0) {
            this.f17930arytenoidectomy += i;
            return i;
        }
        if (this.f17931kowloon - ((long) this.f17930arytenoidectomy) <= 0) {
            return i;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f17931kowloon + ", but read: " + this.f17930arytenoidectomy);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f17931kowloon - ((long) this.f17930arytenoidectomy), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i;
        i = super.read();
        attabal(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return attabal(super.read(bArr, i, i2));
    }
}
