package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzecj implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzecj(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzecj zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzecj(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        zzfmu zzfmuVar = (zzfmu) this.zza.zzb();
        final CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzt.zzf().zza((Context) this.zzb.zzb());
        zzfmo zzfmoVar = zzfmo.WEBVIEW_COOKIE;
        Objects.requireNonNull(zzfmuVar);
        return zzfmf.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzece
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                CookieManager cookieManager = cookieManagerZza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbs));
            }
        }, zzfmoVar, zzfmuVar).zzh(1L, TimeUnit.SECONDS).zzf(Exception.class, zzecb.zza).zzi();
    }
}
