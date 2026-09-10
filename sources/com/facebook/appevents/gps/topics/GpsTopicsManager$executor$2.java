package com.facebook.appevents.gps.topics;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class GpsTopicsManager$executor$2 extends o implements a {
    public static final GpsTopicsManager$executor$2 INSTANCE = new GpsTopicsManager$executor$2();

    public GpsTopicsManager$executor$2() {
        super(0);
    }

    @Override // jk.a
    public final ExecutorService invoke() {
        return Executors.newCachedThreadPool();
    }
}
