package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e0 extends CodedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24818d;

    public e0(byte[] bArr, int i10, int i11) {
        super();
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i12 = i10 + i11;
        if ((i10 | i11 | (bArr.length - i12)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        this.f24815a = bArr;
        this.f24816b = i10;
        this.f24818d = i10;
        this.f24817c = i12;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f24818d - this.f24816b;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.f24817c - this.f24818d;
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b10) throws CodedOutputStream.OutOfSpaceException {
        try {
            byte[] bArr = this.f24815a;
            int i10 = this.f24818d;
            this.f24818d = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24818d), Integer.valueOf(this.f24817c), 1), e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBool(int i10, boolean z10) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i10, 0);
        write(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i10, byte[] bArr) throws CodedOutputStream.OutOfSpaceException {
        writeByteArray(i10, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws CodedOutputStream.OutOfSpaceException {
        writeUInt32NoTag(i11);
        write(bArr, i10, i11);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i10, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytes(int i10, ByteString byteString) throws IOException {
        writeTag(i10, 2);
        writeBytesNoTag(byteString);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytesNoTag(ByteString byteString) throws IOException {
        writeUInt32NoTag(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32(int i10, int i11) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i10, 5);
        writeFixed32NoTag(i11);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int i10) throws CodedOutputStream.OutOfSpaceException {
        try {
            byte[] bArr = this.f24815a;
            int i11 = this.f24818d;
            int i12 = i11 + 1;
            this.f24818d = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f24818d = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f24818d = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f24818d = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24818d), Integer.valueOf(this.f24817c), 1), e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i10, long j10) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i10, 1);
        writeFixed64NoTag(j10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j10) throws CodedOutputStream.OutOfSpaceException {
        try {
            byte[] bArr = this.f24815a;
            int i10 = this.f24818d;
            int i11 = i10 + 1;
            this.f24818d = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f24818d = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f24818d = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f24818d = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f24818d = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f24818d = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f24818d = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f24818d = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24818d), Integer.valueOf(this.f24817c), 1), e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32(int i10, int i11) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i10, 0);
        writeInt32NoTag(i11);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int i10) throws CodedOutputStream.OutOfSpaceException {
        if (i10 >= 0) {
            writeUInt32NoTag(i10);
        } else {
            writeUInt64NoTag(i10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(byte[] bArr, int i10, int i11) throws CodedOutputStream.OutOfSpaceException {
        write(bArr, i10, i11);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i10, MessageLite messageLite) throws IOException {
        writeTag(i10, 2);
        writeMessageNoTag(messageLite);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
        writeUInt32NoTag(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawBytes(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        write(byteBufferDuplicate);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeBytes(3, byteString);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeString(int i10, String str) throws IOException {
        writeTag(i10, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeStringNoTag(String str) throws IOException {
        int i10 = this.f24818d;
        try {
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            byte[] bArr = this.f24815a;
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                writeUInt32NoTag(a5.e(str));
                this.f24818d = a5.f24770a.f(str, bArr, this.f24818d, spaceLeft());
                return;
            }
            int i11 = i10 + iComputeUInt32SizeNoTag2;
            this.f24818d = i11;
            int iF = a5.f24770a.f(str, bArr, i11, spaceLeft());
            this.f24818d = i10;
            writeUInt32NoTag((iF - i10) - iComputeUInt32SizeNoTag2);
            this.f24818d = iF;
        } catch (y4 e10) {
            this.f24818d = i10;
            inefficientWriteStringNoTag(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new CodedOutputStream.OutOfSpaceException(e11);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeTag(int i10, int i11) throws CodedOutputStream.OutOfSpaceException {
        writeUInt32NoTag(WireFormat.makeTag(i10, i11));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32(int i10, int i11) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i10, 0);
        writeUInt32NoTag(i11);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i10) throws CodedOutputStream.OutOfSpaceException {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f24815a;
            if (i11 == 0) {
                int i12 = this.f24818d;
                this.f24818d = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f24818d;
                    this.f24818d = i13 + 1;
                    bArr[i13] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24818d), Integer.valueOf(this.f24817c), 1), e10);
                }
            }
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24818d), Integer.valueOf(this.f24817c), 1), e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i10, long j10) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i10, 0);
        writeUInt64NoTag(j10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j10) throws CodedOutputStream.OutOfSpaceException {
        boolean z10 = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.f24815a;
        if (z10 && spaceLeft() >= 10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f24818d;
                this.f24818d = i10 + 1;
                x4.n(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i11 = this.f24818d;
            this.f24818d = i11 + 1;
            x4.n(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i12 = this.f24818d;
                this.f24818d = i12 + 1;
                bArr[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24818d), Integer.valueOf(this.f24817c), 1), e10);
            }
        }
        int i13 = this.f24818d;
        this.f24818d = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i10, 2);
        writeByteArrayNoTag(bArr, i11, i12);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i10, MessageLite messageLite, x3 x3Var) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i10, 2);
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(x3Var));
        x3Var.e(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, x3 x3Var) throws CodedOutputStream.OutOfSpaceException {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(x3Var));
        x3Var.e(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i10, int i11) throws CodedOutputStream.OutOfSpaceException {
        try {
            System.arraycopy(bArr, i10, this.f24815a, this.f24818d, i11);
            this.f24818d += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24818d), Integer.valueOf(this.f24817c), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        int iRemaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.f24815a, this.f24818d, iRemaining);
            this.f24818d += iRemaining;
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24818d), Integer.valueOf(this.f24817c), Integer.valueOf(iRemaining)), e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void flush() {
    }
}
