package com.unity3d.ads.core.domain;

import an.h;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAssetFileName;", "", "()V", "invoke", "", "url", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class GetAssetFileName {
    public final String invoke(String url) {
        n.f(url, "url");
        String strP0 = h.P0(url, '?');
        String strN0 = h.N0('.', h.N0('/', strP0, strP0), "");
        if (h.y0(strN0)) {
            return StringExtensionsKt.getSHA256Hash(url);
        }
        return StringExtensionsKt.getSHA256Hash(url) + '.' + strN0;
    }
}
