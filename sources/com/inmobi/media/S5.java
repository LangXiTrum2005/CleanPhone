package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class S5 implements N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S5 f23167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CrashConfig f23168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H3 f23169c;
    public static final E6 d;

    static {
        S5 s5 = new S5();
        f23167a = s5;
        LinkedHashMap linkedHashMap = O2.f23027a;
        Config configA = M2.a("crashReporting", Uc.b(), s5);
        Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.CrashConfig");
        CrashConfig crashConfig = (CrashConfig) configA;
        f23168b = crashConfig;
        long jCurrentTimeMillis = System.currentTimeMillis();
        d = new E6(crashConfig);
        Context contextD = Uc.d();
        if (contextD != null) {
            f23169c = new H3(contextD, crashConfig, Uc.f());
        }
        if (crashConfig.getCrashConfig().getReportSessionInfo()) {
            C3156o3 type = C3156o3.d;
            Intrinsics.f(type, "type");
            C6 c6A = V5.a();
            if (c6A != null) {
                c6A.a(type.f23912a, jCurrentTimeMillis, true);
            }
            C6 c6A2 = V5.a();
            if (c6A2 != null) {
                C6.a(c6A2, "s-cnt", 0, false, 4, (Object) null);
            }
        }
        if (AbstractC3003ea.f23565a.getCrashConfig().getReportOOMInfo()) {
            for (AbstractC3188q3 type2 : CollectionsKt.I(C3172p3.d, C3140n3.d)) {
                Intrinsics.f(type2, "type");
                C6 c6A3 = V5.a();
                if (c6A3 != null) {
                    c6A3.a(type2.f23912a, jCurrentTimeMillis, true);
                }
            }
        }
    }

    public static void a(JSONObject payload, boolean z2, long j) {
        Intrinsics.f(payload, "payload");
        if (f23168b.getCrashConfig().getReportSessionInfo() && z2) {
            C3156o3 crashType = C3156o3.d;
            Intrinsics.f(crashType, "crashType");
            C6 c6A = V5.a();
            if (c6A != null) {
                String key = crashType.f23912a;
                Intrinsics.f(key, "key");
                long j2 = c6A.f22735a.getLong(key, 0L);
                String str = crashType.f23913b;
                if (j2 == 0) {
                    c6A.a(str, j, true);
                } else {
                    c6A.a(str, j - j2, true);
                }
            }
            payload.put("crashFreeSessionLength", V5.a(crashType));
            C6 c6A2 = V5.a();
            payload.put("crashFreeSessionCount", c6A2 != null ? c6A2.f22735a.getInt("s-cnt", 0) : 0);
        }
    }

    public final void a() {
        C6 c6A;
        if (f23168b.getCrashConfig().getReportSessionInfo() && (c6A = V5.a()) != null) {
            C6.a(c6A, "s-cnt", c6A.f22735a.getInt("s-cnt", 0) + 1, false, 4, (Object) null);
        }
        H3 h3 = f23169c;
        if (h3 != null) {
            Iterator it = h3.f22857c.iterator();
            while (it.hasNext()) {
                ((G3) it.next()).a();
            }
        }
        d.c();
    }

    @Override // com.inmobi.media.N2
    public final void a(Config config) {
        Intrinsics.f(config, "config");
        if (config instanceof CrashConfig) {
            E6 e6 = d;
            CrashConfig crashConfig = (CrashConfig) config;
            e6.getClass();
            e6.f22796a = crashConfig;
            U5 u5 = e6.f22798c;
            u5.getClass();
            u5.f23260a.f23075a = crashConfig.getCrashConfig().getSamplingPercent();
            u5.f23261b.f23075a = crashConfig.getCatchConfig().getSamplingPercent();
            u5.f23262c.f23075a = crashConfig.getAnr().getWatchdog().getSamplingPercent();
            u5.d.f23075a = crashConfig.getAnr().getAppExitReason().getSamplingPercent();
            C3236t4 c3236t4 = e6.f22797b;
            if (c3236t4 != null) {
                C3189q4 eventConfig = crashConfig.getEventConfig();
                Intrinsics.f(eventConfig, "eventConfig");
                c3236t4.f24004i = eventConfig;
            }
            H3 h3 = f23169c;
            if (h3 != null) {
                h3.f22855a = crashConfig;
            }
        }
    }
}
