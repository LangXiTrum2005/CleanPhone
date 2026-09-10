package l2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import com.google.android.gms.internal.ads.e1;
import com.google.android.gms.internal.ads.h1;
import com.google.android.gms.internal.ads.l1;
import com.google.android.gms.internal.ads.o0;
import com.google.android.gms.internal.ads.p0;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f44922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f44923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44925d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f44928g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f44931j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f44933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44934n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44926e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f44927f = C.TIME_UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f44929h = C.TIME_UNSET;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f44930i = C.TIME_UNSET;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f44932k = 1.0f;
    public l1.u l = l1.u.f44822a;

    public q(Context context, h hVar, long j10) {
        this.f44922a = hVar;
        this.f44924c = j10;
        this.f44923b = new l1(context, 1);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01de  */
    /* JADX WARN: Code duplicated, block: B:101:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:108:0x021c  */
    /* JADX WARN: Code duplicated, block: B:109:0x021e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0222  */
    /* JADX WARN: Code duplicated, block: B:114:0x0238  */
    /* JADX WARN: Code duplicated, block: B:121:0x0253  */
    /* JADX WARN: Code duplicated, block: B:122:0x0256  */
    /* JADX WARN: Code duplicated, block: B:125:0x026e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0278  */
    /* JADX WARN: Code duplicated, block: B:129:0x0280  */
    /* JADX WARN: Code duplicated, block: B:130:0x0283  */
    /* JADX WARN: Code duplicated, block: B:132:0x0287  */
    /* JADX WARN: Code duplicated, block: B:134:0x028b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0292  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ce A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:151:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02db  */
    /* JADX WARN: Code duplicated, block: B:157:0x02de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x02e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:160:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0190 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0191  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cf  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final int a(long j10, long j11, long j12, long j13, boolean z10, boolean z11, e1 e1Var) {
        long j14;
        long j15;
        long j16;
        int i10;
        int i11;
        boolean z12;
        l1 l1Var;
        long j17;
        int i12;
        long j18;
        h1 h1Var;
        long j19;
        boolean z13;
        long j20;
        int i13;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long jAbs;
        long j27;
        long j28;
        long j29;
        long j30;
        float f10;
        float f11;
        long j31;
        p0 p0Var;
        long j32;
        o0 o0Var;
        long j33;
        e1Var.f13801a = C.TIME_UNSET;
        e1Var.f13802b = C.TIME_UNSET;
        if (this.f44925d && this.f44927f == C.TIME_UNSET) {
            this.f44927f = j11;
        }
        if (this.f44929h != j10) {
            l1 l1Var2 = this.f44923b;
            j14 = -9223372036854775807L;
            long j34 = l1Var2.l;
            if (j34 != -1) {
                l1Var2.f16640o = j34;
                l1Var2.f16641p = l1Var2.f16638m;
                l1Var2.f16642q = l1Var2.f16639n;
                l1Var2.f16635i = l1Var2.f16636j;
            }
            l1Var2.f16637k++;
            p0 p0Var2 = (p0) l1Var2.f16643r;
            j15 = 1000;
            long j35 = j10 * 1000;
            ((o0) p0Var2.f18418d).b(j35);
            if (((o0) p0Var2.f18418d).a()) {
                p0Var2.f18415a = false;
                j16 = 0;
            } else {
                j16 = 0;
                if (p0Var2.f18416b != C.TIME_UNSET) {
                    if (p0Var2.f18415a) {
                        o0 o0Var2 = (o0) p0Var2.f18419e;
                        long j36 = o0Var2.f18061d;
                        if (j36 == 0 ? false : o0Var2.f18064g[(int) ((j36 - 1) % 15)]) {
                            ((o0) p0Var2.f18419e).c();
                            ((o0) p0Var2.f18419e).b(p0Var2.f18416b);
                        }
                    } else {
                        ((o0) p0Var2.f18419e).c();
                        ((o0) p0Var2.f18419e).b(p0Var2.f18416b);
                    }
                    p0Var2.f18415a = true;
                    ((o0) p0Var2.f18419e).b(j35);
                }
            }
            if (p0Var2.f18415a && ((o0) p0Var2.f18419e).a()) {
                o0 o0Var3 = (o0) p0Var2.f18418d;
                p0Var2.f18418d = (o0) p0Var2.f18419e;
                p0Var2.f18419e = o0Var3;
                p0Var2.f18415a = false;
            }
            p0Var2.f18416b = j35;
            p0Var2.f18417c = ((o0) p0Var2.f18418d).a() ? 0 : p0Var2.f18417c + 1;
            l1Var2.c();
            this.f44929h = j10;
        } else {
            j14 = -9223372036854775807L;
            j15 = 1000;
            j16 = 0;
        }
        long jM = (long) ((j10 - j11) / ((double) this.f44932k));
        if (this.f44925d) {
            this.l.getClass();
            jM -= l1.y.M(SystemClock.elapsedRealtime()) - j12;
        }
        e1Var.f13801a = jM;
        if (!z10 || z11) {
            if (this.f44933m) {
                int i14 = 2;
                if (this.f44930i == j14 || this.f44931j) {
                    int i15 = this.f44926e;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            i10 = 3;
                            i11 = 5;
                        } else if (i15 == 2) {
                            i10 = 3;
                            i11 = 5;
                            if (j11 >= j13) {
                            }
                        } else {
                            if (i15 != 3) {
                                throw new IllegalStateException();
                            }
                            this.l.getClass();
                            i10 = 3;
                            i11 = 5;
                            long jM2 = l1.y.M(SystemClock.elapsedRealtime()) - this.f44928g;
                            if (this.f44925d) {
                                long j37 = this.f44927f;
                                if (j37 == j14 || j37 == j11 || jM >= -30000 || jM2 <= 100000) {
                                }
                            }
                        }
                        z12 = true;
                    } else {
                        i10 = 3;
                        i11 = 5;
                        z12 = this.f44925d;
                    }
                    if (z12) {
                        return 0;
                    }
                    if (this.f44925d && j11 != this.f44927f) {
                        this.l.getClass();
                        long jNanoTime = System.nanoTime();
                        l1Var = this.f44923b;
                        j17 = (e1Var.f13801a * j15) + jNanoTime;
                        if (l1Var.f16640o != -1) {
                            if (((o0) ((p0) l1Var.f16643r).f18418d).a()) {
                                p0Var = (p0) l1Var.f16643r;
                                if (((o0) p0Var.f18418d).a()) {
                                    o0Var = (o0) p0Var.f18418d;
                                    j18 = -30000;
                                    j33 = o0Var.f18062e;
                                    i12 = 1;
                                    if (j33 == j16) {
                                        j32 = j16;
                                    } else {
                                        j32 = o0Var.f18063f / j33;
                                    }
                                } else {
                                    i12 = 1;
                                    j18 = -30000;
                                    j32 = j14;
                                }
                                f10 = (l1Var.f16637k - l1Var.f16640o) * j32;
                                f11 = l1Var.f16633g;
                            } else {
                                i12 = 1;
                                j18 = -30000;
                                f10 = (j10 - l1Var.f16642q) * j15;
                                f11 = l1Var.f16633g;
                            }
                            j31 = l1Var.f16641p + ((long) (f10 / f11));
                            if (Math.abs(j17 - j31) <= 20000000) {
                                j17 = j31;
                            } else {
                                l1Var.b();
                            }
                        } else {
                            i12 = 1;
                            j18 = -30000;
                            i14 = 2;
                        }
                        l1Var.l = l1Var.f16637k;
                        l1Var.f16638m = j17;
                        l1Var.f16639n = j10;
                        h1Var = (h1) l1Var.f16644s;
                        if (h1Var != null) {
                            j21 = h1Var.f15047d;
                            j22 = ((h1) l1Var.f16644s).f15048e;
                            if (j21 != j14 && j22 != j14) {
                                j23 = (((j17 - j21) / j22) * j22) + j21;
                                if (j17 <= j23) {
                                    j24 = j23 - j22;
                                } else {
                                    j23 += j22;
                                    j24 = j23;
                                }
                                j25 = j23 - j17;
                                j26 = j17 - j24;
                                jAbs = Math.abs(j25 - j26);
                                if (jAbs < j22 / 2) {
                                    j28 = j22;
                                    j29 = j28 / 4;
                                    if (jAbs < j29) {
                                        j27 = j24;
                                        j30 = l1Var.f16635i;
                                        if (j30 != j16) {
                                            l1Var.f16636j = j30;
                                        } else {
                                            if (j25 < j26) {
                                                j29 = -j29;
                                            }
                                            l1Var.f16636j = j29;
                                        }
                                    } else {
                                        j27 = j24;
                                        l1Var.f16636j = j16;
                                    }
                                } else {
                                    j27 = j24;
                                    j28 = j22;
                                    l1Var.f16636j = l1Var.f16635i;
                                }
                                if (j25 + l1Var.f16636j >= j26) {
                                    j23 = j27;
                                }
                                j17 = j23 - ((j28 * 80) / 100);
                            }
                        }
                        e1Var.f13802b = j17;
                        j19 = (j17 - jNanoTime) / j15;
                        e1Var.f13801a = j19;
                        if (this.f44930i != j14 || this.f44931j) {
                            z13 = 0;
                        } else {
                            z13 = i12;
                        }
                        if (this.f44922a.L0(j19, j11, z11, z13)) {
                            return 4;
                        }
                        j20 = e1Var.f13801a;
                        if (j20 < j18 || z11) {
                            i13 = 0;
                        } else {
                            i13 = i12;
                        }
                        if (i13 != 0) {
                            if (z13 != 0) {
                                return i10;
                            }
                            return i14;
                        }
                        if (j20 > ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                            return i12;
                        }
                    }
                    return i11;
                }
                i10 = 3;
                i11 = 5;
                z12 = false;
                if (z12) {
                    return 0;
                }
                if (this.f44925d) {
                    this.l.getClass();
                    long jNanoTime2 = System.nanoTime();
                    l1Var = this.f44923b;
                    j17 = (e1Var.f13801a * j15) + jNanoTime2;
                    if (l1Var.f16640o != -1) {
                        if (((o0) ((p0) l1Var.f16643r).f18418d).a()) {
                            p0Var = (p0) l1Var.f16643r;
                            if (((o0) p0Var.f18418d).a()) {
                                o0Var = (o0) p0Var.f18418d;
                                j18 = -30000;
                                j33 = o0Var.f18062e;
                                i12 = 1;
                                if (j33 == j16) {
                                    j32 = j16;
                                } else {
                                    j32 = o0Var.f18063f / j33;
                                }
                            } else {
                                i12 = 1;
                                j18 = -30000;
                                j32 = j14;
                            }
                            f10 = (l1Var.f16637k - l1Var.f16640o) * j32;
                            f11 = l1Var.f16633g;
                        } else {
                            i12 = 1;
                            j18 = -30000;
                            f10 = (j10 - l1Var.f16642q) * j15;
                            f11 = l1Var.f16633g;
                        }
                        j31 = l1Var.f16641p + ((long) (f10 / f11));
                        if (Math.abs(j17 - j31) <= 20000000) {
                            j17 = j31;
                        } else {
                            l1Var.b();
                        }
                    } else {
                        i12 = 1;
                        j18 = -30000;
                        i14 = 2;
                    }
                    l1Var.l = l1Var.f16637k;
                    l1Var.f16638m = j17;
                    l1Var.f16639n = j10;
                    h1Var = (h1) l1Var.f16644s;
                    if (h1Var != null) {
                        j21 = h1Var.f15047d;
                        j22 = ((h1) l1Var.f16644s).f15048e;
                        if (j21 != j14) {
                            j23 = (((j17 - j21) / j22) * j22) + j21;
                            if (j17 <= j23) {
                                j24 = j23 - j22;
                            } else {
                                j23 += j22;
                                j24 = j23;
                            }
                            j25 = j23 - j17;
                            j26 = j17 - j24;
                            jAbs = Math.abs(j25 - j26);
                            if (jAbs < j22 / 2) {
                                j28 = j22;
                                j29 = j28 / 4;
                                if (jAbs < j29) {
                                    j27 = j24;
                                    j30 = l1Var.f16635i;
                                    if (j30 != j16) {
                                        l1Var.f16636j = j30;
                                    } else {
                                        if (j25 < j26) {
                                            j29 = -j29;
                                        }
                                        l1Var.f16636j = j29;
                                    }
                                } else {
                                    j27 = j24;
                                    l1Var.f16636j = j16;
                                }
                            } else {
                                j27 = j24;
                                j28 = j22;
                                l1Var.f16636j = l1Var.f16635i;
                            }
                            if (j25 + l1Var.f16636j >= j26) {
                                j23 = j27;
                            }
                            j17 = j23 - ((j28 * 80) / 100);
                        }
                    }
                    e1Var.f13802b = j17;
                    j19 = (j17 - jNanoTime2) / j15;
                    e1Var.f13801a = j19;
                    if (this.f44930i != j14) {
                        z13 = 0;
                    } else {
                        z13 = 0;
                    }
                    if (this.f44922a.L0(j19, j11, z11, z13)) {
                        return 4;
                    }
                    j20 = e1Var.f13801a;
                    if (j20 < j18) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                    }
                    if (i13 != 0) {
                        if (z13 != 0) {
                            return i10;
                        }
                        return i14;
                    }
                    if (j20 > ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                        return i12;
                    }
                }
                return i11;
            }
            if (this.f44922a.L0(jM, j11, z11, true)) {
                return 4;
            }
            if (!this.f44925d || e1Var.f13801a >= 30000) {
                this.f44934n = true;
                return 5;
            }
        }
        return 3;
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f44926e == 3 || (!this.f44933m && this.f44934n))) {
            this.f44930i = C.TIME_UNSET;
            return true;
        }
        if (this.f44930i == C.TIME_UNSET) {
            return false;
        }
        this.l.getClass();
        if (SystemClock.elapsedRealtime() < this.f44930i) {
            return true;
        }
        this.f44930i = C.TIME_UNSET;
        return false;
    }

    public final void c(boolean z10) {
        long jElapsedRealtime;
        this.f44931j = z10;
        long j10 = this.f44924c;
        if (j10 > 0) {
            this.l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        } else {
            jElapsedRealtime = C.TIME_UNSET;
        }
        this.f44930i = jElapsedRealtime;
    }

    public final void d() {
        this.f44925d = true;
        this.l.getClass();
        this.f44928g = l1.y.M(SystemClock.elapsedRealtime());
        l1 l1Var = this.f44923b;
        l1Var.f16628b = true;
        l1Var.b();
        DisplayManager displayManager = (DisplayManager) l1Var.f16627a.getSystemService(X3.i.f27786d);
        h1 sVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                sVar = Build.VERSION.SDK_INT >= 33 ? new s(choreographer, displayManager) : new r(choreographer, displayManager, 1);
            } catch (RuntimeException e10) {
                l1.a.t("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        l1Var.f16644s = sVar;
        if (sVar != null) {
            sVar.e();
        }
        l1Var.d(false);
    }

    public final void e(int i10) {
        if (i10 == 0) {
            this.f44926e = 1;
        } else if (i10 == 1) {
            this.f44926e = 0;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            this.f44926e = Math.min(this.f44926e, 2);
        }
        this.f44923b.b();
    }

    public final void f(float f10) {
        l1 l1Var = this.f44923b;
        l1Var.f16630d = f10;
        p0 p0Var = (p0) l1Var.f16643r;
        ((o0) p0Var.f18418d).c();
        ((o0) p0Var.f18419e).c();
        p0Var.f18415a = false;
        p0Var.f18416b = C.TIME_UNSET;
        p0Var.f18417c = 0;
        l1Var.c();
    }

    public final void g(Surface surface) {
        this.f44933m = surface != null;
        this.f44934n = false;
        l1 l1Var = this.f44923b;
        if (l1Var.f16629c != surface) {
            l1Var.a();
            l1Var.f16629c = surface;
            l1Var.d(true);
        }
        this.f44926e = Math.min(this.f44926e, 1);
    }

    public final void h(float f10) {
        go.k.i(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (f10 == this.f44932k) {
            return;
        }
        this.f44932k = f10;
        l1 l1Var = this.f44923b;
        l1Var.f16633g = f10;
        l1Var.d(false);
    }
}
