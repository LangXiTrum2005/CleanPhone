package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class x6 {
    public static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15520c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15521e;

    public static final class a {
        public a() {
        }

        public final x6 a(JSONObject jsonObject) throws JSONException {
            Intrinsics.f(jsonObject, "jsonObject");
            String string = jsonObject.getString("type");
            Intrinsics.e(string, "getString(...)");
            String string2 = jsonObject.getString("http_method");
            Intrinsics.e(string2, "getString(...)");
            String string3 = jsonObject.getString("url");
            Intrinsics.e(string3, "getString(...)");
            String strOptString = jsonObject.optString("body");
            Intrinsics.e(strOptString, "optString(...)");
            return new x6(string, string2, string3, strOptString, jsonObject.optString("content_type", null));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum b {
        RENDER("render"),
        CLICK("click"),
        ENGAGEMENT("engagement"),
        CLOSE("close"),
        EXPIRATION("expiration"),
        IMPRESSION("impression"),
        LOAD("load"),
        REWARD("reward"),
        SHOW("show"),
        SKIP("skip");


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f15527n = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15528b;

        b(String str) {
            this.f15528b = str;
        }

        public final String b() {
            return this.f15528b;
        }
    }

    public x6(String type, String httpMethod, String url, String body, String str) {
        Intrinsics.f(type, "type");
        Intrinsics.f(httpMethod, "httpMethod");
        Intrinsics.f(url, "url");
        Intrinsics.f(body, "body");
        this.f15518a = type;
        this.f15519b = httpMethod;
        this.f15520c = url;
        this.d = body;
        this.f15521e = str;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f15521e;
    }

    public final String c() {
        return this.f15519b;
    }

    public final String d() {
        return this.f15518a;
    }

    public final String e() {
        return this.f15520c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj;
        return Intrinsics.a(this.f15518a, x6Var.f15518a) && Intrinsics.a(this.f15519b, x6Var.f15519b) && Intrinsics.a(this.f15520c, x6Var.f15520c) && Intrinsics.a(this.d, x6Var.d) && Intrinsics.a(this.f15521e, x6Var.f15521e);
    }

    public int hashCode() {
        int iB = androidx.datastore.preferences.protobuf.a.b(this.d, androidx.datastore.preferences.protobuf.a.b(this.f15520c, androidx.datastore.preferences.protobuf.a.b(this.f15519b, this.f15518a.hashCode() * 31, 31), 31), 31);
        String str = this.f15521e;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f15518a;
        String str2 = this.f15519b;
        String str3 = this.f15520c;
        String str4 = this.d;
        String str5 = this.f15521e;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("EventTracker(type=", str, ", httpMethod=", str2, ", url=");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str3, ", body=", str4, ", contentType=");
        return android.support.v4.media.a.r(sbQ, str5, ")");
    }
}
