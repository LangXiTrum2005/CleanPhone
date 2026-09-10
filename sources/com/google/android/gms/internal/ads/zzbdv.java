package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbdv implements Comparator {
    public zzbdv(zzbdw zzbdwVar) {
        Objects.requireNonNull(zzbdwVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbdl zzbdlVar = (zzbdl) obj;
        zzbdl zzbdlVar2 = (zzbdl) obj2;
        if (zzbdlVar.zzb() < zzbdlVar2.zzb()) {
            return -1;
        }
        if (zzbdlVar.zzb() > zzbdlVar2.zzb()) {
            return 1;
        }
        if (zzbdlVar.zza() < zzbdlVar2.zza()) {
            return -1;
        }
        if (zzbdlVar.zza() > zzbdlVar2.zza()) {
            return 1;
        }
        float fZzd = (zzbdlVar.zzd() - zzbdlVar.zzb()) * (zzbdlVar.zzc() - zzbdlVar.zza());
        float fZzd2 = (zzbdlVar2.zzd() - zzbdlVar2.zzb()) * (zzbdlVar2.zzc() - zzbdlVar2.zza());
        if (fZzd > fZzd2) {
            return -1;
        }
        return fZzd < fZzd2 ? 1 : 0;
    }
}
