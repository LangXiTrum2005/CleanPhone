package com.chartboost.sdk.impl;

import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f14477a;

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f14492c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f14493e;
        public List f;

        public c(String id, String nbr, String currency, String bidId, List seatbidList, List assets) {
            Intrinsics.f(id, "id");
            Intrinsics.f(nbr, "nbr");
            Intrinsics.f(currency, "currency");
            Intrinsics.f(bidId, "bidId");
            Intrinsics.f(seatbidList, "seatbidList");
            Intrinsics.f(assets, "assets");
            this.f14490a = id;
            this.f14491b = nbr;
            this.f14492c = currency;
            this.d = bidId;
            this.f14493e = seatbidList;
            this.f = assets;
        }

        public final List a() {
            return this.f;
        }

        public final Map b() {
            List list = this.f;
            int iH = MapsKt.h(CollectionsKt.n(list, 10));
            if (iH < 16) {
                iH = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
            for (Object obj : list) {
                linkedHashMap.put(((p1) obj).f14798b, obj);
            }
            return MapsKt.s(linkedHashMap);
        }

        public final List c() {
            return this.f14493e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.a(this.f14490a, cVar.f14490a) && Intrinsics.a(this.f14491b, cVar.f14491b) && Intrinsics.a(this.f14492c, cVar.f14492c) && Intrinsics.a(this.d, cVar.d) && Intrinsics.a(this.f14493e, cVar.f14493e) && Intrinsics.a(this.f, cVar.f);
        }

        public int hashCode() {
            return this.f.hashCode() + androidx.media3.extractor.text.ttml.a.c(androidx.datastore.preferences.protobuf.a.b(this.d, androidx.datastore.preferences.protobuf.a.b(this.f14492c, androidx.datastore.preferences.protobuf.a.b(this.f14491b, this.f14490a.hashCode() * 31, 31), 31), 31), 31, this.f14493e);
        }

        public String toString() {
            String str = this.f14490a;
            String str2 = this.f14491b;
            String str3 = this.f14492c;
            String str4 = this.d;
            List list = this.f14493e;
            List list2 = this.f;
            StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("OpenRTBModel(id=", str, ", nbr=", str2, ", currency=");
            androidx.media3.extractor.text.ttml.a.C(sbQ, str3, ", bidId=", str4, ", seatbidList=");
            sbQ.append(list);
            sbQ.append(", assets=");
            sbQ.append(list2);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    public md(b2 base64Wrapper) {
        Intrinsics.f(base64Wrapper, "base64Wrapper");
        this.f14477a = base64Wrapper;
    }

    public final String a(y yVar) {
        if (Intrinsics.a(yVar, y.b.g)) {
            return com.p004ironsource.mediationsdk.metadata.a.g;
        }
        if (Intrinsics.a(yVar, y.c.g) || Intrinsics.a(yVar, y.a.g)) {
            return "false";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ea b(JSONObject jSONObject) {
        ea.a aVarC;
        ea.a aVarC2;
        ea.a aVarC3;
        String strOptString = jSONObject.optString("imageurl");
        Intrinsics.e(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("clickthroughurl");
        Intrinsics.e(strOptString2, "optString(...)");
        ea.b bVarA = ea.b.f13802c.a(jSONObject.optInt("position"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("margin");
        ea.a aVar = (jSONObjectOptJSONObject == null || (aVarC3 = c(jSONObjectOptJSONObject)) == null) ? new ea.a(0.0d, 0.0d, 3, null) : aVarC3;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("padding");
        ea.a aVar2 = (jSONObjectOptJSONObject2 == null || (aVarC2 = c(jSONObjectOptJSONObject2)) == null) ? new ea.a(0.0d, 0.0d, 3, null) : aVarC2;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("size");
        return new ea(strOptString, strOptString2, bVarA, aVar, aVar2, (jSONObjectOptJSONObject3 == null || (aVarC = c(jSONObjectOptJSONObject3)) == null) ? new ea.a(0.0d, 0.0d, 3, null) : aVarC);
    }

    public final d c(List list) {
        d dVar = (d) CollectionsKt.y(list);
        if (dVar != null) {
            return dVar;
        }
        return new d(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final c d(JSONObject jSONObject) throws JSONException {
        List<JSONObject> listAsList;
        List<JSONObject> listAsList2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("seatbid");
        b bVar = new b(null, null, null, null, null, null, null, null, 0, null, null, null, null, 8191, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (jSONArrayOptJSONArray != null && (listAsList = w7.asList(jSONArrayOptJSONArray)) != null) {
            for (JSONObject jSONObject2 : listAsList) {
                String strOptString = jSONObject2.optString("seat");
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("bid");
                if (jSONArrayOptJSONArray2 != null && (listAsList2 = w7.asList(jSONArrayOptJSONArray2)) != null) {
                    for (JSONObject jSONObject3 : listAsList2) {
                        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("ext");
                        if (jSONObjectOptJSONObject != null) {
                            bVar = a(jSONObjectOptJSONObject);
                            p1 p1VarA = a(bVar.l());
                            if (p1VarA != null) {
                                arrayList.add(p1VarA);
                            }
                        }
                        arrayList2.add(a(jSONObject3, bVar));
                    }
                }
                Intrinsics.c(strOptString);
                arrayList3.add(new d(strOptString, arrayList2));
            }
        }
        return a(jSONObject, arrayList3, arrayList);
    }

    public final ea.a c(JSONObject jSONObject) {
        return new ea.a(jSONObject.optDouble("w"), jSONObject.optDouble(com.smartdigimkt.m3.h.f36614b));
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f14495b;

        public d(String seat, List bidList) {
            Intrinsics.f(seat, "seat");
            Intrinsics.f(bidList, "bidList");
            this.f14494a = seat;
            this.f14495b = bidList;
        }

        public final List a() {
            return this.f14495b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.a(this.f14494a, dVar.f14494a) && Intrinsics.a(this.f14495b, dVar.f14495b);
        }

        public int hashCode() {
            return this.f14495b.hashCode() + (this.f14494a.hashCode() * 31);
        }

        public String toString() {
            return "SeatbidModel(seat=" + this.f14494a + ", bidList=" + this.f14495b + ")";
        }

        public /* synthetic */ d(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? EmptyList.X : list);
        }
    }

    public final void a(Map map, a aVar, y yVar) {
        map.put("{% encoding %}", "base64");
        map.put("{% adm %}", aVar.a());
        map.put("{{ ad_type }}", b(yVar));
        map.put("{{ show_close_button }}", a(yVar));
        map.put("{{ preroll_popup }}", "false");
        map.put("{{ post_video_reward_toaster_enabled }}", "false");
        if (Intrinsics.a(yVar, y.a.g)) {
            map.put("{% is_banner %}", com.p004ironsource.mediationsdk.metadata.a.g);
        }
    }

    public final String b(y yVar) {
        if (Intrinsics.a(yVar, y.a.g)) {
            return "10";
        }
        if (Intrinsics.a(yVar, y.b.g)) {
            return "8";
        }
        if (Intrinsics.a(yVar, y.c.g)) {
            return com.smartdigimkt.f3.b.j;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f14480c;
        public final String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f14481e;
        public final String f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b f14482h;

        public a(String id, String impid, double d, String burl, String crid, String adm, int i2, b ext) {
            Intrinsics.f(id, "id");
            Intrinsics.f(impid, "impid");
            Intrinsics.f(burl, "burl");
            Intrinsics.f(crid, "crid");
            Intrinsics.f(adm, "adm");
            Intrinsics.f(ext, "ext");
            this.f14478a = id;
            this.f14479b = impid;
            this.f14480c = d;
            this.d = burl;
            this.f14481e = crid;
            this.f = adm;
            this.g = i2;
            this.f14482h = ext;
        }

        public final String a() {
            return this.f;
        }

        public final b b() {
            return this.f14482h;
        }

        public final int c() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.f14478a, aVar.f14478a) && Intrinsics.a(this.f14479b, aVar.f14479b) && Double.compare(this.f14480c, aVar.f14480c) == 0 && Intrinsics.a(this.d, aVar.d) && Intrinsics.a(this.f14481e, aVar.f14481e) && Intrinsics.a(this.f, aVar.f) && this.g == aVar.g && Intrinsics.a(this.f14482h, aVar.f14482h);
        }

        public int hashCode() {
            return this.f14482h.hashCode() + androidx.media3.extractor.text.ttml.a.a(this.g, androidx.datastore.preferences.protobuf.a.b(this.f, androidx.datastore.preferences.protobuf.a.b(this.f14481e, androidx.datastore.preferences.protobuf.a.b(this.d, (Double.hashCode(this.f14480c) + androidx.datastore.preferences.protobuf.a.b(this.f14479b, this.f14478a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31);
        }

        public String toString() {
            String str = this.f14478a;
            String str2 = this.f14479b;
            double d = this.f14480c;
            String str3 = this.d;
            String str4 = this.f14481e;
            String str5 = this.f;
            int i2 = this.g;
            b bVar = this.f14482h;
            StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("BidModel(id=", str, ", impid=", str2, ", price=");
            sbQ.append(d);
            sbQ.append(", burl=");
            sbQ.append(str3);
            androidx.media3.extractor.text.ttml.a.C(sbQ, ", crid=", str4, ", adm=", str5);
            sbQ.append(", mtype=");
            sbQ.append(i2);
            sbQ.append(", ext=");
            sbQ.append(bVar);
            sbQ.append(")");
            return sbQ.toString();
        }

        public /* synthetic */ a(String str, String str2, double d, String str3, String str4, String str5, int i2, b bVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0.0d : d, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) == 0 ? str5 : "", (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? new b(null, null, null, null, null, null, null, null, 0, null, null, null, null, 8191, null) : bVar);
        }
    }

    public final b a(JSONObject jSONObject) throws JSONException {
        List listAsList;
        ea eaVar;
        List listAsList2;
        String strOptString = jSONObject.optString("impressionid");
        Intrinsics.e(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("crtype");
        Intrinsics.e(strOptString2, "optString(...)");
        String strOptString3 = jSONObject.optString(com.ironsource.sdk.controller.f.b.AD_ID);
        Intrinsics.e(strOptString3, "optString(...)");
        String strOptString4 = jSONObject.optString("cgn");
        Intrinsics.e(strOptString4, "optString(...)");
        String string = jSONObject.getString("template");
        Intrinsics.e(string, "getString(...)");
        String strOptString5 = jSONObject.optString("videoUrl");
        Intrinsics.e(strOptString5, "optString(...)");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("imptrackers");
        EmptyList emptyList = EmptyList.X;
        if (jSONArrayOptJSONArray == null || (listAsList = w7.asList(jSONArrayOptJSONArray)) == null) {
            listAsList = emptyList;
        }
        String strOptString6 = jSONObject.optString("params");
        Intrinsics.e(strOptString6, "optString(...)");
        int iOptInt = jSONObject.optInt("clkp");
        String strOptString7 = jSONObject.optString("baseurl");
        Intrinsics.e(strOptString7, "optString(...)");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("infoicon");
        if (jSONObjectOptJSONObject == null || (eaVar = b(jSONObjectOptJSONObject)) == null) {
            eaVar = new ea(null, null, null, null, null, null, 63, null);
        }
        cf cfVarA = cf.f13602c.a(jSONObject.optString("renderingengine"));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("scripts");
        return new b(strOptString, strOptString2, strOptString3, strOptString4, string, strOptString5, listAsList, strOptString6, iOptInt, strOptString7, eaVar, cfVarA, (jSONArrayOptJSONArray2 == null || (listAsList2 = w7.asList(jSONArrayOptJSONArray2)) == null) ? emptyList : listAsList2);
    }

    public final a b(List list) {
        a aVar = (a) CollectionsKt.y(list);
        if (aVar != null) {
            return aVar;
        }
        return new a(null, null, 0.0d, null, null, null, 0, null, 255, null);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14485c;
        public final String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f14486e;
        public final String f;
        public final List g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f14487h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f14488i;
        public final String j;
        public final ea k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final cf f14489l;
        public final List m;

        public b(String impressionid, String crtype, String adId, String cgn, String template, String videoUrl, List imptrackers, String params, int i2, String baseUrl, ea infoIcon, cf renderEngine, List scripts) {
            Intrinsics.f(impressionid, "impressionid");
            Intrinsics.f(crtype, "crtype");
            Intrinsics.f(adId, "adId");
            Intrinsics.f(cgn, "cgn");
            Intrinsics.f(template, "template");
            Intrinsics.f(videoUrl, "videoUrl");
            Intrinsics.f(imptrackers, "imptrackers");
            Intrinsics.f(params, "params");
            Intrinsics.f(baseUrl, "baseUrl");
            Intrinsics.f(infoIcon, "infoIcon");
            Intrinsics.f(renderEngine, "renderEngine");
            Intrinsics.f(scripts, "scripts");
            this.f14483a = impressionid;
            this.f14484b = crtype;
            this.f14485c = adId;
            this.d = cgn;
            this.f14486e = template;
            this.f = videoUrl;
            this.g = imptrackers;
            this.f14487h = params;
            this.f14488i = i2;
            this.j = baseUrl;
            this.k = infoIcon;
            this.f14489l = renderEngine;
            this.m = scripts;
        }

        public final String a() {
            return this.f14485c;
        }

        public final String b() {
            return this.j;
        }

        public final String c() {
            return this.d;
        }

        public final int d() {
            return this.f14488i;
        }

        public final String e() {
            return this.f14484b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.a(this.f14483a, bVar.f14483a) && Intrinsics.a(this.f14484b, bVar.f14484b) && Intrinsics.a(this.f14485c, bVar.f14485c) && Intrinsics.a(this.d, bVar.d) && Intrinsics.a(this.f14486e, bVar.f14486e) && Intrinsics.a(this.f, bVar.f) && Intrinsics.a(this.g, bVar.g) && Intrinsics.a(this.f14487h, bVar.f14487h) && this.f14488i == bVar.f14488i && Intrinsics.a(this.j, bVar.j) && Intrinsics.a(this.k, bVar.k) && this.f14489l == bVar.f14489l && Intrinsics.a(this.m, bVar.m);
        }

        public final String f() {
            return this.f14483a;
        }

        public final List g() {
            return this.g;
        }

        public final ea h() {
            return this.k;
        }

        public int hashCode() {
            return this.m.hashCode() + ((this.f14489l.hashCode() + ((this.k.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.j, androidx.media3.extractor.text.ttml.a.a(this.f14488i, androidx.datastore.preferences.protobuf.a.b(this.f14487h, androidx.media3.extractor.text.ttml.a.c(androidx.datastore.preferences.protobuf.a.b(this.f, androidx.datastore.preferences.protobuf.a.b(this.f14486e, androidx.datastore.preferences.protobuf.a.b(this.d, androidx.datastore.preferences.protobuf.a.b(this.f14485c, androidx.datastore.preferences.protobuf.a.b(this.f14484b, this.f14483a.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.g), 31), 31), 31)) * 31)) * 31);
        }

        public final String i() {
            return this.f14487h;
        }

        public final cf j() {
            return this.f14489l;
        }

        public final List k() {
            return this.m;
        }

        public final String l() {
            return this.f14486e;
        }

        public final String m() {
            return this.f;
        }

        public String toString() {
            String str = this.f14483a;
            String str2 = this.f14484b;
            String str3 = this.f14485c;
            String str4 = this.d;
            String str5 = this.f14486e;
            String str6 = this.f;
            List list = this.g;
            String str7 = this.f14487h;
            int i2 = this.f14488i;
            String str8 = this.j;
            ea eaVar = this.k;
            cf cfVar = this.f14489l;
            List list2 = this.m;
            StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("ExtensionModel(impressionid=", str, ", crtype=", str2, ", adId=");
            androidx.media3.extractor.text.ttml.a.C(sbQ, str3, ", cgn=", str4, ", template=");
            androidx.media3.extractor.text.ttml.a.C(sbQ, str5, ", videoUrl=", str6, ", imptrackers=");
            sbQ.append(list);
            sbQ.append(", params=");
            sbQ.append(str7);
            sbQ.append(", clkp=");
            sbQ.append(i2);
            sbQ.append(", baseUrl=");
            sbQ.append(str8);
            sbQ.append(", infoIcon=");
            sbQ.append(eaVar);
            sbQ.append(", renderEngine=");
            sbQ.append(cfVar);
            sbQ.append(", scripts=");
            sbQ.append(list2);
            sbQ.append(")");
            return sbQ.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, int i2, String str8, ea eaVar, cf cfVar, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            String str9 = (i3 & 1) != 0 ? "" : str;
            String str10 = (i3 & 2) != 0 ? "" : str2;
            String str11 = (i3 & 4) != 0 ? "" : str3;
            String str12 = (i3 & 8) != 0 ? "" : str4;
            String str13 = (i3 & 16) != 0 ? "" : str5;
            String str14 = (i3 & 32) != 0 ? "" : str6;
            int i4 = i3 & 64;
            EmptyList emptyList = EmptyList.X;
            this(str9, str10, str11, str12, str13, str14, i4 != 0 ? emptyList : list, (i3 & 128) == 0 ? str7 : "", (i3 & 256) != 0 ? c4.CLICK_PREFERENCE_EMBEDDED.b() : i2, (i3 & 512) != 0 ? "https://live.chartboost.com" : str8, (i3 & 1024) != 0 ? new ea(null, null, null, null, null, null, 63, null) : eaVar, (i3 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? cf.UNKNOWN : cfVar, (i3 & 4096) != 0 ? emptyList : list2);
        }
    }

    public final p1 a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String strSubstring = str.substring(StringsKt.z(str, IOUtils.DIR_SEPARATOR_UNIX, 0, 6) + 1);
        Intrinsics.e(strSubstring, "substring(...)");
        return new p1("html", strSubstring, str);
    }

    public final p1 a(List list) {
        p1 p1Var = (p1) CollectionsKt.y(list);
        return p1Var == null ? new p1("", "", "") : p1Var;
    }

    public final z a(y adType, JSONObject jSONObject) throws JSONException {
        Intrinsics.f(adType, "adType");
        if (jSONObject != null) {
            c cVarD = d(jSONObject);
            a aVarB = b(c(cVarD.c()).a());
            b bVarB = aVarB.b();
            p1 p1VarA = a(cVarD.a());
            Map mapB = cVarD.b();
            mapB.put("body", p1VarA);
            String strM = bVarB.m();
            String strA = j0.a(strM);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("imptrackers", bVarB.g());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            a(linkedHashMap2, aVarB, adType);
            return new z("", bVarB.a(), bVarB.b(), bVarB.f(), bVarB.h(), bVarB.c(), "", bVarB.e(), mapB, strM, strA, "", "", "", 0, "", "dummy_template", p1VarA, linkedHashMap2, bVarB.j(), bVarB.k(), linkedHashMap, aVarB.a(), bVarB.i(), j0.a(aVarB.c()), c4.f13578c.a(bVarB.d()), this.f14477a.b(aVarB.a()));
        }
        throw new JSONException("Missing response");
    }

    public final a a(JSONObject jSONObject, b bVar) throws JSONException {
        String string = jSONObject.getString("id");
        Intrinsics.e(string, "getString(...)");
        String string2 = jSONObject.getString("impid");
        Intrinsics.e(string2, "getString(...)");
        double d2 = jSONObject.getDouble("price");
        String strOptString = jSONObject.optString(com.p004ironsource.m5.y);
        Intrinsics.e(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString(com.smartdigimkt.q0.b.m);
        Intrinsics.e(strOptString2, "optString(...)");
        String strOptString3 = jSONObject.optString("adm");
        Intrinsics.e(strOptString3, "optString(...)");
        return new a(string, string2, d2, strOptString, strOptString2, strOptString3, jSONObject.optInt("mtype"), bVar);
    }

    public final c a(JSONObject jSONObject, List list, List list2) throws JSONException {
        String string = jSONObject.getString("id");
        Intrinsics.e(string, "getString(...)");
        String strOptString = jSONObject.optString("nbr");
        Intrinsics.e(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString(BidResponsed.KEY_CUR, "USD");
        Intrinsics.e(strOptString2, "optString(...)");
        String strOptString3 = jSONObject.optString("bidid");
        Intrinsics.e(strOptString3, "optString(...)");
        return new c(string, strOptString, strOptString2, strOptString3, list, list2);
    }
}
