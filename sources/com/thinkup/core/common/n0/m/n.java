package com.thinkup.core.common.n0.m;

import android.text.TextUtils;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.no.o.mo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    private o m;
    private int o;

    public static class m {
        private final int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f41940n;
        private final String o;

        public m(String str, int i2, long j) {
            this.o = str;
            this.m = i2;
            this.f41940n = j;
        }

        public final int m() {
            return this.m;
        }

        public final long n() {
            return this.f41940n;
        }

        public final String o() {
            return this.o;
        }
    }

    public static class o {
        private final long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final m[] f41941n;
        private final int[] o;

        public o(int[] iArr, long j, m[] mVarArr) {
            this.o = iArr;
            this.m = j;
            this.f41941n = mVarArr;
        }

        private long n() {
            return this.m;
        }

        public final m[] m() {
            return this.f41941n;
        }

        public final int[] o() {
            return this.o;
        }
    }

    private n() {
    }

    public static n o(JSONObject jSONObject) {
        int[] iArr = null;
        if (jSONObject == null) {
            return null;
        }
        n nVar = new n();
        nVar.o = jSONObject.optInt("net_type", 1);
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
                            arrayList.add(new m(strOptString, jSONObjectOptJSONObject2.optInt("port", 57), jSONObjectOptJSONObject2.optLong("timeout", 500L)));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                nVar.m = new o(iArr, jOptLong, (m[]) arrayList.toArray(new m[0]));
            }
        }
        return nVar;
    }

    public final int m() {
        return this.o;
    }

    public final boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o oVar = this.m;
        boolean z2 = (oVar == null || oVar.m() == null || this.m.m().length <= 0 || this.m.o() == null || this.m.o().length <= 0 || TUSDK.isCnSDK()) ? false : true;
        if (!z2) {
            return z2;
        }
        int[] iArrO = this.m.o();
        try {
            int iO = on.o(str);
            for (int i2 : iArrO) {
                if (iO == i2) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final mo[] o() {
        o oVar = this.m;
        mo[] moVarArr = null;
        m[] mVarArrM = oVar != null ? oVar.m() : null;
        if (mVarArrM != null && mVarArrM.length != 0) {
            moVarArr = new mo[mVarArrM.length];
            for (int i2 = 0; i2 < mVarArrM.length; i2++) {
                m mVar = mVarArrM[i2];
                if (mVar != null) {
                    moVarArr[i2] = new com.thinkup.core.common.no.o.on(mVar.o(), mVar.m(), mVar.n());
                }
            }
        }
        return moVarArr;
    }

    private void o(int i2) {
        this.o = i2;
    }

    private void o(o oVar) {
        this.m = oVar;
    }
}
