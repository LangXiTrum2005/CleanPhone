package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
final class zzaso implements zzasf {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzaso(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzasf
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
