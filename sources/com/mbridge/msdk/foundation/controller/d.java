package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.k;
import com.unity3d.services.core.fid.Constants;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    private static volatile d l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f33428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FastKV f33429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33430d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f33433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f33434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f33435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.preload.a f33436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f33437k;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f33438a;

        public a(Context context) {
            this.f33438a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.h(this.f33438a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            d.this.g();
            d.this.d();
            Looper.loop();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.a(dVar.f33431e);
            new h(d.this.f33434h).a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0120d implements com.mbridge.msdk.foundation.controller.a.e {
        public C0120d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f33443a;

        public e(String str) {
            this.f33443a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(350L);
            } catch (InterruptedException e10) {
                q0.b("SDKController", e10.getMessage());
            }
            new k().b(d.this.f33434h, this.f33443a, d.this.f33432f);
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            com.mbridge.msdk.timer.b.class.getDeclaredMethod("start", null).invoke(com.mbridge.msdk.timer.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), null);
        } catch (Throwable th2) {
            q0.b("SDKController", th2.getMessage(), th2);
        }
    }

    public boolean e() {
        return true;
    }

    private void c() {
        com.mbridge.msdk.foundation.controller.c.n().b(this.f33434h);
        com.mbridge.msdk.foundation.controller.c.n().e(this.f33431e);
        com.mbridge.msdk.foundation.controller.c.n().f(this.f33432f);
        com.mbridge.msdk.foundation.controller.c.n().d(this.f33437k);
        com.mbridge.msdk.foundation.controller.c.n().b(this.f33433g);
        com.mbridge.msdk.foundation.controller.c.n().c(new C0120d());
        try {
            com.mbridge.msdk.foundation.same.net.utils.d.h().j();
        } catch (Throwable th2) {
            q0.b("SDKController", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        List<com.mbridge.msdk.foundation.entity.a> listG;
        Object objNewInstance;
        Object objNewInstance2;
        try {
            g gVarF = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarF == null || (listG = gVarF.g()) == null || listG.size() <= 0) {
                return;
            }
            for (com.mbridge.msdk.foundation.entity.a aVar : listG) {
                if (aVar.a() == 287) {
                    if (this.f33434h != null && (objNewInstance = MBInterstitialVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                        MBInterstitialVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(objNewInstance, null);
                    }
                } else if (aVar.a() == 94 && (objNewInstance2 = MBRewardVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                    MBRewardVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(objNewInstance2, null);
                }
            }
        } catch (Throwable th2) {
            q0.b("SDKController", th2.getMessage());
        }
    }

    public void b() {
        a(this.f33434h.getApplicationContext());
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new b());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            j.b();
        } catch (Exception unused) {
            q0.b("SDKController", "get app setting failed");
        }
        this.f33430d = true;
    }

    public static d a() {
        if (l == null) {
            synchronized (d.class) {
                try {
                    if (l == null) {
                        l = new d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return l;
    }

    public void b(String str) {
        if (this.f33436j == null) {
            this.f33436j = new com.mbridge.msdk.preload.a();
        }
        try {
            Map<String, Object> map = this.f33428b;
            if (map == null || map.size() <= 0 || !this.f33428b.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)) {
                return;
            }
            int iIntValue = ((Integer) this.f33428b.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue();
            if (iIntValue == 0) {
                this.f33436j.a(this.f33428b, this.f33427a);
                return;
            }
            if (1 == iIntValue) {
                this.f33436j.a(this.f33428b);
            } else if (2 != iIntValue) {
                q0.b("SDKController", "unknow layout type in preload");
            } else {
                this.f33436j.b(this.f33428b);
            }
        } catch (Exception e10) {
            q0.b("SDKController", e10.getMessage());
        }
    }

    public void a(Map map, Context context) {
        Object obj;
        if (context != null) {
            if (!TextUtils.isEmpty(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE)) {
                com.mbridge.msdk.foundation.controller.c.n().c(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE);
            } else if (map.containsKey(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME) && (obj = map.get(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME)) != null) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    com.mbridge.msdk.foundation.controller.c.n().c(str);
                }
            }
            if (map != null) {
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPID)) {
                    this.f33431e = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.f33432f = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.f33437k = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.f33433g = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.f33435i = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.f33434h = context.getApplicationContext();
            c();
            if (this.f33430d) {
                return;
            }
            b();
            m0.l(context);
            long jD0 = i.b().d(this.f33431e).D0();
            if (jD0 != 1300) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(context), jD0);
            }
        }
    }

    public void f() {
    }

    private void a(Context context) {
        String string;
        try {
            if (e() && this.f33429c == null) {
                try {
                    this.f33429c = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
                } catch (Exception unused) {
                    this.f33429c = null;
                }
            }
            FastKV fastKV = this.f33429c;
            String string2 = "";
            if (fastKV != null) {
                String string3 = fastKV.getString(k0.a("H+tU+bfPhM=="), "");
                String string4 = this.f33429c.getString(k0.a("H+tU+Fz8"), "");
                if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f33721g)) {
                    com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    com.mbridge.msdk.foundation.same.a.f33721g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c");
                }
                if (TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f33721g)) {
                        return;
                    }
                    this.f33429c.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    this.f33429c.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f33721g);
                } else {
                    com.mbridge.msdk.foundation.same.a.V = string3;
                    com.mbridge.msdk.foundation.same.a.f33721g = string4;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f33721g);
                }
            } else {
                SharedPreferences sharedPreferences = context.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                if (sharedPreferences != null) {
                    string2 = sharedPreferences.getString(k0.a("H+tU+bfPhM=="), "");
                    string = sharedPreferences.getString(k0.a("H+tU+Fz8"), "");
                } else {
                    string = "";
                }
                if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f33721g)) {
                    com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    com.mbridge.msdk.foundation.same.a.f33721g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c");
                }
                if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string)) {
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f33721g)) {
                        return;
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                        editorEdit.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f33721g);
                        editorEdit.apply();
                    }
                } else {
                    com.mbridge.msdk.foundation.same.a.V = string2;
                    com.mbridge.msdk.foundation.same.a.f33721g = string;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f33721g);
                }
            }
            new com.mbridge.msdk.config.component.common.util.d().a();
        } catch (Throwable th2) {
            q0.b("SDKController", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (i.b() == null) {
            return;
        }
        i iVarB = i.b();
        if (iVarB != null) {
            g gVarF = iVarB.f(str);
            if (gVarF != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = gVarF.W();
                MBridgeConstans.OMID_JS_H5_URL = gVarF.V();
                if (!TextUtils.isEmpty(gVarF.v())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f33859i = gVarF.v();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().e();
                }
                if (!TextUtils.isEmpty(gVarF.w())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f33862m = gVarF.w();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = com.mbridge.msdk.setting.net.b.f35694b;
                MBridgeConstans.OMID_JS_H5_URL = com.mbridge.msdk.setting.net.b.f35693a;
            }
        }
        if (i.b().i(str) && i.b().a(str, 1, (String) null)) {
            int iA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("is_first_init", 0);
            com.mbridge.msdk.foundation.same.a.X = iA == 0 ? 1 : 0;
            com.mbridge.msdk.foundation.same.a.Y = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("first_lau_time").longValue();
            if (iA == 0) {
                try {
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("is_first_init", 1);
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("first_lau_time", System.currentTimeMillis());
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.g.d())) {
                        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(str));
                        return;
                    } else {
                        new k().b(this.f33434h, str, this.f33432f);
                        return;
                    }
                } catch (Throwable unused) {
                    new k().b(this.f33434h, str, this.f33432f);
                    return;
                }
            }
            new k().b(this.f33434h, str, this.f33432f);
        }
    }

    public void a(Map<String, Object> map, int i10) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            q0.b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.f33428b = map;
        this.f33427a = i10;
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        if (map != null) {
            b(strB);
        }
    }
}
