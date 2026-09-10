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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ry extends RewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f19696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iy f19697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f19698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xy f19699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnAdMetadataChangedListener f19700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnPaidEventListener f19701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FullScreenContentCallback f19702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f19703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f19704i;

    public ry(Context context, iy iyVar) {
        this.f19703h = System.currentTimeMillis();
        this.f19704i = new AtomicLong();
        this.f19698c = context.getApplicationContext();
        this.f19696a = new AtomicReference();
        this.f19697b = iyVar;
        this.f19699d = new xy();
    }

    public final void a(zzeh zzehVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            iy iyVar = this.f19697b;
            if (iyVar != null) {
                zzehVar.zzp(this.f19703h);
                iyVar.zzc(zzq.zza.zza(this.f19698c, zzehVar), new uy(rewardedAdLoadCallback, this, 0));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            iy iyVar = this.f19697b;
            if (iyVar != null) {
                return iyVar.zzg();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        String strZzn;
        String str;
        AtomicReference atomicReference = this.f19696a;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzn = this.f19697b.zzn();
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
                strZzn = null;
            }
            if (strZzn == null) {
                this.f19696a.set("");
            } else {
                this.f19696a.set(strZzn);
            }
            str = (String) this.f19696a.get();
        }
        return str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f19702g;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f19700e;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f19701f;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final long getPlacementId() {
        long j10;
        AtomicLong atomicLong = this.f19704i;
        long jZzq = 0;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                iy iyVar = this.f19697b;
                if (iyVar != null) {
                    jZzq = iyVar.zzq();
                }
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
            }
            AtomicLong atomicLong2 = this.f19704i;
            atomicLong2.set(jZzq);
            j10 = atomicLong2.get();
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        zzdx zzdxVarZzm = null;
        try {
            iy iyVar = this.f19697b;
            if (iyVar != null) {
                zzdxVarZzm = iyVar.zzm();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zzc(zzdxVarZzm);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            iy iyVar = this.f19697b;
            fy fyVarZzl = iyVar != null ? iyVar.zzl() : null;
            return fyVarZzl == null ? RewardItem.DEFAULT_REWARD : new b21(fyVarZzl, 10);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f19702g = fullScreenContentCallback;
        this.f19699d.f22034a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z10) {
        try {
            iy iyVar = this.f19697b;
            if (iyVar != null) {
                iyVar.zzp(z10);
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f19700e = onAdMetadataChangedListener;
            iy iyVar = this.f19697b;
            if (iyVar != null) {
                iyVar.zzf(new zzfn(onAdMetadataChangedListener));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f19701f = onPaidEventListener;
            iy iyVar = this.f19697b;
            if (iyVar != null) {
                iyVar.zzo(new zzfo(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setPlacementId(long j10) {
        try {
            iy iyVar = this.f19697b;
            if (iyVar != null) {
                iyVar.zzr(j10);
                this.f19704i.set(j10);
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                iy iyVar = this.f19697b;
                if (iyVar != null) {
                    iyVar.zzh(new vy(serverSideVerificationOptions));
                }
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        xy xyVar = this.f19699d;
        xyVar.f22035b = onUserEarnedRewardListener;
        if (activity == null) {
            zzo.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            iy iyVar = this.f19697b;
            if (iyVar != null) {
                iyVar.zze(xyVar);
                iyVar.zzb(new s9.b(activity));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public ry(Context context, String str) {
        this(context, str, zzay.zzb().zzf(context, str, new qt()));
    }

    public ry(Context context, String str, iy iyVar) {
        this.f19703h = System.currentTimeMillis();
        this.f19704i = new AtomicLong();
        this.f19698c = context.getApplicationContext();
        this.f19696a = new AtomicReference(str);
        this.f19697b = iyVar;
        this.f19699d = new xy();
    }
}
