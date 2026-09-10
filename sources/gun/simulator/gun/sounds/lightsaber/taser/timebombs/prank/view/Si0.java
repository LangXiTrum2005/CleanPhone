package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.PermissionChecker;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.VungleAds$WrapperFramework;
import com.vungle.ads.internal.network.VungleApiClient;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class Si0 {
    public static final Hi0 Companion = new Hi0(null);
    private static final String TAG = "VungleInitializer";
    private AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final CopyOnWriteArrayList<InterfaceC3856kD> initializationCallbackArray = new CopyOnWriteArrayList<>();

    private final void configure(Context context, String str) {
        boolean z;
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
        InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(enumC4124nH, new Ii0(context));
        try {
            InterfaceC3069bH interfaceC3069bHH2 = AbstractC2340Cl.H(enumC4124nH, new Ji0(context));
            C3457fi c3457fi = C3457fi.INSTANCE;
            C2622Ni cachedConfig = c3457fi.getCachedConfig(m199configure$lambda5(interfaceC3069bHH2), str);
            if (cachedConfig != null) {
                C3457fi.initWithConfig$vungle_ads_release$default(c3457fi, context, cachedConfig, true, null, 8, null);
                z = true;
            } else {
                z = false;
            }
            C2961a4.INSTANCE.init$vungle_ads_release(m198configure$lambda4(interfaceC3069bHH), ((C4893w20) m200configure$lambda6(AbstractC2340Cl.H(enumC4124nH, new Ki0(context)))).getLoggerExecutor(), c3457fi.getLogLevel(), c3457fi.getMetricsEnabled());
            this.isInitialized.set(true);
            onInitSuccess();
            C4917wJ.Companion.d(TAG, "Running cleanup and resend tpat jobs. " + Thread.currentThread().getId());
            InterfaceC3069bH interfaceC3069bHH3 = AbstractC2340Cl.H(enumC4124nH, new Li0(context));
            ((C3636hj0) m201configure$lambda7(interfaceC3069bHH3)).execute(Cif.makeJobInfo$default(C3889kf.Companion, null, 1, null));
            ((C3636hj0) m201configure$lambda7(interfaceC3069bHH3)).execute(C3440fZ.Companion.makeJobInfo());
            if (z) {
                downloadMraidJs(context);
            } else {
                c3457fi.fetchConfigAsync$vungle_ads_release(context, new Mi0(this, context));
            }
        } catch (Throwable th) {
            C4917wJ.Companion.e(TAG, "Cannot get config", th);
        }
    }

    /* JADX INFO: renamed from: configure$lambda-4, reason: not valid java name */
    private static final VungleApiClient m198configure$lambda4(InterfaceC3069bH interfaceC3069bH) {
        return (VungleApiClient) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: configure$lambda-5, reason: not valid java name */
    private static final C2919Yt m199configure$lambda5(InterfaceC3069bH interfaceC3069bH) {
        return (C2919Yt) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: configure$lambda-6, reason: not valid java name */
    private static final InterfaceC4615ss m200configure$lambda6(InterfaceC3069bH interfaceC3069bH) {
        return (InterfaceC4615ss) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: configure$lambda-7, reason: not valid java name */
    private static final JE m201configure$lambda7(InterfaceC3069bH interfaceC3069bH) {
        return (JE) interfaceC3069bH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadMraidJs(Context context) {
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
        VP.INSTANCE.downloadJs(m203downloadMraidJs$lambda8(AbstractC2340Cl.H(enumC4124nH, new Ni0(context))), m204downloadMraidJs$lambda9(AbstractC2340Cl.H(enumC4124nH, new Oi0(context))), ((C4893w20) m202downloadMraidJs$lambda10(AbstractC2340Cl.H(enumC4124nH, new Pi0(context)))).getBackgroundExecutor(), (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null);
    }

    /* JADX INFO: renamed from: downloadMraidJs$lambda-10, reason: not valid java name */
    private static final InterfaceC4615ss m202downloadMraidJs$lambda10(InterfaceC3069bH interfaceC3069bH) {
        return (InterfaceC4615ss) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: downloadMraidJs$lambda-8, reason: not valid java name */
    private static final ZT m203downloadMraidJs$lambda8(InterfaceC3069bH interfaceC3069bH) {
        return (ZT) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: downloadMraidJs$lambda-9, reason: not valid java name */
    private static final InterfaceC2526Jp m204downloadMraidJs$lambda9(InterfaceC3069bH interfaceC3069bH) {
        return (InterfaceC2526Jp) interfaceC3069bH.getValue();
    }

    private final boolean hasInvalidChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '.') {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    private static final InterfaceC4615ss m205init$lambda0(InterfaceC3069bH interfaceC3069bH) {
        return (InterfaceC4615ss) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
    private static final VungleApiClient m206init$lambda1(InterfaceC3069bH interfaceC3069bH) {
        return (VungleApiClient) interfaceC3069bH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m207init$lambda2(Context context, String str, Si0 si0, InterfaceC3069bH interfaceC3069bH) {
        AbstractC2995aW.q(context, "$context");
        AbstractC2995aW.q(str, "$appId");
        AbstractC2995aW.q(si0, "this$0");
        AbstractC2995aW.q(interfaceC3069bH, "$vungleApiClient$delegate");
        OV.INSTANCE.init(context);
        m206init$lambda1(interfaceC3069bH).initialize(str);
        si0.configure(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-3, reason: not valid java name */
    public static final void m208init$lambda3(Si0 si0) {
        AbstractC2995aW.q(si0, "this$0");
        si0.onInitError(new C3258dT("Config: Out of Memory").logError$vungle_ads_release());
    }

    private final boolean isAppIdInvalid(String str) {
        return AbstractC3089ba0.v0(str) || hasInvalidChar(str);
    }

    private final void onInitError(Ei0 ei0) {
        C3622hc0.INSTANCE.runOnUiThread(new Ff0(11, this, ei0));
        String localizedMessage = ei0.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Exception code is " + ei0.getCode();
        }
        C4917wJ.Companion.e(TAG, localizedMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onInitError$lambda-12, reason: not valid java name */
    public static final void m209onInitError$lambda12(Si0 si0, Ei0 ei0) {
        AbstractC2995aW.q(si0, "this$0");
        AbstractC2995aW.q(ei0, "$exception");
        C4917wJ.Companion.e(TAG, "onError");
        Iterator<T> it = si0.initializationCallbackArray.iterator();
        while (it.hasNext()) {
            ((InterfaceC3856kD) it.next()).onError(ei0);
        }
        si0.initializationCallbackArray.clear();
    }

    private final void onInitSuccess() {
        C4917wJ.Companion.d(TAG, "onSuccess " + Thread.currentThread().getId());
        C3622hc0.INSTANCE.runOnUiThread(new Gi0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onInitSuccess$lambda-14, reason: not valid java name */
    public static final void m210onInitSuccess$lambda14(Si0 si0) {
        AbstractC2995aW.q(si0, "this$0");
        Iterator<T> it = si0.initializationCallbackArray.iterator();
        while (it.hasNext()) {
            ((InterfaceC3856kD) it.next()).onSuccess();
        }
        si0.initializationCallbackArray.clear();
    }

    public final void deInit$vungle_ads_release() {
        C3756j50.Companion.deInit();
        VungleApiClient.Companion.reset$vungle_ads_release();
        this.isInitialized.set(false);
    }

    public final void init(String str, Context context, InterfaceC3856kD interfaceC3856kD) {
        AbstractC2995aW.q(str, "appId");
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(interfaceC3856kD, "initializationCallback");
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, new C3586h70(B30.SDK_INIT_API), (C4126nJ) null, (String) null, 6, (Object) null);
        this.initializationCallbackArray.add(interfaceC3856kD);
        C5064y0.Companion.init(context);
        if (isAppIdInvalid(str)) {
            StringBuilder sbU = AbstractC3950lJ.u("App id invalid: ", str, ", package name: ");
            sbU.append(context.getPackageName());
            onInitError(new ZD(sbU.toString()).logError$vungle_ads_release());
            return;
        }
        if (Build.VERSION.SDK_INT < 25) {
            C4917wJ.Companion.e(TAG, "SDK is supported only for API versions 25 and above.");
            onInitError(new E30("SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
            return;
        }
        C3457fi.INSTANCE.setAppId$vungle_ads_release(str);
        if (this.isInitialized.get()) {
            C4917wJ.Companion.d(TAG, "init already complete");
            onInitSuccess();
        } else {
            if (PermissionChecker.checkCallingOrSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0 || PermissionChecker.checkCallingOrSelfPermission(context, "android.permission.INTERNET") != 0) {
                C4917wJ.Companion.e(TAG, "Network permissions not granted");
                onInitError(new D30("Network permissions not granted").logError$vungle_ads_release());
                return;
            }
            ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
            EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
            ((C4893w20) m205init$lambda0(AbstractC2340Cl.H(enumC4124nH, new Qi0(context)))).getBackgroundExecutor().execute(new RunnableC5099yP(context, str, this, AbstractC2340Cl.H(enumC4124nH, new Ri0(context))), new Gi0(this, 0));
        }
    }

    public final boolean isInitialized() {
        return this.isInitialized.get();
    }

    public final AtomicBoolean isInitialized$vungle_ads_release() {
        return this.isInitialized;
    }

    public final void setInitialized$vungle_ads_release(AtomicBoolean atomicBoolean) {
        AbstractC2995aW.q(atomicBoolean, "<set-?>");
        this.isInitialized = atomicBoolean;
    }

    public final void setIntegrationName(VungleAds$WrapperFramework vungleAds$WrapperFramework, String str) {
        AbstractC2995aW.q(vungleAds$WrapperFramework, "wrapperFramework");
        AbstractC2995aW.q(str, "wrapperFrameworkVersion");
        if (vungleAds$WrapperFramework == VungleAds$WrapperFramework.none) {
            C4917wJ.Companion.e(TAG, "Wrapper is null or is none");
            return;
        }
        Fi0 fi0 = Fi0.INSTANCE;
        String headerUa = fi0.getHeaderUa();
        String str2 = vungleAds$WrapperFramework.name() + (str.length() > 0 ? "/".concat(str) : "");
        if (AbstractC3089ba0.l0(headerUa, str2)) {
            C4917wJ.Companion.w(TAG, "Wrapper info already set");
            return;
        }
        fi0.setHeaderUa(headerUa + ';' + str2);
        if (isInitialized()) {
            C4917wJ.Companion.w(TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }
}
