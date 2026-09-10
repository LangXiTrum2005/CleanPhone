package com.google.android.gms.internal.play_billing;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Comparator;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbh implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzbq zzbqVar = (zzbq) obj;
        zzbq zzbqVar2 = (zzbq) obj2;
        zzbg zzbgVar = new zzbg(zzbqVar);
        zzbg zzbgVar2 = new zzbg(zzbqVar2);
        while (zzbgVar.hasNext() && zzbgVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzbgVar.zza() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED).compareTo(Integer.valueOf(zzbgVar2.zza() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzbqVar.zzd()).compareTo(Integer.valueOf(zzbqVar2.zzd()));
    }
}
