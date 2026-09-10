package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgca {
    private final ExecutorService zza;

    public zzgca(ExecutorService executorService) {
        this.zza = executorService;
    }

    public final zzgbr zza(File file, zzicc zziccVar, Function function) {
        return new zzgbz(file, this.zza, new zzgbx(zziccVar), function);
    }

    public final zzgbr zzb(File file, byte[] bArr, Function function) {
        return new zzgbz(file, this.zza, new zzgbt(bArr), function);
    }
}
