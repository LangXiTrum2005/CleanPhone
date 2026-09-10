package com.unity3d.ads.core.extensions;

import an.a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.net.URLConnection;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import lo.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"getSHA256Hash", "", "guessMimeType", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class StringExtensionsKt {
    public static final String getSHA256Hash(String str) {
        n.f(str, "<this>");
        byte[] bytes = str.getBytes(a.f3768a);
        n.e(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] data = Arrays.copyOf(bytes, bytes.length);
        h hVar = h.f45638d;
        n.f(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        n.e(bArrCopyOf, "copyOf(this, size)");
        String strG = new h(bArrCopyOf).a("SHA-256").g();
        n.e(strG, "bytes.sha256().hex()");
        return strG;
    }

    public static final String guessMimeType(String str) {
        n.f(str, "<this>");
        return URLConnection.guessContentTypeFromName(str);
    }
}
