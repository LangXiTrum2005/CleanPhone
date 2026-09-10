package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends CodedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24984i;

    public w(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.f24984i = Integer.MAX_VALUE;
        this.f24976a = bArr;
        this.f24978c = i11 + i10;
        this.f24980e = i10;
        this.f24981f = i10;
        this.f24977b = z10;
    }

    public final void a() {
        int i10 = this.f24978c + this.f24979d;
        this.f24978c = i10;
        int i11 = i10 - this.f24981f;
        int i12 = this.f24984i;
        if (i11 <= i12) {
            this.f24979d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f24979d = i13;
        this.f24978c = i10 - i13;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
        if (this.f24982g != i10) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z10) {
        this.f24983h = z10;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i10 = this.f24984i;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f24982g;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return this.f24980e - this.f24981f;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return this.f24980e == this.f24978c;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i10) {
        this.f24984i = i10;
        a();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i10) {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i10;
        if (totalBytesRead < 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        int i11 = this.f24984i;
        if (totalBytesRead > i11) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f24984i = totalBytesRead;
        a();
        return i11;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean readBool() {
        return readRawVarint64() != 0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readByteArray() {
        return readRawBytes(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i10 = this.f24978c;
            int i11 = this.f24980e;
            if (rawVarint32 <= i10 - i11) {
                boolean z10 = this.f24977b;
                byte[] bArr = this.f24976a;
                ByteBuffer byteBufferWrap = (z10 || !this.f24983h) ? ByteBuffer.wrap(Arrays.copyOfRange(bArr, i11, i11 + rawVarint32)) : ByteBuffer.wrap(bArr, i11, rawVarint32).slice();
                this.f24980e += rawVarint32;
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
    public final ByteString readBytes() {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i10 = this.f24978c;
            int i11 = this.f24980e;
            if (rawVarint32 <= i10 - i11) {
                boolean z10 = this.f24977b;
                byte[] bArr = this.f24976a;
                ByteString byteStringWrap = (z10 && this.f24983h) ? ByteString.wrap(bArr, i11, rawVarint32) : ByteString.copyFrom(bArr, i11, rawVarint32);
                this.f24980e += rawVarint32;
                return byteStringWrap;
            }
        }
        return rawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(rawVarint32));
    }

    @Override // com.google.protobuf.CodedInputStream
    public final double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readEnum() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readFixed32() {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readFixed64() {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i10, 4));
        this.recursionDepth--;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readInt32() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readInt64() {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
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
    public final byte readRawByte() throws InvalidProtocolBufferException {
        int i10 = this.f24980e;
        if (i10 == this.f24978c) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f24980e = i10 + 1;
        return this.f24976a[i10];
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i10) throws InvalidProtocolBufferException {
        if (i10 > 0) {
            int i11 = this.f24978c;
            int i12 = this.f24980e;
            if (i10 <= i11 - i12) {
                int i13 = i10 + i12;
                this.f24980e = i13;
                return Arrays.copyOfRange(this.f24976a, i12, i13);
            }
        }
        if (i10 > 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i10 == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() throws InvalidProtocolBufferException {
        int i10 = this.f24980e;
        if (this.f24978c - i10 < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f24980e = i10 + 4;
        byte[] bArr = this.f24976a;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() throws InvalidProtocolBufferException {
        int i10 = this.f24980e;
        if (this.f24978c - i10 < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f24980e = i10 + 8;
        byte[] bArr = this.f24976a;
        return ((((long) bArr[i10 + 1]) & 255) << 8) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i10;
        int i11 = this.f24980e;
        int i12 = this.f24978c;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f24976a;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f24980e = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f24980e = i14;
                return i10;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawVarint64() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f24980e;
        int i11 = this.f24978c;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f24976a;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f24980e = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j13 = (-2080896) ^ i18;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (((long) bArr[i17]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (((long) bArr[i17]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j16 = j15 ^ (((long) bArr[i13]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j13 = j11 ^ j16;
                            }
                            j10 = j12 ^ j15;
                        }
                        i13 = i17;
                        j10 = j13;
                    }
                }
                this.f24980e = i13;
                return j10;
            }
        }
        return readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte rawByte = readRawByte();
            j10 |= ((long) (rawByte & 127)) << i10;
            if ((rawByte & 128) == 0) {
                return j10;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readSFixed32() {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readSFixed64() {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readSInt32() {
        return CodedInputStream.decodeZigZag32(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readSInt64() {
        return CodedInputStream.decodeZigZag64(readRawVarint64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readString() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i10 = this.f24978c;
            int i11 = this.f24980e;
            if (rawVarint32 <= i10 - i11) {
                String str = new String(this.f24976a, i11, rawVarint32, Internal.UTF_8);
                this.f24980e += rawVarint32;
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
    public final String readStringRequireUtf8() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i10 = this.f24978c;
            int i11 = this.f24980e;
            if (rawVarint32 <= i10 - i11) {
                String strD = a5.f24770a.d(this.f24976a, i11, rawVarint32);
                this.f24980e += rawVarint32;
                return strD;
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
    public final int readTag() throws InvalidProtocolBufferException {
        if (isAtEnd()) {
            this.f24982g = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f24982g = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f24982g;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readUInt32() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readUInt64() {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException {
        readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void resetSizeCounter() {
        this.f24981f = this.f24980e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i10) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i10);
        int i11 = 0;
        if (tagWireType == 0) {
            if (this.f24978c - this.f24980e < 10) {
                while (i11 < 10) {
                    if (readRawByte() < 0) {
                        i11++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i11 < 10) {
                int i12 = this.f24980e;
                this.f24980e = i12 + 1;
                if (this.f24976a[i12] < 0) {
                    i11++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
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
            checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4));
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
    public final void skipRawBytes(int i10) throws InvalidProtocolBufferException {
        if (i10 >= 0) {
            int i11 = this.f24978c;
            int i12 = this.f24980e;
            if (i10 <= i11 - i12) {
                this.f24980e = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final MessageLite readGroup(int i10, Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        checkRecursionLimit();
        this.recursionDepth++;
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i10, 4));
        this.recursionDepth--;
        return messageLite;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(iPushLimit);
            return messageLite;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            long rawVarint64 = readRawVarint64();
            codedOutputStream.writeUInt32NoTag(i10);
            codedOutputStream.writeUInt64NoTag(rawVarint64);
            return true;
        }
        if (tagWireType == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeUInt32NoTag(i10);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            ByteString bytes = readBytes();
            codedOutputStream.writeUInt32NoTag(i10);
            codedOutputStream.writeBytesNoTag(bytes);
            return true;
        }
        if (tagWireType == 3) {
            codedOutputStream.writeUInt32NoTag(i10);
            skipMessage(codedOutputStream);
            int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4);
            checkLastTagWas(iMakeTag);
            codedOutputStream.writeUInt32NoTag(iMakeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            int rawLittleEndian32 = readRawLittleEndian32();
            codedOutputStream.writeUInt32NoTag(i10);
            codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }
}
