package sg.bigo.ads.controller.b;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sg.bigo.ads.api.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f47879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f47880b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Integer, Map<Integer, a>> f47881c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f47882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f47883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f47884c;
        long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47885e;
        int f;
        int g;
    }

    private a a(l lVar) {
        int iB;
        Map<Integer, a> map;
        if (lVar == null) {
            return null;
        }
        int iV = lVar.v();
        if (iV == 0) {
            iV = 1;
        }
        if (iV == 3 || (iB = lVar.b()) == 2 || (map = this.f47881c.get(Integer.valueOf(iV))) == null) {
            return null;
        }
        return map.get(Integer.valueOf(iB));
    }

    private a k(String str) {
        h hVar;
        if (TextUtils.isEmpty(str) || (hVar = this.f47879a) == null) {
            return null;
        }
        return a(hVar.a(str));
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        a(parcel.readString());
    }

    @Override // sg.bigo.ads.api.a.b
    public final boolean c(String str) {
        h hVar;
        l lVarA;
        int iB;
        if (TextUtils.isEmpty(str) || (hVar = this.f47879a) == null || (lVarA = hVar.a(str)) == null) {
            return false;
        }
        int iV = lVarA.v();
        if (iV == 0) {
            iV = 1;
        }
        return (iV == 3 || (iB = lVarA.b()) == 2 || iB == 12) ? false : true;
    }

    @Override // sg.bigo.ads.api.a.b
    public final String d(String str) {
        h hVar;
        l lVarA;
        if (TextUtils.isEmpty(str) || (hVar = this.f47879a) == null || (lVarA = hVar.a(str)) == null) {
            return null;
        }
        return String.valueOf(lVarA.b());
    }

    @Override // sg.bigo.ads.api.a.b
    public final long e(String str) {
        a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.f47882a;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.a.b
    public final int f(String str) {
        a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.f;
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.a.b
    public final int g(String str) {
        a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.g;
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.a.b
    public final int h(String str) {
        a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.f47883b;
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.a.b
    public final boolean i(String str) {
        a aVarK = k(str);
        return aVarK != null && aVarK.f47884c == 1;
    }

    @Override // sg.bigo.ads.api.a.b
    public final long j(String str) {
        a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.d;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeString(this.f47880b);
    }

    @Override // sg.bigo.ads.api.a.b
    public final boolean b(String str) {
        a aVarK = k(str);
        return aVarK != null && aVarK.f47885e == 1;
    }

    @Override // sg.bigo.ads.api.a.b
    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.f47881c.isEmpty()) {
                return;
            }
            this.f47881c = new HashMap();
            return;
        }
        this.f47880b = str;
        try {
            JSONArray jSONArray = new JSONArray(str);
            HashMap map = new HashMap();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    a aVar = new a();
                    aVar.f47882a = jSONObjectOptJSONObject.optLong("tmax", 15L);
                    aVar.f47883b = jSONObjectOptJSONObject.optInt("cache_num", 2);
                    aVar.f47884c = jSONObjectOptJSONObject.optInt("single_ad", 0);
                    aVar.d = jSONObjectOptJSONObject.optLong("single_tmax", 15L);
                    aVar.f47885e = jSONObjectOptJSONObject.optInt("tmax_switch", 0);
                    aVar.f = jSONObjectOptJSONObject.optInt("tmax_strategy", 0);
                    aVar.g = jSONObjectOptJSONObject.optInt("assign_strategy", 0);
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("auc_type");
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("ad_type");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null) {
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                            int iOptInt = jSONArrayOptJSONArray.optInt(i3);
                            if (iOptInt == 0) {
                                iOptInt = 1;
                            }
                            Map map2 = (Map) map.get(Integer.valueOf(iOptInt));
                            if (map2 == null) {
                                map2 = new HashMap();
                                map.put(Integer.valueOf(iOptInt), map2);
                            }
                            for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                                int iOptInt2 = jSONArrayOptJSONArray2.optInt(i4);
                                if (((a) map2.get(Integer.valueOf(iOptInt2))) == null) {
                                    map2.put(Integer.valueOf(iOptInt2), aVar);
                                }
                            }
                        }
                    }
                }
            }
            this.f47881c = map;
        } catch (JSONException unused) {
        }
    }
}
