package com.unity3d.ads.core.data.model.exception;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/LoadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", IronSourceConstants.EVENTS_ERROR_CODE, "", "message", "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class LoadException extends Exception {
    private final int errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadException(int i10, String message) {
        super(message);
        n.f(message, "message");
        this.errorCode = i10;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
