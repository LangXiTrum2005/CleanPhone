package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzayg implements zzfvv {
    final /* synthetic */ zzfua zza;

    public zzayg(zzayi zzayiVar, zzfua zzfuaVar) {
        this.zza = zzfuaVar;
        Objects.requireNonNull(zzayiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfvv
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
