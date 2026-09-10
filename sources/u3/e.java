package u3;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.d0;
import i1.e0;
import java.util.Arrays;
import java.util.Collections;
import l1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f51704x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f51705a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f51710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f51711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f51712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0 f51713i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f51716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f51717n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f51720q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f51721r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f51723t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a0 f51725v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f51726w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd1 f51706b = new xd1(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.q f51707c = new l1.q(Arrays.copyOf(f51704x, 10));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f51718o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f51719p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f51722s = C.TIME_UNSET;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f51724u = C.TIME_UNSET;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51714j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51715k = 0;
    public int l = NotificationCompat.FLAG_LOCAL_ONLY;

    public e(String str, int i10, String str2, boolean z10) {
        this.f51705a = z10;
        this.f51708d = str;
        this.f51709e = i10;
        this.f51710f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01f4  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // u3.f
    public final void b(l1.q qVar) throws e0 {
        byte b10;
        int i10;
        int i11;
        char c4;
        int i12;
        char c5;
        int i13;
        int i14;
        int i15;
        this.f51712h.getClass();
        String str = y.f44830a;
        while (qVar.a() > 0) {
            int i16 = this.f51714j;
            byte b11 = -1;
            l1.q qVar2 = this.f51707c;
            int i17 = 3;
            xd1 xd1Var = this.f51706b;
            int i18 = 0;
            int i19 = 4;
            int i20 = 1;
            if (i16 == 0) {
                byte[] bArr = qVar.f44813a;
                int i21 = qVar.f44814b;
                int i22 = qVar.f44815c;
                while (true) {
                    if (i21 < i22) {
                        int i23 = i21 + 1;
                        int i24 = i17;
                        int i25 = bArr[i21];
                        int i26 = i25 & 255;
                        if (this.l == 512 && (((65280 | ((((byte) i26) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (!this.f51717n) {
                                int i27 = i21 - 1;
                                qVar.M(i21);
                                byte[] bArr2 = xd1Var.f21843b;
                                if (qVar.a() < i20) {
                                    b10 = -1;
                                } else {
                                    qVar.k(bArr2, i18, i20);
                                    xd1Var.q(i19);
                                    int i28 = xd1Var.i(i20);
                                    int i29 = this.f51718o;
                                    if (i29 == -1 || i28 == i29) {
                                        if (this.f51719p != -1) {
                                            byte[] bArr3 = xd1Var.f21843b;
                                            if (qVar.a() >= i20) {
                                                qVar.k(bArr3, i18, i20);
                                                xd1Var.q(2);
                                                i13 = 4;
                                                if (xd1Var.i(4) != this.f51719p) {
                                                    b10 = -1;
                                                } else {
                                                    qVar.M(i23);
                                                }
                                            }
                                        } else {
                                            i13 = 4;
                                        }
                                        byte[] bArr4 = xd1Var.f21843b;
                                        if (qVar.a() >= i13) {
                                            qVar.k(bArr4, i18, i13);
                                            xd1Var.q(14);
                                            int i30 = xd1Var.i(13);
                                            if (i30 < 7) {
                                                b10 = -1;
                                            } else {
                                                byte[] bArr5 = qVar.f44813a;
                                                int i31 = qVar.f44815c;
                                                int i32 = i27 + i30;
                                                if (i32 < i31) {
                                                    byte b12 = bArr5[i32];
                                                    b10 = -1;
                                                    if (b12 == -1) {
                                                        int i33 = i32 + 1;
                                                        if (i33 != i31) {
                                                            int i34 = bArr5[i33];
                                                            if ((((65280 | ((i34 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((i34 & 8) >> 3) == i28) {
                                                            }
                                                        }
                                                    } else if (b12 == 73 && ((i14 = i32 + 1) == i31 || (bArr5[i14] == 68 && ((i15 = i32 + 2) == i31 || bArr5[i15] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b10 = -1;
                                    }
                                }
                                i10 = 1;
                            }
                            this.f51720q = (i25 & 8) >> 3;
                            this.f51716m = (i25 & 1) == 0;
                            if (this.f51717n) {
                                this.f51714j = i24;
                                this.f51715k = 0;
                            } else {
                                this.f51714j = 1;
                                this.f51715k = 0;
                            }
                            qVar.M(i23);
                        } else {
                            b10 = b11;
                            i10 = i20;
                        }
                        int i35 = this.l;
                        int i36 = i26 | i35;
                        if (i36 == 329) {
                            i11 = 3;
                            c4 = 256;
                            i12 = 0;
                            c5 = 2;
                            this.l = 768;
                        } else if (i36 == 511) {
                            i11 = 3;
                            c4 = 256;
                            i12 = 0;
                            c5 = 2;
                            this.l = 512;
                        } else if (i36 == 836) {
                            i11 = 3;
                            c4 = 256;
                            i12 = 0;
                            c5 = 2;
                            this.l = 1024;
                        } else if (i36 != 1075) {
                            c4 = 256;
                            if (i35 != 256) {
                                this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                                i11 = 3;
                                i12 = 0;
                                c5 = 2;
                            } else {
                                i11 = 3;
                                i12 = 0;
                                c5 = 2;
                            }
                            i20 = i10;
                            b11 = b10;
                            i19 = 4;
                            i18 = i12;
                            i17 = i11;
                        } else {
                            this.f51714j = 2;
                            this.f51715k = 3;
                            this.f51723t = 0;
                            qVar2.M(0);
                            qVar.M(i23);
                        }
                        i21 = i23;
                        i20 = i10;
                        b11 = b10;
                        i19 = 4;
                        i18 = i12;
                        i17 = i11;
                    } else {
                        qVar.M(i21);
                    }
                }
            } else if (i16 != 1) {
                if (i16 == 2) {
                    byte[] bArr6 = qVar2.f44813a;
                    int iMin = Math.min(qVar.a(), 10 - this.f51715k);
                    qVar.k(bArr6, this.f51715k, iMin);
                    int i37 = this.f51715k + iMin;
                    this.f51715k = i37;
                    if (i37 == 10) {
                        this.f51713i.g(10, qVar2);
                        qVar2.M(6);
                        a0 a0Var = this.f51713i;
                        int iY = qVar2.y() + 10;
                        this.f51714j = 4;
                        this.f51715k = 10;
                        this.f51725v = a0Var;
                        this.f51726w = 0L;
                        this.f51723t = iY;
                    }
                } else if (i16 == 3) {
                    int i38 = this.f51716m ? 7 : 5;
                    byte[] bArr7 = xd1Var.f21843b;
                    int iMin2 = Math.min(qVar.a(), i38 - this.f51715k);
                    qVar.k(bArr7, this.f51715k, iMin2);
                    int i39 = this.f51715k + iMin2;
                    this.f51715k = i39;
                    if (i39 == i38) {
                        xd1Var.q(0);
                        if (this.f51721r) {
                            xd1Var.t(10);
                        } else {
                            int i40 = xd1Var.i(2) + 1;
                            if (i40 != 2) {
                                l1.a.s("AdtsReader", "Detected audio object type: " + i40 + ", but assuming AAC LC.");
                                i40 = 2;
                            }
                            xd1Var.t(5);
                            byte[] bArrB = n2.b.b(i40, this.f51719p, xd1Var.i(3));
                            n2.a aVarS = n2.b.s(new xd1(bArrB, 2), false);
                            i1.o oVar = new i1.o();
                            oVar.f42589a = this.f51711g;
                            oVar.l = d0.n(this.f51710f);
                            oVar.f42600m = d0.n(MimeTypes.AUDIO_AAC);
                            oVar.f42598j = aVarS.f46420a;
                            oVar.E = aVarS.f46422c;
                            oVar.F = aVarS.f46421b;
                            oVar.f42603p = Collections.singletonList(bArrB);
                            oVar.f42592d = this.f51708d;
                            oVar.f42594f = this.f51709e;
                            i1.p pVar = new i1.p(oVar);
                            this.f51722s = 1024000000 / ((long) pVar.G);
                            this.f51712h.b(pVar);
                            this.f51721r = true;
                        }
                        xd1Var.t(4);
                        int i41 = xd1Var.i(13);
                        int i42 = i41 - 7;
                        if (this.f51716m) {
                            i42 = i41 - 9;
                        }
                        a0 a0Var2 = this.f51712h;
                        long j10 = this.f51722s;
                        this.f51714j = 4;
                        this.f51715k = 0;
                        this.f51725v = a0Var2;
                        this.f51726w = j10;
                        this.f51723t = i42;
                    }
                } else {
                    if (i16 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(qVar.a(), this.f51723t - this.f51715k);
                    this.f51725v.g(iMin3, qVar);
                    int i43 = this.f51715k + iMin3;
                    this.f51715k = i43;
                    if (i43 == this.f51723t) {
                        go.k.t(this.f51724u != C.TIME_UNSET);
                        this.f51725v.a(this.f51724u, 1, this.f51723t, 0, null);
                        this.f51724u += this.f51726w;
                        this.f51714j = 0;
                        this.f51715k = 0;
                        this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                    }
                }
            } else if (qVar.a() != 0) {
                xd1Var.f21843b[0] = qVar.f44813a[qVar.f44814b];
                xd1Var.q(2);
                int i44 = xd1Var.i(4);
                int i45 = this.f51719p;
                if (i45 == -1 || i44 == i45) {
                    if (!this.f51717n) {
                        this.f51717n = true;
                        this.f51718o = this.f51720q;
                        this.f51719p = i44;
                    }
                    this.f51714j = 3;
                    this.f51715k = 0;
                } else {
                    this.f51717n = false;
                    this.f51714j = 0;
                    this.f51715k = 0;
                    this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                }
            }
        }
    }

    @Override // u3.f
    public final void g(n2.m mVar, ga gaVar) {
        gaVar.a();
        gaVar.b();
        this.f51711g = gaVar.f14806e;
        gaVar.b();
        a0 a0VarTrack = mVar.track(gaVar.f14805d, 1);
        this.f51712h = a0VarTrack;
        this.f51725v = a0VarTrack;
        if (!this.f51705a) {
            this.f51713i = new n2.j();
            return;
        }
        gaVar.a();
        gaVar.b();
        a0 a0VarTrack2 = mVar.track(gaVar.f14805d, 5);
        this.f51713i = a0VarTrack2;
        i1.o oVar = new i1.o();
        gaVar.b();
        oVar.f42589a = gaVar.f14806e;
        oVar.l = d0.n(this.f51710f);
        oVar.f42600m = d0.n(MimeTypes.APPLICATION_ID3);
        q4.a.o(oVar, a0VarTrack2);
    }

    @Override // u3.f
    public final void h(int i10, long j10) {
        this.f51724u = j10;
    }

    @Override // u3.f
    public final void seek() {
        this.f51724u = C.TIME_UNSET;
        this.f51717n = false;
        this.f51714j = 0;
        this.f51715k = 0;
        this.l = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    @Override // u3.f
    public final void d(boolean z10) {
    }
}
