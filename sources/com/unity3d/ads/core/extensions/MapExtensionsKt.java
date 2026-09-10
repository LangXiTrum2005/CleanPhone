package com.unity3d.ads.core.extensions;

import an.a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"sizeInKb", "", "", "", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class MapExtensionsKt {
    public static final int sizeInKb(Map<String, String> map) {
        n.f(map, "<this>");
        Iterator<T> it = map.entrySet().iterator();
        int length = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Charset charset = a.f3768a;
            byte[] bytes = str.getBytes(charset);
            n.e(bytes, "this as java.lang.String).getBytes(charset)");
            int length2 = bytes.length;
            byte[] bytes2 = str2.getBytes(charset);
            n.e(bytes2, "this as java.lang.String).getBytes(charset)");
            length += length2 + bytes2.length;
        }
        return length / 1024;
    }
}
