package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uy extends oy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdLoadCallback f20960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20961c;

    public /* synthetic */ uy(AdLoadCallback adLoadCallback, Object obj, int i10) {
        this.f20959a = i10;
        this.f20960b = adLoadCallback;
        this.f20961c = obj;
    }

    @Override // com.google.android.gms.internal.ads.py
    public final void a(zze zzeVar) {
        switch (this.f20959a) {
            case 0:
                RewardedAdLoadCallback rewardedAdLoadCallback = (RewardedAdLoadCallback) this.f20960b;
                if (rewardedAdLoadCallback != null) {
                    rewardedAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
                }
                break;
            default:
                RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = (RewardedInterstitialAdLoadCallback) this.f20960b;
                if (rewardedInterstitialAdLoadCallback != null) {
                    rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.py
    public final void zze() {
        yy yyVar;
        switch (this.f20959a) {
            case 0:
                RewardedAdLoadCallback rewardedAdLoadCallback = (RewardedAdLoadCallback) this.f20960b;
                if (rewardedAdLoadCallback != null) {
                    rewardedAdLoadCallback.onAdLoaded((ry) this.f20961c);
                }
                break;
            default:
                RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = (RewardedInterstitialAdLoadCallback) this.f20960b;
                if (rewardedInterstitialAdLoadCallback != null && (yyVar = (yy) this.f20961c) != null) {
                    rewardedInterstitialAdLoadCallback.onAdLoaded(yyVar);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.py
    public final void zzf(int i10) {
        int i11 = this.f20959a;
    }

    private final void x1(int i10) {
    }

    private final void y1(int i10) {
    }
}
