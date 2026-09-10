package com.google.android.gms.internal.ads;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes4.dex */
final class zzfkc {
    private final zzfkb zza = new zzfkb();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final void zza() {
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
    }

    public final void zzc() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zzd() {
        this.zzc++;
        this.zza.zzb = true;
    }

    public final void zze() {
        this.zzf++;
    }

    public final zzfkb zzf() {
        zzfkb zzfkbVar = this.zza;
        zzfkb zzfkbVarClone = zzfkbVar.clone();
        zzfkbVar.zza = false;
        zzfkbVar.zzb = false;
        return zzfkbVarClone;
    }

    public final String zzg() {
        StringBuilder sb = new StringBuilder("\n\tPool does not exist: ");
        sb.append(this.zzd);
        sb.append("\n\tNew pools created: ");
        sb.append(this.zzb);
        sb.append("\n\tPools removed: ");
        sb.append(this.zzc);
        sb.append("\n\tEntries added: ");
        sb.append(this.zzf);
        sb.append("\n\tNo entries retrieved: ");
        return android.support.v4.media.a.i(this.zze, IOUtils.LINE_SEPARATOR_UNIX, sb);
    }
}
