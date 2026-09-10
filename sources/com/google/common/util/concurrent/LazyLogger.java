package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class LazyLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Logger f20135b;

    public LazyLogger(Class cls) {
        this.f20134a = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f20135b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = this.f20135b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f20134a);
                this.f20135b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
