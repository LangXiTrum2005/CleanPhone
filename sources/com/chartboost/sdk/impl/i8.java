package com.chartboost.sdk.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class i8 {
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f14166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14168c;

    public static final class a {
        public a() {
        }

        public final i8 a(JSONObject jsonObject) {
            int length;
            int i2;
            String strOptString;
            Intrinsics.f(jsonObject, "jsonObject");
            URL url = null;
            try {
                String strOptString2 = jsonObject.optString("base_url");
                Intrinsics.c(strOptString2);
                if (StringsKt.w(strOptString2)) {
                    strOptString2 = null;
                }
                if (strOptString2 != null) {
                    url = new URL(strOptString2);
                }
            } catch (MalformedURLException e2) {
                za.a("Unable to create baseUrl.", e2);
            }
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("scripts");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                length = jSONArrayOptJSONArray.length();
                i2 = 0;
            } else {
                length = 0;
                i2 = 0;
            }
            while (i2 < length) {
                if (jSONArrayOptJSONArray != null && (strOptString = jSONArrayOptJSONArray.optString(i2)) != null) {
                    arrayList.add(strOptString);
                }
                i2++;
            }
            return new i8(url, arrayList, jsonObject.optBoolean("strict_mraid_open", false));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public i8(URL url, List scripts, boolean z2) {
        Intrinsics.f(scripts, "scripts");
        this.f14166a = url;
        this.f14167b = scripts;
        this.f14168c = z2;
    }

    public final URL a() {
        return this.f14166a;
    }

    public final List b() {
        return this.f14167b;
    }

    public final boolean c() {
        return this.f14168c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return Intrinsics.a(this.f14166a, i8Var.f14166a) && Intrinsics.a(this.f14167b, i8Var.f14167b) && this.f14168c == i8Var.f14168c;
    }

    public int hashCode() {
        URL url = this.f14166a;
        return Boolean.hashCode(this.f14168c) + androidx.media3.extractor.text.ttml.a.c((url == null ? 0 : url.hashCode()) * 31, 31, this.f14167b);
    }

    public String toString() {
        URL url = this.f14166a;
        List list = this.f14167b;
        boolean z2 = this.f14168c;
        StringBuilder sb = new StringBuilder("HTMLConfig(baseUrl=");
        sb.append(url);
        sb.append(", scripts=");
        sb.append(list);
        sb.append(", strictMraidOpen=");
        return android.support.v4.media.a.t(sb, z2, ")");
    }
}
