package com.inmobi.media;

import A.RunnableC0905n;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pa f22982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f22983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig.PingsV2Config f22984c;
    public final Ka d;

    public Ma(Pa dao) {
        Intrinsics.f(dao, "dao");
        this.f22982a = dao;
        this.f22983b = new ConcurrentHashMap();
        LinkedHashMap linkedHashMap = O2.f23027a;
        AdConfig.PingsV2Config pingV2 = ((AdConfig) AbstractC3174p5.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getPingV2();
        this.f22984c = pingV2;
        this.d = new Ka(pingV2);
    }

    public static void a(C3338za c3338za, short s) {
        Unit unit;
        C3053hc c3053hc = c3338za.k;
        if (c3053hc != null) {
            C3149nc c3149nc = new C3149nc(c3053hc);
            String priority = c3338za.f24162e;
            int i2 = c3338za.g;
            Intrinsics.f(priority, "priority");
            Map mapA = c3149nc.a();
            mapA.put("errorCode", Short.valueOf(s));
            mapA.put("trigger", priority);
            mapA.put("retryCount", String.valueOf(i2));
            Oa.a("PingFailed", mapA);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            TelemetryConfig telemetryConfig = Oa.f23044a;
            Oa.a("PingFailed", MapsKt.l(new Pair("trigger", c3338za.f24162e), new Pair("errorCode", Short.valueOf(s)), new Pair("retryCount", Integer.valueOf(c3338za.g))));
        }
    }

    public abstract void a(C3338za c3338za);

    public final void b(C3338za ping) {
        Intrinsics.f(ping, "ping");
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX()).execute(new RunnableC0905n(8, this, ping));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    public final void b(Da pingResult, La la) {
        Unit unit;
        Ia ia;
        Intrinsics.f(pingResult, "pingResult");
        String str = pingResult.f22779a.f24159a;
        Objects.toString(la);
        Unit unit2 = Unit.f43263a;
        if (la != null) {
            C3338za ping = pingResult.f22779a;
            int i2 = pingResult.f22780b;
            long j = pingResult.d;
            Ia ia2 = (Ia) la;
            Intrinsics.f(ping, "ping");
            if (!ia2.d.get()) {
                if ("high".equals(ping.f24162e) && ping.f) {
                    String str2 = ping.f24160b;
                    Ha ha = ia2.f22888a;
                    if (ha != null) {
                        ia = ia2;
                        ((Yb) ha).a(str2, i2, null, j, ping.g);
                    } else {
                        ia = ia2;
                    }
                } else {
                    ia = ia2;
                }
                String priority = ping.f24162e;
                long jCurrentTimeMillis = System.currentTimeMillis() - ping.f24164i;
                C3149nc c3149nc = ia.f22889b;
                if (c3149nc != null) {
                    Intrinsics.f(priority, "priority");
                    Map mapA = c3149nc.a();
                    mapA.put("trigger", priority);
                    mapA.put("latency", Long.valueOf(jCurrentTimeMillis));
                    Oa.a("PingSuccess", mapA);
                }
            }
            unit = unit2;
        } else {
            unit = null;
        }
        if (unit == null) {
            C3338za c3338za = pingResult.f22779a;
            C3053hc c3053hc = c3338za.k;
            if (c3053hc != null) {
                C3149nc c3149nc2 = new C3149nc(c3053hc);
                String priority2 = c3338za.f24162e;
                long j2 = c3338za.f24164i;
                Intrinsics.f(priority2, "priority");
                Map mapA2 = c3149nc2.a();
                mapA2.put("trigger", priority2);
                mapA2.put("latency", Long.valueOf(j2));
                Oa.a("PingSuccess", mapA2);
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                TelemetryConfig telemetryConfig = Oa.f23044a;
                Oa.a("PingSuccess", MapsKt.l(new Pair("trigger", c3338za.f24162e), new Pair("retryCount", Integer.valueOf(c3338za.g))));
            }
        }
        Pa pa = this.f22982a;
        C3338za ping2 = pingResult.f22779a;
        Intrinsics.f(ping2, "ping");
        pa.a("id = ?", new String[]{ping2.f24160b});
    }

    public final boolean a(String priority) {
        C3338za c3338zaA;
        Intrinsics.f(priority, "priority");
        if (T1.a(this.f22982a, null, null, 63) < this.f22984c.getMaxEntries()) {
            return true;
        }
        TelemetryConfig telemetryConfig = Oa.f23044a;
        Oa.a("PingDBMaxLimitReached", new LinkedHashMap());
        if (priority.equals("high")) {
            c3338zaA = this.f22982a.a("normal");
            if (c3338zaA == null) {
                c3338zaA = this.f22982a.a("high");
            }
        } else {
            c3338zaA = this.f22982a.a("normal");
        }
        if (c3338zaA == null) {
            return false;
        }
        a(c3338zaA, priority.equals("high") ? (short) 2259 : (short) 2260);
        return true;
    }

    public final void a(Da pingResult, La la) {
        int maxRetries;
        Pair pair;
        Intrinsics.f(pingResult, "pingResult");
        C3338za c3338za = pingResult.f22779a;
        String str = c3338za.f24159a;
        int i2 = pingResult.f22780b;
        C3093k4 c3093k4 = EnumC3125m4.f23803b;
        if (i2 != -22) {
            C3109l4 c3109l4 = EnumC3157o4.f23853b;
            if (i2 != -22) {
                int i3 = c3338za.g + 1;
                if (Intrinsics.a(c3338za.f24162e, "high")) {
                    maxRetries = this.f22984c.getRetryConfig().getHigh().getMaxRetries();
                } else {
                    maxRetries = this.f22984c.getRetryConfig().getNormal().getMaxRetries();
                }
                if (i3 > maxRetries) {
                    this.f22982a.a("id = ?", new String[]{c3338za.f24160b});
                    a(pingResult.f22780b, pingResult.f22781c, (short) 2249, c3338za, pingResult.d, la);
                    return;
                }
                if (Intrinsics.a(c3338za.f24162e, "high")) {
                    pair = new Pair(Long.valueOf(this.f22984c.getRetryConfig().getHigh().getRetryInterval()), Double.valueOf(this.f22984c.getRetryConfig().getHigh().getFactor()));
                } else {
                    pair = new Pair(Long.valueOf(this.f22984c.getRetryConfig().getNormal().getRetryInterval()), Double.valueOf(this.f22984c.getRetryConfig().getNormal().getFactor()));
                }
                Long lValueOf = Long.valueOf(System.currentTimeMillis() + ((long) (Math.pow(((Number) pair.f43249Y).doubleValue(), i3) * ((Number) pair.X).longValue() * 1000)));
                String url = c3338za.f24159a;
                String id = c3338za.f24160b;
                Map headers = c3338za.f24161c;
                boolean z2 = c3338za.d;
                String priority = c3338za.f24162e;
                boolean z3 = c3338za.f;
                String ownerId = c3338za.f24163h;
                long j = c3338za.f24164i;
                C3053hc c3053hc = c3338za.k;
                Intrinsics.f(url, "url");
                Intrinsics.f(id, "id");
                Intrinsics.f(headers, "headers");
                Intrinsics.f(priority, "priority");
                Intrinsics.f(ownerId, "ownerId");
                this.f22982a.b(new C3338za(url, id, headers, z2, priority, z3, i3, ownerId, j, lValueOf, c3053hc), "id = ?", new String[]{id});
                a(pingResult.f22780b, pingResult.f22781c, (short) 2247, c3338za, pingResult.d, la);
                return;
            }
        }
        this.f22982a.a("id = ?", new String[]{c3338za.f24160b});
        a(pingResult.f22780b, "Redirect URL is malformed", (short) 2258, pingResult.f22779a, pingResult.d, la);
    }

    public static void a(int i2, String str, short s, C3338za ping, long j, La la) {
        Unit unit;
        int i3;
        Intrinsics.f(ping, "ping");
        Objects.toString(la);
        int i4 = ping.g;
        if (la != null) {
            Ia ia = (Ia) la;
            if (!ia.d.get()) {
                if ("high".equals(ping.f24162e) && ping.f && (i3 = ping.g) < 1) {
                    String str2 = ping.f24160b;
                    Ha ha = ia.f22888a;
                    if (ha != null) {
                        ((Yb) ha).a(str2, i2, str, j, i3);
                    }
                }
                String str3 = ping.f24162e;
                C3149nc c3149nc = ia.f22889b;
                if (c3149nc != null) {
                    if (str3 == null) {
                        str3 = "unknown";
                    }
                    Map mapA = c3149nc.a();
                    mapA.put("errorCode", (short) 2247);
                    mapA.put("trigger", str3);
                    mapA.put("retryCount", String.valueOf(i4));
                    Oa.a("PingFailed", mapA);
                }
            }
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            a(ping, s);
        }
    }

    public static final void a(Ma this$0, C3338za ping) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(ping, "$ping");
        this$0.a(ping);
    }
}
