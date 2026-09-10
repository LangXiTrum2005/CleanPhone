package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzahd extends zzahf {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzahd() {
        super(new zzael());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzer zzerVar) {
        return Double.valueOf(Double.longBitsToDouble(zzerVar.zzD()));
    }

    private static String zzh(zzer zzerVar) {
        int iZzt = zzerVar.zzt();
        int iZzg = zzerVar.zzg();
        zzerVar.zzk(iZzt);
        return new String(zzerVar.zzi(), iZzg, iZzt);
    }

    private static HashMap zzi(zzer zzerVar) {
        int iZzH = zzerVar.zzH();
        HashMap map = new HashMap(iZzH);
        for (int i2 = 0; i2 < iZzH; i2++) {
            String strZzh = zzh(zzerVar);
            Object objZzj = zzj(zzerVar, zzerVar.zzs());
            if (objZzj != null) {
                map.put(strZzh, objZzj);
            }
        }
        return map;
    }

    private static Object zzj(zzer zzerVar, int i2) {
        if (i2 == 0) {
            return zzg(zzerVar);
        }
        if (i2 == 1) {
            return Boolean.valueOf(zzerVar.zzs() == 1);
        }
        if (i2 == 2) {
            return zzh(zzerVar);
        }
        if (i2 != 3) {
            if (i2 == 8) {
                return zzi(zzerVar);
            }
            if (i2 != 10) {
                if (i2 != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzerVar).doubleValue());
                zzerVar.zzk(2);
                return date;
            }
            int iZzH = zzerVar.zzH();
            ArrayList arrayList = new ArrayList(iZzH);
            for (int i3 = 0; i3 < iZzH; i3++) {
                Object objZzj = zzj(zzerVar, zzerVar.zzs());
                if (objZzj != null) {
                    arrayList.add(objZzj);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strZzh = zzh(zzerVar);
            int iZzs = zzerVar.zzs();
            if (iZzs == 9) {
                return map;
            }
            Object objZzj2 = zzj(zzerVar, iZzs);
            if (objZzj2 != null) {
                map.put(strZzh, objZzj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final boolean zza(zzer zzerVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final boolean zzb(zzer zzerVar, long j) {
        if (zzerVar.zzs() == 2 && "onMetaData".equals(zzh(zzerVar)) && zzerVar.zzd() != 0 && zzerVar.zzs() == 8) {
            HashMap mapZzi = zzi(zzerVar);
            Object obj = mapZzi.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.zzb = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapZzi.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        Object obj5 = list.get(i2);
                        Object obj6 = list2.get(i2);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i2] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzc;
    }

    public final long[] zze() {
        return this.zzd;
    }
}
