package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15334c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f15336b;

    public static final class a {
        public a() {
        }

        public final v a(JSONObject jsonObject) throws JSONException {
            Intrinsics.f(jsonObject, "jsonObject");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("renderables");
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                ue.a aVar = ue.f15285p;
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                Intrinsics.e(jSONObject, "getJSONObject(...)");
                arrayList.add(aVar.a(jSONObject));
            }
            w.a aVar2 = w.f15444l;
            JSONObject jSONObject2 = jsonObject.getJSONObject(com.smartdigimkt.q0.b.i0);
            Intrinsics.e(jSONObject2, "getJSONObject(...)");
            String string = jsonObject.getString("auction_id");
            Intrinsics.e(string, "getString(...)");
            return new v(arrayList, aVar2.a(jSONObject2, string));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public v(List renderables, w admConfig) {
        Intrinsics.f(renderables, "renderables");
        Intrinsics.f(admConfig, "admConfig");
        this.f15335a = renderables;
        this.f15336b = admConfig;
    }

    public final w a() {
        return this.f15336b;
    }

    public final List b() {
        return this.f15335a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.a(this.f15335a, vVar.f15335a) && Intrinsics.a(this.f15336b, vVar.f15336b);
    }

    public int hashCode() {
        return this.f15336b.hashCode() + (this.f15335a.hashCode() * 31);
    }

    public String toString() {
        return "AdMarkup(renderables=" + this.f15335a + ", admConfig=" + this.f15336b + ")";
    }
}
