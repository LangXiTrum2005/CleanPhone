package com.inmobi.media;

import A.RunnableC0883c;
import android.app.Activity;
import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3009f0 implements N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ScheduledExecutorService f23594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ExecutorService f23595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f23596c;
    public static C2976d0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static AdConfig f23597e;

    static {
        C3009f0 c3009f0 = new C3009f0();
        f23596c = LazyKt.b(C2993e0.f23536a);
        LinkedHashMap linkedHashMap = O2.f23027a;
        Config configA = M2.a("ads", Uc.b(), c3009f0);
        Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
        f23597e = (AdConfig) configA;
    }

    public static void a(long j, C2975d execute) {
        Intrinsics.f(execute, "execute");
        ScheduledExecutorService scheduledExecutorService = f23594a;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(5, new K5("AdQualityComponent-aqHandler"));
            Intrinsics.e(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
            f23594a = scheduledExecutorServiceNewScheduledThreadPool;
        }
        ScheduledExecutorService scheduledExecutorService2 = f23594a;
        if (scheduledExecutorService2 != null) {
            scheduledExecutorService2.schedule(new RunnableC0883c(execute, 16), j, TimeUnit.MILLISECONDS);
        } else {
            Intrinsics.m("aqHandlerExecutor");
            throw null;
        }
    }

    public static final void b(Function0 tmp0) {
        Intrinsics.f(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static void a(C2958c execute) {
        Intrinsics.f(execute, "execute");
        ExecutorService executorService = f23595b;
        if (executorService == null || executorService.isShutdown()) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new K5("AdQualityComponent-aqBeacon"));
            Intrinsics.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
            f23595b = executorServiceNewSingleThreadExecutor;
        }
        ExecutorService executorService2 = f23595b;
        if (executorService2 != null) {
            executorService2.submit(new RunnableC0883c(execute, 17));
        } else {
            Intrinsics.m("aqBeaconExecutor");
            throw null;
        }
    }

    public static final void a(Function0 tmp0) {
        Intrinsics.f(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // com.inmobi.media.N2
    public final void a(Config config) {
        Intrinsics.f(config, "config");
        if (config instanceof AdConfig) {
            AdConfig adConfig = (AdConfig) config;
            f23597e = adConfig;
            C2976d0 c2976d0 = d;
            if (c2976d0 != null) {
                c2976d0.f23503a = adConfig;
                if (!c2976d0.f23504b.get()) {
                    if (adConfig.getAdQuality().getEnabled()) {
                        c2976d0.a();
                        return;
                    }
                    return;
                }
                if (!c2976d0.f23504b.get() || adConfig.getAdQuality().getEnabled()) {
                    return;
                }
                Log.i("AdQualityBeaconExecutor", "kill switch encountered. shut down.");
                c2976d0.f23504b.set(false);
                ExecutorService executorService = f23595b;
                if (executorService != null) {
                    executorService.shutdown();
                    try {
                        try {
                            executorService.shutdownNow();
                        } catch (Exception e2) {
                            Log.e("AdQualityComponent", "shutdown fail", e2);
                            Thread.currentThread().interrupt();
                        }
                    } catch (InterruptedException unused) {
                        executorService.shutdownNow();
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public static void a(Activity activity, GestureDetectorOnGestureListenerC3005ec renderView, String url, boolean z2, JSONObject extras, Jb listener) {
        Jb jb;
        Intrinsics.f(activity, "activity");
        Intrinsics.f(renderView, "renderView");
        Intrinsics.f(url, "url");
        Intrinsics.f(extras, "extras");
        Intrinsics.f(listener, "listener");
        C3153o0 adQualityManager = renderView.getAdQualityManager();
        adQualityManager.getClass();
        if (extras.length() > 0 && url.length() > 0) {
            adQualityManager.j = url;
            adQualityManager.k = extras;
            adQualityManager.a("report ad starting");
            if (z2) {
                adQualityManager.a("report ad capture");
                jb = listener;
                adQualityManager.a(activity, 0L, true, jb);
            } else {
                jb = listener;
                adQualityManager.a("report ad report");
                adQualityManager.a(new AdQualityResult("", null, url, extras.toString()), false);
            }
        } else {
            jb = listener;
            jb.f22906a.c("window.mraidview.broadcastEvent('AdReportFailed')");
            adQualityManager.a((Exception) null, "Incorrect parameters for reporting. url - " + url + " , extras - " + extras);
        }
        C2976d0 c2976d0 = d;
        if (c2976d0 != null) {
            c2976d0.d.put(url, new WeakReference(jb));
            String creativeID = renderView.getCreativeID();
            if (creativeID.length() > 0) {
                Lazy lazy = f23596c;
                if (((CopyOnWriteArrayList) lazy.getX()).size() < f23597e.getAdReport().getCridls()) {
                    ((CopyOnWriteArrayList) lazy.getX()).add(creativeID);
                    return;
                }
                return;
            }
            return;
        }
        Intrinsics.m("executor");
        throw null;
    }

    public static void a(GestureDetectorOnGestureListenerC3005ec adView, GestureDetectorOnGestureListenerC3005ec renderView, String url, boolean z2, JSONObject extras, Jb listener) {
        Jb jb;
        Intrinsics.f(adView, "adView");
        Intrinsics.f(renderView, "renderView");
        Intrinsics.f(url, "url");
        Intrinsics.f(extras, "extras");
        Intrinsics.f(listener, "listener");
        C3153o0 adQualityManager = renderView.getAdQualityManager();
        adQualityManager.getClass();
        if (extras.length() > 0 && url.length() > 0) {
            adQualityManager.j = url;
            adQualityManager.k = extras;
            if (z2) {
                jb = listener;
                adQualityManager.a(adView, 0L, true, jb);
            } else {
                jb = listener;
                adQualityManager.a(new AdQualityResult("", null, url, extras.toString()), false);
            }
        } else {
            jb = listener;
            jb.f22906a.c("window.mraidview.broadcastEvent('AdReportFailed')");
            adQualityManager.a((Exception) null, "Incorrect parameters for reporting. url - " + url + " , extras - " + extras);
        }
        C2976d0 c2976d0 = d;
        if (c2976d0 != null) {
            c2976d0.d.put(url, new WeakReference(jb));
            String creativeID = renderView.getCreativeID();
            if (creativeID.length() > 0) {
                Lazy lazy = f23596c;
                if (((CopyOnWriteArrayList) lazy.getX()).size() < f23597e.getAdReport().getCridls()) {
                    ((CopyOnWriteArrayList) lazy.getX()).add(creativeID);
                    return;
                }
                return;
            }
            return;
        }
        Intrinsics.m("executor");
        throw null;
    }
}
