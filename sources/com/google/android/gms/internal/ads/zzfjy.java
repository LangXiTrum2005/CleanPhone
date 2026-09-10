package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
final class zzfjy {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfkx zzd = new zzfkx();

    public zzfjy(int i2, int i3) {
        this.zzb = i2;
        this.zzc = i3;
    }

    private final void zzi() {
        while (true) {
            LinkedList linkedList = this.zza;
            if (linkedList.isEmpty()) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((zzfki) linkedList.getFirst()).zzd < this.zzc) {
                return;
            }
            this.zzd.zzc();
            linkedList.remove();
        }
    }

    public final boolean zza(zzfki zzfkiVar) {
        this.zzd.zza();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.size() == this.zzb) {
            return false;
        }
        linkedList.add(zzfkiVar);
        return true;
    }

    public final zzfki zzb() {
        zzfkx zzfkxVar = this.zzd;
        zzfkxVar.zza();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.isEmpty()) {
            return null;
        }
        zzfki zzfkiVar = (zzfki) linkedList.remove();
        if (zzfkiVar != null) {
            zzfkxVar.zzb();
        }
        return zzfkiVar;
    }

    public final int zzc() {
        zzi();
        return this.zza.size();
    }

    public final long zzd() {
        return this.zzd.zzd();
    }

    public final long zze() {
        return this.zzd.zze();
    }

    public final int zzf() {
        return this.zzd.zzf();
    }

    public final String zzg() {
        return this.zzd.zzh();
    }

    public final zzfkw zzh() {
        return this.zzd.zzg();
    }
}
