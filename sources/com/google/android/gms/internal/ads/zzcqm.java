package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.applovin.impl.Z;
import com.p004ironsource.dc;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcqm implements zzcpq {
    private final CookieManager zza;

    public zzcqm(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzf().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcpq
    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbs), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbs);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listZze = zzgqp.zza(zzgpo.zzc(';')).zze(cookie);
            for (int i2 = 0; i2 < listZze.size(); i2++) {
                Iterator it = zzgqp.zza(zzgpo.zzc(dc.T)).zzd((String) listZze.get(i2)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    throw new IndexOutOfBoundsException(Z.n(new StringBuilder(String.valueOf(0).length() + 70), "position (0) must be less than the number of elements that remained (", 0, ")"));
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbe))));
            }
        }
    }
}
