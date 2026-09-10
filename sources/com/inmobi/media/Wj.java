package com.inmobi.media;

import com.inmobi.media.I2;
import com.inmobi.media.Wj;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import p002kotlin.text.StringsKt;
import patroclinal.formularize;
import patroclinal.taiyuan;

/* JADX INFO: loaded from: classes3.dex */
public final class Wj implements Jf {
    public static final Wj a = new Wj();
    public static final String b;
    public static final List c;
    public static final taiyuan d;
    public static final AtomicBoolean e;
    public static C3044l6 f;
    public static volatile C3008jk g;
    public static final Function1 h;
    public static C2908fk i;

    static {
        String simpleName = Wj.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        b = simpleName;
        List listPolloi = adultoid.polloi("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdRequestPayloadCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed", "ImmersiveNotSupported", "AdNotReady", "IAPFetchFailed", "BillingClientConnectionError", "BillingClientNotCompatible", "PingFailed", "PingStarted", "PingSuccess", "CompanionWebViewLoadCalled", "CompanionWebViewLoadFailed", "CompanionFireAdReady", "CompanionFireAdFailed", "CompanionWebViewPageStarted", "CompanionWebViewLoadFinished", "AttachedToWindow", "VideoLoadStarted", "VideoLoadSuccess", "VideoLoadFailure", "VideoStart", "VideoFirstQuartile", "VideoSecondQuartile", "VideoThirdQuartile", "VideoComplete", "VideoDestroyed");
        c = listPolloi;
        d = saneness.saneness(new Function0() { // from class: adsuki.aristocrat
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wj.c();
            }
        });
        e = new AtomicBoolean(false);
        Vj vj = new Vj();
        h = new Function1() { // from class: adsuki.dispope
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wj.a((I2) obj);
            }
        };
        TelemetryConfig telemetryConfigB = b();
        g = new C3008jk(new Yj(telemetryConfigB.getEnabled(), telemetryConfigB.getAssetReporting().isImageEnabled(), telemetryConfigB.getAssetReporting().isGifEnabled(), telemetryConfigB.getAssetReporting().isVideoEnabled(), telemetryConfigB.getDisableAllGeneralEvents(), telemetryConfigB.getPriorityEventsList(), telemetryConfigB.getSamplingFactor()), CollectionsKt.molet(listPolloi));
        Y3.a("telemetry", vj);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Unit a(I2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = it.a;
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case Opcodes.FCMPG /* 150 */:
                    C2908fk c2908fk = i;
                    if (c2908fk != null) {
                        Map map = it.c;
                        Object obj = map != null ? map.get("data") : null;
                        c2908fk.a("CrashEventOccurred", obj instanceof T4 ? (T4) obj : null);
                    }
                    break;
                case Opcodes.DCMPL /* 151 */:
                    C2908fk c2908fk2 = i;
                    if (c2908fk2 != null) {
                        Map map2 = it.c;
                        Object obj2 = map2 != null ? map2.get("data") : null;
                        Wn wn = obj2 instanceof Wn ? (Wn) obj2 : null;
                        if (wn != null && AbstractC2984il.a(wn)) {
                            C3342x5.a.getClass();
                            if (!C3342x5.r()) {
                                c2908fk2.a("MainThreadBlockedEvent", wn);
                            }
                        }
                    }
                    break;
                case Opcodes.DCMPG /* 152 */:
                    C2908fk c2908fk3 = i;
                    if (c2908fk3 != null) {
                        Map map3 = it.c;
                        Object obj3 = map3 != null ? map3.get("data") : null;
                        c2908fk3.a(obj3 instanceof C3388z1 ? (C3388z1) obj3 : null);
                    }
                    break;
            }
        } else {
            e.set(false);
            C3044l6 c3044l6 = f;
            if (c3044l6 != null) {
                c3044l6.f.set(false);
                c3044l6.g.set(true);
                c3044l6.h.clear();
                c3044l6.j = null;
            }
            f = null;
            i = null;
            ((C3349xc) Ji.e.getValue()).a(h);
        }
        return Unit.f29295attabal;
    }

    public static final void b(String eventType, Map keyValueMap, EnumC2779ak telemetryEventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
        cutely.wireman(A9.c, null, null, new Uj(eventType, keyValueMap, telemetryEventType, null), 3, null);
    }

    public static final C2857dk c() {
        return new C2857dk(AbstractC2948h9.b());
    }

    public static TelemetryConfig b() {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        return (TelemetryConfig) Y3.a.a(TelemetryConfig.class);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(ContinuationImpl continuationImpl) {
        Tj tj;
        if (continuationImpl instanceof Tj) {
            tj = (Tj) continuationImpl;
            int i2 = tj.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tj.b = i2 - Integer.MIN_VALUE;
            } else {
                tj = new Tj(continuationImpl);
            }
        } else {
            tj = new Tj(continuationImpl);
        }
        Object obj = tj.a;
        Object objBeachfront = attabal.beachfront();
        int i3 = tj.b;
        if (i3 == 0) {
            dern.saneness(obj);
            if (!e.getAndSet(true)) {
                Wj wj = a;
                tj.b = 1;
                if (wj.a((ContinuationImpl) tj) == objBeachfront) {
                    return objBeachfront;
                }
            }
            return Unit.f29295attabal;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dern.saneness(obj);
        ((C3349xc) Ji.e.getValue()).a(new int[]{2, 1, Opcodes.FCMPG, Opcodes.DCMPG, Opcodes.DCMPL}, h);
        i = new C2908fk(b());
        return Unit.f29295attabal;
    }

    public static boolean a(String eventType, Map keyValueMap, EnumC2779ak telemetryEventType) {
        boolean zA;
        C3008jk c3008jk = g;
        if (c3008jk == null) {
            Intrinsics.preprohormone("mTelemetryValidator");
            c3008jk = null;
        }
        c3008jk.getClass();
        Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (c3008jk.a.a) {
            int iOrdinal = telemetryEventType.ordinal();
            if (iOrdinal == 0) {
                zA = c3008jk.b.a(eventType, keyValueMap);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                zA = true;
            }
        } else {
            zA = false;
        }
        return !zA;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r9.a(r8, (p002kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        if (r8 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.C2882ek r8, p002kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wj.a(com.inmobi.media.ek, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a() {
        if (e.get()) {
            C2817c6 eventConfig = b().getEventConfig();
            eventConfig.k = b().getTelemetryUrl();
            C3044l6 c3044l6 = f;
            if (c3044l6 == null) {
                f = new C3044l6("telemetry", (C2857dk) d.getValue(), this, eventConfig, this);
            } else {
                Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
                c3044l6.j = eventConfig;
            }
            C3044l6 c3044l7 = f;
            if (c3044l7 != null) {
                c3044l7.a(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        Qj qj;
        if (continuationImpl instanceof Qj) {
            qj = (Qj) continuationImpl;
            int i2 = qj.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qj.c = i2 - Integer.MIN_VALUE;
            } else {
                qj = new Qj(this, continuationImpl);
            }
        } else {
            qj = new Qj(this, continuationImpl);
        }
        Object objA = qj.a;
        Object objBeachfront = attabal.beachfront();
        int i3 = qj.c;
        if (i3 == 0) {
            dern.saneness(objA);
            C2857dk c2857dk = (C2857dk) d.getValue();
            qj.c = 1;
            objA = c2857dk.a(qj);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(objA);
        }
        if (((Number) objA).intValue() > 0) {
            a();
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.Jf
    public final Object a(wretchedly.dern dernVar) {
        Rj rj;
        int iA;
        int i2;
        String string;
        if (dernVar instanceof Rj) {
            rj = (Rj) dernVar;
            int i3 = rj.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rj.d = i3 - Integer.MIN_VALUE;
            } else {
                rj = new Rj(this, (ContinuationImpl) dernVar);
            }
        } else {
            rj = new Rj(this, (ContinuationImpl) dernVar);
        }
        Object obj = rj.b;
        Object objBeachfront = attabal.beachfront();
        int i4 = rj.d;
        if (i4 == 0) {
            dern.saneness(obj);
            C3342x5.a.getClass();
            if (C3342x5.l() == 1) {
                iA = b().getWifiConfig().a();
            } else {
                iA = b().getMobileConfig().a();
            }
            C2857dk c2857dk = (C2857dk) d.getValue();
            rj.a = iA;
            rj.d = 1;
            Object objB = c2857dk.b(iA, rj);
            if (objB == objBeachfront) {
                return objBeachfront;
            }
            i2 = iA;
            obj = objB;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = rj.a;
            dern.saneness(obj);
        }
        List<C2882ek> listBasify = CollectionsKt.basify((Collection) obj);
        if (!a("DatabaseMaxLimitReachedV2", seminary.taiyuan(), EnumC2779ak.SDK) && listBasify.size() < i2 && AbstractC2805bk.a() > 0) {
            int iA2 = AbstractC2805bk.a();
            C2882ek c2882ek = new C2882ek("DatabaseMaxLimitReachedV2", null, "sdk");
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            HashMap mapApical = seminary.apical(formularize.attabal("eventId", string2), formularize.attabal("eventType", "DatabaseMaxLimitReachedV2"), formularize.attabal("samplingRate", 100), formularize.attabal("isTemplateEvent", Boolean.FALSE), formularize.attabal("eventLostCount", Integer.valueOf(iA2)));
            Intrinsics.competently(mapApical, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            String payload = new JSONObject(mapApical).toString();
            Intrinsics.checkNotNullExpressionValue(payload, "toString(...)");
            Intrinsics.checkNotNullParameter(payload, "payload");
            c2882ek.b = payload;
            AbstractC2805bk.c = igo.attabal.wireman(c2882ek.d);
            listBasify.add(c2882ek);
        }
        if (listBasify.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listBasify.iterator();
        while (it.hasNext()) {
            arrayList.add(igo.attabal.wireman(((C2882ek) it.next()).d));
        }
        try {
            String str = Ji.c;
            if (str == null) {
                str = "";
            }
            Map mapKowloon = seminary.kowloon(formularize.attabal("im-accid", str), formularize.attabal("version", "4.0.0"), formularize.attabal("mk-version", Ki.a()), formularize.attabal("u-appbid", A1.a), formularize.attabal("tp", Ki.b));
            String str2 = Ki.a;
            if (str2 != null) {
                mapKowloon.put("tp-v", str2);
            }
            Intrinsics.competently(mapKowloon, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            JSONObject jSONObject = new JSONObject(mapKowloon);
            JSONArray jSONArray = new JSONArray();
            for (C2882ek c2882ek2 : listBasify) {
                String str3 = c2882ek2.b;
                if (str3 == null) {
                    str3 = "";
                }
                if (StringsKt.stupefactive(str3).toString().length() > 0) {
                    String str4 = c2882ek2.b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    JSONObject jSONObject2 = new JSONObject(str4);
                    jSONObject2.put("dts", c2882ek2.c);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("payload", jSONArray);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        if (string != null) {
            return new C2868e6(string, arrayList);
        }
        return null;
    }
}
