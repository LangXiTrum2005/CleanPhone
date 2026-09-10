package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, a> f26094a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0038a f26095c = new C0038a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f26096d = "adUnitId";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f26097e = "instances";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, b> f26098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<c> f26099b;

        /* JADX INFO: renamed from: com.ironsource.Fd$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0038a {
            public /* synthetic */ C0038a(kotlin.jvm.internal.g gVar) {
                this();
            }

            private C0038a() {
            }
        }

        public a(JSONObject adFormatProviderOrder) throws JSONException {
            kotlin.jvm.internal.n.f(adFormatProviderOrder, "adFormatProviderOrder");
            Iterable iterableB = C0391ia.b(adFormatProviderOrder.names());
            iterableB = iterableB == null ? xj.v.f53866a : iterableB;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterableB) {
                if (!kotlin.jvm.internal.n.a((String) obj, "preload")) {
                    arrayList.add(obj);
                }
            }
            int iO = xj.b0.O(xj.p.W(arrayList, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iO < 16 ? 16 : iO);
            for (Object obj2 : arrayList) {
                JSONArray jSONArrayOptJSONArray = adFormatProviderOrder.optJSONArray((String) obj2);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                linkedHashMap.put(obj2, new b(jSONArrayOptJSONArray));
            }
            this.f26098a = linkedHashMap;
            this.f26099b = b(adFormatProviderOrder);
        }

        public final Map<String, b> a() {
            return this.f26098a;
        }

        public final List<c> b() {
            return this.f26099b;
        }

        private final c a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.has("adUnitId") ? jSONObject.optString("adUnitId") : null;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("instances");
            return new c(strOptString, jSONArrayOptJSONArray != null ? C0391ia.b(jSONArrayOptJSONArray) : null);
        }

        private final List<c> b(JSONObject jSONObject) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("preload");
            if (jSONArrayOptJSONArray == null) {
                return xj.v.f53866a;
            }
            pk.c cVarO = com.bumptech.glide.d.O(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList();
            pk.b it = cVarO.iterator();
            while (it.f48398c) {
                c cVarA = a(jSONArrayOptJSONArray.optJSONObject(it.nextInt()));
                if (cVarA != null) {
                    arrayList.add(cVarA);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f26100a;

        public b(JSONArray providerOrder) throws JSONException {
            kotlin.jvm.internal.n.f(providerOrder, "providerOrder");
            List<String> listB = C0391ia.b(providerOrder);
            kotlin.jvm.internal.n.e(listB, "jsonArrayToStringList(providerOrder)");
            this.f26100a = listB;
        }

        public final List<String> a() {
            return this.f26100a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f26102b;

        public c(String str, List<String> list) {
            this.f26101a = str;
            this.f26102b = list;
        }

        public final String a() {
            return this.f26101a;
        }

        public final List<String> b() {
            return this.f26102b;
        }

        public final String c() {
            return this.f26101a;
        }

        public final List<String> d() {
            return this.f26102b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.n.a(this.f26101a, cVar.f26101a) && kotlin.jvm.internal.n.a(this.f26102b, cVar.f26102b);
        }

        public int hashCode() {
            String str = this.f26101a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.f26102b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "AdUnitPreloadConfig(adUnitId=" + this.f26101a + ", instanceIds=" + this.f26102b + ")";
        }

        public final c a(String str, List<String> list) {
            return new c(str, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, String str, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cVar.f26101a;
            }
            if ((i10 & 2) != 0) {
                list = cVar.f26102b;
            }
            return cVar.a(str, list);
        }
    }

    public Fd(JSONObject providerOrder) {
        kotlin.jvm.internal.n.f(providerOrder, "providerOrder");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        int iO = xj.b0.O(adFormatArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO < 16 ? 16 : iO);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = providerOrder.optJSONObject(If.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            linkedHashMap.put(adFormat, new a(jSONObjectOptJSONObject));
        }
        this.f26094a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, a> a() {
        return this.f26094a;
    }

    public final List<c> a(LevelPlay.AdFormat adFormat) {
        List<c> listB;
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        a aVar = this.f26094a.get(adFormat);
        return (aVar == null || (listB = aVar.b()) == null) ? xj.v.f53866a : listB;
    }
}
