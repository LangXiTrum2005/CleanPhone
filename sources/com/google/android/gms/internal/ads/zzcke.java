package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class zzcke extends zzcjc {
    public zzcke(zzcir zzcirVar, zzbfj zzbfjVar, boolean z2, zzeif zzeifVar) {
        super(zzcirVar, zzbfjVar, z2, new zzbwc(zzcirVar, zzcirVar.zzK(), new zzbfr(zzcirVar.getContext())), null, zzeifVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zzac(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcir)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcir zzcirVar = (zzcir) webView;
        zzcbk zzcbkVar = this.zzb;
        if (zzcbkVar != null) {
            zzcbkVar.zze(str, map, 1);
        }
        zzfwj.zza();
        zzfwo zzfwoVar = zzfwo.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return zzL(str, map);
        }
        if (zzcirVar.zzP() != null) {
            zzcirVar.zzP().zzN();
        }
        if (zzcirVar.zzN().zzg()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzav);
        } else if (zzcirVar.zzW()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzau);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzat);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzB(zzcirVar.getContext(), zzcirVar.zzs().afmaVersion, str2);
    }
}
