package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
final class zzemp implements zzgyj {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfhu zzb;
    final /* synthetic */ zzfhr zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfpe zze;
    final /* synthetic */ zzfic zzf;
    final /* synthetic */ zzemr zzg;

    public zzemp(zzemr zzemrVar, long j, zzfhu zzfhuVar, zzfhr zzfhrVar, String str, zzfpe zzfpeVar, zzfic zzficVar) {
        this.zza = j;
        this.zzb = zzfhuVar;
        this.zzc = zzfhrVar;
        this.zzd = str;
        this.zze = zzfpeVar;
        this.zzf = zzficVar;
        Objects.requireNonNull(zzemrVar);
        this.zzg = zzemrVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006a A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0096 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1 A[Catch: all -> 0x007c, DONT_GENERATE, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        int i2;
        int i3;
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        Integer numValueOf;
        com.google.android.gms.ads.internal.client.zze zzeVarZza;
        int i4;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzemr zzemrVar = this.zzg;
        long jElapsedRealtime = zzemrVar.zzj().elapsedRealtime() - this.zza;
        if (!(th instanceof TimeoutException)) {
            if (th instanceof zzelz) {
                i2 = 3;
            } else if (th instanceof CancellationException) {
                i3 = 4;
            } else {
                if (!(th instanceof zzfir)) {
                    if (th instanceof zzebr) {
                        i3 = zzfjm.zza(th).zza == 3 ? 1 : 6;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcg)).booleanValue() && (th instanceof zzejk) && (zzeVarZzb = ((zzejk) th).zzb()) != null) {
                            numValueOf = Integer.valueOf(zzeVarZzb.zza);
                            i2 = i3;
                        }
                    } else {
                        i2 = 6;
                    }
                    synchronized (zzemrVar) {
                        try {
                            if (zzemrVar.zzn()) {
                                zzemrVar.zzk().zza(this.zzb, this.zzc, i2, th instanceof zzejk ? (zzejk) th : null, jElapsedRealtime);
                                jElapsedRealtime = jElapsedRealtime;
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjB)).booleanValue()) {
                                zzfpi zzfpiVarZzl = zzemrVar.zzl();
                                zzfpe zzfpeVar = this.zze;
                                zzfic zzficVar = this.zzf;
                                zzfhr zzfhrVar = this.zzc;
                                zzfpiVarZzl.zza(zzfpeVar.zza(zzficVar, zzfhrVar, zzfhrVar.zzn), zzfhrVar.zzax);
                            }
                            if (zzemrVar.zzp()) {
                                return;
                            }
                            LinkedHashMap linkedHashMapZzm = zzemrVar.zzm();
                            zzfhr zzfhrVar2 = this.zzc;
                            linkedHashMapZzm.put(zzfhrVar2, new zzemq(this.zzd, zzfhrVar2.zzaf, i2, jElapsedRealtime, numValueOf));
                            zzeVarZza = zzfjm.zza(th);
                            i4 = zzeVarZza.zza;
                            if ((i4 != 3 || i4 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                            }
                            zzemrVar.zzo().zze(zzfhrVar2, jElapsedRealtime, zzeVarZza);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                i3 = 5;
            }
            numValueOf = null;
            synchronized (zzemrVar) {
                if (zzemrVar.zzn()) {
                    zzemrVar.zzk().zza(this.zzb, this.zzc, i2, th instanceof zzejk ? (zzejk) th : null, jElapsedRealtime);
                    jElapsedRealtime = jElapsedRealtime;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjB)).booleanValue()) {
                    zzfpi zzfpiVarZzl2 = zzemrVar.zzl();
                    zzfpe zzfpeVar2 = this.zze;
                    zzfic zzficVar2 = this.zzf;
                    zzfhr zzfhrVar3 = this.zzc;
                    zzfpiVarZzl2.zza(zzfpeVar2.zza(zzficVar2, zzfhrVar3, zzfhrVar3.zzn), zzfhrVar3.zzax);
                }
                if (zzemrVar.zzp()) {
                    return;
                }
                LinkedHashMap linkedHashMapZzm2 = zzemrVar.zzm();
                zzfhr zzfhrVar4 = this.zzc;
                linkedHashMapZzm2.put(zzfhrVar4, new zzemq(this.zzd, zzfhrVar4.zzaf, i2, jElapsedRealtime, numValueOf));
                zzeVarZza = zzfjm.zza(th);
                i4 = zzeVarZza.zza;
                zzeVarZza = i4 != 3 ? zzfjm.zza(new zzejk(13, zzeVarZza.zzd)) : zzfjm.zza(new zzejk(13, zzeVarZza.zzd));
                zzemrVar.zzo().zze(zzfhrVar4, jElapsedRealtime, zzeVarZza);
            }
        }
        i3 = 2;
        i2 = i3;
        numValueOf = null;
        synchronized (zzemrVar) {
            if (zzemrVar.zzn()) {
                zzemrVar.zzk().zza(this.zzb, this.zzc, i2, th instanceof zzejk ? (zzejk) th : null, jElapsedRealtime);
                jElapsedRealtime = jElapsedRealtime;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjB)).booleanValue()) {
                zzfpi zzfpiVarZzl3 = zzemrVar.zzl();
                zzfpe zzfpeVar3 = this.zze;
                zzfic zzficVar3 = this.zzf;
                zzfhr zzfhrVar5 = this.zzc;
                zzfpiVarZzl3.zza(zzfpeVar3.zza(zzficVar3, zzfhrVar5, zzfhrVar5.zzn), zzfhrVar5.zzax);
            }
            if (zzemrVar.zzp()) {
                return;
            }
            LinkedHashMap linkedHashMapZzm3 = zzemrVar.zzm();
            zzfhr zzfhrVar6 = this.zzc;
            linkedHashMapZzm3.put(zzfhrVar6, new zzemq(this.zzd, zzfhrVar6.zzaf, i2, jElapsedRealtime, numValueOf));
            zzeVarZza = zzfjm.zza(th);
            i4 = zzeVarZza.zza;
            if (i4 != 3) {
            }
            zzemrVar.zzo().zze(zzfhrVar6, jElapsedRealtime, zzeVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zzb(Object obj) {
        long j;
        zzemr zzemrVar = this.zzg;
        long jElapsedRealtime = zzemrVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzemrVar) {
            try {
                if (zzemrVar.zzn()) {
                    j = jElapsedRealtime;
                    zzemrVar.zzk().zza(this.zzb, this.zzc, 0, null, j);
                } else {
                    j = jElapsedRealtime;
                }
                if (zzemrVar.zzp()) {
                    return;
                }
                zzfhr zzfhrVar = this.zzc;
                if (zzemrVar.zzi(zzfhrVar)) {
                    ((zzemq) zzemrVar.zzm().get(zzfhrVar)).zzd = j;
                } else {
                    long j2 = j;
                    j = j2;
                    zzemrVar.zzm().put(zzfhrVar, new zzemq(this.zzd, zzfhrVar.zzaf, 0, j2, null));
                }
                zzemrVar.zzo().zzd(zzfhrVar, j, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
