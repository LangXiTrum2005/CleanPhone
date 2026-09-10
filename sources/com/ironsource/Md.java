package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Md extends C0455m3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Md f26572d = new Md();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0552rb f26573b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0552rb f26574c = null;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f26575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f26576b;

        public a(boolean z10, AdInfo adInfo) {
            this.f26575a = z10;
            this.f26576b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26573b;
            if (interfaceC0552rb != null) {
                if (!this.f26575a) {
                    ((InterfaceC0570sb) interfaceC0552rb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC0570sb) interfaceC0552rb).d(md2.a(this.f26576b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Md.this.a(this.f26576b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0358gd f26578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f26579b;

        public b(C0358gd c0358gd, AdInfo adInfo) {
            this.f26578a = c0358gd;
            this.f26579b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26574c;
            if (interfaceC0552rb != null) {
                interfaceC0552rb.b(this.f26578a, md2.a(this.f26579b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f26578a + ", adInfo = " + Md.this.a(this.f26579b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0358gd f26581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f26582b;

        public c(C0358gd c0358gd, AdInfo adInfo) {
            this.f26581a = c0358gd;
            this.f26582b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26573b;
            if (interfaceC0552rb != null) {
                interfaceC0552rb.b(this.f26581a, md2.a(this.f26582b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f26581a + ", adInfo = " + Md.this.a(this.f26582b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f26584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f26585b;

        public d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f26584a = ironSourceError;
            this.f26585b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26574c;
            if (interfaceC0552rb != null) {
                interfaceC0552rb.a(this.f26584a, md2.a(this.f26585b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Md.this.a(this.f26585b) + ", error = " + this.f26584a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f26587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f26588b;

        public e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f26587a = ironSourceError;
            this.f26588b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26573b;
            if (interfaceC0552rb != null) {
                interfaceC0552rb.a(this.f26587a, md2.a(this.f26588b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Md.this.a(this.f26588b) + ", error = " + this.f26587a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0358gd f26590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f26591b;

        public f(C0358gd c0358gd, AdInfo adInfo) {
            this.f26590a = c0358gd;
            this.f26591b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26574c;
            if (interfaceC0552rb != null) {
                interfaceC0552rb.a(this.f26590a, md2.a(this.f26591b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f26590a + ", adInfo = " + Md.this.a(this.f26591b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0358gd f26593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f26594b;

        public g(C0358gd c0358gd, AdInfo adInfo) {
            this.f26593a = c0358gd;
            this.f26594b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26573b;
            if (interfaceC0552rb != null) {
                interfaceC0552rb.a(this.f26593a, md2.a(this.f26594b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f26593a + ", adInfo = " + Md.this.a(this.f26594b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f26596a;

        public h(AdInfo adInfo) {
            this.f26596a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26574c;
            if (interfaceC0552rb != null) {
                ((InterfaceC0588tb) interfaceC0552rb).a(md2.a(this.f26596a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Md.this.a(this.f26596a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f26598a;

        public i(AdInfo adInfo) {
            this.f26598a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26573b;
            if (interfaceC0552rb != null) {
                ((InterfaceC0588tb) interfaceC0552rb).a(md2.a(this.f26598a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Md.this.a(this.f26598a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f26600a;

        public j(IronSourceError ironSourceError) {
            this.f26600a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0552rb interfaceC0552rb = Md.this.f26574c;
            if (interfaceC0552rb != null) {
                ((InterfaceC0588tb) interfaceC0552rb).b(this.f26600a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f26600a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f26602a;

        public k(IronSourceError ironSourceError) {
            this.f26602a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0552rb interfaceC0552rb = Md.this.f26573b;
            if (interfaceC0552rb != null) {
                ((InterfaceC0588tb) interfaceC0552rb).b(this.f26602a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f26602a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f26604a;

        public l(AdInfo adInfo) {
            this.f26604a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26574c;
            if (interfaceC0552rb != null) {
                interfaceC0552rb.c(md2.a(this.f26604a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Md.this.a(this.f26604a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f26606a;

        public m(AdInfo adInfo) {
            this.f26606a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26573b;
            if (interfaceC0552rb != null) {
                interfaceC0552rb.c(md2.a(this.f26606a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Md.this.a(this.f26606a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f26608a;

        public n(AdInfo adInfo) {
            this.f26608a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26574c;
            if (interfaceC0552rb != null) {
                interfaceC0552rb.b(md2.a(this.f26608a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Md.this.a(this.f26608a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f26610a;

        public o(AdInfo adInfo) {
            this.f26610a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26573b;
            if (interfaceC0552rb != null) {
                interfaceC0552rb.b(md2.a(this.f26610a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Md.this.a(this.f26610a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f26612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f26613b;

        public p(boolean z10, AdInfo adInfo) {
            this.f26612a = z10;
            this.f26613b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md2 = Md.this;
            InterfaceC0552rb interfaceC0552rb = md2.f26574c;
            if (interfaceC0552rb != null) {
                if (!this.f26612a) {
                    ((InterfaceC0570sb) interfaceC0552rb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC0570sb) interfaceC0552rb).d(md2.a(this.f26613b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Md.this.a(this.f26613b));
            }
        }
    }

    private Md() {
    }

    public static Md a() {
        return f26572d;
    }

    public void b() {
    }

    public void c() {
    }

    public void d(AdInfo adInfo) {
        if (this.f26574c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC0552rb interfaceC0552rb = this.f26573b;
        if (interfaceC0552rb == null || !(interfaceC0552rb instanceof InterfaceC0588tb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    public void a(InterfaceC0552rb interfaceC0552rb) {
        this.f26573b = interfaceC0552rb;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f26574c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC0552rb interfaceC0552rb = this.f26573b;
        if (interfaceC0552rb == null || !(interfaceC0552rb instanceof InterfaceC0588tb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(InterfaceC0552rb interfaceC0552rb) {
        this.f26574c = interfaceC0552rb;
    }

    public void c(AdInfo adInfo) {
        if (this.f26574c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f26573b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.f26574c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f26573b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void a(boolean z10, AdInfo adInfo) {
        if (this.f26574c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z10, adInfo));
            return;
        }
        InterfaceC0552rb interfaceC0552rb = this.f26573b;
        if (interfaceC0552rb == null || !(interfaceC0552rb instanceof InterfaceC0570sb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z10, adInfo));
    }

    public void b(C0358gd c0358gd, AdInfo adInfo) {
        if (this.f26574c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c0358gd, adInfo));
        } else if (this.f26573b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c0358gd, adInfo));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f26574c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.f26573b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(C0358gd c0358gd, AdInfo adInfo) {
        if (this.f26574c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c0358gd, adInfo));
        } else if (this.f26573b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c0358gd, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
