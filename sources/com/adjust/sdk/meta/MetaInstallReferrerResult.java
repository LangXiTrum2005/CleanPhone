package com.adjust.sdk.meta;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MetaInstallReferrerResult {
    public String error;
    public MetaInstallReferrerDetails metaInstallReferrerDetails;

    public MetaInstallReferrerResult(MetaInstallReferrerDetails metaInstallReferrerDetails) {
        this.metaInstallReferrerDetails = metaInstallReferrerDetails;
    }

    public MetaInstallReferrerResult(String str) {
        this.error = str;
    }
}
