package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: renamed from: com.ironsource.d8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0299d8 extends C0455m3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0299d8 f28421d = new C0299d8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0338fb f28422b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0338fb f28423c = null;

    /* JADX INFO: renamed from: com.ironsource.d8$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f28424a;

        public a(AdInfo adInfo) {
            this.f28424a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0299d8 c0299d8 = C0299d8.this;
            InterfaceC0338fb interfaceC0338fb = c0299d8.f28422b;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.e(c0299d8.a(this.f28424a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C0299d8.this.a(this.f28424a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f28426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f28427b;

        public b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f28426a = ironSourceError;
            this.f28427b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0299d8 c0299d8 = C0299d8.this;
            InterfaceC0338fb interfaceC0338fb = c0299d8.f28423c;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.a(this.f28426a, c0299d8.a(this.f28427b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C0299d8.this.a(this.f28427b) + ", error = " + this.f28426a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f28429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f28430b;

        public c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f28429a = ironSourceError;
            this.f28430b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0299d8 c0299d8 = C0299d8.this;
            InterfaceC0338fb interfaceC0338fb = c0299d8.f28422b;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.a(this.f28429a, c0299d8.a(this.f28430b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C0299d8.this.a(this.f28430b) + ", error = " + this.f28429a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f28432a;

        public d(AdInfo adInfo) {
            this.f28432a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0299d8 c0299d8 = C0299d8.this;
            InterfaceC0338fb interfaceC0338fb = c0299d8.f28423c;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.d(c0299d8.a(this.f28432a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C0299d8.this.a(this.f28432a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$e */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f28434a;

        public e(AdInfo adInfo) {
            this.f28434a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0299d8 c0299d8 = C0299d8.this;
            InterfaceC0338fb interfaceC0338fb = c0299d8.f28422b;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.d(c0299d8.a(this.f28434a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C0299d8.this.a(this.f28434a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$f */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f28436a;

        public f(AdInfo adInfo) {
            this.f28436a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0299d8 c0299d8 = C0299d8.this;
            InterfaceC0338fb interfaceC0338fb = c0299d8.f28423c;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.a(c0299d8.a(this.f28436a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C0299d8.this.a(this.f28436a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$g */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f28438a;

        public g(AdInfo adInfo) {
            this.f28438a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0299d8 c0299d8 = C0299d8.this;
            InterfaceC0338fb interfaceC0338fb = c0299d8.f28422b;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.a(c0299d8.a(this.f28438a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C0299d8.this.a(this.f28438a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$h */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f28440a;

        public h(IronSourceError ironSourceError) {
            this.f28440a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0338fb interfaceC0338fb = C0299d8.this.f28423c;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.b(this.f28440a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f28440a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$i */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f28442a;

        public i(IronSourceError ironSourceError) {
            this.f28442a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0338fb interfaceC0338fb = C0299d8.this.f28422b;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.b(this.f28442a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f28442a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$j */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f28444a;

        public j(AdInfo adInfo) {
            this.f28444a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0299d8 c0299d8 = C0299d8.this;
            InterfaceC0338fb interfaceC0338fb = c0299d8.f28423c;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.c(c0299d8.a(this.f28444a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C0299d8.this.a(this.f28444a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$k */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f28446a;

        public k(AdInfo adInfo) {
            this.f28446a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0299d8 c0299d8 = C0299d8.this;
            InterfaceC0338fb interfaceC0338fb = c0299d8.f28422b;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.c(c0299d8.a(this.f28446a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C0299d8.this.a(this.f28446a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$l */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f28448a;

        public l(AdInfo adInfo) {
            this.f28448a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0299d8 c0299d8 = C0299d8.this;
            InterfaceC0338fb interfaceC0338fb = c0299d8.f28423c;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.b(c0299d8.a(this.f28448a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C0299d8.this.a(this.f28448a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$m */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f28450a;

        public m(AdInfo adInfo) {
            this.f28450a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0299d8 c0299d8 = C0299d8.this;
            InterfaceC0338fb interfaceC0338fb = c0299d8.f28422b;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.b(c0299d8.a(this.f28450a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C0299d8.this.a(this.f28450a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$n */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f28452a;

        public n(AdInfo adInfo) {
            this.f28452a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0299d8 c0299d8 = C0299d8.this;
            InterfaceC0338fb interfaceC0338fb = c0299d8.f28423c;
            if (interfaceC0338fb != null) {
                interfaceC0338fb.e(c0299d8.a(this.f28452a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C0299d8.this.a(this.f28452a));
            }
        }
    }

    private C0299d8() {
    }

    public static synchronized C0299d8 a() {
        return f28421d;
    }

    public void d(AdInfo adInfo) {
        if (this.f28423c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f28422b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f28423c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.f28422b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f28423c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f28422b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public synchronized void a(InterfaceC0338fb interfaceC0338fb) {
        this.f28422b = interfaceC0338fb;
    }

    public synchronized void b(InterfaceC0338fb interfaceC0338fb) {
        this.f28423c = interfaceC0338fb;
    }

    public void c(AdInfo adInfo) {
        if (this.f28423c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f28422b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f28423c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.f28422b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.f28423c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f28422b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f28423c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.f28422b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
