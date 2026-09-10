package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.x2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0651x2 extends C0455m3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0651x2 f30996d = new C0651x2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Ba f30997b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Ba f30998c = null;

    /* JADX INFO: renamed from: com.ironsource.x2$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f30999a;

        public a(AdInfo adInfo) {
            this.f30999a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0651x2 c0651x2 = C0651x2.this;
            Ba ba2 = c0651x2.f30997b;
            if (ba2 != null) {
                ba2.g(c0651x2.a(this.f30999a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C0651x2.this.a(this.f30999a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f31001a;

        public b(AdInfo adInfo) {
            this.f31001a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0651x2 c0651x2 = C0651x2.this;
            Ba ba2 = c0651x2.f30998c;
            if (ba2 != null) {
                ba2.d(c0651x2.a(this.f31001a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C0651x2.this.a(this.f31001a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f31003a;

        public c(AdInfo adInfo) {
            this.f31003a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0651x2 c0651x2 = C0651x2.this;
            Ba ba2 = c0651x2.f30997b;
            if (ba2 != null) {
                ba2.d(c0651x2.a(this.f31003a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C0651x2.this.a(this.f31003a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f31005a;

        public d(AdInfo adInfo) {
            this.f31005a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0651x2 c0651x2 = C0651x2.this;
            Ba ba2 = c0651x2.f30998c;
            if (ba2 != null) {
                ba2.e(c0651x2.a(this.f31005a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C0651x2.this.a(this.f31005a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$e */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f31007a;

        public e(AdInfo adInfo) {
            this.f31007a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0651x2 c0651x2 = C0651x2.this;
            Ba ba2 = c0651x2.f30997b;
            if (ba2 != null) {
                ba2.e(c0651x2.a(this.f31007a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C0651x2.this.a(this.f31007a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$f */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f31009a;

        public f(IronSourceError ironSourceError) {
            this.f31009a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ba ba2 = C0651x2.this.f30998c;
            if (ba2 != null) {
                ba2.b(this.f31009a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f31009a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$g */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f31011a;

        public g(IronSourceError ironSourceError) {
            this.f31011a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ba ba2 = C0651x2.this.f30997b;
            if (ba2 != null) {
                ba2.b(this.f31011a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f31011a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$h */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f31013a;

        public h(AdInfo adInfo) {
            this.f31013a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0651x2 c0651x2 = C0651x2.this;
            Ba ba2 = c0651x2.f30998c;
            if (ba2 != null) {
                ba2.h(c0651x2.a(this.f31013a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C0651x2.this.a(this.f31013a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$i */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f31015a;

        public i(AdInfo adInfo) {
            this.f31015a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0651x2 c0651x2 = C0651x2.this;
            Ba ba2 = c0651x2.f30997b;
            if (ba2 != null) {
                ba2.h(c0651x2.a(this.f31015a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C0651x2.this.a(this.f31015a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$j */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f31017a;

        public j(AdInfo adInfo) {
            this.f31017a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0651x2 c0651x2 = C0651x2.this;
            Ba ba2 = c0651x2.f30998c;
            if (ba2 != null) {
                ba2.f(c0651x2.a(this.f31017a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C0651x2.this.a(this.f31017a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$k */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f31019a;

        public k(AdInfo adInfo) {
            this.f31019a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0651x2 c0651x2 = C0651x2.this;
            Ba ba2 = c0651x2.f30997b;
            if (ba2 != null) {
                ba2.f(c0651x2.a(this.f31019a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C0651x2.this.a(this.f31019a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$l */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f31021a;

        public l(AdInfo adInfo) {
            this.f31021a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0651x2 c0651x2 = C0651x2.this;
            Ba ba2 = c0651x2.f30998c;
            if (ba2 != null) {
                ba2.g(c0651x2.a(this.f31021a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C0651x2.this.a(this.f31021a));
            }
        }
    }

    private C0651x2() {
    }

    public static C0651x2 a() {
        return f30996d;
    }

    public void d(AdInfo adInfo) {
        if (this.f30998c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f30997b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f30998c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f30997b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f30998c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.f30997b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }

    public void a(Ba ba2) {
        this.f30997b = ba2;
    }

    public void b(Ba ba2) {
        this.f30998c = ba2;
    }

    public void c(AdInfo adInfo) {
        if (this.f30998c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f30997b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f30998c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.f30997b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public Ba b() {
        return this.f30997b;
    }

    public void b(AdInfo adInfo) {
        if (this.f30998c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.f30997b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }
}
