package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzaj;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.signalgeneration.zzap;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.au0;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.bu0;
import com.google.android.gms.internal.ads.dp0;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.dv;
import com.google.android.gms.internal.ads.er0;
import com.google.android.gms.internal.ads.fp0;
import com.google.android.gms.internal.ads.fx1;
import com.google.android.gms.internal.ads.g50;
import com.google.android.gms.internal.ads.hp0;
import com.google.android.gms.internal.ads.hr;
import com.google.android.gms.internal.ads.hw;
import com.google.android.gms.internal.ads.hx1;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.j50;
import com.google.android.gms.internal.ads.j90;
import com.google.android.gms.internal.ads.kp0;
import com.google.android.gms.internal.ads.md0;
import com.google.android.gms.internal.ads.mt0;
import com.google.android.gms.internal.ads.n60;
import com.google.android.gms.internal.ads.oi0;
import com.google.android.gms.internal.ads.pe0;
import com.google.android.gms.internal.ads.ps1;
import com.google.android.gms.internal.ads.qe0;
import com.google.android.gms.internal.ads.qo;
import com.google.android.gms.internal.ads.r50;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.tz;
import com.google.android.gms.internal.ads.u40;
import com.google.android.gms.internal.ads.uo;
import com.google.android.gms.internal.ads.v50;
import com.google.android.gms.internal.ads.vj0;
import com.google.android.gms.internal.ads.vx;
import com.google.android.gms.internal.ads.xs0;
import com.google.android.gms.internal.ads.yh0;
import com.google.android.gms.internal.ads.yx0;
import com.google.android.gms.internal.ads.zl0;
import com.google.android.gms.internal.ads.zs0;
import java.util.HashMap;
import s9.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends zzcn {
    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzb(a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, st stVar, int i10) {
        Context context = (Context) b.y1(aVar);
        a50 a50Var = a50.a(context, stVar, i10).f11854b;
        context.getClass();
        zzrVar.getClass();
        str.getClass();
        hx1 hx1VarA = hx1.a(context);
        hx1 hx1VarA2 = hx1.a(zzrVar);
        fx1 fx1Var = a50Var.f11874m;
        fx1 fx1VarA = fx1.a(new v50(fx1Var, 27));
        zs0 zs0Var = (zs0) fx1.a(new j90(hx1VarA, a50Var.f11856c, hx1VarA2, a50Var.I, fx1VarA, fx1.a(ps1.f18803k), fx1.a(dv.f13734f))).zzb();
        hp0 hp0Var = (hp0) fx1VarA.zzb();
        VersionInfoParcel versionInfoParcel = a50Var.f11852a.f15965a;
        ic1.h(versionInfoParcel);
        return new fp0(context, zzrVar, str, zs0Var, hp0Var, versionInfoParcel, (yh0) fx1Var.zzb());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzc(a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, st stVar, int i10) {
        Context context = (Context) b.y1(aVar);
        a50 a50Var = a50.a(context, stVar, i10).f11854b;
        context.getClass();
        zzrVar.getClass();
        str.getClass();
        return (kp0) new j50(a50Var, context, str, zzrVar).f15984a.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbq zzd(a aVar, String str, st stVar, int i10) {
        Context context = (Context) b.y1(aVar);
        return new dp0(a50.a(context, stVar, i10), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final qo zze(a aVar, a aVar2) {
        return new qe0((FrameLayout) b.y1(aVar), (FrameLayout) b.y1(aVar2));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final vx zzf(a aVar, st stVar, int i10) {
        Context context = (Context) b.y1(aVar);
        a50 a50Var = a50.a(context, stVar, i10).f11854b;
        context.getClass();
        return (bu0) ((fx1) new md0(a50Var, context, (String) null).f17399b).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final hw zzg(a aVar) {
        Activity activity = (Activity) b.y1(aVar);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new zzw(activity);
        }
        int i10 = adOverlayInfoParcelZza.zzk;
        if (i10 == 1) {
            return new zzv(activity);
        }
        if (i10 == 2) {
            return new zzai(activity);
        }
        if (i10 == 3) {
            return new zzaj(activity);
        }
        if (i10 != 4) {
            return i10 != 5 ? new zzw(activity) : new zzag(activity);
        }
        return new zzac(activity, adOverlayInfoParcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzh(a aVar, st stVar, int i10) {
        return (yx0) a50.a((Context) b.y1(aVar), stVar, i10).H.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzi(a aVar, int i10) {
        return (r50) a50.a((Context) b.y1(aVar), null, i10).G.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    @Deprecated
    public final zzbu zzj(a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i10) {
        return new zzs((Context) b.y1(aVar), zzrVar, str, new VersionInfoParcel(261710000, i10, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final uo zzk(a aVar, a aVar2, a aVar3) {
        return new pe0((View) b.y1(aVar), (HashMap) b.y1(aVar2), (HashMap) b.y1(aVar3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final iy zzl(a aVar, String str, st stVar, int i10) {
        Context context = (Context) b.y1(aVar);
        a50 a50Var = a50.a(context, stVar, i10).f11854b;
        context.getClass();
        return (au0) ((fx1) new md0(a50Var, context, str).f17400c).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzm(a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, st stVar, int i10) {
        Context context = (Context) b.y1(aVar);
        a50 a50Var = a50.a(context, stVar, i10).f11854b;
        str.getClass();
        context.getClass();
        hx1 hx1VarA = hx1.a(context);
        hx1 hx1VarA2 = hx1.a(str);
        fx1 fx1Var = a50Var.J0;
        mt0 mt0Var = new mt0(hx1VarA, fx1Var, a50Var.K0, 0);
        fx1 fx1VarA = fx1.a(new er0(fx1Var, 10));
        fx1 fx1Var2 = a50Var.f11856c;
        hx1 hx1Var = a50Var.I;
        u40 u40Var = a50Var.f11865h;
        return (xs0) fx1.a(new j90(hx1Var, hx1VarA, hx1VarA2, fx1.a(new n60(hx1VarA, fx1Var2, hx1Var, mt0Var, fx1VarA, u40Var)), fx1VarA, u40Var, a50Var.f11874m)).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final tz zzn(a aVar, st stVar, int i10) {
        return (zzap) a50.a((Context) b.y1(aVar), stVar, i10).R.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final aw zzo(a aVar, st stVar, int i10) {
        return (zl0) a50.a((Context) b.y1(aVar), stVar, i10).O.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final hr zzp(a aVar, st stVar, int i10, dr drVar) {
        Context context = (Context) b.y1(aVar);
        a50 a50Var = a50.a(context, stVar, i10).f11854b;
        context.getClass();
        drVar.getClass();
        return (oi0) new g50(a50Var, context, drVar).f14765e.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzq(a aVar, st stVar, int i10) {
        return (vj0) a50.a((Context) b.y1(aVar), stVar, i10).A.zzb();
    }
}
