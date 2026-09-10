package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 extends CodedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24794d;

    public d0(int i10) {
        super();
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.f24791a = bArr;
        this.f24792b = bArr.length;
    }

    public final void a(byte b10) {
        int i10 = this.f24793c;
        this.f24793c = i10 + 1;
        this.f24791a[i10] = b10;
        this.f24794d++;
    }

    public final void b(int i10) {
        int i11 = this.f24793c;
        int i12 = i11 + 1;
        this.f24793c = i12;
        byte[] bArr = this.f24791a;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f24793c = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f24793c = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f24793c = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
        this.f24794d += 4;
    }

    public final void c(long j10) {
        int i10 = this.f24793c;
        int i11 = i10 + 1;
        this.f24793c = i11;
        byte[] bArr = this.f24791a;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i10 + 2;
        this.f24793c = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i10 + 3;
        this.f24793c = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i10 + 4;
        this.f24793c = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i10 + 5;
        this.f24793c = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f24793c = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f24793c = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.f24793c = i10 + 8;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        this.f24794d += 8;
    }

    public final void d(int i10, int i11) {
        e(WireFormat.makeTag(i10, i11));
    }

    public final void e(int i10) {
        boolean z10 = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.f24791a;
        if (!z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f24793c;
                this.f24793c = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                this.f24794d++;
                i10 >>>= 7;
            }
            int i12 = this.f24793c;
            this.f24793c = i12 + 1;
            bArr[i12] = (byte) i10;
            this.f24794d++;
            return;
        }
        long j10 = this.f24793c;
        while ((i10 & (-128)) != 0) {
            int i13 = this.f24793c;
            this.f24793c = i13 + 1;
            x4.n(bArr, i13, (byte) ((i10 & 127) | 128));
            i10 >>>= 7;
        }
        int i14 = this.f24793c;
        this.f24793c = i14 + 1;
        x4.n(bArr, i14, (byte) i10);
        this.f24794d += (int) (((long) this.f24793c) - j10);
    }

    public final void f(long j10) {
        boolean z10 = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.f24791a;
        if (!z10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f24793c;
                this.f24793c = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                this.f24794d++;
                j10 >>>= 7;
            }
            int i11 = this.f24793c;
            this.f24793c = i11 + 1;
            bArr[i11] = (byte) j10;
            this.f24794d++;
            return;
        }
        long j11 = this.f24793c;
        while ((j10 & (-128)) != 0) {
            int i12 = this.f24793c;
            this.f24793c = i12 + 1;
            x4.n(bArr, i12, (byte) ((((int) j10) & 127) | 128));
            j10 >>>= 7;
        }
        int i13 = this.f24793c;
        this.f24793c = i13 + 1;
        x4.n(bArr, i13, (byte) j10);
        this.f24794d += (int) (((long) this.f24793c) - j11);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f24794d;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(byte[] bArr, int i10, int i11) {
        write(bArr, i10, i11);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(ByteBuffer byteBuffer) {
        write(byteBuffer);
    }
}
