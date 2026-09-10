package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzsc {
    public static final /* synthetic */ int zza = 0;
    private static final zzsp zzb;

    static {
        int i = zzpc.zza;
        zzb = new zzsr();
    }

    public static void zzA(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzC(i, list, z);
    }

    public static void zzB(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzE(i, list, z);
    }

    public static void zzC(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzI(i, list, z);
    }

    public static void zzD(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzK(i, list, z);
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    public static int zza(int i, zzrq zzrqVar, zzsa zzsaVar) {
        int iZzC = zzpv.zzC(i << 3);
        return iZzC + iZzC + ((zzpa) zzrqVar).zzj(zzsaVar);
    }

    public static int zzb(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iZzD = 0;
            while (i < size) {
                iZzD += zzpv.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzD;
        }
        zzqn zzqnVar = (zzqn) list;
        int iZzD2 = 0;
        while (i < size) {
            iZzD2 += zzpv.zzD(zzqnVar.zze(i));
            i++;
        }
        return iZzD2;
    }

    public static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzpv.zzC(i << 3) + 4);
    }

    public static int zzd(List list) {
        return list.size() * 4;
    }

    public static int zze(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzpv.zzC(i << 3) + 8);
    }

    public static int zzf(List list) {
        return list.size() * 8;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iZzD = 0;
            while (i < size) {
                iZzD += zzpv.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzD;
        }
        zzqn zzqnVar = (zzqn) list;
        int iZzD2 = 0;
        while (i < size) {
            iZzD2 += zzpv.zzD(zzqnVar.zze(i));
            i++;
        }
        return iZzD2;
    }

    public static int zzh(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int iZzD = 0;
            while (i < size) {
                iZzD += zzpv.zzD(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzD;
        }
        zzre zzreVar = (zzre) list;
        int iZzD2 = 0;
        while (i < size) {
            iZzD2 += zzpv.zzD(zzreVar.zze(i));
            i++;
        }
        return iZzD2;
    }

    public static int zzi(int i, Object obj, zzsa zzsaVar) {
        int iZzC;
        int iZzj;
        int iZzC2;
        int i2 = i << 3;
        if (obj instanceof zzra) {
            iZzC = zzpv.zzC(i2);
            iZzj = ((zzra) obj).zza();
            iZzC2 = zzpv.zzC(iZzj);
        } else {
            iZzC = zzpv.zzC(i2);
            iZzj = ((zzpa) obj).zzj(zzsaVar);
            iZzC2 = zzpv.zzC(iZzj);
        }
        return iZzC + iZzC2 + iZzj;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iZzC = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzC += zzpv.zzC((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzC;
        }
        zzqn zzqnVar = (zzqn) list;
        int iZzC2 = 0;
        while (i < size) {
            int iZze = zzqnVar.zze(i);
            iZzC2 += zzpv.zzC((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzC2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int iZzD = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzD += zzpv.zzD((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzD;
        }
        zzre zzreVar = (zzre) list;
        int iZzD2 = 0;
        while (i < size) {
            long jZze = zzreVar.zze(i);
            iZzD2 += zzpv.zzD((jZze >> 63) ^ (jZze + jZze));
            i++;
        }
        return iZzD2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iZzC = 0;
            while (i < size) {
                iZzC += zzpv.zzC(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzC;
        }
        zzqn zzqnVar = (zzqn) list;
        int iZzC2 = 0;
        while (i < size) {
            iZzC2 += zzpv.zzC(zzqnVar.zze(i));
            i++;
        }
        return iZzC2;
    }

    public static int zzm(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int iZzD = 0;
            while (i < size) {
                iZzD += zzpv.zzD(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzD;
        }
        zzre zzreVar = (zzre) list;
        int iZzD2 = 0;
        while (i < size) {
            iZzD2 += zzpv.zzD(zzreVar.zze(i));
            i++;
        }
        return iZzD2;
    }

    public static zzsp zzn() {
        return zzb;
    }

    public static void zzo(zzqb zzqbVar, Object obj, Object obj2) {
        if (((zzqk) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzp(zzsp zzspVar, Object obj, Object obj2) {
        zzqm zzqmVar = (zzqm) obj;
        zzsq zzsqVarZze = zzqmVar.zzc;
        zzsq zzsqVar = ((zzqm) obj2).zzc;
        if (!zzsq.zzc().equals(zzsqVar)) {
            if (zzsq.zzc().equals(zzsqVarZze)) {
                zzsqVarZze = zzsq.zze(zzsqVarZze, zzsqVar);
            } else {
                zzsqVarZze.zzd(zzsqVar);
            }
        }
        zzqmVar.zzc = zzsqVarZze;
    }

    public static void zzq(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzc(i, list, z);
    }

    public static void zzr(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzg(i, list, z);
    }

    public static void zzs(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzi(i, list, z);
    }

    public static void zzt(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzk(i, list, z);
    }

    public static void zzu(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzm(i, list, z);
    }

    public static void zzv(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzo(i, list, z);
    }

    public static void zzw(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzr(i, list, z);
    }

    public static void zzx(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzt(i, list, z);
    }

    public static void zzy(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzy(i, list, z);
    }

    public static void zzz(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzA(i, list, z);
    }
}
