package com.inmobi.media;

import A.RunnableC0883c;
import android.util.Log;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2976d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdConfig f23503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f23504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f23505c;
    public final HashMap d;

    public C2976d0(AdConfig adConfig) {
        Intrinsics.f(adConfig, "adConfig");
        this.f23503a = adConfig;
        this.f23504b = new AtomicBoolean(false);
        this.f23505c = new AtomicBoolean(false);
        this.d = new HashMap();
        Log.i("AdQualityBeaconExecutor", "adding listener to dao");
        Uc.a(new RunnableC0883c(this, 14));
    }

    public static final void a(C2976d0 this$0) {
        Intrinsics.f(this$0, "this$0");
        ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
        C3025g0 c3025g0 = (C3025g0) Nc.f23017a.getX();
        c3025g0.getClass();
        c3025g0.f23619b = this$0;
    }

    public final void a() {
        if (this.f23504b.get()) {
            Log.i("AdQualityBeaconExecutor", "executor already started. ignore.");
            return;
        }
        if (!this.f23503a.getAdQuality().getEnabled()) {
            Log.i("AdQualityBeaconExecutor", "kill switch encountered. skip");
            return;
        }
        Log.i("AdQualityBeaconExecutor", "beacon executor starting");
        C2942b0 c2942b0 = new C2942b0(this);
        ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
        C3009f0.a(new C2958c(c2942b0));
    }
}
