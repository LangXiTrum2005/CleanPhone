package com.adjust.sdk.meta;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MetaInstallReferrerDetails {
    public long actualTimestampInSec;
    public String installReferrer;
    public boolean isClick;

    public MetaInstallReferrerDetails(String str, long j10, boolean z10) {
        this.installReferrer = str;
        this.actualTimestampInSec = j10;
        this.isClick = z10;
    }

    public String toString() {
        return com.adjust.sdk.Util.formatString(" installReferrer : %s actualTimestampInSec : %d isClick : %b", this.installReferrer, Long.valueOf(this.actualTimestampInSec), Boolean.valueOf(this.isClick));
    }
}
