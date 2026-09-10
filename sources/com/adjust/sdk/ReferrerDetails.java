package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ReferrerDetails {
    public Boolean googlePlayInstant;
    public long installBeginTimestampSeconds;
    public long installBeginTimestampServerSeconds;
    public String installReferrer;
    public String installVersion;
    public Boolean isClick;
    public long referrerClickTimestampSeconds;
    public long referrerClickTimestampServerSeconds;

    public ReferrerDetails(String str, long j10, long j11, long j12, long j13, String str2, Boolean bool, Boolean bool2) {
        this.installReferrer = str;
        this.referrerClickTimestampSeconds = j10;
        this.installBeginTimestampSeconds = j11;
        this.referrerClickTimestampServerSeconds = j12;
        this.installBeginTimestampServerSeconds = j13;
        this.installVersion = str2;
        this.googlePlayInstant = bool;
        this.isClick = bool2;
    }

    public String toString() {
        return Util.formatString(" installReferrer : %s referrerClickTimestampSeconds : %d installBeginTimestampSeconds : %d referrerClickTimestampServerSeconds : %d installBeginTimestampServerSeconds : %d installVersion : %s googlePlayInstant : %s isClick: %s", this.installReferrer, Long.valueOf(this.referrerClickTimestampSeconds), Long.valueOf(this.installBeginTimestampSeconds), Long.valueOf(this.referrerClickTimestampServerSeconds), Long.valueOf(this.installBeginTimestampServerSeconds), this.installVersion, this.googlePlayInstant, this.isClick);
    }

    public ReferrerDetails(String str, long j10, long j11) {
        this(str, j10, j11, -1L, -1L, null, null, null);
    }

    public ReferrerDetails(String str, long j10, Boolean bool) {
        this(str, j10, -1L, -1L, -1L, null, null, bool);
    }
}
