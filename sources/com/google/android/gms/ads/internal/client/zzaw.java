package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.ew;
import com.google.android.gms.internal.ads.hr;
import com.google.android.gms.internal.ads.hw;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.qo;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.ty;
import com.google.android.gms.internal.ads.tz;
import com.google.android.gms.internal.ads.yp;
import com.google.android.gms.internal.ads.zp;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzk f10768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzi f10769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzfc f10770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yp f10771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ew f10772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzl f10773f;

    public zzaw(zzk zzkVar, zzi zziVar, zzfc zzfcVar, yp ypVar, ty tyVar, ew ewVar, zp zpVar, zzl zzlVar) {
        this.f10768a = zzkVar;
        this.f10769b = zziVar;
        this.f10770c = zzfcVar;
        this.f10771d = ypVar;
        this.f10772e = ewVar;
        this.f10773f = zzlVar;
    }

    public static /* synthetic */ void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zza().zzi(context, zzay.zzg().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbu zza(Context context, zzr zzrVar, String str, st stVar) {
        return (zzbu) new zzam(this, context, zzrVar, str, stVar).zzd(context, false);
    }

    public final zzbu zzb(Context context, zzr zzrVar, String str, st stVar) {
        return (zzbu) new zzan(this, context, zzrVar, str, stVar).zzd(context, false);
    }

    public final zzbq zzc(Context context, String str, st stVar) {
        return (zzbq) new zzap(this, context, str, stVar).zzd(context, false);
    }

    public final zzch zzd(Context context, st stVar) {
        return (zzch) new zzar(this, context, stVar).zzd(context, false);
    }

    public final qo zze(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (qo) new zzav(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final iy zzf(Context context, String str, st stVar) {
        return (iy) new zzaa(this, context, str, stVar).zzd(context, false);
    }

    @Nullable
    public final hw zzg(Activity activity) {
        zzac zzacVar = new zzac(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("useClientJar flag not found in activity intent extras.");
        }
        return (hw) zzacVar.zzd(activity, booleanExtra);
    }

    @Nullable
    public final zzdt zzh(Context context, st stVar) {
        return (zzdt) new zzae(this, context, stVar).zzd(context, false);
    }

    @Nullable
    public final tz zzi(Context context, st stVar) {
        return (tz) new zzag(this, context, stVar).zzd(context, false);
    }

    @Nullable
    public final aw zzj(Context context, st stVar) {
        return (aw) new zzai(this, context, stVar).zzd(context, false);
    }

    public final hr zzk(Context context, st stVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (hr) new zzak(this, context, stVar, onH5AdsEventListener).zzd(context, false);
    }
}
