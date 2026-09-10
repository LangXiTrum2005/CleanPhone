package com.unity3d.services.core.properties;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/properties/SessionIdReader;", "", "()V", JsonStorageKeyNames.SESSION_ID_KEY, "", "getSessionId", "()Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class SessionIdReader {
    public static final SessionIdReader INSTANCE = new SessionIdReader();
    private static final String sessionId;

    static {
        String string = UUID.randomUUID().toString();
        n.e(string, "randomUUID().toString()");
        sessionId = string;
    }

    private SessionIdReader() {
    }

    public final String getSessionId() {
        return sessionId;
    }
}
