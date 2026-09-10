package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class fa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13886c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13888b;

    public static final class a {
        public a() {
        }

        public final fa a(JSONObject jsonObject) throws JSONException {
            Intrinsics.f(jsonObject, "jsonObject");
            String strOptString = jsonObject.optString("clickthrough_url", "https://docs.chartboost.com/opt-out");
            Intrinsics.e(strOptString, "optString(...)");
            String string = jsonObject.getString("image_url");
            Intrinsics.e(string, "getString(...)");
            return new fa(strOptString, string);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public fa(String clickthroughUrl, String imageUrl) {
        Intrinsics.f(clickthroughUrl, "clickthroughUrl");
        Intrinsics.f(imageUrl, "imageUrl");
        this.f13887a = clickthroughUrl;
        this.f13888b = imageUrl;
    }

    public final String a() {
        return this.f13887a;
    }

    public final String b() {
        return this.f13888b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return Intrinsics.a(this.f13887a, faVar.f13887a) && Intrinsics.a(this.f13888b, faVar.f13888b);
    }

    public int hashCode() {
        return this.f13888b.hashCode() + (this.f13887a.hashCode() * 31);
    }

    public String toString() {
        return androidx.datastore.preferences.protobuf.a.n("InfoIconModel(clickthroughUrl=", this.f13887a, ", imageUrl=", this.f13888b, ")");
    }
}
