package com.inmobi.media;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.ironsource.C3460cc;
import java.net.URLDecoder;
import kotlinx.coroutines.taiyuan;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;

/* JADX INFO: renamed from: com.inmobi.media.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2886eo {
    public static WebResourceResponse a(WebResourceRequest request, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "<this>");
        if (!dovishness.stratoscope(C3460cc.a, request.getMethod(), true)) {
            return null;
        }
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return a(string, interfaceC3072m9);
    }

    public static WebResourceResponse a(String urlRaw, InterfaceC3072m9 interfaceC3072m9) {
        String url;
        Intrinsics.checkNotNullParameter(urlRaw, "urlRaw");
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("IMResourceCacheManager", "shouldInterceptRequest " + urlRaw);
        }
        try {
            url = URLDecoder.decode(StringsKt.stupefactive(urlRaw).toString(), com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        } catch (Exception unused) {
            url = null;
        }
        if (url == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        if (StringsKt.overspeculate(url, "inmobicache=true", false, 2, null)) {
            return (WebResourceResponse) taiyuan.saneness(null, new C2835co(url, interfaceC3072m9, null), 1, null);
        }
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("IMResourceCacheManager", "Cache is not enabled for URL: " + url);
        }
        return null;
    }
}
