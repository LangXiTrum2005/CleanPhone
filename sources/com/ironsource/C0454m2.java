package com.ironsource;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0454m2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f29224h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.demandOnly.a f29226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0526q2 f29227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f29228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f29229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0347g2 f29230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0543r2 f29231g;

    /* JADX INFO: renamed from: com.ironsource.m2$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f29232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f29234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.ironsource.mediationsdk.demandOnly.a f29235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C0526q2 f29236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final JSONObject f29237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final JSONObject f29238g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C0347g2 f29239h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final C0543r2 f29240i;

        public a(JSONObject auctionData, String instanceId) {
            kotlin.jvm.internal.n.f(auctionData, "auctionData");
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            this.f29232a = auctionData;
            this.f29233b = instanceId;
            JSONObject jSONObjectA = a(auctionData);
            this.f29234c = auctionData.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a aVarA = a(auctionData, jSONObjectA);
            this.f29235d = aVarA;
            this.f29236e = c(jSONObjectA);
            this.f29237f = d(jSONObjectA);
            this.f29238g = b(jSONObjectA);
            this.f29239h = a(aVarA, instanceId);
            this.f29240i = b(aVarA, instanceId);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        public final C0454m2 a() {
            return new C0454m2(this.f29234c, this.f29235d, this.f29236e, this.f29237f, this.f29238g, this.f29239h, this.f29240i);
        }

        public final JSONObject b() {
            return this.f29232a;
        }

        public final String c() {
            return this.f29233b;
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final C0526q2 c(JSONObject jSONObject) {
            return new C0526q2(jSONObject);
        }

        private final C0543r2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C0526q2 c0526q2A = aVar.a(str);
            if (c0526q2A == null) {
                return null;
            }
            String strK = c0526q2A.k();
            kotlin.jvm.internal.n.e(strK, "it.serverData");
            return new C0543r2(strK);
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.f29333d);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.f29337h);
            if (jSONArrayOptJSONArray != null) {
                pk.c cVarO = com.bumptech.glide.d.O(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                pk.b it = cVarO.iterator();
                while (it.f48398c) {
                    int iNextInt = it.nextInt();
                    C0526q2 c0526q2 = new C0526q2(jSONArrayOptJSONArray.getJSONObject(iNextInt), iNextInt, jSONObjectOptJSONObject);
                    if (!c0526q2.n()) {
                        c0526q2 = null;
                    }
                    if (c0526q2 != null) {
                        arrayList2.add(c0526q2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new com.ironsource.mediationsdk.demandOnly.a.C0080a(arrayList);
        }

        private final C0347g2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C0526q2 c0526q2A = aVar.a(str);
            if (c0526q2A == null) {
                return null;
            }
            C0347g2 c0347g2 = new C0347g2();
            c0347g2.a(c0526q2A.b());
            c0347g2.c(c0526q2A.h());
            c0347g2.b(c0526q2A.g());
            return c0347g2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m2$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Object a(JSONObject auctionData, String instanceId) {
            kotlin.jvm.internal.n.f(auctionData, "auctionData");
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            return a(new a(auctionData, instanceId).a(), instanceId);
        }

        private b() {
        }

        private final Object a(C0454m2 c0454m2, String str) {
            String strB = c0454m2.b();
            if (strB != null && strB.length() != 0) {
                if (c0454m2.i()) {
                    return t9.e.c(new C0263b8(C0600u5.f30795a.f()));
                }
                C0526q2 c0526q2A = c0454m2.a(str);
                if (c0526q2A == null) {
                    return t9.e.c(new C0263b8(C0600u5.f30795a.j()));
                }
                String strK = c0526q2A.k();
                return (strK == null || strK.length() == 0) ? t9.e.c(new C0263b8(C0600u5.f30795a.e())) : c0454m2;
            }
            return t9.e.c(new C0263b8(C0600u5.f30795a.i()));
        }
    }

    public C0454m2(String str, com.ironsource.mediationsdk.demandOnly.a waterfall, C0526q2 genericNotifications, JSONObject jSONObject, JSONObject jSONObject2, C0347g2 c0347g2, C0543r2 c0543r2) {
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        kotlin.jvm.internal.n.f(genericNotifications, "genericNotifications");
        this.f29225a = str;
        this.f29226b = waterfall;
        this.f29227c = genericNotifications;
        this.f29228d = jSONObject;
        this.f29229e = jSONObject2;
        this.f29230f = c0347g2;
        this.f29231g = c0543r2;
    }

    public final String a() {
        C0543r2 c0543r2 = this.f29231g;
        if (c0543r2 != null) {
            return c0543r2.d();
        }
        return null;
    }

    public final String b() {
        return this.f29225a;
    }

    public final C0347g2 c() {
        return this.f29230f;
    }

    public final JSONObject d() {
        return this.f29229e;
    }

    public final C0526q2 e() {
        return this.f29227c;
    }

    public final JSONObject f() {
        return this.f29228d;
    }

    public final C0543r2 g() {
        return this.f29231g;
    }

    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.f29226b;
    }

    public final boolean i() {
        return this.f29226b.isEmpty();
    }

    public final C0526q2 a(String providerName) {
        kotlin.jvm.internal.n.f(providerName, "providerName");
        return a(this.f29226b, providerName);
    }

    private final C0526q2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }
}
