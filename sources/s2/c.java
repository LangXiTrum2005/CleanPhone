package s2;

import am.e;
import b3.i;
import com.google.android.gms.internal.ads.b2;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.s2;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.c0;
import i1.d0;
import i1.e0;
import i1.o;
import i1.p;
import java.util.Arrays;
import k3.j;
import l1.q;
import l1.y;
import n2.a0;
import n2.h;
import n2.k;
import n2.l;
import n2.m;
import n2.t;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f50081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f50082f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c0 f50084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s2 f50085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f50086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f50087k;
    public b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f50088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f50089n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f50077a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f50078b = new q(new byte[32768], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50079c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q2 f50080d = new q2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f50083g = 0;

    @Override // n2.k
    public final boolean a(l lVar) {
        c0 c0VarA = new e(20).A(lVar, i.f5460c, 0);
        if (c0VarA != null) {
            int length = c0VarA.f42527a.length;
        }
        q qVar = new q(4);
        ((h) lVar).peekFully(qVar.f44813a, 0, 4, false);
        return qVar.B() == 1716281667;
    }

    @Override // n2.k
    public final int b(l lVar, q2 q2Var) throws e0 {
        s2 s2Var;
        t oVar;
        long j10;
        long j11;
        boolean zD;
        int i10 = this.f50083g;
        c0 c0Var = null;
        int i11 = 1;
        int i12 = 0;
        if (i10 == 0) {
            lVar.resetPeekPosition();
            long peekPosition = lVar.getPeekPosition();
            c0 c0VarA = new e(20).A(lVar, !this.f50079c ? null : i.f5460c, 0);
            if (c0VarA != null && c0VarA.f42527a.length != 0) {
                c0Var = c0VarA;
            }
            lVar.skipFully((int) (lVar.getPeekPosition() - peekPosition));
            this.f50084h = c0Var;
            this.f50083g = 1;
            return 0;
        }
        byte[] bArr = this.f50077a;
        if (i10 == 1) {
            lVar.peekFully(bArr, 0, bArr.length);
            lVar.resetPeekPosition();
            this.f50083g = 2;
            return 0;
        }
        int i13 = 4;
        int i14 = 3;
        if (i10 == 2) {
            q qVar = new q(4);
            lVar.readFully(qVar.f44813a, 0, 4);
            if (qVar.B() != 1716281667) {
                throw e0.a(null, "Failed to read FLAC stream marker.");
            }
            this.f50083g = 3;
            return 0;
        }
        int i15 = 7;
        int i16 = 6;
        if (i10 == 3) {
            int i17 = 0;
            s2 s2Var2 = this.f50085i;
            boolean z10 = false;
            while (!z10) {
                lVar.resetPeekPosition();
                byte[] bArr2 = new byte[i13];
                xd1 xd1Var = new xd1(bArr2, i13);
                int i18 = i17;
                lVar.peekFully(bArr2, i18, i13);
                boolean zH = xd1Var.h();
                int i19 = xd1Var.i(i15);
                int i20 = xd1Var.i(24) + i13;
                if (i19 == 0) {
                    byte[] bArr3 = new byte[38];
                    lVar.readFully(bArr3, i18, 38);
                    s2Var2 = new s2(bArr3, i13, i11);
                } else {
                    if (s2Var2 == null) {
                        throw new IllegalArgumentException();
                    }
                    c0 c0Var2 = (c0) s2Var2.l;
                    if (i19 == i14) {
                        q qVar2 = new q(i20);
                        lVar.readFully(qVar2.f44813a, i18, i20);
                        s2Var2 = new s2(s2Var2.f19768a, s2Var2.f19769b, s2Var2.f19770c, s2Var2.f19771d, s2Var2.f19772e, s2Var2.f19774g, s2Var2.f19775h, s2Var2.f19777j, n2.b.y(qVar2), (c0) s2Var2.l);
                    } else {
                        if (i19 == i13) {
                            q qVar3 = new q(i20);
                            lVar.readFully(qVar3.f44813a, 0, i20);
                            qVar3.N(i13);
                            c0 c0VarW = n2.b.w(Arrays.asList((String[]) n2.b.z(qVar3, false, false).f47386b));
                            if (c0Var2 != null) {
                                c0VarW = c0Var2.b(c0VarW);
                            }
                            s2Var = new s2(s2Var2.f19768a, s2Var2.f19769b, s2Var2.f19770c, s2Var2.f19771d, s2Var2.f19772e, s2Var2.f19774g, s2Var2.f19775h, s2Var2.f19777j, (m5.k) s2Var2.f19778k, c0VarW);
                        } else if (i19 == i16) {
                            q qVar4 = new q(i20);
                            lVar.readFully(qVar4.f44813a, 0, i20);
                            qVar4.N(4);
                            c0 c0Var3 = new c0(j0.B(z2.a.d(qVar4)));
                            if (c0Var2 != null) {
                                c0Var3 = c0Var2.b(c0Var3);
                            }
                            s2Var = new s2(s2Var2.f19768a, s2Var2.f19769b, s2Var2.f19770c, s2Var2.f19771d, s2Var2.f19772e, s2Var2.f19774g, s2Var2.f19775h, s2Var2.f19777j, (m5.k) s2Var2.f19778k, c0Var3);
                        } else {
                            lVar.skipFully(i20);
                        }
                        s2Var2 = s2Var;
                    }
                }
                String str = y.f44830a;
                this.f50085i = s2Var2;
                z10 = zH;
                i11 = 1;
                i13 = 4;
                i14 = 3;
                i15 = 7;
                i16 = 6;
                i17 = 0;
            }
            this.f50085i.getClass();
            this.f50086j = Math.max(this.f50085i.f19770c, 6);
            p pVarC = this.f50085i.c(bArr, this.f50084h);
            a0 a0Var = this.f50082f;
            o oVarA = pVarC.a();
            oVarA.l = d0.n(MimeTypes.AUDIO_FLAC);
            q4.a.o(oVarA, a0Var);
            this.f50082f.e(this.f50085i.b());
            this.f50083g = 4;
            return 0;
        }
        long j12 = 0;
        if (i10 == 4) {
            lVar.resetPeekPosition();
            q qVar5 = new q(2);
            lVar.peekFully(qVar5.f44813a, 0, 2);
            int iG = qVar5.G();
            if ((iG >> 2) != 16382) {
                lVar.resetPeekPosition();
                throw e0.a(null, "First frame does not start with sync code.");
            }
            lVar.resetPeekPosition();
            this.f50087k = iG;
            m mVar = this.f50081e;
            String str2 = y.f44830a;
            long position = lVar.getPosition();
            long length = lVar.getLength();
            this.f50085i.getClass();
            s2 s2Var3 = this.f50085i;
            m5.k kVar = (m5.k) s2Var3.f19778k;
            if (kVar != null && ((long[]) kVar.f45902b).length > 0) {
                oVar = new n2.o(s2Var3, position, 0);
                i12 = 0;
            } else if (length == -1 || s2Var3.f19777j <= 0) {
                i12 = 0;
                oVar = new n2.o(s2Var3.b());
            } else {
                int i21 = this.f50087k;
                int i22 = s2Var3.f19770c;
                j jVar = new j(s2Var3, 27);
                a aVar = new a(s2Var3, i21);
                long jB = s2Var3.b();
                long j13 = s2Var3.f19777j;
                int i23 = s2Var3.f19771d;
                if (i23 > 0) {
                    j10 = ((((long) i23) + ((long) i22)) / 2) + 1;
                } else {
                    int i24 = s2Var3.f19768a;
                    j10 = 64 + (((((i24 != s2Var3.f19769b || i24 <= 0) ? 4096L : i24) * ((long) s2Var3.f19774g)) * ((long) s2Var3.f19775h)) / 8);
                }
                b bVar = new b(jVar, aVar, jB, j13, position, length, j10, Math.max(6, i22));
                this.l = bVar;
                oVar = (n2.c) bVar.f14172b;
            }
            mVar.u(oVar);
            this.f50083g = 5;
            return i12;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        this.f50082f.getClass();
        this.f50085i.getClass();
        b bVar2 = this.l;
        if (bVar2 != null && ((b2) bVar2.f14174d) != null) {
            return bVar2.a(lVar, q2Var);
        }
        if (this.f50089n == -1) {
            s2 s2Var4 = this.f50085i;
            lVar.resetPeekPosition();
            lVar.advancePeekPosition(1);
            byte[] bArr4 = new byte[1];
            lVar.peekFully(bArr4, 0, 1);
            boolean z11 = (bArr4[0] & 1) == 1;
            lVar.advancePeekPosition(2);
            i15 = z11 ? 7 : 6;
            q qVar6 = new q(i15);
            byte[] bArr5 = qVar6.f44813a;
            int i25 = 0;
            while (i25 < i15) {
                int iW = lVar.w(bArr5, i25, i15 - i25);
                if (iW == -1) {
                    break;
                }
                i25 += iW;
            }
            qVar6.L(i25);
            lVar.resetPeekPosition();
            try {
                long jH = qVar6.H();
                if (!z11) {
                    jH *= (long) s2Var4.f19769b;
                }
                long j14 = s2Var4.f19777j;
                if (j14 == 0 || jH <= j14) {
                    j12 = jH;
                } else {
                    i11 = 0;
                }
            } catch (NumberFormatException unused) {
            }
            if (i11 == 0) {
                throw e0.a(null, null);
            }
            this.f50089n = j12;
        } else {
            q qVar7 = this.f50078b;
            int i26 = qVar7.f44815c;
            if (i26 < 32768) {
                int i27 = lVar.read(qVar7.f44813a, i26, 32768 - i26);
                i11 = i27 != -1 ? 0 : 1;
                if (i11 == 0) {
                    qVar7.L(i26 + i27);
                } else if (qVar7.a() == 0) {
                    long j15 = this.f50089n * 1000000;
                    s2 s2Var5 = this.f50085i;
                    String str3 = y.f44830a;
                    this.f50082f.a(j15 / ((long) s2Var5.f19772e), 1, this.f50088m, 0, null);
                    return -1;
                }
            } else {
                i11 = 0;
            }
            int i28 = qVar7.f44814b;
            int i29 = this.f50088m;
            int i30 = this.f50086j;
            if (i29 < i30) {
                qVar7.N(Math.min(i30 - i29, qVar7.a()));
            }
            this.f50085i.getClass();
            int i31 = qVar7.f44814b;
            while (true) {
                int i32 = qVar7.f44815c - 16;
                q2 q2Var2 = this.f50080d;
                if (i31 > i32) {
                    if (i11 != 0) {
                        while (true) {
                            int i33 = qVar7.f44815c;
                            if (i31 <= i33 - this.f50086j) {
                                qVar7.M(i31);
                                try {
                                    zD = n2.b.d(qVar7, this.f50085i, this.f50087k, q2Var2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zD = false;
                                }
                                if (qVar7.f44814b > qVar7.f44815c) {
                                    zD = false;
                                }
                                if (zD) {
                                    qVar7.M(i31);
                                    j11 = q2Var2.f18888a;
                                    break;
                                }
                                i31++;
                            } else {
                                qVar7.M(i33);
                            }
                        }
                    } else {
                        qVar7.M(i31);
                    }
                    j11 = -1;
                    break;
                }
                qVar7.M(i31);
                if (n2.b.d(qVar7, this.f50085i, this.f50087k, q2Var2)) {
                    qVar7.M(i31);
                    j11 = q2Var2.f18888a;
                    break;
                }
                i31++;
            }
            int i34 = qVar7.f44814b - i28;
            qVar7.M(i28);
            this.f50082f.g(i34, qVar7);
            int i35 = this.f50088m + i34;
            this.f50088m = i35;
            if (j11 != -1) {
                long j16 = this.f50089n * 1000000;
                s2 s2Var6 = this.f50085i;
                String str4 = y.f44830a;
                this.f50082f.a(j16 / ((long) s2Var6.f19772e), 1, i35, 0, null);
                this.f50088m = 0;
                this.f50089n = j11;
            }
            int length2 = qVar7.f44813a.length - qVar7.f44815c;
            if (qVar7.a() < 16 && length2 < 16) {
                int iA = qVar7.a();
                byte[] bArr6 = qVar7.f44813a;
                System.arraycopy(bArr6, qVar7.f44814b, bArr6, 0, iA);
                qVar7.M(0);
                qVar7.L(iA);
            }
        }
        return 0;
    }

    @Override // n2.k
    public final void c(m mVar) {
        this.f50081e = mVar;
        this.f50082f = mVar.track(0, 1);
        mVar.endTracks();
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f50083g = 0;
        } else {
            b bVar = this.l;
            if (bVar != null) {
                bVar.c(j11);
            }
        }
        this.f50089n = j11 != 0 ? -1L : 0L;
        this.f50088m = 0;
        this.f50078b.J(0);
    }

    @Override // n2.k
    public final void release() {
    }
}
