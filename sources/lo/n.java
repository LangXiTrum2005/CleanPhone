package lo;

import com.google.android.gms.internal.measurement.lc;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f45656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f45657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45658c;

    public n(t source) {
        kotlin.jvm.internal.n.f(source, "source");
        this.f45656a = source;
        this.f45657b = new e();
    }

    public final long a(h targetBytes) {
        int i10;
        int i11;
        long j10;
        int i12;
        int i13;
        kotlin.jvm.internal.n.f(targetBytes, "targetBytes");
        if (this.f45658c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            e eVar = this.f45657b;
            eVar.getClass();
            kotlin.jvm.internal.n.f(targetBytes, "targetBytes");
            long j11 = 0;
            if (jMax < 0) {
                throw new IllegalArgumentException(defpackage.e.i(jMax, "fromIndex < 0: ").toString());
            }
            o oVar = eVar.f45636a;
            if (oVar == null) {
                j10 = -1;
            } else {
                long j12 = eVar.f45637b;
                int i14 = 0;
                if (j12 - jMax < jMax) {
                    while (j12 > jMax) {
                        oVar = oVar.f45665g;
                        kotlin.jvm.internal.n.c(oVar);
                        j12 -= (long) (oVar.f45661c - oVar.f45660b);
                    }
                    if (targetBytes.d() == 2) {
                        byte bI = targetBytes.i(0);
                        byte bI2 = targetBytes.i(1);
                        long j13 = jMax;
                        while (true) {
                            if (j12 < eVar.f45637b) {
                                byte[] bArr = oVar.f45659a;
                                i12 = (int) ((((long) oVar.f45660b) + j13) - j12);
                                int i15 = oVar.f45661c;
                                while (true) {
                                    if (i12 >= i15) {
                                        j13 = j12 + ((long) (oVar.f45661c - oVar.f45660b));
                                        oVar = oVar.f45664f;
                                        kotlin.jvm.internal.n.c(oVar);
                                        j12 = j13;
                                    } else {
                                        byte b10 = bArr[i12];
                                        if (b10 == bI || b10 == bI2) {
                                            i13 = oVar.f45660b;
                                            j10 = ((long) (i12 - i13)) + j12;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            } else {
                                j10 = -1;
                            }
                        }
                    } else {
                        byte[] bArrH = targetBytes.h();
                        long j14 = jMax;
                        while (true) {
                            if (j12 < eVar.f45637b) {
                                byte[] bArr2 = oVar.f45659a;
                                i12 = (int) ((((long) oVar.f45660b) + j14) - j12);
                                int i16 = oVar.f45661c;
                                while (true) {
                                    if (i12 < i16) {
                                        byte b11 = bArr2[i12];
                                        int length = bArrH.length;
                                        int i17 = i14;
                                        while (true) {
                                            if (i17 >= length) {
                                                i12++;
                                                i14 = 0;
                                            } else if (b11 == bArrH[i17]) {
                                                i13 = oVar.f45660b;
                                                j10 = ((long) (i12 - i13)) + j12;
                                            } else {
                                                i17++;
                                            }
                                        }
                                    } else {
                                        j14 = ((long) (oVar.f45661c - oVar.f45660b)) + j12;
                                        oVar = oVar.f45664f;
                                        kotlin.jvm.internal.n.c(oVar);
                                        j12 = j14;
                                        i14 = 0;
                                    }
                                }
                            } else {
                                j10 = -1;
                            }
                        }
                    }
                } else {
                    while (true) {
                        long j15 = ((long) (oVar.f45661c - oVar.f45660b)) + j11;
                        if (j15 > jMax) {
                            break;
                        }
                        oVar = oVar.f45664f;
                        kotlin.jvm.internal.n.c(oVar);
                        j11 = j15;
                    }
                    if (targetBytes.d() == 2) {
                        byte bI3 = targetBytes.i(0);
                        byte bI4 = targetBytes.i(1);
                        long j16 = jMax;
                        while (true) {
                            if (j11 < eVar.f45637b) {
                                byte[] bArr3 = oVar.f45659a;
                                i10 = (int) ((((long) oVar.f45660b) + j16) - j11);
                                int i18 = oVar.f45661c;
                                while (true) {
                                    if (i10 >= i18) {
                                        j16 = ((long) (oVar.f45661c - oVar.f45660b)) + j11;
                                        oVar = oVar.f45664f;
                                        kotlin.jvm.internal.n.c(oVar);
                                        j11 = j16;
                                    } else {
                                        byte b12 = bArr3[i10];
                                        if (b12 == bI3 || b12 == bI4) {
                                            i11 = oVar.f45660b;
                                            j10 = ((long) (i10 - i11)) + j11;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            } else {
                                j10 = -1;
                            }
                        }
                    } else {
                        int i19 = 0;
                        byte[] bArrH2 = targetBytes.h();
                        long j17 = jMax;
                        while (true) {
                            if (j11 < eVar.f45637b) {
                                byte[] bArr4 = oVar.f45659a;
                                i10 = (int) ((((long) oVar.f45660b) + j17) - j11);
                                int i20 = oVar.f45661c;
                                while (true) {
                                    if (i10 < i20) {
                                        byte b13 = bArr4[i10];
                                        int length2 = bArrH2.length;
                                        int i21 = i19;
                                        while (true) {
                                            if (i21 >= length2) {
                                                i10++;
                                                i19 = 0;
                                            } else if (b13 == bArrH2[i21]) {
                                                i11 = oVar.f45660b;
                                                j10 = ((long) (i10 - i11)) + j11;
                                            } else {
                                                i21++;
                                            }
                                        }
                                    } else {
                                        j17 = ((long) (oVar.f45661c - oVar.f45660b)) + j11;
                                        oVar = oVar.f45664f;
                                        kotlin.jvm.internal.n.c(oVar);
                                        j11 = j17;
                                        i19 = 0;
                                    }
                                }
                            } else {
                                j10 = -1;
                            }
                        }
                    }
                }
            }
            if (j10 != -1) {
                return j10;
            }
            long j18 = eVar.f45637b;
            if (this.f45656a.l(8192L, eVar) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j18);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f45658c) {
            return;
        }
        this.f45658c = true;
        this.f45656a.close();
        e eVar = this.f45657b;
        eVar.skip(eVar.f45637b);
    }

    public final boolean exhausted() {
        if (this.f45658c) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f45657b;
        return eVar.exhausted() && this.f45656a.l(8192L, eVar) == -1;
    }

    public final long indexOf(byte b10, long j10, long j11) {
        if (this.f45658c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j11) {
            throw new IllegalArgumentException(defpackage.e.i(j11, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j11) {
            e eVar = this.f45657b;
            byte b11 = b10;
            long j12 = j11;
            long jIndexOf = eVar.indexOf(b11, jMax, j12);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long j13 = eVar.f45637b;
            if (j13 >= j12 || this.f45656a.l(8192L, eVar) == -1) {
                break;
            }
            jMax = Math.max(jMax, j13);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // lo.g
    public final InputStream inputStream() {
        return new lc(this, 4);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f45658c;
    }

    @Override // lo.t
    public final long l(long j10, e sink) {
        kotlin.jvm.internal.n.f(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount < 0: ").toString());
        }
        if (this.f45658c) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f45657b;
        if (eVar.f45637b == 0 && this.f45656a.l(8192L, eVar) == -1) {
            return -1L;
        }
        return eVar.l(Math.min(j10, eVar.f45637b), sink);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.n.f(sink, "sink");
        e eVar = this.f45657b;
        if (eVar.f45637b == 0 && this.f45656a.l(8192L, eVar) == -1) {
            return -1;
        }
        return eVar.read(sink);
    }

    @Override // lo.g
    public final byte readByte() {
        require(1L);
        return this.f45657b.readByte();
    }

    @Override // lo.g
    public final byte[] readByteArray() {
        t tVar = this.f45656a;
        e eVar = this.f45657b;
        eVar.p(tVar);
        return eVar.readByteArray(eVar.f45637b);
    }

    @Override // lo.g
    public final h readByteString(long j10) throws EOFException {
        require(j10);
        return this.f45657b.readByteString(j10);
    }

    @Override // lo.g
    public final long readHexadecimalUnsignedLong() throws EOFException {
        e eVar;
        require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            boolean zRequest = request(i11);
            eVar = this.f45657b;
            if (!zRequest) {
                break;
            }
            byte bH = eVar.h(i10);
            if ((bH < 48 || bH > 57) && ((bH < 97 || bH > 102) && (bH < 65 || bH > 70))) {
                if (i10 != 0) {
                    break;
                }
                go.c.b(16);
                go.c.b(16);
                String string = Integer.toString(bH, 16);
                kotlin.jvm.internal.n.e(string, "toString(this, checkRadix(radix))");
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i10 = i11;
        }
        return eVar.readHexadecimalUnsignedLong();
    }

    @Override // lo.g
    public final int readInt() throws EOFException {
        require(4L);
        return this.f45657b.readInt();
    }

    public final int readIntLe() throws EOFException {
        require(4L);
        int i10 = this.f45657b.readInt();
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    @Override // lo.g
    public final short readShort() throws EOFException {
        require(2L);
        return this.f45657b.readShort();
    }

    @Override // lo.g
    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public final boolean request(long j10) {
        e eVar;
        if (j10 < 0) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount < 0: ").toString());
        }
        if (this.f45658c) {
            throw new IllegalStateException("closed");
        }
        do {
            eVar = this.f45657b;
            if (eVar.f45637b >= j10) {
                return true;
            }
        } while (this.f45656a.l(8192L, eVar) != -1);
        return false;
    }

    @Override // lo.g
    public final void require(long j10) throws EOFException {
        if (!request(j10)) {
            throw new EOFException();
        }
    }

    @Override // lo.g
    public final void skip(long j10) throws EOFException {
        if (this.f45658c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            e eVar = this.f45657b;
            if (eVar.f45637b == 0 && this.f45656a.l(8192L, eVar) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, eVar.f45637b);
            eVar.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // lo.t
    public final v timeout() {
        return this.f45656a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f45656a + ')';
    }

    @Override // lo.g
    public final String readUtf8LineStrict(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "limit < 0: ").toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j11);
        e eVar = this.f45657b;
        if (jIndexOf != -1) {
            return mo.a.a(jIndexOf, eVar);
        }
        if (j11 < Long.MAX_VALUE && request(j11) && eVar.h(j11 - 1) == 13 && request(j11 + 1) && eVar.h(j11) == 10) {
            return mo.a.a(j11, eVar);
        }
        e eVar2 = new e();
        eVar.a(eVar2, 0L, Math.min(32, eVar.f45637b));
        throw new EOFException("\\n not found: limit=" + Math.min(eVar.f45637b, j10) + " content=" + eVar2.readByteString(eVar2.f45637b).g() + (char) 8230);
    }
}
