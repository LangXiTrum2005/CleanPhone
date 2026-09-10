package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbgl {
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbhu.zzd("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbih.zza);
        zzc(arrayList, zzbih.zzb);
        zzc(arrayList, zzbih.zzc);
        zzc(arrayList, zzbih.zzd);
        zzc(arrayList, zzbih.zze);
        zzc(arrayList, zzbih.zzu);
        zzc(arrayList, zzbih.zzf);
        zzc(arrayList, zzbih.zzm);
        zzc(arrayList, zzbih.zzn);
        zzc(arrayList, zzbih.zzo);
        zzc(arrayList, zzbih.zzp);
        zzc(arrayList, zzbih.zzq);
        zzc(arrayList, zzbih.zzr);
        zzc(arrayList, zzbih.zzs);
        zzc(arrayList, zzbih.zzt);
        zzc(arrayList, zzbih.zzg);
        zzc(arrayList, zzbih.zzh);
        zzc(arrayList, zzbih.zzi);
        zzc(arrayList, zzbih.zzj);
        zzc(arrayList, zzbih.zzk);
        zzc(arrayList, zzbih.zzl);
        return arrayList;
    }

    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbiw.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbhu zzbhuVar) {
        String str = (String) zzbhuVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
