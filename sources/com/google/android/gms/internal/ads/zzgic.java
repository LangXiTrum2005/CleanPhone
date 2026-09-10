package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgic {
    private final File zza;
    private final zzfua zzb;
    private final zzgnc zzc;

    public zzgic(File file, zzfua zzfuaVar, zzgnc zzgncVar) {
        this.zza = file;
        this.zzb = zzfuaVar;
        this.zzc = zzgncVar;
    }

    public final boolean zza(byte[] bArr) {
        boolean zZza;
        try {
            File file = this.zza;
            zzgwk.zzb(file);
            zzgwk.zza(bArr, file);
            zZza = this.zzb.zza(file);
        } catch (IOException | GeneralSecurityException e2) {
            this.zzc.zzd(2027, e2);
            zZza = false;
        }
        try {
            this.zza.delete();
        } catch (SecurityException unused) {
        }
        return zZza;
    }
}
