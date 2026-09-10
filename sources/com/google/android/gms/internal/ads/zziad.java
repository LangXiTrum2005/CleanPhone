package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zziad extends zziac {
    @Override // com.google.android.gms.internal.ads.zziac
    public final void zza(Object obj) {
        ((zzian) obj).zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziac
    public final void zzb(zzidu zziduVar, Map.Entry entry) throws IOException {
        zziao zziaoVar = (zziao) entry.getKey();
        if (!zziaoVar.zzc) {
            zzids zzidsVar = zzids.zza;
            switch (zziaoVar.zzb.ordinal()) {
                case 0:
                    zziduVar.zzf(zziaoVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    zziduVar.zze(zziaoVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    zziduVar.zzc(zziaoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    zziduVar.zzh(zziaoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    zziduVar.zzi(zziaoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    zziduVar.zzj(zziaoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    zziduVar.zzk(zziaoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    zziduVar.zzl(zziaoVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    zziduVar.zzm(zziaoVar.zza, (String) entry.getValue());
                    break;
                case 9:
                    zziduVar.zzs(zziaoVar.zza, entry.getValue(), zzicm.zza().zzb(entry.getValue().getClass()));
                    break;
                case 10:
                    zziduVar.zzr(zziaoVar.zza, entry.getValue(), zzicm.zza().zzb(entry.getValue().getClass()));
                    break;
                case 11:
                    zziduVar.zzn(zziaoVar.zza, (zzhzl) entry.getValue());
                    break;
                case 12:
                    zziduVar.zzo(zziaoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    zziduVar.zzi(zziaoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    zziduVar.zzb(zziaoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    zziduVar.zzd(zziaoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    zziduVar.zzp(zziaoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    zziduVar.zzq(zziaoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzids zzidsVar2 = zzids.zza;
        switch (zziaoVar.zzb.ordinal()) {
            case 0:
                zzicw.zza(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 1:
                zzicw.zzb(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 2:
                zzicw.zzc(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 3:
                zzicw.zzd(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 4:
                zzicw.zzh(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 5:
                zzicw.zzf(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 6:
                zzicw.zzk(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 7:
                zzicw.zzn(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 8:
                zzicw.zzo(zziaoVar.zza, (List) entry.getValue(), zziduVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzicw.zzr(zziaoVar.zza, (List) entry.getValue(), zziduVar, zzicm.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzicw.zzq(zziaoVar.zza, (List) entry.getValue(), zziduVar, zzicm.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzicw.zzp(zziaoVar.zza, (List) entry.getValue(), zziduVar);
                break;
            case 12:
                zzicw.zzi(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 13:
                zzicw.zzh(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 14:
                zzicw.zzl(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 15:
                zzicw.zzg(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 16:
                zzicw.zzj(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
            case 17:
                zzicw.zze(zziaoVar.zza, (List) entry.getValue(), zziduVar, zziaoVar.zzd);
                break;
        }
    }
}
