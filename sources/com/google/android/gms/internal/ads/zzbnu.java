package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import com.p004ironsource.d9;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbnu implements zzbnn {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbvx zzc;
    private final zzbwe zzd;

    public zzbnu(com.google.android.gms.ads.internal.zzb zzbVar, zzbvx zzbvxVar, zzbwe zzbweVar) {
        this.zzb = zzbVar;
        this.zzc = zzbvxVar;
        this.zzd = zzbweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcir zzcirVar = (zzcir) obj;
        int iIntValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i2 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (!zzbVar.zzb()) {
                    zzbVar.zzc(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zza(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbwa(zzcirVar, map).zza();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbvu(zzcirVar, map).zza();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (iIntValue != 7) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z2 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcirVar == null) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView is null");
            return;
        }
        if (d9.h.D.equalsIgnoreCase(str)) {
            i2 = 7;
        } else if (!d9.h.C.equalsIgnoreCase(str)) {
            i2 = z2 ? -1 : 14;
        }
        zzcirVar.zzam(i2);
    }
}
