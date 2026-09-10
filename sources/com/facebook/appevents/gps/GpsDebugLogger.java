package com.facebook.appevents.gps;

import an.h;
import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.InternalAppEventsLogger;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import nk.d;
import nk.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/gps/GpsDebugLogger;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", X3.i.f27798j0, "", "isGPSDebugEvent", "(Ljava/lang/String;)Z", "Landroid/os/Bundle;", "parameters", "Lwj/r;", "log", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Lcom/facebook/appevents/InternalAppEventsLogger;", "internalAppEventsLogger", "Lcom/facebook/appevents/InternalAppEventsLogger;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class GpsDebugLogger {
    private static final String GPS_PREFIX = "gps";
    private static final double LOGGING_SAMPLING_RATE = 1.0E-4d;
    private static final boolean shouldLog;
    private final InternalAppEventsLogger internalAppEventsLogger;

    static {
        d dVar = e.f46785a;
        shouldLog = e.f46786b.i().nextDouble() <= LOGGING_SAMPLING_RATE;
    }

    public GpsDebugLogger(Context context) {
        n.f(context, "context");
        this.internalAppEventsLogger = new InternalAppEventsLogger(context);
    }

    private final boolean isGPSDebugEvent(String eventName) {
        if (eventName != null) {
            return h.q0(eventName, GPS_PREFIX, false);
        }
        return false;
    }

    public final void log(String eventName, Bundle parameters) {
        if (shouldLog && isGPSDebugEvent(eventName)) {
            this.internalAppEventsLogger.logEventImplicitly(eventName, parameters);
        }
    }
}
