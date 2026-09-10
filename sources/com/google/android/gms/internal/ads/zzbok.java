package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbok extends zzbom {
    private final OnH5AdsEventListener zza;

    public zzbok(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbon
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
