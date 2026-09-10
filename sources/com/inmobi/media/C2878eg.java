package com.inmobi.media;

import androidx.media3.common.PlaybackException;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2878eg implements InterfaceC2904fg {
    public final InterfaceC2801bg a;
    public final C3081mi b;
    public final String c;
    public final AtomicBoolean d;

    public C2878eg(InterfaceC2801bg interfaceC2801bg, C3081mi c3081mi) {
        this.a = interfaceC2801bg;
        this.b = c3081mi;
        String id = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id, "toString(...)");
        this.c = id;
        this.d = new AtomicBoolean(false);
        F8 f8 = Uf.b;
        if (f8 != null) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(this, "listener");
            f8.b.put(id, new WeakReference(this));
            Iterator it = f8.b.entrySet().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        C3143p5 c3143p5 = Uf.c;
        if (c3143p5 != null) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(this, "listener");
            c3143p5.b.put(id, new WeakReference(this));
            Iterator it2 = c3143p5.b.entrySet().iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                    it2.remove();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        C2853dg c2853dg;
        Iterator it;
        if (continuationImpl instanceof C2853dg) {
            c2853dg = (C2853dg) continuationImpl;
            int i = c2853dg.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2853dg.d = i - Integer.MIN_VALUE;
            } else {
                c2853dg = new C2853dg(this, continuationImpl);
            }
        } else {
            c2853dg = new C2853dg(this, continuationImpl);
        }
        Object obj = c2853dg.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = c2853dg.d;
        try {
            if (i2 == 0) {
                dern.saneness(obj);
                it = a(str).iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c2853dg.a;
                dern.saneness(obj);
            }
            while (it.hasNext()) {
                Rf rf = (Rf) it.next();
                b(rf.e);
                c2853dg.a = it;
                c2853dg.d = 1;
                if (a(rf, c2853dg) == objBeachfront) {
                    return objBeachfront;
                }
            }
        } catch (NoClassDefFoundError e) {
            a(this, (short) 2245);
            e.getMessage();
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(e));
        } catch (JSONException e2) {
            a(this, (short) 2243);
            InterfaceC2801bg interfaceC2801bg = this.a;
            if (interfaceC2801bg != null) {
                Z5[] z5Arr = Z5.a;
                ((Yh) interfaceC2801bg).a("", PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT, "Ping JSON is invalid", System.currentTimeMillis(), 0);
            }
            e2.getMessage();
        } catch (Exception e3) {
            a(this, (short) 2244);
            e3.getMessage();
            taiyuan taiyuanVar2 = P9.a;
            AbstractC2973i9.a(e3);
        }
        return Unit.f29295attabal;
    }

    public final void b(String priority) {
        C3081mi c3081mi = this.b;
        if (c3081mi != null) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Map mapA = c3081mi.a();
            mapA.put("trigger", priority);
            AbstractC3004jg.a("PingStarted", mapA);
        }
    }

    public static Object a(Rf rf, C2853dg c2853dg) {
        Objects.toString(rf);
        if (Intrinsics.wireman(rf.e, "high")) {
            F8 f8 = Uf.b;
            if (f8 != null) {
                Object objB = f8.b(rf, c2853dg);
                if (objB != attabal.beachfront()) {
                    objB = Unit.f29295attabal;
                }
                return objB == attabal.beachfront() ? objB : Unit.f29295attabal;
            }
        } else {
            C3143p5 c3143p5 = Uf.c;
            if (c3143p5 != null) {
                Object objA = c3143p5.a(rf, c2853dg);
                if (objA != attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
            }
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            a(this, (short) 2253);
            InterfaceC2801bg interfaceC2801bg = this.a;
            if (interfaceC2801bg != null) {
                Z5[] z5Arr = Z5.a;
                ((Yh) interfaceC2801bg).a("", PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED, "Ping array is empty", System.currentTimeMillis(), 0);
            }
            return adultoid.formularize();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            Object rf = null;
            if (jSONObjectOptJSONObject == null) {
                a(this, (short) 2254);
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("id");
                if (strOptString != null && !StringsKt.empress(strOptString)) {
                    String strOptString2 = jSONObjectOptJSONObject.optString("url");
                    if (a(strOptString, strOptString2)) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("headers");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (jSONObjectOptJSONObject2 != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                linkedHashMap.put(next, jSONObjectOptJSONObject2.optString(next, ""));
                            }
                        }
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("allowRedirects", true);
                        String strOptString3 = jSONObjectOptJSONObject.optString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "normal");
                        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("ackRequired", false);
                        Intrinsics.beachfront(strOptString2);
                        String str2 = strOptString3 == null ? "normal" : strOptString3;
                        String str3 = this.c;
                        C3081mi c3081mi = this.b;
                        rf = new Rf(strOptString2, strOptString, linkedHashMap, zOptBoolean, str2, zOptBoolean2, 0, str3, System.currentTimeMillis(), null, c3081mi != null ? c3081mi.a : null);
                    }
                } else {
                    Intrinsics.beachfront(strOptString);
                    a(this, (short) 2255);
                    InterfaceC2801bg interfaceC2801bg2 = this.a;
                    if (interfaceC2801bg2 != null) {
                        Z5[] z5Arr2 = Z5.a;
                        ((Yh) interfaceC2801bg2).a(strOptString, -101, "Ping ID is missing", System.currentTimeMillis(), 0);
                    }
                }
            }
            if (rf != null) {
                arrayList.add(rf);
            }
        }
        return arrayList;
    }

    public final boolean a(String str, String str2) {
        String host;
        if (str2 != null && !StringsKt.empress(str2)) {
            try {
                URI uri = new URI(str2);
                if ((Intrinsics.wireman(uri.getScheme(), "http") || Intrinsics.wireman(uri.getScheme(), HttpRequest.DEFAULT_SCHEME)) && (host = uri.getHost()) != null && !StringsKt.empress(host)) {
                    return true;
                }
            } catch (Exception unused) {
            }
            a(this, (short) 2256);
            InterfaceC2801bg interfaceC2801bg = this.a;
            if (interfaceC2801bg != null) {
                Z5[] z5Arr = Z5.a;
                ((Yh) interfaceC2801bg).a(str, PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED, "Ping url is invalid", System.currentTimeMillis(), 0);
            }
            return false;
        }
        a(this, (short) 2252);
        InterfaceC2801bg interfaceC2801bg2 = this.a;
        if (interfaceC2801bg2 != null) {
            Z5[] z5Arr2 = Z5.a;
            ((Yh) interfaceC2801bg2).a(str, PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED, "Ping URL is missing", System.currentTimeMillis(), 0);
        }
        return false;
    }

    public final void a(Rf ping, int i, long j) {
        InterfaceC2801bg interfaceC2801bg;
        Intrinsics.checkNotNullParameter(ping, "ping");
        if (this.d.get()) {
            return;
        }
        String str = ping.a;
        if (Intrinsics.wireman("high", ping.e) && ping.f && (interfaceC2801bg = this.a) != null) {
            ((Yh) interfaceC2801bg).a(ping.b, i, null, j, ping.g);
        }
        String priority = ping.e;
        long jCurrentTimeMillis = System.currentTimeMillis() - ping.i;
        C3081mi c3081mi = this.b;
        if (c3081mi != null) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Map mapA = c3081mi.a();
            mapA.put("trigger", priority);
            mapA.put("latency", Long.valueOf(jCurrentTimeMillis));
            AbstractC3004jg.a("PingSuccess", mapA);
        }
    }

    public final void a(Rf ping, int i, String str, int i2, long j) {
        InterfaceC2801bg interfaceC2801bg;
        Intrinsics.checkNotNullParameter(ping, "ping");
        if (this.d.get()) {
            return;
        }
        String str2 = ping.a;
        if (Intrinsics.wireman("high", ping.e) && ping.f && ping.g < 1 && (interfaceC2801bg = this.a) != null) {
            ((Yh) interfaceC2801bg).a(ping.b, i, str, j, ping.g);
        }
        String priority = ping.e;
        C3081mi c3081mi = this.b;
        if (c3081mi != null) {
            if (priority == null) {
                priority = "unknown";
            }
            Intrinsics.checkNotNullParameter(priority, "priority");
            Map mapA = c3081mi.a();
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2247);
            mapA.put("trigger", priority);
            mapA.put("retryCount", String.valueOf(i2));
            AbstractC3004jg.a("PingFailed", mapA);
        }
    }

    public static void a(C2878eg c2878eg, short s) {
        C3081mi c3081mi = c2878eg.b;
        if (c3081mi != null) {
            Intrinsics.checkNotNullParameter("unknown", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3081mi.a();
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            AbstractC3004jg.a("PingFailed", mapA);
        }
    }
}
