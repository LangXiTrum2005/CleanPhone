package com.unity3d.ads.core.domain.work;

import d5.f;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/work/UniversalRequestWorkerData;", "", "", UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID, "<init>", "(Ljava/lang/String;)V", "Ld5/f;", "invoke", "()Ld5/f;", "Ljava/lang/String;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UniversalRequestWorkerData {
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    private final String universalRequestId;

    public UniversalRequestWorkerData(String universalRequestId) {
        n.f(universalRequestId, "universalRequestId");
        this.universalRequestId = universalRequestId;
    }

    public final f invoke() throws Throwable {
        HashMap map = new HashMap();
        map.put(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId);
        f fVar = new f(map);
        f.c(fVar);
        return fVar;
    }
}
