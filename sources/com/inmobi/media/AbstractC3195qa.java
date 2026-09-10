package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3195qa {
    public static final EnumC3179pa a(byte b2) {
        if (b2 == 1) {
            return EnumC3179pa.PORTRAIT;
        }
        if (b2 == 2) {
            return EnumC3179pa.REVERSE_PORTRAIT;
        }
        if (b2 == 3) {
            return EnumC3179pa.LANDSCAPE;
        }
        return b2 == 4 ? EnumC3179pa.REVERSE_LANDSCAPE : EnumC3179pa.PORTRAIT;
    }

    public static final boolean b(EnumC3179pa enumC3179pa) {
        Intrinsics.f(enumC3179pa, "<this>");
        return enumC3179pa == EnumC3179pa.LANDSCAPE || enumC3179pa == EnumC3179pa.REVERSE_LANDSCAPE;
    }

    public static final int a(EnumC3179pa enumC3179pa) {
        Intrinsics.f(enumC3179pa, "<this>");
        int iOrdinal = enumC3179pa.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 90;
        }
        if (iOrdinal == 2) {
            return 180;
        }
        if (iOrdinal == 3) {
            return 270;
        }
        throw new NoWhenBranchMatchedException();
    }
}
