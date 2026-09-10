package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z9 f28125a = new Z9();

    private Z9() {
    }

    public static final <T> T a(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static final boolean a(Object obj) {
        return a(obj, null, false, 6, null);
    }

    public static final boolean a(Object obj, String errorMessage) {
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        return a(obj, errorMessage, false, 4, null);
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = "reference is null";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return a(obj, str, z10);
    }

    public static final boolean a(Object obj, String errorMessage, boolean z10) {
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (z10) {
            throw new NullPointerException(errorMessage);
        }
        if (!z10) {
            IronLog.API.error(errorMessage);
            return false;
        }
        throw new aa.b((byte) 0, 20);
    }
}
