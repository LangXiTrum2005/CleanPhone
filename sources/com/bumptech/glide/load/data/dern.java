package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: BufferedOutputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern extends OutputStream {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public byte[] f17606arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final OutputStream f17607kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public trawler.saneness f17608monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f17609polloi;

    public dern(OutputStream outputStream, trawler.saneness sanenessVar) {
        this(outputStream, sanenessVar, 65536);
    }

    public final void attabal() throws IOException {
        int i = this.f17609polloi;
        if (i > 0) {
            this.f17607kowloon.write(this.f17606arytenoidectomy, 0, i);
            this.f17609polloi = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f17607kowloon.close();
            release();
        } catch (Throwable th) {
            this.f17607kowloon.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        attabal();
        this.f17607kowloon.flush();
    }

    public final void release() {
        byte[] bArr = this.f17606arytenoidectomy;
        if (bArr != null) {
            this.f17608monoploid.put(bArr);
            this.f17606arytenoidectomy = null;
        }
    }

    public final void saneness() throws IOException {
        if (this.f17609polloi == this.f17606arytenoidectomy.length) {
            attabal();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f17606arytenoidectomy;
        int i2 = this.f17609polloi;
        this.f17609polloi = i2 + 1;
        bArr[i2] = (byte) i;
        saneness();
    }

    public dern(OutputStream outputStream, trawler.saneness sanenessVar, int i) {
        this.f17607kowloon = outputStream;
        this.f17608monoploid = sanenessVar;
        this.f17606arytenoidectomy = (byte[]) sanenessVar.dern(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f17609polloi;
            if (i6 == 0 && i4 >= this.f17606arytenoidectomy.length) {
                this.f17607kowloon.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f17606arytenoidectomy.length - i6);
            System.arraycopy(bArr, i5, this.f17606arytenoidectomy, this.f17609polloi, iMin);
            this.f17609polloi += iMin;
            i3 += iMin;
            saneness();
        } while (i3 < i2);
    }
}
