package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3149nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3053hc f23834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23836c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23837e;
    public final AtomicInteger f;
    public final AtomicBoolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23838h;

    public C3149nc(C3053hc renderViewMetaData) {
        Intrinsics.f(renderViewMetaData, "renderViewMetaData");
        this.f23834a = renderViewMetaData;
        LinkedHashMap linkedHashMap = O2.f23027a;
        TelemetryConfig telemetryConfig = (TelemetryConfig) AbstractC3174p5.a("telemetry", "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig", null);
        C3133mc c3133mc = renderViewMetaData.j;
        this.f = new AtomicInteger(c3133mc != null ? c3133mc.f23821a : telemetryConfig.getMaxTemplateEvents());
        this.g = new AtomicBoolean(false);
    }

    public final Map a() {
        C3053hc c3053hc = this.f23834a;
        String str = c3053hc.k;
        if (str == null) {
            str = "";
        }
        Pair pair = new Pair("trigger", str);
        Pair pair2 = new Pair("plType", String.valueOf(c3053hc.f23664a.m()));
        Pair pair3 = new Pair("plId", String.valueOf(this.f23834a.f23664a.l()));
        Pair pair4 = new Pair("adType", String.valueOf(this.f23834a.f23664a.b()));
        Pair pair5 = new Pair("markupType", this.f23834a.f23665b);
        Pair pair6 = new Pair("networkType", L3.q());
        Pair pair7 = new Pair("retryCount", String.valueOf(this.f23834a.d));
        C3053hc c3053hc2 = this.f23834a;
        LinkedHashMap linkedHashMapL = MapsKt.l(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("creativeType", c3053hc2.f23667e), new Pair("adPosition", String.valueOf(c3053hc2.f23668h)), new Pair("isRewarded", String.valueOf(this.f23834a.g)));
        if (this.f23834a.f23666c.length() > 0) {
            linkedHashMapL.put("metadataBlob", this.f23834a.f23666c);
        }
        return linkedHashMapL;
    }

    public final void b() {
        String strA = a("WebViewLoadCalled");
        this.f23836c = SystemClock.elapsedRealtime();
        Map mapA = a();
        if (Intrinsics.a(strA, "CompanionWebViewLoadCalled")) {
            long j = this.f23835b;
            ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        } else {
            T0 t0 = this.f23834a.f23669i;
            if (t0 != null) {
                long j2 = t0.f23192a.f23243c;
                ScheduledExecutorService scheduledExecutorService2 = Ie.f22893a;
                mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j2));
            }
        }
        mapA.put("creativeId", this.f23834a.f);
        Pd pd = Pd.f23077a;
        Pd.b(strA, mapA, Td.SDK);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String a(String str) {
        if (!Intrinsics.a(this.f23834a.k, "default")) {
            switch (str.hashCode()) {
                case -1395724590:
                    if (str.equals("PageStarted")) {
                        return "CompanionWebViewPageStarted";
                    }
                    break;
                case -81019210:
                    if (str.equals("FireAdFailed")) {
                        return "CompanionFireAdFailed";
                    }
                    break;
                case 147127306:
                    if (str.equals("FireAdReady")) {
                        return "CompanionFireAdReady";
                    }
                    break;
                case 260281564:
                    if (str.equals("WebViewLoadCalled")) {
                        return "CompanionWebViewLoadCalled";
                    }
                    break;
                case 520950289:
                    if (str.equals("WebViewLoadFinished")) {
                        return "CompanionWebViewLoadFinished";
                    }
                    break;
                case 570988141:
                    if (str.equals("RenderProcessResponsive")) {
                        return "RenderProcessResponsive";
                    }
                    break;
                case 1001819046:
                    if (str.equals("RenderProcessUnResponsive")) {
                        return "CompanionRenderProcessUnResponsive";
                    }
                    break;
            }
        }
        return str;
    }
}
