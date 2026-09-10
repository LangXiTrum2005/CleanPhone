package com.ironsource;

import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3728re {
    private static Boolean b;
    public static final C3728re a = new C3728re();
    private static EnumC3712qe c = EnumC3712qe.NOT_INIT;

    private C3728re() {
    }

    public final synchronized EnumC3712qe a() {
        return c;
    }

    public final EnumC3712qe b() {
        Boolean bool = b;
        if (bool == null ? true : Intrinsics.wireman(bool, Boolean.FALSE)) {
            return EnumC3712qe.NOT_INIT;
        }
        if (Intrinsics.wireman(bool, Boolean.TRUE)) {
            return c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final synchronized void a(EnumC3712qe enumC3712qe) {
        Intrinsics.checkNotNullParameter(enumC3712qe, "<set-?>");
        c = enumC3712qe;
    }

    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }
}
