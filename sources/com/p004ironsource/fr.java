package com.p004ironsource;

import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;

/* JADX INFO: loaded from: classes5.dex */
public class fr extends v7 {
    private static final fr d = new fr();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LevelPlayRewardedVideoBaseListener f25045b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LevelPlayRewardedVideoBaseListener f25046c = null;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f25047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f25048b;

        public a(boolean z2, AdInfo adInfo) {
            this.f25047a = z2;
            this.f25048b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog ironLog;
            String str;
            if (fr.this.f25045b != null) {
                if (this.f25047a) {
                    ((LevelPlayRewardedVideoListener) fr.this.f25045b).onAdAvailable(fr.this.a(this.f25048b));
                    ironLog = IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + fr.this.a(this.f25048b);
                } else {
                    ((LevelPlayRewardedVideoListener) fr.this.f25045b).onAdUnavailable();
                    ironLog = IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f25050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f25051b;

        public b(Placement placement, AdInfo adInfo) {
            this.f25050a = placement;
            this.f25051b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25046c != null) {
                fr.this.f25046c.onAdRewarded(this.f25050a, fr.this.a(this.f25051b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f25050a + ", adInfo = " + fr.this.a(this.f25051b));
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f25053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f25054b;

        public c(Placement placement, AdInfo adInfo) {
            this.f25053a = placement;
            this.f25054b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25045b != null) {
                fr.this.f25045b.onAdRewarded(this.f25053a, fr.this.a(this.f25054b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f25053a + ", adInfo = " + fr.this.a(this.f25054b));
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f25056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f25057b;

        public d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f25056a = ironSourceError;
            this.f25057b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25046c != null) {
                fr.this.f25046c.onAdShowFailed(this.f25056a, fr.this.a(this.f25057b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + fr.this.a(this.f25057b) + ", error = " + this.f25056a.getErrorMessage());
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f25059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f25060b;

        public e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f25059a = ironSourceError;
            this.f25060b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25045b != null) {
                fr.this.f25045b.onAdShowFailed(this.f25059a, fr.this.a(this.f25060b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + fr.this.a(this.f25060b) + ", error = " + this.f25059a.getErrorMessage());
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f25062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f25063b;

        public f(Placement placement, AdInfo adInfo) {
            this.f25062a = placement;
            this.f25063b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25046c != null) {
                fr.this.f25046c.onAdClicked(this.f25062a, fr.this.a(this.f25063b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f25062a + ", adInfo = " + fr.this.a(this.f25063b));
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f25065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f25066b;

        public g(Placement placement, AdInfo adInfo) {
            this.f25065a = placement;
            this.f25066b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25045b != null) {
                fr.this.f25045b.onAdClicked(this.f25065a, fr.this.a(this.f25066b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f25065a + ", adInfo = " + fr.this.a(this.f25066b));
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f25068a;

        public h(AdInfo adInfo) {
            this.f25068a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25046c != null) {
                ((LevelPlayRewardedVideoManualListener) fr.this.f25046c).onAdReady(fr.this.a(this.f25068a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + fr.this.a(this.f25068a));
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f25070a;

        public i(AdInfo adInfo) {
            this.f25070a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25045b != null) {
                ((LevelPlayRewardedVideoManualListener) fr.this.f25045b).onAdReady(fr.this.a(this.f25070a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + fr.this.a(this.f25070a));
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f25072a;

        public j(IronSourceError ironSourceError) {
            this.f25072a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25046c != null) {
                ((LevelPlayRewardedVideoManualListener) fr.this.f25046c).onAdLoadFailed(this.f25072a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f25072a.getErrorMessage());
            }
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f25074a;

        public k(IronSourceError ironSourceError) {
            this.f25074a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25045b != null) {
                ((LevelPlayRewardedVideoManualListener) fr.this.f25045b).onAdLoadFailed(this.f25074a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f25074a.getErrorMessage());
            }
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f25076a;

        public l(AdInfo adInfo) {
            this.f25076a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25046c != null) {
                fr.this.f25046c.onAdOpened(fr.this.a(this.f25076a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + fr.this.a(this.f25076a));
            }
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f25078a;

        public m(AdInfo adInfo) {
            this.f25078a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25045b != null) {
                fr.this.f25045b.onAdOpened(fr.this.a(this.f25078a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + fr.this.a(this.f25078a));
            }
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f25080a;

        public n(AdInfo adInfo) {
            this.f25080a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25046c != null) {
                fr.this.f25046c.onAdClosed(fr.this.a(this.f25080a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + fr.this.a(this.f25080a));
            }
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f25082a;

        public o(AdInfo adInfo) {
            this.f25082a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fr.this.f25045b != null) {
                fr.this.f25045b.onAdClosed(fr.this.a(this.f25082a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + fr.this.a(this.f25082a));
            }
        }
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f25084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f25085b;

        public p(boolean z2, AdInfo adInfo) {
            this.f25084a = z2;
            this.f25085b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog ironLog;
            String str;
            if (fr.this.f25046c != null) {
                if (this.f25084a) {
                    ((LevelPlayRewardedVideoListener) fr.this.f25046c).onAdAvailable(fr.this.a(this.f25085b));
                    ironLog = IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + fr.this.a(this.f25085b);
                } else {
                    ((LevelPlayRewardedVideoListener) fr.this.f25046c).onAdUnavailable();
                    ironLog = IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    private fr() {
    }

    public static fr a() {
        return d;
    }

    public void c() {
    }

    public void d(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable iVar;
        if (this.f25046c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new h(adInfo);
        } else {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f25045b;
            if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new i(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(iVar);
    }

    public void b() {
    }

    public void c(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable mVar;
        if (this.f25046c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            mVar = new l(adInfo);
        } else {
            if (this.f25045b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            mVar = new m(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(mVar);
    }

    public void a(IronSourceError ironSourceError) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable kVar;
        if (this.f25046c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new j(ironSourceError);
        } else {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f25045b;
            if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new k(ironSourceError);
        }
        ironSourceThreadManager.postOnUiThreadTask(kVar);
    }

    public void b(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable oVar;
        if (this.f25046c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            oVar = new n(adInfo);
        } else {
            if (this.f25045b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            oVar = new o(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(oVar);
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable eVar;
        if (this.f25046c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new d(ironSourceError, adInfo);
        } else {
            if (this.f25045b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new e(ironSourceError, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(eVar);
    }

    public void b(Placement placement, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable cVar;
        if (this.f25046c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new b(placement, adInfo);
        } else {
            if (this.f25045b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new c(placement, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(cVar);
    }

    public void a(Placement placement, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable gVar;
        if (this.f25046c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new f(placement, adInfo);
        } else {
            if (this.f25045b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new g(placement, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(gVar);
    }

    public void b(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.f25046c = levelPlayRewardedVideoBaseListener;
    }

    public void a(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.f25045b = levelPlayRewardedVideoBaseListener;
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public void a(boolean z2, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable aVar;
        if (this.f25046c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new p(z2, adInfo);
        } else {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f25045b;
            if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new a(z2, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(aVar);
    }
}
