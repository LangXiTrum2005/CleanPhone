package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzbu f13184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f13185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzeh f13187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppOpenAd.AppOpenAdLoadCallback f13188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qt f13189f = new qt();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzq f13190g = zzq.zza;

    public cj(Context context, String str, zzeh zzehVar, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f13185b = context;
        this.f13186c = str;
        this.f13187d = zzehVar;
        this.f13188e = appOpenAdLoadCallback;
    }

    public final void a() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzr zzrVarZzd = zzr.zzd();
            zzaw zzawVarZzb = zzay.zzb();
            Context context = this.f13185b;
            String str = this.f13186c;
            zzbu zzbuVarZza = zzawVarZzb.zza(context, zzrVarZzd, str, this.f13189f);
            this.f13184a = zzbuVarZza;
            if (zzbuVarZza != null) {
                zzeh zzehVar = this.f13187d;
                zzehVar.zzp(jCurrentTimeMillis);
                this.f13184a.zzJ(new si(this.f13188e, str));
                this.f13184a.zze(this.f13190g.zza(context, zzehVar));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }
}
