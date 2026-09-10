package com.thinkup.core.n;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.common.on.mnn;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0om;
import com.thinkup.core.common.on.om0;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.ono;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o {
    protected boolean m;
    protected o0om o;
    protected long o0;
    private final String oo = getClass().getSimpleName().concat(":");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected AtomicBoolean f42408n = new AtomicBoolean(false);

    public o(o0om o0omVar) {
        this.o = o0omVar;
    }

    public static JSONArray m(List<JSONObject> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (JSONObject jSONObject : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("network_firm_id", 67);
                if (jSONObject.has("unit_ids")) {
                    jSONObject2.put("unit_ids", jSONObject.get("unit_ids"));
                }
                jSONArray.put(jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public abstract void m();

    public abstract void o(o0mm o0mmVar, om0 om0Var, long j);

    public abstract void o(com.thinkup.core.n.m.m mVar);

    public void o(boolean z2) {
        this.m = z2;
    }

    public final boolean o() {
        return this.f42408n.get();
    }

    public static JSONArray o(List<o0mm> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (o0mm o0mmVar : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("network_firm_id", o0mmVar.nm());
                jSONObject.put("ad_source_id", o0mmVar.m0o());
                jSONObject.put("content", o0mmVar.o0m());
                if (!TextUtils.isEmpty(o0mmVar.mon())) {
                    jSONObject.put("error", o0mmVar.mon());
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    private void m(on0 on0Var, o0mm o0mmVar) throws Throwable {
        mnn mnnVar = new mnn(9, o0mmVar, this.o.o0n, on0Var.getSortPrice());
        o(mnnVar, o0mmVar);
        com.thinkup.core.n.o0.n.o(on0Var, mnnVar, true, 33);
    }

    public static void o(o0mm o0mmVar, String str, long j, int i2) {
        o0mmVar.oo(j);
        o0mmVar.m(0.0d);
        o0mmVar.oo(0.0d);
        o0mmVar.mn(i2);
        o0mmVar.no();
        if (TextUtils.isEmpty(str)) {
            o0mmVar.m0("bid error");
        } else {
            o0mmVar.m0(str);
        }
    }

    public static boolean o(boolean z2, o0mm o0mmVar, om0 om0Var) {
        double dO0n0 = o0mmVar.o0n0();
        boolean z3 = false;
        if (z2 && dO0n0 > 0.0d) {
            om0Var.getPrice();
            if (om0Var.getPrice() < dO0n0) {
                z3 = true;
            }
        }
        if (z3) {
            o0mmVar.nmn(1);
        }
        return z3;
    }

    private void o(on0 on0Var, o0mm o0mmVar) throws Throwable {
        mnn mnnVar = new mnn(6, o0mmVar, this.o.o0n, on0Var.getSortPrice());
        o(mnnVar, o0mmVar);
        com.thinkup.core.n.o0.n.o(on0Var, mnnVar, true, 23);
    }

    private static void o(mnn mnnVar, o0mm o0mmVar) {
        if (o0mmVar != null) {
            int iM0oo = o0mmVar.m0oo();
            if (iM0oo == 1) {
                mnnVar.o0(o0mmVar.o0n0());
            } else if (iM0oo == 2) {
                mnnVar.m(o0mmVar.m0on());
                mnnVar.o0(o0mmVar.m0om());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public final void o(o0mm o0mmVar, on0 on0Var) throws Throwable {
        double sortPrice;
        boolean z2;
        double d;
        String str;
        double sortPrice2;
        if (on0Var == null) {
            return;
        }
        on0Var.m(this.o.o0);
        on0Var.setOriginRequestId(this.o.o0);
        on0 on0VarO = n.o().o(this.o.oo, o0mmVar);
        if (on0VarO != null) {
            boolean zO = on0VarO.o();
            if (!zO && on0Var.getSortPrice() <= on0VarO.getSortPrice()) {
                sortPrice2 = on0VarO.getSortPrice();
                z2 = false;
            } else {
                sortPrice = on0Var.getSortPrice();
                if (zO) {
                    o0mmVar = o0mmVar;
                    com.thinkup.core.n.o0.n.o(on0VarO, new mnn(1, o0mmVar, this.o.o0n, sortPrice), true, 25);
                } else {
                    z2 = true;
                    sortPrice2 = sortPrice;
                }
            }
            d = sortPrice2;
            if (z2) {
                if (on0VarO != null) {
                    try {
                        com.thinkup.core.n.o0.n.o(on0VarO, new mnn(2, o0mmVar, this.o.o0n, d), true, 26);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                o0mmVar.o(on0Var, 2, 0, 1);
                if (o0mmVar.n0o() != 2) {
                    n nVarO = n.o();
                    str = this.o.oo;
                    ConcurrentHashMap<String, on0> concurrentHashMap = nVarO.o;
                    StringBuilder sbW = a.w(str);
                    sbW.append(on0Var.mn);
                    concurrentHashMap.put(sbW.toString(), on0Var);
                    if (o0mmVar.o0on()) {
                        com.thinkup.core.common.o.o.o().o(str, on0Var);
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                com.thinkup.core.n.o0.n.o(on0Var, new mnn(2, o0mmVar, this.o.o0n, d), false, 27);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            o0mmVar.o(on0VarO, 1, 0, 1);
        }
        o0mmVar = o0mmVar;
        sortPrice = on0Var.getSortPrice();
        z2 = true;
        d = sortPrice;
        if (z2) {
            if (on0VarO != null) {
                com.thinkup.core.n.o0.n.o(on0VarO, new mnn(2, o0mmVar, this.o.o0n, d), true, 26);
            }
            o0mmVar.o(on0Var, 2, 0, 1);
            if (o0mmVar.n0o() != 2) {
                n nVarO2 = n.o();
                str = this.o.oo;
                ConcurrentHashMap<String, on0> concurrentHashMap2 = nVarO2.o;
                StringBuilder sbW2 = a.w(str);
                sbW2.append(on0Var.mn);
                concurrentHashMap2.put(sbW2.toString(), on0Var);
                if (o0mmVar.o0on()) {
                    com.thinkup.core.common.o.o.o().o(str, on0Var);
                    return;
                }
                return;
            }
            return;
        }
        com.thinkup.core.n.o0.n.o(on0Var, new mnn(2, o0mmVar, this.o.o0n, d), false, 27);
        o0mmVar.o(on0VarO, 1, 0, 1);
    }

    public final boolean o(o0mm o0mmVar, String str, int i2) {
        return o(o0mmVar, str, i2, 0);
    }

    public final boolean o(o0mm o0mmVar, String str, int i2, int i3) {
        if (ono.o(0, this.o.o0n, o0mmVar, (om0) null) != null) {
            return false;
        }
        on0 on0VarO = n.o().o(this.o.oo, o0mmVar);
        if (on0VarO != null && !on0VarO.o()) {
            o0mmVar.o(on0VarO, 0, i2, i3);
            o0mmVar.m0(str);
            return true;
        }
        if (on0VarO != null) {
            try {
                n0 n0VarNmm = this.o.o0n.nmm();
                n0VarNmm.moo(on0VarO.n());
                n0VarNmm.onn(on0VarO.oon());
                n0VarNmm.mon(on0VarO.getOriginRequestId());
                com.thinkup.core.n.o0.n.o(on0VarO, new mnn(1, o0mmVar, n0VarNmm), true, 25);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    public final void o(int i2, om0 om0Var, double d, boolean z2) {
        double dOptDouble;
        if (i2 != 28) {
            return;
        }
        JSONObject jSONObjectOno = this.o.nm.o().ono();
        if (jSONObjectOno != null) {
            dOptDouble = jSONObjectOno.optDouble(String.valueOf(i2));
            if (dOptDouble <= 0.0d || dOptDouble > 1.0d) {
                dOptDouble = 0.95d;
            }
        } else {
            dOptDouble = 0.95d;
        }
        double dMax = om0Var.originPrice * dOptDouble;
        com.thinkup.core.common.oom.mo moVar = this.o.omo;
        List<o0mm> listO = moVar != null ? moVar.o() : null;
        if (listO != null) {
            Iterator<o0mm> it = listO.iterator();
            while (it.hasNext()) {
                double dO = nn.o(it.next());
                if (dO < om0Var.originPrice) {
                    dMax = Math.max(dMax, dO);
                    break;
                }
            }
        }
        double dMax2 = Math.max(dMax, d);
        double dRandom = (Math.random() * (om0Var.originPrice - dMax2)) + dMax2;
        om0Var.setPrice(dRandom);
        if (z2) {
            om0Var.setSortPrice(dRandom);
        }
    }

    public final double o(o0mm o0mmVar) {
        if (o0mmVar.o0mm() == null) {
            return 1.0d;
        }
        double dO = o(this.o.nm.o(), o0mmVar.o0mm());
        o0mmVar.nn();
        return dO;
    }

    private double o(double d, TUAdConst.CURRENCY currency) {
        if (currency == null) {
            return d;
        }
        double dO = o(this.o.nm.o(), currency);
        String.valueOf(d);
        String.valueOf(dO);
        double d2 = d * dO;
        String.valueOf(d2);
        return d2;
    }

    private static double o(com.thinkup.core.oo.n0 n0Var, TUAdConst.CURRENCY currency) {
        if (n0Var == null) {
            return 1.0d;
        }
        if (currency == TUAdConst.CURRENCY.RMB_CENT) {
            return (1.0d / n0Var.mom()) * 100.0d;
        }
        if (currency == TUAdConst.CURRENCY.RMB) {
            return 1.0d / n0Var.mom();
        }
        return 1.0d;
    }

    public final double o(double d, o0mm o0mmVar) {
        double dMom;
        if (o0mmVar.o0mm() != null) {
            com.thinkup.core.oo.n0 n0VarO = this.o.nm.o();
            if (o0mmVar.o0mm() == TUAdConst.CURRENCY.RMB) {
                dMom = n0VarO.mom();
            } else if (o0mmVar.o0mm() == TUAdConst.CURRENCY.RMB_CENT) {
                d /= 100.0d;
                dMom = n0VarO.mom();
            }
            return dMom * d;
        }
        return d;
    }

    public final void o(long j) {
        this.o0 = j;
    }
}
