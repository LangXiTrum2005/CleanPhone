package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.measurement.f2;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f38148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.setting.c f38149k;
    protected com.mbridge.msdk.click.a l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f38139a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f38140b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f38141c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f38142d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f38143e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f38144f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f38145g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f38146h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f38147i = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.mbridge.msdk.video.signal.a.InterfaceC0207a f38150m = new C0208a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f38151n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f38152o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdSession f38153p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MediaEvents f38154q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdEvents f38155r = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class C0208a implements com.mbridge.msdk.video.signal.a.InterfaceC0207a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0207a
        public void a(boolean z10) {
            q0.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            q0.a("DefaultJSCommon", "onDownloadProgress,progress:" + i10);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0207a
        public void onInitSuccess() {
            q0.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            q0.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0207a
        public void a(int i10, String str) {
            q0.a("DefaultJSCommon", "onH5Error,code:" + i10 + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0207a
        public void a() {
            q0.a("DefaultJSCommon", "videoLocationReady");
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(boolean z10) {
        q0.a("DefaultJSCommon", "setIsShowingTransparent:" + z10);
        this.f38140b = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(int i10) {
        this.f38141c = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void c(int i10) {
        this.f38143e = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        q0.a("DefaultJSCommon", "click:type" + i10 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d(int i10) {
        q0.a("DefaultJSCommon", "setAlertDialogRole " + i10);
        this.f38146h = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void e(int i10) {
        this.f38142d = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String f(int i10) {
        q0.a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void g(int i10) {
        this.f38151n = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        q0.a("DefaultJSCommon", "handlerH5Exception,code=" + i10 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int i() {
        return this.f38147i;
    }

    public AdEvents j() {
        return this.f38155r;
    }

    public AdSession k() {
        return this.f38153p;
    }

    public int l() {
        if (this.f38141c == 0 && this.f38140b) {
            this.f38141c = 1;
        }
        return this.f38141c;
    }

    public int m() {
        if (this.f38142d == 0 && this.f38140b) {
            this.f38142d = 1;
        }
        return this.f38142d;
    }

    public int n() {
        if (this.f38143e == 0 && this.f38140b) {
            this.f38143e = 1;
        }
        return this.f38143e;
    }

    public MediaEvents o() {
        return this.f38154q;
    }

    public boolean p() {
        return this.f38140b;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void release() {
        q0.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.l;
        if (aVar != null) {
            aVar.a(false);
            this.l.a((NativeListener.NativeTrackingListener) null);
            this.l.c();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        q0.a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdEvents(AdEvents adEvents) {
        this.f38155r = adEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdSession(AdSession adSession) {
        this.f38153p = adSession;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        q0.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f38149k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setUnitId(String str) {
        f2.z("setUnitId:", str, "DefaultJSCommon");
        this.f38148j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f38154q = mediaEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setWebViewFront(int i10) {
        this.f38145g = i10;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b implements com.mbridge.msdk.video.signal.a.InterfaceC0207a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f38156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.a.InterfaceC0207a f38157b;

        public b(com.mbridge.msdk.video.signal.d dVar, com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a) {
            this.f38156a = dVar;
            this.f38157b = interfaceC0207a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0207a
        public void a(boolean z10) {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            if (interfaceC0207a != null) {
                interfaceC0207a.a(z10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            if (interfaceC0207a != null) {
                interfaceC0207a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            if (interfaceC0207a != null) {
                interfaceC0207a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            if (interfaceC0207a != null) {
                interfaceC0207a.onDownloadProgress(i10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            if (interfaceC0207a != null) {
                interfaceC0207a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            if (interfaceC0207a != null) {
                interfaceC0207a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f38156a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0207a
        public void onInitSuccess() {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            if (interfaceC0207a != null) {
                interfaceC0207a.onInitSuccess();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            return interfaceC0207a != null && interfaceC0207a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            if (interfaceC0207a != null) {
                interfaceC0207a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f38156a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            if (interfaceC0207a != null) {
                interfaceC0207a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            if (interfaceC0207a != null) {
                interfaceC0207a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0207a
        public void a(int i10, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            if (interfaceC0207a != null) {
                interfaceC0207a.a(i10, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0207a
        public void a() {
            com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38157b;
            if (interfaceC0207a != null) {
                interfaceC0207a.a();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int b() {
        return this.f38145g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        q0.a("DefaultJSCommon", "init");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String e() {
        q0.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public boolean a() {
        return this.f38139a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(boolean z10) {
        this.f38139a = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int d() {
        q0.a("DefaultJSCommon", "getAlertDialogRole " + this.f38146h);
        return this.f38146h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
        q0.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a) {
        q0.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0207a);
        this.f38150m = interfaceC0207a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10, String str) {
        q0.a("DefaultJSCommon", "statistics,type:" + i10 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10) {
        this.f38147i = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(String str) {
        q0.a("DefaultJSCommon", "setNotchArea");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void h() {
    }
}
