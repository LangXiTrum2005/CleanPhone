package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zzcvk implements zzems {
    protected final zzfic zza;
    protected final zzfhr zzb;
    private final zzdbj zzc;
    private final zzdbw zzd;
    private final zzffg zze;
    private final zzdad zzf;
    private final zzdfb zzg;
    private final zzdca zzh;
    private final zzdig zzi;
    private final zzcze zzj;
    private final zzdyh zzk;

    public zzcvk(zzcvj zzcvjVar) {
        this.zza = zzcvjVar.zza();
        this.zzb = zzcvjVar.zzb();
        this.zzc = zzcvjVar.zzc();
        this.zzd = zzcvjVar.zzd();
        this.zze = zzcvjVar.zze();
        this.zzf = zzcvjVar.zzf();
        this.zzg = zzcvjVar.zzg();
        this.zzh = zzcvjVar.zzh();
        this.zzi = zzcvjVar.zzi();
        this.zzj = zzcvjVar.zzj();
        this.zzk = zzcvjVar.zzk();
    }

    public void zzd() {
        this.zzc.zzc(null);
    }

    public void zzj() {
        this.zzd.zzg();
        this.zzh.zza(this);
    }

    public final zzdbj zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzm() {
        this.zzi.zzi();
    }

    public final zzdad zzn() {
        return this.zzf;
    }

    public final zzcze zzo() {
        return this.zzj;
    }

    public final zzffg zzp() {
        return this.zze;
    }

    public final zzdea zzq() {
        return this.zzg.zzn();
    }

    public final zzfic zzr() {
        return this.zza;
    }

    public final boolean zzs() {
        return this.zzb.zzaq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt() {
        zzdyh zzdyhVar;
        List list = this.zzb.zzaC;
        if (list == null || list.isEmpty() || (zzdyhVar = this.zzk) == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziL)).booleanValue() || list.isEmpty()) {
            return;
        }
        zzgvs zzgvsVarListIterator = ((zzgtd) list).listIterator(0);
        while (zzgvsVarListIterator.hasNext()) {
            zzdyi zzdyiVar = (zzdyi) zzgvsVarListIterator.next();
            for (int i2 : zzdyiVar.zzb) {
                if (i2 == 1) {
                    zzdyhVar.zza(zzdyiVar.zza, 1, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    break;
                }
            }
        }
    }
}
