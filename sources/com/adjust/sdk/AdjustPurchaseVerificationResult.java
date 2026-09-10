package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustPurchaseVerificationResult {
    private final int code;
    private final String message;
    private final String verificationStatus;

    public AdjustPurchaseVerificationResult(String str, int i10, String str2) {
        this.verificationStatus = str;
        this.code = i10;
        this.message = str2;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getVerificationStatus() {
        return this.verificationStatus;
    }
}
