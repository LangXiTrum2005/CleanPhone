package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f14156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f14157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14158c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14161f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14164i;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14167m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14159d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14160e = C.TIME_UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14162g = C.TIME_UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14163h = C.TIME_UNSET;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f14165j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s6 f14166k = s6.f19862f;

    public f1(Context context, u0 u0Var) {
        this.f14156a = u0Var;
        this.f14157b = new l1(context, 0);
    }

    public final void a(int i10) {
        if (i10 == 0) {
            this.f14159d = 1;
        } else if (i10 != 1) {
            this.f14159d = Math.min(this.f14159d, 2);
        } else {
            this.f14159d = 0;
        }
        this.f14157b.e();
    }

    public final void b() {
        this.f14158c = true;
        this.f14166k.getClass();
        this.f14161f = uu0.t(SystemClock.elapsedRealtime());
        l1 l1Var = this.f14157b;
        l1Var.f16628b = true;
        l1Var.e();
        DisplayManager displayManager = (DisplayManager) l1Var.f16627a.getSystemService(X3.i.f27786d);
        h1 k1Var = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                k1Var = Build.VERSION.SDK_INT >= 33 ? new k1(choreographer, displayManager) : new i1(choreographer, displayManager, 0);
            } catch (RuntimeException e10) {
                v71.B("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        l1Var.f16644s = k1Var;
        if (k1Var != null) {
            k1Var.g();
        }
        l1Var.g(false);
    }

    public final void c(Surface surface) {
        this.l = surface != null;
        this.f14167m = false;
        l1 l1Var = this.f14157b;
        if (l1Var.f16629c != surface) {
            l1Var.h();
            l1Var.f16629c = surface;
            l1Var.g(true);
        }
        this.f14159d = Math.min(this.f14159d, 1);
    }

    public final void d(float f10) {
        l1 l1Var = this.f14157b;
        l1Var.f16630d = f10;
        p0 p0Var = (p0) l1Var.f16643r;
        ((o0) p0Var.f18418d).d();
        ((o0) p0Var.f18419e).d();
        p0Var.f18415a = false;
        p0Var.f18416b = C.TIME_UNSET;
        p0Var.f18417c = 0;
        l1Var.f();
    }

    public final boolean e(boolean z10) {
        if (z10 && (this.f14159d == 3 || (this.f14167m && !this.l))) {
            this.f14163h = C.TIME_UNSET;
            return true;
        }
        if (this.f14163h == C.TIME_UNSET) {
            return false;
        }
        this.f14166k.getClass();
        if (SystemClock.elapsedRealtime() < this.f14163h) {
            return true;
        }
        this.f14163h = C.TIME_UNSET;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0293  */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0170, code lost:
    
        if (r3 > 100000) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017f, code lost:
    
        if (r33 >= r37) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0188, code lost:
    
        if (r30.f14158c != false) goto L85;
     */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(long r31, long r33, long r35, long r37, boolean r39, boolean r40, com.google.android.gms.internal.ads.e1 r41) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f1.f(long, long, long, long, boolean, boolean, com.google.android.gms.internal.ads.e1):int");
    }

    public final void g(float f10) {
        ps1.v(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (f10 == this.f14165j) {
            return;
        }
        this.f14165j = f10;
        l1 l1Var = this.f14157b;
        l1Var.f16633g = f10;
        l1Var.g(false);
    }
}
