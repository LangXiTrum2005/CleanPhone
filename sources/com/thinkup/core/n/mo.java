package com.thinkup.core.n;

import android.os.SystemClock;
import android.text.TextUtils;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.n0.o0o;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o00n;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0n;
import com.thinkup.core.common.on.o0nm;
import com.thinkup.core.common.on.o0om;
import com.thinkup.core.common.on.om0;
import com.thinkup.core.common.on.omn;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.oom;
import com.thinkup.core.common.ooo.m0n;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.oo.nm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mo extends m {
    List<o0mm> om0;
    boolean omm;
    boolean omn;
    List<o0mm> omo;
    String oon;

    public mo(o0om o0omVar, List<o0mm> list) {
        super(o0omVar);
        this.oon = nn.o(o0omVar.m, this.mm, this.mn, o0omVar.om, 0).toString();
        com.thinkup.core.common.oom.mo moVar = o0omVar.omo;
        this.om0 = moVar != null ? moVar.o() : null;
        this.omo = list != null ? new ArrayList(list) : null;
    }

    private void m(JSONArray jSONArray) {
        com.thinkup.core.common.oom.mo moVar = this.o.omo;
        List<o0mm> listO = moVar != null ? moVar.o() : null;
        if (listO != null) {
            int size = listO.size();
            for (int i2 = 0; i2 < size; i2++) {
                o0mm o0mmVar = listO.get(i2);
                if (!o0mmVar.o0m0()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("ad_source_id", o0mmVar.m0o());
                        jSONObject.put("price", o0mmVar.moo());
                        on0 on0VarN0n = o0mmVar.n0n();
                        if (on0VarN0n != null) {
                            jSONObject.put("tp_bid_id", on0VarN0n.on);
                        }
                        jSONObject.put("s_pty", o0mmVar.o0nm());
                        jSONArray.put(jSONObject);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    private String om() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh", this.o.o0n.mnn());
            com.thinkup.core.common.mo.n.o().o(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.thinkup.core.n.m
    public final synchronized void o(List<JSONObject> list, Map<String, o0mm> map, Map<String, JSONObject> map2) {
        super.o(list, map, map2);
        oom.o(this.o.m).o(this.o.oo);
        this.omm = false;
        this.omn = false;
        try {
            Iterator<Map.Entry<String, o0mm>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    o0mm value = it.next().getValue();
                    if (value.nm() == 66) {
                        this.omm = true;
                    } else if (value.nm() == 6) {
                        this.omn = true;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.thinkup.core.n.m
    public final String oo() {
        return this.o.n0;
    }

    @Override // com.thinkup.core.n.m
    public final void o(List<JSONObject> list, o0o o0oVar) {
        String string;
        boolean zM;
        String strO;
        Boolean boolN;
        String str;
        long j;
        long j2;
        mmm mmmVar;
        mmm mmmVar2;
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        m(jSONArray2);
        o(jSONArray);
        com.thinkup.core.n.o.m mVar = new com.thinkup.core.n.o.m();
        mVar.o = this.oon;
        mVar.m = jSONArray2.toString();
        mVar.om = this.o.nm.o().oom0();
        String string2 = jSONArray.length() > 0 ? jSONArray.toString() : "";
        o0nm o0nmVar = this.o.oom;
        if (o0nmVar != null) {
            string = o0nmVar.o().toString();
            mVar.o0 = string;
        } else {
            string = "";
        }
        mVar.oo = string2;
        mVar.on = this.o.nm.o().on0();
        mVar.m0 = om();
        omn omnVar = this.o.om0;
        mVar.mo = omnVar != null ? omnVar.m0() : "";
        o0om o0omVar = this.o;
        String str2 = o0omVar.on0;
        if (str2 == null) {
            str2 = "";
        }
        mVar.mm = str2;
        mVar.mn = o0omVar.o0n.oo00();
        int iM = oom.o(this.o.m).m(this.o.oo);
        o00n o00nVar = this.o.oon;
        TUAdRequest tUAdRequestM = null;
        if (o00nVar != null) {
            boolN = o00nVar.n();
            strO = this.o.oon.o();
            zM = this.o.oon.m();
        } else {
            zM = true;
            strO = "";
            boolN = null;
        }
        o0om o0omVar2 = this.o;
        n0 n0Var = o0omVar2.o0n;
        int i2 = o0omVar2.f42240n.f42198n;
        int i3 = o0omVar2.oo0;
        boolean z2 = this.omm;
        boolean z3 = this.omn;
        boolean zO = o00.o(o0omVar2.m);
        Boolean bool = boolN;
        o0n o0nVar = new o0n(n0Var.oono(), null);
        o0nVar.f42235n = "1004684";
        o0nVar.o(n0Var);
        o0nVar.o0 = n0Var.oon0();
        o0nVar.oo = n0Var.oomn();
        o0nVar.n0 = String.valueOf(i2);
        o0nVar.o00 = String.valueOf(iM);
        o0nVar.o0o = String.valueOf(n0Var.oono());
        o0nVar.o0m = zM ? "1" : "2";
        o0nVar.o0n = String.valueOf(i3);
        if (!TextUtils.isEmpty(string2)) {
            o0nVar.oo0 = string2;
        }
        if (!TextUtils.isEmpty(string)) {
            o0nVar.ooo = string;
        }
        if (bool == null) {
            str = "0";
        } else {
            str = bool.booleanValue() ? "1" : "2";
        }
        o0nVar.oom = str;
        o0nVar.oon = strO;
        o0nVar.om0 = z2 ? "1" : "2";
        o0nVar.omo = z3 ? "1" : "2";
        o0nVar.omm = String.valueOf(i2);
        o0nVar.omn = zO ? "1" : "2";
        com.thinkup.core.common.oo0.oo.m(o0nVar);
        o0om o0omVar3 = this.o;
        if (o0omVar3 == null || (mmmVar2 = o0omVar3.f42240n) == null) {
            j = 0;
            j2 = 0;
        } else {
            j = mmmVar2.mn;
            j2 = mmmVar2.m0;
        }
        if (j > 0) {
            mVar.n0 = this.nm - o0omVar3.f42240n.mn;
            mVar.no = SystemClock.elapsedRealtime() - this.o.f42240n.mn;
        }
        mVar.nm = this.o0;
        mVar.o0o = j2;
        mVar.o00 = this.o.nm.mo();
        com.thinkup.core.oo.n0 n0VarO = this.o.nm.o();
        if (n0VarO != null) {
            mVar.nn = n0VarO.no0();
        }
        mVar.o0m = nm.o(this.o.m).mm(this.mn);
        mVar.o0n = (System.currentTimeMillis() - com.thinkup.core.common.n.o0n.m().no0()) - mVar.no;
        o0om o0omVar4 = this.o;
        if (o0omVar4 != null && (mmmVar = o0omVar4.f42240n) != null) {
            tUAdRequestM = mmmVar.m();
        }
        mVar.oo0 = tUAdRequestM;
        com.thinkup.core.n.o.o oVar = new com.thinkup.core.n.o.o(this.n0, this.mn, this.mm, list, 0, n0VarO);
        oVar.o(mVar);
        oVar.o(0, o0oVar);
    }

    private void o(String str, String str2) {
        String strO;
        boolean zM;
        Boolean boolN;
        String str3;
        int iM = oom.o(this.o.m).m(this.o.oo);
        o00n o00nVar = this.o.oon;
        if (o00nVar != null) {
            boolN = o00nVar.n();
            strO = this.o.oon.o();
            zM = this.o.oon.m();
        } else {
            strO = "";
            zM = true;
            boolN = null;
        }
        o0om o0omVar = this.o;
        n0 n0Var = o0omVar.o0n;
        int i2 = o0omVar.f42240n.f42198n;
        int i3 = o0omVar.oo0;
        boolean z2 = this.omm;
        boolean z3 = this.omn;
        boolean zO = o00.o(o0omVar.m);
        o0n o0nVar = new o0n(n0Var.oono(), null);
        o0nVar.f42235n = "1004684";
        o0nVar.o(n0Var);
        o0nVar.o0 = n0Var.oon0();
        o0nVar.oo = n0Var.oomn();
        o0nVar.n0 = String.valueOf(i2);
        o0nVar.o00 = String.valueOf(iM);
        o0nVar.o0o = String.valueOf(n0Var.oono());
        o0nVar.o0m = zM ? "1" : "2";
        o0nVar.o0n = String.valueOf(i3);
        if (!TextUtils.isEmpty(str2)) {
            o0nVar.oo0 = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            o0nVar.ooo = str;
        }
        if (boolN == null) {
            str3 = "0";
        } else {
            str3 = boolN.booleanValue() ? "1" : "2";
        }
        o0nVar.oom = str3;
        o0nVar.oon = strO;
        o0nVar.om0 = z2 ? "1" : "2";
        o0nVar.omo = z3 ? "1" : "2";
        o0nVar.omm = String.valueOf(i2);
        o0nVar.omn = zO ? "1" : "2";
        com.thinkup.core.common.oo0.oo.m(o0nVar);
    }

    @Override // com.thinkup.core.n.m, com.thinkup.core.n.o
    public final void o(o0mm o0mmVar, om0 om0Var, long j) throws Throwable {
        super.o(o0mmVar, om0Var, j);
    }

    private void o(JSONArray jSONArray) {
        List<o0mm> list = this.omo;
        if (list != null) {
            Iterator<o0mm> it = list.iterator();
            while (it.hasNext()) {
                List<o0nm.o> listO = m0n.o(this.mn, it.next());
                if (listO != null && listO.size() > 0) {
                    Iterator<o0nm.o> it2 = listO.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next().o());
                    }
                }
            }
        }
        List<o0mm> list2 = this.om0;
        if (list2 != null) {
            Iterator<o0mm> it3 = list2.iterator();
            while (it3.hasNext()) {
                List<o0nm.o> listO2 = m0n.o(this.mn, it3.next());
                if (listO2 != null && listO2.size() > 0) {
                    Iterator<o0nm.o> it4 = listO2.iterator();
                    while (it4.hasNext()) {
                        jSONArray.put(it4.next().o());
                    }
                }
            }
        }
    }
}
