package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3310xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JSONObject f24108a = new JSONObject();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f24109b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Be f24110c;

    public static void a() {
        synchronized (f24108a) {
            f24110c = null;
        }
    }

    public static boolean b() {
        boolean z2;
        synchronized (f24108a) {
            Be be = f24110c;
            z2 = (be == null || be.f22700A.get()) ? false : true;
        }
        return z2;
    }

    public static void c() {
        Be be;
        synchronized (f24108a) {
            if (b() && (be = f24110c) != null) {
                be.f22700A.compareAndSet(false, true);
            }
        }
        d();
    }

    public static void d() {
        LinkedHashMap linkedHashMap = O2.f23027a;
        SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = ((SignalsConfig) AbstractC3174p5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig();
        synchronized (f24108a) {
            String url = unifiedIdServiceConfig.getUrl();
            Config configA = M2.a("signals", Uc.b(), null);
            Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
            Be be = new Be(url, new C3262ue(((SignalsConfig) configA).getIncludeIds()), Uc.b(), unifiedIdServiceConfig.getMaxRetries(), unifiedIdServiceConfig.getRetryInterval(), unifiedIdServiceConfig.getTimeout());
            f24110c = be;
            F5 f5 = new F5(new C3326ye(be, f24109b), be);
            HashMap map = new HashMap();
            Pd pd = Pd.f23077a;
            Pd.b("UnifiedIdNetworkCallRequested", map, Td.SDK);
            ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX()).submit(f5);
        }
    }

    public static void e() {
        synchronized (f24108a) {
            try {
                Be be = f24110c;
                if (be != null) {
                    be.f22700A.compareAndSet(false, true);
                }
                f24110c = null;
                f24109b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
