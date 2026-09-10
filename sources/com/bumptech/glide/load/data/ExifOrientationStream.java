package com.bumptech.glide.load.data;

import android.support.v4.media.a;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ExifOrientationStream extends FilterInputStream {
    public static final byte[] Z = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    public static final int e0 = 31;
    public final byte X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f12376Y;

    public ExifOrientationStream(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 < -1 || i2 > 8) {
            throw new IllegalArgumentException(a.h(i2, "Cannot add invalid orientation: "));
        }
        this.X = (byte) i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i2;
        int i3;
        int i4 = this.f12376Y;
        if (i4 < 2 || i4 > (i3 = e0)) {
            i2 = super.read();
        } else {
            i2 = i4 == i3 ? this.X : Z[i4 - 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        if (i2 != -1) {
            this.f12376Y++;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f12376Y = (int) (((long) this.f12376Y) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5 = this.f12376Y;
        int i6 = e0;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.X;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int iMin = Math.min(i6 - i5, i3);
            System.arraycopy(Z, this.f12376Y - 2, bArr, i2, iMin);
            i4 = iMin;
        }
        if (i4 > 0) {
            this.f12376Y += i4;
        }
        return i4;
    }
}
