package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CodedInputStreamReader f4753b;

    public static final class ArrayDecoder extends CodedInputStream {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f4754c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4755e;
        public int f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4756h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4757i = Integer.MAX_VALUE;

        public ArrayDecoder(byte[] bArr, int i2, int i3, boolean z2) {
            this.f4754c = bArr;
            this.d = i3 + i2;
            this.f = i2;
            this.g = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long A() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean B(int i2) throws InvalidProtocolBufferException {
            int i3 = i2 & 7;
            int i4 = 0;
            if (i3 != 0) {
                if (i3 == 1) {
                    J(8);
                    return true;
                }
                if (i3 == 2) {
                    J(F());
                    return true;
                }
                if (i3 == 3) {
                    C();
                    a(((i2 >>> 3) << 3) | 4);
                    return true;
                }
                if (i3 == 4) {
                    return false;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.i();
                }
                J(4);
                return true;
            }
            int i5 = this.d - this.f;
            byte[] bArr = this.f4754c;
            if (i5 >= 10) {
                while (i4 < 10) {
                    int i6 = this.f;
                    this.f = i6 + 1;
                    if (bArr[i6] < 0) {
                        i4++;
                    }
                }
                throw InvalidProtocolBufferException.j();
            }
            while (i4 < 10) {
                int i7 = this.f;
                if (i7 == this.d) {
                    throw InvalidProtocolBufferException.m();
                }
                this.f = i7 + 1;
                if (bArr[i7] < 0) {
                    i4++;
                }
            }
            throw InvalidProtocolBufferException.j();
            return true;
        }

        public final int D() throws InvalidProtocolBufferException {
            int i2 = this.f;
            if (this.d - i2 < 4) {
                throw InvalidProtocolBufferException.m();
            }
            this.f = i2 + 4;
            byte[] bArr = this.f4754c;
            return ((bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        public final long E() throws InvalidProtocolBufferException {
            int i2 = this.f;
            if (this.d - i2 < 8) {
                throw InvalidProtocolBufferException.m();
            }
            this.f = i2 + 8;
            byte[] bArr = this.f4754c;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        public final int F() {
            int i2;
            int i3 = this.f;
            int i4 = this.d;
            if (i4 != i3) {
                int i5 = i3 + 1;
                byte[] bArr = this.f4754c;
                byte b2 = bArr[i3];
                if (b2 >= 0) {
                    this.f = i5;
                    return b2;
                }
                if (i4 - i5 >= 9) {
                    int i6 = i3 + 2;
                    int i7 = (bArr[i5] << 7) ^ b2;
                    if (i7 < 0) {
                        i2 = i7 ^ (-128);
                    } else {
                        int i8 = i3 + 3;
                        int i9 = (bArr[i6] << 14) ^ i7;
                        if (i9 >= 0) {
                            i2 = i9 ^ 16256;
                        } else {
                            int i10 = i3 + 4;
                            int i11 = i9 ^ (bArr[i8] << 21);
                            if (i11 < 0) {
                                i2 = (-2080896) ^ i11;
                            } else {
                                i8 = i3 + 5;
                                byte b3 = bArr[i10];
                                int i12 = (i11 ^ (b3 << 28)) ^ 266354560;
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
                    this.f = i6;
                    return i2;
                }
            }
            return (int) H();
        }

        public final long G() {
            long j;
            long j2;
            long j3;
            long j4;
            int i2 = this.f;
            int i3 = this.d;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f4754c;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f = i4;
                    return b2;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b2;
                    if (i6 < 0) {
                        j = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            j = i8 ^ 16256;
                            i5 = i7;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                j4 = (-2080896) ^ i10;
                            } else {
                                long j5 = i10;
                                i5 = i2 + 5;
                                long j6 = j5 ^ (((long) bArr[i9]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i9 = i2 + 6;
                                    long j7 = j6 ^ (((long) bArr[i5]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i5 = i2 + 7;
                                        j6 = j7 ^ (((long) bArr[i9]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i9 = i2 + 8;
                                            j7 = j6 ^ (((long) bArr[i5]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i5 = i2 + 9;
                                                long j8 = (j7 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i2 + 10;
                                                    if (bArr[i5] >= 0) {
                                                        i5 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i5 = i9;
                            j = j4;
                        }
                    }
                    this.f = i5;
                    return j;
                }
            }
            return H();
        }

        public final long H() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                int i3 = this.f;
                if (i3 == this.d) {
                    throw InvalidProtocolBufferException.m();
                }
                this.f = i3 + 1;
                byte b2 = this.f4754c[i3];
                j |= ((long) (b2 & AbstractJsonLexerKt.TC_INVALID)) << i2;
                if ((b2 & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        public final void I() {
            int i2 = this.d + this.f4755e;
            this.d = i2;
            int i3 = i2 - this.g;
            int i4 = this.f4757i;
            if (i3 <= i4) {
                this.f4755e = 0;
                return;
            }
            int i5 = i3 - i4;
            this.f4755e = i5;
            this.d = i2 - i5;
        }

        public final void J(int i2) throws InvalidProtocolBufferException {
            if (i2 >= 0) {
                int i3 = this.d;
                int i4 = this.f;
                if (i2 <= i3 - i4) {
                    this.f = i4 + i2;
                    return;
                }
            }
            if (i2 >= 0) {
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void a(int i2) throws InvalidProtocolBufferException {
            if (this.f4756h != i2) {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int d() {
            return this.f - this.g;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean e() {
            return this.f == this.d;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void h(int i2) {
            this.f4757i = i2;
            I();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int i(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            int iD = i2 + d();
            if (iD < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i3 = this.f4757i;
            if (iD > i3) {
                throw InvalidProtocolBufferException.m();
            }
            this.f4757i = iD;
            I();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean j() {
            return G() != 0;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0033  */
        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0042  */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteString k() throws InvalidProtocolBufferException {
            byte[] bArrCopyOfRange;
            int iF = F();
            byte[] bArr = this.f4754c;
            if (iF > 0) {
                int i2 = this.d;
                int i3 = this.f;
                if (iF <= i2 - i3) {
                    ByteString byteStringH = ByteString.h(i3, iF, bArr);
                    this.f += iF;
                    return byteStringH;
                }
            }
            if (iF == 0) {
                return ByteString.f4747Y;
            }
            if (iF > 0) {
                int i4 = this.d;
                int i5 = this.f;
                if (iF <= i4 - i5) {
                    int i6 = iF + i5;
                    this.f = i6;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, i6);
                } else {
                    if (iF <= 0) {
                        throw InvalidProtocolBufferException.m();
                    }
                    if (iF == 0) {
                        throw InvalidProtocolBufferException.k();
                    }
                    bArrCopyOfRange = Internal.f4858b;
                }
            } else {
                if (iF <= 0) {
                    throw InvalidProtocolBufferException.m();
                }
                if (iF == 0) {
                    throw InvalidProtocolBufferException.k();
                }
                bArrCopyOfRange = Internal.f4858b;
            }
            ByteString byteString = ByteString.f4747Y;
            return new ByteString.LiteralByteString(bArrCopyOfRange);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(E());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int m() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int n() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long o() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(D());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int q() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long r() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int s() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long t() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(F());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(G());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String w() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                int i2 = this.d;
                int i3 = this.f;
                if (iF <= i2 - i3) {
                    String str = new String(this.f4754c, i3, iF, Internal.f4857a);
                    this.f += iF;
                    return str;
                }
            }
            if (iF == 0) {
                return "";
            }
            if (iF < 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String x() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                int i2 = this.d;
                int i3 = this.f;
                if (iF <= i2 - i3) {
                    String strA = Utf8.f4942a.a(this.f4754c, i3, iF);
                    this.f += iF;
                    return strA;
                }
            }
            if (iF == 0) {
                return "";
            }
            if (iF <= 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int y() throws InvalidProtocolBufferException {
            if (e()) {
                this.f4756h = 0;
                return 0;
            }
            int iF = F();
            this.f4756h = iF;
            if ((iF >>> 3) != 0) {
                return iF;
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int z() {
            return F();
        }
    }

    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator f4758c;
        public ByteBuffer d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4759e;
        public int f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4760h;
        public long j;
        public long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f4762l;
        public int g = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4761i = 0;

        public IterableDirectByteBufferDecoder(int i2, ArrayList arrayList) {
            this.f4759e = i2;
            this.f4758c = arrayList.iterator();
            if (i2 != 0) {
                N();
                return;
            }
            this.d = Internal.f4859c;
            this.j = 0L;
            this.k = 0L;
            this.f4762l = 0L;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long A() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean B(int i2) throws InvalidProtocolBufferException {
            int i3 = i2 & 7;
            if (i3 == 0) {
                for (int i4 = 0; i4 < 10; i4++) {
                    if (E() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.j();
            }
            if (i3 == 1) {
                M(8);
                return true;
            }
            if (i3 == 2) {
                M(I());
                return true;
            }
            if (i3 == 3) {
                C();
                a(((i2 >>> 3) << 3) | 4);
                return true;
            }
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.i();
            }
            M(4);
            return true;
        }

        public final long D() {
            return this.f4762l - this.j;
        }

        public final byte E() throws InvalidProtocolBufferException {
            if (D() == 0) {
                if (!this.f4758c.hasNext()) {
                    throw InvalidProtocolBufferException.m();
                }
                N();
            }
            long j = this.j;
            this.j = 1 + j;
            return UnsafeUtil.f4938c.f(j);
        }

        public final void F(int i2, byte[] bArr) throws InvalidProtocolBufferException {
            if (i2 < 0 || i2 > L()) {
                if (i2 > 0) {
                    throw InvalidProtocolBufferException.m();
                }
                if (i2 != 0) {
                    throw InvalidProtocolBufferException.k();
                }
                return;
            }
            int i3 = i2;
            while (i3 > 0) {
                if (D() == 0) {
                    if (!this.f4758c.hasNext()) {
                        throw InvalidProtocolBufferException.m();
                    }
                    N();
                }
                int iMin = Math.min(i3, (int) D());
                long j = iMin;
                byte[] bArr2 = bArr;
                UnsafeUtil.f4938c.c(this.j, bArr2, i2 - i3, j);
                i3 -= iMin;
                this.j += j;
                bArr = bArr2;
            }
        }

        public final int G() {
            if (D() < 4) {
                return (E() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((E() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((E() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((E() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
            }
            long j = this.j;
            this.j = 4 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f4938c;
            return ((memoryAccessor.f(j + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (memoryAccessor.f(j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((memoryAccessor.f(1 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((memoryAccessor.f(2 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        public final long H() {
            if (D() < 8) {
                return (((long) E()) & 255) | ((((long) E()) & 255) << 8) | ((((long) E()) & 255) << 16) | ((((long) E()) & 255) << 24) | ((((long) E()) & 255) << 32) | ((((long) E()) & 255) << 40) | ((((long) E()) & 255) << 48) | ((((long) E()) & 255) << 56);
            }
            long j = this.j;
            this.j = 8 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f4938c;
            return (((long) memoryAccessor.f(j)) & 255) | ((((long) memoryAccessor.f(j + 1)) & 255) << 8) | ((((long) memoryAccessor.f(j + 2)) & 255) << 16) | ((((long) memoryAccessor.f(3 + j)) & 255) << 24) | ((((long) memoryAccessor.f(4 + j)) & 255) << 32) | ((((long) memoryAccessor.f(5 + j)) & 255) << 40) | ((((long) memoryAccessor.f(6 + j)) & 255) << 48) | ((((long) memoryAccessor.f(j + 7)) & 255) << 56);
        }

        public final int I() {
            int i2;
            long j = this.j;
            if (this.f4762l != j) {
                long j2 = j + 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f4938c;
                byte bF = memoryAccessor.f(j);
                if (bF >= 0) {
                    this.j++;
                    return bF;
                }
                if (this.f4762l - this.j >= 10) {
                    long j3 = 2 + j;
                    int iF = (memoryAccessor.f(j2) << 7) ^ bF;
                    if (iF < 0) {
                        i2 = iF ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int iF2 = (memoryAccessor.f(j3) << 14) ^ iF;
                        if (iF2 >= 0) {
                            i2 = iF2 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int iF3 = iF2 ^ (memoryAccessor.f(j4) << 21);
                            if (iF3 < 0) {
                                i2 = (-2080896) ^ iF3;
                            } else {
                                j4 = 5 + j;
                                byte bF2 = memoryAccessor.f(j5);
                                int i3 = (iF3 ^ (bF2 << 28)) ^ 266354560;
                                if (bF2 < 0) {
                                    j5 = 6 + j;
                                    if (memoryAccessor.f(j4) < 0) {
                                        j4 = 7 + j;
                                        if (memoryAccessor.f(j5) < 0) {
                                            j5 = 8 + j;
                                            if (memoryAccessor.f(j4) < 0) {
                                                j4 = 9 + j;
                                                if (memoryAccessor.f(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (memoryAccessor.f(j4) >= 0) {
                                                        i2 = i3;
                                                        j3 = j6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i2 = i3;
                                }
                                i2 = i3;
                            }
                            j3 = j5;
                        }
                        j3 = j4;
                    }
                    this.j = j3;
                    return i2;
                }
            }
            return (int) K();
        }

        public final long J() {
            long j;
            long j2;
            long j3;
            long j4 = this.j;
            if (this.f4762l != j4) {
                long j5 = j4 + 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f4938c;
                byte bF = memoryAccessor.f(j4);
                if (bF >= 0) {
                    this.j++;
                    return bF;
                }
                if (this.f4762l - this.j >= 10) {
                    long j6 = 2 + j4;
                    int iF = (memoryAccessor.f(j5) << 7) ^ bF;
                    if (iF < 0) {
                        j = iF ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int iF2 = (memoryAccessor.f(j6) << 14) ^ iF;
                        if (iF2 >= 0) {
                            j = iF2 ^ 16256;
                        } else {
                            long j8 = 4 + j4;
                            int iF3 = iF2 ^ (memoryAccessor.f(j7) << 21);
                            if (iF3 < 0) {
                                j = (-2080896) ^ iF3;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long jF = (((long) memoryAccessor.f(j8)) << 28) ^ ((long) iF3);
                                if (jF >= 0) {
                                    j3 = 266354560;
                                } else {
                                    j7 = 6 + j4;
                                    long jF2 = jF ^ (((long) memoryAccessor.f(j9)) << 35);
                                    if (jF2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        jF = jF2 ^ (((long) memoryAccessor.f(j7)) << 42);
                                        if (jF >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j7 = 8 + j4;
                                            jF2 = jF ^ (((long) memoryAccessor.f(j9)) << 49);
                                            if (jF2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long jF3 = (jF2 ^ (((long) memoryAccessor.f(j7)) << 56)) ^ 71499008037633920L;
                                                if (jF3 < 0) {
                                                    long j10 = j4 + 10;
                                                    if (memoryAccessor.f(j9) >= 0) {
                                                        j6 = j10;
                                                        j = jF3;
                                                    }
                                                } else {
                                                    j = jF3;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jF2;
                                }
                                j = j3 ^ jF;
                                j6 = j9;
                            }
                        }
                        j6 = j7;
                    }
                    this.j = j6;
                    return j;
                }
            }
            return K();
        }

        public final long K() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte bE = E();
                j |= ((long) (bE & AbstractJsonLexerKt.TC_INVALID)) << i2;
                if ((bE & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        public final int L() {
            return (int) ((((long) (this.f4759e - this.f4761i)) - this.j) + this.k);
        }

        public final void M(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0 || i2 > (((long) (this.f4759e - this.f4761i)) - this.j) + this.k) {
                if (i2 >= 0) {
                    throw InvalidProtocolBufferException.m();
                }
                throw InvalidProtocolBufferException.k();
            }
            while (i2 > 0) {
                if (D() == 0) {
                    if (!this.f4758c.hasNext()) {
                        throw InvalidProtocolBufferException.m();
                    }
                    N();
                }
                int iMin = Math.min(i2, (int) D());
                i2 -= iMin;
                this.j += (long) iMin;
            }
        }

        public final void N() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f4758c.next();
            this.d = byteBuffer;
            this.f4761i += (int) (this.j - this.k);
            long jPosition = byteBuffer.position();
            this.j = jPosition;
            this.k = jPosition;
            this.f4762l = this.d.limit();
            long jB = UnsafeUtil.b(this.d);
            this.j += jB;
            this.k += jB;
            this.f4762l += jB;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void a(int i2) throws InvalidProtocolBufferException {
            if (this.f4760h != i2) {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int d() {
            return (int) ((((long) this.f4761i) + this.j) - this.k);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean e() {
            return (((long) this.f4761i) + this.j) - this.k == ((long) this.f4759e);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void h(int i2) {
            this.g = i2;
            int i3 = this.f4759e + this.f;
            this.f4759e = i3;
            if (i3 <= i2) {
                this.f = 0;
                return;
            }
            int i4 = i3 - i2;
            this.f = i4;
            this.f4759e = i3 - i4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int i(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            int iD = i2 + d();
            int i3 = this.g;
            if (iD > i3) {
                throw InvalidProtocolBufferException.m();
            }
            this.g = iD;
            int i4 = this.f4759e + this.f;
            this.f4759e = i4;
            if (i4 <= iD) {
                this.f = 0;
                return i3;
            }
            int i5 = i4 - iD;
            this.f = i5;
            this.f4759e = i4 - i5;
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean j() {
            return J() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteString k() throws InvalidProtocolBufferException {
            int I2 = I();
            if (I2 > 0) {
                long j = I2;
                long j2 = this.f4762l;
                long j3 = this.j;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[I2];
                    UnsafeUtil.f4938c.c(j3, bArr, 0L, j);
                    this.j += j;
                    ByteString byteString = ByteString.f4747Y;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (I2 > 0 && I2 <= L()) {
                byte[] bArr2 = new byte[I2];
                F(I2, bArr2);
                ByteString byteString2 = ByteString.f4747Y;
                return new ByteString.LiteralByteString(bArr2);
            }
            if (I2 == 0) {
                return ByteString.f4747Y;
            }
            if (I2 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(H());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int m() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int n() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long o() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(G());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int q() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int s() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long t() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(I());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(J());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String w() throws InvalidProtocolBufferException {
            int I2 = I();
            if (I2 > 0) {
                long j = I2;
                long j2 = this.f4762l;
                long j3 = this.j;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[I2];
                    UnsafeUtil.f4938c.c(j3, bArr, 0L, j);
                    String str = new String(bArr, Internal.f4857a);
                    this.j += j;
                    return str;
                }
            }
            if (I2 > 0 && I2 <= L()) {
                byte[] bArr2 = new byte[I2];
                F(I2, bArr2);
                return new String(bArr2, Internal.f4857a);
            }
            if (I2 == 0) {
                return "";
            }
            if (I2 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String x() throws InvalidProtocolBufferException {
            int I2 = I();
            if (I2 > 0) {
                long j = I2;
                long j2 = this.f4762l;
                long j3 = this.j;
                if (j <= j2 - j3) {
                    String strC = Utf8.c(this.d, (int) (j3 - this.k), I2);
                    this.j += j;
                    return strC;
                }
            }
            if (I2 >= 0 && I2 <= L()) {
                byte[] bArr = new byte[I2];
                F(I2, bArr);
                return Utf8.f4942a.a(bArr, 0, I2);
            }
            if (I2 == 0) {
                return "";
            }
            if (I2 <= 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int y() throws InvalidProtocolBufferException {
            if (e()) {
                this.f4760h = 0;
                return 0;
            }
            int I2 = I();
            this.f4760h = I2;
            if ((I2 >>> 3) != 0) {
                return I2;
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int z() {
            return I();
        }
    }

    public static final class StreamDecoder extends CodedInputStream {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InputStream f4763c;
        public final byte[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4764e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4765h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4766i;
        public int j = Integer.MAX_VALUE;

        public interface RefillCallback {
        }

        public class SkippedDataSink implements RefillCallback {
        }

        public StreamDecoder(InputStream inputStream) {
            Internal.a(inputStream, "input");
            this.f4763c = inputStream;
            this.d = new byte[4096];
            this.f4764e = 0;
            this.g = 0;
            this.f4766i = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long A() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean B(int i2) throws InvalidProtocolBufferException {
            int i3 = i2 & 7;
            int i4 = 0;
            if (i3 != 0) {
                if (i3 == 1) {
                    N(8);
                    return true;
                }
                if (i3 == 2) {
                    N(I());
                    return true;
                }
                if (i3 == 3) {
                    C();
                    a(((i2 >>> 3) << 3) | 4);
                    return true;
                }
                if (i3 == 4) {
                    return false;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.i();
                }
                N(4);
                return true;
            }
            int i5 = this.f4764e - this.g;
            byte[] bArr = this.d;
            if (i5 >= 10) {
                while (i4 < 10) {
                    int i6 = this.g;
                    this.g = i6 + 1;
                    if (bArr[i6] < 0) {
                        i4++;
                    }
                }
                throw InvalidProtocolBufferException.j();
            }
            while (i4 < 10) {
                if (this.g == this.f4764e) {
                    M(1);
                }
                int i7 = this.g;
                this.g = i7 + 1;
                if (bArr[i7] < 0) {
                    i4++;
                }
            }
            throw InvalidProtocolBufferException.j();
            return true;
        }

        public final byte[] D(int i2) throws IOException {
            byte[] bArrE = E(i2);
            if (bArrE != null) {
                return bArrE;
            }
            int i3 = this.g;
            int i4 = this.f4764e;
            int length = i4 - i3;
            this.f4766i += i4;
            this.g = 0;
            this.f4764e = 0;
            ArrayList<byte[]> arrayListF = F(i2 - length);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.d, i3, bArr, 0, length);
            for (byte[] bArr2 : arrayListF) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] E(int i2) throws IOException {
            if (i2 == 0) {
                return Internal.f4858b;
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            int i3 = this.f4766i;
            int i4 = this.g;
            int i5 = i3 + i4 + i2;
            if (i5 - Integer.MAX_VALUE > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i6 = this.j;
            if (i5 > i6) {
                N((i6 - i3) - i4);
                throw InvalidProtocolBufferException.m();
            }
            int i7 = this.f4764e - i4;
            int i8 = i2 - i7;
            InputStream inputStream = this.f4763c;
            if (i8 >= 4096) {
                try {
                    if (i8 > inputStream.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    e2.X = true;
                    throw e2;
                }
            }
            byte[] bArr = new byte[i2];
            System.arraycopy(this.d, this.g, bArr, 0, i7);
            this.f4766i += this.f4764e;
            this.g = 0;
            this.f4764e = 0;
            while (i7 < i2) {
                try {
                    int i9 = inputStream.read(bArr, i7, i2 - i7);
                    if (i9 == -1) {
                        throw InvalidProtocolBufferException.m();
                    }
                    this.f4766i += i9;
                    i7 += i9;
                } catch (InvalidProtocolBufferException e3) {
                    e3.X = true;
                    throw e3;
                }
            }
            return bArr;
        }

        public final ArrayList F(int i2) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i2 > 0) {
                int iMin = Math.min(i2, 4096);
                byte[] bArr = new byte[iMin];
                int i3 = 0;
                while (i3 < iMin) {
                    int i4 = this.f4763c.read(bArr, i3, iMin - i3);
                    if (i4 == -1) {
                        throw InvalidProtocolBufferException.m();
                    }
                    this.f4766i += i4;
                    i3 += i4;
                }
                i2 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int G() throws InvalidProtocolBufferException {
            int i2 = this.g;
            if (this.f4764e - i2 < 4) {
                M(4);
                i2 = this.g;
            }
            this.g = i2 + 4;
            byte[] bArr = this.d;
            return ((bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        public final long H() throws InvalidProtocolBufferException {
            int i2 = this.g;
            if (this.f4764e - i2 < 8) {
                M(8);
                i2 = this.g;
            }
            this.g = i2 + 8;
            byte[] bArr = this.d;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        public final int I() {
            int i2;
            int i3 = this.g;
            int i4 = this.f4764e;
            if (i4 != i3) {
                int i5 = i3 + 1;
                byte[] bArr = this.d;
                byte b2 = bArr[i3];
                if (b2 >= 0) {
                    this.g = i5;
                    return b2;
                }
                if (i4 - i5 >= 9) {
                    int i6 = i3 + 2;
                    int i7 = (bArr[i5] << 7) ^ b2;
                    if (i7 < 0) {
                        i2 = i7 ^ (-128);
                    } else {
                        int i8 = i3 + 3;
                        int i9 = (bArr[i6] << 14) ^ i7;
                        if (i9 >= 0) {
                            i2 = i9 ^ 16256;
                        } else {
                            int i10 = i3 + 4;
                            int i11 = i9 ^ (bArr[i8] << 21);
                            if (i11 < 0) {
                                i2 = (-2080896) ^ i11;
                            } else {
                                i8 = i3 + 5;
                                byte b3 = bArr[i10];
                                int i12 = (i11 ^ (b3 << 28)) ^ 266354560;
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
                    this.g = i6;
                    return i2;
                }
            }
            return (int) K();
        }

        public final long J() {
            long j;
            long j2;
            long j3;
            long j4;
            int i2 = this.g;
            int i3 = this.f4764e;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.d;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.g = i4;
                    return b2;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b2;
                    if (i6 < 0) {
                        j = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            j = i8 ^ 16256;
                            i5 = i7;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                j4 = (-2080896) ^ i10;
                            } else {
                                long j5 = i10;
                                i5 = i2 + 5;
                                long j6 = j5 ^ (((long) bArr[i9]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i9 = i2 + 6;
                                    long j7 = j6 ^ (((long) bArr[i5]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i5 = i2 + 7;
                                        j6 = j7 ^ (((long) bArr[i9]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i9 = i2 + 8;
                                            j7 = j6 ^ (((long) bArr[i5]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i5 = i2 + 9;
                                                long j8 = (j7 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i2 + 10;
                                                    if (bArr[i5] >= 0) {
                                                        i5 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i5 = i9;
                            j = j4;
                        }
                    }
                    this.g = i5;
                    return j;
                }
            }
            return K();
        }

        public final long K() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                if (this.g == this.f4764e) {
                    M(1);
                }
                int i3 = this.g;
                this.g = i3 + 1;
                byte b2 = this.d[i3];
                j |= ((long) (b2 & AbstractJsonLexerKt.TC_INVALID)) << i2;
                if ((b2 & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        public final void L() {
            int i2 = this.f4764e + this.f;
            this.f4764e = i2;
            int i3 = this.f4766i + i2;
            int i4 = this.j;
            if (i3 <= i4) {
                this.f = 0;
                return;
            }
            int i5 = i3 - i4;
            this.f = i5;
            this.f4764e = i2 - i5;
        }

        public final void M(int i2) throws InvalidProtocolBufferException {
            if (O(i2)) {
                return;
            }
            if (i2 <= (Integer.MAX_VALUE - this.f4766i) - this.g) {
                throw InvalidProtocolBufferException.m();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void N(int i2) throws InvalidProtocolBufferException {
            int i3 = this.f4764e;
            int i4 = this.g;
            if (i2 <= i3 - i4 && i2 >= 0) {
                this.g = i4 + i2;
                return;
            }
            InputStream inputStream = this.f4763c;
            if (i2 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            int i5 = this.f4766i;
            int i6 = i5 + i4;
            int i7 = i6 + i2;
            int i8 = this.j;
            if (i7 > i8) {
                N((i8 - i5) - i4);
                throw InvalidProtocolBufferException.m();
            }
            this.f4766i = i6;
            int i9 = i3 - i4;
            this.f4764e = 0;
            this.g = 0;
            while (i9 < i2) {
                long j = i2 - i9;
                try {
                    try {
                        long jSkip = inputStream.skip(j);
                        if (jSkip < 0 || jSkip > j) {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i9 += (int) jSkip;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        e2.X = true;
                        throw e2;
                    }
                } catch (Throwable th) {
                    this.f4766i += i9;
                    L();
                    throw th;
                }
            }
            this.f4766i += i9;
            L();
            if (i9 >= i2) {
                return;
            }
            int i10 = this.f4764e;
            int i11 = i10 - this.g;
            this.g = i10;
            M(1);
            while (true) {
                int i12 = i2 - i11;
                int i13 = this.f4764e;
                if (i12 <= i13) {
                    this.g = i12;
                    return;
                } else {
                    i11 += i13;
                    this.g = i13;
                    M(1);
                }
            }
        }

        public final boolean O(int i2) throws IOException {
            int i3 = this.g;
            int i4 = i3 + i2;
            int i5 = this.f4764e;
            if (i4 <= i5) {
                throw new IllegalStateException(a.k("refillBuffer() called when ", i2, " bytes were already available in buffer"));
            }
            int i6 = this.f4766i;
            if (i2 <= (Integer.MAX_VALUE - i6) - i3 && i6 + i3 + i2 <= this.j) {
                byte[] bArr = this.d;
                if (i3 > 0) {
                    if (i5 > i3) {
                        System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                    }
                    this.f4766i += i3;
                    this.f4764e -= i3;
                    this.g = 0;
                }
                int i7 = this.f4764e;
                int iMin = Math.min(bArr.length - i7, (Integer.MAX_VALUE - this.f4766i) - i7);
                InputStream inputStream = this.f4763c;
                try {
                    int i8 = inputStream.read(bArr, i7, iMin);
                    if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
                    }
                    if (i8 > 0) {
                        this.f4764e += i8;
                        L();
                        if (this.f4764e >= i2) {
                            return true;
                        }
                        return O(i2);
                    }
                } catch (InvalidProtocolBufferException e2) {
                    e2.X = true;
                    throw e2;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void a(int i2) throws InvalidProtocolBufferException {
            if (this.f4765h != i2) {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int d() {
            return this.f4766i + this.g;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean e() {
            return this.g == this.f4764e && !O(1);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void h(int i2) {
            this.j = i2;
            L();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int i(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            int i3 = this.f4766i + this.g + i2;
            if (i3 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i4 = this.j;
            if (i3 > i4) {
                throw InvalidProtocolBufferException.m();
            }
            this.j = i3;
            L();
            return i4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean j() {
            return J() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteString k() throws IOException {
            int I2 = I();
            int i2 = this.f4764e;
            int i3 = this.g;
            int i4 = i2 - i3;
            byte[] bArr = this.d;
            if (I2 <= i4 && I2 > 0) {
                ByteString byteStringH = ByteString.h(i3, I2, bArr);
                this.g += I2;
                return byteStringH;
            }
            if (I2 == 0) {
                return ByteString.f4747Y;
            }
            if (I2 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArrE = E(I2);
            if (bArrE != null) {
                return ByteString.h(0, bArrE.length, bArrE);
            }
            int i5 = this.g;
            int i6 = this.f4764e;
            int length = i6 - i5;
            this.f4766i += i6;
            this.g = 0;
            this.f4764e = 0;
            ArrayList<byte[]> arrayListF = F(I2 - length);
            byte[] bArr2 = new byte[I2];
            System.arraycopy(bArr, i5, bArr2, 0, length);
            for (byte[] bArr3 : arrayListF) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            ByteString byteString = ByteString.f4747Y;
            return new ByteString.LiteralByteString(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(H());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int m() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int n() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long o() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(G());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int q() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int s() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long t() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(I());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(J());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String w() throws InvalidProtocolBufferException {
            int I2 = I();
            byte[] bArr = this.d;
            if (I2 > 0) {
                int i2 = this.f4764e;
                int i3 = this.g;
                if (I2 <= i2 - i3) {
                    String str = new String(bArr, i3, I2, Internal.f4857a);
                    this.g += I2;
                    return str;
                }
            }
            if (I2 == 0) {
                return "";
            }
            if (I2 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            if (I2 > this.f4764e) {
                return new String(D(I2), Internal.f4857a);
            }
            M(I2);
            String str2 = new String(bArr, this.g, I2, Internal.f4857a);
            this.g += I2;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String x() throws IOException {
            int I2 = I();
            int i2 = this.g;
            int i3 = this.f4764e;
            int i4 = i3 - i2;
            byte[] bArrD = this.d;
            if (I2 <= i4 && I2 > 0) {
                this.g = i2 + I2;
            } else {
                if (I2 == 0) {
                    return "";
                }
                if (I2 < 0) {
                    throw InvalidProtocolBufferException.k();
                }
                i2 = 0;
                if (I2 <= i3) {
                    M(I2);
                    this.g = I2;
                } else {
                    bArrD = D(I2);
                }
            }
            return Utf8.f4942a.a(bArrD, i2, I2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int y() throws InvalidProtocolBufferException {
            if (e()) {
                this.f4765h = 0;
                return 0;
            }
            int I2 = I();
            this.f4765h = I2;
            if ((I2 >>> 3) != 0) {
                return I2;
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int z() {
            return I();
        }
    }

    public static final class UnsafeDirectNioDecoder extends CodedInputStream {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ByteBuffer f4767c;
        public final long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f4768e;
        public long f;
        public final long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4769h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4770i;
        public int j = Integer.MAX_VALUE;

        public UnsafeDirectNioDecoder(ByteBuffer byteBuffer) {
            this.f4767c = byteBuffer;
            long jB = UnsafeUtil.b(byteBuffer);
            this.d = jB;
            this.f4768e = ((long) byteBuffer.limit()) + jB;
            long jPosition = jB + ((long) byteBuffer.position());
            this.f = jPosition;
            this.g = jPosition;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long A() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean B(int i2) throws InvalidProtocolBufferException {
            int i3 = i2 & 7;
            int i4 = 0;
            if (i3 != 0) {
                if (i3 == 1) {
                    J(8);
                    return true;
                }
                if (i3 == 2) {
                    J(F());
                    return true;
                }
                if (i3 == 3) {
                    C();
                    a(((i2 >>> 3) << 3) | 4);
                    return true;
                }
                if (i3 == 4) {
                    return false;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.i();
                }
                J(4);
                return true;
            }
            if (((int) (this.f4768e - this.f)) >= 10) {
                while (i4 < 10) {
                    long j = this.f;
                    this.f = j + 1;
                    if (UnsafeUtil.f4938c.f(j) < 0) {
                        i4++;
                    }
                }
                throw InvalidProtocolBufferException.j();
            }
            while (i4 < 10) {
                long j2 = this.f;
                if (j2 == this.f4768e) {
                    throw InvalidProtocolBufferException.m();
                }
                this.f = j2 + 1;
                if (UnsafeUtil.f4938c.f(j2) < 0) {
                    i4++;
                }
            }
            throw InvalidProtocolBufferException.j();
            return true;
        }

        public final int D() throws InvalidProtocolBufferException {
            long j = this.f;
            if (this.f4768e - j < 4) {
                throw InvalidProtocolBufferException.m();
            }
            this.f = 4 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f4938c;
            return ((memoryAccessor.f(j + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (memoryAccessor.f(j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((memoryAccessor.f(1 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((memoryAccessor.f(2 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        public final long E() throws InvalidProtocolBufferException {
            long j = this.f;
            if (this.f4768e - j < 8) {
                throw InvalidProtocolBufferException.m();
            }
            this.f = 8 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f4938c;
            return ((((long) memoryAccessor.f(j + 7)) & 255) << 56) | (((long) memoryAccessor.f(j)) & 255) | ((((long) memoryAccessor.f(1 + j)) & 255) << 8) | ((((long) memoryAccessor.f(2 + j)) & 255) << 16) | ((((long) memoryAccessor.f(3 + j)) & 255) << 24) | ((((long) memoryAccessor.f(4 + j)) & 255) << 32) | ((((long) memoryAccessor.f(5 + j)) & 255) << 40) | ((((long) memoryAccessor.f(6 + j)) & 255) << 48);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0099 A[PHI: r6
  0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (r4.f(r8) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int F() {
            /*
                r12 = this;
                long r0 = r12.f
                long r2 = r12.f4768e
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L93
            La:
                r2 = 1
                long r2 = r2 + r0
                androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.f4938c
                byte r5 = r4.f(r0)
                if (r5 < 0) goto L18
                r12.f = r2
                return r5
            L18:
                long r6 = r12.f4768e
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
                long r0 = r12.H()
                int r0 = (int) r0
                return r0
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
                r12.f = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder.F():int");
        }

        public final long G() {
            long j;
            long j2;
            long j3;
            int i2;
            long j4 = this.f;
            if (this.f4768e != j4) {
                long j5 = 1 + j4;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f4938c;
                byte bF = memoryAccessor.f(j4);
                if (bF >= 0) {
                    this.f = j5;
                    return bF;
                }
                if (this.f4768e - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iF = (memoryAccessor.f(j5) << 7) ^ bF;
                    if (iF >= 0) {
                        long j7 = 3 + j4;
                        int iF2 = iF ^ (memoryAccessor.f(j6) << 14);
                        if (iF2 < 0) {
                            j6 = j4 + 4;
                            int iF3 = iF2 ^ (memoryAccessor.f(j7) << 21);
                            if (iF3 < 0) {
                                i2 = (-2080896) ^ iF3;
                            } else {
                                j7 = 5 + j4;
                                long jF = ((long) iF3) ^ (((long) memoryAccessor.f(j6)) << 28);
                                if (jF >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = 6 + j4;
                                    long jF2 = jF ^ (((long) memoryAccessor.f(j7)) << 35);
                                    if (jF2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = 7 + j4;
                                        jF = jF2 ^ (((long) memoryAccessor.f(j8)) << 42);
                                        if (jF >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = 8 + j4;
                                            jF2 = jF ^ (((long) memoryAccessor.f(j7)) << 49);
                                            if (jF2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j9 = j4 + 9;
                                                long jF3 = (jF2 ^ (((long) memoryAccessor.f(j8)) << 56)) ^ 71499008037633920L;
                                                if (jF3 < 0) {
                                                    long j10 = j4 + 10;
                                                    if (memoryAccessor.f(j9) >= 0) {
                                                        j6 = j10;
                                                        j = jF3;
                                                    }
                                                } else {
                                                    j = jF3;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jF2;
                                    j6 = j8;
                                }
                                j = j3 ^ jF;
                            }
                            this.f = j6;
                            return j;
                        }
                        j = iF2 ^ 16256;
                        j6 = j7;
                        this.f = j6;
                        return j;
                    }
                    i2 = iF ^ (-128);
                    j = i2;
                    this.f = j6;
                    return j;
                }
            }
            return H();
        }

        public final long H() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                long j2 = this.f;
                if (j2 == this.f4768e) {
                    throw InvalidProtocolBufferException.m();
                }
                this.f = 1 + j2;
                byte bF = UnsafeUtil.f4938c.f(j2);
                j |= ((long) (bF & AbstractJsonLexerKt.TC_INVALID)) << i2;
                if ((bF & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        public final void I() {
            long j = this.f4768e + ((long) this.f4769h);
            this.f4768e = j;
            int i2 = (int) (j - this.g);
            int i3 = this.j;
            if (i2 <= i3) {
                this.f4769h = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f4769h = i4;
            this.f4768e = j - ((long) i4);
        }

        public final void J(int i2) throws InvalidProtocolBufferException {
            if (i2 >= 0) {
                long j = this.f4768e;
                long j2 = this.f;
                if (i2 <= ((int) (j - j2))) {
                    this.f = j2 + ((long) i2);
                    return;
                }
            }
            if (i2 >= 0) {
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void a(int i2) throws InvalidProtocolBufferException {
            if (this.f4770i != i2) {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int d() {
            return (int) (this.f - this.g);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean e() {
            return this.f == this.f4768e;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void h(int i2) {
            this.j = i2;
            I();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int i(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            int iD = i2 + d();
            int i3 = this.j;
            if (iD > i3) {
                throw InvalidProtocolBufferException.m();
            }
            this.j = iD;
            I();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean j() {
            return G() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteString k() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                long j = this.f4768e;
                long j2 = this.f;
                if (iF <= ((int) (j - j2))) {
                    byte[] bArr = new byte[iF];
                    long j3 = iF;
                    UnsafeUtil.f4938c.c(j2, bArr, 0L, j3);
                    this.f += j3;
                    ByteString byteString = ByteString.f4747Y;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (iF == 0) {
                return ByteString.f4747Y;
            }
            if (iF < 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(E());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int m() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int n() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long o() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(D());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int q() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long r() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int s() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long t() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(F());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(G());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String w() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                long j = this.f4768e;
                long j2 = this.f;
                if (iF <= ((int) (j - j2))) {
                    byte[] bArr = new byte[iF];
                    long j3 = iF;
                    UnsafeUtil.f4938c.c(j2, bArr, 0L, j3);
                    String str = new String(bArr, Internal.f4857a);
                    this.f += j3;
                    return str;
                }
            }
            if (iF == 0) {
                return "";
            }
            if (iF < 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String x() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                long j = this.f4768e;
                long j2 = this.f;
                if (iF <= ((int) (j - j2))) {
                    String strC = Utf8.c(this.f4767c, (int) (j2 - this.d), iF);
                    this.f += (long) iF;
                    return strC;
                }
            }
            if (iF == 0) {
                return "";
            }
            if (iF <= 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int y() throws InvalidProtocolBufferException {
            if (e()) {
                this.f4770i = 0;
                return 0;
            }
            int iF = F();
            this.f4770i = iF;
            if ((iF >>> 3) != 0) {
                return iF;
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int z() {
            return F();
        }
    }

    public static int b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static CodedInputStream f(InputStream inputStream) {
        if (inputStream != null) {
            return new StreamDecoder(inputStream);
        }
        byte[] bArr = Internal.f4858b;
        return g(bArr, 0, bArr.length, false);
    }

    public static CodedInputStream g(byte[] bArr, int i2, int i3, boolean z2) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i2, i3, z2);
        try {
            arrayDecoder.i(i3);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract long A();

    public abstract boolean B(int i2);

    public final void C() throws InvalidProtocolBufferException {
        boolean zB;
        do {
            int iY = y();
            if (iY == 0) {
                return;
            }
            int i2 = this.f4752a;
            if (i2 >= 100) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f4752a = i2 + 1;
            zB = B(iY);
            this.f4752a--;
        } while (zB);
    }

    public abstract void a(int i2);

    public abstract int d();

    public abstract boolean e();

    public abstract void h(int i2);

    public abstract int i(int i2);

    public abstract boolean j();

    public abstract ByteString k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract String w();

    public abstract String x();

    public abstract int y();

    public abstract int z();
}
