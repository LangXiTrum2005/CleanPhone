package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2949b7 {
    public static final EnumC2932a7 a(String logLevel) {
        Intrinsics.f(logLevel, "logLevel");
        if (logLevel.equalsIgnoreCase("DEBUG")) {
            return EnumC2932a7.DEBUG;
        }
        if (logLevel.equalsIgnoreCase("ERROR")) {
            return EnumC2932a7.ERROR;
        }
        if (logLevel.equalsIgnoreCase("INFO")) {
            return EnumC2932a7.INFO;
        }
        return logLevel.equalsIgnoreCase("STATE") ? EnumC2932a7.STATE : EnumC2932a7.ERROR;
    }
}
