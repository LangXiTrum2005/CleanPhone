package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: renamed from: com.ironsource.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3438b8 extends C3630m3 {
    private static final C3438b8 d = new C3438b8();
    private InterfaceC3459cb b = null;
    private InterfaceC3459cb c = null;

    /* JADX INFO: renamed from: com.ironsource.b8$a */
    public class a implements Runnable {
        final /* synthetic */ AdInfo a;

        public a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3438b8 c3438b8 = C3438b8.this;
            InterfaceC3459cb interfaceC3459cb = c3438b8.b;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.e(c3438b8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C3438b8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$b */
    public class b implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3438b8 c3438b8 = C3438b8.this;
            InterfaceC3459cb interfaceC3459cb = c3438b8.c;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.a(this.a, c3438b8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C3438b8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$c */
    public class c implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3438b8 c3438b8 = C3438b8.this;
            InterfaceC3459cb interfaceC3459cb = c3438b8.b;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.a(this.a, c3438b8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C3438b8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$d */
    public class d implements Runnable {
        final /* synthetic */ AdInfo a;

        public d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3438b8 c3438b8 = C3438b8.this;
            InterfaceC3459cb interfaceC3459cb = c3438b8.c;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.d(c3438b8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3438b8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$e */
    public class e implements Runnable {
        final /* synthetic */ AdInfo a;

        public e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3438b8 c3438b8 = C3438b8.this;
            InterfaceC3459cb interfaceC3459cb = c3438b8.b;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.d(c3438b8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3438b8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$f */
    public class f implements Runnable {
        final /* synthetic */ AdInfo a;

        public f(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3438b8 c3438b8 = C3438b8.this;
            InterfaceC3459cb interfaceC3459cb = c3438b8.c;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.a(c3438b8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C3438b8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$g */
    public class g implements Runnable {
        final /* synthetic */ AdInfo a;

        public g(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3438b8 c3438b8 = C3438b8.this;
            InterfaceC3459cb interfaceC3459cb = c3438b8.b;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.a(c3438b8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C3438b8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$h */
    public class h implements Runnable {
        final /* synthetic */ IronSourceError a;

        public h(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3459cb interfaceC3459cb = C3438b8.this.c;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$i */
    public class i implements Runnable {
        final /* synthetic */ IronSourceError a;

        public i(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3459cb interfaceC3459cb = C3438b8.this.b;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$j */
    public class j implements Runnable {
        final /* synthetic */ AdInfo a;

        public j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3438b8 c3438b8 = C3438b8.this;
            InterfaceC3459cb interfaceC3459cb = c3438b8.c;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.c(c3438b8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C3438b8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$k */
    public class k implements Runnable {
        final /* synthetic */ AdInfo a;

        public k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3438b8 c3438b8 = C3438b8.this;
            InterfaceC3459cb interfaceC3459cb = c3438b8.b;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.c(c3438b8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C3438b8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$l */
    public class l implements Runnable {
        final /* synthetic */ AdInfo a;

        public l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3438b8 c3438b8 = C3438b8.this;
            InterfaceC3459cb interfaceC3459cb = c3438b8.c;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.b(c3438b8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C3438b8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$m */
    public class m implements Runnable {
        final /* synthetic */ AdInfo a;

        public m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3438b8 c3438b8 = C3438b8.this;
            InterfaceC3459cb interfaceC3459cb = c3438b8.b;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.b(c3438b8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C3438b8.this.a(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$n */
    public class n implements Runnable {
        final /* synthetic */ AdInfo a;

        public n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3438b8 c3438b8 = C3438b8.this;
            InterfaceC3459cb interfaceC3459cb = c3438b8.c;
            if (interfaceC3459cb != null) {
                interfaceC3459cb.e(c3438b8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C3438b8.this.a(this.a));
            }
        }
    }

    private C3438b8() {
    }

    public static synchronized C3438b8 a() {
        return d;
    }

    public synchronized void b(InterfaceC3459cb interfaceC3459cb) {
        this.c = interfaceC3459cb;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public synchronized void a(InterfaceC3459cb interfaceC3459cb) {
        this.b = interfaceC3459cb;
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
