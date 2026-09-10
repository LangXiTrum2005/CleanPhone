package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbyb implements MediationInterstitialAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f22785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationInterstitialListener f22786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f22787c;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzo.zzd("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzo.zzd("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzo.zzd("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f22786b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzo.zzi("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            zzo.zzi("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f22786b.onAdFailedToLoad(this, 0);
            return;
        }
        if (!nm.a(context)) {
            zzo.zzi("Default browser does not support custom tabs. Bailing out.");
            this.f22786b.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            zzo.zzi("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f22786b.onAdFailedToLoad(this, 0);
        } else {
            this.f22785a = (Activity) context;
            this.f22787c = Uri.parse(string);
            this.f22786b.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        u.i iVarA = new u.h().a();
        iVarA.f51639a.setData(this.f22787c);
        boolean z10 = false;
        zzs.zza.post(new zd1(this, z10, new AdOverlayInfoParcel(new zzc(iVarA.f51639a, null), null, new gv(this), null, new VersionInfoParcel(0, 0, false), null, null, ""), 9));
        e00 e00Var = zzt.zzh().f14140m;
        e00Var.getClass();
        ((p9.b) zzt.zzk()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (e00Var.f13791a) {
            try {
                if (e00Var.f13793c == 3) {
                    if (e00Var.f13792b + ((Long) zzba.zzc().a(am.f12066a7)).longValue() <= jCurrentTimeMillis) {
                        e00Var.f13793c = 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((p9.b) zzt.zzk()).getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (e00Var.f13791a) {
            try {
                if (e00Var.f13793c != 2) {
                    return;
                }
                e00Var.f13793c = 3;
                if (e00Var.f13793c == 3) {
                    e00Var.f13792b = jCurrentTimeMillis2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
