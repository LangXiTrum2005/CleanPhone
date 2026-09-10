package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final int f34;

    ISAdQualityDeviceIdType(int i10) {
        this.f34 = i10;
    }

    @Deprecated
    public static ISAdQualityDeviceIdType fromInt(int i10) {
        if (i10 == 0) {
            return NONE;
        }
        if (i10 == 1) {
            return GAID;
        }
        if (i10 != 2) {
            return null;
        }
        return IDFA;
    }

    @Deprecated
    public final int getValue() {
        return this.f34;
    }
}
