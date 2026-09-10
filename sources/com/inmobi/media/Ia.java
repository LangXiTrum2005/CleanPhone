package com.inmobi.media;

import A.RunnableC0905n;
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
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Ia implements La {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ha f22888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3149nc f22889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22890c;
    public final AtomicBoolean d;

    public Ia(Ha ha, C3149nc c3149nc) {
        this.f22888a = ha;
        this.f22889b = c3149nc;
        String strM = androidx.media3.extractor.text.ttml.a.m("toString(...)");
        this.f22890c = strM;
        this.d = new AtomicBoolean(false);
        C2947b5 c2947b5 = Aa.f22691a;
        if (c2947b5 != null) {
            c2947b5.f22983b.put(strM, new WeakReference(this));
            Iterator it = c2947b5.f22983b.entrySet().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.e(next, "next(...)");
                if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        F3 f3 = Aa.f22692b;
        if (f3 != null) {
            f3.f22983b.put(strM, new WeakReference(this));
            Iterator it2 = f3.f22983b.entrySet().iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                Intrinsics.e(next2, "next(...)");
                if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                    it2.remove();
                }
            }
        }
    }

    public static final void a(Ia this$0, String json) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(json, "$json");
        try {
            for (C3338za c3338za : this$0.a(json)) {
                this$0.c(c3338za.f24162e);
                a(c3338za);
            }
        } catch (NoClassDefFoundError e2) {
            a(this$0, (short) 2245);
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        } catch (JSONException unused) {
            a(this$0, (short) 2243);
            Ha ha = this$0.f22888a;
            if (ha != null) {
                EnumC3141n4[] enumC3141n4Arr = EnumC3141n4.f23825a;
                ((Yb) ha).a("", -104, "Ping JSON is invalid", System.currentTimeMillis(), 0);
            }
        } catch (Exception e3) {
            a(this$0, (short) 2244);
            S5 s6 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e3, "event"));
        }
    }

    public final void b(String json) {
        Intrinsics.f(json, "json");
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX()).execute(new RunnableC0905n(5, this, json));
    }

    public final void c(String priority) {
        C3149nc c3149nc = this.f22889b;
        if (c3149nc != null) {
            Intrinsics.f(priority, "priority");
            Map mapA = c3149nc.a();
            mapA.put("trigger", priority);
            Oa.a("PingStarted", mapA);
        }
    }

    public static void a(C3338za c3338za) {
        Objects.toString(c3338za);
        if (Intrinsics.a(c3338za.f24162e, "high")) {
            C2947b5 c2947b5 = Aa.f22691a;
            if (c2947b5 != null) {
                c2947b5.b(c3338za);
                return;
            }
            return;
        }
        F3 f3 = Aa.f22692b;
        if (f3 != null) {
            f3.b(c3338za);
        }
    }

    public final List a(String str) {
        String host;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            a(this, (short) 2253);
            Ha ha = this.f22888a;
            if (ha != null) {
                EnumC3141n4[] enumC3141n4Arr = EnumC3141n4.f23825a;
                ((Yb) ha).a("", -105, "Ping array is empty", System.currentTimeMillis(), 0);
            }
            return EmptyList.X;
        }
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject == null) {
                a(this, (short) 2254);
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("id");
                if (strOptString != null && !StringsKt.w(strOptString)) {
                    String strOptString2 = jSONObjectOptJSONObject.optString("url");
                    if (strOptString2 != null && !StringsKt.w(strOptString2)) {
                        try {
                            URI uri = new URI(strOptString2);
                            if ((Intrinsics.a(uri.getScheme(), "http") || Intrinsics.a(uri.getScheme(), HttpRequest.DEFAULT_SCHEME)) && (host = uri.getHost()) != null && !StringsKt.w(host)) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("headers");
                                if (jSONObjectOptJSONObject2 != null) {
                                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        Intrinsics.c(next);
                                        String strOptString3 = jSONObjectOptJSONObject2.optString(next, "");
                                        Intrinsics.e(strOptString3, "optString(...)");
                                        linkedHashMap.put(next, strOptString3);
                                    }
                                }
                                boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("allowRedirects", true);
                                String strOptString4 = jSONObjectOptJSONObject.optString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "normal");
                                boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("ackRequired", false);
                                String str2 = strOptString4 == null ? "normal" : strOptString4;
                                String str3 = this.f22890c;
                                C3149nc c3149nc = this.f22889b;
                                arrayList.add(new C3338za(strOptString2, strOptString, linkedHashMap, zOptBoolean, str2, zOptBoolean2, 0, str3, System.currentTimeMillis(), null, c3149nc != null ? c3149nc.f23834a : null));
                            } else {
                                a(this, (short) 2256);
                                Ha ha2 = this.f22888a;
                                if (ha2 != null) {
                                    EnumC3141n4[] enumC3141n4Arr2 = EnumC3141n4.f23825a;
                                    ((Yb) ha2).a(strOptString, com.smartdigimkt.a6.d.o, "Ping url is invalid", System.currentTimeMillis(), 0);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        a(this, (short) 2252);
                        Ha ha3 = this.f22888a;
                        if (ha3 != null) {
                            EnumC3141n4[] enumC3141n4Arr3 = EnumC3141n4.f23825a;
                            ((Yb) ha3).a(strOptString, -103, "Ping URL is missing", System.currentTimeMillis(), 0);
                        }
                    }
                } else {
                    a(this, (short) 2255);
                    Ha ha4 = this.f22888a;
                    if (ha4 != null) {
                        Intrinsics.c(strOptString);
                        EnumC3141n4[] enumC3141n4Arr4 = EnumC3141n4.f23825a;
                        ((Yb) ha4).a(strOptString, com.smartdigimkt.a6.d.f33696n, "Ping ID is missing", System.currentTimeMillis(), 0);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void a(Ia ia, short s) {
        C3149nc c3149nc = ia.f22889b;
        if (c3149nc != null) {
            Map mapA = c3149nc.a();
            mapA.put("errorCode", Short.valueOf(s));
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            Oa.a("PingFailed", mapA);
        }
    }
}
