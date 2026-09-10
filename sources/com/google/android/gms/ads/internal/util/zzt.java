package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.g30;
import com.google.android.gms.internal.ads.pj;
import com.google.android.gms.internal.ads.v30;
import com.google.android.gms.internal.ads.zl0;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class zzt extends zzz {
    @Override // com.google.android.gms.ads.internal.util.zzz
    @Nullable
    public final CookieManager zza(Context context) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (zzs.zzI()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to obtain CookieManager.", th2);
            com.google.android.gms.ads.internal.zzt.zzh().e("ApiLevelUtil.getCookieManager", th2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public g30 zzb(b30 b30Var, pj pjVar, boolean z10, @Nullable zl0 zl0Var) {
        return new v30(b30Var, pjVar, z10, zl0Var);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final WebResourceResponse zzc(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }
}
