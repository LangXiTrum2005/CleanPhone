package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzfo;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hs extends AdManagerInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzq f15370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbu f15371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f15372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppEventListener f15374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FullScreenContentCallback f15375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public OnPaidEventListener f15376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f15377i;

    public hs(Context context, zzbu zzbuVar) {
        new qt();
        this.f15373e = System.currentTimeMillis();
        this.f15377i = new AtomicLong();
        this.f15369a = context;
        this.f15372d = new AtomicReference();
        this.f15370b = zzq.zza;
        this.f15371c = zzbuVar;
    }

    public final void a(zzeh zzehVar, AdLoadCallback adLoadCallback) {
        try {
            zzbu zzbuVar = this.f15371c;
            if (zzbuVar != null) {
                zzehVar.zzp(this.f15373e);
                zzbuVar.zzQ(this.f15370b.zza(this.f15369a, zzehVar), new zzh(adLoadCallback, this));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        String strZzu;
        String str;
        AtomicReference atomicReference = this.f15372d;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzu = this.f15371c.zzu();
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
                strZzu = null;
            }
            if (strZzu == null) {
                this.f15372d.set("");
            } else {
                this.f15372d.set(strZzu);
            }
            str = (String) this.f15372d.get();
        }
        return str;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.f15374f;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f15375g;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f15376h;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final long getPlacementId() {
        AtomicLong atomicLong = this.f15377i;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    zzbu zzbuVar = this.f15371c;
                    if (zzbuVar != null) {
                        long jZzU = zzbuVar.zzU();
                        AtomicLong atomicLong2 = this.f15377i;
                        atomicLong2.set(jZzU);
                        return atomicLong2.get();
                    }
                } catch (RemoteException e10) {
                    zzo.zzl("#007 Could not call remote method.", e10);
                }
                return 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdx zzdxVarZzt = null;
        try {
            zzbu zzbuVar = this.f15371c;
            if (zzbuVar != null) {
                zzdxVarZzt = zzbuVar.zzt();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zzc(zzdxVarZzt);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.f15374f = appEventListener;
            zzbu zzbuVar = this.f15371c;
            if (zzbuVar != null) {
                zzbuVar.zzi(appEventListener != null ? new fi(appEventListener) : null);
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.f15375g = fullScreenContentCallback;
            zzbu zzbuVar = this.f15371c;
            if (zzbuVar != null) {
                zzbuVar.zzS(new zzbb(fullScreenContentCallback));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z10) {
        try {
            zzbu zzbuVar = this.f15371c;
            if (zzbuVar != null) {
                zzbuVar.zzK(z10);
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f15376h = onPaidEventListener;
            zzbu zzbuVar = this.f15371c;
            if (zzbuVar != null) {
                zzbuVar.zzP(new zzfo(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setPlacementId(long j10) {
        try {
            zzbu zzbuVar = this.f15371c;
            if (zzbuVar != null) {
                zzbuVar.zzT(j10);
                this.f15377i.set(j10);
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            zzo.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbu zzbuVar = this.f15371c;
            if (zzbuVar != null) {
                zzbuVar.zzR(new s9.b(activity));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public hs(Context context, String str) {
        qt qtVar = new qt();
        this.f15373e = System.currentTimeMillis();
        this.f15377i = new AtomicLong();
        this.f15369a = context;
        this.f15372d = new AtomicReference(str);
        this.f15370b = zzq.zza;
        this.f15371c = zzay.zzb().zzb(context, new zzr(), str, qtVar);
    }

    public hs(Context context, String str, zzbu zzbuVar) {
        zzq zzqVar = zzq.zza;
        new qt();
        this.f15373e = System.currentTimeMillis();
        this.f15377i = new AtomicLong();
        this.f15369a = context;
        this.f15372d = new AtomicReference(str);
        this.f15370b = zzqVar;
        this.f15371c = zzbuVar;
    }
}
