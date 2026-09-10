package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzlu implements zzwr, zztg {
    final /* synthetic */ zzlz zza;
    private final zzlw zzb;

    public zzlu(zzlz zzlzVar, zzlw zzlwVar) {
        Objects.requireNonNull(zzlzVar);
        this.zza = zzlzVar;
        this.zzb = zzlwVar;
    }

    private final Pair zzf(int i2, zzwg zzwgVar) {
        zzwg zzwgVarZza;
        zzwg zzwgVar2 = null;
        if (zzwgVar != null) {
            zzlw zzlwVar = this.zzb;
            int i3 = 0;
            while (true) {
                List list = zzlwVar.zzc;
                if (i3 >= list.size()) {
                    zzwgVarZza = null;
                    break;
                }
                if (((zzwg) list.get(i3)).zzd == zzwgVar.zzd) {
                    Object obj = zzwgVar.zza;
                    Object obj2 = zzlwVar.zzb;
                    int i4 = zzmg.zzb;
                    zzwgVarZza = zzwgVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i3++;
            }
            if (zzwgVarZza == null) {
                return null;
            }
            zzwgVar2 = zzwgVarZza;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzwgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzai(int i2, zzwg zzwgVar, final zzvx zzvxVar, final zzwc zzwcVar, final int i3) {
        final Pair pairZzf = zzf(0, zzwgVar);
        if (pairZzf != null) {
            zzlz zzlzVar = this.zza;
            zzlzVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzai(((Integer) pair.first).intValue(), (zzwg) pair.second, zzvxVar, zzwcVar, i3);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzaj(int i2, zzwg zzwgVar, final zzvx zzvxVar, final zzwc zzwcVar) {
        final Pair pairZzf = zzf(0, zzwgVar);
        if (pairZzf != null) {
            zzlz zzlzVar = this.zza;
            zzlzVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzaj(((Integer) pair.first).intValue(), (zzwg) pair.second, zzvxVar, zzwcVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzak(int i2, zzwg zzwgVar, final zzvx zzvxVar, final zzwc zzwcVar) {
        final Pair pairZzf = zzf(0, zzwgVar);
        if (pairZzf != null) {
            zzlz zzlzVar = this.zza;
            zzlzVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzak(((Integer) pair.first).intValue(), (zzwg) pair.second, zzvxVar, zzwcVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzal(int i2, zzwg zzwgVar, final zzvx zzvxVar, final zzwc zzwcVar, final IOException iOException, final boolean z2) {
        final Pair pairZzf = zzf(0, zzwgVar);
        if (pairZzf != null) {
            zzlz zzlzVar = this.zza;
            zzlzVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzal(((Integer) pair.first).intValue(), (zzwg) pair.second, zzvxVar, zzwcVar, iOException, z2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzam(int i2, zzwg zzwgVar, final zzwc zzwcVar) {
        final Pair pairZzf = zzf(0, zzwgVar);
        if (pairZzf != null) {
            zzlz zzlzVar = this.zza;
            zzlzVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzls
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzam(((Integer) pair.first).intValue(), (zzwg) pair.second, zzwcVar);
                }
            });
        }
    }
}
