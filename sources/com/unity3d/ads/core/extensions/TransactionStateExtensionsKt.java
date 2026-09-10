package com.unity3d.ads.core.extensions;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"fromPurchaseState", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "state", "", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class TransactionStateExtensionsKt {
    public static final TransactionEventRequestOuterClass.TransactionState fromPurchaseState(int i10) {
        if (i10 == 0) {
            return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PURCHASED;
        }
        if (i10 == 1) {
            return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_CANCELED;
        }
        if (i10 != 2) {
            return i10 != 4 ? TransactionEventRequestOuterClass.TransactionState.UNRECOGNIZED : TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_DEFERRED;
        }
        return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PENDING;
    }
}
