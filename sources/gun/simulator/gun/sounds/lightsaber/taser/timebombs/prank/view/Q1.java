package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.internal.network.VungleApiClient;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Q1 implements R1 {
    private static final String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;
    private R1 adLoaderCallback;
    private B1 adState;
    private C4980x2 advertisement;
    private AbstractC3325e9 baseAdLoader;
    private C3967la bidPayload;
    private final Context context;
    private C5115yc0 loadMetric;
    private C4126nJ logEntry;
    private C4664tU placement;
    private WeakReference<Context> playContext;
    private C5115yc0 requestMetric;
    private final C5115yc0 showToValidationMetric;
    private final InterfaceC3069bH signalManager$delegate;
    private final C5115yc0 validationToPresentMetric;
    private final InterfaceC3069bH vungleApiClient$delegate;
    public static final D1 Companion = new D1(null);
    private static final VE json = WD.b(C1.INSTANCE);

    public Q1(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.context = context;
        this.adState = B1.NEW;
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
        this.vungleApiClient$delegate = AbstractC2340Cl.H(enumC4124nH, new O1(context));
        this.showToValidationMetric = new C5115yc0(B30.AD_SHOW_TO_VALIDATION_DURATION_MS);
        this.validationToPresentMetric = new C5115yc0(B30.AD_VALIDATION_TO_PRESENT_DURATION_MS);
        this.signalManager$delegate = AbstractC2340Cl.H(enumC4124nH, new P1(context));
    }

    /* JADX INFO: renamed from: _set_adState_$lambda-1$lambda-0, reason: not valid java name */
    private static final JE m190_set_adState_$lambda1$lambda0(InterfaceC3069bH interfaceC3069bH) {
        return (JE) interfaceC3069bH.getValue();
    }

    public static /* synthetic */ Ei0 canPlayAd$default(Q1 q1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return q1.canPlayAd(z);
    }

    private final L60 getSignalManager() {
        return (L60) this.signalManager$delegate.getValue();
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-2, reason: not valid java name */
    private static final C3080bS m191loadAd$lambda2(InterfaceC3069bH interfaceC3069bH) {
        return (C3080bS) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-3, reason: not valid java name */
    private static final C4893w20 m192loadAd$lambda3(InterfaceC3069bH interfaceC3069bH) {
        return (C4893w20) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-4, reason: not valid java name */
    private static final ZT m193loadAd$lambda4(InterfaceC3069bH interfaceC3069bH) {
        return (ZT) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-5, reason: not valid java name */
    private static final InterfaceC2526Jp m194loadAd$lambda5(InterfaceC3069bH interfaceC3069bH) {
        return (InterfaceC2526Jp) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: onSuccess$lambda-10$lambda-7, reason: not valid java name */
    private static final C4893w20 m195onSuccess$lambda10$lambda7(InterfaceC3069bH interfaceC3069bH) {
        return (C4893w20) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: onSuccess$lambda-10$lambda-8, reason: not valid java name */
    private static final ZT m196onSuccess$lambda10$lambda8(InterfaceC3069bH interfaceC3069bH) {
        return (ZT) interfaceC3069bH.getValue();
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(C4980x2 c4980x2) {
        AbstractC2995aW.q(c4980x2, "advertisement");
    }

    public final Ei0 canPlayAd(boolean z) {
        Ei0 yd;
        C4980x2 c4980x2 = this.advertisement;
        if (c4980x2 == null) {
            yd = new X1("adv is null on onPlay=" + z);
        } else if (c4980x2 == null || !c4980x2.hasExpired()) {
            B1 b1 = this.adState;
            if (b1 == B1.PLAYING) {
                yd = new C2544Kh();
            } else {
                if (b1 == B1.READY) {
                    return null;
                }
                yd = new YD(EnumC4719u30.INVALID_PLAY_PARAMETER, this.adState + " is not READY");
            }
        } else {
            yd = z ? new C4538s1() : new C4450r1("adv has expired on canPlayAd()");
        }
        if (z) {
            yd.setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
        return yd;
    }

    public final void cancelDownload$vungle_ads_release() {
        AbstractC3325e9 abstractC3325e9 = this.baseAdLoader;
        if (abstractC3325e9 != null) {
            abstractC3325e9.cancel();
        }
    }

    public abstract C3105bi0 getAdSizeForAdRequest();

    public final B1 getAdState() {
        return this.adState;
    }

    public final C4980x2 getAdvertisement() {
        return this.advertisement;
    }

    public final C3967la getBidPayload() {
        return this.bidPayload;
    }

    public final Context getContext() {
        return this.context;
    }

    public final C4126nJ getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final C4664tU getPlacement() {
        return this.placement;
    }

    public final C5115yc0 getShowToValidationMetric$vungle_ads_release() {
        return this.showToValidationMetric;
    }

    public final C5115yc0 getValidationToPresentMetric$vungle_ads_release() {
        return this.validationToPresentMetric;
    }

    public final boolean isErrorTerminal$vungle_ads_release(int i) {
        return this.adState == B1.READY && i == 304;
    }

    public abstract boolean isValidAdSize(C3105bi0 c3105bi0);

    public abstract boolean isValidAdTypeForPlacement(C4664tU c4664tU);

    public final void loadAd(String str, String str2, R1 r1) {
        EnumC4719u30 enumC4719u30;
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(r1, "adLoaderCallback");
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, B30.LOAD_AD_API, 0L, this.logEntry, null, 10, null);
        C5115yc0 c5115yc0 = new C5115yc0(B30.AD_LOAD_TO_CALLBACK_ADO_DURATION_MS);
        this.loadMetric = c5115yc0;
        c5115yc0.markStart();
        this.adLoaderCallback = r1;
        if (!C3282di0.Companion.isInitialized()) {
            r1.onFailure(new D30("SDK not initialized").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        C3457fi c3457fi = C3457fi.INSTANCE;
        C4664tU placement = c3457fi.getPlacement(str);
        if (placement != null) {
            this.placement = placement;
            if (!isValidAdTypeForPlacement(placement)) {
                r1.onFailure(new C4752uU(placement.getReferenceId()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
            if ((placement.getHeaderBidding() && (str2 == null || str2.length() == 0)) || (!placement.getHeaderBidding() && str2 != null && str2.length() != 0)) {
                r1.onFailure(new C3595hE(str).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        } else if (c3457fi.configLastValidatedTimestamp() != -1) {
            r1.onFailure(new C4840vU(str).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        } else {
            C4664tU c4664tU = new C4664tU(str, false, (String) null, 6, (AbstractC2471Hm) null);
            this.placement = c4664tU;
            placement = c4664tU;
        }
        C3105bi0 adSizeForAdRequest = getAdSizeForAdRequest();
        if (!isValidAdSize(adSizeForAdRequest)) {
            r1.onFailure(new C3066bE(adSizeForAdRequest != null ? adSizeForAdRequest.toString() : null).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        B1 b1 = this.adState;
        if (b1 != B1.NEW) {
            switch (E1.$EnumSwitchMapping$0[b1.ordinal()]) {
                case 1:
                    throw new RR();
                case 2:
                    enumC4719u30 = EnumC4719u30.AD_IS_LOADING;
                    break;
                case 3:
                    enumC4719u30 = EnumC4719u30.AD_ALREADY_LOADED;
                    break;
                case 4:
                    enumC4719u30 = EnumC4719u30.AD_IS_PLAYING;
                    break;
                case 5:
                    enumC4719u30 = EnumC4719u30.AD_CONSUMED;
                    break;
                case 6:
                    enumC4719u30 = EnumC4719u30.AD_ALREADY_FAILED;
                    break;
                default:
                    throw new C3770jF(7, 0);
            }
            r1.onFailure(new YD(enumC4719u30, this.adState + " state is incorrect for load").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        C5115yc0 c5115yc1 = new C5115yc0(B30.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS);
        this.requestMetric = c5115yc1;
        c5115yc1.markStart();
        if (str2 != null && str2.length() != 0) {
            try {
                VE ve = json;
                this.bidPayload = (C3967la) ve.a(AbstractC3375el.V(ve.b, AbstractC3263dY.d(C3967la.class)), str2);
            } catch (IllegalArgumentException e) {
                r1.onFailure(new S1("Unable to decode payload into BidPayload object. Error: " + e.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } catch (Throwable th) {
                r1.onFailure(new T1(th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        }
        setAdState(B1.LOADING);
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        Context context = this.context;
        EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
        InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(enumC4124nH, new G1(context));
        InterfaceC3069bH interfaceC3069bHH2 = AbstractC2340Cl.H(enumC4124nH, new H1(this.context));
        InterfaceC3069bH interfaceC3069bHH3 = AbstractC2340Cl.H(enumC4124nH, new I1(this.context));
        InterfaceC3069bH interfaceC3069bHH4 = AbstractC2340Cl.H(enumC4124nH, new J1(this.context));
        if (str2 == null || str2.length() == 0) {
            this.baseAdLoader = new C2807Ul(this.context, getVungleApiClient(), m192loadAd$lambda3(interfaceC3069bHH2), m191loadAd$lambda2(interfaceC3069bHH), m194loadAd$lambda5(interfaceC3069bHH4), m193loadAd$lambda4(interfaceC3069bHH3), new F2(placement, null, adSizeForAdRequest));
        } else {
            this.baseAdLoader = new PX(this.context, getVungleApiClient(), m192loadAd$lambda3(interfaceC3069bHH2), m191loadAd$lambda2(interfaceC3069bHH), m194loadAd$lambda5(interfaceC3069bHH4), m193loadAd$lambda4(interfaceC3069bHH3), new F2(placement, this.bidPayload, adSizeForAdRequest));
        }
        AbstractC3325e9 abstractC3325e9 = this.baseAdLoader;
        if (abstractC3325e9 != null) {
            abstractC3325e9.setLogEntry$vungle_ads_release(this.logEntry);
        }
        AbstractC3325e9 abstractC3325e10 = this.baseAdLoader;
        if (abstractC3325e10 != null) {
            abstractC3325e10.loadAd(this);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R1
    public void onFailure(Ei0 ei0) {
        AbstractC2995aW.q(ei0, "error");
        setAdState(B1.ERROR);
        C5115yc0 c5115yc0 = this.loadMetric;
        if (c5115yc0 != null) {
            c5115yc0.setMetricType(B30.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS);
            c5115yc0.markEnd();
            C2961a4.INSTANCE.logMetric$vungle_ads_release(c5115yc0, this.logEntry, String.valueOf(ei0.getCode()));
        }
        R1 r1 = this.adLoaderCallback;
        if (r1 != null) {
            r1.onFailure(ei0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R1
    public void onSuccess(C4980x2 c4980x2) {
        AbstractC2995aW.q(c4980x2, "advertisement");
        this.advertisement = c4980x2;
        setAdState(B1.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(c4980x2);
        R1 r1 = this.adLoaderCallback;
        if (r1 != null) {
            r1.onSuccess(c4980x2);
        }
        C5115yc0 c5115yc0 = this.loadMetric;
        if (c5115yc0 != null) {
            if (!c4980x2.adLoadOptimizationEnabled()) {
                c5115yc0.setMetricType(B30.AD_LOAD_TO_CALLBACK_DURATION_MS);
            }
            c5115yc0.markEnd();
            C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, c5115yc0, this.logEntry, (String) null, 4, (Object) null);
        }
        C5115yc0 c5115yc1 = this.requestMetric;
        if (c5115yc1 != null) {
            if (!c4980x2.adLoadOptimizationEnabled()) {
                c5115yc1.setMetricType(B30.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            c5115yc1.markEnd();
            C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, c5115yc1, this.logEntry, (String) null, 4, (Object) null);
            ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
            Context context = this.context;
            EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
            InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(enumC4124nH, new K1(context));
            InterfaceC3069bH interfaceC3069bHH2 = AbstractC2340Cl.H(enumC4124nH, new L1(this.context));
            List tpatUrls$default = C4980x2.getTpatUrls$default(c4980x2, C2390Ej.AD_LOAD_DURATION, String.valueOf(c5115yc1.getValue()), null, 4, null);
            if (tpatUrls$default != null) {
                new C3624hd0(getVungleApiClient(), this.logEntry, m195onSuccess$lambda10$lambda7(interfaceC3069bHH).getIoExecutor(), m196onSuccess$lambda10$lambda8(interfaceC3069bHH2), getSignalManager()).sendTpats(tpatUrls$default, m195onSuccess$lambda10$lambda7(interfaceC3069bHH).getJobExecutor());
            }
        }
    }

    public final void play(Context context, InterfaceC5156z2 interfaceC5156z2) {
        AbstractC2995aW.q(interfaceC5156z2, "adPlayCallback");
        this.showToValidationMetric.markStart();
        this.playContext = context != null ? new WeakReference<>(context) : null;
        Ei0 ei0CanPlayAd = canPlayAd(true);
        if (ei0CanPlayAd != null) {
            interfaceC5156z2.onFailure(ei0CanPlayAd);
            if (isErrorTerminal$vungle_ads_release(ei0CanPlayAd.getCode())) {
                setAdState(B1.ERROR);
                return;
            }
            return;
        }
        C4980x2 c4980x2 = this.advertisement;
        if (c4980x2 == null) {
            return;
        }
        M1 m1 = new M1(interfaceC5156z2, this);
        cancelDownload$vungle_ads_release();
        renderAd$vungle_ads_release(m1, c4980x2);
    }

    public void renderAd$vungle_ads_release(InterfaceC5156z2 interfaceC5156z2, C4980x2 c4980x2) {
        Context context;
        AbstractC2995aW.q(c4980x2, "advertisement");
        B0 b0 = J0.Companion;
        b0.setEventListener$vungle_ads_release(new N1(interfaceC5156z2, this.placement));
        b0.setAdvertisement$vungle_ads_release(c4980x2);
        b0.setBidPayload$vungle_ads_release(this.bidPayload);
        WeakReference<Context> weakReference = this.playContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = this.context;
        }
        AbstractC2995aW.p(context, "playContext?.get() ?: context");
        C4664tU c4664tU = this.placement;
        if (c4664tU == null) {
            return;
        }
        Intent intentCreateIntent = b0.createIntent(context, c4664tU.getReferenceId(), c4980x2.eventId());
        C4800v0 c4800v0 = C5064y0.Companion;
        if (!c4800v0.isForeground()) {
            C4917wJ.Companion.d(TAG, "The ad activity is in background on play.");
            C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, new C3586h70(B30.VIEW_NOT_VISIBLE_ON_PLAY), this.logEntry, (String) null, 4, (Object) null);
        }
        this.showToValidationMetric.markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.showToValidationMetric, this.logEntry, (String) null, 4, (Object) null);
        this.validationToPresentMetric.markStart();
        c4800v0.startWhenForeground(context, null, intentCreateIntent, null);
    }

    public final void setAdState(B1 b1) {
        C4980x2 c4980x2;
        String strEventId;
        AbstractC2995aW.q(b1, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (b1.isTerminalState() && (c4980x2 = this.advertisement) != null && (strEventId = c4980x2.eventId()) != null) {
            ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
            ((C3636hj0) m190_set_adState_$lambda1$lambda0(AbstractC2340Cl.H(EnumC4124nH.f4736a, new F1(this.context)))).execute(C3889kf.Companion.makeJobInfo(strEventId));
        }
        this.adState = this.adState.transitionTo(b1);
    }

    public final void setAdvertisement(C4980x2 c4980x2) {
        this.advertisement = c4980x2;
    }

    public final void setBidPayload(C3967la c3967la) {
        this.bidPayload = c3967la;
    }

    public final void setLogEntry$vungle_ads_release(C4126nJ c4126nJ) {
        this.logEntry = c4126nJ;
    }

    public final void setPlacement(C4664tU c4664tU) {
        this.placement = c4664tU;
    }
}
