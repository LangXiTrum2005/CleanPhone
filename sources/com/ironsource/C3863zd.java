package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: renamed from: com.ironsource.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3863zd extends C3630m3 {
    private static final C3863zd d = new C3863zd();
    private InterfaceC3656nb b = null;
    private InterfaceC3656nb c = null;

    /* JADX INFO: renamed from: com.ironsource.zd$a */
    public class a implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        public a(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.b;
            if (interfaceC3656nb != null) {
                if (!this.a) {
                    ((InterfaceC3674ob) interfaceC3656nb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC3674ob) interfaceC3656nb).d(c3863zd.a(this.b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + C3863zd.this.a(this.b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$b */
    public class b implements Runnable {
        final /* synthetic */ C3461cd a;
        final /* synthetic */ AdInfo b;

        public b(C3461cd c3461cd, AdInfo adInfo) {
            this.a = c3461cd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.c;
            if (interfaceC3656nb != null) {
                interfaceC3656nb.b(this.a, c3863zd.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + C3863zd.this.a(this.b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$c */
    public class c implements Runnable {
        final /* synthetic */ C3461cd a;
        final /* synthetic */ AdInfo b;

        public c(C3461cd c3461cd, AdInfo adInfo) {
            this.a = c3461cd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.b;
            if (interfaceC3656nb != null) {
                interfaceC3656nb.b(this.a, c3863zd.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + C3863zd.this.a(this.b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$d */
    public class d implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.c;
            if (interfaceC3656nb != null) {
                interfaceC3656nb.a(this.a, c3863zd.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C3863zd.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$e */
    public class e implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.b;
            if (interfaceC3656nb != null) {
                interfaceC3656nb.a(this.a, c3863zd.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C3863zd.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$f */
    public class f implements Runnable {
        final /* synthetic */ C3461cd a;
        final /* synthetic */ AdInfo b;

        public f(C3461cd c3461cd, AdInfo adInfo) {
            this.a = c3461cd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.c;
            if (interfaceC3656nb != null) {
                interfaceC3656nb.a(this.a, c3863zd.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + C3863zd.this.a(this.b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$g */
    public class g implements Runnable {
        final /* synthetic */ C3461cd a;
        final /* synthetic */ AdInfo b;

        public g(C3461cd c3461cd, AdInfo adInfo) {
            this.a = c3461cd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.b;
            if (interfaceC3656nb != null) {
                interfaceC3656nb.a(this.a, c3863zd.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + C3863zd.this.a(this.b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$h */
    public class h implements Runnable {
        final /* synthetic */ AdInfo a;

        public h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.c;
            if (interfaceC3656nb != null) {
                ((InterfaceC3692pb) interfaceC3656nb).a(c3863zd.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C3863zd.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$i */
    public class i implements Runnable {
        final /* synthetic */ AdInfo a;

        public i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.b;
            if (interfaceC3656nb != null) {
                ((InterfaceC3692pb) interfaceC3656nb).a(c3863zd.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C3863zd.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$j */
    public class j implements Runnable {
        final /* synthetic */ IronSourceError a;

        public j(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3656nb interfaceC3656nb = C3863zd.this.c;
            if (interfaceC3656nb != null) {
                ((InterfaceC3692pb) interfaceC3656nb).b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$k */
    public class k implements Runnable {
        final /* synthetic */ IronSourceError a;

        public k(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3656nb interfaceC3656nb = C3863zd.this.b;
            if (interfaceC3656nb != null) {
                ((InterfaceC3692pb) interfaceC3656nb).b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$l */
    public class l implements Runnable {
        final /* synthetic */ AdInfo a;

        public l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.c;
            if (interfaceC3656nb != null) {
                interfaceC3656nb.c(c3863zd.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C3863zd.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$m */
    public class m implements Runnable {
        final /* synthetic */ AdInfo a;

        public m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.b;
            if (interfaceC3656nb != null) {
                interfaceC3656nb.c(c3863zd.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C3863zd.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$n */
    public class n implements Runnable {
        final /* synthetic */ AdInfo a;

        public n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.c;
            if (interfaceC3656nb != null) {
                interfaceC3656nb.b(c3863zd.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C3863zd.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$o */
    public class o implements Runnable {
        final /* synthetic */ AdInfo a;

        public o(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.b;
            if (interfaceC3656nb != null) {
                interfaceC3656nb.b(c3863zd.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C3863zd.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$p */
    public class p implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        public p(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3863zd c3863zd = C3863zd.this;
            InterfaceC3656nb interfaceC3656nb = c3863zd.c;
            if (interfaceC3656nb != null) {
                if (!this.a) {
                    ((InterfaceC3674ob) interfaceC3656nb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC3674ob) interfaceC3656nb).d(c3863zd.a(this.b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + C3863zd.this.a(this.b));
            }
        }
    }

    private C3863zd() {
    }

    public void b() {
    }

    public void c() {
    }

    public static C3863zd a() {
        return d;
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC3656nb interfaceC3656nb = this.b;
        if (interfaceC3656nb == null || !(interfaceC3656nb instanceof InterfaceC3692pb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    public void a(InterfaceC3656nb interfaceC3656nb) {
        this.b = interfaceC3656nb;
    }

    public void b(InterfaceC3656nb interfaceC3656nb) {
        this.c = interfaceC3656nb;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC3656nb interfaceC3656nb = this.b;
        if (interfaceC3656nb == null || !(interfaceC3656nb instanceof InterfaceC3692pb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void b(C3461cd c3461cd, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c3461cd, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c3461cd, adInfo));
        }
    }

    public void a(boolean z, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z, adInfo));
            return;
        }
        InterfaceC3656nb interfaceC3656nb = this.b;
        if (interfaceC3656nb == null || !(interfaceC3656nb instanceof InterfaceC3674ob)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z, adInfo));
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(C3461cd c3461cd, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c3461cd, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c3461cd, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
