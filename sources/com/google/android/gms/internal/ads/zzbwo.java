package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbwo extends zzblo {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbwo(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zze(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzf() {
        this.zza.onUnconfirmedClickCancelled();
    }
}
