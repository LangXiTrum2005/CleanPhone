package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzfdx implements zzfdw {
    private final ConcurrentHashMap zza;
    private final zzfed zzb;
    private final zzfdz zzc = new zzfdz();

    public zzfdx(zzfed zzfedVar) {
        this.zza = new ConcurrentHashMap(zzfedVar.zzd);
        this.zzb = zzfedVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfed> creator = zzfed.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgh)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfeg) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfdv) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int iZzb = ((zzfdv) entry.getValue()).zzb(); iZzb < this.zzb.zzd; iZzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfdv) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            com.google.android.gms.ads.internal.util.client.zzo.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdw
    public final zzfed zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfdw
    @Nullable
    public final synchronized zzfef zzb(zzfeg zzfegVar) {
        zzfef zzfefVarZze;
        try {
            zzfdv zzfdvVar = (zzfdv) this.zza.get(zzfegVar);
            if (zzfdvVar != null) {
                zzfefVarZze = zzfdvVar.zze();
                if (zzfefVarZze == null) {
                    this.zzc.zze();
                }
                zzfet zzfetVarZzf = zzfdvVar.zzf();
                if (zzfefVarZze != null) {
                    zzbbq.zzb.zzc zzcVarZzd = zzbbq.zzb.zzd();
                    zzbbq.zzb.zza.C0139zza c0139zzaZza = zzbbq.zzb.zza.zza();
                    c0139zzaZza.zzf(zzbbq.zzb.zzd.IN_MEMORY);
                    zzbbq.zzb.zze.zza zzaVarZzb = zzbbq.zzb.zze.zzb();
                    zzaVarZzb.zzd(zzfetVarZzf.zza);
                    zzaVarZzb.zze(zzfetVarZzf.zzb);
                    c0139zzaZza.zzg(zzaVarZzb);
                    zzcVarZzd.zzd(c0139zzaZza);
                    zzfefVarZze.zza.zzb().zzc().zzi(zzcVarZzd.zzbr());
                }
                zzf();
            } else {
                this.zzc.zzf();
                zzf();
                zzfefVarZze = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfefVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfdw
    @Deprecated
    public final zzfeg zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzy zzyVar) {
        return new zzfeh(zzmVar, str, new zzbvn(this.zzb.zza).zza().zzj, this.zzb.zzf, zzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdw
    public final synchronized boolean zzd(zzfeg zzfegVar, zzfef zzfefVar) {
        boolean zZzh;
        try {
            zzfdv zzfdvVar = (zzfdv) this.zza.get(zzfegVar);
            zzfefVar.zzd = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            if (zzfdvVar == null) {
                zzfed zzfedVar = this.zzb;
                zzfdv zzfdvVar2 = new zzfdv(zzfedVar.zzd, zzfedVar.zze * 1000);
                if (this.zza.size() == this.zzb.zzc) {
                    int i = this.zzb.zzg;
                    int i2 = i - 1;
                    zzfeg zzfegVar2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long jZzc = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfdv) entry.getValue()).zzc() < jZzc) {
                                jZzc = ((zzfdv) entry.getValue()).zzc();
                                zzfegVar2 = (zzfeg) entry.getKey();
                            }
                        }
                        if (zzfegVar2 != null) {
                            this.zza.remove(zzfegVar2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfdv) entry2.getValue()).zzd() < jZzc) {
                                jZzc = ((zzfdv) entry2.getValue()).zzd();
                                zzfegVar2 = (zzfeg) entry2.getKey();
                            }
                        }
                        if (zzfegVar2 != null) {
                            this.zza.remove(zzfegVar2);
                        }
                    } else if (i2 == 2) {
                        int iZza = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfdv) entry3.getValue()).zza() < iZza) {
                                iZza = ((zzfdv) entry3.getValue()).zza();
                                zzfegVar2 = (zzfeg) entry3.getKey();
                            }
                        }
                        if (zzfegVar2 != null) {
                            this.zza.remove(zzfegVar2);
                        }
                    }
                    this.zzc.zzg();
                }
                this.zza.put(zzfegVar, zzfdvVar2);
                this.zzc.zzd();
                zzfdvVar = zzfdvVar2;
            }
            zZzh = zzfdvVar.zzh(zzfefVar);
            this.zzc.zzc();
            zzfdy zzfdyVarZza = this.zzc.zza();
            zzfet zzfetVarZzf = zzfdvVar.zzf();
            zzbbq.zzb.zzc zzcVarZzd = zzbbq.zzb.zzd();
            zzbbq.zzb.zza.C0139zza c0139zzaZza = zzbbq.zzb.zza.zza();
            c0139zzaZza.zzf(zzbbq.zzb.zzd.IN_MEMORY);
            zzbbq.zzb.zzg.zza zzaVarZzb = zzbbq.zzb.zzg.zzb();
            zzaVarZzb.zze(zzfdyVarZza.zza);
            zzaVarZzb.zzf(zzfdyVarZza.zzb);
            zzaVarZzb.zzg(zzfetVarZzf.zzb);
            c0139zzaZza.zzi(zzaVarZzb);
            zzcVarZzd.zzd(c0139zzaZza);
            zzfefVar.zza.zzb().zzc().zzj(zzcVarZzd.zzbr());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfdw
    public final synchronized boolean zze(zzfeg zzfegVar) {
        zzfdv zzfdvVar = (zzfdv) this.zza.get(zzfegVar);
        if (zzfdvVar == null) {
            return true;
        }
        return zzfdvVar.zzb() < this.zzb.zzd;
    }
}
