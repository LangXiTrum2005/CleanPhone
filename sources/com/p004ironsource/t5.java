package com.p004ironsource;

import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* JADX INFO: loaded from: classes5.dex */
public class t5 extends v7 {
    private static final t5 d = new t5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LevelPlayBannerListener f27247b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LevelPlayBannerListener f27248c = null;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f27249a;

        public a(AdInfo adInfo) {
            this.f27249a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f27247b != null) {
                t5.this.f27247b.onAdLeftApplication(t5.this.a(this.f27249a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + t5.this.a(this.f27249a));
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f27251a;

        public b(AdInfo adInfo) {
            this.f27251a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f27248c != null) {
                t5.this.f27248c.onAdClicked(t5.this.a(this.f27251a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + t5.this.a(this.f27251a));
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f27253a;

        public c(AdInfo adInfo) {
            this.f27253a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f27247b != null) {
                t5.this.f27247b.onAdClicked(t5.this.a(this.f27253a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + t5.this.a(this.f27253a));
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f27255a;

        public d(AdInfo adInfo) {
            this.f27255a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f27248c != null) {
                t5.this.f27248c.onAdLoaded(t5.this.a(this.f27255a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + t5.this.a(this.f27255a));
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f27257a;

        public e(AdInfo adInfo) {
            this.f27257a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f27247b != null) {
                t5.this.f27247b.onAdLoaded(t5.this.a(this.f27257a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + t5.this.a(this.f27257a));
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f27259a;

        public f(IronSourceError ironSourceError) {
            this.f27259a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f27248c != null) {
                t5.this.f27248c.onAdLoadFailed(this.f27259a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f27259a.getErrorMessage());
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f27261a;

        public g(IronSourceError ironSourceError) {
            this.f27261a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f27247b != null) {
                t5.this.f27247b.onAdLoadFailed(this.f27261a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f27261a.getErrorMessage());
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f27263a;

        public h(AdInfo adInfo) {
            this.f27263a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f27248c != null) {
                t5.this.f27248c.onAdScreenPresented(t5.this.a(this.f27263a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + t5.this.a(this.f27263a));
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f27265a;

        public i(AdInfo adInfo) {
            this.f27265a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f27247b != null) {
                t5.this.f27247b.onAdScreenPresented(t5.this.a(this.f27265a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + t5.this.a(this.f27265a));
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f27267a;

        public j(AdInfo adInfo) {
            this.f27267a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f27248c != null) {
                t5.this.f27248c.onAdScreenDismissed(t5.this.a(this.f27267a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + t5.this.a(this.f27267a));
            }
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f27269a;

        public k(AdInfo adInfo) {
            this.f27269a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f27247b != null) {
                t5.this.f27247b.onAdScreenDismissed(t5.this.a(this.f27269a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + t5.this.a(this.f27269a));
            }
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f27271a;

        public l(AdInfo adInfo) {
            this.f27271a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f27248c != null) {
                t5.this.f27248c.onAdLeftApplication(t5.this.a(this.f27271a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + t5.this.a(this.f27271a));
            }
        }
    }

    private t5() {
    }

    public LevelPlayBannerListener b() {
        return this.f27247b;
    }

    public void c(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable aVar;
        if (this.f27248c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new l(adInfo);
        } else {
            if (this.f27247b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new a(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(aVar);
    }

    public void d(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable eVar;
        if (this.f27248c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new d(adInfo);
        } else {
            if (this.f27247b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new e(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(eVar);
    }

    public void e(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable kVar;
        if (this.f27248c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new j(adInfo);
        } else {
            if (this.f27247b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new k(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(kVar);
    }

    public void f(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable iVar;
        if (this.f27248c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new h(adInfo);
        } else {
            if (this.f27247b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new i(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(iVar);
    }

    public static t5 a() {
        return d;
    }

    public void a(IronSourceError ironSourceError) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable gVar;
        if (this.f27248c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new f(ironSourceError);
        } else {
            if (this.f27247b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new g(ironSourceError);
        }
        ironSourceThreadManager.postOnUiThreadTask(gVar);
    }

    public void b(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable cVar;
        if (this.f27248c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new b(adInfo);
        } else {
            if (this.f27247b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new c(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(cVar);
    }

    public void a(LevelPlayBannerListener levelPlayBannerListener) {
        this.f27247b = levelPlayBannerListener;
    }

    public void b(LevelPlayBannerListener levelPlayBannerListener) {
        this.f27248c = levelPlayBannerListener;
    }
}
