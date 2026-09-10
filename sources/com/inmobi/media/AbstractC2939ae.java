package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2939ae {
    public static final short a(EnumC3157o4 errorCode) {
        Intrinsics.f(errorCode, "errorCode");
        int iOrdinal = errorCode.ordinal();
        if (iOrdinal == 0) {
            return (short) 2122;
        }
        if (iOrdinal == 18) {
            return (short) 2229;
        }
        switch (iOrdinal) {
            case 12:
                return (short) 2123;
            case 13:
                return (short) 2124;
            case 14:
                return (short) 2125;
            case 15:
                return (short) 2126;
            case 16:
                return (short) 2127;
            default:
                return (short) 2122;
        }
    }
}
