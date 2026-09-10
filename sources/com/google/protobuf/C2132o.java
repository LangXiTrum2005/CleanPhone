package com.google.protobuf;

import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2132o extends CodedInputStream {
    private int bufferSizeAfterCurrentLimit;
    private long currentAddress;
    private ByteBuffer currentByteBuffer;
    private long currentByteBufferLimit;
    private long currentByteBufferPos;
    private long currentByteBufferStartPos;
    private int currentLimit;
    private boolean enableAliasing;
    private final boolean immutable;
    private final Iterable<ByteBuffer> input;
    private final Iterator<ByteBuffer> iterator;
    private int lastTag;
    private int startOffset;
    private int totalBufferSize;
    private int totalBytesRead;

    private long currentRemaining() {
        return this.currentByteBufferLimit - this.currentByteBufferPos;
    }

    private void getNextByteBuffer() throws InvalidProtocolBufferException {
        if (!this.iterator.hasNext()) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        tryGetNextByteBuffer();
    }

    private void readRawBytesTo(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i2 > remaining()) {
            if (i2 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i2 != 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            int iMin = Math.min(i3, (int) currentRemaining());
            long j = iMin;
            U0.copyMemory(this.currentByteBufferPos, bArr, (i2 - i3) + i, j);
            i3 -= iMin;
            this.currentByteBufferPos += j;
        }
    }

    private void recomputeBufferSizeAfterLimit() {
        int i = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
        this.totalBufferSize = i;
        int i2 = i - this.startOffset;
        int i3 = this.currentLimit;
        if (i2 <= i3) {
            this.bufferSizeAfterCurrentLimit = 0;
            return;
        }
        int i4 = i2 - i3;
        this.bufferSizeAfterCurrentLimit = i4;
        this.totalBufferSize = i - i4;
    }

    private int remaining() {
        return (int) ((((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
    }

    private void skipRawVarint() throws IOException {
        for (int i = 0; i < 10; i++) {
            if (readRawByte() >= 0) {
                return;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    private ByteBuffer slice(int i, int i2) throws IOException {
        int iPosition = this.currentByteBuffer.position();
        int iLimit = this.currentByteBuffer.limit();
        ByteBuffer byteBuffer = this.currentByteBuffer;
        try {
            try {
                byteBuffer.position(i);
                byteBuffer.limit(i2);
                ByteBuffer byteBufferSlice = this.currentByteBuffer.slice();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                return byteBufferSlice;
            } catch (IllegalArgumentException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } catch (Throwable th) {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    private void tryGetNextByteBuffer() {
        ByteBuffer next = this.iterator.next();
        this.currentByteBuffer = next;
        this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
        long jPosition = next.position();
        this.currentByteBufferPos = jPosition;
        this.currentByteBufferStartPos = jPosition;
        this.currentByteBufferLimit = this.currentByteBuffer.limit();
        long jAddressOffset = U0.addressOffset(this.currentByteBuffer);
        this.currentAddress = jAddressOffset;
        this.currentByteBufferPos += jAddressOffset;
        this.currentByteBufferStartPos += jAddressOffset;
        this.currentByteBufferLimit += jAddressOffset;
    }

    @Override // com.google.protobuf.CodedInputStream
    public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        if (this.lastTag != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public void enableAliasing(boolean z) {
        this.enableAliasing = z;
    }

    @Override // com.google.protobuf.CodedInputStream
    public int getBytesUntilLimit() {
        int i = this.currentLimit;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public int getLastTag() {
        return this.lastTag;
    }

    @Override // com.google.protobuf.CodedInputStream
    public int getTotalBytesRead() {
        return (int) ((((long) (this.totalBytesRead - this.startOffset)) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
    }

    @Override // com.google.protobuf.CodedInputStream
    public boolean isAtEnd() throws IOException {
        return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
    }

    @Override // com.google.protobuf.CodedInputStream
    public void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    @Override // com.google.protobuf.CodedInputStream
    public int pushLimit(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i;
        int i2 = this.currentLimit;
        if (totalBytesRead > i2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.currentLimit = totalBytesRead;
        recomputeBufferSizeAfterLimit();
        return i2;
    }

    @Override // com.google.protobuf.CodedInputStream
    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public byte[] readByteArray() throws IOException {
        return readRawBytes(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public ByteBuffer readByteBuffer() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            long j = rawVarint32;
            if (j <= currentRemaining()) {
                if (this.immutable || !this.enableAliasing) {
                    byte[] bArr = new byte[rawVarint32];
                    U0.copyMemory(this.currentByteBufferPos, bArr, 0L, j);
                    this.currentByteBufferPos += j;
                    return ByteBuffer.wrap(bArr);
                }
                long j2 = this.currentByteBufferPos + j;
                this.currentByteBufferPos = j2;
                long j3 = this.currentAddress;
                return slice((int) ((j2 - j3) - j), (int) (j2 - j3));
            }
        }
        if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
            byte[] bArr2 = new byte[rawVarint32];
            readRawBytesTo(bArr2, 0, rawVarint32);
            return ByteBuffer.wrap(bArr2);
        }
        if (rawVarint32 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            long j = rawVarint32;
            long j2 = this.currentByteBufferLimit;
            long j3 = this.currentByteBufferPos;
            if (j <= j2 - j3) {
                if (this.immutable && this.enableAliasing) {
                    int i = (int) (j3 - this.currentAddress);
                    ByteString byteStringWrap = ByteString.wrap(slice(i, rawVarint32 + i));
                    this.currentByteBufferPos += j;
                    return byteStringWrap;
                }
                byte[] bArr = new byte[rawVarint32];
                U0.copyMemory(j3, bArr, 0L, j);
                this.currentByteBufferPos += j;
                return ByteString.wrap(bArr);
            }
        }
        if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (!this.immutable || !this.enableAliasing) {
            byte[] bArr2 = new byte[rawVarint32];
            readRawBytesTo(bArr2, 0, rawVarint32);
            return ByteString.wrap(bArr2);
        }
        ArrayList arrayList = new ArrayList();
        while (rawVarint32 > 0) {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            int iMin = Math.min(rawVarint32, (int) currentRemaining());
            int i2 = (int) (this.currentByteBufferPos - this.currentAddress);
            arrayList.add(ByteString.wrap(slice(i2, i2 + iMin)));
            rawVarint32 -= iMin;
            this.currentByteBufferPos += (long) iMin;
        }
        return ByteString.copyFrom(arrayList);
    }

    @Override // com.google.protobuf.CodedInputStream
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i, 4));
        this.recursionDepth--;
    }

    @Override // com.google.protobuf.CodedInputStream
    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        popLimit(iPushLimit);
    }

    @Override // com.google.protobuf.CodedInputStream
    public byte readRawByte() throws IOException {
        if (currentRemaining() == 0) {
            getNextByteBuffer();
        }
        long j = this.currentByteBufferPos;
        this.currentByteBufferPos = 1 + j;
        return U0.getByte(j);
    }

    @Override // com.google.protobuf.CodedInputStream
    public byte[] readRawBytes(int i) throws IOException {
        if (i >= 0) {
            long j = i;
            if (j <= currentRemaining()) {
                byte[] bArr = new byte[i];
                U0.copyMemory(this.currentByteBufferPos, bArr, 0L, j);
                this.currentByteBufferPos += j;
                return bArr;
            }
        }
        if (i >= 0 && i <= remaining()) {
            byte[] bArr2 = new byte[i];
            readRawBytesTo(bArr2, 0, i);
            return bArr2;
        }
        if (i > 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public int readRawLittleEndian32() throws IOException {
        if (currentRemaining() < 4) {
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
        }
        long j = this.currentByteBufferPos;
        this.currentByteBufferPos = 4 + j;
        return ((U0.getByte(j + 3) & 255) << 24) | (U0.getByte(j) & 255) | ((U0.getByte(1 + j) & 255) << 8) | ((U0.getByte(2 + j) & 255) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public long readRawLittleEndian64() throws IOException {
        if (currentRemaining() < 8) {
            return (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48) | ((((long) readRawByte()) & 255) << 56);
        }
        long j = this.currentByteBufferPos;
        this.currentByteBufferPos = 8 + j;
        return ((((long) U0.getByte(j + 7)) & 255) << 56) | ((((long) U0.getByte(2 + j)) & 255) << 16) | (((long) U0.getByte(j)) & 255) | ((((long) U0.getByte(1 + j)) & 255) << 8) | ((((long) U0.getByte(3 + j)) & 255) << 24) | ((((long) U0.getByte(4 + j)) & 255) << 32) | ((((long) U0.getByte(5 + j)) & 255) << 40) | ((((long) U0.getByte(6 + j)) & 255) << 48);
    }

    @Override // com.google.protobuf.CodedInputStream
    public int readRawVarint32() throws IOException {
        int i;
        long j = this.currentByteBufferPos;
        if (this.currentByteBufferLimit != j) {
            long j2 = j + 1;
            byte b = U0.getByte(j);
            if (b >= 0) {
                this.currentByteBufferPos++;
                return b;
            }
            if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                long j3 = 2 + j;
                int i2 = (U0.getByte(j2) << 7) ^ b;
                if (i2 < 0) {
                    i = i2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int i3 = (U0.getByte(j3) << cw.l) ^ i2;
                    if (i3 >= 0) {
                        i = i3 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int i4 = i3 ^ (U0.getByte(j4) << 21);
                        if (i4 < 0) {
                            i = (-2080896) ^ i4;
                        } else {
                            j4 = 5 + j;
                            byte b2 = U0.getByte(j5);
                            int i5 = (i4 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                j5 = 6 + j;
                                if (U0.getByte(j4) < 0) {
                                    j4 = 7 + j;
                                    if (U0.getByte(j5) < 0) {
                                        j5 = 8 + j;
                                        if (U0.getByte(j4) < 0) {
                                            j4 = 9 + j;
                                            if (U0.getByte(j5) < 0) {
                                                long j6 = j + 10;
                                                if (U0.getByte(j4) >= 0) {
                                                    i = i5;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i5;
                            }
                            i = i5;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.currentByteBufferPos = j3;
                return i;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.CodedInputStream
    public long readRawVarint64() throws IOException {
        long j;
        long j2;
        long j3;
        long j4 = this.currentByteBufferPos;
        if (this.currentByteBufferLimit != j4) {
            long j5 = j4 + 1;
            byte b = U0.getByte(j4);
            if (b >= 0) {
                this.currentByteBufferPos++;
                return b;
            }
            if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                long j6 = 2 + j4;
                int i = (U0.getByte(j5) << 7) ^ b;
                if (i < 0) {
                    j = i ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int i2 = (U0.getByte(j6) << cw.l) ^ i;
                    if (i2 >= 0) {
                        j = i2 ^ 16256;
                        j6 = j7;
                    } else {
                        long j8 = 4 + j4;
                        int i3 = i2 ^ (U0.getByte(j7) << 21);
                        if (i3 < 0) {
                            j = (-2080896) ^ i3;
                            j6 = j8;
                        } else {
                            long j9 = 5 + j4;
                            long j10 = (((long) U0.getByte(j8)) << 28) ^ ((long) i3);
                            if (j10 >= 0) {
                                j3 = 266354560;
                            } else {
                                long j11 = 6 + j4;
                                long j12 = j10 ^ (((long) U0.getByte(j9)) << 35);
                                if (j12 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j9 = 7 + j4;
                                    j10 = j12 ^ (((long) U0.getByte(j11)) << 42);
                                    if (j10 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j11 = 8 + j4;
                                        j12 = j10 ^ (((long) U0.getByte(j9)) << 49);
                                        if (j12 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j4;
                                            long j13 = (j12 ^ (((long) U0.getByte(j11)) << 56)) ^ 71499008037633920L;
                                            if (j13 < 0) {
                                                long j14 = j4 + 10;
                                                if (U0.getByte(j9) >= 0) {
                                                    j = j13;
                                                    j6 = j14;
                                                }
                                            } else {
                                                j = j13;
                                                j6 = j9;
                                            }
                                        }
                                    }
                                }
                                j = j2 ^ j12;
                                j6 = j11;
                            }
                            j = j3 ^ j10;
                            j6 = j9;
                        }
                    }
                }
                this.currentByteBufferPos = j6;
                return j;
            }
        }
        return readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.CodedInputStream
    public long readRawVarint64SlowPath() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte rawByte = readRawByte();
            j |= ((long) (rawByte & 127)) << i;
            if ((rawByte & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    @Override // com.google.protobuf.CodedInputStream
    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public int readSInt32() throws IOException {
        return CodedInputStream.decodeZigZag32(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public long readSInt64() throws IOException {
        return CodedInputStream.decodeZigZag64(readRawVarint64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public String readString() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            long j = rawVarint32;
            long j2 = this.currentByteBufferLimit;
            long j3 = this.currentByteBufferPos;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[rawVarint32];
                U0.copyMemory(j3, bArr, 0L, j);
                String str = new String(bArr, Internal.UTF_8);
                this.currentByteBufferPos += j;
                return str;
            }
        }
        if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
            byte[] bArr2 = new byte[rawVarint32];
            readRawBytesTo(bArr2, 0, rawVarint32);
            return new String(bArr2, Internal.UTF_8);
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public String readStringRequireUtf8() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            long j = rawVarint32;
            long j2 = this.currentByteBufferLimit;
            long j3 = this.currentByteBufferPos;
            if (j <= j2 - j3) {
                String strDecodeUtf8 = Ng0.decodeUtf8(this.currentByteBuffer, (int) (j3 - this.currentByteBufferStartPos), rawVarint32);
                this.currentByteBufferPos += j;
                return strDecodeUtf8;
            }
        }
        if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
            byte[] bArr = new byte[rawVarint32];
            readRawBytesTo(bArr, 0, rawVarint32);
            return Ng0.decodeUtf8(bArr, 0, rawVarint32);
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.lastTag = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.lastTag;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // com.google.protobuf.CodedInputStream
    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    @Deprecated
    public void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
        readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.protobuf.CodedInputStream
    public void resetSizeCounter() {
        this.startOffset = (int) ((((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
    }

    @Override // com.google.protobuf.CodedInputStream
    public boolean skipField(int i) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            skipRawVarint();
            return true;
        }
        if (tagWireType == 1) {
            skipRawBytes(8);
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        skipRawBytes(4);
        return true;
    }

    @Override // com.google.protobuf.CodedInputStream
    public void skipMessage() throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag));
    }

    @Override // com.google.protobuf.CodedInputStream
    public void skipRawBytes(int i) throws IOException {
        if (i < 0 || i > (((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
            if (i >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        while (i > 0) {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            int iMin = Math.min(i, (int) currentRemaining());
            i -= iMin;
            this.currentByteBufferPos += (long) iMin;
        }
    }

    private C2132o(Iterable<ByteBuffer> iterable, int i, boolean z) {
        super();
        this.currentLimit = Integer.MAX_VALUE;
        this.totalBufferSize = i;
        this.input = iterable;
        this.iterator = iterable.iterator();
        this.immutable = z;
        this.totalBytesRead = 0;
        this.startOffset = 0;
        if (i != 0) {
            tryGetNextByteBuffer();
            return;
        }
        this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
        this.currentByteBufferPos = 0L;
        this.currentByteBufferStartPos = 0L;
        this.currentByteBufferLimit = 0L;
        this.currentAddress = 0L;
    }

    @Override // com.google.protobuf.CodedInputStream
    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag, codedOutputStream));
    }

    @Override // com.google.protobuf.CodedInputStream
    public <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i, 4));
        this.recursionDepth--;
        return partialFrom;
    }

    @Override // com.google.protobuf.CodedInputStream
    public boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            long int64 = readInt64();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeUInt64NoTag(int64);
            return true;
        }
        if (tagWireType == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            ByteString bytes = readBytes();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeBytesNoTag(bytes);
            return true;
        }
        if (tagWireType == 3) {
            codedOutputStream.writeUInt32NoTag(i);
            skipMessage(codedOutputStream);
            int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
            checkLastTagWas(iMakeTag);
            codedOutputStream.writeUInt32NoTag(iMakeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            int rawLittleEndian32 = readRawLittleEndian32();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.protobuf.CodedInputStream
    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(iPushLimit);
            return partialFrom;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
