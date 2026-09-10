package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgbt implements zzgby {
    private final byte[] zza;

    public zzgbt(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return zzgwd.zza(inputStream);
        } catch (IOException e2) {
            throw new zzgbu("Cannot read bytes.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
