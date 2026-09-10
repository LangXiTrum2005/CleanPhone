package sg.bigo.ads.api.core;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements sg.bigo.ads.api.a.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sg.bigo.ads.api.a.f[] f47043e;
    public sg.bigo.ads.api.a.f f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f47040a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47041b = com.smartdigimkt.d2.a.Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f47042c = "";
    public String d = "";
    public String g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f47044h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f47045i = 0;
    public int j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public sg.bigo.ads.api.a.e.b f47046l = new sg.bigo.ads.api.a.e.b();
    public sg.bigo.ads.api.a.e.a m = new sg.bigo.ads.api.a.e.a();
    public sg.bigo.ads.api.a.e.c[] k = new sg.bigo.ads.api.a.e.c[0];

    @Override // sg.bigo.ads.api.a.e
    public final String a() {
        return this.f47042c;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String b() {
        return this.d;
    }

    @Override // sg.bigo.ads.api.a.e
    public final long c() {
        return this.f47040a;
    }

    @Override // sg.bigo.ads.api.a.e
    public final int d() {
        return this.f47045i;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String e() {
        return this.f47041b;
    }

    @Override // sg.bigo.ads.api.a.e
    public final int f() {
        return this.j;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String g() {
        return this.f47044h;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String h() {
        return this.g;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f[] i() {
        return this.f47043e;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f j() {
        sg.bigo.ads.api.a.f[] fVarArr = this.f47043e;
        if (fVarArr == null || fVarArr.length <= 0) {
            return null;
        }
        return fVarArr[0];
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f k() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.e.b l() {
        return this.f47046l;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.e.c[] m() {
        return this.k;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.e.a n() {
        return this.m;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f47040a = jSONObject.optLong("form_id", 0L);
            this.f47042c = jSONObject.optString("title", "");
            this.f47041b = jSONObject.optString("ad_lang", com.smartdigimkt.d2.a.Z);
            this.d = jSONObject.optString("description", "");
            this.g = jSONObject.optString("purpose", "");
            this.f47045i = jSONObject.optInt("color", 0);
            this.j = jSONObject.optInt("form_style_id", 0);
            this.f47044h = jSONObject.optString("extra", "");
            a(jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("icon");
            if (jSONObjectOptJSONObject != null) {
                this.f = new k(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("questions");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject2 != null) {
                        arrayList.add(new sg.bigo.ads.api.a.e.c(jSONObjectOptJSONObject2));
                    }
                }
                sg.bigo.ads.api.a.e.c[] cVarArr = new sg.bigo.ads.api.a.e.c[arrayList.size()];
                this.k = cVarArr;
                this.k = (sg.bigo.ads.api.a.e.c[]) arrayList.toArray(cVarArr);
            }
            sg.bigo.ads.api.a.e.b bVar = this.f47046l;
            String strOptString = jSONObject.optString("privacy", "");
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    bVar.f46981a = jSONObject2.optString("name", "");
                    bVar.f46982b = jSONObject2.optString("url", "");
                } catch (JSONException unused) {
                }
            }
            sg.bigo.ads.api.a.e.a aVar = this.m;
            String strOptString2 = jSONObject.optString("feedback", "");
            if (TextUtils.isEmpty(strOptString2)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString2);
            aVar.f46978a = jSONObject3.optString("title", "");
            aVar.f46979b = jSONObject3.optString("description", "");
            aVar.f46980c = jSONObject3.optString("cta", "");
            aVar.d = jSONObject3.optString("land_url", "");
        } catch (JSONException unused2) {
        }
    }

    private void a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new k(jSONObjectOptJSONObject));
                }
            }
            k[] kVarArr = new k[arrayList.size()];
            this.f47043e = kVarArr;
            this.f47043e = (sg.bigo.ads.api.a.f[]) arrayList.toArray(kVarArr);
        }
    }
}
