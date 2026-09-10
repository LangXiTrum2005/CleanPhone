package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzcao extends RewardedAd {
    private final AtomicReference zza;
    private final zzcaf zzb;
    private final Context zzc;
    private final zzcax zzd;
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;
    private final long zzh;
    private final AtomicLong zzi;

    public zzcao(Context context, zzcaf zzcafVar) {
        this.zzh = System.currentTimeMillis();
        this.zzi = new AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference();
        this.zzb = zzcafVar;
        this.zzd = new zzcax();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzcaf zzcafVar = this.zzb;
            if (zzcafVar != null) {
                return zzcafVar.zzg();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        String strZzn;
        String str;
        AtomicReference atomicReference = this.zza;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzn = this.zzb.zzn();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                strZzn = null;
            }
            if (strZzn == null) {
                this.zza.set("");
            } else {
                this.zza.set(strZzn);
            }
            str = (String) this.zza.get();
        }
        return str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.zzi;
        long jZzq = 0;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                zzcaf zzcafVar = this.zzb;
                if (zzcafVar != null) {
                    jZzq = zzcafVar.zzq();
                }
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            }
            AtomicLong atomicLong2 = this.zzi;
            atomicLong2.set(jZzq);
            j = atomicLong2.get();
        }
        return j;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzm = null;
        try {
            zzcaf zzcafVar = this.zzb;
            if (zzcafVar != null) {
                zzeaVarZzm = zzcafVar.zzm();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zzc(zzeaVarZzm);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            zzcaf zzcafVar = this.zzb;
            zzcac zzcacVarZzl = zzcafVar != null ? zzcafVar.zzl() : null;
            return zzcacVarZzl == null ? RewardItem.DEFAULT_REWARD : new zzcap(zzcacVarZzl);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z2) {
        try {
            zzcaf zzcafVar = this.zzb;
            if (zzcafVar != null) {
                zzcafVar.zzp(z2);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzcaf zzcafVar = this.zzb;
            if (zzcafVar != null) {
                zzcafVar.zzf(new com.google.android.gms.ads.internal.client.zzfr(onAdMetadataChangedListener));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzcaf zzcafVar = this.zzb;
            if (zzcafVar != null) {
                zzcafVar.zzo(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setPlacementId(long j) {
        try {
            zzcaf zzcafVar = this.zzb;
            if (zzcafVar != null) {
                zzcafVar.zzr(j);
                this.zzi.set(j);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzcaf zzcafVar = this.zzb;
                if (zzcafVar != null) {
                    zzcafVar.zzh(new zzcat(serverSideVerificationOptions));
                }
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzcax zzcaxVar = this.zzd;
        zzcaxVar.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzcaf zzcafVar = this.zzb;
            if (zzcafVar != null) {
                zzcafVar.zze(zzcaxVar);
                zzcafVar.zzb(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzek zzekVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzcaf zzcafVar = this.zzb;
            if (zzcafVar != null) {
                zzekVar.zzp(this.zzh);
                zzcafVar.zzc(com.google.android.gms.ads.internal.client.zzq.zza.zza(this.zzc, zzekVar), new zzcas(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    public zzcao(Context context, String str) {
        this(context, str, com.google.android.gms.ads.internal.client.zzbb.zzb().zzg(context, str, new zzbsv()));
    }

    public zzcao(Context context, String str, zzcaf zzcafVar) {
        this.zzh = System.currentTimeMillis();
        this.zzi = new AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference(str);
        this.zzb = zzcafVar;
        this.zzd = new zzcax();
    }
}
