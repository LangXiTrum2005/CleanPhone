package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes4.dex */
public interface zzaeo {
    boolean zza(zzaep zzaepVar) throws IOException;

    default List zzb() {
        return zzgtd.zzi();
    }

    void zzc(zzaer zzaerVar);

    int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException;

    void zze(long j, long j2);

    void zzf();

    @SideEffectFree
    default zzaeo zzg() {
        return this;
    }
}
