package com.inmobi.media;

import android.webkit.WebResourceResponse;
import java.net.URLDecoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class qf {
    public static WebResourceResponse a(String urlRaw, InterfaceC3333z5 interfaceC3333z5) {
        String strDecode;
        Intrinsics.f(urlRaw, "urlRaw");
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("IMResourceCacheManager", AbstractC3041h0.a("shouldInterceptRequest ", urlRaw));
        }
        try {
            strDecode = URLDecoder.decode(StringsKt.a0(urlRaw).toString(), "UTF-8");
        } catch (Exception unused) {
            strDecode = null;
        }
        if (strDecode != null) {
            if (StringsKt.l(strDecode, "inmobicache=true", false)) {
                return sf.f23987a.a(strDecode, interfaceC3333z5);
            }
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("IMResourceCacheManager", "Cache is not enabled for URL: ".concat(strDecode));
            }
        }
        return null;
    }
}
