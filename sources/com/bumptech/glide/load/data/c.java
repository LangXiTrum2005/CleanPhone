package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.dm0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f10520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f10521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm0 f10522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10523d;

    public c(FileOutputStream fileOutputStream, dm0 dm0Var) {
        this.f10520a = fileOutputStream;
        this.f10522c = dm0Var;
        this.f10521b = (byte[]) dm0Var.d(byte[].class, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f10520a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f10521b;
            if (bArr != null) {
                this.f10522c.h(bArr);
                this.f10521b = null;
            }
        } catch (Throwable th2) {
            fileOutputStream.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i10 = this.f10523d;
        FileOutputStream fileOutputStream = this.f10520a;
        if (i10 > 0) {
            fileOutputStream.write(this.f10521b, 0, i10);
            this.f10523d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        byte[] bArr = this.f10521b;
        int i11 = this.f10523d;
        int i12 = i11 + 1;
        this.f10523d = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f10520a.write(bArr, 0, i12);
        this.f10523d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f10523d;
            FileOutputStream fileOutputStream = this.f10520a;
            if (i15 == 0 && i13 >= this.f10521b.length) {
                fileOutputStream.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f10521b.length - i15);
            System.arraycopy(bArr, i14, this.f10521b, this.f10523d, iMin);
            int i16 = this.f10523d + iMin;
            this.f10523d = i16;
            i12 += iMin;
            byte[] bArr2 = this.f10521b;
            if (i16 == bArr2.length && i16 > 0) {
                fileOutputStream.write(bArr2, 0, i16);
                this.f10523d = 0;
            }
        } while (i12 < i11);
    }
}
