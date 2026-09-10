package com.google.protobuf;

import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2130n extends CodedInputStream {
    private final byte[] buffer;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final boolean immutable;
    private int lastTag;
    private int limit;
    private int pos;
    private int startPos;

    private void recomputeBufferSizeAfterLimit() {
        int i = this.limit + this.bufferSizeAfterLimit;
        this.limit = i;
        int i2 = i - this.startPos;
        int i3 = this.currentLimit;
        if (i2 <= i3) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i4 = i2 - i3;
        this.bufferSizeAfterLimit = i4;
        this.limit = i - i4;
    }

    private void skipRawVarint() throws IOException {
        if (this.limit - this.pos >= 10) {
            skipRawVarintFastPath();
        } else {
            skipRawVarintSlowPath();
        }
    }

    private void skipRawVarintFastPath() throws IOException {
        for (int i = 0; i < 10; i++) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            this.pos = i2 + 1;
            if (bArr[i2] >= 0) {
                return;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    private void skipRawVarintSlowPath() throws IOException {
        for (int i = 0; i < 10; i++) {
            if (readRawByte() >= 0) {
                return;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
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
        return this.pos - this.startPos;
    }

    @Override // com.google.protobuf.CodedInputStream
    public boolean isAtEnd() throws IOException {
        return this.pos == this.limit;
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
        if (totalBytesRead < 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
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
            int i = this.limit;
            int i2 = this.pos;
            if (rawVarint32 <= i - i2) {
                ByteBuffer byteBufferWrap = (this.immutable || !this.enableAliasing) ? ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i2, i2 + rawVarint32)) : ByteBuffer.wrap(this.buffer, i2, rawVarint32).slice();
                this.pos += rawVarint32;
                return byteBufferWrap;
            }
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
            int i = this.limit;
            int i2 = this.pos;
            if (rawVarint32 <= i - i2) {
                ByteString byteStringWrap = (this.immutable && this.enableAliasing) ? ByteString.wrap(this.buffer, i2, rawVarint32) : ByteString.copyFrom(this.buffer, i2, rawVarint32);
                this.pos += rawVarint32;
                return byteStringWrap;
            }
        }
        return rawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(rawVarint32));
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
        int i = this.pos;
        if (i == this.limit) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 1;
        return bArr[i];
    }

    @Override // com.google.protobuf.CodedInputStream
    public byte[] readRawBytes(int i) throws IOException {
        if (i > 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.pos = i4;
                return Arrays.copyOfRange(this.buffer, i3, i4);
            }
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
        int i = this.pos;
        if (this.limit - i < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public long readRawLittleEndian64() throws IOException {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // com.google.protobuf.CodedInputStream
    public int readRawVarint32() throws IOException {
        int i;
        int i2 = this.pos;
        int i3 = this.limit;
        if (i3 != i2) {
            byte[] bArr = this.buffer;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.pos = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << cw.l) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.pos = i5;
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
        int i = this.pos;
        int i2 = this.limit;
        if (i2 != i) {
            byte[] bArr = this.buffer;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.pos = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << cw.l) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i10]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i11 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i11;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j = j7 ^ j2;
                                i4 = i10;
                            }
                            j = j6 ^ j3;
                        }
                    }
                }
                this.pos = i4;
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
            int i = this.limit;
            int i2 = this.pos;
            if (rawVarint32 <= i - i2) {
                String str = new String(this.buffer, i2, rawVarint32, Internal.UTF_8);
                this.pos += rawVarint32;
                return str;
            }
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
            int i = this.limit;
            int i2 = this.pos;
            if (rawVarint32 <= i - i2) {
                String strDecodeUtf8 = Ng0.decodeUtf8(this.buffer, i2, rawVarint32);
                this.pos += rawVarint32;
                return strDecodeUtf8;
            }
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
        this.startPos = this.pos;
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
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    private C2130n(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.currentLimit = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.startPos = i;
        this.immutable = z;
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
