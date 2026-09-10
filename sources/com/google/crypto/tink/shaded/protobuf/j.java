package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends androidx.datastore.preferences.protobuf.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f24580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24586i = Integer.MAX_VALUE;

    public j(byte[] bArr, int i10, int i11, boolean z10) {
        this.f24580c = bArr;
        this.f24581d = i11 + i10;
        this.f24583f = i10;
        this.f24584g = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long A() {
        return H();
    }

    public final int E() throws d0 {
        int i10 = this.f24583f;
        if (this.f24581d - i10 < 4) {
            throw d0.l();
        }
        this.f24583f = i10 + 4;
        byte[] bArr = this.f24580c;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long F() throws d0 {
        int i10 = this.f24583f;
        if (this.f24581d - i10 < 8) {
            throw d0.l();
        }
        this.f24583f = i10 + 8;
        byte[] bArr = this.f24580c;
        return ((((long) bArr[i10 + 1]) & 255) << 8) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public final int G() {
        int i10;
        int i11 = this.f24583f;
        int i12 = this.f24581d;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f24580c;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f24583f = i13;
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
                this.f24583f = i14;
                return i10;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f24583f;
        int i11 = this.f24581d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f24580c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f24583f = i12;
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
                this.f24583f = i13;
                return j10;
            }
        }
        return I();
    }

    public final long I() throws d0 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f24583f;
            if (i11 == this.f24581d) {
                throw d0.l();
            }
            this.f24583f = i11 + 1;
            byte b10 = this.f24580c[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw d0.i();
    }

    public final void J() {
        int i10 = this.f24581d + this.f24582e;
        this.f24581d = i10;
        int i11 = i10 - this.f24584g;
        int i12 = this.f24586i;
        if (i11 <= i12) {
            this.f24582e = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f24582e = i13;
        this.f24581d = i10 - i13;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final void a(int i10) throws d0 {
        if (this.f24585h != i10) {
            throw new d0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int d() {
        return this.f24583f - this.f24584g;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final boolean e() {
        return this.f24583f == this.f24581d;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final void g(int i10) {
        this.f24586i = i10;
        J();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int h(int i10) throws d0 {
        if (i10 < 0) {
            throw d0.j();
        }
        int iD = d() + i10;
        if (iD < 0) {
            throw new d0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.f24586i;
        if (iD > i11) {
            throw d0.l();
        }
        this.f24586i = iD;
        J();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final boolean i() {
        return H() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // androidx.datastore.preferences.protobuf.m
    public final h k() throws d0 {
        byte[] bArrCopyOfRange;
        int iG = G();
        byte[] bArr = this.f24580c;
        if (iG > 0) {
            int i10 = this.f24581d;
            int i11 = this.f24583f;
            if (iG <= i10 - i11) {
                h hVarM = i.m(bArr, i11, iG);
                this.f24583f += iG;
                return hVarM;
            }
        }
        if (iG == 0) {
            return i.f24569b;
        }
        if (iG > 0) {
            int i12 = this.f24581d;
            int i13 = this.f24583f;
            if (iG <= i12 - i13) {
                int i14 = iG + i13;
                this.f24583f = i14;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
            } else {
                if (iG <= 0) {
                    throw d0.l();
                }
                if (iG == 0) {
                    throw d0.j();
                }
                bArrCopyOfRange = b0.f24540b;
            }
        } else {
            if (iG <= 0) {
                throw d0.l();
            }
            if (iG == 0) {
                throw d0.j();
            }
            bArrCopyOfRange = b0.f24540b;
        }
        h hVar = i.f24569b;
        return new h(bArrCopyOfRange);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final double l() {
        return Double.longBitsToDouble(F());
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int m() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int n() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long o() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final float p() {
        return Float.intBitsToFloat(E());
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int q() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long r() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int s() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long t() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int u() {
        return androidx.datastore.preferences.protobuf.m.b(G());
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long v() {
        return androidx.datastore.preferences.protobuf.m.c(H());
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final String w() throws d0 {
        int iG = G();
        if (iG > 0) {
            int i10 = this.f24581d;
            int i11 = this.f24583f;
            if (iG <= i10 - i11) {
                String str = new String(this.f24580c, i11, iG, b0.f24539a);
                this.f24583f += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw d0.j();
        }
        throw d0.l();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final String x() throws d0 {
        int iG = G();
        if (iG > 0) {
            int i10 = this.f24581d;
            int i11 = this.f24583f;
            if (iG <= i10 - i11) {
                String strA = l1.f24607a.A(this.f24580c, i11, iG);
                this.f24583f += iG;
                return strA;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG <= 0) {
            throw d0.j();
        }
        throw d0.l();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int y() throws d0 {
        if (e()) {
            this.f24585h = 0;
            return 0;
        }
        int iG = G();
        this.f24585h = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw d0.d();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int z() {
        return G();
    }
}
