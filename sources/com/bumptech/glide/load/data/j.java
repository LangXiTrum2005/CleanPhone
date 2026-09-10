package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f10528c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10529d = 31;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f10530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10531b;

    public j(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException(l1.d.e(i10, "Cannot add invalid orientation: "));
        }
        this.f10530a = (byte) i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10;
        int i11;
        int i12 = this.f10531b;
        if (i12 < 2 || i12 > (i11 = f10529d)) {
            i10 = super.read();
        } else {
            i10 = i12 == i11 ? this.f10530a : f10528c[i12 - 2] & 255;
        }
        if (i10 != -1) {
            this.f10531b++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f10531b = (int) (((long) this.f10531b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f10531b;
        int i14 = f10529d;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f10530a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f10528c, this.f10531b - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f10531b += i12;
        }
        return i12;
    }
}
