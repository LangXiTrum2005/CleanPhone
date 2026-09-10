package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2145v extends AbstractC2141t {
    private final ByteOutput out;

    public C2145v(ByteOutput byteOutput, int i) {
        super(i);
        if (byteOutput == null) {
            throw new NullPointerException("out");
        }
        this.out = byteOutput;
    }

    private void doFlush() throws IOException {
        this.out.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    private void flushIfNotAvailable(int i) throws IOException {
        if (this.limit - this.position < i) {
            doFlush();
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void flush() throws IOException {
        if (this.position > 0) {
            doFlush();
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void write(byte b) throws IOException {
        if (this.position == this.limit) {
            doFlush();
        }
        buffer(b);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeBool(int i, boolean z) throws IOException {
        flushIfNotAvailable(11);
        bufferTag(i, 0);
        buffer(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeByteArray(int i, byte[] bArr) throws IOException {
        writeByteArray(i, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException {
        writeUInt32NoTag(i2);
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
        writeTag(i, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeBytes(int i, ByteString byteString) throws IOException {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeBytesNoTag(ByteString byteString) throws IOException {
        writeUInt32NoTag(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeFixed32(int i, int i2) throws IOException {
        flushIfNotAvailable(14);
        bufferTag(i, 5);
        bufferFixed32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeFixed32NoTag(int i) throws IOException {
        flushIfNotAvailable(4);
        bufferFixed32NoTag(i);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeFixed64(int i, long j) throws IOException {
        flushIfNotAvailable(18);
        bufferTag(i, 1);
        bufferFixed64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeFixed64NoTag(long j) throws IOException {
        flushIfNotAvailable(8);
        bufferFixed64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeInt32(int i, int i2) throws IOException {
        flushIfNotAvailable(20);
        bufferTag(i, 0);
        bufferInt32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeInt32NoTag(int i) throws IOException {
        if (i >= 0) {
            writeUInt32NoTag(i);
        } else {
            writeUInt64NoTag(i);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(byte[] bArr, int i, int i2) throws IOException {
        flush();
        this.out.writeLazy(bArr, i, i2);
        this.totalBytesWritten += i2;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeMessage(int i, MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) throws IOException {
        writeTag(i, 2);
        writeMessageNoTag(messageLite, interfaceC3578h30);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeMessageNoTag(MessageLite messageLite) throws IOException {
        writeUInt32NoTag(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        write(byteBufferDuplicate);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeBytes(3, byteString);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeString(int i, String str) throws IOException {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeStringNoTag(String str) throws IOException {
        int length = str.length() * 3;
        int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
        int i = iComputeUInt32SizeNoTag + length;
        int i2 = this.limit;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iEncode = Ng0.encode(str, bArr, 0, length);
            writeUInt32NoTag(iEncode);
            writeLazy(bArr, 0, iEncode);
            return;
        }
        if (i > i2 - this.position) {
            doFlush();
        }
        int i3 = this.position;
        try {
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                int i4 = i3 + iComputeUInt32SizeNoTag2;
                this.position = i4;
                int iEncode2 = Ng0.encode(str, this.buffer, i4, this.limit - i4);
                this.position = i3;
                int i5 = (iEncode2 - i3) - iComputeUInt32SizeNoTag2;
                bufferUInt32NoTag(i5);
                this.position = iEncode2;
                this.totalBytesWritten += i5;
            } else {
                int iEncodedLength = Ng0.encodedLength(str);
                bufferUInt32NoTag(iEncodedLength);
                this.position = Ng0.encode(str, this.buffer, this.position, iEncodedLength);
                this.totalBytesWritten += iEncodedLength;
            }
        } catch (Mg0 e) {
            this.totalBytesWritten -= this.position - i3;
            this.position = i3;
            inefficientWriteStringNoTag(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream.OutOfSpaceException(e2);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeTag(int i, int i2) throws IOException {
        writeUInt32NoTag(WireFormat.makeTag(i, i2));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeUInt32(int i, int i2) throws IOException {
        flushIfNotAvailable(20);
        bufferTag(i, 0);
        bufferUInt32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeUInt32NoTag(int i) throws IOException {
        flushIfNotAvailable(5);
        bufferUInt32NoTag(i);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeUInt64(int i, long j) throws IOException {
        flushIfNotAvailable(20);
        bufferTag(i, 0);
        bufferUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeUInt64NoTag(long j) throws IOException {
        flushIfNotAvailable(10);
        bufferUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
        writeTag(i, 2);
        writeByteArrayNoTag(bArr, i2, i3);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeMessageNoTag(MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) throws IOException {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(interfaceC3578h30));
        interfaceC3578h30.writeTo(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void write(byte[] bArr, int i, int i2) throws IOException {
        flush();
        this.out.write(bArr, i, i2);
        this.totalBytesWritten += i2;
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        flush();
        int iRemaining = byteBuffer.remaining();
        this.out.writeLazy(byteBuffer);
        this.totalBytesWritten += iRemaining;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeMessage(int i, MessageLite messageLite) throws IOException {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void write(ByteBuffer byteBuffer) throws IOException {
        flush();
        int iRemaining = byteBuffer.remaining();
        this.out.write(byteBuffer);
        this.totalBytesWritten += iRemaining;
    }
}
