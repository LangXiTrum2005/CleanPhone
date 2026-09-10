package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfiq {
    public static com.google.android.gms.ads.internal.client.zzr zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfhs zzfhsVar = (zzfhs) it.next();
            if (zzfhsVar.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfhsVar.zza, zzfhsVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzr(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfhs zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzi ? new zzfhs(-3, 0, true) : new zzfhs(zzrVar.zze, zzrVar.zzb, false);
    }
}
