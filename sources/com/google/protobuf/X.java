package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends CodedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f24999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f25000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f25001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25009k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f25010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f25011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f25012o;

    public x(Iterable iterable, int i10, boolean z10) {
        super();
        this.f25006h = Integer.MAX_VALUE;
        this.f25004f = i10;
        this.f24999a = iterable;
        this.f25000b = iterable.iterator();
        this.f25002d = z10;
        this.f25008j = 0;
        this.f25009k = 0;
        if (i10 != 0) {
            g();
            return;
        }
        this.f25001c = Internal.EMPTY_BYTE_BUFFER;
        this.l = 0L;
        this.f25010m = 0L;
        this.f25012o = 0L;
        this.f25011n = 0L;
    }

    public final long a() {
        return this.f25012o - this.l;
    }

    public final void b() throws InvalidProtocolBufferException {
        if (!this.f25000b.hasNext()) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        g();
    }

    public final void c(int i10, byte[] bArr) throws InvalidProtocolBufferException {
        if (i10 < 0 || i10 > e()) {
            if (i10 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i10 != 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            return;
        }
        int i11 = i10;
        while (i11 > 0) {
            if (a() == 0) {
                b();
            }
            int iMin = Math.min(i11, (int) a());
            long j10 = iMin;
            x4.g(this.l, bArr, i10 - i11, j10);
            i11 -= iMin;
            this.l += j10;
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
        if (this.f25007i != i10) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final void d() {
        int i10 = this.f25004f + this.f25005g;
        this.f25004f = i10;
        int i11 = i10 - this.f25009k;
        int i12 = this.f25006h;
        if (i11 <= i12) {
            this.f25005g = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f25005g = i13;
        this.f25004f = i10 - i13;
    }

    public final int e() {
        return (int) ((((long) (this.f25004f - this.f25008j)) - this.l) + this.f25010m);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z10) {
        this.f25003e = z10;
    }

    public final ByteBuffer f(int i10, int i11) {
        int iPosition = this.f25001c.position();
        int iLimit = this.f25001c.limit();
        ByteBuffer byteBuffer = this.f25001c;
        try {
            try {
                byteBuffer.position(i10);
                byteBuffer.limit(i11);
                ByteBuffer byteBufferSlice = this.f25001c.slice();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                return byteBufferSlice;
            } catch (IllegalArgumentException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } catch (Throwable th2) {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            throw th2;
        }
    }

    public final void g() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f25000b.next();
        this.f25001c = byteBuffer;
        this.f25008j += (int) (this.l - this.f25010m);
        long jPosition = byteBuffer.position();
        this.l = jPosition;
        this.f25010m = jPosition;
        this.f25012o = this.f25001c.limit();
        long jB = x4.b(this.f25001c);
        this.f25011n = jB;
        this.l += jB;
        this.f25010m += jB;
        this.f25012o += jB;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i10 = this.f25006h;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f25007i;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return (int) ((((long) (this.f25008j - this.f25009k)) + this.l) - this.f25010m);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return (((long) this.f25008j) + this.l) - this.f25010m == ((long) this.f25004f);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i10) {
        this.f25006h = i10;
        d();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i10;
        int i11 = this.f25006h;
        if (totalBytesRead > i11) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f25006h = totalBytesRead;
        d();
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
            long j10 = rawVarint32;
            if (j10 <= a()) {
                if (this.f25002d || !this.f25003e) {
                    byte[] bArr = new byte[rawVarint32];
                    x4.g(this.l, bArr, 0L, j10);
                    this.l += j10;
                    return ByteBuffer.wrap(bArr);
                }
                long j11 = this.l + j10;
                this.l = j11;
                long j12 = j11 - this.f25011n;
                return f((int) (j12 - j10), (int) j12);
            }
        }
        if (rawVarint32 > 0 && rawVarint32 <= e()) {
            byte[] bArr2 = new byte[rawVarint32];
            c(rawVarint32, bArr2);
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
    public final ByteString readBytes() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        boolean z10 = this.f25002d;
        if (rawVarint32 > 0) {
            long j10 = rawVarint32;
            long j11 = this.f25012o;
            long j12 = this.l;
            if (j10 <= j11 - j12) {
                if (z10 && this.f25003e) {
                    int i10 = (int) (j12 - this.f25011n);
                    ByteString byteStringWrap = ByteString.wrap(f(i10, rawVarint32 + i10));
                    this.l += j10;
                    return byteStringWrap;
                }
                byte[] bArr = new byte[rawVarint32];
                x4.g(j12, bArr, 0L, j10);
                this.l += j10;
                return ByteString.wrap(bArr);
            }
        }
        if (rawVarint32 <= 0 || rawVarint32 > e()) {
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (!z10 || !this.f25003e) {
            byte[] bArr2 = new byte[rawVarint32];
            c(rawVarint32, bArr2);
            return ByteString.wrap(bArr2);
        }
        ArrayList arrayList = new ArrayList();
        while (rawVarint32 > 0) {
            if (a() == 0) {
                b();
            }
            int iMin = Math.min(rawVarint32, (int) a());
            int i11 = (int) (this.l - this.f25011n);
            arrayList.add(ByteString.wrap(f(i11, i11 + iMin)));
            rawVarint32 -= iMin;
            this.l += (long) iMin;
        }
        return ByteString.copyFrom(arrayList);
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
        if (a() == 0) {
            b();
        }
        long j10 = this.l;
        this.l = 1 + j10;
        return x4.f25021c.f(j10);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i10) throws InvalidProtocolBufferException {
        if (i10 >= 0) {
            long j10 = i10;
            if (j10 <= a()) {
                byte[] bArr = new byte[i10];
                x4.g(this.l, bArr, 0L, j10);
                this.l += j10;
                return bArr;
            }
        }
        if (i10 >= 0 && i10 <= e()) {
            byte[] bArr2 = new byte[i10];
            c(i10, bArr2);
            return bArr2;
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
    public final int readRawLittleEndian32() {
        if (a() < 4) {
            return ((readRawByte() & 255) << 24) | (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16);
        }
        long j10 = this.l;
        this.l = 4 + j10;
        w4 w4Var = x4.f25021c;
        return ((w4Var.f(j10 + 3) & 255) << 24) | (w4Var.f(j10) & 255) | ((w4Var.f(1 + j10) & 255) << 8) | ((w4Var.f(2 + j10) & 255) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() throws InvalidProtocolBufferException {
        char c4;
        long rawByte;
        byte rawByte2;
        if (a() >= 8) {
            long j10 = this.l;
            this.l = 8 + j10;
            w4 w4Var = x4.f25021c;
            c4 = '8';
            rawByte = (((long) w4Var.f(j10)) & 255) | ((((long) w4Var.f(j10 + 1)) & 255) << 8) | ((((long) w4Var.f(j10 + 2)) & 255) << 16) | ((((long) w4Var.f(3 + j10)) & 255) << 24) | ((((long) w4Var.f(4 + j10)) & 255) << 32) | ((((long) w4Var.f(5 + j10)) & 255) << 40) | ((((long) w4Var.f(6 + j10)) & 255) << 48);
            rawByte2 = w4Var.f(j10 + 7);
        } else {
            c4 = '8';
            rawByte = (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48);
            rawByte2 = readRawByte();
        }
        return rawByte | ((((long) rawByte2) & 255) << c4);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i10;
        long j10 = this.l;
        if (this.f25012o != j10) {
            long j11 = j10 + 1;
            w4 w4Var = x4.f25021c;
            byte bF = w4Var.f(j10);
            if (bF >= 0) {
                this.l++;
                return bF;
            }
            if (this.f25012o - this.l >= 10) {
                long j12 = 2 + j10;
                int iF = (w4Var.f(j11) << 7) ^ bF;
                if (iF < 0) {
                    i10 = iF ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int iF2 = (w4Var.f(j12) << 14) ^ iF;
                    if (iF2 >= 0) {
                        i10 = iF2 ^ 16256;
                    } else {
                        long j14 = 4 + j10;
                        int iF3 = iF2 ^ (w4Var.f(j13) << 21);
                        if (iF3 < 0) {
                            i10 = (-2080896) ^ iF3;
                        } else {
                            j13 = 5 + j10;
                            byte bF2 = w4Var.f(j14);
                            int i11 = (iF3 ^ (bF2 << 28)) ^ 266354560;
                            if (bF2 < 0) {
                                j14 = 6 + j10;
                                if (w4Var.f(j13) < 0) {
                                    j13 = 7 + j10;
                                    if (w4Var.f(j14) < 0) {
                                        j14 = 8 + j10;
                                        if (w4Var.f(j13) < 0) {
                                            j13 = 9 + j10;
                                            if (w4Var.f(j14) < 0) {
                                                long j15 = j10 + 10;
                                                if (w4Var.f(j13) >= 0) {
                                                    i10 = i11;
                                                    j12 = j15;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i11;
                            }
                            i10 = i11;
                        }
                        j12 = j14;
                    }
                    j12 = j13;
                }
                this.l = j12;
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
        long j13 = this.l;
        if (this.f25012o != j13) {
            long j14 = j13 + 1;
            w4 w4Var = x4.f25021c;
            byte bF = w4Var.f(j13);
            if (bF >= 0) {
                this.l++;
                return bF;
            }
            if (this.f25012o - this.l >= 10) {
                long j15 = 2 + j13;
                int iF = (w4Var.f(j14) << 7) ^ bF;
                if (iF < 0) {
                    j10 = iF ^ (-128);
                } else {
                    long j16 = 3 + j13;
                    int iF2 = (w4Var.f(j15) << 14) ^ iF;
                    if (iF2 >= 0) {
                        j10 = iF2 ^ 16256;
                    } else {
                        long j17 = 4 + j13;
                        int iF3 = iF2 ^ (w4Var.f(j16) << 21);
                        if (iF3 < 0) {
                            j10 = (-2080896) ^ iF3;
                            j15 = j17;
                        } else {
                            long j18 = 5 + j13;
                            long jF = (((long) w4Var.f(j17)) << 28) ^ ((long) iF3);
                            if (jF >= 0) {
                                j12 = 266354560;
                            } else {
                                j16 = 6 + j13;
                                long jF2 = jF ^ (((long) w4Var.f(j18)) << 35);
                                if (jF2 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    j18 = 7 + j13;
                                    jF = jF2 ^ (((long) w4Var.f(j16)) << 42);
                                    if (jF >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        j16 = 8 + j13;
                                        jF2 = jF ^ (((long) w4Var.f(j18)) << 49);
                                        if (jF2 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            j18 = 9 + j13;
                                            long jF3 = (jF2 ^ (((long) w4Var.f(j16)) << 56)) ^ 71499008037633920L;
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
                            }
                            j10 = j12 ^ jF;
                            j15 = j18;
                        }
                    }
                    j15 = j16;
                }
                this.l = j15;
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
            long j10 = rawVarint32;
            long j11 = this.f25012o;
            long j12 = this.l;
            if (j10 <= j11 - j12) {
                byte[] bArr = new byte[rawVarint32];
                x4.g(j12, bArr, 0L, j10);
                String str = new String(bArr, Internal.UTF_8);
                this.l += j10;
                return str;
            }
        }
        if (rawVarint32 > 0 && rawVarint32 <= e()) {
            byte[] bArr2 = new byte[rawVarint32];
            c(rawVarint32, bArr2);
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
    public final String readStringRequireUtf8() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            long j10 = rawVarint32;
            long j11 = this.f25012o;
            long j12 = this.l;
            if (j10 <= j11 - j12) {
                String strC = a5.c((int) (j12 - this.f25010m), this.f25001c, rawVarint32);
                this.l += j10;
                return strC;
            }
        }
        if (rawVarint32 >= 0 && rawVarint32 <= e()) {
            byte[] bArr = new byte[rawVarint32];
            c(rawVarint32, bArr);
            return a5.f24770a.d(bArr, 0, rawVarint32);
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
            this.f25007i = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f25007i = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f25007i;
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
        this.f25009k = (int) ((((long) this.f25008j) + this.l) - this.f25010m);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i10) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            for (int i11 = 0; i11 < 10; i11++) {
                if (readRawByte() >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
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
        if (i10 < 0 || i10 > (((long) (this.f25004f - this.f25008j)) - this.l) + this.f25010m) {
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        while (i10 > 0) {
            if (a() == 0) {
                b();
            }
            int iMin = Math.min(i10, (int) a());
            i10 -= iMin;
            this.l += (long) iMin;
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
