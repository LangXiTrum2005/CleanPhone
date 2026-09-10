package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.internal.network.VungleApiClient;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3520gR {
    public static final String DOWNLOAD = "download";
    public static final String OPEN_PRIVACY = "openPrivacy";
    private static final String TAG = "NativeAdPresenter";
    public static final String TPAT = "tpat";
    public static final String VIDEO_VIEWED = "videoViewed";
    private Long adStartTime;
    private boolean adViewed;
    private final C4980x2 advertisement;
    private C4099n1 bus;
    private final Context context;
    private Dialog currentDialog;
    private final InterfaceC4046mR delegate;
    private Executor executor;
    private final InterfaceC3069bH executors$delegate;
    private final InterfaceC3069bH logEntry$delegate;
    private C3870kR omTracker;
    private final InterfaceC3069bH pathProvider$delegate;
    private final InterfaceC5016xU platform;
    private final InterfaceC3069bH signalManager$delegate;
    private final InterfaceC3069bH vungleApiClient$delegate;
    public static final ZQ Companion = new ZQ(null);
    private static final Map<String, B30> eventMap = U5.u0(new C4839vT(C2390Ej.CHECKPOINT_0, B30.AD_START_EVENT), new C4839vT(C2390Ej.CLICK_URL, B30.AD_CLICK_EVENT));

    public C3520gR(Context context, InterfaceC4046mR interfaceC4046mR, C4980x2 c4980x2, Executor executor, InterfaceC5016xU interfaceC5016xU) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(interfaceC4046mR, "delegate");
        AbstractC2995aW.q(executor, "executor");
        AbstractC2995aW.q(interfaceC5016xU, "platform");
        this.context = context;
        this.delegate = interfaceC4046mR;
        this.advertisement = c4980x2;
        this.executor = executor;
        this.platform = interfaceC5016xU;
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
        this.vungleApiClient$delegate = AbstractC2340Cl.H(enumC4124nH, new C3167cR(context));
        this.executors$delegate = AbstractC2340Cl.H(enumC4124nH, new C3256dR(context));
        this.pathProvider$delegate = AbstractC2340Cl.H(enumC4124nH, new C3344eR(context));
        this.signalManager$delegate = AbstractC2340Cl.H(enumC4124nH, new C3432fR(context));
        this.logEntry$delegate = AbstractC2340Cl.I(new C2990aR(this));
    }

    private final InterfaceC4615ss getExecutors() {
        return (InterfaceC4615ss) this.executors$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4126nJ getLogEntry() {
        return (C4126nJ) this.logEntry$delegate.getValue();
    }

    private final ZT getPathProvider() {
        return (ZT) this.pathProvider$delegate.getValue();
    }

    private final L60 getSignalManager() {
        return (L60) this.signalManager$delegate.getValue();
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    private final boolean needShowGdpr() {
        return C3457fi.INSTANCE.getGDPRIsCountryDataProtected() && AbstractC2995aW.i("unknown", OV.INSTANCE.getConsentStatus());
    }

    private final void onDownload(String str) {
        C4099n1 c4099n1;
        C3311e2 c3311e2AdUnit;
        C4980x2 c4980x2 = this.advertisement;
        String deeplinkUrl = null;
        List tpatUrls$default = c4980x2 != null ? C4980x2.getTpatUrls$default(c4980x2, C2390Ej.CLICK_URL, null, null, 6, null) : null;
        C3624hd0 c3624hd0 = new C3624hd0(getVungleApiClient(), getLogEntry(), ((C4893w20) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
        List list = tpatUrls$default;
        if (list == null || list.isEmpty()) {
            new C3272dd0(EnumC4719u30.EMPTY_TPAT_ERROR, "Empty tpat key: clickUrl").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        } else {
            Iterator it = tpatUrls$default.iterator();
            while (it.hasNext()) {
                c3624hd0.sendTpat((String) it.next(), this.executor);
            }
        }
        if (str != null) {
            c3624hd0.sendTpat(str, this.executor);
        }
        C4980x2 c4980x3 = this.advertisement;
        if (c4980x3 != null && (c3311e2AdUnit = c4980x3.adUnit()) != null) {
            deeplinkUrl = c3311e2AdUnit.getDeeplinkUrl();
        }
        boolean zLaunch = C4089mt.launch(deeplinkUrl, str, this.context, getLogEntry(), new C3079bR(deeplinkUrl, this, c3624hd0));
        C4099n1 c4099n2 = this.bus;
        if (c4099n2 != null) {
            c4099n2.onNext(C4304pL.OPEN, "adClick", ((SQ) this.delegate).getPlacementRefId());
        }
        if (!zLaunch || (c4099n1 = this.bus) == null) {
            return;
        }
        c4099n1.onNext(C4304pL.OPEN, "adLeftApplication", ((SQ) this.delegate).getPlacementRefId());
    }

    private final void onPrivacy(String str) {
        if (str != null) {
            if (!C3300du.INSTANCE.isValidUrl(str)) {
                new RV(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            if (!C4089mt.launch$default(null, str, this.context, getLogEntry(), null, 16, null)) {
                new RV(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            C4099n1 c4099n1 = this.bus;
            if (c4099n1 != null) {
                c4099n1.onNext(C4304pL.OPEN, "adLeftApplication", ((SQ) this.delegate).getPlacementRefId());
            }
        }
    }

    public static /* synthetic */ void processCommand$default(C3520gR c3520gR, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c3520gR.processCommand(str, str2);
    }

    private final void showGdpr() {
        OV.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.context instanceof Activity)) {
            C4917wJ.Companion.w(TAG, "We can not show GDPR dialog with application context.");
            return;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YQ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C3520gR.m243showGdpr$lambda8(this.f4018a, dialogInterface, i);
            }
        };
        C3457fi c3457fi = C3457fi.INSTANCE;
        String gDPRConsentTitle = c3457fi.getGDPRConsentTitle();
        String gDPRConsentMessage = c3457fi.getGDPRConsentMessage();
        String gDPRButtonAccept = c3457fi.getGDPRButtonAccept();
        String gDPRButtonDeny = c3457fi.getGDPRButtonDeny();
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        if (gDPRConsentTitle != null && gDPRConsentTitle.length() != 0) {
            builder.setTitle(gDPRConsentTitle);
        }
        if (gDPRConsentMessage != null && gDPRConsentMessage.length() != 0) {
            builder.setMessage(gDPRConsentMessage);
        }
        builder.setPositiveButton(gDPRButtonAccept, onClickListener);
        builder.setNegativeButton(gDPRButtonDeny, onClickListener);
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnDismissListener(new DialogInterfaceOnDismissListenerC3706ia0(this, 1));
        this.currentDialog = alertDialogCreate;
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showGdpr$lambda-8, reason: not valid java name */
    public static final void m243showGdpr$lambda8(C3520gR c3520gR, DialogInterface dialogInterface, int i) {
        String value;
        AbstractC2995aW.q(c3520gR, "this$0");
        if (i != -2) {
            value = i != -1 ? "opted_out_by_timeout" : LV.OPT_IN.getValue();
        } else {
            value = LV.OPT_OUT.getValue();
        }
        OV.INSTANCE.updateGdprConsent(value, "vungle_modal", null);
        c3520gR.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showGdpr$lambda-9, reason: not valid java name */
    public static final void m244showGdpr$lambda9(C3520gR c3520gR, DialogInterface dialogInterface) {
        AbstractC2995aW.q(c3520gR, "this$0");
        c3520gR.currentDialog = null;
    }

    private final void start() {
        if (needShowGdpr()) {
            showGdpr();
        }
    }

    private final void triggerEventMetricForTpat(String str) {
        B30 b30 = eventMap.get(str);
        if (b30 != null) {
            C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, new C3586h70(b30), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    public final void detach() {
        List<String> tpatUrls;
        C3870kR c3870kR = this.omTracker;
        if (c3870kR != null) {
            c3870kR.stop();
        }
        Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        Long l = this.adStartTime;
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            C3624hd0 c3624hd0 = new C3624hd0(getVungleApiClient(), getLogEntry(), ((C4893w20) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
            C4980x2 c4980x2 = this.advertisement;
            if (c4980x2 != null && (tpatUrls = c4980x2.getTpatUrls(C2390Ej.AD_CLOSE, String.valueOf(jCurrentTimeMillis), String.valueOf(((C5160z4) this.platform).getVolumeLevel()))) != null) {
                c3624hd0.sendTpats(tpatUrls, this.executor);
            }
        }
        C4099n1 c4099n1 = this.bus;
        if (c4099n1 != null) {
            c4099n1.onNext(TtmlNode.END, null, ((SQ) this.delegate).getPlacementRefId());
        }
    }

    public final void initOMTracker(String str) {
        AbstractC2995aW.q(str, "omSdkData");
        C4980x2 c4980x2 = this.advertisement;
        boolean zOmEnabled = c4980x2 != null ? c4980x2.omEnabled() : false;
        if (str.length() > 0 && C3457fi.INSTANCE.omEnabled() && zOmEnabled) {
            this.omTracker = new C3870kR(str);
        }
    }

    public final void onImpression() {
        C3870kR c3870kR = this.omTracker;
        if (c3870kR != null) {
            c3870kR.impressionOccurred();
        }
    }

    public final void prepare() {
        start();
        C4099n1 c4099n1 = this.bus;
        if (c4099n1 != null) {
            c4099n1.onNext("start", null, ((SQ) this.delegate).getPlacementRefId());
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void processCommand(String str, String str2) {
        AbstractC2995aW.q(str, com.umeng.ccg.a.w);
        List<String> tpatUrls$default = null;
        switch (str.hashCode()) {
            case -511324706:
                if (str.equals("openPrivacy")) {
                    onPrivacy(str2);
                    return;
                }
                break;
            case 3566511:
                if (str.equals("tpat")) {
                    if (str2 == null || str2.length() == 0) {
                        new C3272dd0(EnumC4719u30.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        return;
                    }
                    triggerEventMetricForTpat(str2);
                    if (AbstractC2995aW.i(str2, C2390Ej.CHECKPOINT_0)) {
                        C4980x2 c4980x2 = this.advertisement;
                        if (c4980x2 != null) {
                            tpatUrls$default = c4980x2.getTpatUrls(str2, ((C5160z4) this.platform).getCarrierName(), String.valueOf(((C5160z4) this.platform).getVolumeLevel()));
                        }
                    } else {
                        C4980x2 c4980x3 = this.advertisement;
                        if (c4980x3 != null) {
                            tpatUrls$default = C4980x2.getTpatUrls$default(c4980x3, str2, null, null, 6, null);
                        }
                    }
                    List<String> list = tpatUrls$default;
                    if (list == null || list.isEmpty()) {
                        new C3272dd0(EnumC4719u30.INVALID_TPAT_KEY, AbstractC3888ke0.i("Empty urls for tpat: ", str2)).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        return;
                    }
                    C3624hd0 c3624hd0 = new C3624hd0(getVungleApiClient(), getLogEntry(), ((C4893w20) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
                    Iterator<T> it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        c3624hd0.sendTpat((String) it.next(), this.executor);
                    }
                    return;
                }
                break;
            case 1118284383:
                if (str.equals("videoViewed")) {
                    C4099n1 c4099n1 = this.bus;
                    if (c4099n1 == null || this.adViewed) {
                        return;
                    }
                    this.adViewed = true;
                    if (c4099n1 != null) {
                        c4099n1.onNext("adViewed", null, ((SQ) this.delegate).getPlacementRefId());
                    }
                    C3624hd0 c3624hd1 = new C3624hd0(getVungleApiClient(), getLogEntry(), ((C4893w20) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
                    List<String> impressionUrls = ((SQ) this.delegate).getImpressionUrls();
                    if (impressionUrls != null) {
                        Iterator<T> it2 = impressionUrls.iterator();
                        while (it2.hasNext()) {
                            c3624hd1.sendTpat((String) it2.next(), this.executor);
                        }
                        return;
                    }
                    return;
                }
                break;
            case 1427818632:
                if (str.equals(DOWNLOAD)) {
                    onDownload(str2);
                    return;
                }
                break;
        }
        C4917wJ.Companion.w(TAG, "Unknown native ad action: ".concat(str));
    }

    public final void setEventListener(C4099n1 c4099n1) {
        this.bus = c4099n1;
    }

    public final void startTracking(View view) {
        AbstractC2995aW.q(view, "rootView");
        C3870kR c3870kR = this.omTracker;
        if (c3870kR != null) {
            c3870kR.start(view);
        }
    }
}
