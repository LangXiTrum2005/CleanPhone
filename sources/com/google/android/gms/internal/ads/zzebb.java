package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzebb extends AdListener {
    final /* synthetic */ zzebh zza;

    public zzebb(zzebh zzebhVar) {
        Objects.requireNonNull(zzebhVar);
        this.zza = zzebhVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zza.zzg(zzebh.zzm(loadAdError));
    }
}
