package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbvi implements MediationAdLoadCallback {
    final /* synthetic */ zzbuj zza;
    final /* synthetic */ zzbtf zzb;
    final /* synthetic */ zzbvl zzc;

    public zzbvi(zzbvl zzbvlVar, zzbuj zzbujVar, zzbtf zzbtfVar) {
        this.zza = zzbujVar;
        this.zzb = zzbtfVar;
        Objects.requireNonNull(zzbvlVar);
        this.zzc = zzbvlVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationAppOpenAd mediationAppOpenAd = (MediationAppOpenAd) obj;
        if (mediationAppOpenAd != null) {
            try {
                this.zzc.zzu(mediationAppOpenAd);
                this.zza.zze();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            }
            return new zzbvm(this.zzb);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
