package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzfn;
import com.google.android.gms.ads.internal.client.zzfo;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yy extends RewardedInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iy f22401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f22402c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FullScreenContentCallback f22404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnAdMetadataChangedListener f22405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnPaidEventListener f22406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f22407h = System.currentTimeMillis();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f22408i = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xy f22403d = new xy();

    public yy(Context context, String str) {
        this.f22400a = str;
        this.f22402c = context.getApplicationContext();
        this.f22401b = zzay.zzb().zzf(context, str, new qt());
    }

    public final void a(zzeh zzehVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            iy iyVar = this.f22401b;
            if (iyVar != null) {
                zzehVar.zzp(this.f22407h);
                iyVar.zzd(zzq.zza.zza(this.f22402c, zzehVar), new uy(rewardedInterstitialAdLoadCallback, this, 1));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            iy iyVar = this.f22401b;
            if (iyVar != null) {
                return iyVar.zzg();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.f22400a;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f22404e;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f22405f;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f22406g;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final long getPlacementId() {
        AtomicLong atomicLong = this.f22408i;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    iy iyVar = this.f22401b;
                    if (iyVar != null) {
                        long jZzq = iyVar.zzq();
                        AtomicLong atomicLong2 = this.f22408i;
                        atomicLong2.set(jZzq);
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

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdx zzdxVarZzm = null;
        try {
            iy iyVar = this.f22401b;
            if (iyVar != null) {
                zzdxVarZzm = iyVar.zzm();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zzc(zzdxVarZzm);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            iy iyVar = this.f22401b;
            fy fyVarZzl = iyVar != null ? iyVar.zzl() : null;
            if (fyVarZzl != null) {
                return new b21(fyVarZzl, 10);
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f22404e = fullScreenContentCallback;
        this.f22403d.f22034a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z10) {
        try {
            iy iyVar = this.f22401b;
            if (iyVar != null) {
                iyVar.zzp(z10);
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f22405f = onAdMetadataChangedListener;
        try {
            iy iyVar = this.f22401b;
            if (iyVar != null) {
                iyVar.zzf(new zzfn(onAdMetadataChangedListener));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f22406g = onPaidEventListener;
        try {
            iy iyVar = this.f22401b;
            if (iyVar != null) {
                iyVar.zzo(new zzfo(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setPlacementId(long j10) {
        try {
            iy iyVar = this.f22401b;
            if (iyVar != null) {
                iyVar.zzr(j10);
                this.f22408i.set(j10);
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            iy iyVar = this.f22401b;
            if (iyVar != null) {
                iyVar.zzh(new vy(serverSideVerificationOptions));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        xy xyVar = this.f22403d;
        xyVar.f22035b = onUserEarnedRewardListener;
        try {
            iy iyVar = this.f22401b;
            if (iyVar != null) {
                iyVar.zze(xyVar);
                iyVar.zzb(new s9.b(activity));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }
}
