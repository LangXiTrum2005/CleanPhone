package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgzs {
    private final OutputStream zza;

    private zzgzs(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgzs zzb(OutputStream outputStream) {
        return new zzgzs(outputStream);
    }

    public final void zza(zzhpj zzhpjVar) throws IOException {
        try {
            zzhpjVar.zzaO(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
