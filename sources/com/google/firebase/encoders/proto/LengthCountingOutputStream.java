package com.google.firebase.encoders.proto;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class LengthCountingOutputStream extends OutputStream {
    public long X;

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.X++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.X += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        int i4;
        if (i2 >= 0 && i2 <= bArr.length && i3 >= 0 && (i4 = i2 + i3) <= bArr.length && i4 >= 0) {
            this.X += (long) i3;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
