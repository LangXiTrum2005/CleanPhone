package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgbr {
    protected final File zza;

    public zzgbr(File file) {
        this.zza = file;
    }

    public final File zza() {
        return this.zza;
    }

    public abstract ListenableFuture zzb();

    public abstract ListenableFuture zzc(Object obj);
}
