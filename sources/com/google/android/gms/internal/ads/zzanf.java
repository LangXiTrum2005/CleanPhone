package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class zzanf implements zzaly {
    private final zzer zza = new zzer();
    private final zzer zzb = new zzer();
    private final zzane zzc;
    private Inflater zzd;

    public zzanf(List list) {
        zzane zzaneVar = new zzane();
        this.zzc = zzaneVar;
        zzaneVar.zza(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(byte[] bArr, int i2, int i3, zzalx zzalxVar, zzdr zzdrVar) {
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i3 + i2);
        zzerVar.zzh(i2);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzer zzerVar2 = this.zzb;
        if (zzfj.zzL(zzerVar, zzerVar2, this.zzd)) {
            zzerVar.zzb(zzerVar2.zzi(), zzerVar2.zze());
        }
        zzane zzaneVar = this.zzc;
        zzaneVar.zzd();
        int iZzd = zzerVar.zzd();
        zzcx zzcxVarZzc = null;
        if (iZzd >= 2 && zzerVar.zzt() == iZzd) {
            zzaneVar.zzb(zzerVar);
            zzcxVarZzc = zzaneVar.zzc(zzerVar);
        }
        zzdrVar.zza(new zzalq(zzcxVarZzc != null ? zzgtd.zzj(zzcxVarZzc) : zzgtd.zzi(), -9223372036854775807L, 5000000L));
    }
}
