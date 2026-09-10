package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends CodedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f25044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f25047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f25048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f25049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25053j;

    public z(ByteBuffer byteBuffer, boolean z10) {
        super();
        this.f25053j = Integer.MAX_VALUE;
        this.f25044a = byteBuffer;
        long jB = x4.b(byteBuffer);
        this.f25046c = jB;
        this.f25047d = ((long) byteBuffer.limit()) + jB;
        long jPosition = jB + ((long) byteBuffer.position());
        this.f25048e = jPosition;
        this.f25049f = jPosition;
        this.f25045b = z10;
    }

    public final void a() {
        long j10 = this.f25047d + ((long) this.f25050g);
        this.f25047d = j10;
        int i10 = (int) (j10 - this.f25049f);
        int i11 = this.f25053j;
        if (i10 <= i11) {
            this.f25050g = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f25050g = i12;
        this.f25047d = j10 - ((long) i12);
    }

    public final int b() {
        return (int) (this.f25047d - this.f25048e);
    }

    public final ByteBuffer c(long j10, long j11) {
        long j12 = this.f25046c;
        ByteBuffer byteBuffer = this.f25044a;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            try {
                byteBuffer.position((int) (j10 - j12));
                byteBuffer.limit((int) (j11 - j12));
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                return byteBufferSlice;
            } catch (IllegalArgumentException e10) {
                InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                invalidProtocolBufferExceptionTruncatedMessage.initCause(e10);
                throw invalidProtocolBufferExceptionTruncatedMessage;
            }
        } catch (Throwable th2) {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            throw th2;
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
        if (this.f25051h != i10) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z10) {
        this.f25052i = z10;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i10 = this.f25053j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f25051h;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return (int) (this.f25048e - this.f25049f);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return this.f25048e == this.f25047d;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i10) {
        this.f25053j = i10;
        a();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i10;
        int i11 = this.f25053j;
        if (totalBytesRead > i11) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f25053j = totalBytesRead;
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
        if (rawVarint32 <= 0 || rawVarint32 > b()) {
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (this.f25045b || !this.f25052i) {
            byte[] bArr = new byte[rawVarint32];
            long j10 = rawVarint32;
            x4.g(this.f25048e, bArr, 0L, j10);
            this.f25048e += j10;
            return ByteBuffer.wrap(bArr);
        }
        long j11 = this.f25048e;
        long j12 = rawVarint32;
        ByteBuffer byteBufferC = c(j11, j11 + j12);
        this.f25048e += j12;
        return byteBufferC;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 <= 0 || rawVarint32 > b()) {
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (this.f25045b && this.f25052i) {
            long j10 = this.f25048e;
            long j11 = rawVarint32;
            ByteBuffer byteBufferC = c(j10, j10 + j11);
            this.f25048e += j11;
            return ByteString.wrap(byteBufferC);
        }
        byte[] bArr = new byte[rawVarint32];
        long j12 = rawVarint32;
        x4.g(this.f25048e, bArr, 0L, j12);
        this.f25048e += j12;
        return ByteString.wrap(bArr);
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
        long j10 = this.f25048e;
        if (j10 == this.f25047d) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f25048e = 1 + j10;
        return x4.f25021c.f(j10);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0 || i10 > b()) {
            if (i10 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i10 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArr = new byte[i10];
        long j10 = this.f25048e;
        long j11 = i10;
        c(j10, j10 + j11).get(bArr);
        this.f25048e += j11;
        return bArr;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() throws InvalidProtocolBufferException {
        long j10 = this.f25048e;
        if (this.f25047d - j10 < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f25048e = 4 + j10;
        w4 w4Var = x4.f25021c;
        return ((w4Var.f(j10 + 3) & 255) << 24) | (w4Var.f(j10) & 255) | ((w4Var.f(1 + j10) & 255) << 8) | ((w4Var.f(2 + j10) & 255) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() throws InvalidProtocolBufferException {
        long j10 = this.f25048e;
        if (this.f25047d - j10 < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f25048e = 8 + j10;
        w4 w4Var = x4.f25021c;
        return ((((long) w4Var.f(j10 + 7)) & 255) << 56) | (((long) w4Var.f(j10)) & 255) | ((((long) w4Var.f(1 + j10)) & 255) << 8) | ((((long) w4Var.f(2 + j10)) & 255) << 16) | ((((long) w4Var.f(3 + j10)) & 255) << 24) | ((((long) w4Var.f(4 + j10)) & 255) << 32) | ((((long) w4Var.f(5 + j10)) & 255) << 40) | ((((long) w4Var.f(6 + j10)) & 255) << 48);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[PHI: r6
  0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.f(r8) < 0) goto L34;
     */
    @Override // com.google.protobuf.CodedInputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int readRawVarint32() {
        /*
            r12 = this;
            long r0 = r12.f25048e
            long r2 = r12.f25047d
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L93
        La:
            r2 = 1
            long r2 = r2 + r0
            com.google.protobuf.w4 r4 = com.google.protobuf.x4.f25021c
            byte r5 = r4.f(r0)
            if (r5 < 0) goto L18
            r12.f25048e = r2
            return r5
        L18:
            long r6 = r12.f25047d
            long r6 = r6 - r2
            r8 = 9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L93
        L23:
            r6 = 2
            long r6 = r6 + r0
            byte r2 = r4.f(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L33
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La0
        L33:
            r10 = 3
            long r10 = r10 + r0
            byte r3 = r4.f(r6)
            int r3 = r3 << 14
            r2 = r2 ^ r3
            if (r2 < 0) goto L43
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L41:
            r6 = r10
            goto La0
        L43:
            r5 = 4
            long r6 = r0 + r5
            byte r3 = r4.f(r10)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L55
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto La0
        L55:
            r10 = 5
            long r10 = r10 + r0
            byte r3 = r4.f(r6)
            int r5 = r3 << 28
            r2 = r2 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r5
            if (r3 >= 0) goto L9e
            r5 = 6
            long r6 = r0 + r5
            byte r3 = r4.f(r10)
            if (r3 >= 0) goto L99
            r10 = 7
            long r10 = r10 + r0
            byte r3 = r4.f(r6)
            if (r3 >= 0) goto L9e
            r5 = 8
            long r6 = r0 + r5
            byte r3 = r4.f(r10)
            if (r3 >= 0) goto L99
            long r8 = r8 + r0
            byte r3 = r4.f(r6)
            if (r3 >= 0) goto L9b
            r5 = 10
            long r6 = r0 + r5
            byte r0 = r4.f(r8)
            if (r0 >= 0) goto L99
        L93:
            long r0 = r12.readRawVarint64SlowPath()
            int r12 = (int) r0
            return r12
        L99:
            r0 = r2
            goto La0
        L9b:
            r0 = r2
            r6 = r8
            goto La0
        L9e:
            r0 = r2
            goto L41
        La0:
            r12.f25048e = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z.readRawVarint32():int");
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawVarint64() {
        long j10;
        long j11;
        long j12;
        int i10;
        long j13 = this.f25048e;
        if (this.f25047d != j13) {
            long j14 = 1 + j13;
            w4 w4Var = x4.f25021c;
            byte bF = w4Var.f(j13);
            if (bF >= 0) {
                this.f25048e = j14;
                return bF;
            }
            if (this.f25047d - j14 >= 9) {
                long j15 = 2 + j13;
                int iF = (w4Var.f(j14) << 7) ^ bF;
                if (iF >= 0) {
                    long j16 = 3 + j13;
                    int iF2 = iF ^ (w4Var.f(j15) << 14);
                    if (iF2 < 0) {
                        j15 = j13 + 4;
                        int iF3 = iF2 ^ (w4Var.f(j16) << 21);
                        if (iF3 < 0) {
                            i10 = (-2080896) ^ iF3;
                        } else {
                            j16 = 5 + j13;
                            long jF = ((long) iF3) ^ (((long) w4Var.f(j15)) << 28);
                            if (jF >= 0) {
                                j12 = 266354560;
                            } else {
                                long j17 = 6 + j13;
                                long jF2 = jF ^ (((long) w4Var.f(j16)) << 35);
                                if (jF2 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    j16 = 7 + j13;
                                    jF = jF2 ^ (((long) w4Var.f(j17)) << 42);
                                    if (jF >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        j17 = 8 + j13;
                                        jF2 = jF ^ (((long) w4Var.f(j16)) << 49);
                                        if (jF2 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            long j18 = j13 + 9;
                                            long jF3 = (jF2 ^ (((long) w4Var.f(j17)) << 56)) ^ 71499008037633920L;
                                            if (jF3 < 0) {
                                                long j19 = j13 + 10;
                                                if (w4Var.f(j18) >= 0) {
                                                    j15 = j19;
                                                    j10 = jF3;
                                                }
                                            } else {
                                                j10 = jF3;
                                                j15 = j18;
                                            }
                                        }
                                    }
                                }
                                j10 = j11 ^ jF2;
                                j15 = j17;
                            }
                            j10 = j12 ^ jF;
                        }
                        this.f25048e = j15;
                        return j10;
                    }
                    j10 = iF2 ^ 16256;
                    j15 = j16;
                    this.f25048e = j15;
                    return j10;
                }
                i10 = iF ^ (-128);
                j10 = i10;
                this.f25048e = j15;
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
        if (rawVarint32 <= 0 || rawVarint32 > b()) {
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = new byte[rawVarint32];
        long j10 = rawVarint32;
        x4.g(this.f25048e, bArr, 0L, j10);
        String str = new String(bArr, Internal.UTF_8);
        this.f25048e += j10;
        return str;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0 && rawVarint32 <= b()) {
            String strC = a5.c((int) (this.f25048e - this.f25046c), this.f25044a, rawVarint32);
            this.f25048e += (long) rawVarint32;
            return strC;
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
            this.f25051h = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f25051h = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f25051h;
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
        this.f25049f = this.f25048e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i10) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i10);
        int i11 = 0;
        if (tagWireType == 0) {
            if (b() < 10) {
                while (i11 < 10) {
                    if (readRawByte() < 0) {
                        i11++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i11 < 10) {
                long j10 = this.f25048e;
                this.f25048e = 1 + j10;
                if (x4.f25021c.f(j10) < 0) {
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
        if (i10 >= 0 && i10 <= b()) {
            this.f25048e += (long) i10;
        } else {
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
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
