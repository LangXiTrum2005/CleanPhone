package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class LicenseData {
    private final int responseCode;
    private final String signature;
    private final String signedData;

    public LicenseData(String str, String str2, int i10) {
        this.signedData = str;
        this.signature = str2;
        this.responseCode = i10;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSignedData() {
        return this.signedData;
    }

    public boolean isValid() {
        String str = this.signedData;
        return (str == null || this.signature == null || str.isEmpty() || this.signature.isEmpty()) ? false : true;
    }
}
