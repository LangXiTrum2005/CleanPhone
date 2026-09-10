package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: compiled from: LazyLogger.java */
/* JADX INFO: loaded from: classes3.dex */
public final class graveside {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f22035attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public volatile Logger f22036saneness;

    public graveside(Class<?> cls) {
        this.f22035attabal = cls.getName();
    }

    public Logger attabal() {
        Logger logger = this.f22036saneness;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = this.f22036saneness;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f22035attabal);
                this.f22036saneness = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
