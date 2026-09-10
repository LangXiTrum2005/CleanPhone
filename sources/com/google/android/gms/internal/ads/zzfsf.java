package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfsf {
    private static final zzfsf zza = new zzfsf();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfsf() {
    }

    public static zzfsf zza() {
        return zza;
    }

    public final void zzb(zzfrl zzfrlVar) {
        this.zzb.add(zzfrlVar);
    }

    public final void zzc(zzfrl zzfrlVar) {
        ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzfrlVar);
        if (zZzg) {
            return;
        }
        zzfsn.zza().zzc();
    }

    public final void zzd(zzfrl zzfrlVar) {
        ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzfrlVar);
        this.zzc.remove(zzfrlVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfsn.zza().zze();
    }

    public final Collection zze() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final Collection zzf() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
