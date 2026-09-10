package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpc implements zzpl {
    public static final zzgqs zza = zzpa.zza;
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzpk zzf;
    private zzbf zzg;
    private String zzh;
    private long zzi;

    public zzpc() {
        throw null;
    }

    @RequiresNonNull
    private final void zzl(zzmv zzmvVar) {
        if (zzmvVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzpb zzpbVar = (zzpb) this.zze.get(str);
                zzpbVar.getClass();
                zzm(zzpbVar);
                return;
            }
            return;
        }
        zzpb zzpbVar2 = (zzpb) this.zze.get(this.zzh);
        int i2 = zzmvVar.zzc;
        zzwg zzwgVar = zzmvVar.zzd;
        this.zzh = zzo(i2, zzwgVar).zze();
        zzc(zzmvVar);
        if (zzwgVar == null || !zzwgVar.zzb()) {
            return;
        }
        if (zzpbVar2 != null) {
            if (zzpbVar2.zzg() == zzwgVar.zzd && zzpbVar2.zzh() != null) {
                zzwg zzwgVarZzh = zzpbVar2.zzh();
                if (zzwgVarZzh.zzb == zzwgVar.zzb) {
                    zzwg zzwgVarZzh2 = zzpbVar2.zzh();
                    if (zzwgVarZzh2.zzc == zzwgVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i2, new zzwg(zzwgVar.zza, zzwgVar.zzd));
    }

    private final void zzm(zzpb zzpbVar) {
        if (zzpbVar.zzg() != -1) {
            this.zzi = zzpbVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzpb zzpbVar = (zzpb) this.zze.get(this.zzh);
        return (zzpbVar == null || zzpbVar.zzg() == -1) ? this.zzi + 1 : zzpbVar.zzg();
    }

    private final zzpb zzo(int i2, zzwg zzwgVar) {
        HashMap map = this.zze;
        long j = Long.MAX_VALUE;
        zzpb zzpbVar = null;
        for (zzpb zzpbVar2 : map.values()) {
            zzpbVar2.zzc(i2, zzwgVar);
            if (zzpbVar2.zzb(i2, zzwgVar)) {
                long jZzg = zzpbVar2.zzg();
                if (jZzg == -1 || jZzg < j) {
                    zzpbVar = zzpbVar2;
                    j = jZzg;
                } else if (jZzg == j) {
                    String str = zzfj.zza;
                    if (zzpbVar.zzh() != null && zzpbVar2.zzh() != null) {
                        zzpbVar = zzpbVar2;
                    }
                }
            }
        }
        if (zzpbVar != null) {
            return zzpbVar;
        }
        String strZzp = zzp();
        zzpb zzpbVar3 = new zzpb(this, strZzp, i2, zzwgVar);
        map.put(strZzp, zzpbVar3);
        return zzpbVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zza(zzpk zzpkVar) {
        this.zzf = zzpkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final synchronized String zzb(zzbf zzbfVar, zzwg zzwgVar) {
        return zzo(zzbfVar.zzo(zzwgVar.zza, this.zzd).zzc, zzwgVar).zze();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003e, B:23:0x0048, B:26:0x0051, B:28:0x0057, B:30:0x006c, B:31:0x0085, B:33:0x008b, B:34:0x008e, B:36:0x009a, B:38:0x00a0, B:44:0x00b1), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0048 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003e, B:23:0x0048, B:26:0x0051, B:28:0x0057, B:30:0x006c, B:31:0x0085, B:33:0x008b, B:34:0x008e, B:36:0x009a, B:38:0x00a0, B:44:0x00b1), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003e, B:23:0x0048, B:26:0x0051, B:28:0x0057, B:30:0x006c, B:31:0x0085, B:33:0x008b, B:34:0x008e, B:36:0x009a, B:38:0x00a0, B:44:0x00b1), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003e, B:23:0x0048, B:26:0x0051, B:28:0x0057, B:30:0x006c, B:31:0x0085, B:33:0x008b, B:34:0x008e, B:36:0x009a, B:38:0x00a0, B:44:0x00b1), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzpl
    public final synchronized void zzc(zzmv zzmvVar) {
        int i2;
        zzpb zzpbVarZzo;
        Object obj;
        int i3;
        zzpb zzpbVarZzo2;
        zzpb zzpbVar;
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbf zzbfVar = zzmvVar.zzb;
            if (!zzbfVar.zzg()) {
                zzwg zzwgVar = zzmvVar.zzd;
                if (zzwgVar == null) {
                    i2 = zzmvVar.zzc;
                    zzpbVarZzo = zzo(i2, zzwgVar);
                    if (this.zzh == null) {
                        this.zzh = zzpbVarZzo.zze();
                    }
                    if (zzwgVar != null) {
                        obj = zzwgVar.zza;
                        long j = zzwgVar.zzd;
                        i3 = zzwgVar.zzb;
                        zzpbVarZzo2 = zzo(i2, new zzwg(obj, j, i3));
                        if (!zzpbVarZzo2.zzi()) {
                            zzpbVarZzo2.zzj(true);
                            zzbd zzbdVar = this.zzd;
                            zzbfVar.zzo(obj, zzbdVar);
                            zzbdVar.zzc(i3);
                            Math.max(0L, zzfj.zzp(0L) + zzfj.zzp(0L));
                        }
                    }
                    if (!zzpbVarZzo.zzi()) {
                        zzpbVarZzo.zzj(true);
                    }
                    if (zzpbVarZzo.zze().equals(this.zzh)) {
                        zzpbVarZzo.zzl(true);
                        this.zzf.zzc(zzmvVar, zzpbVarZzo.zze());
                    }
                } else if (zzwgVar.zzd >= zzi() && ((zzpbVar = (zzpb) this.zze.get(this.zzh)) == null || zzpbVar.zzg() != -1 || zzpbVar.zzf() == zzmvVar.zzc)) {
                    i2 = zzmvVar.zzc;
                    zzpbVarZzo = zzo(i2, zzwgVar);
                    if (this.zzh == null) {
                        this.zzh = zzpbVarZzo.zze();
                    }
                    if (zzwgVar != null && zzwgVar.zzb()) {
                        obj = zzwgVar.zza;
                        long j2 = zzwgVar.zzd;
                        i3 = zzwgVar.zzb;
                        zzpbVarZzo2 = zzo(i2, new zzwg(obj, j2, i3));
                        if (!zzpbVarZzo2.zzi()) {
                            zzpbVarZzo2.zzj(true);
                            zzbd zzbdVar2 = this.zzd;
                            zzbfVar.zzo(obj, zzbdVar2);
                            zzbdVar2.zzc(i3);
                            Math.max(0L, zzfj.zzp(0L) + zzfj.zzp(0L));
                        }
                    }
                    if (!zzpbVarZzo.zzi()) {
                        zzpbVarZzo.zzj(true);
                    }
                    if (zzpbVarZzo.zze().equals(this.zzh) && !zzpbVarZzo.zzk()) {
                        zzpbVarZzo.zzl(true);
                        this.zzf.zzc(zzmvVar, zzpbVarZzo.zze());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final synchronized void zzd(zzmv zzmvVar) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbf zzbfVar = this.zzg;
            this.zzg = zzmvVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpb zzpbVar = (zzpb) it.next();
                if (!zzpbVar.zza(zzbfVar, this.zzg) || zzpbVar.zzd(zzmvVar)) {
                    it.remove();
                    if (zzpbVar.zzi()) {
                        if (zzpbVar.zze().equals(this.zzh)) {
                            zzm(zzpbVar);
                        }
                        this.zzf.zzd(zzmvVar, zzpbVar.zze(), false);
                    }
                }
            }
            zzl(zzmvVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final synchronized void zze(zzmv zzmvVar, int i2) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpb zzpbVar = (zzpb) it.next();
                if (zzpbVar.zzd(zzmvVar)) {
                    it.remove();
                    if (zzpbVar.zzi()) {
                        boolean zEquals = zzpbVar.zze().equals(this.zzh);
                        boolean z2 = false;
                        if (i2 == 0 && zEquals && zzpbVar.zzk()) {
                            z2 = true;
                        }
                        if (zEquals) {
                            zzm(zzpbVar);
                        }
                        this.zzf.zzd(zzmvVar, zzpbVar.zze(), z2);
                    }
                }
            }
            zzl(zzmvVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final synchronized void zzg(zzmv zzmvVar) {
        zzpk zzpkVar;
        try {
            String str = this.zzh;
            if (str != null) {
                zzpb zzpbVar = (zzpb) this.zze.get(str);
                if (zzpbVar == null) {
                    throw null;
                }
                zzm(zzpbVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpb zzpbVar2 = (zzpb) it.next();
                it.remove();
                if (zzpbVar2.zzi() && (zzpkVar = this.zzf) != null) {
                    zzpkVar.zzd(zzmvVar, zzpbVar2.zze(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    public final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }

    public zzpc(zzgqs zzgqsVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }
}
