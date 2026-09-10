package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.saran;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Pair;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: renamed from: com.inmobi.media.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3081mi {
    public final C2932gi a;
    public long b;
    public long c;
    public int d;
    public int e;
    public final AtomicInteger f;
    public final AtomicBoolean g;
    public long h;

    public C3081mi(C2932gi renderViewMetaData) {
        Intrinsics.checkNotNullParameter(renderViewMetaData, "renderViewMetaData");
        this.a = renderViewMetaData;
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        TelemetryConfig telemetryConfig = (TelemetryConfig) Y3.a.a(TelemetryConfig.class);
        C3056li c3056li = renderViewMetaData.k;
        this.f = new AtomicInteger(c3056li != null ? c3056li.a : telemetryConfig.getMaxTemplateEvents());
        this.g = new AtomicBoolean(false);
    }

    public final void a(int i) {
        short s;
        Context context = Ji.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.b;
            Ea eaA = Da.a(context, "im_telemetry_prefs");
            String str = A1.c;
            if (str == null) {
                str = "unknown";
            }
            Intrinsics.checkNotNullParameter("last_app_version", com.ironsource.X3.i.W);
            if (Intrinsics.wireman(eaA.a.getString("last_app_version", null), str)) {
                return;
            }
            Map mapA = a();
            switch (i) {
                case 8800:
                    s = 2365;
                    break;
                case 8801:
                default:
                    s = (short) i;
                    break;
                case 8802:
                    s = 2366;
                    break;
                case 8803:
                    s = 2367;
                    break;
                case 8804:
                    s = 2368;
                    break;
            }
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
            Wj wj = Wj.a;
            Wj.b("VideoPlayerNotSupported", mapA, EnumC2779ak.SDK);
            eaA.a("last_app_version", str, false);
        }
    }

    public final void b() {
        String strA = a("WebViewLoadCalled");
        this.c = SystemClock.elapsedRealtime();
        Map mapA = a();
        if (Intrinsics.wireman(strA, "CompanionWebViewLoadCalled")) {
            long j = this.b;
            saran saranVar = AbstractC2984il.a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        } else {
            C3164q1 c3164q1 = this.a.j;
            if (c3164q1 != null) {
                long j2 = c3164q1.a.c;
                saran saranVar2 = AbstractC2984il.a;
                mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j2));
            }
        }
        mapA.put("creativeId", this.a.g);
        Wj wj = Wj.a;
        Wj.b(strA, mapA, EnumC2779ak.SDK);
    }

    public final void a(String eventType, String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (this.g.get()) {
            return;
        }
        if (this.f.decrementAndGet() <= 0) {
            this.g.set(true);
            Map mapA = a();
            long j = this.c;
            saran saranVar = AbstractC2984il.a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            Wj wj = Wj.a;
            Wj.b("TemplateEventDropped", mapA, EnumC2779ak.SDK);
            return;
        }
        if (str != null) {
            try {
                if (new JSONObject(str).length() == 0) {
                    str = null;
                }
            } catch (JSONException e) {
                Wj wj2 = Wj.a;
                e.toString();
            }
        }
        String str2 = this.a.l;
        if (str2 == null) {
            str2 = "";
        }
        Map mapKowloon = seminary.kowloon(formularize.attabal("trigger", str2), formularize.attabal("plType", String.valueOf(this.a.a.f)), formularize.attabal("impressionId", this.a.c), formularize.attabal("markupType", this.a.b), formularize.attabal("networkType", C3342x5.m()));
        if (str != null) {
            mapKowloon.put("payload", str);
        }
        if (this.a.d.length() > 0) {
            mapKowloon.put("metadataBlob", this.a.d);
        }
        Wj.b(eventType, mapKowloon, EnumC2779ak.TEMPLATE);
    }

    public final void a(boolean z, short s) {
        String strA = a("WebViewRenderProcessGoneEvent");
        String str = this.a.l;
        if (str == null) {
            str = "";
        }
        Pair pairAttabal = formularize.attabal("trigger", str);
        long j = this.c;
        saran saranVar = AbstractC2984il.a;
        Map mapKowloon = seminary.kowloon(pairAttabal, formularize.attabal("latency", Long.valueOf(SystemClock.elapsedRealtime() - j)), formularize.attabal("source", "render_view_" + this.a.a.e), formularize.attabal("isCrashed", Boolean.valueOf(z)), formularize.attabal("creativeId", this.a.g), formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)));
        Wj wj = Wj.a;
        Wj.b(strA, mapKowloon, EnumC2779ak.SDK);
    }

    public final Map a() {
        String str = this.a.l;
        if (str == null) {
            str = "";
        }
        Map mapKowloon = seminary.kowloon(formularize.attabal("trigger", str), formularize.attabal("plType", String.valueOf(this.a.a.f)), formularize.attabal("plId", String.valueOf(this.a.a.a)), formularize.attabal("adType", String.valueOf(this.a.a.e)), formularize.attabal("markupType", this.a.b), formularize.attabal("networkType", C3342x5.m()), formularize.attabal("retryCount", String.valueOf(this.a.e)), formularize.attabal("creativeType", this.a.f), formularize.attabal("adPosition", String.valueOf(this.a.i)), formularize.attabal("isRewarded", String.valueOf(this.a.h)), formularize.attabal("impressionId", this.a.c));
        if (this.a.d.length() > 0) {
            mapKowloon.put("metadataBlob", this.a.d);
        }
        return mapKowloon;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String a(String str) {
        if (!Intrinsics.wireman(this.a.l, BuildConfig.FLAVOR)) {
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
