package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends CodedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f25027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f25028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25034h;

    public y(InputStream inputStream, int i10) {
        super();
        this.f25034h = Integer.MAX_VALUE;
        Internal.checkNotNull(inputStream, "input");
        this.f25027a = inputStream;
        this.f25028b = new byte[i10];
        this.f25029c = 0;
        this.f25031e = 0;
        this.f25033g = 0;
    }

    public final byte[] a(int i10, boolean z10) throws IOException {
        byte[] bArrB = b(i10);
        if (bArrB != null) {
            return z10 ? (byte[]) bArrB.clone() : bArrB;
        }
        int i11 = this.f25031e;
        int i12 = this.f25029c;
        int length = i12 - i11;
        this.f25033g += i12;
        this.f25031e = 0;
        this.f25029c = 0;
        ArrayList<byte[]> arrayListC = c(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f25028b, i11, bArr, 0, length);
        for (byte[] bArr2 : arrayListC) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] b(int i10) throws IOException {
        if (i10 == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i11 = this.f25033g;
        int i12 = this.f25031e;
        int i13 = i11 + i12 + i10;
        if (i13 - this.sizeLimit > 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i14 = this.f25034h;
        if (i13 > i14) {
            skipRawBytes((i14 - i11) - i12);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i15 = this.f25029c - i12;
        int i16 = i10 - i15;
        InputStream inputStream = this.f25027a;
        if (i16 >= 4096) {
            try {
                if (i16 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f25028b, this.f25031e, bArr, 0, i15);
        this.f25033g += this.f25029c;
        this.f25031e = 0;
        this.f25029c = 0;
        while (i15 < i10) {
            try {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f25033g += i17;
                i15 += i17;
            } catch (InvalidProtocolBufferException e11) {
                e11.setThrownFromInputStream();
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList c(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f25027a.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f25033g += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
        if (this.f25032f != i10) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final void d() {
        int i10 = this.f25029c + this.f25030d;
        this.f25029c = i10;
        int i11 = this.f25033g + i10;
        int i12 = this.f25034h;
        if (i11 <= i12) {
            this.f25030d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f25030d = i13;
        this.f25029c = i10 - i13;
    }

    public final void e(int i10) throws InvalidProtocolBufferException {
        if (f(i10)) {
            return;
        }
        if (i10 <= (this.sizeLimit - this.f25033g) - this.f25031e) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.sizeLimitExceeded();
    }

    public final boolean f(int i10) throws IOException {
        InputStream inputStream = this.f25027a;
        int i11 = this.f25031e;
        int i12 = i11 + i10;
        int i13 = this.f25029c;
        if (i12 <= i13) {
            throw new IllegalStateException(defpackage.e.h(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.sizeLimit;
        int i15 = this.f25033g;
        if (i10 <= (i14 - i15) - i11 && i15 + i11 + i10 <= this.f25034h) {
            byte[] bArr = this.f25028b;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f25033g += i11;
                this.f25029c -= i11;
                this.f25031e = 0;
            }
            int i16 = this.f25029c;
            try {
                int i17 = inputStream.read(bArr, i16, Math.min(bArr.length - i16, (this.sizeLimit - this.f25033g) - i16));
                if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
                }
                if (i17 > 0) {
                    this.f25029c += i17;
                    d();
                    if (this.f25029c >= i10) {
                        return true;
                    }
                    return f(i10);
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i10 = this.f25034h;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f25033g + this.f25031e);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f25032f;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return this.f25033g + this.f25031e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return this.f25031e == this.f25029c && !f(1);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i10) {
        this.f25034h = i10;
        d();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i11 = this.f25033g + this.f25031e + i10;
        int i12 = this.f25034h;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f25034h = i11;
        d();
        return i12;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean readBool() {
        return readRawVarint64() != 0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readByteArray() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f25029c;
        int i11 = this.f25031e;
        if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
            if (rawVarint32 >= 0) {
                return a(rawVarint32, false);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f25028b, i11, i11 + rawVarint32);
        this.f25031e += rawVarint32;
        return bArrCopyOfRange;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f25029c;
        int i11 = this.f25031e;
        if (rawVarint32 <= i10 - i11 && rawVarint32 > 0) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f25028b, i11, i11 + rawVarint32));
            this.f25031e += rawVarint32;
            return byteBufferWrap;
        }
        if (rawVarint32 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (rawVarint32 >= 0) {
            return ByteBuffer.wrap(a(rawVarint32, true));
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f25029c;
        int i11 = this.f25031e;
        int i12 = i10 - i11;
        byte[] bArr = this.f25028b;
        if (rawVarint32 <= i12 && rawVarint32 > 0) {
            ByteString byteStringCopyFrom = ByteString.copyFrom(bArr, i11, rawVarint32);
            this.f25031e += rawVarint32;
            return byteStringCopyFrom;
        }
        if (rawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArrB = b(rawVarint32);
        if (bArrB != null) {
            return ByteString.copyFrom(bArrB);
        }
        int i13 = this.f25031e;
        int i14 = this.f25029c;
        int length = i14 - i13;
        this.f25033g += i14;
        this.f25031e = 0;
        this.f25029c = 0;
        ArrayList<byte[]> arrayListC = c(rawVarint32 - length);
        byte[] bArr2 = new byte[rawVarint32];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        for (byte[] bArr3 : arrayListC) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        return ByteString.wrap(bArr2);
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
        if (this.f25031e == this.f25029c) {
            e(1);
        }
        int i10 = this.f25031e;
        this.f25031e = i10 + 1;
        return this.f25028b[i10];
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i10) {
        int i11 = this.f25031e;
        if (i10 > this.f25029c - i11 || i10 <= 0) {
            return a(i10, false);
        }
        int i12 = i10 + i11;
        this.f25031e = i12;
        return Arrays.copyOfRange(this.f25028b, i11, i12);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() throws InvalidProtocolBufferException {
        int i10 = this.f25031e;
        if (this.f25029c - i10 < 4) {
            e(4);
            i10 = this.f25031e;
        }
        this.f25031e = i10 + 4;
        byte[] bArr = this.f25028b;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() throws InvalidProtocolBufferException {
        int i10 = this.f25031e;
        if (this.f25029c - i10 < 8) {
            e(8);
            i10 = this.f25031e;
        }
        this.f25031e = i10 + 8;
        byte[] bArr = this.f25028b;
        return ((((long) bArr[i10 + 1]) & 255) << 8) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i10;
        int i11 = this.f25031e;
        int i12 = this.f25029c;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f25028b;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f25031e = i13;
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
                this.f25031e = i14;
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
        int i10 = this.f25031e;
        int i11 = this.f25029c;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f25028b;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f25031e = i12;
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
                this.f25031e = i13;
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
        byte[] bArr = this.f25028b;
        if (rawVarint32 > 0) {
            int i10 = this.f25029c;
            int i11 = this.f25031e;
            if (rawVarint32 <= i10 - i11) {
                String str = new String(bArr, i11, rawVarint32, Internal.UTF_8);
                this.f25031e += rawVarint32;
                return str;
            }
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (rawVarint32 > this.f25029c) {
            return new String(a(rawVarint32, false), Internal.UTF_8);
        }
        e(rawVarint32);
        String str2 = new String(bArr, this.f25031e, rawVarint32, Internal.UTF_8);
        this.f25031e += rawVarint32;
        return str2;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f25031e;
        int i11 = this.f25029c;
        int i12 = i11 - i10;
        byte[] bArrA = this.f25028b;
        if (rawVarint32 <= i12 && rawVarint32 > 0) {
            this.f25031e = i10 + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            i10 = 0;
            if (rawVarint32 <= i11) {
                e(rawVarint32);
                this.f25031e = rawVarint32;
            } else {
                bArrA = a(rawVarint32, false);
            }
        }
        return a5.f24770a.d(bArrA, i10, rawVarint32);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readTag() throws InvalidProtocolBufferException {
        if (isAtEnd()) {
            this.f25032f = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f25032f = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f25032f;
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
        this.f25033g = -this.f25031e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i10) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i10);
        int i11 = 0;
        if (tagWireType == 0) {
            if (this.f25029c - this.f25031e < 10) {
                while (i11 < 10) {
                    if (readRawByte() < 0) {
                        i11++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i11 < 10) {
                int i12 = this.f25031e;
                this.f25031e = i12 + 1;
                if (this.f25028b[i12] < 0) {
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
        int i11 = this.f25029c;
        int i12 = this.f25031e;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.f25031e = i12 + i10;
            return;
        }
        InputStream inputStream = this.f25027a;
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i13 = this.f25033g;
        int i14 = i13 + i12;
        int i15 = i14 + i10;
        int i16 = this.f25034h;
        if (i15 > i16) {
            skipRawBytes((i16 - i13) - i12);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f25033g = i14;
        int i17 = i11 - i12;
        this.f25029c = 0;
        this.f25031e = 0;
        while (i17 < i10) {
            long j10 = i10 - i17;
            try {
                try {
                    long jSkip = inputStream.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i17 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    e10.setThrownFromInputStream();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f25033g += i17;
                d();
                throw th2;
            }
        }
        this.f25033g += i17;
        d();
        if (i17 >= i10) {
            return;
        }
        int i18 = this.f25029c;
        int i19 = i18 - this.f25031e;
        this.f25031e = i18;
        e(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f25029c;
            if (i20 <= i21) {
                this.f25031e = i20;
                return;
            } else {
                i19 += i21;
                this.f25031e = i21;
                e(1);
            }
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

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z10) {
    }
}
