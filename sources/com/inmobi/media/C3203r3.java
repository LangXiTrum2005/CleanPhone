package com.inmobi.media;

import A.RunnableC0883c;
import android.net.Network;
import android.os.SystemClock;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import com.unity3d.services.UnityAdsConstants;
import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3203r3 implements N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AdConfig.CustomNetworkValidation f23948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Network f23949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f23950c;
    public static long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f23951e;
    public static final AtomicBoolean f;

    static {
        C3203r3 c3203r3 = new C3203r3();
        LinkedHashMap linkedHashMap = O2.f23027a;
        Config configA = M2.a("ads", Uc.b(), c3203r3);
        Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
        f23948a = ((AdConfig) configA).getCustomNwValidation();
        f23950c = true;
        f = new AtomicBoolean(false);
    }

    public static void a(Network network) {
        long nonValidatedExpiry;
        long j = f23951e;
        if (j != 0) {
            ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            AdConfig.CustomNetworkValidation customNetworkValidation = f23948a;
            if (jElapsedRealtime < (customNetworkValidation != null ? customNetworkValidation.getRefreshDebounceTime() : 1000L)) {
                return;
            }
        }
        f23951e = SystemClock.elapsedRealtime();
        if (Intrinsics.a(f23949b, network)) {
            long j2 = d;
            ScheduledExecutorService scheduledExecutorService2 = Ie.f22893a;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j2;
            if (f23950c) {
                AdConfig.CustomNetworkValidation customNetworkValidation2 = f23948a;
                nonValidatedExpiry = customNetworkValidation2 != null ? customNetworkValidation2.getValidatedExpiry() : UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
            } else {
                AdConfig.CustomNetworkValidation customNetworkValidation3 = f23948a;
                nonValidatedExpiry = customNetworkValidation3 != null ? customNetworkValidation3.getNonValidatedExpiry() : CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            }
            if (jElapsedRealtime2 <= nonValidatedExpiry) {
                return;
            }
        }
        if (f.compareAndSet(false, true)) {
            ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24145c.getX()).execute(new RunnableC0883c(network, 21));
        }
    }

    public static final void b(Network network) {
        boolean z2;
        String urlDomain;
        Intrinsics.f(network, "$network");
        try {
            try {
                AdConfig.CustomNetworkValidation customNetworkValidation = f23948a;
                z2 = (customNetworkValidation == null || (urlDomain = customNetworkValidation.getUrlDomain()) == null) ? false : !Intrinsics.a(InetAddress.getByName(urlDomain).toString(), "");
            } catch (Exception unused) {
            }
            try {
                f23950c = z2;
                f23949b = network;
                d = SystemClock.elapsedRealtime();
            } catch (Exception e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(new C3011f2(e2));
            }
            f.set(false);
        } catch (Throwable th) {
            f.set(false);
            throw th;
        }
    }

    @Override // com.inmobi.media.N2
    public final void a(Config config) {
        Intrinsics.f(config, "config");
        if (config instanceof AdConfig) {
            f23948a = ((AdConfig) config).getCustomNwValidation();
        }
    }
}
