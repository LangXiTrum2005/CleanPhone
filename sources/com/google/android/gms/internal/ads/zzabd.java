package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabd {
    private static final Comparator zza = zzabc.zza;
    private static final Comparator zzb = zzabb.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzaba[] zzd = new zzaba[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzabd(int i2) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i2, float f) {
        zzaba zzabaVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i3 = this.zzh;
        if (i3 > 0) {
            zzaba[] zzabaVarArr = this.zzd;
            int i4 = i3 - 1;
            this.zzh = i4;
            zzabaVar = zzabaVarArr[i4];
        } else {
            zzabaVar = new zzaba(null);
        }
        int i5 = this.zzf;
        this.zzf = i5 + 1;
        zzabaVar.zza = i5;
        zzabaVar.zzb = i2;
        zzabaVar.zzc = f;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzabaVar);
        this.zzg += i2;
        while (true) {
            int i6 = this.zzg;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            zzaba zzabaVar2 = (zzaba) arrayList.get(0);
            int i8 = zzabaVar2.zzb;
            if (i8 <= i7) {
                this.zzg -= i8;
                arrayList.remove(0);
                int i9 = this.zzh;
                if (i9 < 5) {
                    zzaba[] zzabaVarArr2 = this.zzd;
                    this.zzh = i9 + 1;
                    zzabaVarArr2[i9] = zzabaVar2;
                }
            } else {
                zzabaVar2.zzb = i8 - i7;
                this.zzg -= i7;
            }
        }
    }

    public final float zzc(float f) {
        int i2 = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i2 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzaba) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f3 = 0.5f * f2;
            zzaba zzabaVar = (zzaba) arrayList.get(i2);
            i3 += zzabaVar.zzb;
            if (i3 >= f3) {
                return zzabaVar.zzc;
            }
            i2++;
        }
    }
}
