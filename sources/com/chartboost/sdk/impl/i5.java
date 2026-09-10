package com.chartboost.sdk.impl;

import com.applovin.impl.Z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class i5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14148e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f14149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14151c;
    public final List d;

    public static final class a {
        public a() {
        }

        public final i5 a(JSONObject jSONObject) {
            String str = null;
            if (jSONObject == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("click");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i2);
                    if (strOptString != null) {
                        if (StringsKt.w(strOptString)) {
                            strOptString = null;
                        }
                        if (strOptString != null) {
                            arrayList.add(strOptString);
                        }
                    }
                }
            }
            k1 k1VarA = k1.d.a(jSONObject.optJSONObject("app_install_button"));
            String strOptString2 = jSONObject.optString("button_html");
            Intrinsics.c(strOptString2);
            if (!StringsKt.w(strOptString2) && !strOptString2.equals(AbstractJsonLexerKt.NULL)) {
                str = strOptString2;
            }
            return new i5(k1VarA, str, jSONObject.optBoolean("show_on_endcard", false), arrayList);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public i5(k1 k1Var, String str, boolean z2, List clickTrackers) {
        Intrinsics.f(clickTrackers, "clickTrackers");
        this.f14149a = k1Var;
        this.f14150b = str;
        this.f14151c = z2;
        this.d = clickTrackers;
    }

    public final k1 a() {
        return this.f14149a;
    }

    public final String b() {
        return this.f14150b;
    }

    public final List c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return Intrinsics.a(this.f14149a, i5Var.f14149a) && Intrinsics.a(this.f14150b, i5Var.f14150b) && this.f14151c == i5Var.f14151c && Intrinsics.a(this.d, i5Var.d);
    }

    public int hashCode() {
        k1 k1Var = this.f14149a;
        int iHashCode = (k1Var == null ? 0 : k1Var.hashCode()) * 31;
        String str = this.f14150b;
        return this.d.hashCode() + Z.e(this.f14151c, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        return "CtaConfig(appInstallButton=" + this.f14149a + ", buttonHtml=" + this.f14150b + ", showOnEndcard=" + this.f14151c + ", clickTrackers=" + this.d + ")";
    }
}
