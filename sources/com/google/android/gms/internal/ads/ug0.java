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
public final class ug0 extends m80 {
    public final Context l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WeakReference f20776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gd0 f20777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final xv0 f20778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ka0 f20779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wa0 f20780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u80 f20781r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wy f20782s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vz0 f20783t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final mu0 f20784u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final yh0 f20785v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20786w;

    public ug0(k80 k80Var, Context context, b30 b30Var, gd0 gd0Var, xv0 xv0Var, ka0 ka0Var, wa0 wa0Var, u80 u80Var, du0 du0Var, vz0 vz0Var, mu0 mu0Var, yh0 yh0Var) {
        super(k80Var);
        this.f20786w = false;
        this.l = context;
        this.f20777n = gd0Var;
        this.f20776m = new WeakReference(b30Var);
        this.f20778o = xv0Var;
        this.f20779p = ka0Var;
        this.f20780q = wa0Var;
        this.f20781r = u80Var;
        this.f20783t = vz0Var;
        dy dyVar = du0Var.l;
        this.f20782s = new wy(dyVar != null ? dyVar.f13754a : "", dyVar != null ? dyVar.f13755b : 1);
        this.f20784u = mu0Var;
        this.f20785v = yh0Var;
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
        Context context;
        zzt.zzc();
        gd0 gd0Var = this.f20777n;
        boolean zZzR = zzs.zzR(gd0Var.zzb());
        Context context2 = this.l;
        ka0 ka0Var = this.f20779p;
        if (!zZzR) {
            if (((Boolean) zzba.zzc().a(am.f12291of)).booleanValue()) {
                zzt.zzc();
                zzs.zzQ(context2, this.f17335b, this.f20785v);
            }
            if (((Boolean) zzba.zzc().a(am.f12338s1)).booleanValue()) {
                zzt.zzc();
                if (zzs.zzJ(context2)) {
                    int i10 = zze.zza;
                    zzo.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    ka0Var.zze();
                    if (((Boolean) zzba.zzc().a(am.f12354t1)).booleanValue()) {
                        this.f20783t.a(((fu0) this.f17334a.f16196b.f20920d).f14546b);
                        return;
                    }
                    return;
                }
            }
        }
        if (this.f20786w) {
            int i11 = zze.zza;
            zzo.zzi("The rewarded ad have been showed.");
            ka0Var.zzc(pi1.C(10, null, null));
            return;
        }
        this.f20786w = true;
        xa0 xa0Var = xa0.f21829x;
        xv0 xv0Var = this.f20778o;
        xv0Var.S0(xa0Var);
        if (activity == null) {
            context = activity;
            context = context2;
        }
        try {
            context = activity;
            gd0Var.c(z10, context, ka0Var);
            xv0Var.S0(xa0.f21828w);
        } catch (fd0 e10) {
            ka0Var.Z(e10);
        }
    }

    public final void finalize() throws Throwable {
        try {
            b30 b30Var = (b30) this.f20776m.get();
            if (((Boolean) zzba.zzc().a(am.M7)).booleanValue()) {
                if (!this.f20786w && b30Var != null) {
                    l00.f16613f.execute(new m30(b30Var, 6));
                }
            } else if (b30Var != null) {
                b30Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
