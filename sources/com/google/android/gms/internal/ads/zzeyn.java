package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyn implements zzezx {
    private final Bundle zza;

    public zzeyn(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return zzgym.zza(new zzeyo(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 30;
    }
}
