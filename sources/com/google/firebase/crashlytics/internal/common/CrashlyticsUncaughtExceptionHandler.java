package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsController.AnonymousClass1 f20345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SettingsController f20346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f20347c;
    public final CrashlyticsNativeComponentDeferredProxy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f20348e = new AtomicBoolean(false);

    public interface CrashListener {
    }

    public CrashlyticsUncaughtExceptionHandler(CrashlyticsController.AnonymousClass1 anonymousClass1, SettingsController settingsController, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy) {
        this.f20345a = anonymousClass1;
        this.f20346b = settingsController;
        this.f20347c = uncaughtExceptionHandler;
        this.d = crashlyticsNativeComponentDeferredProxy;
    }

    public final boolean a(Thread thread, Throwable th) {
        Logger logger = Logger.f20289a;
        if (thread == null) {
            logger.c(null, "Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            logger.c(null, "Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.d.b()) {
            return true;
        }
        logger.b("Crashlytics will not record uncaught exception; native crash exists for session.", null);
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f20347c;
        Logger logger = Logger.f20289a;
        AtomicBoolean atomicBoolean = this.f20348e;
        atomicBoolean.set(true);
        try {
            if (a(thread, th)) {
                this.f20345a.a(this.f20346b, thread, th);
            } else {
                logger.b("Uncaught exception will not be recorded by Crashlytics.", null);
            }
        } catch (Exception e2) {
            logger.c(e2, "An error occurred in the uncaught exception handler");
        } finally {
            if (uncaughtExceptionHandler != null) {
                logger.b("Completed exception processing. Invoking default exception handler.", null);
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                logger.b("Completed exception processing, but no default exception handler.", null);
                System.exit(1);
            }
            atomicBoolean.set(false);
        }
    }
}
