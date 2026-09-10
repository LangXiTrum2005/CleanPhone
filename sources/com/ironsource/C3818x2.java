package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3818x2 extends C3630m3 {
    private static final C3818x2 d = new C3818x2();
    private InterfaceC3843ya b = null;
    private InterfaceC3843ya c = null;

    /* JADX INFO: renamed from: com.ironsource.x2$a */
    public class a implements Runnable {
        final /* synthetic */ AdInfo a;

        public a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3818x2 c3818x2 = C3818x2.this;
            InterfaceC3843ya interfaceC3843ya = c3818x2.b;
            if (interfaceC3843ya != null) {
                interfaceC3843ya.g(c3818x2.a(this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C3818x2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$b */
    public class b implements Runnable {
        final /* synthetic */ AdInfo a;

        public b(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3818x2 c3818x2 = C3818x2.this;
            InterfaceC3843ya interfaceC3843ya = c3818x2.c;
            if (interfaceC3843ya != null) {
                interfaceC3843ya.d(c3818x2.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3818x2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$c */
    public class c implements Runnable {
        final /* synthetic */ AdInfo a;

        public c(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3818x2 c3818x2 = C3818x2.this;
            InterfaceC3843ya interfaceC3843ya = c3818x2.b;
            if (interfaceC3843ya != null) {
                interfaceC3843ya.d(c3818x2.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3818x2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$d */
    public class d implements Runnable {
        final /* synthetic */ AdInfo a;

        public d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3818x2 c3818x2 = C3818x2.this;
            InterfaceC3843ya interfaceC3843ya = c3818x2.c;
            if (interfaceC3843ya != null) {
                interfaceC3843ya.e(c3818x2.a(this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C3818x2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$e */
    public class e implements Runnable {
        final /* synthetic */ AdInfo a;

        public e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3818x2 c3818x2 = C3818x2.this;
            InterfaceC3843ya interfaceC3843ya = c3818x2.b;
            if (interfaceC3843ya != null) {
                interfaceC3843ya.e(c3818x2.a(this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C3818x2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$f */
    public class f implements Runnable {
        final /* synthetic */ IronSourceError a;

        public f(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3843ya interfaceC3843ya = C3818x2.this.c;
            if (interfaceC3843ya != null) {
                interfaceC3843ya.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$g */
    public class g implements Runnable {
        final /* synthetic */ IronSourceError a;

        public g(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3843ya interfaceC3843ya = C3818x2.this.b;
            if (interfaceC3843ya != null) {
                interfaceC3843ya.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$h */
    public class h implements Runnable {
        final /* synthetic */ AdInfo a;

        public h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3818x2 c3818x2 = C3818x2.this;
            InterfaceC3843ya interfaceC3843ya = c3818x2.c;
            if (interfaceC3843ya != null) {
                interfaceC3843ya.h(c3818x2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C3818x2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$i */
    public class i implements Runnable {
        final /* synthetic */ AdInfo a;

        public i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3818x2 c3818x2 = C3818x2.this;
            InterfaceC3843ya interfaceC3843ya = c3818x2.b;
            if (interfaceC3843ya != null) {
                interfaceC3843ya.h(c3818x2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C3818x2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$j */
    public class j implements Runnable {
        final /* synthetic */ AdInfo a;

        public j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3818x2 c3818x2 = C3818x2.this;
            InterfaceC3843ya interfaceC3843ya = c3818x2.c;
            if (interfaceC3843ya != null) {
                interfaceC3843ya.f(c3818x2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C3818x2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$k */
    public class k implements Runnable {
        final /* synthetic */ AdInfo a;

        public k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3818x2 c3818x2 = C3818x2.this;
            InterfaceC3843ya interfaceC3843ya = c3818x2.b;
            if (interfaceC3843ya != null) {
                interfaceC3843ya.f(c3818x2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C3818x2.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$l */
    public class l implements Runnable {
        final /* synthetic */ AdInfo a;

        public l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3818x2 c3818x2 = C3818x2.this;
            InterfaceC3843ya interfaceC3843ya = c3818x2.c;
            if (interfaceC3843ya != null) {
                interfaceC3843ya.g(c3818x2.a(this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C3818x2.this.a(this.a));
            }
        }
    }

    private C3818x2() {
    }

    public static C3818x2 a() {
        return d;
    }

    public void b(InterfaceC3843ya interfaceC3843ya) {
        this.c = interfaceC3843ya;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }

    public void a(InterfaceC3843ya interfaceC3843ya) {
        this.b = interfaceC3843ya;
    }

    public InterfaceC3843ya b() {
        return this.b;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }
}
