package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteOutput f24829e;

    public f0(ByteOutput byteOutput, int i10) {
        super(i10);
        if (byteOutput == null) {
            throw new NullPointerException("out");
        }
        this.f24829e = byteOutput;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() throws IOException {
        if (this.f24793c > 0) {
            g();
        }
    }

    public final void g() throws IOException {
        this.f24829e.write(this.f24791a, 0, this.f24793c);
        this.f24793c = 0;
    }

    public final void h(int i10) throws IOException {
        if (this.f24792b - this.f24793c < i10) {
            g();
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b10) throws IOException {
        if (this.f24793c == this.f24792b) {
            g();
        }
        a(b10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBool(int i10, boolean z10) throws IOException {
        h(11);
        d(i10, 0);
        a(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i10, byte[] bArr) throws IOException {
        writeByteArray(i10, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
        writeUInt32NoTag(i11);
        write(bArr, i10, i11);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
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
    public final void writeFixed32(int i10, int i11) throws IOException {
        h(14);
        d(i10, 5);
        b(i11);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int i10) throws IOException {
        h(4);
        b(i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i10, long j10) throws IOException {
        h(18);
        d(i10, 1);
        c(j10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j10) throws IOException {
        h(8);
        c(j10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32(int i10, int i11) throws IOException {
        h(20);
        d(i10, 0);
        if (i11 >= 0) {
            e(i11);
        } else {
            f(i11);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int i10) throws IOException {
        if (i10 >= 0) {
            writeUInt32NoTag(i10);
        } else {
            writeUInt64NoTag(i10);
        }
    }

    @Override // com.google.protobuf.d0, com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
        flush();
        this.f24829e.writeLazy(bArr, i10, i11);
        this.f24794d += i11;
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
    public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
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
        int length = str.length() * 3;
        int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
        int i10 = iComputeUInt32SizeNoTag + length;
        int i11 = this.f24792b;
        if (i10 > i11) {
            byte[] bArr = new byte[length];
            int iF = a5.f24770a.f(str, bArr, 0, length);
            writeUInt32NoTag(iF);
            writeLazy(bArr, 0, iF);
            return;
        }
        if (i10 > i11 - this.f24793c) {
            g();
        }
        int i12 = this.f24793c;
        try {
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            byte[] bArr2 = this.f24791a;
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                int iE = a5.e(str);
                e(iE);
                this.f24793c = a5.f24770a.f(str, bArr2, this.f24793c, iE);
                this.f24794d += iE;
                return;
            }
            int i13 = i12 + iComputeUInt32SizeNoTag2;
            this.f24793c = i13;
            int iF2 = a5.f24770a.f(str, bArr2, i13, i11 - i13);
            this.f24793c = i12;
            int i14 = (iF2 - i12) - iComputeUInt32SizeNoTag2;
            e(i14);
            this.f24793c = iF2;
            this.f24794d += i14;
        } catch (y4 e10) {
            this.f24794d -= this.f24793c - i12;
            this.f24793c = i12;
            inefficientWriteStringNoTag(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new CodedOutputStream.OutOfSpaceException(e11);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeTag(int i10, int i11) throws IOException {
        writeUInt32NoTag(WireFormat.makeTag(i10, i11));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32(int i10, int i11) throws IOException {
        h(20);
        d(i10, 0);
        e(i11);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i10) throws IOException {
        h(5);
        e(i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i10, long j10) throws IOException {
        h(20);
        d(i10, 0);
        f(j10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j10) throws IOException {
        h(10);
        f(j10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
        writeTag(i10, 2);
        writeByteArrayNoTag(bArr, i11, i12);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i10, MessageLite messageLite, x3 x3Var) throws IOException {
        writeTag(i10, 2);
        writeMessageNoTag(messageLite, x3Var);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, x3 x3Var) throws IOException {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(x3Var));
        x3Var.e(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        flush();
        this.f24829e.write(bArr, i10, i11);
        this.f24794d += i11;
    }

    @Override // com.google.protobuf.d0, com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
        flush();
        int iRemaining = byteBuffer.remaining();
        this.f24829e.writeLazy(byteBuffer);
        this.f24794d += iRemaining;
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) throws IOException {
        flush();
        int iRemaining = byteBuffer.remaining();
        this.f24829e.write(byteBuffer);
        this.f24794d += iRemaining;
    }
}
