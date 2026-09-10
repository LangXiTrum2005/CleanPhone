package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzhn implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzht zza;

    public zzhn(zzht zzhtVar) {
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i2, String str, List list, boolean z2, boolean z3) {
        zzgs zzgsVarZzj;
        int i3 = i2 - 1;
        if (i3 == 0) {
            zzgsVarZzj = this.zza.zzu.zzaV().zzj();
        } else if (i3 != 1) {
            if (i3 == 3) {
                zzgsVarZzj = this.zza.zzu.zzaV().zzk();
            } else if (i3 != 4) {
                zzgsVarZzj = this.zza.zzu.zzaV().zzi();
            } else if (z2) {
                zzgsVarZzj = this.zza.zzu.zzaV().zzf();
            } else {
                zzgsVarZzj = !z3 ? this.zza.zzu.zzaV().zzh() : this.zza.zzu.zzaV().zze();
            }
        } else if (z2) {
            zzgsVarZzj = this.zza.zzu.zzaV().zzc();
        } else {
            zzgsVarZzj = !z3 ? this.zza.zzu.zzaV().zzd() : this.zza.zzu.zzaV().zzb();
        }
        int size = list.size();
        if (size == 1) {
            zzgsVarZzj.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzgsVarZzj.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgsVarZzj.zza(str);
        } else {
            zzgsVarZzj.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
