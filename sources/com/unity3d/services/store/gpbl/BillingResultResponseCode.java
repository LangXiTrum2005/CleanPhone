package com.unity3d.services.store.gpbl;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum BillingResultResponseCode {
    UNKNOWN(-100),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    NETWORK_ERROR(12);

    private final int _responseCode;

    BillingResultResponseCode(int i10) {
        this._responseCode = i10;
    }

    @NonNull
    public static BillingResultResponseCode fromResponseCode(int i10) {
        for (BillingResultResponseCode billingResultResponseCode : values()) {
            if (billingResultResponseCode.getResponseCode() == i10) {
                return billingResultResponseCode;
            }
        }
        return UNKNOWN;
    }

    public int getResponseCode() {
        return this._responseCode;
    }
}
