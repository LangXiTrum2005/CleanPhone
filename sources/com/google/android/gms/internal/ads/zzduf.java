package com.google.android.gms.internal.ads;

import android.view.InputEvent;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzduf {

    @Nullable
    private volatile InputEvent zza;

    public final void zza(InputEvent inputEvent) {
        this.zza = inputEvent;
    }

    @Nullable
    public final InputEvent zzb() {
        return this.zza;
    }
}
