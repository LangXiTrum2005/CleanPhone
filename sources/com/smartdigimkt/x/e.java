package com.smartdigimkt.x;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e implements Serializable, com.smartdigimkt.w1.a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f39684F = "e";
    private static final long G = 1;
    public static final String H = "a";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f39685I = "pv_urls";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f39686J = "parent_session_id";
    public static final String K = "ad_type";
    public static final String L = "unit_size";
    public static final String M = "html_url";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f39687N = "only_impression_url";
    public static final String O = "ads";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f39688P = "template";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f39689Q = "frames";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f39690R = "end_screen_url";
    public static final String S = "jm_do";
    public static final String T = "rks";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f39691U = "vcn";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f39692V = "token_r";
    public static final String W = "encrypt_p";
    public static final String X = "irlfa";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f39693Y = "tk_tcp_port";
    public static final String Z = "csp";
    public static final String a0 = "do";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f39694b0 = "sh";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f39695c0 = "ia_icon";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f39696d0 = "ia_rst";
    public static final String e0 = "ia_url";
    public static final String f0 = "ia_ori";
    public static final String g0 = "ia_all_ext1";
    public static final String h0 = "ia_all_ext2";
    public static final String i0 = "cam_tpl_url";
    public static final String j0 = "cam_html";
    public static final String k0 = "cam_tpl_url";
    public static final String l0 = "cam_html";
    public static final String m0 = "nscpt";
    public static final String n0 = "mof_template_url";
    public static final String o0 = "mof_tplid";
    public static final String p0 = "req_ext_data";
    public static final String q0 = "replace_tmp";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f39697A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f39698B;
    private int D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f39699E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39702c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f39703e;
    private String f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f39704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39705i;
    private String j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f39706l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39707n;
    private String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f39708p;
    private String q;
    public ArrayList<d> r;
    private int s;
    private List<com.smartdigimkt.f1.m> t;
    private HashMap<String, String> v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private HashMap<String, String> f39710w;
    private String x;
    private String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f39711z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39700a = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private StringBuffer f39709u = new StringBuffer();
    private String C = "";

    public String A() {
        return this.f39706l;
    }

    public String B() {
        return this.f39711z;
    }

    public int C() {
        return this.s;
    }

    public int D() {
        int i2 = this.f39698B;
        if (i2 == 1) {
            return i2;
        }
        return 0;
    }

    public String E() {
        return this.o;
    }

    public int F() {
        int i2 = this.f39697A;
        if (i2 > 1) {
            return i2;
        }
        return 1;
    }

    public void a(HashMap<String, String> map) {
        this.f39710w = map;
    }

    public void b(int i2) {
        this.f39705i = i2;
    }

    public String c() {
        return this.f39702c;
    }

    public void d(String str) {
        this.f39701b = str;
    }

    public String e() {
        return this.f39701b;
    }

    public void f(String str) {
        this.d = str;
    }

    public String g() {
        return this.f39703e;
    }

    public String h() {
        return this.d;
    }

    public void i(String str) {
        this.C = str;
    }

    public String j() {
        return this.y;
    }

    public void k(String str) {
        this.j = str;
    }

    public void l(String str) {
        this.k = str;
    }

    public void m(String str) {
        this.f = str;
    }

    public void n(String str) {
        this.f39704h = str;
    }

    public void o(String str) {
        this.f39700a = str;
    }

    public String p() {
        return this.f;
    }

    public int q() {
        return this.f39705i;
    }

    public int r() {
        return this.g;
    }

    public String s() {
        return this.f39704h;
    }

    public int t() {
        return this.D;
    }

    public List<com.smartdigimkt.f1.m> u() {
        return this.t;
    }

    public String v() {
        return this.f39700a;
    }

    public String w() {
        return this.q;
    }

    public String x() {
        return this.m;
    }

    public String y() {
        try {
            if (!TextUtils.isEmpty(this.f39699E)) {
                return this.f39699E;
            }
            if (TextUtils.isEmpty(this.q)) {
                return "";
            }
            Uri uri = Uri.parse(this.q);
            if (uri != null) {
                this.f39699E = uri.getQueryParameter("k");
            }
            return this.f39699E;
        } catch (Exception unused) {
            return "";
        }
    }

    public HashMap<String, String> z() {
        return this.v;
    }

    public void a(List<com.smartdigimkt.f1.m> list) {
        this.t = list;
    }

    public void b(HashMap<String, String> map) {
        this.v = map;
    }

    public void c(String str) {
        this.f39702c = str;
    }

    public void d(int i2) {
        this.D = i2;
    }

    public void e(String str) {
        this.f39703e = str;
    }

    public void f(int i2) {
        this.f39698B = i2;
    }

    public void g(int i2) {
        this.f39697A = i2;
    }

    public void h(String str) {
        this.y = str;
    }

    public String i() {
        return this.x;
    }

    public void j(String str) {
        this.f39708p = str;
    }

    public String k() {
        return this.C;
    }

    public HashMap<String, String> l() {
        return this.f39710w;
    }

    public String m() {
        return this.f39708p;
    }

    public String n() {
        return this.j;
    }

    public String o() {
        return this.k;
    }

    public void p(String str) {
        this.q = str;
    }

    public void q(String str) {
        this.m = str;
    }

    public void r(String str) {
        this.f39706l = str;
    }

    public void s(String str) {
        this.f39711z = str;
    }

    public void t(String str) {
        this.o = str;
    }

    public void a(int i2) {
        this.f39707n = i2;
    }

    public String b() {
        StringBuffer stringBuffer = this.f39709u;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.f39709u.toString();
        }
        try {
            String strY = com.smartdigimkt.n8.c.y();
            String strQ = com.smartdigimkt.n8.c.q(com.smartdigimkt.m6.b.p().k());
            String strP = com.smartdigimkt.n8.c.p(com.smartdigimkt.m6.b.p().k());
            String strValueOf = String.valueOf(com.smartdigimkt.v0.n.h(com.smartdigimkt.m6.b.p().k()));
            String str = com.smartdigimkt.v0.n.g(com.smartdigimkt.m6.b.p().k()) + "x" + com.smartdigimkt.v0.n.f(com.smartdigimkt.m6.b.p().k());
            StringBuffer stringBuffer2 = this.f39709u;
            stringBuffer2.append(d());
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a("1"));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(Build.VERSION.RELEASE));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(com.smartdigimkt.f1.b.f34972a));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(com.smartdigimkt.n8.c.D()));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(str));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(Integer.valueOf(com.smartdigimkt.v0.n.p(com.smartdigimkt.u.a.f().d()))));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(com.smartdigimkt.n8.c.o(com.smartdigimkt.u.a.f().d())));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(strValueOf));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(strP));
            stringBuffer2.append(a(strQ));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a("at_device1"));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a("at_device2"));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(com.smartdigimkt.n8.c.a(com.smartdigimkt.m6.b.p().k())));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(strY));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(""));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(com.smartdigimkt.n8.c.I()));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(""));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append("");
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(""));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            stringBuffer2.append(a(com.smartdigimkt.m6.b.p().r() + "," + com.smartdigimkt.m6.b.p().h()));
            stringBuffer2.append(com.smartdigimkt.b0.a.U1);
            this.f39709u = stringBuffer2;
            com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
            if (cVarB != null) {
                return cVarB.fillCDataParam(this.f39709u.toString());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        String string = this.f39709u.toString();
        string.replaceAll("at_device1", "");
        string.replaceAll("at_device2", "");
        return string;
    }

    public void c(int i2) {
        this.g = i2;
    }

    public int d() {
        return this.f39707n;
    }

    public void e(int i2) {
        this.s = i2;
    }

    public ArrayList<d> f() {
        return this.r;
    }

    public void g(String str) {
        this.x = str;
    }

    public void a(ArrayList<d> arrayList) {
        this.r = arrayList;
    }

    private Object a(Object obj) {
        return obj == null ? "" : obj;
    }

    public static e a(JSONObject jSONObject) {
        return a(jSONObject, "");
    }

    public static e a(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        String str2 = "ads";
        String str3 = "template";
        String str4 = "parent_session_id";
        String str5 = "a";
        String str6 = "only_impression_url";
        String str7 = "html_url";
        if (jSONObject != null) {
            try {
                e eVar = new e();
                try {
                    String strOptString = jSONObject.optString("rks");
                    if (!TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject2 = new JSONObject(strOptString);
                        Iterator<String> itKeys = jSONObject2.keys();
                        HashMap<String, String> map = new HashMap<>();
                        while (itKeys != null && itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObject2.optString(next));
                        }
                        eVar.b(map);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        HashMap<String, String> map2 = new HashMap<>();
                        map2.put("encrypt_p", "");
                        map2.put("irlfa", "");
                        eVar.a(map2);
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("req_ext_data");
                    int iOptInt = jSONObject.optInt("nscpt", 1);
                    String strOptString2 = jSONObject.optString("mof_template_url", "");
                    int iOptInt2 = jSONObject.optInt("mof_tplid", 0);
                    String string = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : "";
                    new JSONArray();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pv_urls");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(jSONArrayOptJSONArray.length());
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            arrayList2.add(jSONArrayOptJSONArray.getString(i2));
                        }
                        arrayList = arrayList2;
                    }
                    com.smartdigimkt.w.a.a().a(jSONObject.optJSONObject("replace_tmp"), true);
                    eVar.r(jSONObject.optString("a"));
                    eVar.q(jSONObject.optString("parent_session_id"));
                    eVar.a(jSONObject.optInt("ad_type"));
                    eVar.t(jSONObject.optString("unit_size"));
                    eVar.j(jSONObject.optString("html_url"));
                    eVar.p(jSONObject.optString("only_impression_url"));
                    eVar.e(jSONObject.optInt("template"));
                    eVar.d(jSONObject.optInt("jm_do"));
                    eVar.m(jSONObject.optString("ia_icon"));
                    eVar.c(jSONObject.optInt("ia_rst"));
                    eVar.n(jSONObject.optString("ia_url"));
                    eVar.b(jSONObject.optInt("ia_ori"));
                    eVar.k(jSONObject.optString("ia_all_ext1"));
                    eVar.l(jSONObject.optString("ia_all_ext2"));
                    eVar.g(jSONObject.optInt("vcn"));
                    eVar.f(jSONObject.optInt("token_r"));
                    eVar.i(jSONObject.optString("encrypt_p"));
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ads");
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("frames");
                    String str8 = "parse campaign error ,campaign is null";
                    String str9 = "end_screen_url";
                    if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        int i3 = 0;
                        while (i3 < jSONArrayOptJSONArray3.length()) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray3.optJSONObject(i3);
                            int i4 = i3;
                            JSONArray jSONArray = jSONObjectOptJSONObject2.getJSONArray(str2);
                            String str10 = str2;
                            ArrayList arrayList4 = new ArrayList();
                            String str11 = str3;
                            JSONObject jSONObject3 = jSONObjectOptJSONObject2;
                            int i5 = 0;
                            while (i5 < jSONArray.length()) {
                                JSONObject jSONObjectOptJSONObject3 = jSONArray.optJSONObject(i5);
                                JSONArray jSONArray2 = jSONArrayOptJSONArray3;
                                String strOptString3 = jSONObject.optString(str6);
                                String str12 = str8;
                                String strOptString4 = jSONObject.optString(str7);
                                int i6 = i5;
                                String str13 = str9;
                                String strOptString5 = jSONObject.optString(str13);
                                JSONArray jSONArray3 = jSONArray;
                                String str14 = string;
                                String str15 = str6;
                                ArrayList arrayList5 = arrayList3;
                                int i7 = iOptInt;
                                JSONObject jSONObject4 = jSONObject3;
                                String str16 = str5;
                                String str17 = str7;
                                String str18 = strOptString2;
                                ArrayList arrayList6 = arrayList;
                                int i8 = i4;
                                String str19 = str4;
                                d dVarA = d.a(jSONObjectOptJSONObject3, strOptString3, strOptString4, strOptString5, false, eVar, str);
                                if (dVarA != null) {
                                    dVarA.X(eVar.s());
                                    dVarA.O(eVar.q());
                                    dVarA.P(eVar.r());
                                    dVarA.W(eVar.p());
                                    dVarA.p(jSONObject.optInt("ad_type"));
                                    dVarA.Q(jSONObject.optString("ia_ext1"));
                                    dVarA.R(jSONObject.optString("ia_ext2"));
                                    dVarA.s0(eVar.F());
                                    dVarA.o0(eVar.D());
                                    dVarA.K(eVar.k());
                                    dVarA.T(iOptInt2);
                                    dVarA.c0(str18);
                                    dVarA.U(i7);
                                    dVarA.b(arrayList6);
                                    dVarA.o0(str14);
                                    arrayList4.add(dVarA);
                                } else {
                                    eVar.o(str12);
                                }
                                string = str14;
                                str6 = str15;
                                str8 = str12;
                                strOptString2 = str18;
                                str7 = str17;
                                str4 = str19;
                                jSONArrayOptJSONArray3 = jSONArray2;
                                jSONArray = jSONArray3;
                                str9 = str13;
                                arrayList3 = arrayList5;
                                jSONObject3 = jSONObject4;
                                i4 = i8;
                                arrayList = arrayList6;
                                str5 = str16;
                                iOptInt = i7;
                                i5 = i6 + 1;
                            }
                            ArrayList arrayList7 = arrayList3;
                            int i9 = iOptInt;
                            String str20 = str5;
                            ArrayList arrayList8 = arrayList;
                            int i10 = i4;
                            String str21 = str4;
                            com.smartdigimkt.f1.m mVar = new com.smartdigimkt.f1.m();
                            mVar.a(jSONObject.optString(str21));
                            mVar.b(jSONObject.optString(str20));
                            mVar.a(arrayList4);
                            mVar.a(jSONObject3.optInt(str11));
                            arrayList7.add(mVar);
                            i3 = i10 + 1;
                            string = string;
                            str6 = str6;
                            iOptInt = i9;
                            arrayList = arrayList8;
                            strOptString2 = strOptString2;
                            str5 = str20;
                            str7 = str7;
                            str3 = str11;
                            str8 = str8;
                            str4 = str21;
                            arrayList3 = arrayList7;
                            str2 = str10;
                            jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                            str9 = str9;
                        }
                        eVar.a((List<com.smartdigimkt.f1.m>) arrayList3);
                    } else {
                        String str22 = string;
                        String str23 = "only_impression_url";
                        String str24 = "html_url";
                        String str25 = "end_screen_url";
                        ArrayList arrayList9 = arrayList;
                        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                            ArrayList<d> arrayList10 = new ArrayList<>();
                            int i11 = 0;
                            while (i11 < jSONArrayOptJSONArray2.length()) {
                                JSONArray jSONArray4 = jSONArrayOptJSONArray2;
                                String str26 = str23;
                                str23 = str26;
                                String str27 = str24;
                                String str28 = str25;
                                str24 = str27;
                                str25 = str28;
                                d dVarA2 = d.a(jSONArray4.optJSONObject(i11), jSONObject.optString(str26), jSONObject.optString(str27), jSONObject.optString(str28), false, eVar, str);
                                if (dVarA2 != null) {
                                    dVarA2.T(iOptInt2);
                                    dVarA2.c0(strOptString2);
                                    dVarA2.U(iOptInt);
                                    dVarA2.b(arrayList9);
                                    dVarA2.o0(str22);
                                    dVarA2.s0(eVar.F());
                                    dVarA2.o0(eVar.D());
                                    dVarA2.K(eVar.k());
                                    arrayList10.add(dVarA2);
                                } else {
                                    eVar.o("parse campaign error ,campaign is null");
                                }
                                i11++;
                                jSONArrayOptJSONArray2 = jSONArray4;
                            }
                            eVar.a(arrayList10);
                        }
                    }
                } catch (Exception unused) {
                }
                return eVar;
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public static e b(JSONObject jSONObject) {
        return b(jSONObject, "");
    }

    public static e b(JSONObject jSONObject, String str) {
        return a(jSONObject, str);
    }

    public static e b(String str) {
        try {
            return a(new JSONObject(str), "");
        } catch (Throwable unused) {
            return null;
        }
    }
}
