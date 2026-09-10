package com.google.android.gms.internal.ads;

import android.view.InputEvent;
import androidx.annotation.VisibleForTesting;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpb {

    @Nullable
    private volatile InputEvent zza;

    @VisibleForTesting(otherwise = 3)
    public zzdpb() {
    }

    @Nullable
    public final InputEvent zza() {
        return this.zza;
    }

    public final void zzb(InputEvent inputEvent) {
        this.zza = inputEvent;
    }
}
