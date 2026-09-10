package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2151y extends CodedOutputStream {
    private final long address;
    private final ByteBuffer buffer;
    private final long initialPosition;
    private final long limit;
    private final long oneVarintLimit;
    private final ByteBuffer originalBuffer;
    private long position;

    public C2151y(ByteBuffer byteBuffer) {
        super();
        this.originalBuffer = byteBuffer;
        this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long jAddressOffset = U0.addressOffset(byteBuffer);
        this.address = jAddressOffset;
        long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
        this.initialPosition = jPosition;
        long jLimit = jAddressOffset + ((long) byteBuffer.limit());
        this.limit = jLimit;
        this.oneVarintLimit = jLimit - 10;
        this.position = jPosition;
    }

    private int bufferPos(long j) {
        return (int) (j - this.address);
    }

    public static boolean isSupported() {
        return U0.hasUnsafeByteBufferOperations();
    }

    private void repositionBuffer(long j) {
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void flush() {
    }

    @Override // com.google.protobuf.CodedOutputStream
    public int getTotalBytesWritten() {
        return (int) (this.position - this.initialPosition);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public int spaceLeft() {
        return (int) (this.limit - this.position);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void write(byte b) throws IOException {
        long j = this.position;
        if (j >= this.limit) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
        }
        this.position = 1 + j;
        U0.putByte(j, b);
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
        this.buffer.putInt(bufferPos(this.position), i);
        this.position += 4;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeFixed64(int i, long j) throws IOException {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeFixed64NoTag(long j) throws IOException {
        this.buffer.putLong(bufferPos(this.position), j);
        this.position += 8;
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
        long j = this.position;
        try {
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                int iBufferPos = bufferPos(this.position) + iComputeUInt32SizeNoTag2;
                Ng0.encodeUtf8(str, this.buffer);
                int iPosition = this.buffer.position() - iBufferPos;
                writeUInt32NoTag(iPosition);
                this.position += (long) iPosition;
            } else {
                int iEncodedLength = Ng0.encodedLength(str);
                writeUInt32NoTag(iEncodedLength);
                repositionBuffer(this.position);
                Ng0.encodeUtf8(str, this.buffer);
                this.position += (long) iEncodedLength;
            }
        } catch (Mg0 e) {
            this.position = j;
            repositionBuffer(j);
            inefficientWriteStringNoTag(str, e);
        } catch (IllegalArgumentException e2) {
            throw new CodedOutputStream.OutOfSpaceException(e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream.OutOfSpaceException(e3);
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
        if (this.position <= this.oneVarintLimit) {
            while ((i & (-128)) != 0) {
                long j = this.position;
                this.position = j + 1;
                U0.putByte(j, (byte) ((i & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
                i >>>= 7;
            }
            long j2 = this.position;
            this.position = 1 + j2;
            U0.putByte(j2, (byte) i);
            return;
        }
        while (true) {
            long j3 = this.position;
            if (j3 >= this.limit) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
            if ((i & (-128)) == 0) {
                this.position = 1 + j3;
                U0.putByte(j3, (byte) i);
                return;
            } else {
                this.position = j3 + 1;
                U0.putByte(j3, (byte) ((i & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
                i >>>= 7;
            }
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeUInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void writeUInt64NoTag(long j) throws IOException {
        if (this.position <= this.oneVarintLimit) {
            while ((j & (-128)) != 0) {
                long j2 = this.position;
                this.position = j2 + 1;
                U0.putByte(j2, (byte) ((((int) j) & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
                j >>>= 7;
            }
            long j3 = this.position;
            this.position = 1 + j3;
            U0.putByte(j3, (byte) j);
            return;
        }
        while (true) {
            long j4 = this.position;
            if (j4 >= this.limit) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
            if ((j & (-128)) == 0) {
                this.position = 1 + j4;
                U0.putByte(j4, (byte) j);
                return;
            } else {
                this.position = j4 + 1;
                U0.putByte(j4, (byte) ((((int) j) & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
                j >>>= 7;
            }
        }
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
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
            long j = i2;
            long j2 = this.limit - j;
            long j3 = this.position;
            if (j2 >= j3) {
                U0.copyMemory(bArr, i, j3, j);
                this.position += j;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
        throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i2)));
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void write(ByteBuffer byteBuffer) throws IOException {
        try {
            int iRemaining = byteBuffer.remaining();
            repositionBuffer(this.position);
            this.buffer.put(byteBuffer);
            this.position += (long) iRemaining;
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }
}
