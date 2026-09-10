package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2979ig {
    public final C3129og a;
    public final ConcurrentHashMap b;
    public final Cif c;

    public AbstractC2979ig(C3129og dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.a = dao;
        this.b = new ConcurrentHashMap();
        this.c = new Cif(a());
    }

    public static void a(Rf rf, short s) {
        C2932gi c2932gi = rf.k;
        if (c2932gi == null) {
            Gi gi = AbstractC3004jg.a;
            AbstractC3004jg.a("PingFailed", seminary.kowloon(formularize.attabal("trigger", rf.e), formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)), formularize.attabal("retryCount", Integer.valueOf(rf.g))));
            return;
        }
        C3081mi c3081mi = new C3081mi(c2932gi);
        String priority = rf.e;
        int i = rf.g;
        Intrinsics.checkNotNullParameter(priority, "priority");
        Map mapA = c3081mi.a();
        mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        mapA.put("trigger", priority);
        mapA.put("retryCount", String.valueOf(i));
        AbstractC3004jg.a("PingFailed", mapA);
    }

    public static AdConfig.PingsV2Config a() {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) Y3.a.a(AdConfig.class)).getPingV2();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r11, p002kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC2979ig.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void a(int i, String str, short s, Rf ping, long j, InterfaceC2904fg interfaceC2904fg) {
        Intrinsics.checkNotNullParameter(ping, "ping");
        Intrinsics.checkNotNullExpressionValue(AbstractC2979ig.class.getSimpleName(), "getSimpleName(...)");
        String str2 = ping.a;
        Intrinsics.checkNotNullExpressionValue(AbstractC2979ig.class.getSimpleName(), "getSimpleName(...)");
        Objects.toString(interfaceC2904fg);
        if (interfaceC2904fg != null) {
            ((C2878eg) interfaceC2904fg).a(ping, i, str, ping.g, j);
        } else {
            a(ping, s);
        }
    }

    public static void a(Xf xf, InterfaceC2904fg interfaceC2904fg) {
        Intrinsics.checkNotNullExpressionValue(AbstractC2979ig.class.getSimpleName(), "getSimpleName(...)");
        String str = xf.a.a;
        Objects.toString(interfaceC2904fg);
        if (interfaceC2904fg != null) {
            ((C2878eg) interfaceC2904fg).a(xf.a, xf.b, xf.d);
            return;
        }
        Rf rf = xf.a;
        C2932gi c2932gi = rf.k;
        if (c2932gi != null) {
            C3081mi c3081mi = new C3081mi(c2932gi);
            String priority = rf.e;
            long j = rf.i;
            Intrinsics.checkNotNullParameter(priority, "priority");
            Map mapA = c3081mi.a();
            mapA.put("trigger", priority);
            mapA.put("latency", Long.valueOf(j));
            AbstractC3004jg.a("PingSuccess", mapA);
            return;
        }
        Gi gi = AbstractC3004jg.a;
        AbstractC3004jg.a("PingSuccess", seminary.kowloon(formularize.attabal("trigger", rf.e), formularize.attabal("retryCount", Integer.valueOf(rf.g))));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object a(Xf xf, InterfaceC2904fg interfaceC2904fg, dern dernVar) {
        C2930gg c2930gg;
        int maxRetries;
        Pair pair;
        Rf rf;
        Rf rf2;
        InterfaceC2904fg interfaceC2904fg2;
        Xf xf2 = xf;
        InterfaceC2904fg interfaceC2904fg3 = interfaceC2904fg;
        if (dernVar instanceof C2930gg) {
            c2930gg = (C2930gg) dernVar;
            int i = c2930gg.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2930gg.f = i - Integer.MIN_VALUE;
            } else {
                c2930gg = new C2930gg(this, dernVar);
            }
        } else {
            c2930gg = new C2930gg(this, dernVar);
        }
        C2930gg c2930gg2 = c2930gg;
        Object obj = c2930gg2.d;
        Object objBeachfront = attabal.beachfront();
        int i2 = c2930gg2.f;
        if (i2 != 0) {
            if (i2 == 1) {
                InterfaceC2904fg interfaceC2904fg4 = c2930gg2.b;
                Xf xf3 = c2930gg2.a;
                p002kotlin.dern.saneness(obj);
                interfaceC2904fg2 = interfaceC2904fg4;
                xf2 = xf3;
                a(xf2.b, "Redirect URL is malformed", (short) 2258, xf2.a, xf2.d, interfaceC2904fg2);
                return Unit.f29295attabal;
            }
            if (i2 == 2) {
                Rf rf3 = c2930gg2.c;
                interfaceC2904fg3 = c2930gg2.b;
                Xf xf4 = c2930gg2.a;
                p002kotlin.dern.saneness(obj);
                rf2 = rf3;
                xf2 = xf4;
                a(xf2.b, xf2.c, (short) 2249, rf2, xf2.d, interfaceC2904fg3);
                return Unit.f29295attabal;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Rf rf4 = c2930gg2.c;
            interfaceC2904fg3 = c2930gg2.b;
            Xf xf5 = c2930gg2.a;
            p002kotlin.dern.saneness(obj);
            rf = rf4;
            xf2 = xf5;
            a(xf2.b, xf2.c, (short) 2247, rf, xf2.d, interfaceC2904fg3);
            return Unit.f29295attabal;
        }
        p002kotlin.dern.saneness(obj);
        String str = xf2.a.a;
        int i3 = xf2.b;
        Y5 y5 = EnumC2765a6.b;
        if (i3 == 178) {
            String str2 = xf2.a.a;
            C3129og c3129og = this.a;
            Rf rf5 = xf2.a;
            c2930gg2.a = xf2;
            c2930gg2.b = interfaceC2904fg3;
            c2930gg2.f = 1;
            Object objA = c3129og.a.a("pings", "id=?", new String[]{rf5.b}, c2930gg2);
            if (objA != attabal.beachfront()) {
                objA = Unit.f29295attabal;
            }
            if (objA != objBeachfront) {
                interfaceC2904fg2 = interfaceC2904fg3;
                a(xf2.b, "Redirect URL is malformed", (short) 2258, xf2.a, xf2.d, interfaceC2904fg2);
                return Unit.f29295attabal;
            }
        } else {
            Rf rf6 = xf2.a;
            int i4 = rf6.g + 1;
            if (Intrinsics.wireman(rf6.e, "high")) {
                maxRetries = a().getRetryConfig().getHigh().getMaxRetries();
            } else {
                maxRetries = a().getRetryConfig().getNormal().getMaxRetries();
            }
            if (i4 > maxRetries) {
                C3129og c3129og2 = this.a;
                c2930gg2.a = xf2;
                c2930gg2.b = interfaceC2904fg3;
                c2930gg2.c = rf6;
                c2930gg2.f = 2;
                Object objA2 = c3129og2.a.a("pings", "id=?", new String[]{rf6.b}, c2930gg2);
                if (objA2 != attabal.beachfront()) {
                    objA2 = Unit.f29295attabal;
                }
                if (objA2 != objBeachfront) {
                    rf2 = rf6;
                    a(xf2.b, xf2.c, (short) 2249, rf2, xf2.d, interfaceC2904fg3);
                    return Unit.f29295attabal;
                }
            } else {
                if (Intrinsics.wireman(rf6.e, "high")) {
                    pair = new Pair(igo.attabal.marial(a().getRetryConfig().getHigh().getRetryInterval()), igo.attabal.saneness(a().getRetryConfig().getHigh().getFactor()));
                } else {
                    pair = new Pair(igo.attabal.marial(a().getRetryConfig().getNormal().getRetryInterval()), igo.attabal.saneness(a().getRetryConfig().getNormal().getFactor()));
                }
                Long lMarial = igo.attabal.marial(System.currentTimeMillis() + ((long) (Math.pow(((Number) pair.component2()).doubleValue(), i4) * ((Number) pair.component1()).longValue() * 1000)));
                String url = rf6.a;
                String id = rf6.b;
                Map headers = rf6.c;
                boolean z = rf6.d;
                String priority = rf6.e;
                boolean z2 = rf6.f;
                String ownerId = rf6.h;
                long j = rf6.i;
                C2932gi c2932gi = rf6.k;
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(headers, "headers");
                Intrinsics.checkNotNullParameter(priority, "priority");
                Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                Rf rf7 = new Rf(url, id, headers, z, priority, z2, i4, ownerId, j, lMarial, c2932gi);
                C3129og c3129og3 = this.a;
                c2930gg2.a = xf2;
                c2930gg2.b = interfaceC2904fg3;
                c2930gg2.c = rf6;
                c2930gg2.f = 3;
                Object objA3 = C2923g9.a(c3129og3.a, "pings", AbstractC3154pg.a(rf7), "id=?", new String[]{id}, c2930gg2, 16);
                if (objA3 != attabal.beachfront()) {
                    objA3 = Unit.f29295attabal;
                }
                if (objA3 != objBeachfront) {
                    rf = rf6;
                    a(xf2.b, xf2.c, (short) 2247, rf, xf2.d, interfaceC2904fg3);
                    return Unit.f29295attabal;
                }
            }
        }
        return objBeachfront;
    }
}
