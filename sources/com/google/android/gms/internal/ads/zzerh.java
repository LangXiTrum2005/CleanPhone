package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzerh implements zzetq {

    @Nullable
    private final Boolean zza;

    public zzerh(@Nullable Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        Boolean bool = this.zza;
        if (bool == null) {
            bundle.putInt("lft", -1);
        } else if (bool.booleanValue()) {
            bundle.putInt("lft", 1);
        } else {
            bundle.putInt("lft", 0);
        }
    }
}
