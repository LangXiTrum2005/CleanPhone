package com.unity3d.services;

import ak.a;
import ak.k;
import cn.x;
import cn.y;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/unity3d/services/SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1", "Lak/a;", "Lcn/y;", "Lak/k;", "context", "", "exception", "Lwj/r;", "handleException", "(Lak/k;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1 extends a implements y {
    public SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1(x xVar) {
        super(xVar);
    }

    @Override // cn.y
    public void handleException(k context, Throwable exception) {
        DeviceLog.error("SDKErrorHandler encountered an exception: %s", exception);
    }
}
