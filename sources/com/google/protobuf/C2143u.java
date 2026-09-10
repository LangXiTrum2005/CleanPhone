package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2143u extends CodedOutputStream {
    private final byte[] buffer;
    private final int limit;
    private final int offset;
    private int position;

    public C2143u(byte[] bArr, int i, int i2) {
        super();
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i3 = i + i2;
        if ((i | i2 | (bArr.length - i3)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.buffer = bArr;
        this.offset = i;
        this.position = i;
        this.limit = i3;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void flush() {
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.position - this.offset;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.limit - this.position;
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b) throws IOException {
        try {
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBool(int i, boolean z) throws IOException {
        writeTag(i, 0);
        write(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i, byte[] bArr) throws IOException {
        writeByteArray(i, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException {
        writeUInt32NoTag(i2);
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
        writeTag(i, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytes(int i, ByteString byteString) throws IOException {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytesNoTag(ByteString byteString) throws IOException {
        writeUInt32NoTag(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32(int i, int i2) throws IOException {
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int i) throws IOException {
        try {
            byte[] bArr = this.buffer;
            int i2 = this.position;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            this.position = i2 + 4;
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i, long j) throws IOException {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j) throws IOException {
        try {
            byte[] bArr = this.buffer;
            int i = this.position;
            bArr[i] = (byte) (((int) j) & 255);
            bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
            bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
            bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
            bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
            this.position = i + 8;
            bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int i) throws IOException {
        if (i >= 0) {
            writeUInt32NoTag(i);
        } else {
            writeUInt64NoTag(i);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i, MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) throws IOException {
        writeTag(i, 2);
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(interfaceC3578h30));
        interfaceC3578h30.writeTo(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
        writeUInt32NoTag(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
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
        write(byteBufferDuplicate);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeBytes(3, byteString);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeString(int i, String str) throws IOException {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeStringNoTag(String str) throws IOException {
        int i = this.position;
        try {
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                int i2 = i + iComputeUInt32SizeNoTag2;
                this.position = i2;
                int iEncode = Ng0.encode(str, this.buffer, i2, spaceLeft());
                this.position = i;
                writeUInt32NoTag((iEncode - i) - iComputeUInt32SizeNoTag2);
                this.position = iEncode;
            } else {
                writeUInt32NoTag(Ng0.encodedLength(str));
                this.position = Ng0.encode(str, this.buffer, this.position, spaceLeft());
            }
        } catch (Mg0 e) {
            this.position = i;
            inefficientWriteStringNoTag(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream.OutOfSpaceException(e2);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeTag(int i, int i2) throws IOException {
        writeUInt32NoTag(WireFormat.makeTag(i, i2));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) ((i & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }
        byte[] bArr2 = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) throws IOException {
        if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                U0.putByte(bArr, i, (byte) ((((int) j) & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.buffer;
            int i2 = this.position;
            this.position = 1 + i2;
            U0.putByte(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }
        byte[] bArr4 = this.buffer;
        int i4 = this.position;
        this.position = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
        writeTag(i, 2);
        writeByteArrayNoTag(bArr, i2, i3);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) throws IOException {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(interfaceC3578h30));
        interfaceC3578h30.writeTo(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.buffer, this.position, i2);
            this.position += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i, MessageLite messageLite) throws IOException {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.buffer, this.position, iRemaining);
            this.position += iRemaining;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(iRemaining)), e);
        }
    }
}
