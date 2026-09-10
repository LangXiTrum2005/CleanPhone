package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3108l3 extends G3 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f23764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3108l3(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, H3 listener) {
        super(listener);
        Intrinsics.f(listener, "listener");
        this.f23764b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.G3
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.G3
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.f23764b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t, Throwable e2) {
        Intrinsics.f(t, "t");
        Intrinsics.f(e2, "e");
        this.f22836a.a(new C3124m3(t, e2));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f23764b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e2);
        }
    }
}
