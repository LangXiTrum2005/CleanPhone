package com.p004ironsource;

import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;

/* JADX INFO: loaded from: classes5.dex */
public class ah extends v7 {
    private static final ah d = new ah();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LevelPlayInterstitialListener f24343b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LevelPlayInterstitialListener f24344c = null;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f24345a;

        public a(AdInfo adInfo) {
            this.f24345a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24343b != null) {
                ah.this.f24343b.onAdShowSucceeded(ah.this.a(this.f24345a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + ah.this.a(this.f24345a));
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f24347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f24348b;

        public b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f24347a = ironSourceError;
            this.f24348b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24344c != null) {
                ah.this.f24344c.onAdShowFailed(this.f24347a, ah.this.a(this.f24348b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + ah.this.a(this.f24348b) + ", error = " + this.f24347a.getErrorMessage());
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f24350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f24351b;

        public c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f24350a = ironSourceError;
            this.f24351b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24343b != null) {
                ah.this.f24343b.onAdShowFailed(this.f24350a, ah.this.a(this.f24351b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + ah.this.a(this.f24351b) + ", error = " + this.f24350a.getErrorMessage());
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f24353a;

        public d(AdInfo adInfo) {
            this.f24353a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24344c != null) {
                ah.this.f24344c.onAdClicked(ah.this.a(this.f24353a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + ah.this.a(this.f24353a));
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f24355a;

        public e(AdInfo adInfo) {
            this.f24355a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24343b != null) {
                ah.this.f24343b.onAdClicked(ah.this.a(this.f24355a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + ah.this.a(this.f24355a));
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f24357a;

        public f(AdInfo adInfo) {
            this.f24357a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24344c != null) {
                ah.this.f24344c.onAdReady(ah.this.a(this.f24357a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + ah.this.a(this.f24357a));
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f24359a;

        public g(AdInfo adInfo) {
            this.f24359a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24343b != null) {
                ah.this.f24343b.onAdReady(ah.this.a(this.f24359a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + ah.this.a(this.f24359a));
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f24361a;

        public h(IronSourceError ironSourceError) {
            this.f24361a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24344c != null) {
                ah.this.f24344c.onAdLoadFailed(this.f24361a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f24361a.getErrorMessage());
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f24363a;

        public i(IronSourceError ironSourceError) {
            this.f24363a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24343b != null) {
                ah.this.f24343b.onAdLoadFailed(this.f24363a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f24363a.getErrorMessage());
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f24365a;

        public j(AdInfo adInfo) {
            this.f24365a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24344c != null) {
                ah.this.f24344c.onAdOpened(ah.this.a(this.f24365a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + ah.this.a(this.f24365a));
            }
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f24367a;

        public k(AdInfo adInfo) {
            this.f24367a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24343b != null) {
                ah.this.f24343b.onAdOpened(ah.this.a(this.f24367a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + ah.this.a(this.f24367a));
            }
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f24369a;

        public l(AdInfo adInfo) {
            this.f24369a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24344c != null) {
                ah.this.f24344c.onAdClosed(ah.this.a(this.f24369a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + ah.this.a(this.f24369a));
            }
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f24371a;

        public m(AdInfo adInfo) {
            this.f24371a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24343b != null) {
                ah.this.f24343b.onAdClosed(ah.this.a(this.f24371a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + ah.this.a(this.f24371a));
            }
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f24373a;

        public n(AdInfo adInfo) {
            this.f24373a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f24344c != null) {
                ah.this.f24344c.onAdShowSucceeded(ah.this.a(this.f24373a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + ah.this.a(this.f24373a));
            }
        }
    }

    private ah() {
    }

    public static synchronized ah a() {
        return d;
    }

    public void c(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable mVar;
        if (this.f24344c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            mVar = new l(adInfo);
        } else {
            if (this.f24343b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            mVar = new m(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(mVar);
    }

    public void d(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable kVar;
        if (this.f24344c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new j(adInfo);
        } else {
            if (this.f24343b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new k(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(kVar);
    }

    public void e(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable gVar;
        if (this.f24344c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new f(adInfo);
        } else {
            if (this.f24343b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new g(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(gVar);
    }

    public void f(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable aVar;
        if (this.f24344c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new n(adInfo);
        } else {
            if (this.f24343b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new a(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(aVar);
    }

    public void b(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable eVar;
        if (this.f24344c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new d(adInfo);
        } else {
            if (this.f24343b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new e(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(eVar);
    }

    public void a(IronSourceError ironSourceError) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable iVar;
        if (this.f24344c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new h(ironSourceError);
        } else {
            if (this.f24343b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new i(ironSourceError);
        }
        ironSourceThreadManager.postOnUiThreadTask(iVar);
    }

    public synchronized void b(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f24344c = levelPlayInterstitialListener;
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable cVar;
        if (this.f24344c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new b(ironSourceError, adInfo);
        } else {
            if (this.f24343b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new c(ironSourceError, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(cVar);
    }

    public synchronized void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f24343b = levelPlayInterstitialListener;
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
