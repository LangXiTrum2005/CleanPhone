package com.applovin.shadow.okio;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-InflaterSourceExtensions, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"inflate", "Lcom/applovin/shadow/okio/InflaterSource;", "Lcom/applovin/shadow/okio/Source;", "inflater", "Ljava/util/zip/Inflater;", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InflaterSourceExtensions {
    public static final InflaterSource inflate(Source source, Inflater inflater) {
        n.f(source, "<this>");
        n.f(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inflater = new Inflater();
        }
        n.f(source, "<this>");
        n.f(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }
}
