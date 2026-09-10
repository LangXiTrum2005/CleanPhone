package com.kochava.tracker.log.internal;

import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.LoggerApi;

/* JADX INFO: loaded from: classes5.dex */
public final class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f28248a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static com.kochava.core.log.internal.Logger f28249b;

    public static void a(ClassLoggerApi classLoggerApi, String str) {
        classLoggerApi.a("Kochava Diagnostic - " + str);
    }

    public static LoggerApi b() {
        if (f28249b == null) {
            synchronized (f28248a) {
                if (f28249b == null) {
                    f28249b = new com.kochava.core.log.internal.Logger();
                }
            }
        }
        return f28249b;
    }

    public static void c(ClassLoggerApi classLoggerApi, String str) {
        classLoggerApi.info("Kochava Diagnostic - " + str);
    }
}
