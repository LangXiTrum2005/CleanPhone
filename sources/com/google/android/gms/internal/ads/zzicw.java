package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class zzicw {
    public static final /* synthetic */ int zza = 0;
    private static final zzidf zzb;

    static {
        int i2 = zzhyy.zza;
        zzb = new zzidh();
    }

    public static int zzA(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhzw.zzA(i2 << 3) + 4) * size;
    }

    public static int zzB(List list) {
        return list.size() * 8;
    }

    public static int zzC(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhzw.zzA(i2 << 3) + 8) * size;
    }

    public static int zzD(int i2, Object obj, zzicu zzicuVar) {
        int i3 = i2 << 3;
        if (obj instanceof zzibm) {
            int iZzA = zzhzw.zzA(i3);
            int iZzb = ((zzibm) obj).zzb();
            return Z.b(iZzb, iZzb, iZzA);
        }
        int iZzA2 = zzhzw.zzA(i3);
        int iZzaT = ((zzhyu) obj).zzaT(zzicuVar);
        return Z.b(iZzaT, iZzaT, iZzA2);
    }

    @Deprecated
    public static int zzE(int i2, zzicc zziccVar, zzicu zzicuVar) {
        int iZzA = zzhzw.zzA(i2 << 3);
        return ((zzhyu) zziccVar).zzaT(zzicuVar) + iZzA + iZzA;
    }

    public static zzidf zzF() {
        return zzb;
    }

    public static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzH(zziac zziacVar, Object obj, Object obj2) {
        if (((zzian) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzI(zzidf zzidfVar, Object obj, Object obj2) {
        zziar zziarVar = (zziar) obj;
        zzidg zzidgVarZzc = zziarVar.zzt;
        zzidg zzidgVar = ((zziar) obj2).zzt;
        if (!zzidg.zza().equals(zzidgVar)) {
            if (zzidg.zza().equals(zzidgVarZzc)) {
                zzidgVarZzc = zzidg.zzc(zzidgVarZzc, zzidgVar);
            } else {
                zzidgVarZzc.zzm(zzidgVar);
            }
        }
        zziarVar.zzt = zzidgVarZzc;
    }

    public static Object zzJ(Object obj, int i2, List list, zziax zziaxVar, Object obj2, zzidf zzidfVar) {
        if (zziaxVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zziaxVar.zza(iIntValue)) {
                    obj2 = zzK(obj, i2, iIntValue, obj2, zzidfVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Integer num = (Integer) list.get(i4);
            int iIntValue2 = num.intValue();
            if (zziaxVar.zza(iIntValue2)) {
                if (i4 != i3) {
                    list.set(i3, num);
                }
                i3++;
            } else {
                obj2 = zzK(obj, i2, iIntValue2, obj2, zzidfVar);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return obj2;
    }

    public static Object zzK(Object obj, int i2, int i3, Object obj2, zzidf zzidfVar) {
        if (obj2 == null) {
            obj2 = zzidfVar.zzh(obj);
        }
        zzidfVar.zza(obj2, i2, i3);
        return obj2;
    }

    public static void zza(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzC(i2, list, z2);
    }

    public static void zzb(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzB(i2, list, z2);
    }

    public static void zzc(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzy(i2, list, z2);
    }

    public static void zzd(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzz(i2, list, z2);
    }

    public static void zze(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzL(i2, list, z2);
    }

    public static void zzf(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzA(i2, list, z2);
    }

    public static void zzg(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzJ(i2, list, z2);
    }

    public static void zzh(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzw(i2, list, z2);
    }

    public static void zzi(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzH(i2, list, z2);
    }

    public static void zzj(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzK(i2, list, z2);
    }

    public static void zzk(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzx(i2, list, z2);
    }

    public static void zzl(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzI(i2, list, z2);
    }

    public static void zzm(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzD(i2, list, z2);
    }

    public static void zzn(int i2, List list, zzidu zziduVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzE(i2, list, z2);
    }

    public static void zzo(int i2, List list, zzidu zziduVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzF(i2, list);
    }

    public static void zzp(int i2, List list, zzidu zziduVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziduVar.zzG(i2, list);
    }

    public static void zzq(int i2, List list, zzidu zziduVar, zzicu zzicuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((zzhzx) zziduVar).zzr(i2, list.get(i3), zzicuVar);
        }
    }

    public static void zzr(int i2, List list, zzidu zziduVar, zzicu zzicuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((zzhzx) zziduVar).zzs(i2, list.get(i3), zzicuVar);
        }
    }

    public static int zzs(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibq)) {
            int iZzB = 0;
            while (i2 < size) {
                iZzB += zzhzw.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iZzB;
        }
        zzibq zzibqVar = (zzibq) list;
        int iZzB2 = 0;
        while (i2 < size) {
            iZzB2 += zzhzw.zzB(zzibqVar.zzc(i2));
            i2++;
        }
        return iZzB2;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibq)) {
            int iZzB = 0;
            while (i2 < size) {
                iZzB += zzhzw.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iZzB;
        }
        zzibq zzibqVar = (zzibq) list;
        int iZzB2 = 0;
        while (i2 < size) {
            iZzB2 += zzhzw.zzB(zzibqVar.zzc(i2));
            i2++;
        }
        return iZzB2;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibq)) {
            int iZzB = 0;
            while (i2 < size) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                iZzB += zzhzw.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return iZzB;
        }
        zzibq zzibqVar = (zzibq) list;
        int iZzB2 = 0;
        while (i2 < size) {
            long jZzc = zzibqVar.zzc(i2);
            iZzB2 += zzhzw.zzB((jZzc >> 63) ^ (jZzc + jZzc));
            i2++;
        }
        return iZzB2;
    }

    public static int zzv(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzias)) {
            int iZzB = 0;
            while (i2 < size) {
                iZzB += zzhzw.zzB(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iZzB;
        }
        zzias zziasVar = (zzias) list;
        int iZzB2 = 0;
        while (i2 < size) {
            iZzB2 += zzhzw.zzB(zziasVar.zzf(i2));
            i2++;
        }
        return iZzB2;
    }

    public static int zzw(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzias)) {
            int iZzB = 0;
            while (i2 < size) {
                iZzB += zzhzw.zzB(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iZzB;
        }
        zzias zziasVar = (zzias) list;
        int iZzB2 = 0;
        while (i2 < size) {
            iZzB2 += zzhzw.zzB(zziasVar.zzf(i2));
            i2++;
        }
        return iZzB2;
    }

    public static int zzx(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzias)) {
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzhzw.zzA(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iZzA;
        }
        zzias zziasVar = (zzias) list;
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzhzw.zzA(zziasVar.zzf(i2));
            i2++;
        }
        return iZzA2;
    }

    public static int zzy(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzias)) {
            int iZzA = 0;
            while (i2 < size) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                iZzA += zzhzw.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return iZzA;
        }
        zzias zziasVar = (zzias) list;
        int iZzA2 = 0;
        while (i2 < size) {
            int iZzf = zziasVar.zzf(i2);
            iZzA2 += zzhzw.zzA((iZzf >> 31) ^ (iZzf + iZzf));
            i2++;
        }
        return iZzA2;
    }

    public static int zzz(List list) {
        return list.size() * 4;
    }
}
