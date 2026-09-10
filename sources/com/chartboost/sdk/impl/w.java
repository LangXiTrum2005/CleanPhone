package com.chartboost.sdk.impl;

import com.applovin.impl.Z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f15444l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa f15446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f15447c;
    public final h2 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15448e;
    public final Integer f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f15450i;
    public final boolean j;
    public final int k;

    public static final class a {
        public a() {
        }

        public final w a(JSONObject jsonObject, String auctionId) throws JSONException {
            Intrinsics.f(jsonObject, "jsonObject");
            Intrinsics.f(auctionId, "auctionId");
            List listA = a(jsonObject.optJSONArray("event_trackers"));
            fa.a aVar = fa.f13886c;
            JSONObject jSONObject = jsonObject.getJSONObject("info_icon");
            Intrinsics.e(jSONObject, "getJSONObject(...)");
            fa faVarA = aVar.a(jSONObject);
            h2.a aVar2 = h2.d;
            return new w(auctionId, faVarA, aVar2.a(jsonObject.optJSONObject("top_left_button_group")), aVar2.a(jsonObject.optJSONObject("top_right_button_group")), jsonObject.optInt("expiration", com.smartdigimkt.o1.b.l2), Integer.valueOf(jsonObject.optInt("reward_duration", -1)), jsonObject.optInt("click_browser", 0), jsonObject.optBoolean("resolve_redirections", true), listA, jsonObject.optBoolean("default_muted", false), jsonObject.optInt("load_timeout", 30));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(JSONArray jSONArray) {
            JSONObject jSONObject;
            ArrayList arrayList = new ArrayList();
            int length = jSONArray != null ? jSONArray.length() : 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(i2)) != null) {
                    try {
                        arrayList.add(x6.f.a(jSONObject));
                    } catch (JSONException unused) {
                    }
                }
            }
            return arrayList;
        }
    }

    public w(String auctionId, fa infoIcon, h2 h2Var, h2 h2Var2, int i2, Integer num, int i3, boolean z2, List eventTrackers, boolean z3, int i4) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(infoIcon, "infoIcon");
        Intrinsics.f(eventTrackers, "eventTrackers");
        this.f15445a = auctionId;
        this.f15446b = infoIcon;
        this.f15447c = h2Var;
        this.d = h2Var2;
        this.f15448e = i2;
        this.f = num;
        this.g = i3;
        this.f15449h = z2;
        this.f15450i = eventTrackers;
        this.j = z3;
        this.k = i4;
    }

    public final String a() {
        return this.f15445a;
    }

    public final boolean b() {
        return this.j;
    }

    public final List c() {
        return this.f15450i;
    }

    public final int d() {
        return this.f15448e;
    }

    public final fa e() {
        return this.f15446b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.a(this.f15445a, wVar.f15445a) && Intrinsics.a(this.f15446b, wVar.f15446b) && Intrinsics.a(this.f15447c, wVar.f15447c) && Intrinsics.a(this.d, wVar.d) && this.f15448e == wVar.f15448e && Intrinsics.a(this.f, wVar.f) && this.g == wVar.g && this.f15449h == wVar.f15449h && Intrinsics.a(this.f15450i, wVar.f15450i) && this.j == wVar.j && this.k == wVar.k;
    }

    public final int f() {
        return this.k;
    }

    public final Integer g() {
        return this.f;
    }

    public final h2 h() {
        return this.f15447c;
    }

    public int hashCode() {
        int iHashCode = (this.f15446b.hashCode() + (this.f15445a.hashCode() * 31)) * 31;
        h2 h2Var = this.f15447c;
        int iHashCode2 = (iHashCode + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        h2 h2Var2 = this.d;
        int iA = androidx.media3.extractor.text.ttml.a.a(this.f15448e, (iHashCode2 + (h2Var2 == null ? 0 : h2Var2.hashCode())) * 31, 31);
        Integer num = this.f;
        return Integer.hashCode(this.k) + Z.e(this.j, androidx.media3.extractor.text.ttml.a.c(Z.e(this.f15449h, androidx.media3.extractor.text.ttml.a.a(this.g, (iA + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31, this.f15450i), 31);
    }

    public final h2 i() {
        return this.d;
    }

    public String toString() {
        String str = this.f15445a;
        fa faVar = this.f15446b;
        h2 h2Var = this.f15447c;
        h2 h2Var2 = this.d;
        int i2 = this.f15448e;
        Integer num = this.f;
        int i3 = this.g;
        boolean z2 = this.f15449h;
        List list = this.f15450i;
        boolean z3 = this.j;
        int i4 = this.k;
        StringBuilder sb = new StringBuilder("AdMarkupConfig(auctionId=");
        sb.append(str);
        sb.append(", infoIcon=");
        sb.append(faVar);
        sb.append(", topLeftButtonGroup=");
        sb.append(h2Var);
        sb.append(", topRightButtonGroup=");
        sb.append(h2Var2);
        sb.append(", expiration=");
        sb.append(i2);
        sb.append(", rewardDuration=");
        sb.append(num);
        sb.append(", clickBrowser=");
        sb.append(i3);
        sb.append(", resolveRedirections=");
        sb.append(z2);
        sb.append(", eventTrackers=");
        sb.append(list);
        sb.append(", defaultMuted=");
        sb.append(z3);
        sb.append(", loadTimeoutSeconds=");
        return android.support.v4.media.a.i(i4, ")", sb);
    }
}
