package com.thinkup.core.n.o;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.smartdigimkt.o0.b;
import com.smartdigimkt.w7.a;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.basead.adx.api.TUAdxSetting;
import com.thinkup.core.common.n.o0m;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n0.o0o;
import com.thinkup.core.common.n0.oo;
import com.thinkup.core.common.nn;
import com.thinkup.core.common.ooo.mm;
import com.thinkup.core.oo.n0;
import com.thinkup.core.oo.nm;
import com.thinkup.core.oo.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o extends com.thinkup.core.common.n0.o {
    public static final int m = 1;
    private static final String moo = "o";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42410n = "ex_pkg";
    public static final int o = 0;
    public long m00;
    public long m0m;
    public int m0n;
    public long m0o;
    public long mo0;
    private int mom;
    String n0;
    String nm;
    String nn;
    String no;
    private int no0;
    private long nom;
    private long non;
    private TUAdRequest noo;
    String o00;
    String o0m;
    String o0n;
    String o0o;
    String om0;
    String omm;
    String omn;
    String omo;
    JSONObject on0;
    public long onm;
    public long onn;
    public long ono;
    int oo0;
    int oom;
    String oon;
    int ooo;
    private final String mon = "hb_list";
    private final String mm0 = "request_id";
    private final String mmo = "ch_info";
    private final String mmm = "wf";
    private final String mmn = "np";
    private final String mn0 = a.v0;
    private final String mno = "last_wf";
    private final String mnm = "co";
    private final String mnn = "adx_ext";
    private final String n00 = "debug";
    private final String n0o = "sdk_ext";
    private final String n0m = "last_win";
    private final String n0n = "last_m_data";

    public o(String str, String str2, String str3, List<JSONObject> list, int i2, n0 n0Var) {
        this.no0 = 0;
        this.n0 = str3;
        this.nn = str;
        this.o00 = str2;
        this.mom = i2;
        JSONArray jSONArray = new JSONArray();
        Iterator<JSONObject> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.no = mm.o(jSONArray.toString().getBytes());
        if (n0Var != null) {
            this.oo0 = n0Var.nmn();
            this.ooo = n0Var.o0mn();
            this.no0 = n0Var.omo0();
        }
    }

    private void o0(int i2) {
        this.oom = i2;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        return this.nn;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final JSONObject mm() {
        JSONObject jSONObjectMm = super.mm();
        try {
            jSONObjectMm.put("p_ls", this.m0n);
            jSONObjectMm.put("p_lt_f_i", this.mo0);
        } catch (Throwable unused) {
        }
        return jSONObjectMm;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String mn() {
        String string = mo().toString();
        String string2 = mm().toString();
        HashMap map = new HashMap();
        String strO = mm.o(string);
        String strO2 = mm.o(string2);
        map.put("p", strO);
        map.put("p2", strO2);
        map.put("hb_list", this.no);
        map.put("request_id", this.n0);
        int i2 = this.oom;
        if (i2 > 0) {
            map.put(a.v0, Integer.valueOf(i2));
        }
        if (this.mom == 0) {
            if (!TextUtils.isEmpty(this.nm)) {
                map.put("ch_info", this.nm);
            }
            if (!TextUtils.isEmpty(this.o0o)) {
                map.put("wf", this.o0o);
            }
            if (!TextUtils.isEmpty(this.o0m)) {
                map.put("np", this.o0m);
            }
            if (!TextUtils.isEmpty(this.oon)) {
                map.put("last_wf", this.oon);
            }
            if (!TextUtils.isEmpty(this.om0)) {
                map.put("co", this.om0);
            }
            map.put("adx_ext", this.omo);
            if (o0n.m().n0() != null) {
                map.put("ex_pkg", mm.o(o0n.m().n0().toString()));
            }
            if (o0n.m().m0o() && o0n.m().omm()) {
                map.put("debug", 1);
            }
            if (!TextUtils.isEmpty(this.o0n)) {
                map.put("sdk_ext", this.o0n);
            }
            if (!TextUtils.isEmpty(this.omm)) {
                map.put("last_win", this.omm);
            }
            if (!TextUtils.isEmpty(this.omn)) {
                map.put("last_m_data", this.omn);
            }
        }
        Set<String> setKeySet = map.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : setKeySet) {
                jSONObject.put(str, map.get(str));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    @Override // com.thinkup.core.common.n0.o
    public final JSONObject mo() {
        n0 n0VarM;
        JSONObject jSONObjectOomn;
        Object obj;
        JSONObject jSONObjectO;
        JSONObject jSONObjectMo = super.mo();
        try {
            jSONObjectMo.put("app_id", o0n.m().o00());
            jSONObjectMo.put("pl_id", this.o00);
            jSONObjectMo.put("session_id", o0n.m().on(this.o00));
            jSONObjectMo.put("t_g_id", this.oo0);
            jSONObjectMo.put("gro_id", this.ooo);
            String strOnm = o0n.m().onm();
            if (!TextUtils.isEmpty(strOnm)) {
                jSONObjectMo.put(a.h0, strOnm);
            }
            String strOnn = o0n.m().onn();
            if (TextUtils.isEmpty(strOnn)) {
                o0n.m().mn(o0n.m().ono());
                jSONObjectMo.put(a.i0, o0n.m().ono());
            } else {
                jSONObjectMo.put(a.i0, strOnn);
            }
            jSONObjectMo.put(a.m0, com.thinkup.core.common.ooo.n0.nm(o0n.m().on()));
            if (this.mom == 0) {
                jSONObjectMo.put(a.n0, nn.o().n());
                nn.o();
                jSONObjectMo.put(a.o0, nn.m());
            }
            JSONObject jSONObjectO2 = oo.o(this.o00);
            if (jSONObjectO2 != null) {
                jSONObjectMo.put("customs", jSONObjectO2);
            }
            oo.o(jSONObjectMo);
            nm nmVarO = nm.o(o0n.m().on());
            String str = this.o00;
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (!TextUtils.isEmpty(str) && (n0VarM = nmVarO.m(str)) != null && (jSONObjectOomn = n0VarM.oomn()) != null) {
                        jSONObjectMo.put("p_c", jSONObjectOomn);
                    }
                } catch (Exception unused) {
                }
            }
            if (this.no0 > 0 && (jSONObjectO = com.thinkup.core.o0.m.o().o(this.o00, this.no0)) != null) {
                jSONObjectMo.put("value_d", jSONObjectO);
            }
            if (TUAdxSetting.getInstance().isAdxNetworkMode(this.o00)) {
                jSONObjectMo.put("is_s", 1);
                jSONObjectMo.put(a.p0, this.on0);
            }
            boolean zM = com.thinkup.core.common.ooo.nn.m();
            com.thinkup.core.oo.m mVarM = o0.o(o0n.m().on()).m(o0n.m().o00());
            jSONObjectMo.put("coppa", (mVarM.oom() == 2 && zM) ? 1 : 2);
            jSONObjectMo.put(a.r0, mVarM.ooo() == 3 ? 1 : 2);
            jSONObjectMo.put(a.s0, 1);
            o0m o0mVarN = o0n.m().n();
            if (o0mVarN != null) {
                o0mVarN.fillRequestDataForDl(jSONObjectMo);
            }
            long j = this.ono;
            if (j > 0) {
                jSONObjectMo.put("l_t_bstart", j);
            }
            long j2 = this.onm;
            if (j2 > 0) {
                jSONObjectMo.put("l_t_breq", j2);
            }
            long j3 = this.onn;
            if (j3 > 0) {
                jSONObjectMo.put("h_s_t", j3);
            }
            long j4 = this.m00;
            if (j4 > 0) {
                jSONObjectMo.put("h_b_to", j4);
            }
            long j5 = this.m0o;
            if (j5 > 0) {
                jSONObjectMo.put(n0.o.on0, j5);
            }
            long j6 = this.m0m;
            if (j6 > 0) {
                jSONObjectMo.put("sp_to", j6);
            }
            Pair<Integer, List<String>> pairMo0 = o0n.m().mo0();
            if (pairMo0 != null && (obj = pairMo0.first) != null) {
                jSONObjectMo.put("is_fdevice", ((Integer) obj).intValue());
            }
            String strOm = mVarM.om();
            if (!TextUtils.isEmpty(strOm)) {
                jSONObjectMo.put("d_r_ls", strOm);
            }
            TUAdRequest tUAdRequest = this.noo;
            if (tUAdRequest != null) {
                jSONObjectMo.put("channel_from", tUAdRequest.getChannelSource());
            } else {
                jSONObjectMo.put("channel_from", o0n.m().m00());
            }
        } catch (Exception unused2) {
        }
        return jSONObjectMo;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, String> n() {
        HashMap map = new HashMap();
        if (this.mom == 0) {
            map.put("Accept-Encoding", b.d);
        }
        map.put("Content-Type", "application/json;charset=utf-8");
        return map;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void n0() {
    }

    @Override // com.thinkup.core.common.n0.o
    public final int nm() {
        return 246;
    }

    @Override // com.thinkup.core.common.n0.o
    public final com.thinkup.core.common.n0.m.o0 nn() {
        return com.thinkup.core.common.n0.m.o0.o("bid");
    }

    @Override // com.thinkup.core.common.n0.o
    public final int o() {
        return 1;
    }

    @Override // com.thinkup.core.common.n0.o
    public final List<String> o0m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("anti");
        return arrayList;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Context om() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
    }

    @Override // com.thinkup.core.common.n0.o
    public final byte[] o0() {
        return mn().getBytes();
    }

    public final void o(m mVar) {
        String str = mVar.o;
        if (str != null) {
            this.nm = mm.o(str.getBytes());
        }
        this.oom = mVar.om;
        if (!TextUtils.isEmpty(mVar.m) && !TextUtils.equals("[]", mVar.m)) {
            this.o0o = mm.o(mVar.m.getBytes());
        }
        if (!TextUtils.isEmpty(mVar.f42409n) && !TextUtils.equals("[]", mVar.f42409n)) {
            this.o0m = mm.o(mVar.f42409n.getBytes());
        }
        if (!TextUtils.isEmpty(mVar.o0) && !TextUtils.equals("[]", mVar.o0)) {
            this.oon = mm.o(mVar.o0.getBytes());
        }
        if (!TextUtils.isEmpty(mVar.oo) && !TextUtils.equals("[]", mVar.oo)) {
            this.om0 = mm.o(mVar.oo.getBytes());
        }
        this.omo = "";
        if (!TextUtils.isEmpty(mVar.on)) {
            this.omo = mm.o(mVar.on.getBytes());
        }
        if (!TextUtils.isEmpty(mVar.m0)) {
            this.o0n = mm.o(mVar.m0.getBytes());
        }
        if (!TextUtils.isEmpty(mVar.mo) && !TextUtils.equals(JsonUtils.EMPTY_JSON, mVar.mo)) {
            this.omm = mm.o(mVar.mo.getBytes());
        }
        if (!TextUtils.isEmpty(mVar.mm) && !TextUtils.equals("[]", mVar.mm)) {
            this.omn = mm.o(mVar.mm.getBytes());
        }
        this.on0 = mVar.mn;
        this.ono = mVar.n0;
        this.onm = mVar.no;
        this.onn = mVar.nm;
        this.m00 = mVar.nn;
        this.m0o = mVar.o00;
        this.m0m = mVar.o0o;
        this.m0n = mVar.o0m;
        this.mo0 = mVar.o0n;
        this.noo = mVar.oo0;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(int i2, Object obj) {
        super.o(i2, obj);
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(int i2, o0o o0oVar) {
        this.nom = System.currentTimeMillis();
        this.non = SystemClock.elapsedRealtime();
        super.o(i2, o0oVar);
    }

    @Override // com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        try {
            com.thinkup.core.common.oo0.oo.o("bid", this.o00, this.nom, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.non, this.noo);
            return new JSONObject(obj.toString());
        } catch (Exception unused) {
            return null;
        }
    }
}
