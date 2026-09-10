package com.unity3d.ads.core.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/data/model/OperationType;", "", "(Ljava/lang/String;I)V", InAppPurchaseConstants.METHOD_TO_STRING, "", "UNKNOWN", "INITIALIZATION", "LOAD", "LOAD_HEADER_BIDDING", "SHOW", "REFRESH", "PRIVACY_UPDATE", "INITIALIZATION_COMPLETED", "TRANSACTION_EVENT", "AD_REVENUE_EVENT", "LIFECYCLE_EVENT", "GET_TOKEN", "DIAGNOSTIC_EVENT", "OPERATIVE_EVENT", "UNIVERSAL_EVENT", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public enum OperationType {
    UNKNOWN,
    INITIALIZATION,
    LOAD,
    LOAD_HEADER_BIDDING,
    SHOW,
    REFRESH,
    PRIVACY_UPDATE,
    INITIALIZATION_COMPLETED,
    TRANSACTION_EVENT,
    AD_REVENUE_EVENT,
    LIFECYCLE_EVENT,
    GET_TOKEN,
    DIAGNOSTIC_EVENT,
    OPERATIVE_EVENT,
    UNIVERSAL_EVENT;

    @Override // java.lang.Enum
    public String toString() {
        String string = super.toString();
        Locale locale = Locale.getDefault();
        n.e(locale, "getDefault()");
        String lowerCase = string.toLowerCase(locale);
        n.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
