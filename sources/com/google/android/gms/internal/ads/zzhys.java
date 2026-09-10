package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class zzhys extends FilterInputStream {
    private int zza;

    public zzhys(InputStream inputStream, int i2) {
        super(inputStream);
        this.zza = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return Math.min(super.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.zza <= 0) {
            return -1;
        }
        int i2 = super.read();
        if (i2 >= 0) {
            this.zza--;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        int iSkip = (int) super.skip(Math.min(j, this.zza));
        if (iSkip >= 0) {
            this.zza -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.zza;
        if (i4 <= 0) {
            return -1;
        }
        int i5 = super.read(bArr, i2, Math.min(i3, i4));
        if (i5 >= 0) {
            this.zza -= i5;
        }
        return i5;
    }
}
