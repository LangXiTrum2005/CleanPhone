package com.google.android.gms.internal.measurement;

import com.applovin.impl.Z;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zznz {
    public static final /* synthetic */ int zza = 0;
    private static final zzoi zzb;

    static {
        int i2 = zznu.zza;
        zzb = new zzok();
    }

    public static zzoi zzA() {
        return zzb;
    }

    public static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzC(zzls zzlsVar, Object obj, Object obj2) {
        if (((zzmc) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzD(zzoi zzoiVar, Object obj, Object obj2) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVarZzc = zzmfVar.zzc;
        zzoj zzojVar = ((zzmf) obj2).zzc;
        if (!zzoj.zza().equals(zzojVar)) {
            if (zzoj.zza().equals(zzojVarZzc)) {
                zzojVarZzc = zzoj.zzc(zzojVarZzc, zzojVar);
            } else {
                zzojVarZzc.zzl(zzojVar);
            }
        }
        zzmfVar.zzc = zzojVarZzc;
    }

    public static Object zzE(Object obj, int i2, int i3, Object obj2, zzoi zzoiVar) {
        if (obj2 == null) {
            obj2 = zzoiVar.zza(obj);
        }
        ((zzoj) obj2).zzk(i2 << 3, Long.valueOf(i3));
        return obj2;
    }

    public static void zza(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzC(i2, list, z2);
    }

    public static void zzb(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzB(i2, list, z2);
    }

    public static void zzc(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzy(i2, list, z2);
    }

    public static void zzd(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzz(i2, list, z2);
    }

    public static void zze(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzL(i2, list, z2);
    }

    public static void zzf(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzA(i2, list, z2);
    }

    public static void zzg(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzJ(i2, list, z2);
    }

    public static void zzh(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzw(i2, list, z2);
    }

    public static void zzi(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzH(i2, list, z2);
    }

    public static void zzj(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzK(i2, list, z2);
    }

    public static void zzk(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzx(i2, list, z2);
    }

    public static void zzl(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzI(i2, list, z2);
    }

    public static void zzm(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzD(i2, list, z2);
    }

    public static void zzn(int i2, List list, zzov zzovVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzE(i2, list, z2);
    }

    public static int zzo(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzlm.zzA(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i2));
            i2++;
        }
        return iZzA2;
    }

    public static int zzp(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzlm.zzA(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i2));
            i2++;
        }
        return iZzA2;
    }

    public static int zzq(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i2 < size) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                iZzA += zzlm.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i2 < size) {
            long jZzc = zznaVar.zzc(i2);
            iZzA2 += zzlm.zzA((jZzc >> 63) ^ (jZzc + jZzc));
            i2++;
        }
        return iZzA2;
    }

    public static int zzr(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iZzA;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i2));
            i2++;
        }
        return iZzA2;
    }

    public static int zzs(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iZzA;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i2));
            i2++;
        }
        return iZzA2;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzz = 0;
            while (i2 < size) {
                iZzz += zzlm.zzz(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iZzz;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzz2 = 0;
        while (i2 < size) {
            iZzz2 += zzlm.zzz(zzmgVar.zzf(i2));
            i2++;
        }
        return iZzz2;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzz = 0;
            while (i2 < size) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                iZzz += zzlm.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return iZzz;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzz2 = 0;
        while (i2 < size) {
            int iZzf = zzmgVar.zzf(i2);
            iZzz2 += zzlm.zzz((iZzf >> 31) ^ (iZzf + iZzf));
            i2++;
        }
        return iZzz2;
    }

    public static int zzv(List list) {
        return list.size() * 4;
    }

    public static int zzw(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlm.zzz(i2 << 3) + 4) * size;
    }

    public static int zzx(List list) {
        return list.size() * 8;
    }

    public static int zzy(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlm.zzz(i2 << 3) + 8) * size;
    }

    public static int zzz(int i2, Object obj, zznx zznxVar) {
        int i3 = i2 << 3;
        if (!(obj instanceof zzmw)) {
            return zzlm.zzD((zznm) obj, zznxVar) + zzlm.zzz(i3);
        }
        int iZzz = zzlm.zzz(i3);
        int iZzb = ((zzmw) obj).zzb();
        return Z.B(iZzb, iZzb, iZzz);
    }
}
