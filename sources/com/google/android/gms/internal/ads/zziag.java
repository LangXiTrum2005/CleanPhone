package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zziag {
    private static final zziag zzd = new zziag(true);
    final zzidb zza = new zzicx();
    boolean zzb;
    boolean zzc;

    private zziag() {
    }

    public static zziag zza() {
        return zzd;
    }

    public static void zzf(zzhzw zzhzwVar, zzids zzidsVar, int i2, Object obj) throws IOException {
        if (zzidsVar == zzids.zzj) {
            zzhzwVar.zzJ(i2, 3);
            ((zzicc) obj).zzcX(zzhzwVar);
            zzhzwVar.zzJ(i2, 4);
            return;
        }
        zzhzwVar.zzJ(i2, zzidsVar.zzb());
        zzidt zzidtVar = zzidt.INT;
        switch (zzidsVar.ordinal()) {
            case 0:
                zzhzwVar.zzv(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzhzwVar.zzt(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzhzwVar.zzu(((Long) obj).longValue());
                break;
            case 3:
                zzhzwVar.zzu(((Long) obj).longValue());
                break;
            case 4:
                zzhzwVar.zzr(((Integer) obj).intValue());
                break;
            case 5:
                zzhzwVar.zzv(((Long) obj).longValue());
                break;
            case 6:
                zzhzwVar.zzt(((Integer) obj).intValue());
                break;
            case 7:
                zzhzwVar.zzq(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzhzl)) {
                    zzhzwVar.zzx((String) obj);
                } else {
                    zzhzwVar.zzl((zzhzl) obj);
                }
                break;
            case 9:
                ((zzicc) obj).zzcX(zzhzwVar);
                break;
            case 10:
                zzhzwVar.zzp((zzicc) obj);
                break;
            case 11:
                if (!(obj instanceof zzhzl)) {
                    byte[] bArr = (byte[]) obj;
                    zzhzwVar.zzm(bArr, 0, bArr.length);
                } else {
                    zzhzwVar.zzl((zzhzl) obj);
                }
                break;
            case 12:
                zzhzwVar.zzs(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zziav)) {
                    zzhzwVar.zzr(((Integer) obj).intValue());
                } else {
                    zzhzwVar.zzr(((zziav) obj).zza());
                }
                break;
            case 14:
                zzhzwVar.zzt(((Integer) obj).intValue());
                break;
            case 15:
                zzhzwVar.zzv(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzhzwVar.zzs((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzhzwVar.zzu((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int zzh(zzids zzidsVar, int i2, Object obj) {
        int iZzA = zzhzw.zzA(i2 << 3);
        if (zzidsVar == zzids.zzj) {
            iZzA += iZzA;
        }
        return iZzA + zzi(zzidsVar, obj);
    }

    public static int zzi(zzids zzidsVar, Object obj) {
        int iZzc;
        int iZzA;
        zzids zzidsVar2 = zzids.zza;
        zzidt zzidtVar = zzidt.INT;
        switch (zzidsVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i2 = zzhzw.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i3 = zzhzw.zzf;
                return 4;
            case 2:
                return zzhzw.zzB(((Long) obj).longValue());
            case 3:
                return zzhzw.zzB(((Long) obj).longValue());
            case 4:
                return zzhzw.zzB(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i4 = zzhzw.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i5 = zzhzw.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i6 = zzhzw.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzhzl)) {
                    return zzhzw.zzC((String) obj);
                }
                int i7 = zzhzw.zzf;
                iZzc = ((zzhzl) obj).zzc();
                iZzA = zzhzw.zzA(iZzc);
                break;
                break;
            case 9:
                return ((zzicc) obj).zzbr();
            case 10:
                if (!(obj instanceof zzibl)) {
                    return zzhzw.zzD((zzicc) obj);
                }
                iZzc = ((zzibl) obj).zzb();
                iZzA = zzhzw.zzA(iZzc);
                break;
                break;
            case 11:
                if (!(obj instanceof zzhzl)) {
                    int i8 = zzhzw.zzf;
                    iZzc = ((byte[]) obj).length;
                    iZzA = zzhzw.zzA(iZzc);
                } else {
                    int i9 = zzhzw.zzf;
                    iZzc = ((zzhzl) obj).zzc();
                    iZzA = zzhzw.zzA(iZzc);
                }
                break;
            case 12:
                return zzhzw.zzA(((Integer) obj).intValue());
            case 13:
                return obj instanceof zziav ? zzhzw.zzB(((zziav) obj).zza()) : zzhzw.zzB(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i10 = zzhzw.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i11 = zzhzw.zzf;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzhzw.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzhzw.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzA + iZzc;
    }

    public static int zzj(zziaf zziafVar, Object obj) {
        zzids zzidsVarZzb = zziafVar.zzb();
        int iZza = zziafVar.zza();
        if (!zziafVar.zzd()) {
            return zzh(zzidsVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (!zziafVar.zze()) {
            int iZzh = 0;
            while (i2 < size) {
                iZzh += zzh(zzidsVarZzb, iZza, list.get(i2));
                i2++;
            }
            return iZzh;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzi = 0;
        while (i2 < size) {
            iZzi += zzi(zzidsVarZzb, list.get(i2));
            i2++;
        }
        return zzhzw.zzA(iZzi) + zzhzw.zzA(iZza << 3) + iZzi;
    }

    private static boolean zzk(Map.Entry entry) {
        zziaf zziafVar = (zziaf) entry.getKey();
        if (zziafVar.zzc() != zzidt.MESSAGE) {
            return true;
        }
        if (!zziafVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!zzl(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzicd) {
            return ((zzicd) obj).zzbi();
        }
        if (obj instanceof zzibl) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i2;
        int iZzA;
        int iZzD;
        zziaf zziafVar = (zziaf) entry.getKey();
        Object value = entry.getValue();
        if (zziafVar.zzc() != zzidt.MESSAGE || zziafVar.zzd() || zziafVar.zze()) {
            return zzj(zziafVar, value);
        }
        if (value instanceof zzibl) {
            int iZza = ((zziaf) entry.getKey()).zza();
            int iZzA2 = zzhzw.zzA(8);
            i2 = iZzA2 + iZzA2;
            iZzA = zzhzw.zzA(iZza) + zzhzw.zzA(16);
            int iZzA3 = zzhzw.zzA(24);
            int iZzb = ((zzibl) value).zzb();
            iZzD = Z.b(iZzb, iZzb, iZzA3);
        } else {
            int iZza2 = ((zziaf) entry.getKey()).zza();
            int iZzA4 = zzhzw.zzA(8);
            i2 = iZzA4 + iZzA4;
            iZzA = zzhzw.zzA(iZza2) + zzhzw.zzA(16);
            iZzD = zzhzw.zzD((zzicc) value) + zzhzw.zzA(24);
        }
        return i2 + iZzA + iZzD;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[RETURN] */
    private static final void zzn(zziaf zziafVar, Object obj) {
        boolean z2;
        zziafVar.zzb();
        byte[] bArr = zzibe.zzb;
        obj.getClass();
        zzids zzidsVar = zzids.zza;
        zzidt zzidtVar = zzidt.INT;
        switch (r0.zza()) {
            case INT:
                z2 = obj instanceof Integer;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziafVar.zza()), zziafVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z2 = obj instanceof Long;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziafVar.zza()), zziafVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z2 = obj instanceof Float;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziafVar.zza()), zziafVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z2 = obj instanceof Double;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziafVar.zza()), zziafVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziafVar.zza()), zziafVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z2 = obj instanceof String;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziafVar.zza()), zziafVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzhzl) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziafVar.zza()), zziafVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zziav)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziafVar.zza()), zziafVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzicc) || (obj instanceof zzibl)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziafVar.zza()), zziafVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziafVar.zza()), zziafVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zziag zziagVar = new zziag();
        zzidb zzidbVar = this.zza;
        int iZzc = zzidbVar.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Map.Entry entryZzd = zzidbVar.zzd(i2);
            zziagVar.zzd((zziaf) ((zzicy) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzidbVar.zze()) {
            zziagVar.zzd((zziaf) entry.getKey(), entry.getValue());
        }
        zziagVar.zzc = this.zzc;
        return zziagVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zziag) {
            return this.zza.equals(((zziag) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzidb zzidbVar = this.zza;
        int iZzc = zzidbVar.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Object value = zzidbVar.zzd(i2).getValue();
            if (value instanceof zziar) {
                ((zziar) value).zzbm();
            }
        }
        Iterator it = zzidbVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zziar) {
                ((zziar) value2).zzbm();
            }
        }
        zzidbVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzidb zzidbVar = this.zza;
        if (zzidbVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzc ? new zzibk(zzidbVar.entrySet().iterator()) : zzidbVar.entrySet().iterator();
    }

    public final void zzd(zziaf zziafVar, Object obj) {
        if (!zziafVar.zzd()) {
            zzn(zziafVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                zzn(zziafVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzibl) {
            this.zzc = true;
        }
        this.zza.put(zziafVar, obj);
    }

    public final boolean zze() {
        zzidb zzidbVar = this.zza;
        int iZzc = zzidbVar.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            if (!zzk(zzidbVar.zzd(i2))) {
                return false;
            }
        }
        Iterator it = zzidbVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzidb zzidbVar = this.zza;
        int iZzc = zzidbVar.zzc();
        int iZzm = 0;
        for (int i2 = 0; i2 < iZzc; i2++) {
            iZzm += zzm(zzidbVar.zzd(i2));
        }
        Iterator it = zzidbVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    private zziag(boolean z2) {
        zzb();
        zzb();
    }
}
