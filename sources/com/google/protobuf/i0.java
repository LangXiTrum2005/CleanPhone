package com.google.protobuf;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends CodedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f24855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteBuffer f24856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24857c;

    public i0(ByteBuffer byteBuffer) {
        super();
        this.f24855a = byteBuffer;
        this.f24856b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.f24857c = byteBuffer.position();
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.f24855a.position(this.f24856b.position());
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f24856b.position() - this.f24857c;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.f24856b.remaining();
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b10) throws CodedOutputStream.OutOfSpaceException {
        try {
            this.f24856b.put(b10);
        } catch (BufferOverflowException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
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
            this.f24856b.putInt(i10);
        } catch (BufferOverflowException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
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
            this.f24856b.putLong(j10);
        } catch (BufferOverflowException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
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
        ByteBuffer byteBuffer = this.f24856b;
        int iPosition = byteBuffer.position();
        try {
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                writeUInt32NoTag(a5.e(str));
                try {
                    a5.d(str, byteBuffer);
                    return;
                } catch (IndexOutOfBoundsException e10) {
                    throw new CodedOutputStream.OutOfSpaceException(e10);
                }
            }
            int iPosition2 = byteBuffer.position() + iComputeUInt32SizeNoTag2;
            byteBuffer.position(iPosition2);
            try {
                a5.d(str, byteBuffer);
                int iPosition3 = byteBuffer.position();
                byteBuffer.position(iPosition);
                writeUInt32NoTag(iPosition3 - iPosition2);
                byteBuffer.position(iPosition3);
            } catch (IndexOutOfBoundsException e11) {
                throw new CodedOutputStream.OutOfSpaceException(e11);
            }
        } catch (y4 e12) {
            byteBuffer.position(iPosition);
            inefficientWriteStringNoTag(str, e12);
        } catch (IllegalArgumentException e13) {
            throw new CodedOutputStream.OutOfSpaceException(e13);
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
            ByteBuffer byteBuffer = this.f24856b;
            if (i11 == 0) {
                byteBuffer.put((byte) i10);
                return;
            }
            try {
                byteBuffer.put((byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            } catch (BufferOverflowException e10) {
                throw new CodedOutputStream.OutOfSpaceException(e10);
            }
            throw new CodedOutputStream.OutOfSpaceException(e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i10, long j10) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i10, 0);
        writeUInt64NoTag(j10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j10) throws CodedOutputStream.OutOfSpaceException {
        while (true) {
            long j11 = (-128) & j10;
            ByteBuffer byteBuffer = this.f24856b;
            if (j11 == 0) {
                byteBuffer.put((byte) j10);
                return;
            }
            try {
                byteBuffer.put((byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            } catch (BufferOverflowException e10) {
                throw new CodedOutputStream.OutOfSpaceException(e10);
            }
            throw new CodedOutputStream.OutOfSpaceException(e10);
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

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i10, int i11) throws CodedOutputStream.OutOfSpaceException {
        try {
            this.f24856b.put(bArr, i10, i11);
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
        } catch (BufferOverflowException e11) {
            throw new CodedOutputStream.OutOfSpaceException(e11);
        }
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
    public final void write(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        try {
            this.f24856b.put(byteBuffer);
        } catch (BufferOverflowException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
        }
    }
}
