package com.smartdigimkt.x;

import android.net.Uri;
import android.text.TextUtils;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.y;
import com.smartdigimkt.v0.z;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class d extends j implements Serializable, com.smartdigimkt.w1.a {
    public static final String A3 = "tp_offer";
    public static final String A4 = "rating";
    public static final String A5 = "is_download_zip";
    public static final int A6 = 2;
    public static final String B3 = "fac";
    public static final String B4 = "number_rating";
    public static final String B5 = "ia_cache";
    public static final String B6 = "impression";
    public static final String C3 = "at_cd_rate";
    public static final String C4 = "ctatext";
    public static final String C5 = "imp_ua";
    public static final String C6 = "start";
    public static final String D3 = "imp_report_type";
    public static final String D4 = "c_ct";
    public static final String D5 = "c_ua";
    public static final String D6 = "first_quartile";
    public static final String E3 = "at_ac_b";
    public static final String E4 = "video_url";
    public static final int E5 = 1;
    public static final String E6 = "midpoint";
    public static final String F3 = "plct";
    public static final String F4 = "video_length";
    public static final int F5 = 1;
    public static final String F6 = "third_quartile";
    public static final String G3 = "plctb";
    public static final String G4 = "video_size";
    private static final long G5 = 1;
    public static final String G6 = "complete";
    public static final String H3 = "banner_url";
    public static final String H4 = "video_resolution";
    public static final String H5 = "iex";
    public static final String H6 = "mute";
    public static final String I3 = "banner_html";
    public static final String I4 = "watch_mile";
    public static final String I5 = "ts";
    public static final String I6 = "unmute";
    public static final String J3 = "creative_id";
    public static final String J4 = "endcard_click_result";
    public static final String J5 = "nv_t2";
    public static final String J6 = "click";
    public static final String K3 = "vid_crtv_id";
    public static final String K4 = "ctype";
    public static final String K5 = "impression_t2";
    public static final String K6 = "pause";
    public static final String L3 = "ec_crtv_id";
    public static final String L4 = "adv_imp";
    public static final String L5 = "gif_url";
    public static final String L6 = "resume";
    public static final String M3 = "local_rid";
    public static final String M4 = "t_imp";
    public static final String M5 = "dropout_track";
    public static final String M6 = "error";
    public static final String N3 = "ec_temp_id";
    public static final String N4 = "sec";
    public static final String N5 = "plycmpt_track";
    public static final String N6 = "endcard";
    public static final String O3 = "mraid";
    public static final String O4 = "url";
    public static final String O5 = "aks";
    public static final String O6 = "close";
    public static final String P3 = "mraid_src";
    public static final String P4 = "guidelines";
    public static final String P5 = "k";
    public static final String P6 = "video_click";
    public static final String Q3 = "timestamp";
    public static final String Q4 = "offer_type";
    public static final String Q5 = "q";
    public static final String Q6 = "endcard_show";
    public static final String R3 = "hb";
    public static final String R4 = "reward_amount";
    public static final String R5 = "r";
    public static final String R6 = "play_percentage";
    public static final String S3 = "maitve";
    public static final String S4 = "reward_name";
    public static final String S5 = "al";
    public static final String S6 = "ad_tracking";
    public static final String T3 = "maitve_src";
    public static final String T4 = "use_skip_time";
    public static final String T5 = "mp";
    public static final String T6 = "rv";
    public static final String U3 = "vcn";
    public static final String U4 = "prog_bar";
    public static final String U5 = "pv_urls";
    public static final int U6 = -1;
    public static final String V3 = "token_r";
    public static final String V4 = "md5_file";
    public static final int V5 = 3;
    public static final int V6 = 1;
    public static final String W3 = "encrypt_p";
    public static final String W4 = "c_toi";
    public static final int W5 = 4;
    public static final int W6 = 0;
    public static final String X3 = "view_com_time";
    public static final int X4 = 2;
    public static final int X5 = 1;
    public static final String Y3 = "adspace_t";
    public static final String Y4 = "5";
    public static final int Y5 = 2;
    public static final String Z3 = "cbd";
    public static final String Z4 = "rtins_type";
    public static final int Z5 = 3;
    public static final String a4 = "vst";
    public static final String a5 = "ad_url_list";
    public static final int a6 = 1;
    public static final int b4 = -2;
    public static final String b5 = "retarget_offer";
    public static final int b6 = 2;
    public static final int c4 = -2;
    public static final String c5 = "flb";
    public static final int c6 = 1;
    public static final int d4 = 1;
    public static final String d5 = "flb_skiptime";
    public static final int d6 = 2;
    public static final String e4 = "id";
    public static final String e5 = "vctn_t";
    public static final int e6 = 3;
    public static final String f4 = "unitId";
    public static final String f5 = "vck_t";
    public static final int f6 = 4;
    public static final String g4 = "title";
    public static final String g5 = "rs_ignc_r";
    public static final int g6 = 8;
    public static final String h4 = "desc";
    public static final String h5 = "privacy_url";
    public static final int h6 = 9;
    public static final String i4 = "package_name";
    public static final String i5 = "show_privacy_btn";
    public static final int i6 = 12;
    public static final String j4 = "icon_url";
    public static final String j5 = "aab";
    public static final int j6 = 0;
    public static final String k4 = "image_url";
    public static final int k5 = 1;
    public static final int k6 = 0;
    public static final String l4 = "image_size";
    public static final int l5 = 2;
    public static final String l6 = "video_end_type";
    public static final String m4 = "app_size";
    public static final String m5 = "rw_pl";
    public static final int m6 = 1;
    public static final String n4 = "impression_url";
    public static final String n5 = "jm_pd";
    public static final int n6 = 2;
    public static final String o4 = "click_url";
    public static final String o5 = "oc_type";
    public static final int o6 = 3;
    public static final String p4 = "wtick";
    public static final String p5 = "oc_time";
    public static final int p6 = 4;
    public static final String q4 = "deep_link";
    public static final String q5 = "t_list";
    public static final int q6 = 5;
    public static final String r4 = "user_activation";
    public static final String r5 = "adchoice";
    public static final int r6 = 100;
    public static final String s4 = "notice_url";
    public static final String s5 = "omid";
    public static final int s6 = 2;
    public static final String t4 = "template";
    public static final String t5 = "ia_icon";
    private static final int t6 = 100;
    public static final String u4 = "ad_source_id";
    public static final String u5 = "ia_rst";
    public static final String u6 = "ready_rate";
    public static final String v4 = "fca";
    public static final String v5 = "ia_url";
    public static final String v6 = "tmp_ids";
    public static final String w3 = "d";
    public static final String w4 = "fcb";
    public static final String w5 = "ia_ori";
    public static final String w6 = "ext_data";
    public static final String x3 = "ad_tpl_url";
    public static final String x4 = "click_mode";
    public static final String x5 = "ad_type";
    public static final String x6 = "endcard_url";
    public static final String y3 = "ad_html";
    public static final String y4 = "landing_type";
    public static final String y5 = "ia_ext1";
    public static final String y6 = "playable_ads_without_video";
    public static final String z3 = "cmpt=1";
    public static final String z4 = "link_type";
    public static final String z5 = "ia_ext2";
    public static final int z6 = 1;
    private List<String> B0;
    private String B1;
    private long C0;
    private int C2;
    private String E2;
    private String G2;
    private String H2;
    private int I0;
    private int I2;
    private String J2;
    private int L1;
    private int M1;
    private String M2;
    private int N1;
    private String O1;
    private p O2;
    private String P1;
    private String P2;
    private String Q1;
    private String Q2;
    private String R1;
    private int R2;
    private String S1;
    private long S2;
    private boolean T0;
    private int T1;
    private String T2;
    private boolean U1;
    private String U2;
    private int V2;
    private boolean W1;
    private String W2;
    private int X1;
    private int X2;
    private b Y2;
    private int Z1;
    private c Z2;
    private String a2;
    private com.smartdigimkt.p.b a3;
    private int b2;
    private int c2;
    private int d1;
    private String d2;
    private int d3;
    private int e1;
    private int e2;
    public r f1;
    private int f2;
    private ArrayList<Integer> f3;
    private int g1;
    private int g2;
    private int h1;
    private String h2;
    private int i1;
    private int i2;
    private int j1;
    private String j2;
    private com.smartdigimkt.x.a j3;
    private String k1;
    private String k2;
    private int l1;
    private int l2;
    private String m1;
    private String m2;
    private String m3;
    private int n1;
    private int n2;
    private int o1;
    private String o2;
    private String p1;
    private HashMap<String, String> p2;
    private String q1;
    private String q2;
    private int q3;
    private int r1;
    private String r2;
    private String s1;
    private String s2;
    private int s3;
    private a t1;
    private String t2;
    private int t3;
    private String u2;
    private int v1;
    private boolean v2;
    private String w1;
    private String x2;
    private boolean y2;
    private boolean z2;
    private int x0 = 1;
    private String y0 = "";
    private String z0 = "";
    private boolean A0 = false;
    private int D0 = 0;
    private int E0 = 0;
    private int F0 = 0;
    private int G0 = 0;
    private int H0 = 0;
    private int J0 = -2;
    private int K0 = -2;
    private long L0 = 0;
    private long M0 = 0;
    private String N0 = "";
    private String O0 = "";
    private long P0 = 0;
    private long Q0 = 0;
    private long R0 = 0;
    private long S0 = 0;
    private int U0 = 0;
    private int V0 = 0;
    private String W0 = "";
    private boolean X0 = false;
    private int Y0 = 0;
    private boolean Z0 = false;
    private String a1 = "";
    private int b1 = 0;
    private int c1 = -1;
    private int u1 = 0;
    private String x1 = "";
    private int y1 = 1;
    private int z1 = 1;
    private int A1 = 6;
    private int C1 = -1;
    private String D1 = "";
    private String E1 = "";
    private String F1 = "";
    private int G1 = 0;
    private String H1 = "";
    private boolean I1 = false;
    private String J1 = "";
    private String K1 = "";
    private boolean V1 = false;
    private String Y1 = "";
    private String w2 = "";
    private int A2 = 2;
    public String B2 = "";
    private int D2 = -1;
    private int F2 = 1;
    private int K2 = 0;
    private int L2 = 2;
    private int N2 = 1;
    private boolean b3 = false;
    private String c3 = null;
    private String e3 = "";
    private int g3 = 2;
    private int h3 = 1;
    private int i3 = -1;
    private boolean k3 = false;
    private boolean l3 = false;
    public boolean n3 = false;
    private int o3 = 0;
    public boolean p3 = false;
    private int r3 = 0;
    private int u3 = 9377;
    private int v3 = 1;

    public static final class a implements Serializable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f39659l = "ad_logo_link";
        public static final String m = "adchoice_link";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f39660n = "adchoice_icon";
        public static final String o = "adchoice_size";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f39661p = "platform_name";
        public static final String q = "platform_logo";
        public static final String r = "adv_name";
        public static final String s = "adv_logo";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f39662a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f39663b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f39664c = "";
        private String d = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f39665e = "";
        private String f = "";
        private String g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f39666h = "";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f39667i = 0;
        private int j = 0;
        private String k = "";

        public void a(int i2) {
            this.j = i2;
        }

        public void b(int i2) {
            this.f39667i = i2;
        }

        public String c() {
            return this.k;
        }

        public String d() {
            return this.f39664c;
        }

        public void e(String str) {
            this.f39662a = str;
        }

        public void f(String str) {
            this.k = str;
        }

        public int g() {
            return this.j;
        }

        public int h() {
            return this.f39667i;
        }

        public void i(String str) {
            this.d = str;
        }

        public String j() {
            return this.g;
        }

        public String k() {
            return this.f;
        }

        public String l() {
            return this.f39665e;
        }

        public void m(String str) {
            this.f39665e = str;
        }

        public static a a(JSONObject jSONObject) {
            a aVar = null;
            if (jSONObject != null) {
                try {
                    a aVar2 = new a();
                    try {
                        aVar2.g(jSONObject.optString("adchoice_icon"));
                        aVar2.h(jSONObject.optString("adchoice_link"));
                        String strOptString = jSONObject.optString("adchoice_size");
                        aVar2.i(strOptString);
                        aVar2.e(jSONObject.optString(f39659l));
                        aVar2.j(jSONObject.optString(s));
                        aVar2.k(jSONObject.optString(r));
                        aVar2.l(jSONObject.optString("platform_logo"));
                        aVar2.m(jSONObject.optString("platform_name"));
                        aVar2.a(b(strOptString));
                        aVar2.b(c(strOptString));
                        aVar2.f(jSONObject.toString());
                        return aVar2;
                    } catch (Exception e2) {
                        e = e2;
                        aVar = aVar2;
                        if (com.smartdigimkt.b.b.f33800a) {
                            e.printStackTrace();
                        }
                        return aVar;
                    } catch (Throwable th) {
                        th = th;
                        aVar = aVar2;
                        if (com.smartdigimkt.b.b.f33800a) {
                            th.printStackTrace();
                        }
                        return aVar;
                    }
                } catch (Exception e3) {
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return aVar;
        }

        public static int c(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (strArrSplit = str.split("x")) != null && strArrSplit.length > 0) {
                    return Integer.parseInt(strArrSplit[0]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }

        public static a d(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return a(new JSONObject(str));
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e2.printStackTrace();
                }
                return null;
            } catch (Throwable th) {
                if (com.smartdigimkt.b.b.f33800a) {
                    th.printStackTrace();
                }
                return null;
            }
        }

        public String b() {
            return this.f39662a;
        }

        public String e() {
            return this.f39663b;
        }

        public String f() {
            return this.d;
        }

        public void g(String str) {
            this.f39664c = str;
        }

        public void h(String str) {
            this.f39663b = str;
        }

        public String i() {
            return this.f39666h;
        }

        public void j(String str) {
            this.f39666h = str;
        }

        public void k(String str) {
            this.g = str;
        }

        public void l(String str) {
            this.f = str;
        }

        public boolean m() {
            return (TextUtils.isEmpty(this.f39663b) || TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.f39664c)) ? false : true;
        }

        public static int b(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (strArrSplit = str.split("x")) != null && strArrSplit.length > 1) {
                    return Integer.parseInt(strArrSplit[1]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f39668a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f39669b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f39670c = false;
        public boolean d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f39671e = false;
        public boolean f = false;
        public boolean g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f39672h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f39673i = false;
        public boolean j = false;
        public boolean k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Map<Integer, String> f39674l;
    }

    public static final class c implements Serializable {
        public static final String g = "video_template";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f39675h = "template_url";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f39676i = "orientation";
        public static final String j = "paused_url";
        public static final String k = "image";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f39677l = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f39678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f39679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f39680c;
        private String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f39681e;
        private List<a> f;

        public static final class a implements Serializable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f39682a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public List<String> f39683b = new ArrayList();
        }

        public c(String str) {
            this.f39678a = str;
        }

        public void b(int i2) {
            this.f39679b = i2;
        }

        public int c() {
            return this.f39680c;
        }

        public void d(String str) {
            this.f39678a = str;
        }

        public String e() {
            return this.f39678a;
        }

        public String f() {
            return this.f39681e;
        }

        public int g() {
            return this.f39679b;
        }

        public void a(int i2) {
            this.f39680c = i2;
        }

        public List<a> b() {
            return this.f;
        }

        public void c(String str) {
            this.d = str;
        }

        public String d() {
            return this.d;
        }

        public void e(String str) {
            this.f39681e = z.d(str);
        }

        public static c b(String str) {
            try {
                if (y.b(str)) {
                    return a(new JSONObject(str));
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public void a(List<a> list) {
            this.f = list;
        }

        public static c a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                if (!y.b(jSONObject.toString())) {
                    return null;
                }
                c cVar = new c(jSONObject.toString());
                cVar.b(jSONObject.optInt(g, 1));
                cVar.e(jSONObject.optString("template_url"));
                cVar.a(jSONObject.optInt("orientation"));
                cVar.c(jSONObject.optString(j));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(k);
                if (jSONObjectOptJSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys != null && itKeys.hasNext()) {
                        String next = itKeys.next();
                        List<String> listA = v.a(jSONObjectOptJSONObject.optJSONArray(next));
                        if (listA != null && listA.size() > 0) {
                            a aVar = new a();
                            aVar.f39682a = next;
                            aVar.f39683b.addAll(listA);
                            arrayList.add(aVar);
                        }
                    }
                    cVar.a(arrayList);
                }
                return cVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    private Map<Integer, String> v(String str) {
        HashMap map = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    HashMap map2 = new HashMap();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                            int iOptInt = jSONObjectOptJSONObject.optInt("sec");
                            map2.put(Integer.valueOf(iOptInt), jSONObjectOptJSONObject.optString("url"));
                        } catch (Exception e2) {
                            e = e2;
                            map = map2;
                            e.printStackTrace();
                            return map;
                        }
                    }
                    return map2;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return map;
    }

    public void A(int i2) {
        this.E0 = i2;
    }

    public int A0() {
        return this.E0;
    }

    public String A1() {
        return this.e3;
    }

    public long A2() {
        return this.C0;
    }

    public void B(String str) {
        this.t2 = str;
    }

    public int B0() {
        return this.M1;
    }

    public int B1() {
        return this.N2;
    }

    public String B2() {
        return !TextUtils.isEmpty(this.M2) ? android.support.v4.media.a.r(new StringBuilder(), this.M2, "&n_logo=0") : this.M2;
    }

    public void C(String str) {
        this.O0 = str;
    }

    public void C0(int i2) {
        this.z1 = i2;
    }

    public long C1() {
        return this.L0;
    }

    public boolean C2() {
        return (TextUtils.isEmpty(this.c3) || TextUtils.isEmpty(com.smartdigimkt.b.b.x)) ? false : true;
    }

    public void D(String str) {
        this.N0 = z.d(str);
    }

    public int D0() {
        return this.d1;
    }

    public long D1() {
        return this.M0;
    }

    public boolean D2() {
        return this.v2;
    }

    public void E(int i2) {
        this.e1 = i2;
    }

    public int E0() {
        return this.e1;
    }

    public int E1() {
        return this.H0;
    }

    public boolean E2() {
        return this.V1;
    }

    public void F(int i2) {
        this.R2 = i2;
    }

    public String F0() {
        return this.B1;
    }

    public String F1() {
        return this.a1;
    }

    public boolean F2() {
        return this.z2;
    }

    public void G(String str) {
        this.Q2 = str;
    }

    public String G0() {
        return this.h2;
    }

    public int G1() {
        return this.t3;
    }

    public boolean G2() {
        return this.Z0;
    }

    public void H(int i2) {
        this.y1 = i2;
    }

    public String H0() {
        if (TextUtils.isEmpty(r1())) {
            return "";
        }
        try {
            URL url = new URL(r1());
            return url.getProtocol() + "://" + url.getHost();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public List<String> H1() {
        return this.B0;
    }

    public boolean H2() {
        return this.X0;
    }

    public void I(int i2) {
        this.j1 = i2;
    }

    public String I0() {
        return this.j2;
    }

    public String I1() {
        return this.r2;
    }

    public boolean I2() {
        return this.T0;
    }

    public void J(int i2) {
        this.i1 = i2;
    }

    public String J0() {
        return this.p1;
    }

    public String J1() {
        return this.s2;
    }

    public boolean J2() {
        return this.b3;
    }

    public void K(String str) {
        this.W0 = str;
    }

    public String K0() {
        return this.q1;
    }

    public int K1() {
        return this.x0;
    }

    public boolean K2() {
        return this.y2;
    }

    public void L(int i2) {
        this.r1 = i2;
    }

    public int L0() {
        return this.R2;
    }

    public int L1() {
        return this.D2;
    }

    public boolean L2() {
        return this.A0;
    }

    public void M(String str) {
        this.E2 = str;
    }

    public String M0() {
        return this.K1;
    }

    public String M1() {
        return this.J2;
    }

    public boolean M2() {
        return this.U1;
    }

    public void N(int i2) {
        this.g1 = i2;
    }

    public int N0() {
        return this.r3;
    }

    public String N1() {
        try {
            if (!TextUtils.isEmpty(this.Q1)) {
                return this.Q1;
            }
            if (TextUtils.isEmpty(this.J1)) {
                return null;
            }
            Uri uri = Uri.parse(this.J1);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("k");
                this.Q1 = queryParameter;
                p0(queryParameter);
            }
            return this.Q1;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean N2() {
        return this.W1;
    }

    public void O(int i2) {
        this.n1 = i2;
    }

    public int O0() {
        return this.y1;
    }

    public String O1() {
        try {
            if (!TextUtils.isEmpty(this.S1)) {
                return this.S1;
            }
            if (TextUtils.isEmpty(this.E1)) {
                return "";
            }
            Uri uri = Uri.parse(this.E1);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("k");
                this.S1 = queryParameter;
                q0(queryParameter);
            }
            return this.S1;
        } catch (Exception unused) {
            return "";
        }
    }

    public boolean O2() {
        return this.v3 == 1;
    }

    public void P(int i2) {
        this.l1 = i2;
    }

    public String P0() {
        try {
            String strA = v.a(this.D1, "&tun=", com.smartdigimkt.v0.n.q() + "");
            this.D1 = strA;
            return strA;
        } catch (Exception e2) {
            e2.getMessage();
            return this.D1;
        }
    }

    public int P1() {
        return this.X2;
    }

    public boolean P2() {
        return super.a(this);
    }

    public String Q() {
        return this.z0;
    }

    public String Q0() {
        return this.s1;
    }

    public int Q1() {
        return this.l2;
    }

    public int R() {
        return this.I0;
    }

    public int R0() {
        return this.j1;
    }

    public String R1() {
        return this.m2;
    }

    public int S() {
        return this.o1;
    }

    public int S0() {
        return this.i1;
    }

    public int S1() {
        return this.n2;
    }

    public void T(String str) {
        this.D1 = str;
    }

    public int T0() {
        return this.h1;
    }

    public r T1() {
        return this.f1;
    }

    public String U() {
        return this.y0;
    }

    public int U0() {
        return this.r1;
    }

    public c U1() {
        return this.Z2;
    }

    public void V(int i2) {
        this.A1 = i2;
    }

    public int V0() {
        return this.i3;
    }

    public ArrayList<Integer> V1() {
        return this.f3;
    }

    public a W() {
        return this.t1;
    }

    public int W0() {
        return this.g1;
    }

    public String W1() {
        if (V1() == null || V1().size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Integer> it = V1().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
            return !TextUtils.isEmpty(sb) ? sb.toString() : "";
        } catch (Throwable th) {
            th.getMessage();
            return "";
        }
    }

    public void X(int i2) {
        this.u1 = i2;
    }

    public String X0() {
        return this.q2;
    }

    public int X1() {
        return this.g2;
    }

    public void Y(String str) {
        this.T2 = str;
    }

    public String Y0() {
        return this.k1;
    }

    public int Y1() {
        return this.F0;
    }

    public HashMap<String, String> Z() {
        return this.p2;
    }

    public int Z0() {
        return this.n1;
    }

    public int Z1() {
        return this.G0;
    }

    public void a(a aVar) {
        this.t1 = aVar;
    }

    public void a0(int i2) {
        this.H0 = i2;
    }

    public int a1() {
        return this.l1;
    }

    public int a2() {
        return this.c1;
    }

    public void b(List<String> list) {
        this.B0 = list;
    }

    public void b0(String str) {
        this.W2 = str;
    }

    public String b1() {
        return this.m1;
    }

    public int b2() {
        return this.e2;
    }

    public void c(long j) {
        this.P0 = j;
    }

    public String c0() {
        return this.O0;
    }

    public String c1() {
        return this.T2;
    }

    public String c2() {
        return this.w1;
    }

    public void d(boolean z2) {
        this.Z0 = z2;
    }

    public String d0() {
        return this.N0;
    }

    public String d1() {
        return this.P1;
    }

    public int d2() {
        return this.C1;
    }

    public void e(long j) {
        this.S0 = j;
    }

    public String e0() {
        return this.w2;
    }

    public int e1() {
        return this.f2;
    }

    public int e2() {
        return this.L1;
    }

    public void f(long j) {
        this.L0 = j;
    }

    public void f0(String str) {
        this.P2 = str;
    }

    public int f1() {
        return this.K2;
    }

    public int f2() {
        int i2 = this.V0;
        if (i2 == 1) {
            return i2;
        }
        return 0;
    }

    public void g(boolean z2) {
        this.X0 = z2;
    }

    public void g0(int i2) {
        this.n2 = i2;
    }

    public String g1() {
        return "";
    }

    public int g2() {
        return this.D0;
    }

    public void h(boolean z2) {
        this.T0 = z2;
    }

    public void h0(int i2) {
        this.g2 = i2;
    }

    public int h1() {
        return this.V2;
    }

    public int h2() {
        return this.u3;
    }

    public void i(long j) {
        this.Q0 = j;
    }

    public void i0(int i2) {
        this.F0 = i2;
    }

    public String i1() {
        return this.W2;
    }

    public long i2() {
        return this.S2;
    }

    public void j(boolean z2) {
        this.v2 = z2;
    }

    public void j0(int i2) {
        this.G0 = i2;
    }

    public b j1() {
        return this.Y2;
    }

    public int j2() {
        return this.s3;
    }

    public void k(boolean z2) {
        this.y2 = z2;
    }

    public void k0(int i2) {
        this.c1 = i2;
    }

    public String k1() {
        return this.G2;
    }

    public boolean k2() {
        return this.I1;
    }

    public void l(boolean z2) {
        this.A0 = z2;
    }

    public int l0() {
        return this.J0;
    }

    public int l1() {
        return this.I2;
    }

    public int l2() {
        int i2 = this.U0;
        if (i2 > 0) {
            return i2;
        }
        return 1;
    }

    public void m(boolean z2) {
        this.U1 = z2;
    }

    public void m0(String str) {
        this.r2 = str;
    }

    public String m1() {
        return this.x1;
    }

    public long m2() {
        return this.Q0;
    }

    public void n(boolean z2) {
        this.W1 = z2;
    }

    public void n0(String str) {
        this.s2 = str;
    }

    public String n1() {
        return this.u2;
    }

    public int n2() {
        return this.g3;
    }

    public void o(int i2) {
        this.I0 = i2;
    }

    public void o0(int i2) {
        this.V0 = i2;
    }

    public String o1() {
        return this.x2;
    }

    public int o2() {
        return this.b1;
    }

    public void p(int i2) {
        this.o1 = i2;
    }

    public void p0(int i2) {
        this.D0 = i2;
    }

    public p p1() {
        return this.O2;
    }

    public int p2() {
        return this.h3;
    }

    public void q(int i2) {
        this.q3 = i2;
    }

    public void q0(String str) {
        this.S1 = str;
    }

    public String q1() {
        return this.P2;
    }

    public String q2() {
        return this.B2;
    }

    public void r(int i2) {
        this.v3 = i2;
    }

    public long r0() {
        return this.P0;
    }

    public String r1() {
        try {
            String strA = v.a(this.E1, "&tun=", com.smartdigimkt.v0.n.q() + "");
            this.E1 = strA;
            return strA;
        } catch (Exception e2) {
            e2.getMessage();
            return this.E1;
        }
    }

    public int r2() {
        return this.o3;
    }

    public void s(int i2) {
        this.c2 = i2;
    }

    public void s0(int i2) {
        this.U0 = i2;
    }

    public int s1() {
        return this.F2;
    }

    public String s2() {
        return this.a2;
    }

    public void t(int i2) {
        this.X1 = i2;
    }

    public int t0() {
        return this.Y0;
    }

    public int t1() {
        return this.A1;
    }

    public int t2() {
        return this.Z1;
    }

    public void u(int i2) {
        this.J0 = i2;
    }

    public void u0(int i2) {
        this.b1 = i2;
    }

    public int u1() {
        return this.v1;
    }

    public String u2() {
        return this.Y1;
    }

    public long v0() {
        return this.S0;
    }

    public int v1() {
        return this.u1;
    }

    public int v2() {
        return this.A2;
    }

    public void w(int i2) {
        this.T1 = i2;
    }

    public String w0() {
        return this.W0;
    }

    public int w1() {
        return this.i2;
    }

    public int w2() {
        return this.K0;
    }

    public void x(String str) {
        this.z0 = str;
    }

    public void x0(String str) {
        c cVar;
        this.M2 = str;
        if (TextUtils.isEmpty(this.G2) && (((cVar = this.Z2) == null || TextUtils.isEmpty(cVar.f39681e)) && !TextUtils.isEmpty(str) && str.contains("cmpt=1"))) {
            F(str);
        }
        f(v.d(str));
        b(str, "endcard_url");
    }

    public String x1() {
        return this.c3;
    }

    public int x2() {
        return this.b2;
    }

    public void y(String str) {
        this.y0 = str;
        boolean zE = v.e(str);
        int iB = v.b(str);
        if (zE) {
            g(true);
            y(iB);
        }
    }

    public int y0() {
        return this.C2;
    }

    public String y1() {
        try {
            String strA = v.a(this.J1, "&tun=", com.smartdigimkt.v0.n.q() + "");
            this.J1 = strA;
            return strA;
        } catch (Exception e2) {
            e2.getMessage();
            return this.J1;
        }
    }

    public int y2() {
        return this.G1;
    }

    public void z(int i2) {
        this.C2 = i2;
    }

    public void z0(int i2) {
        this.K0 = i2;
    }

    public String z1() {
        return this.U2;
    }

    public int z2() {
        return this.z1;
    }

    private void b(String str, String str2) {
        try {
            int iB = v.b(str, "admf");
            if (iB == 0) {
                return;
            }
            JSONObject jSONObject = TextUtils.isEmpty(this.x1) ? new JSONObject() : new JSONObject(this.x1);
            int iB2 = v.b(str, "admftm");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("admf", iB);
            jSONObject2.put("admftm", iB2);
            jSONObject.put(str2, jSONObject2);
            this.x1 = jSONObject.toString();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static d c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        d dVar = new d();
        dVar.f(jSONObject.optString("campaignid"));
        dVar.h(jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME));
        dVar.d(jSONObject.optString("title"));
        dVar.b(jSONObject.optString("cta"));
        dVar.c(jSONObject.optString("desc"));
        dVar.T(jSONObject.optString("impression_url"));
        dVar.g(jSONObject.optString("image_url"));
        dVar.f(jSONObject.optLong("plct"));
        dVar.g(jSONObject.optLong("plctb"));
        dVar.x(jSONObject.optString("ad_html"));
        dVar.y(jSONObject.optString("ad_tpl_url"));
        dVar.D(jSONObject.optString("banner_url"));
        dVar.C(jSONObject.optString("banner_html"));
        dVar.c(jSONObject.optInt("creative_id"));
        dVar.i(jSONObject.optLong("vid_crtv_id"));
        dVar.d(jSONObject.optLong("ec_crtv_id"));
        dVar.e(jSONObject.optLong("ec_temp_id"));
        return dVar;
    }

    public static p t(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                p pVar = new p();
                pVar.k(b(jSONObject.optJSONArray("impression")));
                pVar.p(b(jSONObject.optJSONArray("start")));
                pVar.j(b(jSONObject.optJSONArray("first_quartile")));
                pVar.l(b(jSONObject.optJSONArray("midpoint")));
                pVar.q(b(jSONObject.optJSONArray("third_quartile")));
                pVar.f(b(jSONObject.optJSONArray("complete")));
                pVar.a(a(jSONObject.optJSONArray("play_percentage")));
                pVar.m(b(jSONObject.optJSONArray("mute")));
                pVar.r(b(jSONObject.optJSONArray("unmute")));
                pVar.d(b(jSONObject.optJSONArray("click")));
                pVar.n(b(jSONObject.optJSONArray("pause")));
                pVar.o(b(jSONObject.optJSONArray("resume")));
                pVar.i(b(jSONObject.optJSONArray("error")));
                pVar.g(b(jSONObject.optJSONArray("endcard")));
                pVar.e(b(jSONObject.optJSONArray("close")));
                pVar.h(b(jSONObject.optJSONArray("endcard_show")));
                pVar.s(b(jSONObject.optJSONArray("video_click")));
                pVar.c(b(jSONObject.optJSONArray("impression_t2")));
                pVar.a(b(jSONObject.optJSONArray("dropout_track")));
                pVar.b(b(jSONObject.optJSONArray("plycmpt_track")));
                return a(jSONObject, pVar);
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    private void u(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals(this.G2) || !this.X0) {
            boolean zE = v.e(str);
            int iB = v.b(str);
            if (zE) {
                g(true);
                y(iB);
            }
        }
    }

    public void A(String str) {
        this.d2 = str;
    }

    public void A0(int i2) {
        this.b2 = i2;
    }

    public void B(int i2) {
        this.M1 = i2;
    }

    public void B0(int i2) {
        this.G1 = i2;
    }

    public void C(int i2) {
        this.N1 = i2;
    }

    public int C0() {
        return this.N1;
    }

    public void D(int i2) {
        this.d1 = i2;
    }

    public void E(String str) {
        this.w2 = str;
    }

    public void F(String str) {
        this.H2 = str;
    }

    public void G(int i2) {
        this.r3 = i2;
        if (i2 == 1) {
            int i3 = this.o1;
            if (i3 == 296 || i3 == 42) {
                String strP0 = P0();
                String strY1 = y1();
                if (!TextUtils.isEmpty(strP0) && !strP0.contains("imp_report_type")) {
                    T(strP0 + "&imp_report_type=" + i2);
                }
                if (TextUtils.isEmpty(strY1) || strY1.contains("imp_report_type")) {
                    return;
                }
                i0(strY1 + "&imp_report_type=" + i2);
            }
        }
    }

    public void H(String str) {
        this.F1 = str;
    }

    public void I(String str) {
        this.O1 = str;
    }

    public void J(String str) {
        this.H1 = str;
    }

    public void K(int i2) {
        this.h1 = i2;
    }

    public void L(String str) {
        this.k2 = z.d(str);
    }

    public void M(int i2) {
        this.i3 = i2;
    }

    public void N(String str) {
        this.B1 = str;
    }

    public void O(String str) {
        this.h2 = str;
    }

    public void P(String str) {
        this.j2 = str;
    }

    public void Q(String str) {
        this.p1 = str;
    }

    public void R(String str) {
        this.q1 = str;
    }

    public void S(String str) {
        this.K1 = str;
    }

    public List<String> T() {
        Exception e2;
        ArrayList arrayList;
        String strV = V();
        try {
            if (TextUtils.isEmpty(strV)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(strV);
            arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    arrayList.add(jSONArray.optString(i2));
                } catch (Exception e3) {
                    e2 = e3;
                }
            }
            return arrayList;
        } catch (Exception e7) {
            e2 = e7;
            arrayList = null;
        }
        e2.printStackTrace();
        return arrayList;
    }

    public void U(String str) {
        this.s1 = str;
    }

    public void V(String str) {
        this.q2 = str;
    }

    public void W(int i2) {
        this.v1 = i2;
    }

    public void X(String str) {
        this.m1 = str;
    }

    public void Y(int i2) {
        this.i2 = i2;
    }

    public void Z(int i2) {
        this.N2 = i2;
    }

    public void a(r rVar) {
        this.f1 = rVar;
    }

    public String a0() {
        return this.t2;
    }

    public int b0() {
        return this.q3;
    }

    public void c0(String str) {
        this.G2 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        F(str);
        boolean zE = v.e(str);
        int iB = v.b(str);
        if (zE) {
            g(true);
            y(iB);
        }
        e(v.d(str));
    }

    public void d(long j) {
        this.R0 = j;
    }

    public void d0(String str) {
        this.u2 = str;
    }

    public void e(boolean z2) {
        this.k3 = z2;
    }

    public void e0(String str) {
        this.x2 = str;
    }

    public void f(boolean z2) {
        this.l3 = z2;
    }

    public void f0(int i2) {
        this.l2 = i2;
    }

    public void g(long j) {
        this.M0 = j;
    }

    public void g0(String str) {
        this.E1 = str;
    }

    public void h(long j) {
        this.S2 = j;
    }

    public int h0() {
        return this.X1;
    }

    public void i(boolean z2) {
        this.b3 = z2;
    }

    public String i0() {
        return this.Q2;
    }

    public void j(long j) {
        this.C0 = j;
    }

    public void j0(String str) {
        this.U2 = str;
    }

    public void k0(String str) {
        this.e3 = str;
    }

    public void l0(String str) {
        this.a1 = str;
    }

    public void m0(int i2) {
        this.C1 = i2;
    }

    public int n0() {
        return this.T1;
    }

    public void o(boolean z2) {
        this.I1 = z2;
    }

    public int o0() {
        return this.L2;
    }

    public void p0(String str) {
        this.Q1 = str;
    }

    public String q0() {
        return this.O1;
    }

    public void r0(String str) {
        this.m2 = str;
    }

    public String s0() {
        return this.H1;
    }

    public void t0(String str) {
        this.w1 = str;
    }

    public long u0() {
        return this.R0;
    }

    public void v0(String str) {
        this.a2 = str;
    }

    public void w(String str) {
        this.m3 = str;
    }

    public void w0(String str) {
        this.Y1 = str;
    }

    public void x(int i2) {
        this.L2 = i2;
    }

    public void y0(int i2) {
        this.A2 = i2;
    }

    public void z(String str) {
        this.o2 = str;
    }

    public String z0() {
        return this.E2;
    }

    @Override // com.smartdigimkt.x.j
    public com.smartdigimkt.p.b D() {
        return this.a3;
    }

    public com.smartdigimkt.x.a O() {
        return this.j3;
    }

    public String P() {
        return this.m3;
    }

    public void Q(int i2) {
        this.f2 = i2;
    }

    public void R(int i2) {
        this.K2 = i2;
    }

    public void S(int i2) {
        this.V2 = i2;
    }

    public void U(int i2) {
        this.F2 = i2;
    }

    public String V() {
        return this.o2;
    }

    public void W(String str) {
        this.k1 = str;
    }

    public String X() {
        return this.d2;
    }

    public Map<Integer, String> Y() {
        return v(this.d2);
    }

    public void Z(String str) {
        this.P1 = str;
    }

    public void a(HashMap<String, String> map) {
        this.p2 = map;
    }

    public void a0(String str) {
        this.R1 = str;
    }

    public void b0(int i2) {
        this.t3 = i2;
    }

    public void d0(int i2) {
        this.D2 = i2;
    }

    public void e0(int i2) {
        this.X2 = i2;
    }

    public int f0() {
        return this.c2;
    }

    public String g0() {
        return this.H2;
    }

    public void h0(String str) {
        this.c3 = str;
    }

    public void i0(String str) {
        this.J1 = str;
    }

    public boolean j0() {
        return this.k3;
    }

    public boolean k0() {
        return this.l3;
    }

    public void l0(int i2) {
        this.e2 = i2;
    }

    public int m0() {
        return this.d3;
    }

    public void n0(int i2) {
        this.L1 = i2;
    }

    public void o0(String str) {
        this.J2 = str;
    }

    public String p0() {
        return this.F1;
    }

    public void q0(int i2) {
        this.u3 = i2;
    }

    public void r0(int i2) {
        this.s3 = i2;
    }

    public void s0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (String str2 : strArrSplit) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            }
            a(arrayList);
        }
    }

    public void t0(int i2) {
        if (i2 <= 2 && i2 >= 1) {
            this.g3 = i2;
        } else {
            this.g3 = 2;
        }
    }

    public void u0(String str) {
        this.B2 = str;
    }

    public void v0(int i2) {
        if (i2 <= 2 && i2 >= 1) {
            this.h3 = i2;
        } else {
            this.h3 = 1;
        }
    }

    public void w0(int i2) {
        this.o3 = i2;
    }

    public void a(p pVar) {
        this.O2 = pVar;
    }

    public void a(b bVar) {
        this.Y2 = bVar;
    }

    public void a(c cVar) {
        this.Z2 = cVar;
        if (cVar == null || TextUtils.isEmpty(cVar.f())) {
            return;
        }
        if (TextUtils.isEmpty(this.G2) && cVar.f().contains("cmpt=1")) {
            F(cVar.f());
        }
        boolean zE = v.e(cVar.f());
        int iB = v.b(cVar.f());
        if (zE) {
            g(true);
            y(iB);
        }
        b(cVar.f(), "template_url");
    }

    public String x0() {
        return this.k2;
    }

    public void y(int i2) {
        this.Y0 = v.a(i2);
    }

    public void x0(int i2) {
        this.Z1 = i2;
    }

    public void T(int i2) {
        this.I2 = i2;
    }

    public void c0(int i2) {
        this.x0 = i2;
    }

    public void v(int i2) {
        this.d3 = i2;
    }

    @Override // com.smartdigimkt.f1.k
    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.f2 != 2) {
                str = "Learn more";
            } else {
                str = "Install";
            }
        }
        super.b(str);
    }

    @Override // com.smartdigimkt.x.j
    public void a(com.smartdigimkt.p.b bVar) {
        this.a3 = bVar;
    }

    private static boolean a(d dVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (com.smartdigimkt.u.a.f().i() == 2 && "1".equals(Uri.parse(str).getQueryParameter("dpwgl"))) {
            return true;
        }
        dVar.x0(str);
        return false;
    }

    public void b(boolean z2) {
        this.V1 = z2;
    }

    public static d b(JSONObject jSONObject) {
        d dVar;
        ArrayList arrayList;
        d dVarC = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            dVar = new d();
            try {
                dVar.f(jSONObject.optString("id"));
                dVar.d(jSONObject.optString("title"));
                dVar.c(jSONObject.optString("desc"));
                dVar.h(jSONObject.optString("package_name"));
                dVar.h0(jSONObject.optInt("rtins_type"));
                dVar.e(jSONObject.optString("icon_url"));
                dVar.g(jSONObject.optString("image_url"));
                dVar.i(jSONObject.optString("app_size"));
                dVar.S(jSONObject.optString("image_size"));
                dVar.T(jSONObject.optString("impression_url"));
                dVar.H(jSONObject.optString("click_url"));
                dVar.a(r.b(jSONObject.optString("rw_pl")));
                dVar.B0(jSONObject.optInt("wtick"));
                dVar.J(jSONObject.optString("deep_link"));
                dVar.o(jSONObject.optBoolean("user_activation", false));
                dVar.g0(jSONObject.optString("notice_url"));
                dVar.n0(jSONObject.optInt("template"));
                dVar.d(jSONObject.optInt("ad_source_id", 1));
                dVar.B(jSONObject.optInt("fca"));
                dVar.C(jSONObject.optInt("fcb"));
                dVar.z(jSONObject.optInt("endcard_click_result"));
                if (!TextUtils.isEmpty(jSONObject.optString("rating"))) {
                    dVar.a(Double.parseDouble(jSONObject.optString("rating", "0")));
                }
                if (!TextUtils.isEmpty(jSONObject.optString("number_rating"))) {
                    dVar.c(jSONObject.optInt("number_rating", 333333));
                }
                dVar.I(jSONObject.optString("click_mode"));
                dVar.Z(jSONObject.optString("landing_type"));
                dVar.Q(jSONObject.optInt("link_type", 4));
                dVar.w(jSONObject.optInt("c_ct"));
                dVar.b(jSONObject.optString("ctatext"));
                dVar.z(jSONObject.optString("ad_url_list"));
                dVar.e0(jSONObject.optInt("retarget_offer", 2));
                dVar.w0(jSONObject.optString("video_url"));
                dVar.e(jSONObject.optInt("video_length"));
                dVar.x0(jSONObject.optInt("video_size"));
                dVar.v0(jSONObject.optString("video_resolution"));
                dVar.A0(jSONObject.optInt("watch_mile"));
                dVar.a(System.currentTimeMillis());
                dVar.s(jSONObject.optInt("ctype"));
                dVar.A(jSONObject.optString("adv_imp"));
                dVar.l0(jSONObject.optInt("t_imp"));
                dVar.P(jSONObject.optString("html_url"));
                dVar.L(jSONObject.optString("end_screen_url"));
                dVar.O(jSONObject.optString("guidelines"));
                dVar.Y(jSONObject.optInt("offer_type"));
                dVar.r0(jSONObject.optString("reward_name"));
                dVar.f0(jSONObject.optInt("reward_amount"));
                dVar.r0(jSONObject.optInt("use_skip_time", 0));
                dVar.b0(jSONObject.optInt("prog_bar", 0));
                try {
                    String strOptString = jSONObject.optString("ad_tracking");
                    if (!TextUtils.isEmpty(strOptString)) {
                        dVar.f0(strOptString);
                        dVar.a(t(strOptString));
                    }
                } catch (Exception unused) {
                }
                try {
                    dVar.d0(jSONObject.optInt("ready_rate", -1));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ext_data");
                    if (jSONObjectOptJSONObject != null) {
                        dVar.M(jSONObjectOptJSONObject.toString());
                    }
                    dVar.T(jSONObject.optInt("mof_tplid"));
                    dVar.c0(jSONObject.optString("mof_template_url"));
                    dVar.U(jSONObject.optInt("nscpt"));
                    new JSONArray();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pv_urls");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            arrayList.add(jSONArrayOptJSONArray.optString(i2));
                        }
                    }
                    dVar.b(arrayList);
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("req_ext_data");
                    if (jSONObjectOptJSONObject2 != null) {
                        dVar.o0(jSONObjectOptJSONObject2.toString());
                    }
                } catch (Exception unused2) {
                }
                dVar.y0(jSONObject.optInt("video_end_type", 2));
                if (a(dVar, jSONObject.optString("endcard_url"))) {
                    return null;
                }
                dVar.Z(jSONObject.optInt("playable_ads_without_video", 1));
                dVar.u0("");
                if (jSONObject.has("nv_t2")) {
                    dVar.V(jSONObject.optInt("nv_t2"));
                }
                if (jSONObject.has("gif_url")) {
                    dVar.N(jSONObject.optString("gif_url"));
                }
                dVar.a(c.a(jSONObject.optJSONObject("rv")));
                dVar.x(jSONObject.optInt("c_toi", 2));
                dVar.H(jSONObject.optInt("imp_ua", 1));
                dVar.C0(jSONObject.optInt("c_ua", 1));
                dVar.N(jSONObject.optInt("jm_pd"));
                dVar.W(jSONObject.optString("ia_icon"));
                dVar.P(jSONObject.optInt("ia_rst"));
                dVar.X(jSONObject.optString("ia_url"));
                dVar.O(jSONObject.optInt("ia_ori"));
                dVar.p(jSONObject.optInt("ad_type"));
                dVar.p0(jSONObject.optInt("tp_offer"));
                dVar.A(jSONObject.optInt("fac"));
                dVar.Q(jSONObject.optString("ia_ext1"));
                dVar.R(jSONObject.optString("ia_ext2"));
                dVar.L(jSONObject.optInt("is_download_zip"));
                dVar.U(jSONObject.optString("ia_cache"));
                dVar.W(jSONObject.optInt("oc_time"));
                dVar.X(jSONObject.optInt("oc_type"));
                dVar.t0(jSONObject.optString("t_list"));
                dVar.a(a.d(jSONObject.optString("adchoice", "")));
                dVar.f(jSONObject.optLong("plct"));
                dVar.g(jSONObject.optLong("plctb"));
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("omid");
                if (jSONArrayOptJSONArray2 == null) {
                    if (!TextUtils.isEmpty(jSONObject.optString("omid"))) {
                        dVar.h0(jSONObject.optString("omid"));
                    } else {
                        dVar.h0((String) null);
                    }
                } else {
                    dVar.h0(jSONArrayOptJSONArray2.toString());
                }
                dVar.c(jSONObject.optInt("creative_id"));
                dVar.i(jSONObject.optLong("vid_crtv_id"));
                dVar.d(jSONObject.optLong("ec_crtv_id"));
                dVar.e(jSONObject.optLong("ec_temp_id"));
                dVar.a0(jSONObject.optString("local_rid", ""));
                String strOptString2 = jSONObject.optString("cam_tpl_url");
                Uri uri = Uri.parse(strOptString2);
                if (!TextUtils.isEmpty(uri.getPath()) && (uri.getPath().endsWith(".zip") || uri.getPath().endsWith(".ZIP"))) {
                    dVar.y(strOptString2);
                } else {
                    dVar.D(strOptString2);
                }
                dVar.C(jSONObject.optString("cam_html"));
                dVar.x(jSONObject.optString("cam_html"));
                dVar.G(jSONObject.optString("unitId"));
                String strOptString3 = jSONObject.optString("mraid");
                if (TextUtils.isEmpty(strOptString3)) {
                    strOptString3 = jSONObject.optString("mraid_src");
                }
                if (!TextUtils.isEmpty(strOptString3)) {
                    dVar.k(true);
                    dVar.e0(strOptString3);
                } else if (!TextUtils.isEmpty(dVar.Q()) && !dVar.Q().contains("<MBTPLMARK>")) {
                    dVar.k(true);
                } else {
                    dVar.k(false);
                }
                try {
                    String strOptString4 = jSONObject.optString("only_impression_url");
                    if (!TextUtils.isEmpty(strOptString4)) {
                        dVar.i0(strOptString4);
                        Uri uri2 = Uri.parse(strOptString4);
                        if (uri2 != null) {
                            dVar.p0(uri2.getQueryParameter("k"));
                        }
                    }
                    String strOptString5 = jSONObject.optString("notice_url");
                    if (!TextUtils.isEmpty(strOptString5)) {
                        dVar.g0(strOptString5);
                        Uri uri3 = Uri.parse(strOptString5);
                        if (uri3 != null) {
                            dVar.q0(uri3.getQueryParameter("k"));
                        }
                    }
                } catch (Exception unused3) {
                }
                dVar.j(jSONObject.optBoolean("hb", false));
                dVar.S(jSONObject.optInt("maitve"));
                dVar.b0(jSONObject.optString("maitve_src"));
                dVar.D(jSONObject.optInt("flb"));
                dVar.E(jSONObject.optInt("flb_skiptime"));
                dVar.u(jSONObject.optInt("cbd", -2));
                dVar.z0(jSONObject.optInt("vst", -2));
                dVar.o(jSONObject.optInt("adspace_t", 1));
                dVarC = j.c(jSONObject, dVar);
                dVarC.s0(jSONObject.optInt("vcn"));
                dVarC.o0(jSONObject.optInt("token_r"));
                dVarC.K(jSONObject.optString("encrypt_p"));
                dVarC.u0(jSONObject.optInt("view_com_time"));
                dVarC.t0(jSONObject.optInt("vck_t", 2));
                dVarC.v0(jSONObject.optInt("vctn_t", 1));
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("rs_ignc_r");
                if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                    ArrayList<Integer> arrayList2 = new ArrayList<>();
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                        arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray3.optInt(i3)));
                    }
                    if (arrayList2.size() > 0) {
                        dVarC.a(arrayList2);
                    }
                }
                if (jSONObject.has("aab")) {
                    dVarC.a(com.smartdigimkt.x.a.b(jSONObject.getString("aab")));
                }
                try {
                    dVarC.l0(jSONObject.optString("privacy_url", ""));
                    dVarC.a0(jSONObject.optInt("show_privacy_btn", 0));
                } catch (Exception e2) {
                    e2.getMessage();
                }
                dVarC.q(jSONObject.optInt(C3, 0));
                dVarC.G(jSONObject.optInt("imp_report_type", 0));
                dVarC.q0(jSONObject.optInt("tk_tcp_port", 9377));
                dVarC.r(jSONObject.optInt(E3, 1));
                return dVarC;
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                return dVar;
            }
        } catch (Exception e7) {
            e = e7;
            dVar = dVarC;
        }
    }

    public void c(boolean z2) {
        this.z2 = z2;
    }

    private static JSONObject a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        try {
            if (jSONObject.has("tmp_ids") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("tmp_ids")) != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject.remove("tmp_ids");
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectA = com.smartdigimkt.w.a.a().a(jSONArrayOptJSONArray.getString(i2));
                    if (jSONObjectA != null) {
                        Iterator<String> itKeys = jSONObjectA.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            jSONObject.put(next, jSONObjectA.opt(next));
                        }
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static d a(JSONObject jSONObject, String str, String str2, String str3, boolean z2, e eVar) {
        return a(jSONObject, str, str2, str3, z2, eVar, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.smartdigimkt.x.d] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.smartdigimkt.f1.k, com.smartdigimkt.x.d] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    public static d a(JSONObject jSONObject, String str, String str2, String str3, boolean z2, e eVar, String str4) {
        d dVar;
        ?? r11;
        d dVar2;
        ?? arrayList;
        JSONObject jSONObjectA = a(jSONObject);
        if (jSONObjectA == null) {
            return null;
        }
        try {
            ?? dVar3 = new d();
            try {
                String strOptString = jSONObjectA.optString("aks");
                if (TextUtils.isEmpty(strOptString)) {
                    dVar2 = null;
                } else {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    Iterator<String> itKeys = jSONObject2.keys();
                    HashMap map = new HashMap();
                    while (itKeys != null && itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject2.optString(next));
                    }
                    dVar2 = null;
                    dVar3.a(map);
                }
                if (!TextUtils.isEmpty(str4)) {
                    dVar3.E(str4);
                    dVar3.j(true);
                }
                try {
                    dVar3.d0(jSONObjectA.optInt("ready_rate", -1));
                    JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("ext_data");
                    if (jSONObjectOptJSONObject != null) {
                        dVar3.M(jSONObjectOptJSONObject.toString());
                    }
                    dVar3.T(jSONObjectA.optInt("mof_tplid"));
                    dVar3.c0(jSONObjectA.optString("mof_template_url"));
                    dVar3.U(jSONObjectA.optInt("nscpt"));
                    new JSONArray();
                    JSONArray jSONArrayOptJSONArray = jSONObjectA.optJSONArray("pv_urls");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        arrayList = dVar2;
                    } else {
                        arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            arrayList.add(jSONArrayOptJSONArray.optString(i2));
                        }
                    }
                    dVar3.b(arrayList);
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectA.optJSONObject("req_ext_data");
                    if (jSONObjectOptJSONObject2 != null) {
                        dVar3.o0(jSONObjectOptJSONObject2.toString());
                    }
                } catch (Exception unused) {
                }
                dVar3.f(jSONObjectA.optString("id"));
                dVar3.d(jSONObjectA.optString("title"));
                dVar3.G(jSONObjectA.optString("unitId", ""));
                dVar3.c(jSONObjectA.optString("desc"));
                dVar3.h(jSONObjectA.optString("package_name"));
                dVar3.h0(jSONObjectA.optInt("rtins_type"));
                dVar3.e(jSONObjectA.optString("icon_url"));
                dVar3.g(jSONObjectA.optString("image_url"));
                dVar3.i(jSONObjectA.optString("app_size"));
                dVar3.S(jSONObjectA.optString("image_size"));
                dVar3.T(j.a(eVar, dVar3, jSONObjectA.optString("impression_url")));
                dVar3.H(j.a(eVar, dVar3, jSONObjectA.optString("click_url")));
                dVar3.a(r.b(jSONObjectA.optString("rw_pl")));
                dVar3.B0(jSONObjectA.optInt("wtick"));
                dVar3.J(j.a(eVar, dVar3, jSONObjectA.optString("deep_link")));
                dVar3.o(jSONObjectA.optBoolean("user_activation", false));
                dVar3.g0(j.a(eVar, dVar3, jSONObjectA.optString("notice_url")));
                dVar3.n0(jSONObjectA.optInt("template"));
                dVar3.d(jSONObjectA.optInt("ad_source_id", 1));
                dVar3.B(jSONObjectA.optInt("fca"));
                dVar3.C(jSONObjectA.optInt("fcb"));
                dVar3.z(jSONObjectA.optInt("endcard_click_result"));
                if (!TextUtils.isEmpty(jSONObjectA.optString("rating"))) {
                    dVar3.a(Double.parseDouble(jSONObjectA.optString("rating", "0")));
                }
                if (!TextUtils.isEmpty(jSONObjectA.optString("number_rating"))) {
                    dVar3.c(jSONObjectA.optInt("number_rating", 333333));
                }
                dVar3.I(jSONObjectA.optString("click_mode"));
                dVar3.Z(jSONObjectA.optString("landing_type"));
                dVar3.Q(jSONObjectA.optInt("link_type", 4));
                dVar3.w(jSONObjectA.optInt("c_ct"));
                dVar3.b(jSONObjectA.optString("ctatext"));
                dVar3.z(jSONObjectA.optString("ad_url_list"));
                dVar3.e0(jSONObjectA.optInt("retarget_offer", 2));
                dVar3.r0(jSONObjectA.optInt("use_skip_time", 0));
                dVar3.b0(jSONObjectA.optInt("prog_bar", 0));
                String strOptString2 = jSONObjectA.optString("video_url");
                if (!TextUtils.isEmpty(strOptString2)) {
                    if (z2) {
                        dVar3.w0(strOptString2);
                    } else {
                        dVar3.w0(com.smartdigimkt.r4.a.b(strOptString2));
                    }
                }
                dVar3.u0(jSONObjectA.optInt("view_com_time"));
                dVar3.e(jSONObjectA.optInt("video_length"));
                dVar3.x0(jSONObjectA.optInt("video_size"));
                dVar3.v0(jSONObjectA.optString("video_resolution"));
                dVar3.A0(jSONObjectA.optInt("watch_mile"));
                dVar3.a(System.currentTimeMillis());
                dVar3.i0(j.a(eVar, dVar3, str));
                dVar3.s(jSONObjectA.optInt("ctype"));
                dVar3.A(jSONObjectA.optString("adv_imp"));
                dVar3.l0(jSONObjectA.optInt("t_imp"));
                dVar3.P(str2);
                dVar3.L(str3);
                dVar3.O(jSONObjectA.optString("guidelines"));
                dVar3.Y(jSONObjectA.optInt("offer_type"));
                dVar3.r0(jSONObjectA.optString("reward_name"));
                dVar3.f0(jSONObjectA.optInt("reward_amount"));
                try {
                    String strA = j.a(eVar, dVar3, jSONObjectA.optString("ad_tracking"));
                    if (!TextUtils.isEmpty(strA)) {
                        dVar3.f0(strA);
                        dVar3.a(t(strA));
                    }
                } catch (Exception unused2) {
                }
                dVar3.y0(jSONObjectA.optInt("video_end_type", 2));
                if (a((d) dVar3, jSONObjectA.optString("endcard_url"))) {
                    return dVar2;
                }
                dVar3.Z(jSONObjectA.optInt("playable_ads_without_video", 1));
                dVar3.u0("");
                if (jSONObjectA.has("nv_t2")) {
                    dVar3.V(jSONObjectA.optInt("nv_t2"));
                }
                if (jSONObjectA.has("gif_url")) {
                    dVar3.N(jSONObjectA.optString("gif_url"));
                }
                dVar3.a(c.a(jSONObjectA.optJSONObject("rv")));
                dVar3.x(jSONObjectA.optInt("c_toi", 2));
                dVar3.H(jSONObjectA.optInt("imp_ua", 1));
                dVar3.C0(jSONObjectA.optInt("c_ua", 1));
                dVar3.N(jSONObjectA.optInt("jm_pd"));
                dVar3.W(jSONObjectA.optString("ia_icon"));
                dVar3.P(jSONObjectA.optInt("ia_rst"));
                dVar3.X(jSONObjectA.optString("ia_url"));
                dVar3.O(jSONObjectA.optInt("ia_ori"));
                dVar3.p(eVar.d());
                dVar3.p0(jSONObjectA.optInt("tp_offer"));
                dVar3.A(jSONObjectA.optInt("fac"));
                dVar3.Q(jSONObjectA.optString("ia_ext1"));
                dVar3.R(jSONObjectA.optString("ia_ext2"));
                dVar3.L(jSONObjectA.optInt("is_download_zip"));
                dVar3.U(jSONObjectA.optString("ia_cache"));
                dVar3.W(jSONObjectA.optInt("oc_time"));
                dVar3.X(jSONObjectA.optInt("oc_type"));
                dVar3.t0(jSONObjectA.optString("t_list"));
                dVar3.a(a.d(jSONObjectA.optString("adchoice", "")));
                dVar3.f(jSONObjectA.optLong("plct"));
                dVar3.g(jSONObjectA.optLong("plctb"));
                dVar3.c(jSONObjectA.optLong("creative_id"));
                dVar3.i(jSONObjectA.optLong("vid_crtv_id"));
                dVar3.d(jSONObjectA.optLong("ec_crtv_id"));
                dVar3.e(jSONObjectA.optLong("ec_temp_id"));
                String strOptString3 = jSONObjectA.optString("cam_tpl_url");
                Uri uri = Uri.parse(strOptString3);
                if (!TextUtils.isEmpty(uri.getPath()) && (uri.getPath().endsWith(".zip") || uri.getPath().endsWith(".ZIP"))) {
                    dVar3.y(strOptString3);
                } else {
                    dVar3.D(strOptString3);
                }
                dVar3.C(jSONObjectA.optString("cam_html"));
                dVar3.x(jSONObjectA.optString("cam_html"));
                String strOptString4 = jSONObjectA.optString("mraid");
                if (!TextUtils.isEmpty(strOptString4)) {
                    dVar3.k(true);
                    dVar3.e0(strOptString4);
                } else if (!TextUtils.isEmpty(dVar3.Q()) && !dVar3.Q().contains("<MBTPLMARK>")) {
                    dVar3.k(true);
                } else {
                    dVar3.k(false);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObjectA.optJSONArray("omid");
                if (jSONArrayOptJSONArray2 == null) {
                    if (!TextUtils.isEmpty(jSONObjectA.optString("omid"))) {
                        dVar3.h0(jSONObjectA.optString("omid"));
                    } else {
                        dVar3.h0(dVar2);
                    }
                } else {
                    dVar3.h0(jSONArrayOptJSONArray2.toString());
                }
                dVar3.S(jSONObjectA.optInt("maitve"));
                dVar3.b0(jSONObjectA.optString("maitve_src"));
                dVar3.D(jSONObjectA.optInt("flb"));
                dVar3.u(jSONObjectA.optInt("cbd", -2));
                dVar3.z0(jSONObjectA.optInt("vst", -2));
                dVar3.o(jSONObjectA.optInt("adspace_t", 1));
                dVar3.E(jSONObjectA.optInt("flb_skiptime"));
                d dVarB = j.b(jSONObjectA, dVar3);
                try {
                    try {
                        dVarB.T(v.a(com.smartdigimkt.m6.b.p().k(), dVarB.n(), dVarB.P0()));
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                    dVarB.t0(jSONObjectA.optInt("vck_t", 2));
                    dVarB.v0(jSONObjectA.optInt("vctn_t", 1));
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectA.optJSONArray("rs_ignc_r");
                    if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                        ArrayList<Integer> arrayList2 = new ArrayList<>();
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                            arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray3.optInt(i3)));
                        }
                        if (arrayList2.size() > 0) {
                            dVarB.a(arrayList2);
                        }
                    }
                    if (jSONObjectA.has("aab")) {
                        dVarB.a(com.smartdigimkt.x.a.b(jSONObjectA.getString("aab")));
                    }
                    try {
                        dVarB.l0(jSONObjectA.optString("privacy_url", ""));
                        dVarB.a0(jSONObjectA.optInt("show_privacy_btn", 0));
                    } catch (Exception e3) {
                        e3.getMessage();
                    }
                    dVarB.q(jSONObjectA.optInt(C3, 0));
                    dVarB.G(jSONObjectA.optInt("imp_report_type", 0));
                    dVarB.q0(jSONObjectA.optInt("tk_tcp_port", 9377));
                    dVarB.r(jSONObjectA.optInt(E3, 1));
                    return dVarB;
                } catch (Exception e7) {
                    e = e7;
                    dVar = dVarB;
                    r11 = dVar;
                    e.printStackTrace();
                    return r11;
                }
            } catch (Exception e8) {
                e = e8;
                r11 = dVar3;
                e.printStackTrace();
                return r11;
            }
        } catch (Exception e9) {
            e = e9;
            dVar = null;
        }
    }

    public static String[] b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            strArr[i2] = jSONArray.optString(i2);
        }
        return strArr;
    }

    public static JSONObject b(d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", dVar.j());
        jSONObject.put("flb", dVar.D0());
        jSONObject.put("flb_skiptime", dVar.E0());
        jSONObject.put("adspace_t", dVar.R());
        jSONObject.put("vst", dVar.w2());
        jSONObject.put("cbd", dVar.l0());
        if (!TextUtils.isEmpty(dVar.i0())) {
            jSONObject.put("unitId", dVar.i0());
        }
        if (!TextUtils.isEmpty(dVar.z0())) {
            try {
                jSONObject.put("ext_data", new JSONObject(dVar.z0()));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(dVar.M1())) {
            try {
                jSONObject.put("req_ext_data", new JSONObject(dVar.M1()));
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        if (dVar.H1() != null && dVar.H1().size() > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = dVar.H1().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("pv_urls", jSONArray);
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(dVar.k1())) {
            jSONObject.put("mof_tplid", dVar.l1());
            jSONObject.put("mof_template_url", dVar.k1());
            jSONObject.put("nscpt", dVar.s1());
        }
        jSONObject.put("ready_rate", dVar.L1());
        jSONObject.put("title", dVar.f());
        jSONObject.put("desc", dVar.e());
        jSONObject.put("package_name", dVar.n());
        jSONObject.put("rtins_type", dVar.X1());
        jSONObject.put("icon_url", dVar.i());
        jSONObject.put("image_url", dVar.k());
        jSONObject.put("app_size", dVar.p());
        jSONObject.put("image_size", dVar.M0());
        jSONObject.put("impression_url", dVar.P0());
        jSONObject.put("click_url", dVar.p0());
        if (dVar.T1() != null) {
            jSONObject.put("rw_pl", dVar.T1().i());
        }
        jSONObject.put("wtick", dVar.y2());
        jSONObject.put("deep_link", dVar.s0());
        jSONObject.put("user_activation", dVar.k2());
        jSONObject.put("notice_url", dVar.r1());
        jSONObject.put("template", dVar.e2());
        jSONObject.put("ad_source_id", dVar.s());
        jSONObject.put("fca", dVar.B0());
        jSONObject.put("fcb", dVar.C0());
        jSONObject.put("rating", dVar.o() + "");
        jSONObject.put("number_rating", dVar.m());
        jSONObject.put("click_mode", dVar.q0());
        jSONObject.put("landing_type", dVar.d1());
        jSONObject.put("link_type", dVar.e1());
        jSONObject.put("c_ct", dVar.n0());
        jSONObject.put("ctatext", dVar.b());
        jSONObject.put("endcard_click_result", dVar.y0());
        jSONObject.put("retarget_offer", dVar.P1());
        jSONObject.put("video_url", dVar.u2());
        jSONObject.put("video_length", dVar.t());
        jSONObject.put("video_size", dVar.t2());
        jSONObject.put("video_resolution", dVar.s2());
        jSONObject.put("watch_mile", dVar.x2());
        jSONObject.put("ad_url_list", dVar.V());
        jSONObject.put("only_impression_url", dVar.y1());
        jSONObject.put("ctype", dVar.f0());
        jSONObject.put("t_imp", dVar.b2());
        jSONObject.put("adv_imp", dVar.X());
        jSONObject.put("html_url", dVar.I0());
        jSONObject.put("end_screen_url", dVar.x0());
        jSONObject.put("guidelines", dVar.G0());
        jSONObject.put("offer_type", dVar.w1());
        jSONObject.put("reward_amount", dVar.Q1());
        jSONObject.put("reward_name", dVar.R1());
        jSONObject.put("gif_url", dVar.F0());
        if (y.b(dVar.q1())) {
            jSONObject.put("ad_tracking", new JSONObject(dVar.q1()));
        }
        jSONObject.put("video_end_type", dVar.v2());
        jSONObject.put("endcard_url", dVar.B2());
        jSONObject.put("playable_ads_without_video", dVar.B1());
        if (dVar.U1() != null && y.b(dVar.U1().e())) {
            jSONObject.put("rv", new JSONObject(dVar.U1().e()));
        }
        jSONObject.put("md5_file", dVar.q2());
        jSONObject.put("c_toi", dVar.o0());
        jSONObject.put("c_ua", dVar.z2());
        jSONObject.put("imp_ua", dVar.O0());
        jSONObject.put("jm_pd", dVar.W0());
        jSONObject.put("ia_icon", dVar.Y0());
        jSONObject.put("ia_rst", dVar.a1());
        jSONObject.put("ia_url", dVar.b1());
        jSONObject.put("ia_ori", dVar.Z0());
        jSONObject.put("ad_type", dVar.S());
        jSONObject.put("ia_ext1", dVar.J0());
        jSONObject.put("ia_ext2", dVar.K0());
        jSONObject.put("is_download_zip", dVar.U0());
        jSONObject.put("ia_cache", dVar.Q0());
        jSONObject.put("oc_type", dVar.v1());
        jSONObject.put("oc_time", dVar.u1());
        jSONObject.put("t_list", dVar.c2());
        a aVarW = dVar.W();
        if (aVarW != null) {
            jSONObject.put("adchoice", new JSONObject(aVarW.c()));
        }
        jSONObject.put("plct", dVar.C1());
        jSONObject.put("plctb", dVar.D1());
        jSONObject.put("omid", dVar.x1());
        jSONObject.put("creative_id", dVar.r0());
        jSONObject.put("cam_html", dVar.c0());
        jSONObject.put("cam_tpl_url", dVar.d0() != null ? dVar.d0() : dVar.U());
        jSONObject.put("mraid", dVar.o1());
        jSONObject.put("mraid_src", dVar.o1());
        jSONObject.put("timestamp", dVar.r());
        jSONObject.put("hb", dVar.v2);
        jSONObject.put("maitve", dVar.h1());
        jSONObject.put("maitve_src", dVar.i1());
        jSONObject.put("vcn", dVar.l2());
        jSONObject.put("token_r", dVar.f2());
        jSONObject.put("encrypt_p", dVar.w0());
        jSONObject.put("view_com_time", dVar.o2());
        jSONObject.put("rs_ignc_r", dVar.V1());
        jSONObject.put("vck_t", dVar.n2());
        jSONObject.put("vctn_t", dVar.p2());
        jSONObject.put("tp_offer", dVar.g2());
        jSONObject.put("fac", dVar.A0());
        jSONObject.put("local_rid", dVar.g1());
        jSONObject.put("privacy_url", dVar.F1());
        jSONObject.put("show_privacy_btn", dVar.E1());
        try {
            jSONObject.put(com.smartdigimkt.w7.a.n0, com.smartdigimkt.o6.a.b().d());
            jSONObject.put("misk_spt_det", com.smartdigimkt.o6.a.b().e());
        } catch (JSONException unused) {
        }
        if (dVar.O() != null) {
            jSONObject.put("aab", dVar.O().d());
        }
        jSONObject.put("vid_crtv_id", dVar.m2());
        jSONObject.put("ec_crtv_id", dVar.u0());
        jSONObject.put("ec_temp_id", dVar.v0());
        jSONObject.put("local_rid", dVar.g1());
        jSONObject.put(C3, dVar.b0());
        jSONObject.put("imp_report_type", dVar.N0());
        jSONObject.put(E3, dVar.v3);
        return j.a(jSONObject, dVar);
    }

    public static p a(JSONObject jSONObject, p pVar) {
        if (jSONObject == null || pVar == null) {
            return null;
        }
        pVar.u(b(jSONObject.optJSONArray(j.q0)));
        pVar.t(b(jSONObject.optJSONArray(j.r0)));
        pVar.v(b(jSONObject.optJSONArray(j.s0)));
        return pVar;
    }

    public static JSONArray a(List<d> list) {
        JSONArray jSONArray = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    try {
                        Iterator<d> it = list.iterator();
                        while (it.hasNext()) {
                            try {
                                jSONArray2.put(b(it.next()));
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        return jSONArray2;
                    } catch (Exception e2) {
                        e = e2;
                        jSONArray = jSONArray2;
                        e.printStackTrace();
                        return jSONArray;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return jSONArray;
    }

    public static JSONObject a(d dVar, boolean z2, boolean z7) throws JSONException {
        JSONObject jSONObjectB = b(dVar);
        jSONObjectB.put("isReady", z2);
        jSONObjectB.put("expired", z7);
        return jSONObjectB;
    }

    private static List<Map<Integer, String>> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        HashMap map = new HashMap();
                        int i3 = jSONObject.getInt("rate");
                        map.put(Integer.valueOf(i3), jSONObject.getString("url"));
                        arrayList.add(map);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    public boolean a(long j, long j2) {
        if (b(j)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (D1() > 0) {
            return (D1() * 1000) + r() >= jCurrentTimeMillis;
        }
        return r() + j2 >= jCurrentTimeMillis;
    }

    public void a(com.smartdigimkt.x.a aVar) {
        this.j3 = aVar;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.f3 = arrayList;
    }

    public boolean b(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C1() > 0) {
            return (C1() * 1000) + r() >= jCurrentTimeMillis;
        }
        return r() + j >= jCurrentTimeMillis;
    }
}
