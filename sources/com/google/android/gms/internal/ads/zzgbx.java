package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgbx implements zzgby {
    private final zzicc zza;

    public zzgbx(zzicc zziccVar) {
        this.zza = zziccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        ((zzicc) obj).zzaO(outputStream);
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return (zzicc) this.zza.zzbd().zza(inputStream, zziab.zza());
        } catch (zzibg e2) {
            throw new zzgbu("Cannot read proto.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
