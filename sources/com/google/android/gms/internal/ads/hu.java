package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hu implements MediationAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xt f15392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ju f15393c;

    public /* synthetic */ hu(ju juVar, xt xtVar, int i10) {
        this.f15391a = i10;
        this.f15392b = xtVar;
        this.f15393c = juVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        switch (this.f15391a) {
            case 0:
                try {
                    String canonicalName = this.f15393c.f16184a.getClass().getCanonicalName();
                    int code = adError.getCode();
                    String message = adError.getMessage();
                    String domain = adError.getDomain();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(code).length() + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
                    sb2.append(canonicalName);
                    sb2.append("failed to loaded mediation ad: ErrorCode = ");
                    sb2.append(code);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(message);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(domain);
                    zzo.zzd(sb2.toString());
                    xt xtVar = this.f15392b;
                    xtVar.v(adError.zza());
                    xtVar.t1(adError.getCode(), adError.getMessage());
                    xtVar.g(adError.getCode());
                } catch (RemoteException e10) {
                    zzo.zzg("", e10);
                    return;
                }
                break;
            case 1:
                try {
                    String canonicalName2 = this.f15393c.f16184a.getClass().getCanonicalName();
                    int code2 = adError.getCode();
                    String message2 = adError.getMessage();
                    String domain2 = adError.getDomain();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName2).length() + 41 + String.valueOf(code2).length() + 17 + String.valueOf(message2).length() + 16 + String.valueOf(domain2).length());
                    sb3.append(canonicalName2);
                    sb3.append("failed to load mediation ad: ErrorCode = ");
                    sb3.append(code2);
                    sb3.append(". ErrorMessage = ");
                    sb3.append(message2);
                    sb3.append(". ErrorDomain = ");
                    sb3.append(domain2);
                    zzo.zzd(sb3.toString());
                    xt xtVar2 = this.f15392b;
                    xtVar2.v(adError.zza());
                    xtVar2.t1(adError.getCode(), adError.getMessage());
                    xtVar2.g(adError.getCode());
                } catch (RemoteException e11) {
                    zzo.zzg("", e11);
                    return;
                }
                break;
            default:
                try {
                    String canonicalName3 = this.f15393c.f16184a.getClass().getCanonicalName();
                    int code3 = adError.getCode();
                    String message3 = adError.getMessage();
                    String domain3 = adError.getDomain();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(canonicalName3).length() + 41 + String.valueOf(code3).length() + 17 + String.valueOf(message3).length() + 16 + String.valueOf(domain3).length());
                    sb4.append(canonicalName3);
                    sb4.append("failed to load mediation ad: ErrorCode = ");
                    sb4.append(code3);
                    sb4.append(". ErrorMessage = ");
                    sb4.append(message3);
                    sb4.append(". ErrorDomain = ");
                    sb4.append(domain3);
                    zzo.zzd(sb4.toString());
                    xt xtVar3 = this.f15392b;
                    xtVar3.v(adError.zza());
                    xtVar3.t1(adError.getCode(), adError.getMessage());
                    xtVar3.g(adError.getCode());
                } catch (RemoteException e12) {
                    zzo.zzg("", e12);
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* synthetic */ Object onSuccess(Object obj) {
        switch (this.f15391a) {
            case 0:
                xt xtVar = this.f15392b;
                MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
                try {
                    this.f15393c.f16188e = mediationBannerAd.getView();
                    xtVar.zzj();
                    break;
                } catch (RemoteException e10) {
                    zzo.zzg("", e10);
                }
                return new x11(xtVar, 9);
            case 1:
                xt xtVar2 = this.f15392b;
                try {
                    this.f15393c.f16190g = (UnifiedNativeAdMapper) obj;
                    xtVar2.zzj();
                    break;
                } catch (RemoteException e11) {
                    zzo.zzg("", e11);
                }
                return new x11(xtVar2, 9);
            default:
                xt xtVar3 = this.f15392b;
                try {
                    this.f15393c.f16192i = (MediationRewardedAd) obj;
                    xtVar3.zzj();
                    break;
                } catch (RemoteException e12) {
                    zzo.zzg("", e12);
                }
                return new vf(xtVar3, 11);
        }
    }
}
