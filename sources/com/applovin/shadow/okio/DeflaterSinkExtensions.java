package com.applovin.shadow.okio;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeflaterSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"deflate", "Lcom/applovin/shadow/okio/DeflaterSink;", "Lcom/applovin/shadow/okio/Sink;", "deflater", "Ljava/util/zip/Deflater;", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class DeflaterSinkExtensions {
    public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
        n.f(sink, "<this>");
        n.f(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deflater = new Deflater();
        }
        n.f(sink, "<this>");
        n.f(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
