package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p002kotlin.Result;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: renamed from: com.ironsource.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3629m2 {
    public static final b h = new b(null);
    private final String a;
    private final com.ironsource.mediationsdk.demandOnly.a b;
    private final C3700q2 c;
    private final JSONObject d;
    private final JSONObject e;
    private final C3522g2 f;
    private final C3716r2 g;

    /* JADX INFO: renamed from: com.ironsource.m2$a */
    public static final class a {
        private final JSONObject a;
        private final String b;
        private final String c;
        private final com.ironsource.mediationsdk.demandOnly.a d;
        private final C3700q2 e;
        private final JSONObject f;
        private final JSONObject g;
        private final C3522g2 h;
        private final C3716r2 i;

        public a(JSONObject auctionData, String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.a = auctionData;
            this.b = instanceId;
            JSONObject jSONObjectA = a(auctionData);
            this.c = auctionData.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a aVarA = a(auctionData, jSONObjectA);
            this.d = aVarA;
            this.e = c(jSONObjectA);
            this.f = d(jSONObjectA);
            this.g = b(jSONObjectA);
            this.h = a(aVarA, instanceId);
            this.i = b(aVarA, instanceId);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        public final C3629m2 a() {
            return new C3629m2(this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public final JSONObject b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final C3700q2 c(JSONObject jSONObject) {
            return new C3700q2(jSONObject);
        }

        private final C3716r2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C3700q2 c3700q2A = aVar.a(str);
            if (c3700q2A == null) {
                return null;
            }
            String strK = c3700q2A.k();
            Intrinsics.checkNotNullExpressionValue(strK, "it.serverData");
            return new C3716r2(strK);
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.d);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.h);
            if (jSONArrayOptJSONArray != null) {
                IntRange intRangeMonoploid = p002kotlin.ranges.wireman.monoploid(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it = intRangeMonoploid.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((p002kotlin.collections.kattegat) it).nextInt();
                    C3700q2 c3700q2 = new C3700q2(jSONArrayOptJSONArray.getJSONObject(iNextInt), iNextInt, jSONObjectOptJSONObject);
                    if (!c3700q2.n()) {
                        c3700q2 = null;
                    }
                    if (c3700q2 != null) {
                        arrayList2.add(c3700q2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new com.ironsource.mediationsdk.demandOnly.a.C0405a(arrayList);
        }

        private final C3522g2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C3700q2 c3700q2A = aVar.a(str);
            if (c3700q2A == null) {
                return null;
            }
            C3522g2 c3522g2 = new C3522g2();
            c3522g2.a(c3700q2A.b());
            c3522g2.c(c3700q2A.h());
            c3522g2.b(c3700q2A.g());
            return c3522g2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(JSONObject auctionData, String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return a(new a(auctionData, instanceId).a(), instanceId);
        }

        private b() {
        }

        private final Object a(C3629m2 c3629m2, String str) {
            String strB = c3629m2.b();
            if (strB != null && strB.length() != 0) {
                if (c3629m2.i()) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m3351constructorimpl(p002kotlin.dern.attabal(new Z7(C3753t5.a.f())));
                }
                C3700q2 c3700q2A = c3629m2.a(str);
                if (c3700q2A == null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m3351constructorimpl(p002kotlin.dern.attabal(new Z7(C3753t5.a.j())));
                }
                String strK = c3700q2A.k();
                if (strK != null && strK.length() != 0) {
                    return Result.m3351constructorimpl(c3629m2);
                }
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m3351constructorimpl(p002kotlin.dern.attabal(new Z7(C3753t5.a.e())));
            }
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m3351constructorimpl(p002kotlin.dern.attabal(new Z7(C3753t5.a.i())));
        }
    }

    public C3629m2(String str, com.ironsource.mediationsdk.demandOnly.a waterfall, C3700q2 genericNotifications, JSONObject jSONObject, JSONObject jSONObject2, C3522g2 c3522g2, C3716r2 c3716r2) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Intrinsics.checkNotNullParameter(genericNotifications, "genericNotifications");
        this.a = str;
        this.b = waterfall;
        this.c = genericNotifications;
        this.d = jSONObject;
        this.e = jSONObject2;
        this.f = c3522g2;
        this.g = c3716r2;
    }

    public final String a() {
        C3716r2 c3716r2 = this.g;
        if (c3716r2 != null) {
            return c3716r2.d();
        }
        return null;
    }

    public final String b() {
        return this.a;
    }

    public final C3522g2 c() {
        return this.f;
    }

    public final JSONObject d() {
        return this.e;
    }

    public final C3700q2 e() {
        return this.c;
    }

    public final JSONObject f() {
        return this.d;
    }

    public final C3716r2 g() {
        return this.g;
    }

    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.b;
    }

    public final boolean i() {
        return this.b.isEmpty();
    }

    public final C3700q2 a(String providerName) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return a(this.b, providerName);
    }

    private final C3700q2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }
}
