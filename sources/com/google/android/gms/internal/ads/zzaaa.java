package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzaaa extends zzaad {
    public abstract Pair zzh(zzzz zzzzVar, int[][][] iArr, int[] iArr2, zzwg zzwgVar, zzbf zzbfVar) throws zzit;

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zzp(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final zzaae zzq(zzmk[] zzmkVarArr, zzyh zzyhVar, zzwg zzwgVar, zzbf zzbfVar) throws zzit {
        List[] listArr;
        boolean z2;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = zzyhVar.zzb;
            zzbgVarArr[i2] = new zzbg[i3];
            iArr3[i2] = new int[i3][];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr4[i5] = zzmkVarArr[i5].zzu();
        }
        int i6 = 0;
        while (i6 < zzyhVar.zzb) {
            zzbg zzbgVarZza = zzyhVar.zza(i6);
            int i7 = zzbgVarZza.zzc;
            int i8 = i4;
            int i9 = 0;
            int i10 = 0;
            boolean z3 = true;
            while (i9 < i4) {
                zzmk zzmkVar = zzmkVarArr[i9];
                int iMax = 0;
                for (int i11 = 0; i11 < zzbgVarZza.zza; i11++) {
                    iMax = Math.max(iMax, zzmkVar.zzab(zzbgVarZza.zza(i11)) & 7);
                }
                boolean z4 = iArr2[i9] == 0;
                if (iMax > i10) {
                    z3 = z4;
                    i8 = i9;
                    i10 = iMax;
                } else if (iMax == i10 && i7 == 5 && !z3 && z4) {
                    i8 = i9;
                    i10 = iMax;
                    z3 = true;
                }
                i9++;
                i4 = 2;
            }
            if (i8 == i4) {
                iArr = new int[zzbgVarZza.zza];
            } else {
                zzmk zzmkVar2 = zzmkVarArr[i8];
                int i12 = zzbgVarZza.zza;
                int[] iArr5 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr5[i13] = zzmkVar2.zzab(zzbgVarZza.zza(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i8];
            zzbgVarArr[i8][i14] = zzbgVarZza;
            iArr3[i8][i14] = iArr;
            iArr2[i8] = i14 + 1;
            i6++;
            i4 = 2;
        }
        zzyh[] zzyhVarArr = new zzyh[i4];
        String[] strArr = new String[i4];
        int[] iArr6 = new int[i4];
        int i15 = 0;
        while (i15 < i4) {
            int i16 = iArr2[i15];
            zzyhVarArr[i15] = new zzyh((zzbg[]) zzfj.zzb(zzbgVarArr[i15], i16));
            iArr3[i15] = (int[][]) zzfj.zzb(iArr3[i15], i16);
            strArr[i15] = zzmkVarArr[i15].zzS();
            iArr6[i15] = zzmkVarArr[i15].zza();
            i15++;
            i4 = 2;
        }
        int i17 = i4;
        zzzz zzzzVar = new zzzz(strArr, iArr6, zzyhVarArr, iArr4, iArr3, new zzyh((zzbg[]) zzfj.zzb(zzbgVarArr[i17], iArr2[i17])));
        Pair pairZzh = zzh(zzzzVar, iArr3, iArr4, zzwgVar, zzbfVar);
        zzaab[] zzaabVarArr = (zzaab[]) pairZzh.second;
        List[] listArr2 = new List[zzaabVarArr.length];
        for (int i18 = 0; i18 < zzaabVarArr.length; i18++) {
            zzaab zzaabVar = zzaabVarArr[i18];
            listArr2[i18] = zzaabVar != null ? zzgtd.zzj(zzaabVar) : zzgtd.zzi();
        }
        zzgta zzgtaVar = new zzgta();
        for (int i19 = 0; i19 < 2; i19++) {
            zzyh zzyhVarZzb = zzzzVar.zzb(i19);
            List list = listArr2[i19];
            int i20 = 0;
            while (i20 < zzyhVarZzb.zzb) {
                zzbg zzbgVarZza2 = zzyhVarZzb.zza(i20);
                boolean z5 = zzzzVar.zzd(i19, i20, false) != 0;
                int i21 = zzbgVarZza2.zza;
                int[] iArr7 = new int[i21];
                boolean[] zArr = new boolean[i21];
                int i22 = 0;
                while (i22 < i21) {
                    iArr7[i22] = zzzzVar.zzc(i19, i20, i22) & 7;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= list.size()) {
                            listArr = listArr2;
                            z2 = false;
                            break;
                        }
                        zzaab zzaabVar2 = (zzaab) list.get(i23);
                        listArr = listArr2;
                        if (zzaabVar2.zza().equals(zzbgVarZza2) && zzaabVar2.zzg(i22) != -1) {
                            z2 = true;
                            break;
                        }
                        i23++;
                        listArr2 = listArr;
                    }
                    zArr[i22] = z2;
                    i22++;
                    listArr2 = listArr;
                }
                zzgtaVar.zzf(new zzbm(zzbgVarZza2, z5, iArr7, zArr));
                i20++;
                listArr2 = listArr2;
            }
        }
        zzyh zzyhVarZze = zzzzVar.zze();
        for (int i24 = 0; i24 < zzyhVarZze.zzb; i24++) {
            zzbg zzbgVarZza3 = zzyhVarZze.zza(i24);
            int i25 = zzbgVarZza3.zza;
            int[] iArr8 = new int[i25];
            Arrays.fill(iArr8, 0);
            zzgtaVar.zzf(new zzbm(zzbgVarZza3, false, iArr8, new boolean[i25]));
        }
        return new zzaae((zzml[]) pairZzh.first, (zzzw[]) pairZzh.second, new zzbn(zzgtaVar.zzi()), zzzzVar);
    }
}
