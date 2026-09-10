package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbwi extends NativeAd {
    private final zzbls zza;
    private final zzbwh zzc;
    private final NativeAd.AdChoicesInfo zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();
    private final AtomicLong zzf = new AtomicLong();

    public zzbwi(zzbls zzblsVar) {
        zzbwh zzbwhVar;
        this.zza = zzblsVar;
        zzbwf zzbwfVar = null;
        try {
            List listZzf = zzblsVar.zzf();
            if (listZzf != null) {
                for (Object obj : listZzf) {
                    zzbjy zzbjyVarZzh = obj instanceof IBinder ? zzbjx.zzh((IBinder) obj) : null;
                    if (zzbjyVarZzh != null) {
                        this.zzb.add(new zzbwh(zzbjyVarZzh));
                    }
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
        try {
            List listZzz = this.zza.zzz();
            if (listZzz != null) {
                for (Object obj2 : listZzz) {
                    com.google.android.gms.ads.internal.client.zzdj zzdjVarZzb = obj2 instanceof IBinder ? com.google.android.gms.ads.internal.client.zzdi.zzb((IBinder) obj2) : null;
                    if (zzdjVarZzb != null) {
                        this.zze.add(new com.google.android.gms.ads.internal.client.zzdk(zzdjVarZzb));
                    }
                }
            }
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
        }
        try {
            zzbjy zzbjyVarZzh2 = this.zza.zzh();
            zzbwhVar = zzbjyVarZzh2 != null ? new zzbwh(zzbjyVarZzh2) : null;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e4);
        }
        this.zzc = zzbwhVar;
        try {
            if (this.zza.zzq() != null) {
                zzbwfVar = new zzbwf(this.zza.zzq());
            }
        } catch (RemoteException e5) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e5);
        }
        this.zzd = zzbwfVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzy();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to cancelUnconfirmedClick", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.zza.zzp();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zza.zzD();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle bundleZzw = this.zza.zzw();
            if (bundleZzw != null) {
                return bundleZzw;
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.zza.zze();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.Image getIcon() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final MediaContent getMediaContent() {
        try {
            zzbls zzblsVar = this.zza;
            if (zzblsVar.zzF() != null) {
                return new com.google.android.gms.ads.internal.client.zzfe(zzblsVar.zzF(), null);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long jZzK = this.zza.zzK();
                    AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(jZzK);
                    j = atomicLong2.get();
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to getPlacementId", e2);
                    return 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzH;
        try {
            zzeaVarZzH = this.zza.zzH();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            zzeaVarZzH = null;
        }
        return ResponseInfo.zzb(zzeaVarZzH);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double dZzk = this.zza.zzk();
            if (dZzk == -1.0d) {
                return null;
            }
            return Double.valueOf(dZzk);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzA();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.zza.zzA()) {
                    if (muteThisAdReason == null) {
                        this.zza.zzB(null);
                        return;
                    } else if (muteThisAdReason instanceof com.google.android.gms.ads.internal.client.zzdk) {
                        this.zza.zzB(((com.google.android.gms.ads.internal.client.zzdk) muteThisAdReason).zza());
                        return;
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zzf("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad is not custom mute enabled");
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzr(bundle);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zza.zzE();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.zza.zzJ(bundle);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to record native event", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzs(bundle);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzt(bundle);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.zza.zzC(new com.google.android.gms.ads.internal.client.zzdg(muteThisAdListener));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zza.zzI(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to setOnPaidEventListener", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setPlacementId(long j) {
        try {
            this.zza.zzL(j);
            this.zzf.set(j);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to setPlacementId", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zza.zzx(new zzbwo(unconfirmedClickListener));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to setUnconfirmedClickListener", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzu();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return null;
        }
    }
}
