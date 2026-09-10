package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f15088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rf f15089c;
    public final g2 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f15090e;

    public s3(Context context, ScheduledExecutorService backgroundExecutor, rf sdkInitializer, g2 tokenGenerator, p2 identity) {
        Intrinsics.f(context, "context");
        Intrinsics.f(backgroundExecutor, "backgroundExecutor");
        Intrinsics.f(sdkInitializer, "sdkInitializer");
        Intrinsics.f(tokenGenerator, "tokenGenerator");
        Intrinsics.f(identity, "identity");
        this.f15087a = context;
        this.f15088b = backgroundExecutor;
        this.f15089c = sdkInitializer;
        this.d = tokenGenerator;
        this.f15090e = identity;
    }

    public final String a() {
        return this.d.a();
    }

    public final void b() {
        try {
            Thread.sleep(100L);
            this.f15090e.h();
        } catch (Exception e2) {
            za.a("startIdentity error " + e2, (Throwable) null, 2, (Object) null);
        }
    }

    public final void a(String appId, String appSignature, StartCallback onStarted, ChartboostError chartboostError) {
        Intrinsics.f(appId, "appId");
        Intrinsics.f(appSignature, "appSignature");
        Intrinsics.f(onStarted, "onStarted");
        this.f15088b.execute(new A.r0(this, appId, appSignature, onStarted, chartboostError, 6));
    }

    public static /* synthetic */ void a(s3 s3Var, String str, String str2, StartCallback startCallback, ChartboostError chartboostError, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            chartboostError = null;
        }
        s3Var.a(str, str2, startCallback, chartboostError);
    }

    public static final void a(s3 this$0, String appId, String appSignature, StartCallback onStarted, ChartboostError chartboostError) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(appId, "$appId");
        Intrinsics.f(appSignature, "$appSignature");
        Intrinsics.f(onStarted, "$onStarted");
        this$0.b();
        vh.f15428b.a(this$0.f15087a);
        this$0.f15089c.a(appId, appSignature, onStarted, chartboostError);
    }
}
