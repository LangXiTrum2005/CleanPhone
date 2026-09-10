package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b7 implements i7, i3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f12669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f12670k;
    public final Object l;

    public b7(k7 k7Var, long j10, long j11, long j12, long j13, boolean z10) {
        ps1.v(j10 >= 0 && j11 > j10);
        this.l = k7Var;
        this.f12660a = j10;
        this.f12661b = j11;
        if (j12 == j11 - j10 || z10) {
            this.f12663d = j13;
            this.f12662c = 4;
        } else {
            this.f12662c = 0;
        }
        this.f12670k = new h7(0);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    @Override // i3.d
    public long a(n2.l lVar) throws IOException {
        long j10;
        long j11;
        long jK;
        h7 h7Var = (h7) this.f12670k;
        int i10 = this.f12662c;
        long j12 = this.f12661b;
        if (i10 == 0) {
            j10 = 0;
            long position = lVar.getPosition();
            this.f12664e = position;
            this.f12662c = 1;
            long j13 = j12 - 65307;
            if (j13 > position) {
                return j13;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                if (this.f12666g == this.f12667h) {
                    jK = -1;
                } else {
                    long position2 = lVar.getPosition();
                    if (h7Var.b(lVar, this.f12667h)) {
                        h7Var.a(lVar, false);
                        lVar.resetPeekPosition();
                        long j14 = this.f12665f;
                        long j15 = h7Var.f15188b;
                        long j16 = j14 - j15;
                        j11 = 2;
                        int i11 = h7Var.f15190d + h7Var.f15191e;
                        if (0 > j16 || j16 >= 72000) {
                            if (j16 < 0) {
                                this.f12667h = position2;
                                this.f12669j = j15;
                            } else {
                                this.f12666g = lVar.getPosition() + ((long) i11);
                                this.f12668i = h7Var.f15188b;
                            }
                            long j17 = this.f12667h;
                            long j18 = this.f12666g;
                            if (j17 - j18 < 100000) {
                                this.f12667h = j18;
                                jK = j18;
                            } else {
                                long position3 = lVar.getPosition() - (((long) i11) * (j16 <= 0 ? 2L : 1L));
                                long j19 = this.f12667h;
                                long j20 = this.f12666g;
                                jK = l1.y.k((((j19 - j20) * j16) / (this.f12669j - this.f12668i)) + position3, j20, j19 - 1);
                            }
                        } else {
                            jK = -1;
                        }
                    } else {
                        jK = this.f12666g;
                        if (jK == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (jK != -1) {
                        return jK;
                    }
                    this.f12662c = 3;
                }
                j11 = 2;
                if (jK != -1) {
                    return jK;
                }
                this.f12662c = 3;
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j11 = 2;
            }
            while (true) {
                h7Var.b(lVar, -1L);
                h7Var.a(lVar, false);
                if (h7Var.f15188b > this.f12665f) {
                    lVar.resetPeekPosition();
                    this.f12662c = 4;
                    return -(this.f12668i + j11);
                }
                lVar.skipFully(h7Var.f15190d + h7Var.f15191e);
                this.f12666g = lVar.getPosition();
                this.f12668i = h7Var.f15188b;
            }
        } else {
            j10 = 0;
        }
        h7Var.f15187a = 0;
        h7Var.f15188b = j10;
        h7Var.f15189c = 0;
        h7Var.f15190d = 0;
        h7Var.f15191e = 0;
        if (!h7Var.b(lVar, -1L)) {
            throw new EOFException();
        }
        h7Var.a(lVar, false);
        lVar.skipFully(h7Var.f15190d + h7Var.f15191e);
        long j21 = h7Var.f15188b;
        while ((h7Var.f15187a & 4) != 4 && h7Var.b(lVar, -1L) && lVar.getPosition() < j12 && h7Var.a(lVar, true)) {
            try {
                lVar.skipFully(h7Var.f15190d + h7Var.f15191e);
                j21 = h7Var.f15188b;
            } catch (EOFException unused) {
            }
        }
        this.f12663d = j21;
        this.f12662c = 4;
        return this.f12664e;
    }

    @Override // i3.d
    public n2.t createSeekMap() {
        if (this.f12663d != 0) {
            return new i3.a(this);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.i7
    public long d(n2 n2Var) throws IOException {
        long j10;
        ?? r3;
        long j11;
        long j12;
        long jMax;
        long j13;
        h7 h7Var = (h7) this.f12670k;
        int i10 = this.f12662c;
        long j14 = this.f12661b;
        if (i10 == 0) {
            j10 = 0;
            long jZzn = n2Var.zzn();
            this.f12664e = jZzn;
            this.f12662c = 1;
            long j15 = (-65307) + j14;
            if (j15 > jZzn) {
                return j15;
            }
            r3 = 0;
        } else if (i10 != 1) {
            if (i10 == 2) {
                long j16 = this.f12666g;
                long j17 = this.f12667h;
                if (j16 == j17) {
                    jMax = -1;
                    j12 = -1;
                } else {
                    long jZzn2 = n2Var.zzn();
                    if (h7Var.c(n2Var, j17)) {
                        h7Var.d(n2Var, false);
                        n2Var.zzl();
                        long j18 = this.f12665f;
                        long j19 = h7Var.f15188b;
                        long j20 = j18 - j19;
                        j11 = 2;
                        int i11 = h7Var.f15190d + h7Var.f15191e;
                        if (j20 < 0 || j20 >= 72000) {
                            if (j20 < 0) {
                                this.f12667h = jZzn2;
                                this.f12669j = j19;
                            } else {
                                this.f12666g = n2Var.zzn() + ((long) i11);
                                this.f12668i = j19;
                            }
                            long j21 = this.f12667h;
                            long j22 = this.f12666g;
                            long j23 = j21 - j22;
                            if (j23 < 100000) {
                                this.f12667h = j22;
                                j12 = -1;
                                jMax = j22;
                            } else {
                                long jZzn3 = n2Var.zzn() - (((long) i11) * (j20 <= 0 ? 2L : 1L));
                                j12 = -1;
                                String str = uu0.f20901a;
                                jMax = Math.max(j22, Math.min(((j20 * j23) / (this.f12669j - this.f12668i)) + jZzn3, j21 - 1));
                            }
                        } else {
                            jMax = -1;
                            j12 = -1;
                        }
                    } else {
                        jMax = this.f12666g;
                        if (jMax == jZzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j12 = -1;
                    }
                    if (jMax != j12) {
                        return jMax;
                    }
                    this.f12662c = 3;
                    j13 = j12;
                }
                j11 = 2;
                if (jMax != j12) {
                    return jMax;
                }
                this.f12662c = 3;
                j13 = j12;
            } else {
                if (i10 != 3) {
                    return -1L;
                }
                j13 = -1;
                j11 = 2;
            }
            while (true) {
                h7Var.c(n2Var, j13);
                h7Var.d(n2Var, false);
                if (h7Var.f15188b > this.f12665f) {
                    n2Var.zzl();
                    this.f12662c = 4;
                    return -(this.f12668i + j11);
                }
                n2Var.zzf(h7Var.f15190d + h7Var.f15191e);
                this.f12666g = n2Var.zzn();
                this.f12668i = h7Var.f15188b;
                j13 = -1;
            }
        } else {
            j10 = 0;
            r3 = 0;
        }
        h7Var.f15187a = r3;
        h7Var.f15188b = j10;
        h7Var.f15189c = r3;
        h7Var.f15190d = r3;
        h7Var.f15191e = r3;
        if (!h7Var.c(n2Var, -1L)) {
            throw new EOFException();
        }
        h7Var.d(n2Var, r3);
        n2Var.zzf(h7Var.f15190d + h7Var.f15191e);
        long j24 = h7Var.f15188b;
        while ((h7Var.f15187a & 4) != 4 && h7Var.c(n2Var, -1L) && n2Var.zzn() < j14 && h7Var.d(n2Var, true)) {
            try {
                n2Var.zzf(h7Var.f15190d + h7Var.f15191e);
                j24 = h7Var.f15188b;
            } catch (EOFException unused) {
            }
        }
        this.f12663d = j24;
        this.f12662c = 4;
        return this.f12664e;
    }

    @Override // com.google.android.gms.internal.ads.i7
    public void f(long j10) {
        long j11 = this.f12663d - 1;
        String str = uu0.f20901a;
        this.f12665f = Math.max(0L, Math.min(j10, j11));
        this.f12662c = 2;
        this.f12666g = this.f12660a;
        this.f12667h = this.f12661b;
        this.f12668i = 0L;
        this.f12669j = this.f12663d;
    }

    @Override // i3.d
    public void startSeek(long j10) {
        this.f12665f = l1.y.k(j10, 0L, this.f12663d - 1);
        this.f12662c = 2;
        this.f12666g = this.f12660a;
        this.f12667h = this.f12661b;
        this.f12668i = 0L;
        this.f12669j = this.f12663d;
    }

    @Override // com.google.android.gms.internal.ads.i7
    public /* bridge */ /* synthetic */ a3 zzc() {
        if (this.f12663d != 0) {
            return new a7(this);
        }
        return null;
    }

    public b7(k7 k7Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        go.k.i(j10 >= 0 && j11 > j10);
        this.l = k7Var;
        this.f12660a = j10;
        this.f12661b = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f12662c = 0;
        } else {
            this.f12663d = j13;
            this.f12662c = 4;
        }
        this.f12670k = new h7(1);
    }
}
