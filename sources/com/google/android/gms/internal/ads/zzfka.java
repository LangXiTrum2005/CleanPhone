package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
final class zzfka implements zzfjz {
    private final ConcurrentHashMap zza;
    private final zzfkg zzb;
    private final zzfkc zzc = new zzfkc();

    public zzfka(zzfkg zzfkgVar) {
        this.zza = new ConcurrentHashMap(zzfkgVar.zzd);
        this.zzb = zzfkgVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfkg> creator = zzfkg.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhg)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfkg zzfkgVar = this.zzb;
            sb.append(zzfkgVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i2 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i2++;
                sb.append(i2);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfkj) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i3 = 0; i3 < ((zzfjy) entry.getValue()).zzc(); i3++) {
                    sb.append("[O]");
                }
                for (int iZzc = ((zzfjy) entry.getValue()).zzc(); iZzc < zzfkgVar.zzd; iZzc++) {
                    sb.append("[ ]");
                }
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb.append(((zzfjy) entry.getValue()).zzg());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            while (i2 < zzfkgVar.zzc) {
                i2++;
                sb.append(i2);
                sb.append(".\n");
            }
            String string = sb.toString();
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final synchronized zzfki zza(zzfkj zzfkjVar) {
        zzfki zzfkiVarZzb;
        try {
            zzfjy zzfjyVar = (zzfjy) this.zza.get(zzfkjVar);
            if (zzfjyVar != null) {
                zzfkiVarZzb = zzfjyVar.zzb();
                if (zzfkiVarZzb == null) {
                    this.zzc.zzb();
                }
                zzfkw zzfkwVarZzh = zzfjyVar.zzh();
                if (zzfkiVarZzb != null) {
                    zzbfp.zzb.zzc zzcVarZzs = zzbfp.zzb.zzs();
                    zzbfp.zzb.zza.C0188zza c0188zzaZzs = zzbfp.zzb.zza.zzs();
                    c0188zzaZzs.zzc(zzbfp.zzb.zzd.IN_MEMORY);
                    zzbfp.zzb.zze.zza zzaVarZzq = zzbfp.zzb.zze.zzq();
                    zzaVarZzq.zzc(zzfkwVarZzh.zza);
                    zzaVarZzq.zzg(zzfkwVarZzh.zzb);
                    c0188zzaZzs.zzh(zzaVarZzq);
                    zzcVarZzs.zzh(c0188zzaZzs);
                    zzfkiVarZzb.zza.zza().zzd().zzj(zzcVarZzs.zzbu());
                }
                zzf();
            } else {
                this.zzc.zza();
                zzf();
                zzfkiVarZzb = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfkiVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final synchronized boolean zzb(zzfkj zzfkjVar, zzfki zzfkiVar) {
        boolean zZza;
        try {
            ConcurrentHashMap concurrentHashMap = this.zza;
            zzfjy zzfjyVar = (zzfjy) concurrentHashMap.get(zzfkjVar);
            zzfkiVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (zzfjyVar == null) {
                zzfkg zzfkgVar = this.zzb;
                zzfjy zzfjyVar2 = new zzfjy(zzfkgVar.zzd, zzfkgVar.zze * 1000);
                if (concurrentHashMap.size() == zzfkgVar.zzc) {
                    int i2 = zzfkgVar.zzg;
                    int i3 = i2 - 1;
                    zzfkj zzfkjVar2 = null;
                    if (i2 == 0) {
                        throw null;
                    }
                    long jZzd = Long.MAX_VALUE;
                    if (i3 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfjy) entry.getValue()).zzd() < jZzd) {
                                jZzd = ((zzfjy) entry.getValue()).zzd();
                                zzfkjVar2 = (zzfkj) entry.getKey();
                            }
                        }
                        if (zzfkjVar2 != null) {
                            concurrentHashMap.remove(zzfkjVar2);
                        }
                    } else if (i3 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfjy) entry2.getValue()).zze() < jZzd) {
                                jZzd = ((zzfjy) entry2.getValue()).zze();
                                zzfkjVar2 = (zzfkj) entry2.getKey();
                            }
                        }
                        if (zzfkjVar2 != null) {
                            concurrentHashMap.remove(zzfkjVar2);
                        }
                    } else if (i3 == 2) {
                        int iZzf = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfjy) entry3.getValue()).zzf() < iZzf) {
                                iZzf = ((zzfjy) entry3.getValue()).zzf();
                                zzfkjVar2 = (zzfkj) entry3.getKey();
                            }
                        }
                        if (zzfkjVar2 != null) {
                            concurrentHashMap.remove(zzfkjVar2);
                        }
                    }
                    this.zzc.zzd();
                }
                concurrentHashMap.put(zzfkjVar, zzfjyVar2);
                this.zzc.zzc();
                zzfjyVar = zzfjyVar2;
            }
            zZza = zzfjyVar.zza(zzfkiVar);
            zzfkc zzfkcVar = this.zzc;
            zzfkcVar.zze();
            zzfkb zzfkbVarZzf = zzfkcVar.zzf();
            zzfkw zzfkwVarZzh = zzfjyVar.zzh();
            zzbfp.zzb.zzc zzcVarZzs = zzbfp.zzb.zzs();
            zzbfp.zzb.zza.C0188zza c0188zzaZzs = zzbfp.zzb.zza.zzs();
            c0188zzaZzs.zzc(zzbfp.zzb.zzd.IN_MEMORY);
            zzbfp.zzb.zzg.zza zzaVarZzs = zzbfp.zzb.zzg.zzs();
            zzaVarZzs.zzc(zzfkbVarZzf.zza);
            zzaVarZzs.zzg(zzfkbVarZzf.zzb);
            zzaVarZzs.zzk(zzfkwVarZzh.zzb);
            c0188zzaZzs.zzn(zzaVarZzs);
            zzcVarZzs.zzh(c0188zzaZzs);
            zzfkiVar.zza.zza().zzd().zzk(zzcVarZzs.zzbu());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final synchronized boolean zzc(zzfkj zzfkjVar) {
        zzfjy zzfjyVar = (zzfjy) this.zza.get(zzfkjVar);
        if (zzfjyVar == null) {
            return true;
        }
        return zzfjyVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    @Deprecated
    public final zzfkj zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzfkg zzfkgVar = this.zzb;
        return new zzfkk(zzmVar, str, new zzbzd(zzfkgVar.zza).zza().zzj, zzfkgVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final zzfkg zze() {
        return this.zzb;
    }
}
