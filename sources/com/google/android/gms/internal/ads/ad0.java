package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ad0 extends m80 {
    public final Context l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WeakReference f11992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xv0 f11993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final gd0 f11994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u80 f11995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vz0 f11996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ka0 f11997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h00 f11998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yh0 f11999t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12000u;

    public ad0(k80 k80Var, Context context, b30 b30Var, xv0 xv0Var, gd0 gd0Var, u80 u80Var, vz0 vz0Var, ka0 ka0Var, h00 h00Var, yh0 yh0Var) {
        super(k80Var);
        this.f12000u = false;
        this.l = context;
        this.f11992m = new WeakReference(b30Var);
        this.f11993n = xv0Var;
        this.f11994o = gd0Var;
        this.f11995p = u80Var;
        this.f11996q = vz0Var;
        this.f11997r = ka0Var;
        this.f11998s = h00Var;
        this.f11999t = yh0Var;
    }

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
    public final void c(Activity activity, boolean z10) {
        du0 du0VarZzC;
        int i10;
        Context context = this.l;
        ka0 ka0Var = this.f11997r;
        xv0 xv0Var = this.f11993n;
        xv0Var.S0(xa0.f21829x);
        zzt.zzc();
        gd0 gd0Var = this.f11994o;
        if (!zzs.zzR(gd0Var.zzb())) {
            if (((Boolean) zzba.zzc().a(am.f12291of)).booleanValue()) {
                zzt.zzc();
                zzs.zzQ(context, this.f17335b, this.f11999t);
            }
            if (((Boolean) zzba.zzc().a(am.f12338s1)).booleanValue()) {
                zzt.zzc();
                if (zzs.zzJ(context)) {
                    int i11 = zze.zza;
                    zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    ka0Var.zze();
                    if (((Boolean) zzba.zzc().a(am.f12354t1)).booleanValue()) {
                        this.f11996q.a(((fu0) this.f17334a.f16196b.f20920d).f14546b);
                        return;
                    }
                    return;
                }
            }
        }
        b30 b30Var = (b30) this.f11992m.get();
        if (((Boolean) zzba.zzc().a(am.Cd)).booleanValue() && b30Var != null && (du0VarZzC = b30Var.zzC()) != null && du0VarZzC.r0) {
            int i12 = du0VarZzC.f13709s0;
            h00 h00Var = this.f11998s;
            synchronized (h00Var.f15012a) {
                g00 g00Var = h00Var.f15015d;
                synchronized (g00Var.f14633f) {
                    i10 = g00Var.l;
                }
            }
            if (i12 != i10) {
                int i13 = zze.zza;
                zzo.zzi("The interstitial consent form has been shown.");
                ka0Var.zzc(pi1.C(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f12000u) {
            int i14 = zze.zza;
            zzo.zzi("The interstitial ad has been shown.");
            ka0Var.zzc(pi1.C(10, null, null));
        }
        Context context2 = activity;
        if (this.f12000u) {
            return;
        }
        if (activity == null) {
            context2 = context;
        }
        try {
            gd0Var.c(z10, context2, ka0Var);
            xv0Var.S0(xa0.f21828w);
            this.f12000u = true;
        } catch (fd0 e10) {
            ka0Var.Z(e10);
        }
    }

    public final void finalize() throws Throwable {
        try {
            b30 b30Var = (b30) this.f11992m.get();
            if (((Boolean) zzba.zzc().a(am.M7)).booleanValue()) {
                if (!this.f12000u && b30Var != null) {
                    l00.f16613f.execute(new m30(b30Var, 4));
                }
            } else if (b30Var != null) {
                b30Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
