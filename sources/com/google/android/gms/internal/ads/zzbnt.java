package com.google.android.gms.internal.ads;

import android.content.Context;
import com.p004ironsource.d9;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbnt implements zzbnn {
    private final Context zza;
    private final Map zzb;

    public zzbnt(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zza(Object obj, Map map) {
        byte b2;
        zzcbw zzcbwVarZzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.zza;
        if (zzcbwVarZzD.zza(context)) {
            String str = (String) map.get(d9.h.j0);
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("_ac")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("_aa")) {
                b2 = 2;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                com.google.android.gms.ads.internal.zzt.zzD().zzk(context, str2, (Map) this.zzb.get("_ac"));
            } else if (b2 == 1) {
                com.google.android.gms.ads.internal.zzt.zzD().zzl(context, str2, (Map) this.zzb.get("_ai"));
            } else if (b2 == 2) {
                com.google.android.gms.ads.internal.zzt.zzD().zzn(context, str2);
            } else {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("logScionEvent gmsg contained unsupported eventName");
            }
        }
    }
}
