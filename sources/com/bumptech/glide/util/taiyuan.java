package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: MarkEnforcingInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public class taiyuan extends FilterInputStream {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f17944kowloon;

    public taiyuan(InputStream inputStream) {
        super(inputStream);
        this.f17944kowloon = Integer.MIN_VALUE;
    }

    public final long attabal(long j) {
        int i = this.f17944kowloon;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.f17944kowloon;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.f17944kowloon = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (attabal(1L) == -1) {
            return -1;
        }
        int i = super.read();
        saneness(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f17944kowloon = Integer.MIN_VALUE;
    }

    public final void saneness(long j) {
        int i = this.f17944kowloon;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f17944kowloon = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jAttabal = attabal(j);
        if (jAttabal == -1) {
            return 0L;
        }
        long jSkip = super.skip(jAttabal);
        saneness(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int iAttabal = (int) attabal(i2);
        if (iAttabal == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iAttabal);
        saneness(i3);
        return i3;
    }
}
