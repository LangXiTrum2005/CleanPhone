package com.google.protobuf;

import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2136q extends CodedInputStream {
    private final long address;
    private final ByteBuffer buffer;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final boolean immutable;
    private int lastTag;
    private long limit;
    private long pos;
    private long startPos;

    private int bufferPos(long j) {
        return (int) (j - this.address);
    }

    public static boolean isSupported() {
        return U0.hasUnsafeByteBufferOperations();
    }

    private void recomputeBufferSizeAfterLimit() {
        long j = this.limit + ((long) this.bufferSizeAfterLimit);
        this.limit = j;
        int i = (int) (j - this.startPos);
        int i2 = this.currentLimit;
        if (i <= i2) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i3 = i - i2;
        this.bufferSizeAfterLimit = i3;
        this.limit = j - ((long) i3);
    }

    private int remaining() {
        return (int) (this.limit - this.pos);
    }

    private void skipRawVarint() throws IOException {
        if (remaining() >= 10) {
            skipRawVarintFastPath();
        } else {
            skipRawVarintSlowPath();
        }
    }

    private void skipRawVarintFastPath() throws IOException {
        for (int i = 0; i < 10; i++) {
            long j = this.pos;
            this.pos = 1 + j;
            if (U0.getByte(j) >= 0) {
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

    private ByteBuffer slice(long j, long j2) throws IOException {
        int iPosition = this.buffer.position();
        int iLimit = this.buffer.limit();
        ByteBuffer byteBuffer = this.buffer;
        try {
            try {
                byteBuffer.position(bufferPos(j));
                byteBuffer.limit(bufferPos(j2));
                ByteBuffer byteBufferSlice = this.buffer.slice();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                return byteBufferSlice;
            } catch (IllegalArgumentException e) {
                InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                invalidProtocolBufferExceptionTruncatedMessage.initCause(e);
                throw invalidProtocolBufferExceptionTruncatedMessage;
            }
        } catch (Throwable th) {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            throw th;
        }
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
        return (int) (this.pos - this.startPos);
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
        if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (this.immutable || !this.enableAliasing) {
            byte[] bArr = new byte[rawVarint32];
            long j = rawVarint32;
            U0.copyMemory(this.pos, bArr, 0L, j);
            this.pos += j;
            return ByteBuffer.wrap(bArr);
        }
        long j2 = this.pos;
        long j3 = rawVarint32;
        ByteBuffer byteBufferSlice = slice(j2, j2 + j3);
        this.pos += j3;
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.CodedInputStream
    public ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (this.immutable && this.enableAliasing) {
            long j = this.pos;
            long j2 = rawVarint32;
            ByteBuffer byteBufferSlice = slice(j, j + j2);
            this.pos += j2;
            return ByteString.wrap(byteBufferSlice);
        }
        byte[] bArr = new byte[rawVarint32];
        long j3 = rawVarint32;
        U0.copyMemory(this.pos, bArr, 0L, j3);
        this.pos += j3;
        return ByteString.wrap(bArr);
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
        long j = this.pos;
        if (j == this.limit) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.pos = 1 + j;
        return U0.getByte(j);
    }

    @Override // com.google.protobuf.CodedInputStream
    public byte[] readRawBytes(int i) throws IOException {
        if (i < 0 || i > remaining()) {
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArr = new byte[i];
        long j = this.pos;
        long j2 = i;
        slice(j, j + j2).get(bArr);
        this.pos += j2;
        return bArr;
    }

    @Override // com.google.protobuf.CodedInputStream
    public int readRawLittleEndian32() throws IOException {
        long j = this.pos;
        if (this.limit - j < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.pos = 4 + j;
        return ((U0.getByte(j + 3) & 255) << 24) | (U0.getByte(j) & 255) | ((U0.getByte(1 + j) & 255) << 8) | ((U0.getByte(2 + j) & 255) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public long readRawLittleEndian64() throws IOException {
        long j = this.pos;
        if (this.limit - j < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.pos = 8 + j;
        return ((((long) U0.getByte(j + 7)) & 255) << 56) | (((long) U0.getByte(j)) & 255) | ((((long) U0.getByte(1 + j)) & 255) << 8) | ((((long) U0.getByte(2 + j)) & 255) << 16) | ((((long) U0.getByte(3 + j)) & 255) << 24) | ((((long) U0.getByte(4 + j)) & 255) << 32) | ((((long) U0.getByte(5 + j)) & 255) << 40) | ((((long) U0.getByte(6 + j)) & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (com.google.protobuf.U0.getByte(r3) < 0) goto L34;
     */
    @Override // com.google.protobuf.CodedInputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int readRawVarint32() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.pos
            long r2 = r10.limit
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L8e
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = com.google.protobuf.U0.getByte(r0)
            if (r4 < 0) goto L16
            r10.pos = r2
            return r4
        L16:
            long r5 = r10.limit
            long r5 = r5 - r2
            r7 = 9
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L21
            goto L8e
        L21:
            r5 = 2
            long r5 = r5 + r0
            byte r2 = com.google.protobuf.U0.getByte(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L31
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L98
        L31:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = com.google.protobuf.U0.getByte(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L41
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3f:
            r5 = r3
            goto L98
        L41:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = com.google.protobuf.U0.getByte(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L52
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L98
        L52:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = com.google.protobuf.U0.getByte(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L96
            r5 = 6
            long r5 = r5 + r0
            byte r3 = com.google.protobuf.U0.getByte(r3)
            if (r3 >= 0) goto L94
            r3 = 7
            long r3 = r3 + r0
            byte r5 = com.google.protobuf.U0.getByte(r5)
            if (r5 >= 0) goto L96
            r5 = 8
            long r5 = r5 + r0
            byte r3 = com.google.protobuf.U0.getByte(r3)
            if (r3 >= 0) goto L94
            long r3 = r0 + r7
            byte r5 = com.google.protobuf.U0.getByte(r5)
            if (r5 >= 0) goto L96
            r5 = 10
            long r5 = r5 + r0
            byte r0 = com.google.protobuf.U0.getByte(r3)
            if (r0 >= 0) goto L94
        L8e:
            long r0 = r10.readRawVarint64SlowPath()
            int r1 = (int) r0
            return r1
        L94:
            r0 = r2
            goto L98
        L96:
            r0 = r2
            goto L3f
        L98:
            r10.pos = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C2136q.readRawVarint32():int");
    }

    @Override // com.google.protobuf.CodedInputStream
    public long readRawVarint64() throws IOException {
        long j;
        long j2;
        long j3;
        int i;
        long j4 = this.pos;
        if (this.limit != j4) {
            long j5 = 1 + j4;
            byte b = U0.getByte(j4);
            if (b >= 0) {
                this.pos = j5;
                return b;
            }
            if (this.limit - j5 >= 9) {
                long j6 = 2 + j4;
                int i2 = (U0.getByte(j5) << 7) ^ b;
                if (i2 >= 0) {
                    long j7 = 3 + j4;
                    int i3 = i2 ^ (U0.getByte(j6) << cw.l);
                    if (i3 >= 0) {
                        j = i3 ^ 16256;
                        j6 = j7;
                    } else {
                        j6 = 4 + j4;
                        int i4 = i3 ^ (U0.getByte(j7) << 21);
                        if (i4 < 0) {
                            i = (-2080896) ^ i4;
                        } else {
                            long j8 = 5 + j4;
                            long j9 = ((long) i4) ^ (((long) U0.getByte(j6)) << 28);
                            if (j9 >= 0) {
                                j3 = 266354560;
                            } else {
                                long j10 = 6 + j4;
                                long j11 = j9 ^ (((long) U0.getByte(j8)) << 35);
                                if (j11 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j8 = 7 + j4;
                                    j9 = j11 ^ (((long) U0.getByte(j10)) << 42);
                                    if (j9 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j10 = 8 + j4;
                                        j11 = j9 ^ (((long) U0.getByte(j8)) << 49);
                                        if (j11 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            long j12 = j4 + 9;
                                            long j13 = (j11 ^ (((long) U0.getByte(j10)) << 56)) ^ 71499008037633920L;
                                            if (j13 < 0) {
                                                long j14 = j4 + 10;
                                                if (U0.getByte(j12) >= 0) {
                                                    j6 = j14;
                                                    j = j13;
                                                }
                                            } else {
                                                j = j13;
                                                j6 = j12;
                                            }
                                        }
                                    }
                                }
                                j = j2 ^ j11;
                                j6 = j10;
                            }
                            j = j3 ^ j9;
                            j6 = j8;
                        }
                    }
                    this.pos = j6;
                    return j;
                }
                i = i2 ^ (-128);
                j = i;
                this.pos = j6;
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
        if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = new byte[rawVarint32];
        long j = rawVarint32;
        U0.copyMemory(this.pos, bArr, 0L, j);
        String str = new String(bArr, Internal.UTF_8);
        this.pos += j;
        return str;
    }

    @Override // com.google.protobuf.CodedInputStream
    public String readStringRequireUtf8() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
            String strDecodeUtf8 = Ng0.decodeUtf8(this.buffer, bufferPos(this.pos), rawVarint32);
            this.pos += (long) rawVarint32;
            return strDecodeUtf8;
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
        if (i >= 0 && i <= remaining()) {
            this.pos += (long) i;
        } else {
            if (i >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    private C2136q(ByteBuffer byteBuffer, boolean z) {
        super();
        this.currentLimit = Integer.MAX_VALUE;
        this.buffer = byteBuffer;
        long jAddressOffset = U0.addressOffset(byteBuffer);
        this.address = jAddressOffset;
        this.limit = ((long) byteBuffer.limit()) + jAddressOffset;
        long jPosition = jAddressOffset + ((long) byteBuffer.position());
        this.pos = jPosition;
        this.startPos = jPosition;
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
