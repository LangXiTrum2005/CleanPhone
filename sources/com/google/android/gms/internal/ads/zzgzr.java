package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgzr implements zzhaj {
    private final InputStream zza;

    private zzgzr(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzhaj zza(byte[] bArr) {
        return new zzgzr(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final zzhpj zzb() throws IOException {
        try {
            return zzhpj.zzg(this.zza, zziab.zza());
        } finally {
            this.zza.close();
        }
    }
}
