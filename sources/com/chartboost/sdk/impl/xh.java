package com.chartboost.sdk.impl;

import com.applovin.impl.Z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class xh {
    public static final a g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5 f15555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15556c;
    public final i5 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15557e;
    public final boolean f;

    public static final class a {
        public a() {
        }

        public final xh a(JSONObject jsonObject) {
            Intrinsics.f(jsonObject, "jsonObject");
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("endcard_countdown");
            return new xh(jsonObject.optBoolean("video_clickthrough_enabled", true), jSONObjectOptJSONObject != null ? c5.f13581c.a(jSONObjectOptJSONObject) : null, jsonObject.optBoolean("show_endcard", true), i5.f14148e.a(jsonObject.optJSONObject("cta")), jsonObject.optInt("endcard_ignore_safe_area", 0), jsonObject.optBoolean("endcard_optional", true));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public xh(boolean z2, c5 c5Var, boolean z3, i5 i5Var, int i2, boolean z4) {
        this.f15554a = z2;
        this.f15555b = c5Var;
        this.f15556c = z3;
        this.d = i5Var;
        this.f15557e = i2;
        this.f = z4;
    }

    public final i5 a() {
        return this.d;
    }

    public final c5 b() {
        return this.f15555b;
    }

    public final int c() {
        return this.f15557e;
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean e() {
        return this.f15556c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh)) {
            return false;
        }
        xh xhVar = (xh) obj;
        return this.f15554a == xhVar.f15554a && Intrinsics.a(this.f15555b, xhVar.f15555b) && this.f15556c == xhVar.f15556c && Intrinsics.a(this.d, xhVar.d) && this.f15557e == xhVar.f15557e && this.f == xhVar.f;
    }

    public final boolean f() {
        return this.f15554a;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f15554a) * 31;
        c5 c5Var = this.f15555b;
        int iE = Z.e(this.f15556c, (iHashCode + (c5Var == null ? 0 : c5Var.hashCode())) * 31, 31);
        i5 i5Var = this.d;
        return Boolean.hashCode(this.f) + androidx.media3.extractor.text.ttml.a.a(this.f15557e, (iE + (i5Var != null ? i5Var.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        return "VASTConfig(videoClickthroughEnabled=" + this.f15554a + ", endCardCountdown=" + this.f15555b + ", showEndCard=" + this.f15556c + ", callToAction=" + this.d + ", endCardIgnoreSafeAreaFlags=" + this.f15557e + ", endcardOptional=" + this.f + ")";
    }
}
