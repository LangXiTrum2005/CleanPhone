package com.thinkup.core.common.on;

import android.text.TextUtils;
import com.smartdigimkt.w7.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o0mo {
    public static final int n0m = 1;
    public static final int n0n = 2;
    public static final String n0o = "ofm_tid_key";
    public static final int nm0 = 7;
    public static final int nmm = 9;
    public static final int nmn = 10;
    public static final int nmo = 8;
    public static final int nn0 = 18;
    public static final int nnm = 25;
    public static final int nnn = 26;
    public static final int nno = 21;
    public static final int no0 = 3;
    public static final int nom = 5;
    public static final int non = 6;
    public static final int noo = 4;
    public static final int o000 = 27;
    public static final int o00m = 29;
    public static final int o00n = 30;
    public static final int o00o = 28;
    public static final int o0m0 = 0;
    public static final int o0mm = 2;
    public static final int o0mn = 8;
    public static final int o0mo = 1;
    public static final int o0n0 = 9;
    public static final int o0nm = 11;
    public static final int o0nn = 3;
    public static final int o0no = 10;
    public static final int o0o0 = 31;
    public static final int o0om = 33;
    public static final int o0on = 34;
    public static final int o0oo = 32;
    public static final int oo00 = 12;
    public static final int oo0m = 4;
    public static final int oo0n = 5;
    public static final int oo0o = 13;
    public static final String oom0 = "0";
    public static final String oomm = "2";
    public static final String oomn = "3";
    public static final String oomo = "1";
    public static final String oon0 = "4";
    public static final String oono = "50";
    public static final int ooo0 = 8;
    public static final int ooom = 6;
    public static final int ooon = 7;
    public static final int oooo = 5;
    private String m;
    private String m0;
    private String mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42234n;
    private String o;
    private JSONObject o0;
    private Object om;
    protected String om00;
    public String om0m;
    public int om0n;
    protected String om0o;
    protected int omm0;
    protected int ommo = -1;
    public int omo0;
    protected int omom;
    protected int omon;
    protected String omoo;
    private JSONObject on;
    private int oo;
    protected String oonm;
    protected String oonn;

    private int n() {
        return this.omom;
    }

    private String o0() {
        return this.om0m;
    }

    private int om() {
        return this.omo0;
    }

    private int oo() {
        return this.om0n;
    }

    public final void m(JSONObject jSONObject) {
        this.o0 = jSONObject;
    }

    public final void m00(String str) {
        this.o = str;
    }

    public final void m0m(String str) {
        this.omoo = str;
    }

    public final void m0n(String str) {
        this.om0o = str;
    }

    public final void m0o(String str) {
        this.m = str;
    }

    public JSONObject mmo(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", i2);
            jSONObject.put("pl_id", this.oonm);
            jSONObject.put("req_id", this.oonn);
            if (!TextUtils.isEmpty(this.om00)) {
                jSONObject.put("format", Integer.parseInt(this.om00));
            }
            jSONObject.put("ps_id", com.thinkup.core.common.n.o0n.m().o0m());
            String strOn = com.thinkup.core.common.n.o0n.m().on(this.oonm);
            if (!TextUtils.isEmpty(strOn)) {
                jSONObject.put("sessionid", strOn);
            }
            int i3 = this.ommo;
            if (i3 != -1) {
                jSONObject.put("traffic_group_id", i3);
            }
            if (this.omm0 == 1) {
                jSONObject.put("ofm_tid", this.omon);
                jSONObject.put("ofm_system", this.omom);
                jSONObject.put(com.thinkup.core.common.n0.oo.mm0, this.omm0);
            }
            jSONObject.put("asid", this.om0o);
            jSONObject.put(com.thinkup.core.oo.n0.o.mnm, this.o);
            jSONObject.put("cp_pl_id", this.m);
            JSONObject jSONObject2 = this.o0;
            if (jSONObject2 != null) {
                jSONObject.put("p_c", jSONObject2);
            }
            int i4 = this.oo;
            if (i4 > 0) {
                jSONObject.put("wf2_mode", i4);
            }
            JSONObject jSONObject3 = this.on;
            if (jSONObject3 != null) {
                jSONObject.put(a.p0, jSONObject3);
            }
            if (!TextUtils.isEmpty(this.m0)) {
                jSONObject.put("x_c", new JSONArray(this.m0));
            }
            if (!TextUtils.isEmpty(oonn())) {
                jSONObject.put("o_r", oonn());
                return jSONObject;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final void mo0(String str) {
        this.oonm = str;
    }

    public final void mom(String str) {
        this.om00 = str;
    }

    public final void mon(String str) {
        this.mo = str;
    }

    public final void moo(String str) {
        this.oonn = str;
    }

    public final void o(JSONObject jSONObject) {
        this.on = jSONObject;
    }

    public final void o00m(int i2) {
        this.f42234n = i2;
    }

    public final void o00n(int i2) {
        this.omm0 = i2;
    }

    public final void o00o(int i2) {
        this.oo = i2;
    }

    public final void o0o0(int i2) {
        this.omon = i2;
    }

    public final void o0oo(int i2) {
        this.ommo = i2;
    }

    public final void onn(String str) {
        this.m0 = str;
    }

    public final JSONObject oo00() {
        return this.on;
    }

    public final String oo0m() {
        return this.m0;
    }

    public final int oo0n() {
        return this.f42234n;
    }

    public final Object oo0o() {
        return this.om;
    }

    public final String oom0() {
        return this.omoo;
    }

    public final String oomm() {
        return this.om0o;
    }

    public final String oomn() {
        return this.oonm;
    }

    public final int oomo() {
        return this.ommo;
    }

    public final String oon0() {
        return this.oonn;
    }

    public final String oonm() {
        String str = this.om00;
        str.getClass();
        switch (str) {
            case "0":
                return "native";
            case "1":
                return "reward";
            case "2":
                return "banner";
            case "3":
                return com.smartdigimkt.m6.a.r.r;
            case "4":
                return "splash";
            case "50":
                return "media_video";
            default:
                return "none";
        }
    }

    public final String oonn() {
        return TextUtils.isEmpty(this.mo) ? this.oonn : this.mo;
    }

    public final String oono() {
        return this.om00;
    }

    public final String ooo0() {
        return this.o;
    }

    public final void ooom() {
        this.omom = 1;
    }

    public final int ooon() {
        return this.omon;
    }

    public final String oooo() {
        return this.m;
    }

    private int m() {
        return this.omm0;
    }

    public final void o(Object obj) {
        this.om = obj;
    }

    private void m(int i2) {
        this.omo0 = i2;
    }

    private JSONObject o() {
        return this.o0;
    }

    private void o(String str) {
        this.om0m = str;
    }

    private void o(int i2) {
        this.om0n = i2;
    }
}
