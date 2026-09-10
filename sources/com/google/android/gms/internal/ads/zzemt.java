package com.google.android.gms.internal.ads;

import com.smartdigimkt.o1.b;
import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemt {
    private final zzfjd zza;
    private final zzdur zzb;
    private final zzdxe zzc;

    public zzemt(zzfjd zzfjdVar, zzdur zzdurVar, zzdxe zzdxeVar) {
        this.zza = zzfjdVar;
        this.zzb = zzdurVar;
        this.zzc = zzdxeVar;
    }

    public final void zza(zzfhu zzfhuVar, zzfhr zzfhrVar, int i2, @Nullable zzejk zzejkVar, long j) {
        zzduq zzduqVarZzc;
        zzdxd zzdxdVarZza = this.zzc.zza();
        zzdxdVarZza.zza(zzfhuVar);
        zzdxdVarZza.zzb(zzfhrVar);
        zzdxdVarZza.zzc("action", "adapter_status");
        zzdxdVarZza.zzc("adapter_l", String.valueOf(j));
        zzdxdVarZza.zzc(b.I1, Integer.toString(i2));
        if (zzejkVar != null) {
            zzdxdVarZza.zzc("arec", Integer.toString(zzejkVar.zzb().zza));
            String strZza = this.zza.zza(zzejkVar.getMessage());
            if (strZza != null) {
                zzdxdVarZza.zzc("areec", strZza);
            }
        }
        zzdur zzdurVar = this.zzb;
        Iterator it = zzfhrVar.zzt.iterator();
        do {
            if (!it.hasNext()) {
                zzduqVarZzc = null;
                break;
            }
            zzduqVarZzc = zzdurVar.zzc((String) it.next());
        } while (zzduqVarZzc == null);
        if (zzduqVarZzc != null) {
            zzdxdVarZza.zzc("ancn", zzduqVarZzc.zza);
            zzbvn zzbvnVar = zzduqVarZzc.zzb;
            if (zzbvnVar != null) {
                zzdxdVarZza.zzc("adapter_v", zzbvnVar.toString());
            }
            zzbvn zzbvnVar2 = zzduqVarZzc.zzc;
            if (zzbvnVar2 != null) {
                zzdxdVarZza.zzc("adapter_sv", zzbvnVar2.toString());
            }
        }
        zzdxdVarZza.zzd();
    }
}
