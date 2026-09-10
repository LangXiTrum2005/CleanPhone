package com.google.protobuf;

import com.ironsource.X3;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends CodedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f24866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteBuffer f24867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f24869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f24871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f24872g;

    public j0(ByteBuffer byteBuffer) {
        super();
        this.f24866a = byteBuffer;
        this.f24867b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long jB = x4.b(byteBuffer);
        this.f24868c = jB;
        long jPosition = ((long) byteBuffer.position()) + jB;
        this.f24869d = jPosition;
        long jLimit = jB + ((long) byteBuffer.limit());
        this.f24870e = jLimit;
        this.f24871f = jLimit - 10;
        this.f24872g = jPosition;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.f24866a.position((int) (this.f24872g - this.f24868c));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return (int) (this.f24872g - this.f24869d);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return (int) (this.f24870e - this.f24872g);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b10) throws CodedOutputStream.OutOfSpaceException {
        long j10 = this.f24872g;
        long j11 = this.f24870e;
        if (j10 >= j11) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f24872g), Long.valueOf(j11), 1));
        }
        this.f24872g = 1 + j10;
        x4.m(b10, j10);
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
    public final void writeFixed32NoTag(int i10) {
        this.f24867b.putInt((int) (this.f24872g - this.f24868c), i10);
        this.f24872g += 4;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i10, long j10) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i10, 1);
        writeFixed64NoTag(j10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j10) {
        this.f24867b.putLong((int) (this.f24872g - this.f24868c), j10);
        this.f24872g += 8;
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
        long j10 = this.f24868c;
        ByteBuffer byteBuffer = this.f24867b;
        long j11 = this.f24872g;
        try {
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                int iE = a5.e(str);
                writeUInt32NoTag(iE);
                byteBuffer.position((int) (this.f24872g - j10));
                a5.d(str, byteBuffer);
                this.f24872g += (long) iE;
                return;
            }
            int i10 = ((int) (this.f24872g - j10)) + iComputeUInt32SizeNoTag2;
            byteBuffer.position(i10);
            a5.d(str, byteBuffer);
            int iPosition = byteBuffer.position() - i10;
            writeUInt32NoTag(iPosition);
            this.f24872g += (long) iPosition;
        } catch (y4 e10) {
            this.f24872g = j11;
            byteBuffer.position((int) (j11 - j10));
            inefficientWriteStringNoTag(str, e10);
        } catch (IllegalArgumentException e11) {
            throw new CodedOutputStream.OutOfSpaceException(e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new CodedOutputStream.OutOfSpaceException(e12);
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
        if (this.f24872g <= this.f24871f) {
            while ((i10 & (-128)) != 0) {
                long j10 = this.f24872g;
                this.f24872g = j10 + 1;
                x4.m((byte) ((i10 & 127) | 128), j10);
                i10 >>>= 7;
            }
            long j11 = this.f24872g;
            this.f24872g = 1 + j11;
            x4.m((byte) i10, j11);
            return;
        }
        while (true) {
            long j12 = this.f24872g;
            long j13 = this.f24870e;
            if (j12 >= j13) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f24872g), Long.valueOf(j13), 1));
            }
            if ((i10 & (-128)) == 0) {
                this.f24872g = 1 + j12;
                x4.m((byte) i10, j12);
                return;
            } else {
                this.f24872g = j12 + 1;
                x4.m((byte) ((i10 & 127) | 128), j12);
                i10 >>>= 7;
            }
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i10, long j10) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i10, 0);
        writeUInt64NoTag(j10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j10) throws CodedOutputStream.OutOfSpaceException {
        if (this.f24872g <= this.f24871f) {
            while ((j10 & (-128)) != 0) {
                long j11 = this.f24872g;
                this.f24872g = j11 + 1;
                x4.m((byte) ((((int) j10) & 127) | 128), j11);
                j10 >>>= 7;
            }
            long j12 = this.f24872g;
            this.f24872g = 1 + j12;
            x4.m((byte) j10, j12);
            return;
        }
        while (true) {
            long j13 = this.f24872g;
            long j14 = this.f24870e;
            if (j13 >= j14) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f24872g), Long.valueOf(j14), 1));
            }
            if ((j10 & (-128)) == 0) {
                this.f24872g = 1 + j13;
                x4.m((byte) j10, j13);
                return;
            } else {
                this.f24872g = j13 + 1;
                x4.m((byte) ((((int) j10) & 127) | 128), j13);
                j10 >>>= 7;
            }
        }
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
        writeMessageNoTag(messageLite, x3Var);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, x3 x3Var) throws CodedOutputStream.OutOfSpaceException {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(x3Var));
        x3Var.e(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i10, int i11) throws CodedOutputStream.OutOfSpaceException {
        long j10 = this.f24870e;
        if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
            long j11 = i11;
            long j12 = j10 - j11;
            long j13 = this.f24872g;
            if (j12 >= j13) {
                x4.f25021c.d(bArr, i10, j13, j11);
                this.f24872g += j11;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException(X3.i.X);
        }
        throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f24872g), Long.valueOf(j10), Integer.valueOf(i11)));
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        ByteBuffer byteBuffer2 = this.f24867b;
        try {
            int iRemaining = byteBuffer.remaining();
            byteBuffer2.position((int) (this.f24872g - this.f24868c));
            byteBuffer2.put(byteBuffer);
            this.f24872g += (long) iRemaining;
        } catch (BufferOverflowException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
        }
    }
}
