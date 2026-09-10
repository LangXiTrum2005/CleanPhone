package com.thinkup.core.common.on;

import android.text.TextUtils;
import com.p004ironsource.m5;
import com.smartdigimkt.x.j;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class nnm implements Serializable {
    String[] m;
    String[] m0;
    String[] m00;
    Map<Integer, String[]> m0m;
    String[] m0n;
    String[] m0o;
    String[] mm;
    String mm0;
    String mmm;
    String mmn;
    String mmo;
    String[] mn;
    String mn0;
    String mnm;
    String mnn;
    String mno;
    String[] mo;
    String[] mo0;
    String mom;
    String mon;
    String moo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String[] f42214n;
    String[] n0;
    String n00;
    String n0m;
    String n0n;
    String n0o;
    String[] nm;
    String nm0;
    String nmm;
    String nmn;
    String nmo;
    String[] nn;
    String nn0;
    String nnm;
    String nnn;
    String nno;
    String[] no;
    String no0;
    String nom;
    String non;
    String noo;
    String o;
    String[] o0;
    String[] o00;
    String o000;
    String o00m;
    String o00n;
    String o00o;
    String[] o0m;
    String[] o0n;
    String[] o0o;
    String o0o0;
    String o0om;
    String[] o0oo;
    String[] om;
    String[] om0;
    String[] omm;
    String[] omn;
    String[] omo;
    String[] on;
    String[] on0;
    String[] onm;
    String[] onn;
    String[] ono;
    String[] oo;
    String[] oo0;
    String[] oom;
    String[] oon;
    String[] ooo;

    private void m(String[] strArr) {
        this.o0m = strArr;
    }

    private String[] m0() {
        return this.on;
    }

    private String m00() {
        return this.mmm;
    }

    private String m0m() {
        return this.mn0;
    }

    private String m0n() {
        return this.mno;
    }

    private String m0o() {
        return this.mmn;
    }

    private String[] mm() {
        return this.mo;
    }

    private String mm0() {
        return this.n0m;
    }

    private String mmm() {
        return this.no0;
    }

    private String mmn() {
        return this.noo;
    }

    private String mmo() {
        return this.n0n;
    }

    private String[] mn() {
        return this.mm;
    }

    private String[] mn0() {
        return this.ooo;
    }

    private String[] mnm() {
        return this.oon;
    }

    private String[] mnn() {
        return this.om0;
    }

    private String[] mno() {
        return this.oom;
    }

    private String[] mo() {
        return this.m0;
    }

    private String mo0() {
        return this.mnm;
    }

    private String mom() {
        return this.n00;
    }

    private String mon() {
        return this.n0o;
    }

    private String moo() {
        return this.mnn;
    }

    private void n(String[] strArr) {
        this.o0n = strArr;
    }

    private String[] n0() {
        return this.mn;
    }

    private String[] n00() {
        return this.omo;
    }

    private String[] n0m() {
        return this.omn;
    }

    private String[] n0n() {
        return this.on0;
    }

    private String[] n0o() {
        return this.omm;
    }

    private String[] nm() {
        return this.no;
    }

    private String nm0() {
        return this.nmo;
    }

    private String nmm() {
        return this.nmn;
    }

    private String nmn() {
        return this.nn0;
    }

    private String nmo() {
        return this.nmm;
    }

    private String[] nn() {
        return this.nm;
    }

    private String nn0() {
        return this.nno;
    }

    private String nnm() {
        return this.nnn;
    }

    private String nnn() {
        return this.o000;
    }

    private String nno() {
        return this.nnm;
    }

    private String[] no() {
        return this.n0;
    }

    private String[] no0() {
        return this.ono;
    }

    private String nom() {
        return this.non;
    }

    private String non() {
        return this.nm0;
    }

    private String noo() {
        return this.nom;
    }

    public static final nnm o(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            nnm nnmVar = new nnm();
            nnmVar.o = jSONObject.optString("ks");
            nnmVar.m = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray(m5.f25674A));
            nnmVar.f42214n = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray(m5.f25678z));
            nnmVar.o0 = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("imp"));
            nnmVar.oo = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("click"));
            nnmVar.on = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("vstart"));
            nnmVar.m0 = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("v25"));
            nnmVar.mo = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("v50"));
            nnmVar.mm = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("v75"));
            nnmVar.mn = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("v100"));
            nnmVar.n0 = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("vpaused"));
            nnmVar.no = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("vclick"));
            nnmVar.nm = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("vmute"));
            nnmVar.nn = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("vunmute"));
            nnmVar.o00 = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("ec_show"));
            nnmVar.o0o = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("ec_close"));
            nnmVar.o0m = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("apk_dl_star"));
            nnmVar.o0n = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("apk_dl_end"));
            nnmVar.oo0 = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray(j.s0));
            nnmVar.ooo = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("vresumed"));
            nnmVar.oom = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("vskip"));
            nnmVar.oon = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("vfail"));
            nnmVar.om0 = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("apk_start_install"));
            nnmVar.omo = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("dp_start"));
            nnmVar.omm = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("dp_succ"));
            nnmVar.omn = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("app_install"));
            nnmVar.on0 = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("app_uninstall"));
            nnmVar.ono = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("app_unknow"));
            nnmVar.onn = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("dp_inst_fail"));
            nnmVar.onm = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("dp_uninst_fail"));
            nnmVar.m00 = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("vd_succ"));
            nnmVar.m0o = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("vrewarded"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("v_p_tracking");
            if (jSONArrayOptJSONArray != null) {
                nnmVar.m0m = new HashMap();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    int iOptInt = jSONObjectOptJSONObject.optInt("play_sec");
                    nnmVar.m0m.put(Integer.valueOf(iOptInt), com.thinkup.core.common.ooo.o00.o(jSONObjectOptJSONObject.optJSONArray("list")));
                }
            }
            nnmVar.m0n = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("load_success"));
            nnmVar.mo0 = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("load_fail"));
            nnmVar.moo = jSONObject.optString("tp_nurl");
            nnmVar.mom = jSONObject.optString("tp_imp");
            nnmVar.mon = jSONObject.optString("tp_click");
            nnmVar.mm0 = jSONObject.optString("tp_vstart");
            nnmVar.mmo = jSONObject.optString("tp_v25");
            nnmVar.mmm = jSONObject.optString("tp_v50");
            nnmVar.mmn = jSONObject.optString("tp_v75");
            nnmVar.mn0 = jSONObject.optString("tp_v100");
            nnmVar.mno = jSONObject.optString("tp_vpaused");
            nnmVar.mnm = jSONObject.optString("tp_vclick");
            nnmVar.mnn = jSONObject.optString("tp_vmute");
            nnmVar.n00 = jSONObject.optString("tp_vunmute");
            nnmVar.n0o = jSONObject.optString("tp_ec_show");
            nnmVar.n0m = jSONObject.optString("tp_ec_close");
            nnmVar.n0n = jSONObject.optString("tp_apk_dl_star");
            nnmVar.no0 = jSONObject.optString("tp_apk_dl_end");
            nnmVar.noo = jSONObject.optString("tp_apk_install");
            nnmVar.nom = jSONObject.optString("tp_vresumed");
            nnmVar.non = jSONObject.optString("tp_vskip");
            nnmVar.nm0 = jSONObject.optString("tp_vfail");
            nnmVar.nmo = jSONObject.optString("tp_apk_start_install");
            nnmVar.nmm = jSONObject.optString("tp_dp_start");
            nnmVar.nmn = jSONObject.optString("tp_dp_succ");
            nnmVar.nn0 = jSONObject.optString("tp_app_install");
            nnmVar.nno = jSONObject.optString("tp_app_uninstall");
            nnmVar.nnm = jSONObject.optString("tp_app_unknow");
            nnmVar.o000 = jSONObject.optString("tp_dp_inst_fail");
            nnmVar.nnn = jSONObject.optString("tp_dp_uninst_fail");
            nnmVar.o00o = jSONObject.optString("tp_vd_succ");
            nnmVar.o00m = jSONObject.optString("tp_vrewarded");
            nnmVar.o00n = jSONObject.optString("tp_load_success");
            nnmVar.o0o0 = jSONObject.optString("tp_load_fail");
            nnmVar.o0oo = com.thinkup.core.common.ooo.o00.o(jSONObject.optJSONArray("vready"));
            nnmVar.o0om = jSONObject.optString("tp_ready");
            return nnmVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private void o0(String[] strArr) {
        this.oo0 = strArr;
    }

    private String[] o00() {
        return this.nn;
    }

    private String o000() {
        return this.o00o;
    }

    private String o00m() {
        return this.o00n;
    }

    private String o00n() {
        return this.o0o0;
    }

    private String o00o() {
        return this.o00m;
    }

    private String[] o0m() {
        return this.o0o;
    }

    private String[] o0n() {
        return this.o0m;
    }

    private String[] o0o() {
        return this.o00;
    }

    private String[] o0o0() {
        return this.o0oo;
    }

    private String o0oo() {
        return this.o0om;
    }

    private String[] om() {
        return this.o0;
    }

    private String[] om0() {
        return this.m00;
    }

    private Map<Integer, String[]> omm() {
        return this.m0m;
    }

    private String omn() {
        return this.moo;
    }

    private String[] omo() {
        return this.m0o;
    }

    private String[] on() {
        String[] strArr = this.oo;
        String[] strArr2 = this.om;
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        if (strArr2 == null || strArr2.length == 0) {
            return strArr;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    private String on0() {
        return this.mom;
    }

    private String onm() {
        return this.mm0;
    }

    private String onn() {
        return this.mmo;
    }

    private String ono() {
        return this.mon;
    }

    private String[] oo() {
        return this.f42214n;
    }

    private String[] oo0() {
        return this.o0n;
    }

    private String[] oom() {
        return this.onm;
    }

    private String[] oon() {
        return this.onn;
    }

    private String[] ooo() {
        return this.oo0;
    }

    private String[] m() {
        return this.mo0;
    }

    private void m0(String[] strArr) {
        this.oo = strArr;
    }

    private void m00(String[] strArr) {
        this.m0o = strArr;
    }

    private void m0m(String[] strArr) {
        this.mo0 = strArr;
    }

    private void m0o(String[] strArr) {
        this.m0n = strArr;
    }

    private void mm(String[] strArr) {
        this.m0 = strArr;
    }

    private void mn(String[] strArr) {
        this.mo = strArr;
    }

    private void mo(String[] strArr) {
        this.on = strArr;
    }

    private String n() {
        return this.o;
    }

    private void n0(String[] strArr) {
        this.mm = strArr;
    }

    private void nm(String[] strArr) {
        this.n0 = strArr;
    }

    private void nn(String[] strArr) {
        this.no = strArr;
    }

    private void no(String[] strArr) {
        this.mn = strArr;
    }

    private String[] o0() {
        return this.m;
    }

    private void o00(String[] strArr) {
        this.nm = strArr;
    }

    private void o0m(String[] strArr) {
        this.o00 = strArr;
    }

    private void o0n(String[] strArr) {
        this.o0o = strArr;
    }

    private void o0o(String[] strArr) {
        this.nn = strArr;
    }

    private void om(String[] strArr) {
        this.f42214n = strArr;
    }

    private void om0(String[] strArr) {
        this.omo = strArr;
    }

    private void omm(String[] strArr) {
        this.omn = strArr;
    }

    private void omn(String[] strArr) {
        this.on0 = strArr;
    }

    private void omo(String[] strArr) {
        this.omm = strArr;
    }

    private void on0(String[] strArr) {
        this.ono = strArr;
    }

    private void onm(String[] strArr) {
        this.onn = strArr;
    }

    private void onn(String[] strArr) {
        this.m00 = strArr;
    }

    private void ono(String[] strArr) {
        this.onm = strArr;
    }

    private void oo(String[] strArr) {
        this.m = strArr;
    }

    private void oo0(String[] strArr) {
        this.ooo = strArr;
    }

    private void oom(String[] strArr) {
        this.oon = strArr;
    }

    private void oon(String[] strArr) {
        this.om0 = strArr;
    }

    private void ooo(String[] strArr) {
        this.oom = strArr;
    }

    private void on(String[] strArr) {
        this.o0 = strArr;
    }

    private void o(String[] strArr) {
        this.om = strArr;
    }

    private String[] o() {
        return this.m0n;
    }

    private void o(Map<Integer, String[]> map) {
        this.m0m = map;
    }

    private static String[] o(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        if (strArr2 == null || strArr2.length == 0) {
            return strArr;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }
}
