package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
final class zzhgy implements zzhha {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzhgy(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhha
    public final boolean zza() {
        return this.zza.get();
    }
}
