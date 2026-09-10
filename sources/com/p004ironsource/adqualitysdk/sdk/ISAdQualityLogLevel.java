package com.p004ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes5.dex */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final int f48;

    ISAdQualityLogLevel(int i2) {
        this.f48 = i2;
    }

    public static ISAdQualityLogLevel fromInt(int i2) {
        if (i2 == 0) {
            return NONE;
        }
        if (i2 == 1) {
            return ERROR;
        }
        if (i2 == 2) {
            return WARNING;
        }
        if (i2 == 3) {
            return INFO;
        }
        if (i2 == 4) {
            return DEBUG;
        }
        if (i2 != 5) {
            return null;
        }
        return VERBOSE;
    }

    public final int getValue() {
        return this.f48;
    }

    public final boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i2 = this.f48;
        return i2 != NONE.f48 && i2 >= iSAdQualityLogLevel.f48;
    }
}
