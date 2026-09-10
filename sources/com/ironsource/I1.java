package com.ironsource;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f26263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f26264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f26265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f26266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f26267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f26268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<Integer> f26269k;
    private final List<Integer> l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<Integer> f26270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<Integer> f26271n;

    public I1(JSONObject applicationEvents) {
        kotlin.jvm.internal.n.f(applicationEvents, "applicationEvents");
        String it = applicationEvents.optString("abt");
        kotlin.jvm.internal.n.e(it, "it");
        this.f26259a = it.length() <= 0 ? null : it;
        this.f26260b = applicationEvents.optBoolean(K1.f26366a, false);
        this.f26261c = applicationEvents.optBoolean(K1.f26367b, false);
        this.f26262d = applicationEvents.optBoolean(K1.f26368c, false);
        this.f26263e = applicationEvents.optInt(K1.f26369d, -1);
        String strOptString = applicationEvents.optString(K1.f26370e);
        kotlin.jvm.internal.n.e(strOptString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.f26264f = strOptString;
        String strOptString2 = applicationEvents.optString(K1.f26371f);
        kotlin.jvm.internal.n.e(strOptString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.f26265g = strOptString2;
        this.f26266h = applicationEvents.optInt(K1.f26372g, -1);
        this.f26267i = applicationEvents.optInt(K1.f26373h, -1);
        this.f26268j = applicationEvents.optInt(K1.f26374i, 5000);
        this.f26269k = a(applicationEvents, K1.f26375j);
        this.l = a(applicationEvents, K1.f26376k);
        this.f26270m = a(applicationEvents, K1.l);
        this.f26271n = a(applicationEvents, K1.f26377m);
    }

    public final String a() {
        return this.f26259a;
    }

    public final int b() {
        return this.f26266h;
    }

    public final boolean c() {
        return this.f26262d;
    }

    public final int d() {
        return this.f26263e;
    }

    public final String e() {
        return this.f26265g;
    }

    public final int f() {
        return this.f26268j;
    }

    public final int g() {
        return this.f26267i;
    }

    public final List<Integer> h() {
        return this.f26271n;
    }

    public final List<Integer> i() {
        return this.l;
    }

    public final List<Integer> j() {
        return this.f26269k;
    }

    public final boolean k() {
        return this.f26261c;
    }

    public final boolean l() {
        return this.f26260b;
    }

    public final String m() {
        return this.f26264f;
    }

    public final List<Integer> n() {
        return this.f26270m;
    }

    private final List<Integer> a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return xj.v.f53866a;
        }
        pk.c cVarO = com.bumptech.glide.d.O(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(xj.p.W(cVarO, 10));
        pk.b it = cVarO.iterator();
        while (it.f48398c) {
            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(it.nextInt())));
        }
        return arrayList;
    }
}
