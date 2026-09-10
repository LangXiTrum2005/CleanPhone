package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2149x extends CodedOutputStream {
    private final ByteBuffer buffer;
    private final int initialPosition;
    private final ByteBuffer originalBuffer;

    public C2149x(ByteBuffer byteBuffer) {
        super();
        this.originalBuffer = byteBuffer;
        this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.initialPosition = byteBuffer.position();
    }

    private void encode(String str) throws IOException {
        try {
            Ng0.encodeUtf8(str, this.buffer);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void flush() {
    }

    @Override // com.google.protobuf.CodedOutputStream
    public int getTotalBytesWritten() {
        return this.buffer.position() - this.initialPosition;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public int spaceLeft() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void write(byte b) throws IOException {
        try {
            this.buffer.put(b);
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeBool(int i, boolean z) throws IOException {
        writeTag(i, 0);
        write(z ? (byte) 1 : (byte) 0);
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
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeFixed32NoTag(int i) throws IOException {
        try {
            this.buffer.putInt(i);
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeFixed64(int i, long j) throws IOException {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeFixed64NoTag(long j) throws IOException {
        try {
            this.buffer.putLong(j);
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeInt32NoTag(i2);
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
        write(bArr, i, i2);
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
        int iPosition = this.buffer.position();
        try {
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                encode(str);
                int iPosition3 = this.buffer.position();
                writeUInt32NoTag(iPosition3 - iPosition2);
            } else {
                writeUInt32NoTag(Ng0.encodedLength(str));
                encode(str);
            }
        } catch (Mg0 e) {
            inefficientWriteStringNoTag(str, e);
        } catch (IllegalArgumentException e2) {
            throw new CodedOutputStream.OutOfSpaceException(e2);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeTag(int i, int i2) throws IOException {
        writeUInt32NoTag(WireFormat.makeTag(i, i2));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeUInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeUInt32NoTag(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                this.buffer.put((byte) ((i & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
                i >>>= 7;
            } catch (BufferOverflowException e) {
                throw new CodedOutputStream.OutOfSpaceException(e);
            }
        }
        this.buffer.put((byte) i);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeUInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeUInt64NoTag(long j) throws IOException {
        while (((-128) & j) != 0) {
            try {
                this.buffer.put((byte) ((((int) j) & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
                j >>>= 7;
            } catch (BufferOverflowException e) {
                throw new CodedOutputStream.OutOfSpaceException(e);
            }
        }
        this.buffer.put((byte) j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
        writeTag(i, 2);
        writeByteArrayNoTag(bArr, i2, i3);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.buffer.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        } catch (BufferOverflowException e2) {
            throw new CodedOutputStream.OutOfSpaceException(e2);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeMessageNoTag(MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) throws IOException {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(interfaceC3578h30));
        interfaceC3578h30.writeTo(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeMessage(int i, MessageLite messageLite) throws IOException {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void write(ByteBuffer byteBuffer) throws IOException {
        try {
            this.buffer.put(byteBuffer);
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }
}
