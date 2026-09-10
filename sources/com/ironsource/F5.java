package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class F5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f26055a = "ironbeast";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f26056b = "outcome";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f26057c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f26058d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f26059e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f26060f = 0;

    public static AbstractC0308e a(String str, int i10) {
        if (f26055a.equals(str)) {
            return new C0373ha(i10);
        }
        if (f26056b.equals(str)) {
            return new Uc(i10);
        }
        if (i10 == 2) {
            return new C0373ha(i10);
        }
        if (i10 == 3) {
            return new Uc(i10);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i10 + ")", 2);
        return null;
    }
}
