package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class zzoa implements zzoe {
    public static final zzfvf zza = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzny
        @Override // com.google.android.gms.internal.ads.zzfvf
        public final Object zza() {
            return zzoa.zzn();
        }
    };
    private static final Random zzb = new Random();
    private final zzbp zzc;
    private final zzbo zzd;
    private final HashMap zze;
    private zzod zzf;
    private zzbq zzg;

    @Nullable
    private String zzh;
    private long zzi;

    public zzoa() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzl() {
        zznz zznzVar = (zznz) this.zze.get(this.zzh);
        return (zznzVar == null || zznzVar.zzd == -1) ? this.zzi + 1 : zznzVar.zzd;
    }

    private final zznz zzm(int i, @Nullable zzug zzugVar) {
        long j = Long.MAX_VALUE;
        zznz zznzVar = null;
        for (zznz zznzVar2 : this.zze.values()) {
            zznzVar2.zzg(i, zzugVar);
            if (zznzVar2.zzj(i, zzugVar)) {
                long j2 = zznzVar2.zzd;
                if (j2 == -1 || j2 < j) {
                    zznzVar = zznzVar2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = zzei.zza;
                    if (zznzVar.zze != null && zznzVar2.zze != null) {
                        zznzVar = zznzVar2;
                    }
                }
            }
        }
        if (zznzVar != null) {
            return zznzVar;
        }
        String strZzn = zzn();
        zznz zznzVar3 = new zznz(this, strZzn, i, zzugVar);
        this.zze.put(strZzn, zznzVar3);
        return zznzVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zznz zznzVar) {
        if (zznzVar.zzd != -1) {
            this.zzi = zznzVar.zzd;
        }
        this.zzh = null;
    }

    private final void zzp(zzlu zzluVar) {
        if (zzluVar.zzb.zzo()) {
            String str = this.zzh;
            if (str != null) {
                zznz zznzVar = (zznz) this.zze.get(str);
                zznzVar.getClass();
                zzo(zznzVar);
                return;
            }
            return;
        }
        zznz zznzVar2 = (zznz) this.zze.get(this.zzh);
        zznz zznzVarZzm = zzm(zzluVar.zzc, zzluVar.zzd);
        this.zzh = zznzVarZzm.zzb;
        zzi(zzluVar);
        zzug zzugVar = zzluVar.zzd;
        if (zzugVar == null || !zzugVar.zzb()) {
            return;
        }
        if (zznzVar2 != null) {
            if (zznzVar2.zzd == zzugVar.zzd && zznzVar2.zze != null && zznzVar2.zze.zzb == zzluVar.zzd.zzb && zznzVar2.zze.zzc == zzluVar.zzd.zzc) {
                return;
            }
        }
        zzug zzugVar2 = zzluVar.zzd;
        String unused = zzm(zzluVar.zzc, new zzug(zzugVar2.zza, zzugVar2.zzd)).zzb;
        String unused2 = zznzVarZzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    @Nullable
    public final synchronized String zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized String zzf(zzbq zzbqVar, zzug zzugVar) {
        return zzm(zzbqVar.zzn(zzugVar.zza, this.zzd).zzc, zzugVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized void zzg(zzlu zzluVar) {
        zzod zzodVar;
        try {
            String str = this.zzh;
            if (str != null) {
                zznz zznzVar = (zznz) this.zze.get(str);
                zznzVar.getClass();
                zzo(zznzVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zznz zznzVar2 = (zznz) it.next();
                it.remove();
                if (zznzVar2.zzf && (zzodVar = this.zzf) != null) {
                    zzodVar.zzd(zzluVar, zznzVar2.zzb, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final void zzh(zzod zzodVar) {
        this.zzf = zzodVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001e, B:14:0x002a, B:16:0x0034, B:21:0x0040, B:23:0x004c, B:24:0x0052, B:26:0x0057, B:28:0x005d, B:30:0x0074, B:31:0x009c, B:33:0x00a2, B:34:0x00a8, B:36:0x00b4, B:38:0x00ba), top: B:45:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001e, B:14:0x002a, B:16:0x0034, B:21:0x0040, B:23:0x004c, B:24:0x0052, B:26:0x0057, B:28:0x005d, B:30:0x0074, B:31:0x009c, B:33:0x00a2, B:34:0x00a8, B:36:0x00b4, B:38:0x00ba), top: B:45:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001e, B:14:0x002a, B:16:0x0034, B:21:0x0040, B:23:0x004c, B:24:0x0052, B:26:0x0057, B:28:0x005d, B:30:0x0074, B:31:0x009c, B:33:0x00a2, B:34:0x00a8, B:36:0x00b4, B:38:0x00ba), top: B:45:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001e, B:14:0x002a, B:16:0x0034, B:21:0x0040, B:23:0x004c, B:24:0x0052, B:26:0x0057, B:28:0x005d, B:30:0x0074, B:31:0x009c, B:33:0x00a2, B:34:0x00a8, B:36:0x00b4, B:38:0x00ba), top: B:45:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized void zzi(zzlu zzluVar) {
        zznz zznzVarZzm;
        zzug zzugVar;
        zznz zznzVarZzm2;
        zznz zznzVar;
        try {
            this.zzf.getClass();
            if (!zzluVar.zzb.zzo()) {
                zzug zzugVar2 = zzluVar.zzd;
                if (zzugVar2 == null) {
                    zznzVarZzm = zzm(zzluVar.zzc, zzluVar.zzd);
                    if (this.zzh == null) {
                        this.zzh = zznzVarZzm.zzb;
                    }
                    zzugVar = zzluVar.zzd;
                    if (zzugVar != null) {
                        zznzVarZzm2 = zzm(zzluVar.zzc, new zzug(zzugVar.zza, zzugVar.zzd, zzugVar.zzb));
                        if (!zznzVarZzm2.zzf) {
                            zznzVarZzm2.zzf = true;
                            zzluVar.zzb.zzn(zzluVar.zzd.zza, this.zzd);
                            this.zzd.zzg(zzluVar.zzd.zzb);
                            Math.max(0L, zzei.zzv(0L) + zzei.zzv(0L));
                            String unused = zznzVarZzm2.zzb;
                        }
                    }
                    if (!zznzVarZzm.zzf) {
                        zznzVarZzm.zzf = true;
                        String unused2 = zznzVarZzm.zzb;
                    }
                    if (zznzVarZzm.zzb.equals(this.zzh)) {
                        zznzVarZzm.zzg = true;
                        this.zzf.zzc(zzluVar, zznzVarZzm.zzb);
                    }
                } else if (zzugVar2.zzd >= zzl() && ((zznzVar = (zznz) this.zze.get(this.zzh)) == null || zznzVar.zzd != -1 || zznzVar.zzc == zzluVar.zzc)) {
                    zznzVarZzm = zzm(zzluVar.zzc, zzluVar.zzd);
                    if (this.zzh == null) {
                        this.zzh = zznzVarZzm.zzb;
                    }
                    zzugVar = zzluVar.zzd;
                    if (zzugVar != null && zzugVar.zzb()) {
                        zznzVarZzm2 = zzm(zzluVar.zzc, new zzug(zzugVar.zza, zzugVar.zzd, zzugVar.zzb));
                        if (!zznzVarZzm2.zzf) {
                            zznzVarZzm2.zzf = true;
                            zzluVar.zzb.zzn(zzluVar.zzd.zza, this.zzd);
                            this.zzd.zzg(zzluVar.zzd.zzb);
                            Math.max(0L, zzei.zzv(0L) + zzei.zzv(0L));
                            String unused3 = zznzVarZzm2.zzb;
                        }
                    }
                    if (!zznzVarZzm.zzf) {
                        zznzVarZzm.zzf = true;
                        String unused4 = zznzVarZzm.zzb;
                    }
                    if (zznzVarZzm.zzb.equals(this.zzh) && !zznzVarZzm.zzg) {
                        zznzVarZzm.zzg = true;
                        this.zzf.zzc(zzluVar, zznzVarZzm.zzb);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized void zzj(zzlu zzluVar, int i) {
        try {
            this.zzf.getClass();
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zznz zznzVar = (zznz) it.next();
                if (zznzVar.zzk(zzluVar)) {
                    it.remove();
                    if (zznzVar.zzf) {
                        boolean zEquals = zznzVar.zzb.equals(this.zzh);
                        boolean z = false;
                        if (i == 0 && zEquals && zznzVar.zzg) {
                            z = true;
                        }
                        if (zEquals) {
                            zzo(zznzVar);
                        }
                        this.zzf.zzd(zzluVar, zznzVar.zzb, z);
                    }
                }
            }
            zzp(zzluVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized void zzk(zzlu zzluVar) {
        try {
            this.zzf.getClass();
            zzbq zzbqVar = this.zzg;
            this.zzg = zzluVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zznz zznzVar = (zznz) it.next();
                if (!zznzVar.zzl(zzbqVar, this.zzg) || zznzVar.zzk(zzluVar)) {
                    it.remove();
                    if (zznzVar.zzf) {
                        if (zznzVar.zzb.equals(this.zzh)) {
                            zzo(zznzVar);
                        }
                        this.zzf.zzd(zzluVar, zznzVar.zzb, false);
                    }
                }
            }
            zzp(zzluVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public zzoa(zzfvf zzfvfVar) {
        this.zzc = new zzbp();
        this.zzd = new zzbo();
        this.zze = new HashMap();
        this.zzg = zzbq.zza;
        this.zzi = -1L;
    }
}
