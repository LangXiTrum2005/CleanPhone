package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;

/* JADX INFO: renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2141t extends CodedOutputStream {
    final byte[] buffer;
    final int limit;
    int position;
    int totalBytesWritten;

    public AbstractC2141t(int i) {
        super();
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.buffer = bArr;
        this.limit = bArr.length;
    }

    public final void buffer(byte b) {
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b;
        this.totalBytesWritten++;
    }

    public final void bufferFixed32NoTag(int i) {
        byte[] bArr = this.buffer;
        int i2 = this.position;
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        this.position = i2 + 4;
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
        this.totalBytesWritten += 4;
    }

    public final void bufferFixed64NoTag(long j) {
        byte[] bArr = this.buffer;
        int i = this.position;
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) (255 & (j >> 24));
        bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
        bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
        bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
        this.position = i + 8;
        bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
        this.totalBytesWritten += 8;
    }

    public final void bufferInt32NoTag(int i) {
        if (i >= 0) {
            bufferUInt32NoTag(i);
        } else {
            bufferUInt64NoTag(i);
        }
    }

    public final void bufferTag(int i, int i2) {
        bufferUInt32NoTag(WireFormat.makeTag(i, i2));
    }

    public final void bufferUInt32NoTag(int i) {
        if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) ((i & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                this.totalBytesWritten++;
                i >>>= 7;
            }
            byte[] bArr2 = this.buffer;
            int i3 = this.position;
            this.position = i3 + 1;
            bArr2[i3] = (byte) i;
            this.totalBytesWritten++;
            return;
        }
        long j = this.position;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            U0.putByte(bArr3, i4, (byte) ((i & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.buffer;
        int i5 = this.position;
        this.position = i5 + 1;
        U0.putByte(bArr4, i5, (byte) i);
        this.totalBytesWritten += (int) (((long) this.position) - j);
    }

    public final void bufferUInt64NoTag(long j) {
        if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((((int) j) & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                this.totalBytesWritten++;
                j >>>= 7;
            }
            byte[] bArr2 = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            bArr2[i2] = (byte) j;
            this.totalBytesWritten++;
            return;
        }
        long j2 = this.position;
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.buffer;
            int i3 = this.position;
            this.position = i3 + 1;
            U0.putByte(bArr3, i3, (byte) ((((int) j) & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.buffer;
        int i4 = this.position;
        this.position = i4 + 1;
        U0.putByte(bArr4, i4, (byte) j);
        this.totalBytesWritten += (int) (((long) this.position) - j2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
