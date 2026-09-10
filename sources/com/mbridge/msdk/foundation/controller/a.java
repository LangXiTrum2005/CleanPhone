package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.setting.i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f33384q = "c";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static HashMap<String, String> f33385r = new HashMap<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static com.mbridge.msdk.config.component.status.b f33386s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f33388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f33389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f33390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f33391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33393g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f33396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f33397k;
    private int l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference<Context> f33399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private JSONObject f33400o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f33387a = new s();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f33394h = new JSONObject();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f33395i = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f33398m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f33401p = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0117a implements Runnable {
        public RunnableC0117a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.e.a(a.this.f33389c).a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.d.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f33388b = (String) y0.a(aVar.f33389c, "sp_appId", "");
            } catch (Throwable th2) {
                q0.b(a.f33384q, th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f33396j = (String) y0.a(aVar.f33389c, "sp_appKey", "");
            } catch (Throwable th2) {
                q0.b(a.f33384q, th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface e {
    }

    private void m() {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object objA = y0.a(this.f33389c, MBridgeConstans.SP_GA_ID, "");
                Object objA2 = y0.a(this.f33389c, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (objA instanceof String) {
                    String str = (String) objA;
                    if (TextUtils.isEmpty(str)) {
                        g.d();
                    } else {
                        g.a(str);
                    }
                    if (objA2 instanceof Integer) {
                        g.a(((Integer) objA2).intValue());
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f33384q, e10.getMessage());
        }
    }

    public abstract void a(e eVar);

    public void b(int i10) {
        this.l = i10;
    }

    public void c(int i10) {
        this.f33401p = i10;
    }

    public Context d() {
        return this.f33389c;
    }

    public s e() {
        return this.f33387a;
    }

    public Context f() {
        WeakReference<Context> weakReference = this.f33399n;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int g() {
        return this.f33393g;
    }

    public String h() {
        return !TextUtils.isEmpty(this.f33397k) ? this.f33397k : "";
    }

    public String i() {
        try {
            if (!TextUtils.isEmpty(this.f33390d)) {
                return this.f33390d;
            }
            Context context = this.f33389c;
            if (context == null) {
                return null;
            }
            String packageName = context.getPackageName();
            this.f33390d = packageName;
            return packageName;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String j() {
        if (!TextUtils.isEmpty(this.f33397k)) {
            return this.f33397k;
        }
        Context context = this.f33389c;
        if (context != null) {
            return (String) y0.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public JSONObject k() {
        return this.f33400o;
    }

    public int l() {
        return this.f33401p;
    }

    public WeakReference<Activity> a() {
        return this.f33391e;
    }

    public void b(e eVar) {
        try {
            m0.D(this.f33389c);
            a(eVar);
            i.a(this.f33389c, this.f33388b);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                try {
                    try {
                        PackageManager packageManager = this.f33389c.getPackageManager();
                        m0.d(packageManager.getApplicationInfo("com.android.vending", 0).enabled ? 1 : 2);
                        PackageInfo packageInfo = packageManager.getPackageInfo("com.android.vending", 0);
                        m0.f(packageInfo != null ? packageInfo.versionName : "0");
                    } catch (Throwable th2) {
                        q0.b(f33384q, th2.getMessage());
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    m0.d(0);
                }
            }
            try {
                com.mbridge.msdk.setting.g gVarF = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarF == null) {
                    gVarF = i.b().a();
                }
                s sVarE = com.mbridge.msdk.foundation.controller.c.n().e();
                if (sVarE != null && sVarE.b() && gVarF != null && gVarF.G() == 1) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0117a());
                }
                if (sVarE == null || !sVarE.a()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.threadpool.a.c().post(new b());
            } catch (Throwable th3) {
                q0.b(f33384q, th3.getMessage());
            }
        } catch (Exception e10) {
            q0.b(f33384q, e10.getMessage());
        }
    }

    public void c(e eVar) {
        if (this.f33395i) {
            return;
        }
        m();
        try {
            JSONObject jSONObject = new JSONObject();
            this.f33400o = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e10) {
            q0.b(f33384q, e10.getMessage());
        }
        b(eVar);
    }

    public void d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f33397k = str;
            Context context = this.f33389c;
            if (context != null) {
                y0.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void e(String str) {
        Context context;
        try {
            this.f33388b = str;
            if (TextUtils.isEmpty(str) || (context = this.f33389c) == null) {
                return;
            }
            y0.b(context, "sp_appId", str);
        } catch (Exception e10) {
            q0.b(f33384q, e10.getMessage());
        }
    }

    public void f(String str) {
        Context context;
        try {
            this.f33396j = str;
            if (TextUtils.isEmpty(str) || (context = this.f33389c) == null) {
                return;
            }
            y0.b(context, "sp_appKey", str);
        } catch (Exception e10) {
            q0.b(f33384q, e10.getMessage());
        }
    }

    public void a(WeakReference<Activity> weakReference) {
        this.f33391e = weakReference;
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f33399n = new WeakReference<>(context);
        }
    }

    public void a(int i10) {
        this.f33393g = i10;
    }

    public BitmapDrawable a(String str, int i10) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        String str2;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f33398m) == null || !concurrentHashMap.containsKey(str) || !s0.a().a("w_m_r_l", true)) {
            return null;
        }
        String str3 = this.f33398m.get(str);
        BitmapDrawable bitmapDrawableN = v0.n(str3);
        int i11 = TextUtils.isEmpty(str3) ? 2 : 1;
        if (TextUtils.isEmpty(str3)) {
            str2 = "get watermark failed";
        } else {
            str2 = bitmapDrawableN != null ? "" : "str to bitmap failed";
        }
        j.a(str, i10, i11, str2, bitmapDrawableN == null ? 2 : 1, str3);
        return bitmapDrawableN;
    }

    public String c() {
        try {
            if (!TextUtils.isEmpty(this.f33396j)) {
                return this.f33396j;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new d());
            return "";
        } catch (Throwable th2) {
            q0.b(f33384q, th2.getMessage());
            return "";
        }
    }

    public void a(JSONObject jSONObject) {
        this.f33400o = jSONObject;
    }

    public void a(String str) {
        try {
            if (this.f33398m != null && !TextUtils.isEmpty(str) && this.f33398m.containsKey(str)) {
                this.f33398m.remove(str);
            }
        } catch (Exception e10) {
            q0.b(f33384q, e10.getMessage());
        }
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33390d = str;
    }

    public void a(String str, JSONObject jSONObject) {
        if (s0.a().a("w_m_r_l", true)) {
            try {
                if (this.f33394h == null) {
                    this.f33394h = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.f33394h.put(next, jSONObject.get(next));
                    }
                }
                if (this.f33394h.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f33398m == null) {
                        this.f33398m = new ConcurrentHashMap<>();
                    }
                    this.f33398m.put(str, this.f33394h.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e10) {
                q0.b(f33384q, e10.getMessage());
            }
        }
    }

    public String b() {
        try {
            if (!TextUtils.isEmpty(this.f33388b)) {
                return this.f33388b;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            return "";
        } catch (Exception e10) {
            q0.b(f33384q, e10.getMessage());
            return "";
        }
    }

    public void b(String str) {
        Context context;
        try {
            this.f33392f = str;
            if (TextUtils.isEmpty(str) || (context = this.f33389c) == null) {
                return;
            }
            y0.b(context, "applicationIds", str);
        } catch (Exception e10) {
            q0.b(f33384q, e10.getMessage());
        }
    }

    public void b(Context context) {
        this.f33389c = context;
    }
}
