package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yw implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f22382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zw f22383c;

    public /* synthetic */ yw(zw zwVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i10) {
        this.f22381a = i10;
        this.f22382b = uncaughtExceptionHandler;
        this.f22383c = zwVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        switch (this.f22381a) {
            case 0:
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f22382b;
                try {
                    try {
                        this.f22383c.g(th2);
                    } catch (Throwable unused) {
                        zzo.zzf("AdMob exception reporter failed reporting the exception.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th2);
                    }
                }
                break;
            default:
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f22382b;
                try {
                    try {
                        this.f22383c.g(th2);
                    } catch (Throwable unused2) {
                        zzo.zzf("AdMob exception reporter failed reporting the exception.");
                    }
                    if (uncaughtExceptionHandler2 != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (uncaughtExceptionHandler2 != null) {
                        uncaughtExceptionHandler2.uncaughtException(thread, th2);
                    }
                }
                break;
        }
    }
}
