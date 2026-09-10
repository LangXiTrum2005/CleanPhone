package kotlin.reflect.jvm.internal.impl.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class CodedInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44191c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f44192e;
    public int f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44194i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44193h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f44189a = new byte[4096];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44190b = 0;
    public int d = 0;
    public int g = 0;

    public interface RefillCallback {
    }

    public CodedInputStream(InputStream inputStream) {
        this.f44192e = inputStream;
    }

    public final void a(int i2) throws InvalidProtocolBufferException {
        if (this.f != i2) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        int i2 = this.f44193h;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.g + this.d);
    }

    public final void c(int i2) {
        this.f44193h = i2;
        o();
    }

    public final int d(int i2) throws InvalidProtocolBufferException {
        if (i2 < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = this.g + this.d + i2;
        int i4 = this.f44193h;
        if (i3 > i4) {
            throw InvalidProtocolBufferException.d();
        }
        this.f44193h = i3;
        o();
        return i4;
    }

    public final ByteString e() {
        int iK = k();
        int i2 = this.f44190b;
        int i3 = this.d;
        if (iK > i2 - i3 || iK <= 0) {
            return iK == 0 ? ByteString.X : new LiteralByteString(h(iK));
        }
        byte[] bArr = new byte[iK];
        System.arraycopy(this.f44189a, i3, bArr, 0, iK);
        LiteralByteString literalByteString = new LiteralByteString(bArr);
        this.d += iK;
        return literalByteString;
    }

    public final int f() {
        return k();
    }

    public final MessageLite g(Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int iK = k();
        if (this.f44194i >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iD = d(iK);
        this.f44194i++;
        MessageLite messageLite = (MessageLite) parser.a(this, extensionRegistryLite);
        a(0);
        this.f44194i--;
        c(iD);
        return messageLite;
    }

    public final byte[] h(int i2) throws InvalidProtocolBufferException {
        if (i2 <= 0) {
            if (i2 == 0) {
                return Internal.f44216a;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = this.g;
        int i4 = this.d;
        int i5 = i3 + i4 + i2;
        int i6 = this.f44193h;
        if (i5 > i6) {
            r((i6 - i3) - i4);
            throw InvalidProtocolBufferException.d();
        }
        byte[] bArr = this.f44189a;
        if (i2 < 4096) {
            byte[] bArr2 = new byte[i2];
            int i7 = this.f44190b - i4;
            System.arraycopy(bArr, i4, bArr2, 0, i7);
            this.d = this.f44190b;
            int i8 = i2 - i7;
            if (i8 > 0) {
                p(i8);
            }
            System.arraycopy(bArr, 0, bArr2, i7, i8);
            this.d = i8;
            return bArr2;
        }
        int i9 = this.f44190b;
        this.g = i3 + i9;
        this.d = 0;
        this.f44190b = 0;
        int length = i9 - i4;
        int i10 = i2 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr3 = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                InputStream inputStream = this.f44192e;
                int i12 = inputStream == null ? -1 : inputStream.read(bArr3, i11, iMin - i11);
                if (i12 == -1) {
                    throw InvalidProtocolBufferException.d();
                }
                this.g += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i2];
        System.arraycopy(bArr, i4, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final int i() throws InvalidProtocolBufferException {
        int i2 = this.d;
        if (this.f44190b - i2 < 4) {
            p(4);
            i2 = this.d;
        }
        this.d = i2 + 4;
        byte[] bArr = this.f44189a;
        return ((bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public final long j() throws InvalidProtocolBufferException {
        int i2 = this.d;
        if (this.f44190b - i2 < 8) {
            p(8);
            i2 = this.d;
        }
        this.d = i2 + 8;
        byte[] bArr = this.f44189a;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public final int k() {
        int i2;
        int i3 = this.d;
        int i4 = this.f44190b;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f44189a;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.d = i5;
                return b2;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b2;
                long j = i7;
                if (j < 0) {
                    i2 = (int) ((-128) ^ j);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    long j2 = i9;
                    if (j2 >= 0) {
                        i2 = (int) (16256 ^ j2);
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        long j3 = i11;
                        if (j3 < 0) {
                            i2 = (int) ((-2080896) ^ j3);
                        } else {
                            i8 = i3 + 5;
                            byte b3 = bArr[i10];
                            int i12 = (int) (((long) (i11 ^ (b3 << 28))) ^ 266354560);
                            if (b3 < 0) {
                                i10 = i3 + 6;
                                if (bArr[i8] < 0) {
                                    i8 = i3 + 7;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 8;
                                        if (bArr[i8] < 0) {
                                            i8 = i3 + 9;
                                            if (bArr[i10] < 0) {
                                                int i13 = i3 + 10;
                                                if (bArr[i8] >= 0) {
                                                    i6 = i13;
                                                    i2 = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i12;
                            }
                            i2 = i12;
                        }
                        i6 = i10;
                    }
                    i6 = i8;
                }
                this.d = i6;
                return i2;
            }
        }
        return (int) m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l() {
        /*
            r12 = this;
            int r0 = r12.d
            int r1 = r12.f44190b
            if (r1 != r0) goto L8
            goto Lb8
        L8:
            int r2 = r0 + 1
            byte[] r3 = r12.f44189a
            r4 = r3[r0]
            if (r4 < 0) goto L14
            r12.d = r2
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r2
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb8
        L1b:
            int r1 = r0 + 2
            r2 = r3[r2]
            int r2 = r2 << 7
            r2 = r2 ^ r4
            long r4 = (long) r2
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2e
            r2 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r2 = r2 ^ r4
            goto Lc1
        L2e:
            int r2 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L42
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r0 = r0 ^ r4
            r10 = r0
            r1 = r2
            r2 = r10
            goto Lc1
        L42:
            int r1 = r0 + 4
            r2 = r3[r2]
            int r2 = r2 << 21
            long r8 = (long) r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L52
            r2 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L52:
            int r2 = r0 + 5
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L63
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L63:
            int r1 = r0 + 6
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 35
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L76
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L76:
            int r2 = r0 + 7
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L89
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L89:
            int r1 = r0 + 8
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 49
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L9c
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9c:
            int r2 = r0 + 9
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lbf
            int r1 = r0 + 10
            r0 = r3[r2]
            long r2 = (long) r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lbd
        Lb8:
            long r0 = r12.m()
            return r0
        Lbd:
            r2 = r4
            goto Lc1
        Lbf:
            r1 = r2
            goto Lbd
        Lc1:
            r12.d = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.l():long");
    }

    public final long m() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.d == this.f44190b) {
                p(1);
            }
            int i3 = this.d;
            this.d = i3 + 1;
            byte b2 = this.f44189a[i3];
            j |= ((long) (b2 & AbstractJsonLexerKt.TC_INVALID)) << i2;
            if ((b2 & 128) == 0) {
                return j;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public final int n() throws InvalidProtocolBufferException {
        if (this.d == this.f44190b && !s(1)) {
            this.f = 0;
            return 0;
        }
        int iK = k();
        this.f = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public final void o() {
        int i2 = this.f44190b + this.f44191c;
        this.f44190b = i2;
        int i3 = this.g + i2;
        int i4 = this.f44193h;
        if (i3 <= i4) {
            this.f44191c = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f44191c = i5;
        this.f44190b = i2 - i5;
    }

    public final void p(int i2) throws InvalidProtocolBufferException {
        if (!s(i2)) {
            throw InvalidProtocolBufferException.d();
        }
    }

    public final boolean q(int i2, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        int iN;
        int i3 = i2 & 7;
        if (i3 == 0) {
            long jL = l();
            codedOutputStream.v(i2);
            codedOutputStream.w(jL);
            return true;
        }
        if (i3 == 1) {
            long j = j();
            codedOutputStream.v(i2);
            codedOutputStream.u(j);
            return true;
        }
        if (i3 == 2) {
            ByteString byteStringE = e();
            codedOutputStream.v(i2);
            codedOutputStream.v(byteStringE.size());
            codedOutputStream.r(byteStringE);
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
            }
            int i4 = i();
            codedOutputStream.v(i2);
            codedOutputStream.t(i4);
            return true;
        }
        codedOutputStream.v(i2);
        do {
            iN = n();
            if (iN == 0) {
                break;
            }
        } while (q(iN, codedOutputStream));
        int i5 = ((i2 >>> 3) << 3) | 4;
        a(i5);
        codedOutputStream.v(i5);
        return true;
    }

    public final void r(int i2) throws InvalidProtocolBufferException {
        int i3 = this.f44190b;
        int i4 = this.d;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.d = i4 + i2;
            return;
        }
        if (i2 < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.g;
        int i7 = i6 + i4 + i2;
        int i8 = this.f44193h;
        if (i7 > i8) {
            r((i8 - i6) - i4);
            throw InvalidProtocolBufferException.d();
        }
        this.d = i3;
        p(1);
        while (true) {
            int i9 = i2 - i5;
            int i10 = this.f44190b;
            if (i9 <= i10) {
                this.d = i9;
                return;
            } else {
                i5 += i10;
                this.d = i10;
                p(1);
            }
        }
    }

    public final boolean s(int i2) throws IOException {
        InputStream inputStream;
        int i3 = this.d;
        int i4 = i3 + i2;
        int i5 = this.f44190b;
        if (i4 <= i5) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i2);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.g + i3 + i2 <= this.f44193h && (inputStream = this.f44192e) != null) {
            byte[] bArr = this.f44189a;
            if (i3 > 0) {
                if (i5 > i3) {
                    System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                }
                this.g += i3;
                this.f44190b -= i3;
                this.d = 0;
            }
            int i6 = this.f44190b;
            int i7 = inputStream.read(bArr, i6, bArr.length - i6);
            if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i7);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i7 > 0) {
                this.f44190b += i7;
                if ((this.g + i2) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                o();
                if (this.f44190b >= i2) {
                    return true;
                }
                return s(i2);
            }
        }
        return false;
    }
}
