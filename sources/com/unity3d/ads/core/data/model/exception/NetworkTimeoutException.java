package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/NetworkTimeoutException;", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "message", "", "type", "Lcom/unity3d/ads/core/data/model/OperationType;", "code", "", "url", "protocol", "cronetCode", "client", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/OperationType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class NetworkTimeoutException extends UnityAdsNetworkException {
    public /* synthetic */ NetworkTimeoutException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i10, g gVar) {
        this(str, (i10 & 2) != 0 ? OperationType.UNKNOWN : operationType, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkTimeoutException(String message, OperationType type, Integer num, String str, String str2, Integer num2, String str3) {
        super(message, type, num, str, str2, num2, str3);
        n.f(message, "message");
        n.f(type, "type");
    }
}
