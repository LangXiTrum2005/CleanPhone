package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbts implements MediationAdLoadCallback {
    final /* synthetic */ zzbtf zza;
    final /* synthetic */ Adapter zzb;
    final /* synthetic */ zzbua zzc;

    public zzbts(zzbua zzbuaVar, zzbtf zzbtfVar, Adapter adapter) {
        this.zza = zzbtfVar;
        this.zzb = adapter;
        Objects.requireNonNull(zzbuaVar);
        this.zzc = zzbuaVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.getClass().getCanonicalName();
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
            this.zzc.zzT((MediationInterscrollerAd) obj);
            this.zza.zzj();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
        return new zzbtq(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
