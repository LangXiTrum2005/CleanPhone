package com.bumptech.glide.load.data;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ExifOrientationStream.java */
/* JADX INFO: loaded from: classes2.dex */
public final class competently extends FilterInputStream {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final int f17594molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final byte[] f17595monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final int f17596polloi;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f17597arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final byte f17598kowloon;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f17595monoploid = bArr;
        int length = bArr.length;
        f17596polloi = length;
        f17594molybdenite = length + 2;
    }

    public competently(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.f17598kowloon = (byte) i;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f17597arytenoidectomy;
        if (i3 < 2 || i3 > (i2 = f17594molybdenite)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.f17598kowloon : f17595monoploid[i3 - 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        if (i != -1) {
            this.f17597arytenoidectomy++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f17597arytenoidectomy = (int) (((long) this.f17597arytenoidectomy) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f17597arytenoidectomy;
        int i5 = f17594molybdenite;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f17598kowloon;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f17595monoploid, this.f17597arytenoidectomy - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f17597arytenoidectomy += i3;
        }
        return i3;
    }
}
