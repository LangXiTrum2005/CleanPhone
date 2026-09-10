package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class BufferedOutputStream extends OutputStream {
    public final FileOutputStream X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public byte[] f12372Y;
    public final LruArrayPool Z;
    public int e0;

    public BufferedOutputStream(FileOutputStream fileOutputStream, LruArrayPool lruArrayPool) {
        this.X = fileOutputStream;
        this.Z = lruArrayPool;
        this.f12372Y = (byte[]) lruArrayPool.d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.X;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f12372Y;
            if (bArr != null) {
                this.Z.i(bArr);
                this.f12372Y = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i2 = this.e0;
        FileOutputStream fileOutputStream = this.X;
        if (i2 > 0) {
            fileOutputStream.write(this.f12372Y, 0, i2);
            this.e0 = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        byte[] bArr = this.f12372Y;
        int i3 = this.e0;
        int i4 = i3 + 1;
        this.e0 = i4;
        bArr[i3] = (byte) i2;
        if (i4 != bArr.length || i4 <= 0) {
            return;
        }
        this.X.write(bArr, 0, i4);
        this.e0 = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.e0;
            FileOutputStream fileOutputStream = this.X;
            if (i7 == 0 && i5 >= this.f12372Y.length) {
                fileOutputStream.write(bArr, i6, i5);
                return;
            }
            int iMin = Math.min(i5, this.f12372Y.length - i7);
            System.arraycopy(bArr, i6, this.f12372Y, this.e0, iMin);
            int i8 = this.e0 + iMin;
            this.e0 = i8;
            i4 += iMin;
            byte[] bArr2 = this.f12372Y;
            if (i8 == bArr2.length && i8 > 0) {
                fileOutputStream.write(bArr2, 0, i8);
                this.e0 = 0;
            }
        } while (i4 < i3);
    }
}
