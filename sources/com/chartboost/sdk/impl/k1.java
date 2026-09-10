package com.chartboost.sdk.impl;

import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 {
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f14316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14318c;

    public static final class a {
        public a() {
        }

        public final k1 a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("icon");
            Intrinsics.c(strOptString);
            if (StringsKt.w(strOptString) || strOptString.equals(AbstractJsonLexerKt.NULL)) {
                strOptString = null;
            }
            URL url = strOptString != null ? new URL(strOptString) : null;
            String strOptString2 = jSONObject.optString("title");
            if (Intrinsics.a(strOptString2, AbstractJsonLexerKt.NULL)) {
                strOptString2 = null;
            }
            if (strOptString2 == null) {
                strOptString2 = "";
            }
            String strOptString3 = jSONObject.optString("button_text", "Get");
            String str = Intrinsics.a(strOptString3, AbstractJsonLexerKt.NULL) ? null : strOptString3;
            return new k1(url, strOptString2, str != null ? str : "Get");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public k1(URL url, String title, String buttonText) {
        Intrinsics.f(title, "title");
        Intrinsics.f(buttonText, "buttonText");
        this.f14316a = url;
        this.f14317b = title;
        this.f14318c = buttonText;
    }

    public final String a() {
        return this.f14318c;
    }

    public final URL b() {
        return this.f14316a;
    }

    public final String c() {
        return this.f14317b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Intrinsics.a(this.f14316a, k1Var.f14316a) && Intrinsics.a(this.f14317b, k1Var.f14317b) && Intrinsics.a(this.f14318c, k1Var.f14318c);
    }

    public int hashCode() {
        URL url = this.f14316a;
        return this.f14318c.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.f14317b, (url == null ? 0 : url.hashCode()) * 31, 31);
    }

    public String toString() {
        URL url = this.f14316a;
        String str = this.f14317b;
        String str2 = this.f14318c;
        StringBuilder sb = new StringBuilder("AppInstallButton(iconUrl=");
        sb.append(url);
        sb.append(", title=");
        sb.append(str);
        sb.append(", buttonText=");
        return android.support.v4.media.a.r(sb, str2, ")");
    }
}
