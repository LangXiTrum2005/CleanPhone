package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzasc implements zzasf {
    final /* synthetic */ File zza;

    public zzasc(zzasg zzasgVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzasgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasf
    public final File zza() {
        return this.zza;
    }
}
