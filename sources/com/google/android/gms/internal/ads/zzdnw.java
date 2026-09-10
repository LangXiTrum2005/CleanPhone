package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnw {
    public static final zzdnw zza = new zzdnw(new zzdnv());
    private final zzbkz zzb;
    private final zzbkw zzc;
    private final zzblm zzd;
    private final zzblj zze;
    private final zzbqh zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    public /* synthetic */ zzdnw(zzdnv zzdnvVar, byte[] bArr) {
        this(zzdnvVar);
    }

    public final zzbkz zza() {
        return this.zzb;
    }

    public final zzbkw zzb() {
        return this.zzc;
    }

    public final zzblm zzc() {
        return this.zzd;
    }

    public final zzblj zzd() {
        return this.zze;
    }

    public final zzbqh zze() {
        return this.zzf;
    }

    public final zzblf zzf(String str) {
        if (str == null) {
            return null;
        }
        return (zzblf) this.zzg.get(str);
    }

    public final zzblc zzg(String str) {
        return (zzblc) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        SimpleArrayMap simpleArrayMap = this.zzg;
        ArrayList arrayList = new ArrayList(simpleArrayMap.Z);
        for (int i2 = 0; i2 < simpleArrayMap.Z; i2++) {
            arrayList.add((String) simpleArrayMap.f(i2));
        }
        return arrayList;
    }

    private zzdnw(zzdnv zzdnvVar) {
        this.zzb = zzdnvVar.zza;
        this.zzc = zzdnvVar.zzb;
        this.zzd = zzdnvVar.zzc;
        this.zzg = new SimpleArrayMap(zzdnvVar.zzf);
        this.zzh = new SimpleArrayMap(zzdnvVar.zzg);
        this.zze = zzdnvVar.zzd;
        this.zzf = zzdnvVar.zze;
    }
}
