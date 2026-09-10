package com.smartdigimkt.x7;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f39946b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f39947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f39948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C0640b[] f39949c;

        public a(int[] iArr, long j, C0640b[] c0640bArr) {
            this.f39947a = iArr;
            this.f39948b = j;
            this.f39949c = c0640bArr;
        }

        public C0640b[] a() {
            return this.f39949c;
        }

        public int[] b() {
            return this.f39947a;
        }

        public long c() {
            return this.f39948b;
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.x7.b$b, reason: collision with other inner class name */
    public static class C0640b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f39950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f39951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f39952c;

        public C0640b(String str, int i2, long j) {
            this.f39950a = str;
            this.f39951b = i2;
            this.f39952c = j;
        }

        public String a() {
            return this.f39950a;
        }

        public int b() {
            return this.f39951b;
        }

        public long c() {
            return this.f39952c;
        }
    }

    private b() {
    }

    public static b a(JSONObject jSONObject) {
        int[] iArr = null;
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        bVar.a(jSONObject.optInt("net_type", 1));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("net_d");
        if (jSONObjectOptJSONObject != null) {
            long jOptLong = jSONObjectOptJSONObject.optLong("s_timeout", 500L);
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("s_i");
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("srv");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                iArr = new int[jSONArrayOptJSONArray.length()];
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    iArr[i2] = jSONArrayOptJSONArray.optInt(i2);
                }
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i3);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString = jSONObjectOptJSONObject2.optString("ip");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList.add(new C0640b(strOptString, jSONObjectOptJSONObject2.optInt("port", 57), jSONObjectOptJSONObject2.optLong("timeout", 500L)));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                bVar.a(new a(iArr, jOptLong, (C0640b[]) arrayList.toArray(new C0640b[0])));
            }
        }
        return bVar;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        a aVar = this.f39946b;
        boolean z2 = (aVar == null || aVar.a() == null || this.f39946b.a().length <= 0 || this.f39946b.b() == null || this.f39946b.b().length <= 0 || com.smartdigimkt.m6.b.p().y()) ? false : true;
        if (!z2) {
            return z2;
        }
        int[] iArrB = this.f39946b.b();
        try {
            int iA = f.a(str);
            for (int i2 : iArrB) {
                if (iA == i2) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public int a() {
        return this.f39945a;
    }

    public void a(int i2) {
        this.f39945a = i2;
    }

    public void a(a aVar) {
        this.f39946b = aVar;
    }
}
