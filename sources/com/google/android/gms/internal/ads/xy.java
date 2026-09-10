package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xy extends ky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FullScreenContentCallback f22034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OnUserEarnedRewardListener f22035b;

    @Override // com.google.android.gms.internal.ads.ly
    public final void d0(fy fyVar) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.f22035b;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new b21(fyVar, 10));
        }
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void i0(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f22034a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f22034a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f22034a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback = this.f22034a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void zzk() {
        FullScreenContentCallback fullScreenContentCallback = this.f22034a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void e(int i10) {
    }
}
