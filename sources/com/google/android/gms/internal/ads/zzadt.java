package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzadt {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzadt(List list, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, String str) {
        this.zza = list;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = i7;
        this.zzh = i8;
        this.zzi = i9;
        this.zzj = i10;
        this.zzk = f;
        this.zzl = str;
    }

    public static zzadt zza(zzer zzerVar) throws zzat {
        String strZza;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        int i9;
        try {
            zzerVar.zzk(4);
            int iZzs = (zzerVar.zzs() & 3) + 1;
            if (iZzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzs2 = zzerVar.zzs() & 31;
            for (int i10 = 0; i10 < iZzs2; i10++) {
                arrayList.add(zzb(zzerVar));
            }
            int iZzs3 = zzerVar.zzs();
            for (int i11 = 0; i11 < iZzs3; i11++) {
                arrayList.add(zzb(zzerVar));
            }
            if (iZzs2 > 0) {
                zzgl zzglVarZze = zzgm.zze((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i12 = zzglVarZze.zze;
                int i13 = zzglVarZze.zzf;
                int i14 = zzglVarZze.zzh + 8;
                int i15 = zzglVarZze.zzi + 8;
                int i16 = zzglVarZze.zzj;
                int i17 = zzglVarZze.zzk;
                int i18 = zzglVarZze.zzl;
                int i19 = zzglVarZze.zzm;
                float f2 = zzglVarZze.zzg;
                strZza = zzdo.zza(zzglVarZze.zza, zzglVarZze.zzb, zzglVarZze.zzc);
                i6 = i18;
                i7 = i19;
                f = f2;
                i5 = i15;
                i8 = i16;
                i9 = i17;
                i2 = i12;
                i3 = i13;
                i4 = i14;
            } else {
                strZza = null;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = 16;
                f = 1.0f;
                i8 = -1;
                i9 = -1;
            }
            return new zzadt(arrayList, iZzs, i2, i3, i4, i5, i8, i9, i6, i7, f, strZza);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw zzat.zzb("Error parsing AVC config", e2);
        }
    }

    private static byte[] zzb(zzer zzerVar) {
        int iZzt = zzerVar.zzt();
        int iZzg = zzerVar.zzg();
        zzerVar.zzk(iZzt);
        return zzdo.zzf(zzerVar.zzi(), iZzg, iZzt);
    }
}
