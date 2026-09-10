package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.pgl.ssdk.a5;
import com.pgl.ssdk.aa;
import com.pgl.ssdk.ab;
import com.pgl.ssdk.ac;
import com.pgl.ssdk.ad;
import com.pgl.ssdk.ae;
import com.pgl.ssdk.af;
import com.pgl.ssdk.ag;
import com.pgl.ssdk.ah;
import com.pgl.ssdk.ai;
import com.pgl.ssdk.aj;
import com.pgl.ssdk.ak;
import com.pgl.ssdk.al;
import com.pgl.ssdk.am;
import com.pgl.ssdk.an;
import com.pgl.ssdk.ao;
import com.pgl.ssdk.ar;
import com.pgl.ssdk.aw;
import com.pgl.ssdk.ax;
import com.pgl.ssdk.ay;
import com.pgl.ssdk.az;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import com.pgl.ssdk.f;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f33444a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f33445b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Object> f33446c = null;
    private static int d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static aw.a f33447e;
    public Context g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f33448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33449i;
    private String j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f33451n;
    public boolean f = false;
    private String k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f33450l = null;
    private boolean m = false;
    private boolean o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f33452p = 1;
    public int q = 0;
    public boolean r = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.c();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    public class RunnableC0425b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f33454a;

        public RunnableC0425b(String str) {
            this.f33454a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(this.f33454a) && this.f33454a.equals(PglSSManager.REPORT_SCENE_ADSHOW)) {
                ab.b(b.this.g);
            }
            al.a(b.this.g).a();
            aa.b(b.this.g);
        }
    }

    private b(Context context, String str) {
        this.g = context;
        this.f33448h = str;
    }

    public static b a(Context context, String str, int i2, int i3, String str2) {
        if (f33444a == null) {
            synchronized (b.class) {
                try {
                    if (f33444a == null) {
                        if (context == null) {
                            context = ab.a().getApplicationContext();
                        }
                        if (context == null) {
                            d = 4;
                            return null;
                        }
                        a(i2);
                        aw.a aVarB = aw.b(context, "nms");
                        if (aVarB != null) {
                            d = aVarB.f33441a;
                            f33447e = aVarB;
                            return null;
                        }
                        b bVar = new b(context, str);
                        f33444a = bVar;
                        bVar.f33449i = i3;
                        f33444a.j = str2;
                        f33444a.b(context);
                        f33444a.e(a(context));
                        z.a(context);
                        d = 0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f33444a;
    }

    public static String b() {
        if (e() != null) {
            return e().k;
        }
        return null;
    }

    public static String c() {
        b bVarE = e();
        if (bVarE == null || !bVarE.m || TextUtils.isEmpty(bVarE.f33450l)) {
            return null;
        }
        return bVarE.f33450l;
    }

    public static int d() {
        return d;
    }

    public static b e() {
        return f33444a;
    }

    public static aw.a f() {
        return f33447e;
    }

    public String g() {
        return a5.a();
    }

    public void h() {
        this.o = true;
        a5.a(this.g, this.f33448h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (az.a(ax.a(this.g, "pgl_init_report", 0L), jCurrentTimeMillis)) {
            int i2 = f33444a.q;
            if ((i2 > 0 && i2 < 100 && Math.random() * 100.0d < i2) || i2 == 100) {
                a("Start", (Map<String, Object>) null);
            }
        } else {
            a("Start", (Map<String, Object>) null);
            ax.b(this.g, "pgl_init_report", jCurrentTimeMillis);
        }
        a("Start");
        if (this.r) {
            ar.a(new a(), 20000L);
        }
    }

    private void b(Context context) {
        if (context == null || f33445b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.f33448h);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.f33449i));
            StringBuilder sb = new StringBuilder();
            sb.append(ab.h(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb.toString());
            com.pgl.ssdk.ces.a.meta(152, null, ab.i(context));
            com.pgl.ssdk.ces.a.meta(153, null, ab.d(context));
            com.pgl.ssdk.ces.a.meta(106, null, ab.f(context));
            com.pgl.ssdk.ces.a.meta(107, null, ab.e(context));
            com.pgl.ssdk.ces.a.meta(108, null, ab.c(context));
            com.pgl.ssdk.ces.a.meta(109, null, ab.d());
            com.pgl.ssdk.ces.a.meta(110, null, ab.c());
            com.pgl.ssdk.ces.a.meta(115, null, this.j);
            f33445b = true;
        } catch (Throwable unused) {
        }
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33451n = str;
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f33450l)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.f33450l = str;
            a5.b();
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.k)) {
            this.k = str;
            com.pgl.ssdk.ces.a.meta(103, null, str);
            a5.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void b(String str) {
        byte b2;
        int iIntValue;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                switch (next.hashCode()) {
                    case -417749689:
                        if (!next.equals("touch_trace_enabled")) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case -257777372:
                        if (!next.equals("init_prob")) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    case -93508180:
                        if (!next.equals("autoctl_detect_enable")) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case 449342513:
                        if (!next.equals("craw_ratio")) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case 944591168:
                        if (!next.equals("report_ratio")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 1286849298:
                        if (!next.equals("app_switch")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 != 2) {
                            if (b2 != 3) {
                                if (b2 != 4) {
                                    if (b2 == 5 && (obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue()) >= 0 && iIntValue <= 100) {
                                        this.q = iIntValue;
                                    }
                                } else if (obj instanceof Boolean) {
                                    y.g = ((Boolean) obj).booleanValue();
                                }
                            } else if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                                f.f33471b = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof Boolean) {
                            this.r = ((Boolean) obj).booleanValue();
                        }
                    } else if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                        this.f33452p = ((Integer) obj).intValue();
                    }
                } else if (obj instanceof Boolean) {
                    ak.f33407b = ((Boolean) obj).booleanValue();
                }
            }
        } catch (JSONException unused) {
        }
    }

    private static String a(Context context) {
        String strA = ax.a(context, "iid");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        ax.b(context, "iid", string);
        return string;
    }

    public static void a(int i2) {
        an.a(i2);
    }

    public static String a() {
        if (e() != null) {
            return e().f33448h;
        }
        return null;
    }

    public void a(String str, String str2, String str3, String str4) {
        c(str2);
        d(str4);
        try {
            h();
        } catch (Throwable unused) {
        }
    }

    public Map<String, String> a(String str, byte[] bArr) {
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        String str2 = (String) com.pgl.ssdk.ces.a.meta(224, this.g, new Object[]{str, bArr});
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public void a(String str, Map<String, Object> map) {
        try {
            ar.a(new ao(this.g, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, new Object[]{str, map}), "Start".equals(str) ? 10000L : 0L);
        } catch (Throwable unused) {
        }
    }

    public Object a(int i2, Object obj) {
        if (i2 == 123) {
            return af.a(this.g);
        }
        if (i2 == 121) {
            return ad.a();
        }
        if (i2 == 122) {
            return ad.b();
        }
        if (i2 == 126) {
            return ad.b(this.g);
        }
        if (i2 == 128) {
            return ad.c(this.g);
        }
        if (i2 == 120) {
            return ac.c();
        }
        if (i2 == 124) {
            return ag.c(this.g);
        }
        if (i2 == 130) {
            return ag.a(this.g);
        }
        if (i2 == 145) {
            return ah.c(this.g);
        }
        if (i2 == 125) {
            return ag.b(this.g);
        }
        if (i2 == 129) {
            return ae.f(this.g);
        }
        if (i2 == 141) {
            return ae.e(this.g);
        }
        if (i2 == 134) {
            return ak.a(this.g).b();
        }
        if (i2 == 140) {
            return al.a(this.g).e();
        }
        if (i2 == 144) {
            return al.a(this.g).d();
        }
        if (i2 == 133) {
            return a(obj);
        }
        if (i2 == 135) {
            return v.e();
        }
        if (i2 == 201) {
            return ad.a(this.g);
        }
        if (i2 == 202) {
            return ad.c();
        }
        if (i2 == 236) {
            return ay.a((String) obj);
        }
        if (i2 == 142) {
            return ab.g(this.g);
        }
        if (i2 == 143) {
            return ah.a(this.g);
        }
        if (i2 == 146) {
            try {
                return v.b();
            } catch (Throwable unused) {
                return null;
            }
        }
        if (i2 == 147) {
            return Boolean.valueOf(ab.j(this.g));
        }
        if (i2 == 148) {
            return u.b(this.g);
        }
        if (i2 == 149) {
            return w.a(this.g);
        }
        if (i2 == 150) {
            return Integer.valueOf(x.a());
        }
        if (i2 == 151) {
            return w.c();
        }
        if (i2 == 161) {
            return Boolean.valueOf(v.f());
        }
        if (i2 == 163) {
            return aj.a();
        }
        if (i2 == 169) {
            return Boolean.valueOf(aa.a(this.g));
        }
        if (i2 == 170) {
            return Integer.valueOf(y.b((String) obj));
        }
        if (i2 == 203) {
            return ab.b();
        }
        if (i2 == 205) {
            return Integer.valueOf(ab.k(this.g));
        }
        if (i2 == 204) {
            return Integer.valueOf(ae.a(this.g));
        }
        if (i2 == 206) {
            return ah.b(this.g);
        }
        return null;
    }

    public void a(MotionEvent motionEvent) {
        y.a(motionEvent, this.g);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public synchronized void a(Map<String, Object> map) {
        byte b2;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    try {
                        for (String str : map.keySet()) {
                            Object obj = map.get(str);
                            if (obj != null) {
                                switch (str.hashCode()) {
                                    case -2021683300:
                                        if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST)) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                        break;
                                    case -1195280656:
                                        if (str.equals(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR)) {
                                            b2 = 5;
                                        } else {
                                            b2 = -1;
                                        }
                                        break;
                                    case 156851746:
                                        if (str.equals(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                                            b2 = 3;
                                        } else {
                                            b2 = -1;
                                        }
                                        break;
                                    case 398905722:
                                        if (str.equals(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ)) {
                                            b2 = 0;
                                        } else {
                                            b2 = -1;
                                        }
                                        break;
                                    case 485444716:
                                        if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC)) {
                                            b2 = 4;
                                        } else {
                                            b2 = -1;
                                        }
                                        break;
                                    case 500804551:
                                        if (str.equals(PglSSConfig.CUSTOMINFO_KEY_IPV6)) {
                                            b2 = 1;
                                        } else {
                                            b2 = -1;
                                        }
                                        break;
                                    default:
                                        b2 = -1;
                                        break;
                                }
                                if (b2 != 0) {
                                    if (b2 != 1) {
                                        if (b2 != 2) {
                                            if (b2 != 3) {
                                                if (b2 != 4) {
                                                    if (b2 == 5 && (obj instanceof String)) {
                                                        b((String) obj);
                                                    }
                                                } else if (obj instanceof String) {
                                                    an.b((String) obj);
                                                }
                                            } else if (obj instanceof Set) {
                                                Set set = (Set) obj;
                                                com.pgl.ssdk.ces.a.meta(165, null, Boolean.valueOf(set.contains("boot")));
                                                com.pgl.ssdk.ces.a.meta(166, null, Boolean.valueOf(set.contains("mnc")));
                                                com.pgl.ssdk.ces.a.meta(167, null, Boolean.valueOf(set.contains("mcc")));
                                                com.pgl.ssdk.ces.a.meta(168, null, Boolean.valueOf(set.contains("gaid")));
                                                this.m = set.contains("gaid");
                                            }
                                        } else if (obj instanceof String) {
                                            an.a((String) obj);
                                        }
                                    } else if (obj instanceof String) {
                                        String str2 = (String) obj;
                                        if (!TextUtils.isEmpty(str2)) {
                                            am.a(str2);
                                        }
                                    }
                                } else if (obj instanceof String) {
                                    String strA = ai.a((String) obj);
                                    if (!TextUtils.isEmpty(strA)) {
                                        com.pgl.ssdk.ces.a.meta(159, null, strA);
                                    }
                                }
                            }
                        }
                        if (f33446c == null) {
                            f33446c = new HashMap();
                        }
                        f33446c.putAll(map);
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String a(Object obj) {
        Map<String, Object> map;
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = f33446c) == null || map.isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        try {
            return new JSONObject(f33446c).toString();
        } catch (Exception unused) {
            return JsonUtils.EMPTY_JSON;
        }
    }

    public void a(String str) {
        ar.b(new RunnableC0425b(str));
    }
}
