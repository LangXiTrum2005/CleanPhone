package com.bumptech.glide.util;

import android.support.v4.media.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ContentLengthInputStream extends FilterInputStream {
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f12835Y;

    public ContentLengthInputStream(InputStream inputStream, long j) {
        super(inputStream);
        this.X = j;
    }

    public final void a(int i2) throws IOException {
        if (i2 >= 0) {
            this.f12835Y += i2;
            return;
        }
        long j = this.f12835Y;
        long j2 = this.X;
        if (j2 - j <= 0) {
            return;
        }
        StringBuilder sbV = a.v(j2, "Failed to read all expected data, expected: ", ", but read: ");
        sbV.append(this.f12835Y);
        throw new IOException(sbV.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.X - ((long) this.f12835Y), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i2;
        i2 = super.read();
        a(i2 >= 0 ? 1 : -1);
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i2, int i3) {
        int i4;
        i4 = super.read(bArr, i2, i3);
        a(i4);
        return i4;
    }
}
