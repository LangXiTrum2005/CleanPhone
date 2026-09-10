package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l70 extends m80 {
    public final b30 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f16764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f16765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final lj1 f16766o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gd0 f16767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xv0 f16768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ka0 f16769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f16770s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h00 f16771t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final yh0 f16772u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16773v;

    public l70(k80 k80Var, Context context, b30 b30Var, int i10, lj1 lj1Var, gd0 gd0Var, xv0 xv0Var, ka0 ka0Var, h00 h00Var, yh0 yh0Var) {
        super(k80Var);
        this.f16773v = false;
        this.l = b30Var;
        this.f16765n = context;
        this.f16764m = i10;
        this.f16766o = lj1Var;
        this.f16767p = gd0Var;
        this.f16768q = xv0Var;
        this.f16769r = ka0Var;
        this.f16770s = ((Boolean) zzba.zzc().a(am.B6)).booleanValue();
        this.f16771t = h00Var;
        this.f16772u = yh0Var;
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
        b30 b30Var;
        du0 du0VarZzC;
        int i10;
        xv0 xv0Var = this.f16768q;
        ka0 ka0Var = this.f16769r;
        Context context = activity;
        if (activity == null) {
            context = this.f16765n;
        }
        boolean z11 = this.f16770s;
        if (z11) {
            xv0Var.S0(xa0.f21829x);
        }
        zzt.zzc();
        gd0 gd0Var = this.f16767p;
        if (!zzs.zzR(gd0Var.zzb())) {
            if (((Boolean) zzba.zzc().a(am.f12291of)).booleanValue()) {
                zzt.zzc();
                zzs.zzQ(context, this.f17335b, this.f16772u);
            }
            if (((Boolean) zzba.zzc().a(am.f12338s1)).booleanValue()) {
                zzt.zzc();
                if (zzs.zzJ(context)) {
                    int i11 = zze.zza;
                    zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    ka0Var.zze();
                    if (((Boolean) zzba.zzc().a(am.f12354t1)).booleanValue()) {
                        new vz0(context.getApplicationContext(), zzt.zzs().zza()).a(((fu0) this.f17334a.f16196b.f20920d).f14546b);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) zzba.zzc().a(am.Cd)).booleanValue() && (b30Var = this.l) != null && (du0VarZzC = b30Var.zzC()) != null && du0VarZzC.r0) {
            int i12 = du0VarZzC.f13709s0;
            h00 h00Var = this.f16771t;
            synchronized (h00Var.f15012a) {
                g00 g00Var = h00Var.f15015d;
                synchronized (g00Var.f14633f) {
                    i10 = g00Var.l;
                }
            }
            if (i12 != i10) {
                int i13 = zze.zza;
                zzo.zzi("The app open consent form has been shown.");
                ka0Var.zzc(pi1.C(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f16773v) {
            int i14 = zze.zza;
            zzo.zzi("App open interstitial ad is already visible.");
            ka0Var.zzc(pi1.C(10, null, null));
        }
        if (this.f16773v) {
            return;
        }
        try {
            gd0Var.c(z10, context, ka0Var);
            if (z11) {
                xv0Var.S0(xa0.f21828w);
            }
            this.f16773v = true;
        } catch (fd0 e10) {
            ka0Var.Z(e10);
        }
    }

    public final void d() {
        pa0 pa0Var = this.f17336c;
        pa0Var.getClass();
        pa0Var.S0(new zl(null, 1));
        b30 b30Var = this.l;
        if (b30Var != null) {
            b30Var.destroy();
        }
    }

    public final void e(int i10, long j10) {
        String str;
        lj1 lj1Var = this.f16766o;
        lj1 lj1VarA = ((yh0) lj1Var.f17036b).a();
        lj1VarA.l("gqi", ((fu0) ((ju0) lj1Var.f17037c).f16196b.f20920d).f14546b);
        lj1VarA.l("action", "ad_closed");
        lj1VarA.l("show_time", String.valueOf(j10));
        lj1VarA.l("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        if (i11 == 0) {
            str = "h";
        } else if (i11 == 1) {
            str = "bb";
        } else if (i11 == 2) {
            str = "cc";
        } else if (i11 != 3) {
            str = i11 != 4 ? "u" : CampaignEx.KEY_ACTIVITY_PATH_AND_NAME;
        } else {
            str = "cb";
        }
        lj1VarA.l("acr", str);
        lj1VarA.m();
    }
}
