package com.inmobi.media;

import A.RunnableC0895i;
import android.util.Base64;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.media.AbstractC3167oe;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.inmobi.media.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3167oe {
    public static String a(Map map, String str) {
        A5 a5A = Cb.a("getToken", "AB", false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            Vc.a((String) map.get("tp"));
            Vc.b((String) map.get("tp-v"));
        }
        a();
        if (!Uc.q()) {
            if (a5A != null) {
                a5A.b("com.inmobi.media.oe", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, jCurrentTimeMillis, a5A);
            return null;
        }
        LinkedHashMap linkedHashMap = O2.f23027a;
        RootConfig rootConfig = (RootConfig) AbstractC3174p5.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null);
        if (rootConfig.getMonetizationDisabled()) {
            a(2012, jCurrentTimeMillis, a5A);
            if (a5A != null) {
                a5A.b("com.inmobi.media.oe", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        AdConfig adConfig = (AdConfig) AbstractC3174p5.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
        C3183pe c3183pe = new C3183pe(new C3262ue(adConfig.getIncludeIds()), a5A, rootConfig, adConfig);
        c3183pe.C = map;
        c3183pe.f23900B = str;
        HashMap mapG = MapsKt.g(new Pair("h-user-agent", Uc.k()));
        HashMap map2 = c3183pe.k;
        if (map2 != null) {
            map2.putAll(mapG);
        }
        c3183pe.f();
        if (!c3183pe.d) {
            if (a5A != null) {
                a5A.b("com.inmobi.media.oe", "get Signals failed - GDPR Compliance");
            }
            a(2141, jCurrentTimeMillis, a5A);
            return null;
        }
        a(jCurrentTimeMillis, a5A);
        if (a5A != null) {
            a5A.a("com.inmobi.media.oe", "get signals success");
        }
        String strC = c3183pe.c();
        Charset charset = Charsets.f44691a;
        byte[] bytes = strC.getBytes(charset);
        Intrinsics.e(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 8);
        Intrinsics.e(bArrEncode, "encode(...)");
        return new String(bArrEncode, charset);
    }

    public static final void b() {
        HashMap mapG = MapsKt.g(new Pair("networkType", L3.q()), new Pair("plType", "AB"));
        Pd pd = Pd.f23077a;
        Pd.b("AdGetSignalsCalled", mapG, Td.SDK);
    }

    public static void a(final int i2, final long j, A5 a5) {
        if (a5 != null) {
            a5.c("com.inmobi.media.oe", "submitAdGetSignalsFailed - errorCode - " + i2 + ", startTime - " + j);
        }
        Uc.a(new Runnable() { // from class: A.p0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3167oe.a(j, i2);
            }
        });
        if (a5 != null) {
            a5.a();
        }
    }

    public static final void a(long j, int i2) {
        HashMap mapG = MapsKt.g(new Pair("latency", Long.valueOf(System.currentTimeMillis() - j)), new Pair("networkType", L3.q()), new Pair("errorCode", Integer.valueOf(i2)), new Pair("plType", "AB"));
        Pd pd = Pd.f23077a;
        Pd.b("AdGetSignalsFailed", mapG, Td.SDK);
    }

    public static void a(final long j, A5 a5) {
        if (a5 != null) {
            a5.c("com.inmobi.media.oe", "submitAdGetSignalsSucceeded - startTime - " + j);
        }
        Uc.a(new Runnable() { // from class: A.o0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3167oe.a(j);
            }
        });
        if (a5 != null) {
            a5.a();
        }
    }

    public static final void a(long j) {
        HashMap mapG = MapsKt.g(new Pair("latency", Long.valueOf(System.currentTimeMillis() - j)), new Pair("networkType", L3.q()), new Pair("plType", "AB"));
        Pd pd = Pd.f23077a;
        Pd.b("AdGetSignalsSucceeded", mapG, Td.SDK);
    }

    public static void a() {
        Uc.a(new RunnableC0895i(8));
    }
}
