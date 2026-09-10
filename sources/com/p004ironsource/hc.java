package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: loaded from: classes5.dex */
class hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f25226a = "ironbeast";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f25227b = "outcome";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f25228c = 4;
    static final int d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f25229e = 2;
    static final int f = 0;

    public static AbstractC3351e a(String str, int i2) {
        if (f25226a.equals(str)) {
            return new sk(i2);
        }
        if (f25227b.equals(str)) {
            return new yp(i2);
        }
        if (i2 == 2) {
            return new sk(i2);
        }
        if (i2 == 3) {
            return new yp(i2);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i2 + ")", 2);
        return null;
    }
}
