package com.smartdigimkt.a7;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a implements Cloneable {
    public static final int J0 = 0;
    public static final int K0 = 2;
    public static final int L0 = 0;
    public static final int M0 = 0;
    public static final int N0 = 1;
    public static final int O0 = 2;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    long f33720A;
    private long A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    String f33721B;
    private long B0;
    private String C;
    private long C0;
    private long D;
    private long D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f33722E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f33723F;
    private String F0;
    private int G;
    private long G0;
    private long H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f33724I;
    private String I0;
    private int K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f33727P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f33728Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f33729R;
    private int S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f33730U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f33731V;
    private String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f33732Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f33733a;
    private int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f33734b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f33735b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f33736c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f33737c0;
    protected String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33739e;
    private String e0;
    private int f;
    int f0;
    int g0;
    int h0;
    protected double i0;
    protected double j0;
    private String k;
    protected double k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f33742l;
    private double m;
    private double m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f33743n;
    private String n0;
    private int o;
    private double o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f33744p;
    private String p0;
    private int q0;
    private String r0;
    private String s0;
    private int t0;
    private double u0;
    int v0;
    private int w0;
    private JSONObject x;
    private String x0;
    private String y;
    private double y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    long f33747z;
    private double z0;
    private int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33740h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f33741i = 0;
    public int j = 0;
    protected int q = 1;
    protected int r = 0;
    private int s = 2;
    private boolean t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f33745u = 0;
    private int v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f33746w = 1;
    private boolean H = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f33725J = 0;
    private int L = 1;
    private int M = 13;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f33726N = false;
    private boolean O = false;
    private int T = -2;
    private String W = "";
    protected String Z = "Adx";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected int f33738d0 = 66;
    private String l0 = "unknow";
    private int E0 = 0;

    private void c(JSONObject jSONObject, int i2) {
    }

    public void A(int i2) {
        this.f33738d0 = i2;
    }

    public long B() {
        return this.G0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x02a3 A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:21:0x008d, B:23:0x0099, B:26:0x00a9, B:28:0x00b1, B:29:0x00b8, B:31:0x00bc, B:32:0x00c1, B:34:0x00c6, B:35:0x00cb, B:37:0x00cf, B:38:0x00d4, B:42:0x011b, B:43:0x0164, B:44:0x0195, B:48:0x01b5, B:47:0x01ae, B:49:0x01d0, B:50:0x01fe, B:51:0x022c, B:52:0x025b, B:54:0x026a, B:55:0x0271, B:57:0x0275, B:58:0x027a, B:60:0x02a3, B:62:0x02b5, B:64:0x02b9, B:65:0x02c0, B:67:0x02c4, B:68:0x02c9, B:70:0x02cd, B:71:0x02d2, B:73:0x02db, B:74:0x02de, B:76:0x02f4, B:77:0x0309, B:79:0x0311, B:80:0x0318, B:82:0x031c, B:83:0x0321, B:85:0x0325, B:86:0x032a, B:88:0x032f, B:89:0x0334, B:90:0x0339, B:91:0x0377, B:93:0x03cf, B:94:0x03d2, B:96:0x03df, B:97:0x03f0, B:99:0x03f8, B:100:0x03ff, B:102:0x0408), top: B:109:0x008d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x02c4 A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:21:0x008d, B:23:0x0099, B:26:0x00a9, B:28:0x00b1, B:29:0x00b8, B:31:0x00bc, B:32:0x00c1, B:34:0x00c6, B:35:0x00cb, B:37:0x00cf, B:38:0x00d4, B:42:0x011b, B:43:0x0164, B:44:0x0195, B:48:0x01b5, B:47:0x01ae, B:49:0x01d0, B:50:0x01fe, B:51:0x022c, B:52:0x025b, B:54:0x026a, B:55:0x0271, B:57:0x0275, B:58:0x027a, B:60:0x02a3, B:62:0x02b5, B:64:0x02b9, B:65:0x02c0, B:67:0x02c4, B:68:0x02c9, B:70:0x02cd, B:71:0x02d2, B:73:0x02db, B:74:0x02de, B:76:0x02f4, B:77:0x0309, B:79:0x0311, B:80:0x0318, B:82:0x031c, B:83:0x0321, B:85:0x0325, B:86:0x032a, B:88:0x032f, B:89:0x0334, B:90:0x0339, B:91:0x0377, B:93:0x03cf, B:94:0x03d2, B:96:0x03df, B:97:0x03f0, B:99:0x03f8, B:100:0x03ff, B:102:0x0408), top: B:109:0x008d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x02cd A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:21:0x008d, B:23:0x0099, B:26:0x00a9, B:28:0x00b1, B:29:0x00b8, B:31:0x00bc, B:32:0x00c1, B:34:0x00c6, B:35:0x00cb, B:37:0x00cf, B:38:0x00d4, B:42:0x011b, B:43:0x0164, B:44:0x0195, B:48:0x01b5, B:47:0x01ae, B:49:0x01d0, B:50:0x01fe, B:51:0x022c, B:52:0x025b, B:54:0x026a, B:55:0x0271, B:57:0x0275, B:58:0x027a, B:60:0x02a3, B:62:0x02b5, B:64:0x02b9, B:65:0x02c0, B:67:0x02c4, B:68:0x02c9, B:70:0x02cd, B:71:0x02d2, B:73:0x02db, B:74:0x02de, B:76:0x02f4, B:77:0x0309, B:79:0x0311, B:80:0x0318, B:82:0x031c, B:83:0x0321, B:85:0x0325, B:86:0x032a, B:88:0x032f, B:89:0x0334, B:90:0x0339, B:91:0x0377, B:93:0x03cf, B:94:0x03d2, B:96:0x03df, B:97:0x03f0, B:99:0x03f8, B:100:0x03ff, B:102:0x0408), top: B:109:0x008d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x02db A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:21:0x008d, B:23:0x0099, B:26:0x00a9, B:28:0x00b1, B:29:0x00b8, B:31:0x00bc, B:32:0x00c1, B:34:0x00c6, B:35:0x00cb, B:37:0x00cf, B:38:0x00d4, B:42:0x011b, B:43:0x0164, B:44:0x0195, B:48:0x01b5, B:47:0x01ae, B:49:0x01d0, B:50:0x01fe, B:51:0x022c, B:52:0x025b, B:54:0x026a, B:55:0x0271, B:57:0x0275, B:58:0x027a, B:60:0x02a3, B:62:0x02b5, B:64:0x02b9, B:65:0x02c0, B:67:0x02c4, B:68:0x02c9, B:70:0x02cd, B:71:0x02d2, B:73:0x02db, B:74:0x02de, B:76:0x02f4, B:77:0x0309, B:79:0x0311, B:80:0x0318, B:82:0x031c, B:83:0x0321, B:85:0x0325, B:86:0x032a, B:88:0x032f, B:89:0x0334, B:90:0x0339, B:91:0x0377, B:93:0x03cf, B:94:0x03d2, B:96:0x03df, B:97:0x03f0, B:99:0x03f8, B:100:0x03ff, B:102:0x0408), top: B:109:0x008d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x02f4 A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:21:0x008d, B:23:0x0099, B:26:0x00a9, B:28:0x00b1, B:29:0x00b8, B:31:0x00bc, B:32:0x00c1, B:34:0x00c6, B:35:0x00cb, B:37:0x00cf, B:38:0x00d4, B:42:0x011b, B:43:0x0164, B:44:0x0195, B:48:0x01b5, B:47:0x01ae, B:49:0x01d0, B:50:0x01fe, B:51:0x022c, B:52:0x025b, B:54:0x026a, B:55:0x0271, B:57:0x0275, B:58:0x027a, B:60:0x02a3, B:62:0x02b5, B:64:0x02b9, B:65:0x02c0, B:67:0x02c4, B:68:0x02c9, B:70:0x02cd, B:71:0x02d2, B:73:0x02db, B:74:0x02de, B:76:0x02f4, B:77:0x0309, B:79:0x0311, B:80:0x0318, B:82:0x031c, B:83:0x0321, B:85:0x0325, B:86:0x032a, B:88:0x032f, B:89:0x0334, B:90:0x0339, B:91:0x0377, B:93:0x03cf, B:94:0x03d2, B:96:0x03df, B:97:0x03f0, B:99:0x03f8, B:100:0x03ff, B:102:0x0408), top: B:109:0x008d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0311 A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:21:0x008d, B:23:0x0099, B:26:0x00a9, B:28:0x00b1, B:29:0x00b8, B:31:0x00bc, B:32:0x00c1, B:34:0x00c6, B:35:0x00cb, B:37:0x00cf, B:38:0x00d4, B:42:0x011b, B:43:0x0164, B:44:0x0195, B:48:0x01b5, B:47:0x01ae, B:49:0x01d0, B:50:0x01fe, B:51:0x022c, B:52:0x025b, B:54:0x026a, B:55:0x0271, B:57:0x0275, B:58:0x027a, B:60:0x02a3, B:62:0x02b5, B:64:0x02b9, B:65:0x02c0, B:67:0x02c4, B:68:0x02c9, B:70:0x02cd, B:71:0x02d2, B:73:0x02db, B:74:0x02de, B:76:0x02f4, B:77:0x0309, B:79:0x0311, B:80:0x0318, B:82:0x031c, B:83:0x0321, B:85:0x0325, B:86:0x032a, B:88:0x032f, B:89:0x0334, B:90:0x0339, B:91:0x0377, B:93:0x03cf, B:94:0x03d2, B:96:0x03df, B:97:0x03f0, B:99:0x03f8, B:100:0x03ff, B:102:0x0408), top: B:109:0x008d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x031c A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:21:0x008d, B:23:0x0099, B:26:0x00a9, B:28:0x00b1, B:29:0x00b8, B:31:0x00bc, B:32:0x00c1, B:34:0x00c6, B:35:0x00cb, B:37:0x00cf, B:38:0x00d4, B:42:0x011b, B:43:0x0164, B:44:0x0195, B:48:0x01b5, B:47:0x01ae, B:49:0x01d0, B:50:0x01fe, B:51:0x022c, B:52:0x025b, B:54:0x026a, B:55:0x0271, B:57:0x0275, B:58:0x027a, B:60:0x02a3, B:62:0x02b5, B:64:0x02b9, B:65:0x02c0, B:67:0x02c4, B:68:0x02c9, B:70:0x02cd, B:71:0x02d2, B:73:0x02db, B:74:0x02de, B:76:0x02f4, B:77:0x0309, B:79:0x0311, B:80:0x0318, B:82:0x031c, B:83:0x0321, B:85:0x0325, B:86:0x032a, B:88:0x032f, B:89:0x0334, B:90:0x0339, B:91:0x0377, B:93:0x03cf, B:94:0x03d2, B:96:0x03df, B:97:0x03f0, B:99:0x03f8, B:100:0x03ff, B:102:0x0408), top: B:109:0x008d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0325 A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:21:0x008d, B:23:0x0099, B:26:0x00a9, B:28:0x00b1, B:29:0x00b8, B:31:0x00bc, B:32:0x00c1, B:34:0x00c6, B:35:0x00cb, B:37:0x00cf, B:38:0x00d4, B:42:0x011b, B:43:0x0164, B:44:0x0195, B:48:0x01b5, B:47:0x01ae, B:49:0x01d0, B:50:0x01fe, B:51:0x022c, B:52:0x025b, B:54:0x026a, B:55:0x0271, B:57:0x0275, B:58:0x027a, B:60:0x02a3, B:62:0x02b5, B:64:0x02b9, B:65:0x02c0, B:67:0x02c4, B:68:0x02c9, B:70:0x02cd, B:71:0x02d2, B:73:0x02db, B:74:0x02de, B:76:0x02f4, B:77:0x0309, B:79:0x0311, B:80:0x0318, B:82:0x031c, B:83:0x0321, B:85:0x0325, B:86:0x032a, B:88:0x032f, B:89:0x0334, B:90:0x0339, B:91:0x0377, B:93:0x03cf, B:94:0x03d2, B:96:0x03df, B:97:0x03f0, B:99:0x03f8, B:100:0x03ff, B:102:0x0408), top: B:109:0x008d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x032f A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:21:0x008d, B:23:0x0099, B:26:0x00a9, B:28:0x00b1, B:29:0x00b8, B:31:0x00bc, B:32:0x00c1, B:34:0x00c6, B:35:0x00cb, B:37:0x00cf, B:38:0x00d4, B:42:0x011b, B:43:0x0164, B:44:0x0195, B:48:0x01b5, B:47:0x01ae, B:49:0x01d0, B:50:0x01fe, B:51:0x022c, B:52:0x025b, B:54:0x026a, B:55:0x0271, B:57:0x0275, B:58:0x027a, B:60:0x02a3, B:62:0x02b5, B:64:0x02b9, B:65:0x02c0, B:67:0x02c4, B:68:0x02c9, B:70:0x02cd, B:71:0x02d2, B:73:0x02db, B:74:0x02de, B:76:0x02f4, B:77:0x0309, B:79:0x0311, B:80:0x0318, B:82:0x031c, B:83:0x0321, B:85:0x0325, B:86:0x032a, B:88:0x032f, B:89:0x0334, B:90:0x0339, B:91:0x0377, B:93:0x03cf, B:94:0x03d2, B:96:0x03df, B:97:0x03f0, B:99:0x03f8, B:100:0x03ff, B:102:0x0408), top: B:109:0x008d, outer: #1 }] */
    public JSONObject C(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", i9);
            jSONObject.put("pl_id", this.f33733a);
            jSONObject.put("req_id", this.f33734b);
            if (!TextUtils.isEmpty(this.f33736c)) {
                jSONObject.put("format", Integer.parseInt(this.f33736c));
            }
            jSONObject.put("ps_id", com.smartdigimkt.m6.b.p().q());
            String strD = com.smartdigimkt.m6.b.p().d(this.f33733a);
            if (!TextUtils.isEmpty(strD)) {
                jSONObject.put("sessionid", strD);
            }
            jSONObject.put("asid", this.d);
            Object obj = this.x;
            if (obj != null) {
                jSONObject.put("p_c", obj);
            }
            int i10 = this.s;
            if (i10 > 0) {
                jSONObject.put("wf2_mode", i10);
            }
            if (!TextUtils.isEmpty(this.y)) {
                jSONObject.put("x_c", new JSONArray(this.y));
            }
            jSONObject.put("o_r", w());
            try {
                jSONObject.put("nw_ver", this.f33732Y);
                int i11 = this.g;
                if (i11 != -1) {
                    jSONObject.put("refresh", i11);
                    jSONObject.put("refresh_v2", this.g);
                }
                if (!TextUtils.isEmpty(this.s0)) {
                    jSONObject.put("tp_bid_id", this.s0);
                }
                int i12 = this.f33735b0;
                if (i12 > 0) {
                    jSONObject.put("ads_list_type", i12);
                }
                if (this.t) {
                    jSONObject.put("is_s", 1);
                }
                int i13 = this.o;
                if (i13 > 0) {
                    jSONObject.put("s_type", i13);
                }
                jSONObject.put("network_pl_id", this.f33733a);
                jSONObject.put("channel_from", com.smartdigimkt.m6.b.p().j());
                switch (i9) {
                    case 1:
                        jSONObject.put("unit_id", this.e0);
                        jSONObject.put("nw_firm_id", this.f33738d0);
                        jSONObject.put("auto_req", this.f33741i);
                        jSONObject.put("bidtype", this.v0);
                        jSONObject.put("bidprice", String.valueOf(this.i0));
                        jSONObject.put("bidprice_cny", String.valueOf(this.j0));
                        jSONObject.put("unit_type", this.t0);
                        b(jSONObject);
                        a(jSONObject);
                        i9 = i2;
                        break;
                    case 2:
                        jSONObject.put("unit_id", this.e0);
                        jSONObject.put("nw_firm_id", this.f33738d0);
                        jSONObject.put("auto_req", this.f33741i);
                        jSONObject.put("status", this.f33740h);
                        jSONObject.put("flag", this.j);
                        jSONObject.put("bidtype", this.v0);
                        jSONObject.put("bidprice", String.valueOf(this.i0));
                        jSONObject.put("bidprice_cny", String.valueOf(this.j0));
                        jSONObject.put("ft_t", this.C0);
                        jSONObject.put("filled_t", this.D0);
                        jSONObject.put("filledtime", this.B0);
                        jSONObject.put("data_ft", this.A0);
                        int i14 = this.E0;
                        if (i14 > 0) {
                            jSONObject.put("material_type", i14);
                        }
                        jSONObject.put("unit_type", this.t0);
                        if (!TextUtils.isEmpty(this.n0)) {
                            jSONObject.put("e_c", this.n0);
                            jSONObject.put("e_c_key_id", this.q0);
                            jSONObject.put("unique_id", this.x0);
                        }
                        if (!TextUtils.isEmpty(this.p0)) {
                            jSONObject.put("e_c_cny", this.p0);
                        }
                        a(jSONObject);
                        b(jSONObject);
                        i9 = i2;
                        break;
                    case 3:
                        jSONObject.put("unit_id", this.e0);
                        jSONObject.put("nw_firm_id", this.f33738d0);
                        jSONObject.put("auto_req", this.f33741i);
                        jSONObject.put("status", this.f33740h);
                        jSONObject.put("flag", this.j);
                        jSONObject.put("bidtype", this.v0);
                        jSONObject.put("bidprice", String.valueOf(this.i0));
                        jSONObject.put("bidprice_cny", String.valueOf(this.j0));
                        jSONObject.put("unit_type", this.t0);
                        a(jSONObject);
                        break;
                    case 4:
                        jSONObject.put("cl_imp", this.f33739e);
                        if (!TextUtils.isEmpty(this.F0)) {
                            jSONObject.put("render_w_h", this.F0);
                        }
                        int i15 = this.f33725J;
                        if (i15 > 0) {
                            jSONObject.put("offer_install", i15);
                        }
                        jSONObject.put("unit_id", this.e0);
                        jSONObject.put("nw_firm_id", this.f33738d0);
                        jSONObject.put("auto_req", this.f33741i);
                        jSONObject.put("bidtype", this.v0);
                        jSONObject.put("bidprice_cny", String.valueOf(this.j0));
                        jSONObject.put("s_pty", String.valueOf(this.k0));
                        if (i9 == 6) {
                            jSONObject.put("cl_s_type", this.L);
                            jSONObject.put("cl_area", this.M);
                            if (this.O && !this.f33726N) {
                                jSONObject.put("tk_x_cl_sent", "1");
                            }
                        }
                        i3 = this.f33730U;
                        if (i3 > 0) {
                            jSONObject.put("render_type_video", i3);
                        }
                        i4 = this.f33731V;
                        if (i4 > 0) {
                            jSONObject.put("close_button_m", i4);
                        }
                        jSONObject.put("unit_type", this.t0);
                        i5 = this.E0;
                        if (i5 > 0) {
                            jSONObject.put("material_type", i5);
                        }
                        b(jSONObject);
                        jSONObject.put("nv_tmpl_id", String.valueOf(this.K));
                        if (!TextUtils.isEmpty(this.n0)) {
                            jSONObject.put("e_c", this.n0);
                            jSONObject.put("e_c_key_id", this.q0);
                            jSONObject.put("unique_id", this.x0);
                        }
                        if (!TextUtils.isEmpty(this.p0)) {
                            jSONObject.put("e_c_cny", this.p0);
                        }
                        i6 = this.S;
                        if (i6 > 0) {
                            jSONObject.put("cls_style", i6);
                        }
                        i7 = this.f33729R;
                        if (i7 > 0) {
                            jSONObject.put("iv_template_id", i7);
                        }
                        i8 = this.T;
                        if (i8 >= -1) {
                            jSONObject.put("adx_mix_type", i8);
                        }
                        a(jSONObject);
                        break;
                    case 6:
                        jSONObject.put("unit_id", this.e0);
                        jSONObject.put("nw_firm_id", this.f33738d0);
                        jSONObject.put("auto_req", this.f33741i);
                        jSONObject.put("bidtype", this.v0);
                        jSONObject.put("bidprice_cny", String.valueOf(this.j0));
                        jSONObject.put("s_pty", String.valueOf(this.k0));
                        if (i9 == 6) {
                            jSONObject.put("cl_s_type", this.L);
                            jSONObject.put("cl_area", this.M);
                            if (this.O) {
                                jSONObject.put("tk_x_cl_sent", "1");
                            }
                        }
                        i3 = this.f33730U;
                        if (i3 > 0) {
                            jSONObject.put("render_type_video", i3);
                        }
                        i4 = this.f33731V;
                        if (i4 > 0) {
                            jSONObject.put("close_button_m", i4);
                        }
                        jSONObject.put("unit_type", this.t0);
                        i5 = this.E0;
                        if (i5 > 0) {
                            jSONObject.put("material_type", i5);
                        }
                        b(jSONObject);
                        jSONObject.put("nv_tmpl_id", String.valueOf(this.K));
                        if (!TextUtils.isEmpty(this.n0)) {
                            jSONObject.put("e_c", this.n0);
                            jSONObject.put("e_c_key_id", this.q0);
                            jSONObject.put("unique_id", this.x0);
                        }
                        if (!TextUtils.isEmpty(this.p0)) {
                            jSONObject.put("e_c_cny", this.p0);
                        }
                        i6 = this.S;
                        if (i6 > 0) {
                            jSONObject.put("cls_style", i6);
                        }
                        i7 = this.f33729R;
                        if (i7 > 0) {
                            jSONObject.put("iv_template_id", i7);
                        }
                        i8 = this.T;
                        if (i8 >= -1) {
                            jSONObject.put("adx_mix_type", i8);
                        }
                        a(jSONObject);
                        break;
                    case 7:
                        jSONObject.put("unit_id", this.e0);
                        jSONObject.put("nw_firm_id", this.f33738d0);
                        jSONObject.put("auto_req", this.f33741i);
                        jSONObject.put("bidtype", this.v0);
                        jSONObject.put("bidprice", String.valueOf(this.i0));
                        jSONObject.put("bidprice_cny", String.valueOf(this.j0));
                        jSONObject.put("unit_type", this.t0);
                        b(jSONObject);
                        jSONObject.put("unit_id", this.e0);
                        jSONObject.put("nw_firm_id", this.f33738d0);
                        jSONObject.put("auto_req", this.f33741i);
                        jSONObject.put("bidtype", this.v0);
                        jSONObject.put("bidprice_cny", String.valueOf(this.j0));
                        jSONObject.put("unit_type", this.t0);
                        b(jSONObject);
                        jSONObject.put("network_pl_id", this.f33733a);
                        a(jSONObject);
                        break;
                    case 8:
                    case 9:
                        jSONObject.put("unit_id", this.e0);
                        jSONObject.put("nw_firm_id", this.f33738d0);
                        jSONObject.put("auto_req", this.f33741i);
                        jSONObject.put("bidtype", this.v0);
                        jSONObject.put("bidprice_cny", String.valueOf(this.j0));
                        jSONObject.put("unit_type", this.t0);
                        b(jSONObject);
                        jSONObject.put("network_pl_id", this.f33733a);
                        a(jSONObject);
                        break;
                    case 10:
                        jSONObject.put("isload", 1);
                        jSONObject.put("req_par", this.f33745u);
                        jSONObject.put("req_par_num", this.v);
                        jSONObject.put("load_start_t", this.D);
                        jSONObject.put("req_st_t", this.f33722E);
                        jSONObject.put("st_succ_t", this.f33723F);
                        jSONObject.put("cache_st_type", this.G);
                        break;
                    case 11:
                        jSONObject.put("auto_req", this.f33741i);
                        jSONObject.put("bidrequesttime", this.f33747z);
                        jSONObject.put("bidresponselist", TextUtils.isEmpty(this.f33721B) ? "[]" : new JSONArray(this.f33721B));
                        jSONObject.put("ft_t", this.C0);
                        jSONObject.put("bidresponsetime", this.f33720A);
                        jSONObject.put("data_bidresponsetime", this.f33720A);
                        a(jSONObject);
                        break;
                    case 12:
                        jSONObject.put("loadtime", this.B0);
                        jSONObject.put("unit_id", this.e0);
                        jSONObject.put("bidprice", String.valueOf(this.i0));
                        jSONObject.put("bidprice_cny", String.valueOf(this.j0));
                        jSONObject.put("load_t", this.D0);
                        jSONObject.put("req_par", this.f33745u);
                        jSONObject.put("req_par_num", this.v);
                        break;
                    case 13:
                        jSONObject.put("unit_id", this.e0);
                        jSONObject.put("nw_firm_id", this.f33738d0);
                        jSONObject.put("bidtype", this.v0);
                        jSONObject.put("bidprice", String.valueOf(this.i0));
                        jSONObject.put("bidprice_cny", String.valueOf(this.j0));
                        jSONObject.put("s_pty", String.valueOf(this.k0));
                        jSONObject.put("new_req_id", this.f33734b);
                        jSONObject.put("auto_req", this.f33741i);
                        jSONObject.put("req_id_match", 0);
                        jSONObject.put("unit_type", this.t0);
                        b(jSONObject);
                        a(jSONObject);
                        break;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            c(jSONObject, i9);
            a(jSONObject, i9);
            d(jSONObject, i9);
            b(jSONObject, i9);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return jSONObject;
    }

    public int D() {
        return this.o;
    }

    public String E() {
        return this.s0;
    }

    public String F() {
        return this.y;
    }

    public String G() {
        return this.f33743n;
    }

    public double H() {
        return this.m;
    }

    public String I() {
        return this.f33736c;
    }

    public double J() {
        return this.i0;
    }

    public int K() {
        return this.v0;
    }

    public int L() {
        return this.g0;
    }

    public String M() {
        return this.f33724I;
    }

    public String N() {
        return this.k;
    }

    public String O() {
        return this.f33742l;
    }

    public int P() {
        return this.h0;
    }

    public String Q() {
        return this.l0;
    }

    public long R() {
        return this.f33720A;
    }

    public String S() {
        return this.f33721B;
    }

    public long T() {
        return this.f33747z;
    }

    public int U() {
        return this.w0;
    }

    public String V() {
        return this.f33737c0;
    }

    public int W() {
        return this.f33738d0;
    }

    public String X() {
        return this.f33732Y;
    }

    public String Y() {
        return this.f33733a;
    }

    public String Z() {
        return this.f33734b;
    }

    public void a(long j) {
        this.H0 = j;
    }

    public String a0() {
        return this.I0;
    }

    public String b() {
        String str = this.f33736c;
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

    public int b0() {
        return this.f0;
    }

    public String c0() {
        return this.f33744p;
    }

    public void d(int i2) {
        this.f33725J = i2;
    }

    public String d0() {
        return this.e0;
    }

    public int e() {
        return this.f33725J;
    }

    public boolean e0() {
        return this.v0 == 1;
    }

    public int f() {
        return this.f33729R;
    }

    public boolean f0() {
        return this.H;
    }

    public void g(int i2) {
        this.K = i2;
    }

    public boolean g0() {
        return this.f33726N;
    }

    public void h(String str) {
        this.W = str;
    }

    public void h0() {
        if (this.f != 1) {
            this.f33739e = 1;
        }
    }

    public String i() {
        return this.d;
    }

    public void i0() {
        this.f = 1;
    }

    public void j(long j) {
        this.f33720A = j;
    }

    public void k(long j) {
        this.f33747z = j;
    }

    public void l(int i2) {
        this.f33731V = i2;
    }

    public void m(String str) {
        this.f33736c = str;
    }

    public void n(String str) {
        this.f33724I = str;
    }

    public void o(int i2) {
        this.g = i2;
    }

    public void p(int i2) {
        this.f33728Q = i2;
    }

    public void q(int i2) {
        this.f33727P = i2;
    }

    public void r(int i2) {
        this.f33741i = i2;
    }

    public void s(int i2) {
        this.f33730U = i2;
    }

    public int t() {
        return this.f33740h;
    }

    public void u(String str) {
        this.f33733a = str;
    }

    public void v(int i2) {
        this.M = i2;
    }

    public void w(int i2) {
        this.L = i2;
    }

    public String x() {
        return this.X;
    }

    public String y() {
        return this.W;
    }

    public int z() {
        return this.f33741i;
    }

    public double A() {
        return this.j0;
    }

    public void B(int i2) {
        this.f0 = i2;
    }

    public a a() {
        try {
            return (a) super.clone();
        } catch (Throwable unused) {
            return this;
        }
    }

    public void c(int i2) {
        this.S = i2;
    }

    public int d() {
        return this.S;
    }

    public void e(int i2) {
        this.f33729R = i2;
    }

    public void f(int i2) {
        this.T = i2;
    }

    public int g() {
        return this.T;
    }

    public void h(double d) {
        this.m = d;
    }

    public void i(double d) {
        this.i0 = d;
    }

    public double j() {
        return this.u0;
    }

    public double k() {
        return this.m0;
    }

    public void l(String str) {
        this.f33743n = str;
    }

    public void m(int i2) {
        this.j = i2;
    }

    public void n(int i2) {
        this.f33740h = i2;
    }

    public void o(String str) {
        this.k = str;
    }

    public long p() {
        return this.H0;
    }

    public int q() {
        return this.f33731V;
    }

    public void r(String str) {
        this.f33721B = str;
    }

    public void s(String str) {
        this.f33737c0 = str;
    }

    public void t(int i2) {
        this.o = i2;
    }

    public int u() {
        return this.g;
    }

    public void v(String str) {
        this.f33734b = str;
    }

    public void w(String str) {
        this.I0 = str;
    }

    public void x(String str) {
        this.f33744p = str;
    }

    public void y(String str) {
        this.e0 = str;
    }

    public void z(int i2) {
        this.w0 = i2;
    }

    public void a(String str) {
        this.d = str;
    }

    public void c(JSONObject jSONObject) {
        this.x = this.x;
    }

    public void d(String str) {
        this.r0 = str;
    }

    public void e(String str) {
        this.Z = str;
    }

    public void f(double d) {
        this.j0 = d;
    }

    public void g(String str) {
        this.X = str;
    }

    public int h() {
        return this.E0;
    }

    public void i(String str) {
        this.s0 = str;
    }

    public void j(String str) {
        this.x0 = str;
    }

    public void k(int i2) {
        this.q0 = i2;
    }

    public int l() {
        return this.q0;
    }

    public String m() {
        return this.n0;
    }

    public String n() {
        return this.p0;
    }

    public double o() {
        return this.o0;
    }

    public void p(String str) {
        this.f33742l = str;
    }

    public void q(String str) {
        this.l0 = str;
    }

    public long r() {
        return this.A0;
    }

    public long s() {
        return this.B0;
    }

    public void t(String str) {
        this.f33732Y = str;
    }

    public void u(int i2) {
        this.v0 = i2;
    }

    public String v() {
        return this.Z;
    }

    public String w() {
        if (TextUtils.isEmpty(this.C)) {
            return this.f33734b;
        }
        return this.C;
    }

    public void x(int i2) {
        this.g0 = i2;
    }

    public void y(int i2) {
        this.h0 = i2;
    }

    public void a(int i2) {
        this.a0 = i2;
    }

    public int c() {
        return this.f33735b0;
    }

    public void d(double d) {
        this.y0 = d;
    }

    public void e(double d) {
        this.z0 = d;
    }

    public void f(String str) {
        this.C = str;
    }

    public void g(long j) {
        this.G0 = j;
    }

    public void h(int i2) {
        this.E0 = i2;
    }

    public void i(int i2) {
        this.t0 = i2;
    }

    public void j(int i2) {
        this.G = i2;
    }

    public void k(String str) {
        this.y = str;
    }

    public void a(double d) {
        this.u0 = d;
    }

    public void c(double d) {
        this.o0 = d;
    }

    public void d(long j) {
        this.D0 = j;
    }

    public void e(long j) {
        this.B0 = j;
    }

    public void f(long j) {
        this.f33723F = j;
    }

    public void g(double d) {
        this.k0 = d;
    }

    public void h(long j) {
        this.D = j;
    }

    public void i(long j) {
        this.f33722E = j;
    }

    private void d(JSONObject jSONObject, int i2) {
        try {
            if (TextUtils.equals(this.f33736c, "0")) {
                if (i2 == 1 || i2 == 4 || i2 == 6) {
                    int i3 = this.f33727P;
                    if (i3 > 0) {
                        jSONObject.put("render_type", i3);
                    }
                    int i4 = this.f33728Q;
                    if (i4 > 0) {
                        jSONObject.put("template_type", i4);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public void a(int i2, int i3) {
        this.F0 = i2 + "_" + i3;
    }

    public void c(String str) {
        this.p0 = str;
    }

    public void a(boolean z2) {
        this.H = z2;
    }

    public void c(long j) {
        this.A0 = j;
    }

    private void a(JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(this.W)) {
                jSONObject.put("deal_type", this.W);
            }
            if (TextUtils.isEmpty(this.X)) {
                return;
            }
            jSONObject.put("deal_id", this.X);
        } catch (Throwable unused) {
        }
    }

    public void b(boolean z2) {
        this.f33726N = z2;
    }

    public void b(int i2) {
        this.f33735b0 = i2;
    }

    public void b(double d) {
        this.m0 = d;
    }

    private void a(JSONObject jSONObject, int i2) {
        com.smartdigimkt.i7.b bVarB = com.smartdigimkt.i7.b.b();
        try {
            if (i2 != 4) {
                if (i2 == 6 && this.f33738d0 == 66) {
                    long jA = bVarB.a(this);
                    if (jA > 0) {
                        jSONObject.put("s_c_interval", jA);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("0".equals(this.f33736c)) {
                return;
            }
            long jB = bVarB.b(this);
            if (jB > 0) {
                jSONObject.put("pl_show_interval", jB);
            }
            long jA2 = bVarB.a();
            if (jA2 > 0) {
                jSONObject.put("bidads_show_interval", jA2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void b(String str) {
        this.n0 = str;
    }

    public void b(long j) {
        this.C0 = j;
    }

    private void b(JSONObject jSONObject) {
        try {
            jSONObject.put("dd_ori_price", String.valueOf(this.z0));
            jSONObject.put("dd_dis_rate", String.valueOf(this.y0));
        } catch (Throwable unused) {
        }
    }

    private void b(JSONObject jSONObject, int i2) {
        if (jSONObject == null || i2 != 6) {
            return;
        }
        try {
            if (this.f33726N) {
                this.O = true;
                jSONObject.put("type", 28);
            }
        } catch (Throwable unused) {
        }
    }

    public double C() {
        return this.k0;
    }
}
