package com.p004ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes5.dex */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final int f44;

    ISAdQualityDeviceIdType(int i2) {
        this.f44 = i2;
    }

    public static ISAdQualityDeviceIdType fromInt(int i2) {
        if (i2 == 0) {
            return NONE;
        }
        if (i2 == 1) {
            return GAID;
        }
        if (i2 != 2) {
            return null;
        }
        return IDFA;
    }

    public final int getValue() {
        return this.f44;
    }
}
