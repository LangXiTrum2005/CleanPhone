package com.chartboost.sdk.impl;

import com.applovin.impl.Z;
import com.applovin.shadow.okio.Segment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ue {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f15285p = new a(null);
    public static final b q = b.FILL;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f15288c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c5 f15289e;
    public final List f;
    public final xh g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i8 f15290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15291i;
    public final boolean j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f15292l;
    public final b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f15293n;
    public final Integer o;

    public static final class a {
        public a() {
        }

        public final ue a(JSONObject jsonObject) throws JSONException {
            Iterator<String> itKeys;
            Intrinsics.f(jsonObject, "jsonObject");
            JSONObject jSONObject = jsonObject.getJSONObject(com.smartdigimkt.q0.b.i0);
            List listA = w.f15444l.a(jSONObject.optJSONArray("event_trackers"));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("ext");
            if (jSONObjectOptJSONObject != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Intrinsics.c(next);
                    Object obj = jSONObjectOptJSONObject.get(next);
                    Intrinsics.e(obj, "get(...)");
                    linkedHashMap.put(next, obj);
                }
            }
            String string = jsonObject.getString("adm");
            Intrinsics.e(string, "getString(...)");
            String string2 = jsonObject.getString("markup_type");
            Intrinsics.e(string2, "getString(...)");
            long jOptLong = jSONObject.optLong("auto_advance_time", -1L);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(com.smartdigimkt.o1.b.l3);
            Integer numValueOf = null;
            c5 c5VarA = jSONObjectOptJSONObject2 != null ? c5.f13581c.a(jSONObjectOptJSONObject2) : null;
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("vast");
            xh xhVarA = jSONObjectOptJSONObject3 != null ? xh.g.a(jSONObjectOptJSONObject3) : null;
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("html");
            i8 i8VarA = jSONObjectOptJSONObject4 != null ? i8.d.a(jSONObjectOptJSONObject4) : null;
            int iOptInt = jSONObject.optInt("ignore_safe_area", 0);
            boolean zOptBoolean = jSONObject.optBoolean("dedupe_clicks", true);
            boolean zOptBoolean2 = jSONObject.optBoolean("reset_user_click_detector_after_click", false);
            boolean zOptBoolean3 = jSONObject.optBoolean("optional", false);
            b bVarA = jSONObject.has("fit_type") ? b.f15294c.a(jSONObject.getString("fit_type")) : ue.q;
            Integer numValueOf2 = (!jSONObject.has("height") || jSONObject.isNull("height")) ? null : Integer.valueOf(jSONObject.getInt("height"));
            if (jSONObject.has("width") && !jSONObject.isNull("width")) {
                numValueOf = Integer.valueOf(jSONObject.getInt("width"));
            }
            return new ue(string, string2, linkedHashMap, jOptLong, c5VarA, listA, xhVarA, i8VarA, iOptInt, zOptBoolean, zOptBoolean2, zOptBoolean3, bVarA, numValueOf2, numValueOf);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum b {
        ASPECT("aspect"),
        FILL("fill"),
        FIXED("fixed");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15297b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f15296h = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15294c = new a(null);

        public static final class a {
            public a() {
            }

            public final b a(String str) {
                Object next;
                Iterator<E> it = b.b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.a(((b) next).c(), str));
                b bVar = (b) next;
                return bVar == null ? b.FILL : bVar;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        b(String str) {
            this.f15297b = str;
        }

        public static EnumEntries b() {
            return f15296h;
        }

        public final String c() {
            return this.f15297b;
        }
    }

    public ue(String adm, String markupType, Map ext, long j, c5 c5Var, List eventTrackers, xh xhVar, i8 i8Var, int i2, boolean z2, boolean z3, boolean z4, b fitType, Integer num, Integer num2) {
        Intrinsics.f(adm, "adm");
        Intrinsics.f(markupType, "markupType");
        Intrinsics.f(ext, "ext");
        Intrinsics.f(eventTrackers, "eventTrackers");
        Intrinsics.f(fitType, "fitType");
        this.f15286a = adm;
        this.f15287b = markupType;
        this.f15288c = ext;
        this.d = j;
        this.f15289e = c5Var;
        this.f = eventTrackers;
        this.g = xhVar;
        this.f15290h = i8Var;
        this.f15291i = i2;
        this.j = z2;
        this.k = z3;
        this.f15292l = z4;
        this.m = fitType;
        this.f15293n = num;
        this.o = num2;
    }

    public final String b() {
        return this.f15286a;
    }

    public final long c() {
        return this.d;
    }

    public final c5 d() {
        return this.f15289e;
    }

    public final boolean e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue)) {
            return false;
        }
        ue ueVar = (ue) obj;
        return Intrinsics.a(this.f15286a, ueVar.f15286a) && Intrinsics.a(this.f15287b, ueVar.f15287b) && Intrinsics.a(this.f15288c, ueVar.f15288c) && this.d == ueVar.d && Intrinsics.a(this.f15289e, ueVar.f15289e) && Intrinsics.a(this.f, ueVar.f) && Intrinsics.a(this.g, ueVar.g) && Intrinsics.a(this.f15290h, ueVar.f15290h) && this.f15291i == ueVar.f15291i && this.j == ueVar.j && this.k == ueVar.k && this.f15292l == ueVar.f15292l && this.m == ueVar.m && Intrinsics.a(this.f15293n, ueVar.f15293n) && Intrinsics.a(this.o, ueVar.o);
    }

    public final List f() {
        return this.f;
    }

    public final Map g() {
        return this.f15288c;
    }

    public final b h() {
        return this.m;
    }

    public int hashCode() {
        int iB = androidx.media3.extractor.text.ttml.a.b((this.f15288c.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.f15287b, this.f15286a.hashCode() * 31, 31)) * 31, 31, this.d);
        c5 c5Var = this.f15289e;
        int iC = androidx.media3.extractor.text.ttml.a.c((iB + (c5Var == null ? 0 : c5Var.hashCode())) * 31, 31, this.f);
        xh xhVar = this.g;
        int iHashCode = (iC + (xhVar == null ? 0 : xhVar.hashCode())) * 31;
        i8 i8Var = this.f15290h;
        int iHashCode2 = (this.m.hashCode() + Z.e(this.f15292l, Z.e(this.k, Z.e(this.j, androidx.media3.extractor.text.ttml.a.a(this.f15291i, (iHashCode + (i8Var == null ? 0 : i8Var.hashCode())) * 31, 31), 31), 31), 31)) * 31;
        Integer num = this.f15293n;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.o;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final Integer i() {
        return this.f15293n;
    }

    public final i8 j() {
        return this.f15290h;
    }

    public final int k() {
        return this.f15291i;
    }

    public final String l() {
        return this.f15287b;
    }

    public final boolean m() {
        return this.f15292l;
    }

    public final boolean n() {
        return this.k;
    }

    public final xh o() {
        return this.g;
    }

    public final Integer p() {
        return this.o;
    }

    public String toString() {
        String str = this.f15286a;
        String str2 = this.f15287b;
        Map map = this.f15288c;
        long j = this.d;
        c5 c5Var = this.f15289e;
        List list = this.f;
        xh xhVar = this.g;
        i8 i8Var = this.f15290h;
        int i2 = this.f15291i;
        boolean z2 = this.j;
        boolean z3 = this.k;
        boolean z4 = this.f15292l;
        b bVar = this.m;
        Integer num = this.f15293n;
        Integer num2 = this.o;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("RenderableConfig(adm=", str, ", markupType=", str2, ", ext=");
        sbQ.append(map);
        sbQ.append(", autoAdvanceTime=");
        sbQ.append(j);
        sbQ.append(", countdown=");
        sbQ.append(c5Var);
        sbQ.append(", eventTrackers=");
        sbQ.append(list);
        sbQ.append(", vast=");
        sbQ.append(xhVar);
        sbQ.append(", html=");
        sbQ.append(i8Var);
        sbQ.append(", ignoreSafeAreaFlags=");
        sbQ.append(i2);
        sbQ.append(", dedupeClicks=");
        sbQ.append(z2);
        sbQ.append(", resetUserClickDetectorAfterClick=");
        sbQ.append(z3);
        sbQ.append(", optional=");
        sbQ.append(z4);
        sbQ.append(", fitType=");
        sbQ.append(bVar);
        sbQ.append(", height=");
        sbQ.append(num);
        sbQ.append(", width=");
        sbQ.append(num2);
        sbQ.append(")");
        return sbQ.toString();
    }

    public /* synthetic */ ue(String str, String str2, Map map, long j, c5 c5Var, List list, xh xhVar, i8 i8Var, int i2, boolean z2, boolean z3, boolean z4, b bVar, Integer num, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? EmptyMap.X : map, (i3 & 8) != 0 ? -1L : j, (i3 & 16) != 0 ? null : c5Var, (i3 & 32) != 0 ? EmptyList.X : list, (i3 & 64) != 0 ? null : xhVar, (i3 & 128) != 0 ? null : i8Var, (i3 & 256) != 0 ? 0 : i2, (i3 & 512) != 0 ? true : z2, (i3 & 1024) != 0 ? false : z3, (i3 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? false : z4, (i3 & 4096) != 0 ? b.FILL : bVar, (i3 & Segment.SIZE) != 0 ? null : num, (i3 & 16384) != 0 ? null : num2);
    }
}
