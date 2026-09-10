package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2104a extends FilterInputStream {
    private int limit;

    public C2104a(InputStream inputStream, int i) {
        super(inputStream);
        this.limit = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(super.available(), this.limit);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.limit <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.limit--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        int iSkip = (int) super.skip(Math.min(j, this.limit));
        if (iSkip >= 0) {
            this.limit -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.limit;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.limit -= i4;
        }
        return i4;
    }
}
