package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzag {
    public final Uri zza;
    public final String zzb;
    public final zzad zzc;
    public final zzy zzd;
    public final List zze;
    public final String zzf;
    public final zzgtd zzg;
    public final Object zzh;
    public final long zzi;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ zzag(Uri uri, String str, zzad zzadVar, zzy zzyVar, List list, String str2, zzgtd zzgtdVar, Object obj, long j, byte[] bArr) {
        this.zza = uri;
        int i2 = zzas.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzgtdVar;
        int i3 = zzgtd.zzd;
        zzgta zzgtaVar = new zzgta();
        if (zzgtdVar.size() > 0) {
            throw null;
        }
        zzgtaVar.zzi();
        this.zzh = null;
        this.zzi = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.zza.equals(zzagVar.zza) && this.zze.equals(zzagVar.zze) && this.zzg.equals(zzagVar.zzg);
    }

    public final int hashCode() {
        return (int) ((((long) ((this.zzg.hashCode() + androidx.media3.extractor.text.ttml.a.c(this.zza.hashCode() * 923521, 961, this.zze)) * 31)) * 31) - Long.MAX_VALUE);
    }
}
