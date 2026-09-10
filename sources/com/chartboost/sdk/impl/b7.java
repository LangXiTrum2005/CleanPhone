package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.b7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b7 implements z6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b7 f13489b = new b7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z6 f13490a = xg.a();

    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: p.c
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                b7.a(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    public final boolean b(Throwable th) {
        String className;
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.e(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (stackTraceElement != null && (className = stackTraceElement.getClassName()) != null && StringsKt.M(className, "com.chartboost.sdk", false)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f13490a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f13490a.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f13490a.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f13490a.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f13490a.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f13490a.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f13490a.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f13490a.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f13490a.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f13490a.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f13490a.mo189track(event);
    }

    public static final void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        b7 b7Var = f13489b;
        Intrinsics.c(th);
        if (b7Var.b(th)) {
            b7Var.track((ch) new u6(fh.i.DISMISS_MISSING, b7Var.a(th), null, null, null, 28, null));
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public final String a(Throwable th) {
        String string = new JSONObject().put("reason", "dismiss_event due to the unhandled exceptions").put("error", String.valueOf(th)).toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }
}
