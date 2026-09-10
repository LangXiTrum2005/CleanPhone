package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ya implements InterfaceC0351g6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f28003o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f28004p = "Fullscreen Ad Internal";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LevelPlay.AdFormat f28005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f28007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0506p0 f28008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0333f6 f28009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Z0 f28010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0667y0 f28011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final I7 f28012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0510p4 f28013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wj.d f28014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Za f28015k;
    private final UUID l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InterfaceC0530q6 f28016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C0350g5 f28017n;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final boolean a(String placementName, LevelPlay.AdFormat adFormat) {
            kotlin.jvm.internal.n.f(placementName, "placementName");
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            C0506p0 c0506p0A = C0506p0.a.a(com.unity3d.mediation.a.a(adFormat), F0.b.MEDIATION);
            if (!c0506p0A.f()) {
                c0506p0A.d().a().a(placementName, Y0.f27951b, false);
                return false;
            }
            G3 g3A = Kb.f26413u.d().p().a(placementName, adFormat);
            boolean zD = g3A.d();
            c0506p0A.d().a().a(placementName, g3A.e(), zD);
            return zD;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        Double getBidFloor();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0506p0 f28018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0333f6 f28019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final I7 f28020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC0510p4 f28021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C0638w7 f28022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f28023f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Z0 f28024g;

        public c(C0506p0 adTools, C0333f6 adControllerFactory, I7 provider, InterfaceC0510p4 currentTimeProvider, C0638w7 idFactory, b config, Z0 adUnitValidator) {
            kotlin.jvm.internal.n.f(adTools, "adTools");
            kotlin.jvm.internal.n.f(adControllerFactory, "adControllerFactory");
            kotlin.jvm.internal.n.f(provider, "provider");
            kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
            kotlin.jvm.internal.n.f(idFactory, "idFactory");
            kotlin.jvm.internal.n.f(config, "config");
            kotlin.jvm.internal.n.f(adUnitValidator, "adUnitValidator");
            this.f28018a = adTools;
            this.f28019b = adControllerFactory;
            this.f28020c = provider;
            this.f28021d = currentTimeProvider;
            this.f28022e = idFactory;
            this.f28023f = config;
            this.f28024g = adUnitValidator;
        }

        public final C0333f6 a() {
            return this.f28019b;
        }

        public final C0506p0 b() {
            return this.f28018a;
        }

        public final Z0 c() {
            return this.f28024g;
        }

        public final b d() {
            return this.f28023f;
        }

        public final InterfaceC0510p4 e() {
            return this.f28021d;
        }

        public final C0638w7 f() {
            return this.f28022e;
        }

        public final I7 g() {
            return this.f28020c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d extends kotlin.jvm.internal.o implements jk.a {
        public d() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0315e6 invoke() {
            return Ya.this.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class e implements InterfaceC0565s6 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0363h0 f28027b;

        public e(C0363h0 c0363h0) {
            this.f28027b = c0363h0;
        }

        @Override // com.ironsource.InterfaceC0565s6
        public C0547r6 a(boolean z10, InterfaceC0601u6 listener) {
            kotlin.jvm.internal.n.f(listener, "listener");
            AbstractC0649x0 abstractC0649x0A = Ya.this.g().a(z10, this.f28027b);
            return new C0547r6(Kb.f26413u.c(), new V0(Ya.this.f(), abstractC0649x0A, F0.b.MEDIATION), abstractC0649x0A, listener, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
        }
    }

    public Ya(LevelPlay.AdFormat adFormat, String adUnitId, b config, C0506p0 adTools, C0333f6 fullscreenAdControllerFactory, Z0 adUnitValidator, InterfaceC0667y0 adUnitDataFactory, I7 mediationServicesProvider, InterfaceC0510p4 currentTimeProvider, C0638w7 idFactory) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        kotlin.jvm.internal.n.f(adUnitValidator, "adUnitValidator");
        kotlin.jvm.internal.n.f(adUnitDataFactory, "adUnitDataFactory");
        kotlin.jvm.internal.n.f(mediationServicesProvider, "mediationServicesProvider");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(idFactory, "idFactory");
        this.f28005a = adFormat;
        this.f28006b = adUnitId;
        this.f28007c = config;
        this.f28008d = adTools;
        this.f28009e = fullscreenAdControllerFactory;
        this.f28010f = adUnitValidator;
        this.f28011g = adUnitDataFactory;
        this.f28012h = mediationServicesProvider;
        this.f28013i = currentTimeProvider;
        this.f28014j = r9.b.u(new d());
        UUID uuidA = idFactory.a();
        this.l = uuidA;
        this.f28016m = new C0369h6(this, null, 2, 0 == true ? 1 : 0);
        adTools.d().a(new C0469n(com.unity3d.mediation.a.a(adFormat), uuidA, adUnitId));
        p();
    }

    public final C0315e6 c() {
        return (C0315e6) this.f28014j.getValue();
    }

    public final LevelPlay.AdFormat d() {
        return this.f28005a;
    }

    @Override // com.ironsource.InterfaceC0351g6
    public void onAdClicked() {
        this.f28008d.c(new fi(this, 0));
    }

    @Override // com.ironsource.InterfaceC0351g6
    public void onAdClosed() {
        this.f28008d.c(new fi(this, 4));
    }

    @Override // com.ironsource.InterfaceC0351g6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f28008d.c(new di(this, adInfo, 3));
    }

    @Override // com.ironsource.InterfaceC0351g6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f28008d.c(new di(this, adInfo, 2));
    }

    @Override // com.ironsource.InterfaceC0351g6
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f28008d.c(new ei(this, error, 1));
    }

    @Override // com.ironsource.InterfaceC0351g6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f28008d.c(new di(this, adInfo, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ya this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f28008d.d().f().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ya this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f28008d.d().f().a();
        this$0.f28016m.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ya this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        this$0.f28016m.onAdLoaded(adInfo);
    }

    private final void p() {
        Double bidFloor = this.f28007c.getBidFloor();
        if (bidFloor != null) {
            this.f28008d.d().f().a(bidFloor.doubleValue());
        }
    }

    public final void a(Za za2) {
        this.f28015k = za2;
    }

    public final UUID e() {
        return this.l;
    }

    public final C0506p0 f() {
        return this.f28008d;
    }

    public final InterfaceC0667y0 g() {
        return this.f28011g;
    }

    public final String h() {
        return this.f28006b;
    }

    public final b i() {
        return this.f28007c;
    }

    public final InterfaceC0510p4 j() {
        return this.f28013i;
    }

    public final Za k() {
        return this.f28015k;
    }

    public final I7 l() {
        return this.f28012h;
    }

    public final boolean m() {
        InterfaceC0416k0 interfaceC0416k0C = this.f28016m.c();
        this.f28008d.d().e().a(Boolean.valueOf(interfaceC0416k0C.a()), interfaceC0416k0C instanceof InterfaceC0416k0.a ? ((InterfaceC0416k0.a) interfaceC0416k0C).c() : null);
        return interfaceC0416k0C.a();
    }

    public final void n() {
        if (this.f28008d.f()) {
            this.f28017n = new C0350g5();
            this.f28008d.c(new fi(this, 2));
        } else {
            this.f28008d.c(new fi(this, 1));
            String string = this.l.toString();
            kotlin.jvm.internal.n.e(string, "adId.toString()");
            a(this, new LevelPlayAdError(string, this.f28006b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
        }
    }

    public final void o() {
        a(new C0476n6(this, this.f28013i));
        c().m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ya this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        this$0.f28016m.onAdDisplayed(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ya this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f28016m.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Ya this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f28016m.onAdClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Ya this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f28016m.a();
    }

    public final void a(InterfaceC0530q6 state) {
        kotlin.jvm.internal.n.f(state, "state");
        this.f28016m = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ya this$0, LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        this$0.f28016m.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ya this$0, LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        this$0.f28016m.onAdLoadFailed(error);
    }

    public final void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f28008d.c(new ph(activity, this, str, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, Ya this$0, String str) {
        kotlin.jvm.internal.n.f(activity, "$activity");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        this$0.f28008d.d().h().d();
        this$0.f28016m.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ya this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        this$0.f28016m.onAdInfoChanged(adInfo);
    }

    public final void b(String message) {
        kotlin.jvm.internal.n.f(message, "message");
        this.f28008d.d().h().f("Fullscreen Ad Internal - ".concat(message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0315e6 b() {
        C0358gd c0358gd = null;
        C0363h0 c0363h0 = new C0363h0(com.unity3d.mediation.a.a(this.f28005a), this.l, this.f28006b, c0358gd, this.f28012h.A().a(), this.f28007c.getBidFloor(), 8, null);
        e eVar = new e(c0363h0);
        C0690z5 c0690z5D = this.f28008d.d();
        C0506p0 c0506p0 = this.f28008d;
        c0690z5D.a(new D0(c0506p0, c0363h0, c0506p0.b(this.f28005a, this.f28006b).b().b()));
        return this.f28009e.a(this, this.f28008d, c0363h0, eVar);
    }

    public final void a(C0369h6.a status) {
        kotlin.jvm.internal.n.f(status, "status");
        this.f28016m = new C0369h6(this, status);
    }

    @Override // com.ironsource.InterfaceC0351g6
    public void a(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f28008d.c(new ei(this, error, 0));
    }

    @Override // com.ironsource.InterfaceC0351g6
    public void a() {
        this.f28008d.c(new fi(this, 3));
    }

    @Override // com.ironsource.InterfaceC0351g6
    public void a(LevelPlayReward reward) {
        kotlin.jvm.internal.n.f(reward, "reward");
        IronLog.INTERNAL.verbose(C0506p0.a(this.f28008d, "onAdRewarded state.getAdInfo: " + this.f28016m.b() + " reward: " + reward, (String) null, 2, (Object) null));
        this.f28008d.c(new ki(14, this, reward));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, LevelPlayReward reward) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(reward, "$reward");
        LevelPlayAdInfo levelPlayAdInfoB = this$0.f28016m.b();
        IronLog.INTERNAL.verbose(C0506p0.a(this$0.f28008d, "onAdRewarded adInfo: " + levelPlayAdInfoB + " reward: " + reward, (String) null, 2, (Object) null));
        this$0.f28008d.d(new ph(this$0, reward, levelPlayAdInfoB, 10));
    }

    public /* synthetic */ Ya(LevelPlay.AdFormat adFormat, String str, b bVar, C0506p0 c0506p0, C0333f6 c0333f6, Z0 z10, InterfaceC0667y0 interfaceC0667y0, I7 i10, InterfaceC0510p4 interfaceC0510p4, C0638w7 c0638w7, int i11, kotlin.jvm.internal.g gVar) {
        this(adFormat, str, bVar, c0506p0, c0333f6, z10, interfaceC0667y0, (i11 & 128) != 0 ? Kb.f26413u.d() : i10, interfaceC0510p4, c0638w7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, LevelPlayReward reward, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(reward, "$reward");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        Za za2 = this$0.f28015k;
        if (za2 != null) {
            za2.onAdRewarded(reward, adInfo);
        }
    }

    public final void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C0506p0.a(this.f28008d, "onAdLoaded adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.f28008d.c(new com.facebook.appevents.internal.a(this, C0350g5.a(this.f28017n)));
        this.f28008d.d(new di(this, adInfo, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, long j10) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f28008d.d().f().a(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        Za za2 = this$0.f28015k;
        if (za2 != null) {
            za2.onAdLoaded(adInfo);
        }
    }

    public static /* synthetic */ void a(Ya ya2, LevelPlayAdError levelPlayAdError, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ya2.a(levelPlayAdError, j10);
    }

    public final void a(LevelPlayAdError levelPlayAdError, long j10) {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f28008d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.f28008d.c(new cj.l(this, j10, levelPlayAdError, 3));
        this.f28008d.d(new ei(this, levelPlayAdError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, long j10, LevelPlayAdError levelPlayAdError) {
        String errorMessage;
        kotlin.jvm.internal.n.f(this$0, "this$0");
        Tc tcF = this$0.f28008d.d().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (errorMessage = levelPlayAdError.getErrorMessage()) == null) {
            errorMessage = "";
        }
        tcF.a(j10, errorCode, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, Ya this$0) {
        Za za2;
        kotlin.jvm.internal.n.f(this$0, "this$0");
        if (levelPlayAdError == null || (za2 = this$0.f28015k) == null) {
            return;
        }
        za2.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(error, "error");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C0506p0.a(this.f28008d, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.f28008d.c(new ei(this, error, 3));
        this.f28008d.d(new ph(this, error, adInfo, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        this$0.f28008d.d().h().a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        Za za2 = this$0.f28015k;
        if (za2 != null) {
            za2.onAdDisplayFailed(error, adInfo);
        }
    }

    public final LevelPlayReward a(String str) {
        O7 o7C = this.f28012h.C();
        I8 i8F = this.f28012h.f();
        Tc tcF = this.f28008d.d().f();
        X0 x0A = this.f28010f.a(this.f28006b, this.f28005a, i8F);
        if (x0A instanceof X0.a) {
            X0.a aVar = (X0.a) x0A;
            IronLog.INTERNAL.warning(C0506p0.a(this.f28008d, defpackage.e.n("getReward() returned a default reward. Reason: ", aVar.b()), (String) null, 2, (Object) null));
            LevelPlayReward levelPlayReward = new LevelPlayReward("", 0);
            tcF.a(levelPlayReward, str, aVar.b());
            return levelPlayReward;
        }
        LevelPlayReward levelPlayRewardA = o7C.a(str, this.f28006b);
        Tc.a(tcF, levelPlayRewardA, str, null, 4, null);
        return levelPlayRewardA;
    }
}
