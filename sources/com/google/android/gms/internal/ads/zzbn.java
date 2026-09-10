package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbn {
    public static final zzbn zza = new zzbn(zzgtd.zzi());
    private final zzgtd zzb;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
    }

    public zzbn(List list) {
        this.zzb = zzgtd.zzq(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbn.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbn) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzgtd zza() {
        return this.zzb;
    }

    public final boolean zzb(int i2) {
        int i3 = 0;
        while (true) {
            zzgtd zzgtdVar = this.zzb;
            if (i3 >= zzgtdVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgtdVar.get(i3);
            if (zzbmVar.zzb() && zzbmVar.zzd() == i2) {
                return true;
            }
            i3++;
        }
    }
}
