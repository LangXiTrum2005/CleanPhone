package com.mbridge.msdk.advanced.middle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.advanced.view.MBOutNativeAdvancedViewGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.k;
import com.mbridge.msdk.setting.m;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private static String G = "NativeAdvancedProvider";
    private boolean A;
    private boolean B;
    private boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f31514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.b f31515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.c f31516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f31517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NativeAdvancedAdListener f31518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f31519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBNativeAdvancedView f31520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBNativeAdvancedWebview f31521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.advanced.view.a f31522k;
    private m l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k f31524n;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private JSONObject f31534x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private MBOutNativeAdvancedViewGroup f31536z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f31525o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f31526p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f31527q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f31528r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f31529s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f31530t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f31531u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f31532v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f31533w = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f31535y = false;
    private boolean D = true;
    public boolean E = false;
    private ViewTreeObserver.OnScrollChangedListener F = new a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.middle.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0098a implements Runnable {
            public RunnableC0098a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.D = true;
            }
        }

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (c.this.D) {
                c.this.D = false;
                if (c.this.f31536z != null) {
                    c.this.f31536z.postDelayed(new RunnableC0098a(), 1000L);
                }
                try {
                    c.this.i();
                } catch (Exception e10) {
                    q0.b(c.G, e10.getMessage());
                }
            }
        }
    }

    public c(String str, String str2, Activity activity) {
        this.f31513b = TextUtils.isEmpty(str) ? "" : str;
        this.f31512a = str2;
        this.f31514c = new MBridgeIds(str, str2);
        a(activity);
    }

    private void e(int i10) {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f31521j;
        if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
            return;
        }
        try {
            if (this.f31521j != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a((WebView) this.f31521j, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th2) {
            q0.a(G, th2.getMessage());
        }
    }

    private void j() {
        a(this.f31525o);
        c(this.f31527q);
        g(this.f31529s);
        a(this.f31534x);
        e(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
    }

    public MBOutNativeAdvancedViewGroup d() {
        return this.f31536z;
    }

    public int f() {
        return this.f31525o;
    }

    public boolean g() {
        return this.f31523m;
    }

    public void h(int i10) {
        this.f31530t = true;
        g(i10);
    }

    public void i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (this.C) {
                        return;
                    } else {
                        this.C = true;
                    }
                }
            } else if (this.B) {
                return;
            } else {
                this.B = true;
            }
        } else if (this.A) {
            return;
        } else {
            this.A = true;
        }
        try {
            i();
        } catch (Exception e10) {
            q0.b(G, e10.getMessage());
        }
    }

    private void g(int i10) {
        if (this.f31530t) {
            this.f31529s = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f31521j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f31521j, "setVideoPlayMode", "autoPlay", Integer.valueOf(i10));
        }
    }

    public void b(JSONObject jSONObject) {
        this.f31535y = true;
        a(jSONObject);
    }

    public void c(String str) throws Throwable {
        b bVar = new b(this, this.f31514c);
        this.f31517f = bVar;
        bVar.a(this.f31518g);
        this.f31517f.a(str);
        a(str, 2);
    }

    public void d(String str) throws Throwable {
        if (!TextUtils.isEmpty(str)) {
            c(str);
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f31518g;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f31514c, "bid  token is null or empty");
        }
    }

    public void f(int i10) {
        if (i10 == 1) {
            this.A = false;
        } else if (i10 == 2) {
            this.B = false;
        } else if (i10 == 3) {
            this.C = false;
        }
        h();
    }

    private void h() {
        com.mbridge.msdk.advanced.manager.c cVar = this.f31516e;
        if (cVar != null) {
            cVar.e();
        }
    }

    public void a(boolean z10) {
        this.f31523m = z10;
    }

    public boolean b(String str) {
        return (this.f31536z == null || com.mbridge.msdk.advanced.manager.d.a(this.f31520i, this.f31513b, this.f31512a, str, this.f31525o, false, true) == null) ? false : true;
    }

    private void a(JSONObject jSONObject) {
        if (this.f31535y) {
            this.f31534x = jSONObject;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f31521j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f31521j, "setStyleList", "", jSONObject);
        }
    }

    public void b(int i10) {
        this.f31526p = true;
        a(i10);
    }

    private void c(int i10) {
        if (this.f31528r) {
            this.f31527q = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f31521j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f31521j, "setVolume", CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i10));
        }
    }

    public void d(int i10) {
        this.f31528r = true;
        c(i10);
    }

    public void b(int i10, int i11) {
        a(i10, i11);
    }

    public String e() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f31516e;
            if (cVar != null) {
                return cVar.c();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f31515d;
        if (bVar != null) {
            return bVar.d();
        }
        return "";
    }

    public void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (this.l == null) {
                this.l = i.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f31512a);
            }
            this.f31519h = new d(this, this.f31518g, campaignEx);
            q0.a(G, "show start");
            if (this.f31531u != 0 && this.f31532v != 0) {
                a(campaignEx, false);
                return;
            }
            d dVar = this.f31519h;
            if (dVar != null) {
                dVar.a(this.f31514c, "width or height is 0  or width or height is too small");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.A && this.B && this.C) {
            CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f31520i, this.f31513b, this.f31512a, "", this.f31525o, true, true);
            com.mbridge.msdk.advanced.manager.c cVar = this.f31516e;
            if (cVar != null) {
                cVar.f();
            }
            b(campaignExA);
        }
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f31518g = nativeAdvancedAdListener;
    }

    private void a(int i10) {
        if (this.f31526p) {
            this.f31525o = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f31521j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            int i11 = this.f31525o;
            if (i11 == 1) {
                this.f31516e.a(true);
                com.mbridge.msdk.advanced.signal.a.a(this.f31521j, "showCloseButton", "", null);
            } else if (i11 == 0) {
                this.f31516e.a(false);
                com.mbridge.msdk.advanced.signal.a.a(this.f31521j, "hideCloseButton", "", null);
            }
        }
    }

    public String c() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f31516e;
            if (cVar != null) {
                return cVar.a();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f31515d;
        if (bVar != null) {
            return bVar.c();
        }
        return "";
    }

    public void b() {
        if (this.f31518g != null) {
            this.f31518g = null;
        }
        if (this.f31517f != null) {
            this.f31517f = null;
        }
        if (this.f31519h != null) {
            this.f31519h = null;
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f31515d;
        if (bVar != null) {
            bVar.a((MBNativeAdvancedView) null);
            this.f31515d.e();
        }
        com.mbridge.msdk.advanced.manager.c cVar = this.f31516e;
        if (cVar != null) {
            cVar.g();
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f31520i;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.destroy();
        }
        com.mbridge.msdk.advanced.common.c.b(this.f31513b + this.f31512a + e());
        com.mbridge.msdk.advanced.view.a aVar = this.f31522k;
        if (aVar != null) {
            aVar.b();
        }
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f31536z;
        if (mBOutNativeAdvancedViewGroup != null) {
            mBOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.F);
            this.f31536z.removeAllViews();
            this.f31536z = null;
        }
    }

    public void a(CampaignEx campaignEx, boolean z10) {
        j();
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f31536z;
        if (mBOutNativeAdvancedViewGroup == null || mBOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (campaignEx != null && z10) {
            if (this.l == null) {
                this.l = i.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f31512a);
            }
            this.f31519h = new d(this, this.f31518g, campaignEx);
        }
        if (this.f31516e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31513b, this.f31512a);
            this.f31516e = cVar;
            cVar.a(this);
        }
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        if (com.mbridge.msdk.advanced.manager.d.a(this.f31520i, campaignEx, this.f31513b, this.f31512a)) {
            this.f31516e.a(this.f31519h);
            q0.b(G, "start show process");
            this.f31516e.a(campaignEx, this.f31520i, true);
        }
    }

    private void a(String str, int i10) throws Throwable {
        boolean zB;
        this.D = true;
        synchronized (this.f31533w) {
            try {
                if (this.f31523m) {
                    if (this.f31517f != null) {
                        this.f31517f.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                        this.f31523m = true;
                    }
                    return;
                }
                this.f31523m = true;
                if (this.f31531u != 0 && this.f31532v != 0) {
                    if (this.f31520i == null) {
                        if (this.f31517f != null) {
                            this.f31517f.a(new com.mbridge.msdk.foundation.error.b(880030), i10);
                            return;
                        }
                        return;
                    }
                    try {
                        zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                    } catch (Exception e10) {
                        q0.b(G, e10.getMessage());
                        zB = false;
                    }
                    if (!zB) {
                        if (this.f31517f != null) {
                            this.f31517f.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                            return;
                        }
                        return;
                    }
                    this.f31520i.clearResStateAndRemoveClose();
                    m mVarA = i.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f31512a);
                    this.l = mVarA;
                    if (mVarA == null) {
                        this.l = m.k(this.f31512a);
                    }
                    if (this.f31515d == null) {
                        this.f31515d = new com.mbridge.msdk.advanced.manager.b(this.f31513b, this.f31512a, 0L);
                    }
                    b bVar = this.f31517f;
                    if (bVar != null) {
                        bVar.a(str);
                        this.f31515d.a(this.f31517f);
                    }
                    this.f31520i.resetLoadState();
                    this.f31515d.a(this.f31520i);
                    this.f31515d.a(this.l);
                    this.f31515d.a(this.f31531u, this.f31532v);
                    this.f31515d.a(this.f31525o);
                    this.f31515d.b(str, i10);
                    return;
                }
                if (this.f31517f != null) {
                    this.f31517f.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(Activity activity) {
        com.mbridge.msdk.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        Context context;
        if (this.f31516e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31513b, this.f31512a);
            this.f31516e = cVar;
            cVar.a(this);
        }
        if (this.f31521j == null) {
            try {
                this.f31521j = new MBNativeAdvancedWebview(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(G, e10.getMessage());
            }
            if (this.f31522k == null) {
                try {
                    this.f31522k = new com.mbridge.msdk.advanced.view.a(this.f31512a, this.f31516e.b(), this);
                } catch (Exception e11) {
                    q0.b(G, e11.getMessage());
                }
            }
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f31521j;
            if (mBNativeAdvancedWebview != null && (aVar = this.f31522k) != null) {
                mBNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f31520i == null) {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (activity == null) {
                context = activity;
                context = contextD;
            }
            context = activity;
            MBNativeAdvancedView mBNativeAdvancedView = new MBNativeAdvancedView(context);
            this.f31520i = mBNativeAdvancedView;
            mBNativeAdvancedView.setAdvancedNativeWebview(this.f31521j);
            MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f31521j;
            if (mBNativeAdvancedWebview2 != null && mBNativeAdvancedWebview2.getParent() == null) {
                this.f31520i.addView(this.f31521j, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f31536z == null) {
            this.f31536z = new MBOutNativeAdvancedViewGroup(com.mbridge.msdk.foundation.controller.c.n().d());
            if (this.f31531u != 0 && this.f31532v != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f31531u, this.f31532v);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.f31536z.setLayoutParams(layoutParams);
            this.f31536z.setProvider(this);
            this.f31536z.addView(this.f31520i);
            this.f31536z.getViewTreeObserver().addOnScrollChangedListener(this.F);
        }
        if (this.f31524n == null) {
            this.f31524n = new k();
        }
        this.f31524n.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f31512a);
    }

    public String a(String str) {
        com.mbridge.msdk.advanced.manager.b bVar = this.f31515d;
        if (bVar != null) {
            return bVar.a(str);
        }
        return "";
    }

    private void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f31532v = i10;
        this.f31531u = i11;
        this.f31536z.setLayoutParams(new ViewGroup.LayoutParams(i11, i10));
    }
}
