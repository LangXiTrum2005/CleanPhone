package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final int f38;

    ISAdQualityLogLevel(int i10) {
        this.f38 = i10;
    }

    @Deprecated
    public static ISAdQualityLogLevel fromInt(int i10) {
        if (i10 == 0) {
            return NONE;
        }
        if (i10 == 1) {
            return ERROR;
        }
        if (i10 == 2) {
            return WARNING;
        }
        if (i10 == 3) {
            return INFO;
        }
        if (i10 == 4) {
            return DEBUG;
        }
        if (i10 != 5) {
            return null;
        }
        return VERBOSE;
    }

    @Deprecated
    public final int getValue() {
        return this.f38;
    }

    @Deprecated
    public final boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i10 = this.f38;
        return i10 != NONE.f38 && i10 >= iSAdQualityLogLevel.f38;
    }
}
