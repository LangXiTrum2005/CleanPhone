package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbjg extends zzbjq {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze = new ArrayList();
    private final List zzf = new ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        zzc = iRgb;
        zza = Color.rgb(204, 204, 204);
        zzb = iRgb;
    }

    public zzbjg(String str, List list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z2) {
        this.zzd = str;
        for (int i4 = 0; i4 < list.size(); i4++) {
            zzbjj zzbjjVar = (zzbjj) list.get(i4);
            this.zze.add(zzbjjVar);
            this.zzf.add(zzbjjVar);
        }
        this.zzg = num != null ? num.intValue() : zza;
        this.zzh = num2 != null ? num2.intValue() : zzb;
        this.zzi = num3 != null ? num3.intValue() : 12;
        this.zzj = i2;
        this.zzk = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final String zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final List zzc() {
        return this.zzf;
    }

    public final List zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzg;
    }

    public final int zzf() {
        return this.zzh;
    }

    public final int zzg() {
        return this.zzi;
    }

    public final int zzh() {
        return this.zzj;
    }

    public final int zzi() {
        return this.zzk;
    }
}
