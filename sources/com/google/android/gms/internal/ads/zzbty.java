package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbty implements MediationAdLoadCallback {
    final /* synthetic */ zzbtf zza;
    final /* synthetic */ zzbua zzb;

    public zzbty(zzbua zzbuaVar, zzbtf zzbtfVar) {
        this.zza = zzbtfVar;
        Objects.requireNonNull(zzbuaVar);
        this.zzb = zzbuaVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.zzb().getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(code).length() + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(code);
            sb.append(". ErrorMessage = ");
            sb.append(message);
            sb.append(". ErrorDomain = ");
            sb.append(domain);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
            zzbtf zzbtfVar = this.zza;
            zzbtfVar.zzx(adError.zza());
            zzbtfVar.zzw(adError.getCode(), adError.getMessage());
            zzbtfVar.zzg(adError.getCode());
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzS((MediationRewardedAd) obj);
            this.zza.zzj();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
        return new zzcav(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            String canonicalName = this.zzb.zzb().getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
            zzbtf zzbtfVar = this.zza;
            zzbtfVar.zzw(0, str);
            zzbtfVar.zzg(0);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }
}
