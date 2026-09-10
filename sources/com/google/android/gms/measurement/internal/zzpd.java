package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzpd {
    final String zza;
    long zzb;

    public /* synthetic */ zzpd(zzpg zzpgVar, String str, byte[] bArr) {
        this(zzpgVar, str);
    }

    private zzpd(zzpg zzpgVar, String str) {
        Objects.requireNonNull(zzpgVar);
        this.zza = str;
        this.zzb = zzpgVar.zzaZ().elapsedRealtime();
    }

    public /* synthetic */ zzpd(zzpg zzpgVar, byte[] bArr) {
        this(zzpgVar, zzpgVar.zzt().zzaw());
    }
}
