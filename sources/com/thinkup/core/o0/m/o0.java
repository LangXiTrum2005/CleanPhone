package com.thinkup.core.o0.m;

import android.text.TextUtils;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.oo0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0mo;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.on.oo0m;
import com.thinkup.core.common.ooo.onm;
import com.thinkup.core.oo.n0;
import com.thinkup.core.oo.nm;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 implements m {
    private static final String m = "PlacementStatisticRecord";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final nm f42439n = nm.o(o0n.m().on());
    o o;
    private final oo o0;
    private final ConcurrentHashMap<String, com.thinkup.core.o0.o.m> om;
    private final ConcurrentHashMap<String, Boolean> on;
    private final om oo;

    public o0() {
        oo ooVarO = oo.o();
        this.o0 = ooVarO;
        this.oo = new om(ooVarO);
        this.om = new ConcurrentHashMap<>();
        this.on = new ConcurrentHashMap<>();
        this.o = new o(ooVarO);
    }

    private com.thinkup.core.o0.o.m n(String str) {
        n0 n0VarM = this.f42439n.m(str);
        com.thinkup.core.o0.o.m mVar = this.om.get(str);
        if (mVar == null) {
            mVar = new com.thinkup.core.o0.o.m();
            String strN = onm.n(o0n.m().on(), oo0.m.f41931n, str, "");
            if (!TextUtils.isEmpty(strN)) {
                try {
                    mVar.o(Double.parseDouble(strN));
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
            this.om.put(str, mVar);
        }
        if (n0VarM != null) {
            mVar.o(n0VarM.om0n());
            mVar.o(n0VarM.omom());
            mVar.m(n0VarM.omoo());
            mVar.n(n0VarM.omm0());
            mVar.o0(n0VarM.mm() != null ? 1 : 2);
        }
        return mVar;
    }

    private void o0(final String str) {
        com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.o0.m.o0.1
            @Override // java.lang.Runnable
            public final void run() {
                o0.this.om.remove(str);
                o0.this.o0.o(str);
            }
        }, 13);
    }

    @Override // com.thinkup.core.o0.m.m
    public final void m(String str) {
        o(str, n(str));
    }

    @Override // com.thinkup.core.o0.m.m
    public final void o(String str, String str2, int i2, TUAdRequest tUAdRequest, o0mm o0mmVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ((o0mmVar == null || !o0mmVar.m000()) && m(str, 10)) {
            com.thinkup.core.o0.o.o oVar = new com.thinkup.core.o0.o.o();
            if (o0mmVar != null) {
                oVar.m(o0mmVar.m0o());
                on0 on0VarN0n = o0mmVar.n0n();
                if (on0VarN0n != null) {
                    oo0m oo0mVar = on0VarN0n.oom;
                    oVar.n(oo0mVar != null ? oo0mVar.om() : "");
                }
                oVar.o(o0mmVar.moo());
                oVar.m(o0mmVar.nm());
            }
            oVar.o(str2);
            oVar.o0(o0n.m().o0m());
            oVar.o(System.currentTimeMillis());
            oVar.oo(str);
            oVar.n(10);
            oVar.o(i2);
            if (o0mmVar != null) {
                com.thinkup.core.o0.o.n nVar = this.o.o.get(str);
                oVar.o();
                oVar.toString();
                if (nVar != null) {
                    nVar.o(oVar);
                }
            }
            o(oVar, tUAdRequest);
        }
    }

    private boolean m(String str, int i2) {
        com.thinkup.core.o0.o.m mVarN = n(str);
        boolean z2 = mVarN.n() || mVarN.m0();
        Boolean bool = this.on.get(str);
        if (bool != null) {
            boolean zEquals = Boolean.TRUE.equals(bool);
            if (!z2 && zEquals) {
                o0(str);
            }
        } else if (!z2) {
            o0(str);
        }
        this.on.put(str, Boolean.valueOf(z2));
        return i2 == 4 ? mVarN.n() : z2;
    }

    private JSONArray m(int i2, String str, int i3) {
        List<com.thinkup.core.o0.o.o> listO = o(i2, str, i3);
        if (listO == null || listO.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<com.thinkup.core.o0.o.o> it = listO.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo());
        }
        return jSONArray;
    }

    private static com.thinkup.core.o0.o.o m(o0mo o0moVar, o0mm o0mmVar) {
        com.thinkup.core.o0.o.o oVar = new com.thinkup.core.o0.o.o();
        if (o0moVar != null) {
            oVar.o(o0moVar.oon0());
            oVar.oo(o0moVar.oomn());
            if (o0moVar instanceof com.thinkup.core.common.on.n0) {
                oVar.o(((com.thinkup.core.common.on.n0) o0moVar).no0());
            }
        }
        if (o0mmVar != null) {
            oVar.m(o0mmVar.m0o());
            on0 on0VarN0n = o0mmVar.n0n();
            if (on0VarN0n != null) {
                oo0m oo0mVar = on0VarN0n.oom;
                oVar.n(oo0mVar != null ? oo0mVar.om() : "");
            }
            oVar.o(o0mmVar.ooon() > 0.0d ? o0mmVar.ooon() : o0mmVar.moo());
            oVar.m(o0mmVar.nm());
        }
        oVar.o0(o0n.m().o0m());
        oVar.o(System.currentTimeMillis());
        oVar.n(4);
        return oVar;
    }

    @Override // com.thinkup.core.o0.m.m
    public final void o(o0mo o0moVar, o0mm o0mmVar) {
        TUAdRequest tUAdRequestO;
        if (o0moVar == null || o0mmVar == null || o0mmVar.m000()) {
            return;
        }
        String strOomn = o0moVar.oomn();
        if (!TextUtils.isEmpty(strOomn) && m(strOomn, 4)) {
            try {
                tUAdRequestO = ((com.thinkup.core.common.on.n0) o0moVar).o();
            } catch (Exception unused) {
                tUAdRequestO = null;
            }
            com.thinkup.core.o0.o.o oVar = new com.thinkup.core.o0.o.o();
            oVar.o(o0moVar.oon0());
            oVar.oo(o0moVar.oomn());
            if (o0moVar instanceof com.thinkup.core.common.on.n0) {
                oVar.o(((com.thinkup.core.common.on.n0) o0moVar).no0());
            }
            oVar.m(o0mmVar.m0o());
            on0 on0VarN0n = o0mmVar.n0n();
            if (on0VarN0n != null) {
                oo0m oo0mVar = on0VarN0n.oom;
                oVar.n(oo0mVar != null ? oo0mVar.om() : "");
            }
            oVar.o(o0mmVar.ooon() > 0.0d ? o0mmVar.ooon() : o0mmVar.moo());
            oVar.m(o0mmVar.nm());
            oVar.o0(o0n.m().o0m());
            oVar.o(System.currentTimeMillis());
            oVar.n(4);
            o(oVar, tUAdRequestO);
        }
    }

    @Override // com.thinkup.core.o0.m.m
    public final List<com.thinkup.core.o0.o.o> o(int i2, String str, int i3) {
        oo ooVar = this.o0;
        if (ooVar != null) {
            return ooVar.o(i2, str, i3);
        }
        return null;
    }

    @Override // com.thinkup.core.o0.m.m
    public final JSONObject o(String str) {
        return o(str, 0);
    }

    @Override // com.thinkup.core.o0.m.m
    public final JSONObject o(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.thinkup.core.o0.o.m mVarN = n(str);
        if (mVarN.m()) {
            return o(str, i2, mVarN.o());
        }
        return null;
    }

    @Override // com.thinkup.core.o0.m.m
    public final JSONObject o(String str, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (i2 == 4) {
                JSONArray jSONArrayM = m(4, str, i3);
                if (jSONArrayM != null) {
                    jSONObject.put("imp", jSONArrayM);
                }
            } else if (i2 == 10) {
                JSONArray jSONArrayM2 = m(10, str, i3);
                if (jSONArrayM2 != null) {
                    jSONObject.put("fill", jSONArrayM2);
                }
            } else {
                JSONArray jSONArrayM3 = m(10, str, i3);
                if (jSONArrayM3 != null) {
                    jSONObject.put("fill", jSONArrayM3);
                }
                JSONArray jSONArrayM4 = m(4, str, i3);
                if (jSONArrayM4 != null) {
                    jSONObject.put("imp", jSONArrayM4);
                }
                jSONObject.put("def_ecpm", String.valueOf(o(str, jSONArrayM4)));
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    @Override // com.thinkup.core.o0.m.m
    public final com.thinkup.core.o0.o.o0 o(String str, int i2, com.thinkup.core.oo.om omVar) {
        o oVar = this.o;
        com.thinkup.core.o0.o.n nVar = oVar.o.get(str);
        int i3 = omVar.o() == 1 ? i2 : -1;
        if (nVar != null && nVar.m(omVar) && nVar.o(i3) != null) {
            nVar.n(i2);
        } else {
            nVar = new com.thinkup.core.o0.o.n();
            nVar.o(omVar);
            int iN = omVar.n();
            long jCurrentTimeMillis = System.currentTimeMillis() - (((long) (omVar.m() * 86400)) * 1000);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jCurrentTimeMillis);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            nVar.o(i3, oVar.m.o(str, i3, calendar.getTimeInMillis(), iN));
            oVar.o.put(str, nVar);
        }
        return nVar.m(i3);
    }

    private void o(com.thinkup.core.o0.o.o oVar, TUAdRequest tUAdRequest) {
        oVar.toString();
        String strMm = oVar.mm();
        com.thinkup.core.o0.o.m mVarN = n(strMm);
        oo ooVar = this.o0;
        if (ooVar != null) {
            ooVar.o(oVar);
        }
        if (oVar.mn() == 4) {
            o(strMm, mVarN, tUAdRequest);
        }
    }

    private double o(String str, JSONArray jSONArray) {
        com.thinkup.core.o0.o.m mVarN = n(str);
        if (!mVarN.oo()) {
            mVarN.on();
            return mVarN.on();
        }
        if (jSONArray == null) {
            return -1.0d;
        }
        try {
            if (jSONArray.length() > 0) {
                return jSONArray.getJSONObject(0).getDouble("ecpm");
            }
            return -1.0d;
        } catch (Exception e2) {
            e2.getMessage();
            return -1.0d;
        }
    }

    private void o(String str, com.thinkup.core.o0.o.m mVar, TUAdRequest tUAdRequest) {
        double[][] dArrOm;
        if (mVar == null || (dArrOm = mVar.om()) == null) {
            return;
        }
        if (mVar.oo()) {
            o(str, tUAdRequest);
            return;
        }
        double[] dArrO = o(str, mVar);
        double d = dArrO[0];
        double d2 = dArrO[1];
        if (d == d2) {
            return;
        }
        double[] dArrO2 = d > 0.0d ? o(dArrOm, d) : null;
        double[] dArrO3 = d2 > 0.0d ? o(dArrOm, d2) : null;
        if (dArrO2 == null) {
            if (dArrO3 == null) {
                return;
            }
        } else if (dArrO3 != null && dArrO2[0] == dArrO3[0] && dArrO2[1] == dArrO3[1]) {
            return;
        }
        o(str, tUAdRequest);
    }

    private static com.thinkup.core.o0.o.o o(String str, String str2, int i2, o0mm o0mmVar) {
        com.thinkup.core.o0.o.o oVar = new com.thinkup.core.o0.o.o();
        if (o0mmVar != null) {
            oVar.m(o0mmVar.m0o());
            on0 on0VarN0n = o0mmVar.n0n();
            if (on0VarN0n != null) {
                oo0m oo0mVar = on0VarN0n.oom;
                oVar.n(oo0mVar != null ? oo0mVar.om() : "");
            }
            oVar.o(o0mmVar.moo());
            oVar.m(o0mmVar.nm());
        }
        oVar.o(str);
        oVar.o0(o0n.m().o0m());
        oVar.o(System.currentTimeMillis());
        oVar.oo(str2);
        oVar.n(10);
        oVar.o(i2);
        return oVar;
    }

    private double[] o(String str, com.thinkup.core.o0.o.m mVar) {
        if (mVar != null && !mVar.oo()) {
            double dO = this.oo.o(mVar.o0(), str);
            double dOn = mVar.on();
            if (dOn != dO) {
                mVar.o(dO);
                this.om.put(str, mVar);
                onm.m(o0n.m().on(), oo0.m.f41931n, str, String.valueOf(dO));
            }
            return new double[]{dO, dOn};
        }
        return new double[]{-1.0d, -1.0d};
    }

    private static double[] o(double[][] dArr, double d) {
        for (double[] dArr2 : dArr) {
            if (dArr2.length == 2) {
                double d2 = dArr2[0];
                double d3 = dArr2[1];
                if (d >= d2 && d <= d3) {
                    return dArr2;
                }
            }
        }
        return null;
    }

    private void o(String str, TUAdRequest tUAdRequest) {
        o0n o0nVarM = o0n.m();
        this.f42439n.o(this.f42439n.oo(str), o0nVarM.o00(), o0nVarM.o0o(), str, null, null, 2, true, tUAdRequest);
    }
}
