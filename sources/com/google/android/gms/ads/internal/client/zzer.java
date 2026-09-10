package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.AdapterStatus;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzer implements AdapterStatus {
    public zzer(zzex zzexVar) {
        Objects.requireNonNull(zzexVar);
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return AdapterStatus.State.READY;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return 0;
    }
}
