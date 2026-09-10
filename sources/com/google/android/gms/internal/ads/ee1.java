package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ee1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f13953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13954d;

    public ee1(Class cls, int i10) {
        this.f13951a = i10;
        switch (i10) {
            case 1:
                this.f13954d = new com.google.android.gms.internal.play_billing.n();
                this.f13952b = cls.getName();
                break;
            case 2:
                this.f13954d = new Object();
                this.f13952b = cls.getName();
                break;
            default:
                this.f13954d = new u81();
                this.f13952b = cls.getName();
                break;
        }
    }

    public Logger a() {
        Logger logger = this.f13953c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f13954d) {
            try {
                Logger logger2 = this.f13953c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f13952b);
                this.f13953c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Logger b() {
        Logger logger;
        Logger logger2;
        switch (this.f13951a) {
            case 0:
                Logger logger3 = this.f13953c;
                if (logger3 != null) {
                    return logger3;
                }
                synchronized (((u81) this.f13954d)) {
                    try {
                        logger = this.f13953c;
                        if (logger == null) {
                            logger = Logger.getLogger(this.f13952b);
                            this.f13953c = logger;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return logger;
            default:
                Logger logger4 = this.f13953c;
                if (logger4 != null) {
                    return logger4;
                }
                synchronized (((com.google.android.gms.internal.play_billing.n) this.f13954d)) {
                    try {
                        logger2 = this.f13953c;
                        if (logger2 == null) {
                            logger2 = Logger.getLogger(this.f13952b);
                            this.f13953c = logger2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return logger2;
        }
    }
}
