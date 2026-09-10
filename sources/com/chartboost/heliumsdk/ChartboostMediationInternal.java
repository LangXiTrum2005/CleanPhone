package com.chartboost.heliumsdk;

import android.app.Activity;
import android.content.Context;
import com.chartboost.heliumsdk.controllers.AdController;
import com.chartboost.heliumsdk.controllers.PartnerController;
import com.chartboost.heliumsdk.controllers.PrivacyController;
import com.chartboost.heliumsdk.domain.GdprConsentStatus;
import com.chartboost.heliumsdk.utils.FullscreenAdShowingState;
import com.chartboost.heliumsdk.utils.LogController;
import com.p004ironsource.d9;
import com.smartdigimkt.f3.b;
import com.thinkup.core.oo.n0;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 t2\u00020\u0001:\u0001tB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J@\u0010W\u001a\u00020X26\u0010Y\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(]\u0012\u0013\u0012\u00110@¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020X0ZH\u0002J\u0015\u0010^\u001a\u0002062\u0006\u0010]\u001a\u00020\fH\u0000¢\u0006\u0002\b7JD\u0010_\u001a\b\u0012\u0004\u0012\u00020X0`2\u0006\u0010]\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\b\u0010a\u001a\u0004\u0018\u00010bH\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\bc\u0010dJ\u0018\u0010e\u001a\u00020X2\u0006\u0010]\u001a\u00020\f2\u0006\u0010?\u001a\u00020@H\u0002J\u0018\u0010f\u001a\u00020X2\u0006\u0010]\u001a\u00020\f2\u0006\u0010?\u001a\u00020@H\u0002J\u0018\u0010g\u001a\u00020X2\u0006\u0010]\u001a\u00020\f2\u0006\u0010?\u001a\u00020@H\u0002J\u0015\u0010h\u001a\u00020X2\u0006\u0010i\u001a\u00020\u001bH\u0000¢\u0006\u0002\bjJ\u0015\u0010k\u001a\u00020X2\u0006\u0010l\u001a\u00020\u001bH\u0000¢\u0006\u0002\bmJ\u0015\u0010n\u001a\u00020X2\u0006\u0010o\u001a\u00020\u001bH\u0000¢\u0006\u0002\bpJ\u0015\u0010q\u001a\u00020X2\u0006\u0010r\u001a\u00020\u001bH\u0000¢\u0006\u0002\bsR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001c\u0010$\u001a\u0004\u0018\u00010\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\u0012\u0010'\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020+X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0012\u00104\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0014\u00105\u001a\u000206X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020<X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010G\"\u0004\bL\u0010IR\u001c\u0010M\u001a\u0004\u0018\u00010\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0014\"\u0004\bO\u0010\u0016R\"\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0QX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006u"}, d2 = {"Lcom/chartboost/heliumsdk/ChartboostMediationInternal;", "", "partnerController", "Lcom/chartboost/heliumsdk/controllers/PartnerController;", "(Lcom/chartboost/heliumsdk/controllers/PartnerController;)V", "adController", "Lcom/chartboost/heliumsdk/controllers/AdController;", "getAdController$Helium_release", "()Lcom/chartboost/heliumsdk/controllers/AdController;", "setAdController$Helium_release", "(Lcom/chartboost/heliumsdk/controllers/AdController;)V", "appContext", "Landroid/content/Context;", "getAppContext$Helium_release", "()Landroid/content/Context;", "setAppContext$Helium_release", "(Landroid/content/Context;)V", b.f35043u, "", "getAppId$Helium_release", "()Ljava/lang/String;", "setAppId$Helium_release", "(Ljava/lang/String;)V", "appSignature", "getAppSignature$Helium_release", "setAppSignature$Helium_release", "ccpaConsentGranted", "", "Ljava/lang/Boolean;", "fullscreenAdShowingState", "Lcom/chartboost/heliumsdk/utils/FullscreenAdShowingState;", "getFullscreenAdShowingState$Helium_release", "()Lcom/chartboost/heliumsdk/utils/FullscreenAdShowingState;", "gameEngineName", "getGameEngineName$Helium_release", "setGameEngineName$Helium_release", "gameEngineVersion", "getGameEngineVersion$Helium_release", "setGameEngineVersion$Helium_release", "gdprApplies", d9.i.a0, "Lcom/chartboost/heliumsdk/domain/GdprConsentStatus;", n0.o.mo, "Lcom/chartboost/heliumsdk/Ilrd;", "getIlrd$Helium_release", "()Lcom/chartboost/heliumsdk/Ilrd;", "initializationStatus", "Lcom/chartboost/heliumsdk/HeliumSdk$ChartboostMediationInitializationStatus;", "getInitializationStatus$Helium_release", "()Lcom/chartboost/heliumsdk/HeliumSdk$ChartboostMediationInitializationStatus;", "setInitializationStatus$Helium_release", "(Lcom/chartboost/heliumsdk/HeliumSdk$ChartboostMediationInitializationStatus;)V", "isSubjectToCoppa", "partnerConsents", "Lcom/chartboost/heliumsdk/PartnerConsents;", "getPartnerConsents$Helium_release", "()Lcom/chartboost/heliumsdk/PartnerConsents;", "getPartnerController$Helium_release", "()Lcom/chartboost/heliumsdk/controllers/PartnerController;", "partnerInitializationResults", "Lcom/chartboost/heliumsdk/PartnerInitializationResults;", "getPartnerInitializationResults$Helium_release", "()Lcom/chartboost/heliumsdk/PartnerInitializationResults;", "privacyController", "Lcom/chartboost/heliumsdk/controllers/PrivacyController;", "getPrivacyController$Helium_release", "()Lcom/chartboost/heliumsdk/controllers/PrivacyController;", "setPrivacyController$Helium_release", "(Lcom/chartboost/heliumsdk/controllers/PrivacyController;)V", "shouldDiscardOversizedAds", "getShouldDiscardOversizedAds$Helium_release", "()Z", "setShouldDiscardOversizedAds$Helium_release", "(Z)V", "testMode", "getTestMode$Helium_release", "setTestMode$Helium_release", "userIdentifier", "getUserIdentifier$Helium_release", "setUserIdentifier$Helium_release", "weakActivityContext", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getWeakActivityContext$Helium_release", "()Ljava/lang/ref/WeakReference;", "setWeakActivityContext$Helium_release", "(Ljava/lang/ref/WeakReference;)V", "checkAndRun", "", "function", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "context", "getPartnerConsents", MobileAdsBridgeBase.initializeMethodName, "Lkotlin/Result;", "options", "Lcom/chartboost/heliumsdk/HeliumInitializationOptions;", "initialize-yxL6bBk$Helium_release", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/chartboost/heliumsdk/HeliumInitializationOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runCcpaConsentTask", "runGdprConsentTask", "runSubjectToCoppaTask", "setCcpaConsent", "hasGivenCcpaConsent", "setCcpaConsent$Helium_release", "setSubjectToCoppa", "isSubject", "setSubjectToCoppa$Helium_release", "setSubjectToGdpr", "isSubjectToGdpr", "setSubjectToGdpr$Helium_release", "setUserHasGivenConsent", "hasGivenGdprConsent", "setUserHasGivenConsent$Helium_release", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChartboostMediationInternal {
    public static final String CHARTBOOST_MEDIATION_INTERNAL_SHARED_PREFS = "CBM_INTERNAL";
    public static final String SERVER_LOG_LEVEL_OVERRIDE = "cbm_internal_server_log_level_override";
    private AdController adController;
    private Context appContext;
    private String appId;
    private String appSignature;
    private Boolean ccpaConsentGranted;
    private final FullscreenAdShowingState fullscreenAdShowingState;
    private String gameEngineName;
    private String gameEngineVersion;
    private Boolean gdprApplies;
    private GdprConsentStatus gdprConsentStatus;
    private final Ilrd ilrd;
    private HeliumSdk.ChartboostMediationInitializationStatus initializationStatus;
    private Boolean isSubjectToCoppa;
    private final PartnerConsents partnerConsents;
    private final PartnerController partnerController;
    private final PartnerInitializationResults partnerInitializationResults;
    private PrivacyController privacyController;
    private boolean shouldDiscardOversizedAds;
    private boolean testMode;
    private String userIdentifier;
    private WeakReference<Activity> weakActivityContext;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GdprConsentStatus.values().length];
            try {
                iArr[GdprConsentStatus.GDPR_CONSENT_GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GdprConsentStatus.GDPR_CONSENT_DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ChartboostMediationInternal() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void checkAndRun(Function2<? super Context, ? super PrivacyController, Unit> function) {
        Context context = this.appContext;
        PrivacyController privacyController = this.privacyController;
        if (context != null && privacyController != null) {
            function.invoke(context, privacyController);
            return;
        }
        LogController.INSTANCE.d("Delaying " + function + " until SDK initialized.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runCcpaConsentTask(Context context, PrivacyController privacyController) {
        Boolean ccpaConsent = this.ccpaConsentGranted;
        if (ccpaConsent == null) {
            ccpaConsent = privacyController.getCcpaConsent();
        }
        privacyController.setCcpaConsent(ccpaConsent);
        this.partnerController.setCcpaConsent(context, ccpaConsent, Intrinsics.a(ccpaConsent, Boolean.TRUE) ? PrivacyController.PrivacyString.GRANTED.getConsentString() : PrivacyController.PrivacyString.DENIED.getConsentString(), this.partnerConsents);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runGdprConsentTask(Context context, PrivacyController privacyController) {
        boolean zBooleanValue;
        int gdpr = privacyController.getGdpr();
        Boolean bool = this.gdprApplies;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (gdpr == PrivacyController.PrivacySetting.TRUE.getValue()) {
            zBooleanValue = true;
        } else if (gdpr != PrivacyController.PrivacySetting.FALSE.getValue()) {
            return;
        } else {
            zBooleanValue = false;
        }
        GdprConsentStatus gdprConsentStatus = this.gdprConsentStatus;
        if (gdprConsentStatus == null) {
            Boolean userConsent = privacyController.getUserConsent();
            if (Intrinsics.a(userConsent, Boolean.TRUE)) {
                gdprConsentStatus = GdprConsentStatus.GDPR_CONSENT_GRANTED;
            } else {
                gdprConsentStatus = Intrinsics.a(userConsent, Boolean.FALSE) ? GdprConsentStatus.GDPR_CONSENT_DENIED : GdprConsentStatus.GDPR_CONSENT_UNKNOWN;
            }
        }
        privacyController.setGdpr((zBooleanValue ? PrivacyController.PrivacySetting.TRUE : PrivacyController.PrivacySetting.FALSE).getValue());
        int i2 = WhenMappings.$EnumSwitchMapping$0[gdprConsentStatus.ordinal()];
        if (i2 == 1) {
            privacyController.setUserConsent(Boolean.TRUE);
        } else if (i2 == 2) {
            privacyController.setUserConsent(Boolean.FALSE);
        }
        this.partnerController.setGdpr(context, Boolean.valueOf(zBooleanValue), gdprConsentStatus, this.partnerConsents);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runSubjectToCoppaTask(Context context, PrivacyController privacyController) {
        Boolean coppa = this.isSubjectToCoppa;
        if (coppa == null) {
            coppa = privacyController.getCoppa();
        }
        if (coppa != null) {
            boolean zBooleanValue = coppa.booleanValue();
            privacyController.setCoppa(coppa);
            this.partnerController.setUserSubjectToCoppa(context, zBooleanValue);
        }
    }

    /* JADX INFO: renamed from: getAdController$Helium_release, reason: from getter */
    public final AdController getAdController() {
        return this.adController;
    }

    /* JADX INFO: renamed from: getAppContext$Helium_release, reason: from getter */
    public final Context getAppContext() {
        return this.appContext;
    }

    /* JADX INFO: renamed from: getAppId$Helium_release, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: getAppSignature$Helium_release, reason: from getter */
    public final String getAppSignature() {
        return this.appSignature;
    }

    /* JADX INFO: renamed from: getFullscreenAdShowingState$Helium_release, reason: from getter */
    public final FullscreenAdShowingState getFullscreenAdShowingState() {
        return this.fullscreenAdShowingState;
    }

    /* JADX INFO: renamed from: getGameEngineName$Helium_release, reason: from getter */
    public final String getGameEngineName() {
        return this.gameEngineName;
    }

    /* JADX INFO: renamed from: getGameEngineVersion$Helium_release, reason: from getter */
    public final String getGameEngineVersion() {
        return this.gameEngineVersion;
    }

    /* JADX INFO: renamed from: getIlrd$Helium_release, reason: from getter */
    public final Ilrd getIlrd() {
        return this.ilrd;
    }

    /* JADX INFO: renamed from: getInitializationStatus$Helium_release, reason: from getter */
    public final HeliumSdk.ChartboostMediationInitializationStatus getInitializationStatus() {
        return this.initializationStatus;
    }

    /* JADX INFO: renamed from: getPartnerConsents$Helium_release, reason: from getter */
    public final PartnerConsents getPartnerConsents() {
        return this.partnerConsents;
    }

    /* JADX INFO: renamed from: getPartnerController$Helium_release, reason: from getter */
    public final PartnerController getPartnerController() {
        return this.partnerController;
    }

    /* JADX INFO: renamed from: getPartnerInitializationResults$Helium_release, reason: from getter */
    public final PartnerInitializationResults getPartnerInitializationResults() {
        return this.partnerInitializationResults;
    }

    /* JADX INFO: renamed from: getPrivacyController$Helium_release, reason: from getter */
    public final PrivacyController getPrivacyController() {
        return this.privacyController;
    }

    /* JADX INFO: renamed from: getShouldDiscardOversizedAds$Helium_release, reason: from getter */
    public final boolean getShouldDiscardOversizedAds() {
        return this.shouldDiscardOversizedAds;
    }

    /* JADX INFO: renamed from: getTestMode$Helium_release, reason: from getter */
    public final boolean getTestMode() {
        return this.testMode;
    }

    /* JADX INFO: renamed from: getUserIdentifier$Helium_release, reason: from getter */
    public final String getUserIdentifier() {
        return this.userIdentifier;
    }

    public final WeakReference<Activity> getWeakActivityContext$Helium_release() {
        return this.weakActivityContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: initialize-yxL6bBk$Helium_release, reason: not valid java name */
    public final Object m160initializeyxL6bBk$Helium_release(Context context, String str, String str2, HeliumInitializationOptions heliumInitializationOptions, Continuation<? super Result<Unit>> continuation) throws Throwable {
        ChartboostMediationInternal$initialize$1 chartboostMediationInternal$initialize$1;
        if (continuation instanceof ChartboostMediationInternal$initialize$1) {
            chartboostMediationInternal$initialize$1 = (ChartboostMediationInternal$initialize$1) continuation;
            int i2 = chartboostMediationInternal$initialize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chartboostMediationInternal$initialize$1.label = i2 - Integer.MIN_VALUE;
            } else {
                chartboostMediationInternal$initialize$1 = new ChartboostMediationInternal$initialize$1(this, continuation);
            }
        } else {
            chartboostMediationInternal$initialize$1 = new ChartboostMediationInternal$initialize$1(this, continuation);
        }
        Object objF = chartboostMediationInternal$initialize$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = chartboostMediationInternal$initialize$1.label;
        if (i3 == 0) {
            ResultKt.b(objF);
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f45042a;
            ChartboostMediationInternal$initialize$2 chartboostMediationInternal$initialize$2 = new ChartboostMediationInternal$initialize$2(context, this, str, str2, heliumInitializationOptions, null);
            chartboostMediationInternal$initialize$1.label = 1;
            objF = BuildersKt.f(mainCoroutineDispatcher, chartboostMediationInternal$initialize$2, chartboostMediationInternal$initialize$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        return ((Result) objF).X;
    }

    public final void setAdController$Helium_release(AdController adController) {
        this.adController = adController;
    }

    public final void setAppContext$Helium_release(Context context) {
        this.appContext = context;
    }

    public final void setAppId$Helium_release(String str) {
        this.appId = str;
    }

    public final void setAppSignature$Helium_release(String str) {
        this.appSignature = str;
    }

    public final void setCcpaConsent$Helium_release(boolean hasGivenCcpaConsent) {
        this.ccpaConsentGranted = Boolean.valueOf(hasGivenCcpaConsent);
        checkAndRun(new ChartboostMediationInternal$setCcpaConsent$1(this));
    }

    public final void setGameEngineName$Helium_release(String str) {
        this.gameEngineName = str;
    }

    public final void setGameEngineVersion$Helium_release(String str) {
        this.gameEngineVersion = str;
    }

    public final void setInitializationStatus$Helium_release(HeliumSdk.ChartboostMediationInitializationStatus chartboostMediationInitializationStatus) {
        Intrinsics.f(chartboostMediationInitializationStatus, "<set-?>");
        this.initializationStatus = chartboostMediationInitializationStatus;
    }

    public final void setPrivacyController$Helium_release(PrivacyController privacyController) {
        this.privacyController = privacyController;
    }

    public final void setShouldDiscardOversizedAds$Helium_release(boolean z2) {
        this.shouldDiscardOversizedAds = z2;
    }

    public final void setSubjectToCoppa$Helium_release(boolean isSubject) {
        this.isSubjectToCoppa = Boolean.valueOf(isSubject);
        checkAndRun(new ChartboostMediationInternal$setSubjectToCoppa$1(this));
    }

    public final void setSubjectToGdpr$Helium_release(boolean isSubjectToGdpr) {
        this.gdprApplies = Boolean.valueOf(isSubjectToGdpr);
        checkAndRun(new ChartboostMediationInternal$setSubjectToGdpr$1(this));
    }

    public final void setTestMode$Helium_release(boolean z2) {
        this.testMode = z2;
    }

    public final void setUserHasGivenConsent$Helium_release(boolean hasGivenGdprConsent) {
        this.gdprConsentStatus = hasGivenGdprConsent ? GdprConsentStatus.GDPR_CONSENT_GRANTED : GdprConsentStatus.GDPR_CONSENT_DENIED;
        checkAndRun(new ChartboostMediationInternal$setUserHasGivenConsent$1(this));
    }

    public final void setUserIdentifier$Helium_release(String str) {
        this.userIdentifier = str;
    }

    public final void setWeakActivityContext$Helium_release(WeakReference<Activity> weakReference) {
        Intrinsics.f(weakReference, "<set-?>");
        this.weakActivityContext = weakReference;
    }

    public ChartboostMediationInternal(PartnerController partnerController) {
        Intrinsics.f(partnerController, "partnerController");
        this.partnerController = partnerController;
        this.weakActivityContext = new WeakReference<>(null);
        this.fullscreenAdShowingState = new FullscreenAdShowingState();
        this.ilrd = new Ilrd();
        this.partnerInitializationResults = new PartnerInitializationResults();
        this.partnerConsents = new PartnerConsents(null, 1, null);
        this.initializationStatus = HeliumSdk.ChartboostMediationInitializationStatus.IDLE;
    }

    public final PartnerConsents getPartnerConsents$Helium_release(Context context) {
        Intrinsics.f(context, "context");
        PrivacyController privacyController = this.privacyController;
        if (privacyController == null) {
            privacyController = new PrivacyController(context, this.partnerConsents);
        }
        privacyController.updatePartnerConsentsFromDisk$Helium_release();
        return this.partnerConsents;
    }

    public /* synthetic */ ChartboostMediationInternal(PartnerController partnerController, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new PartnerController() : partnerController);
    }
}
