package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.vungle.ads.ServiceLocator$Companion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class J0 extends Activity {
    public static final B0 Companion = new B0(null);
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    public static final String REQUEST_KEY_EXTRA = "request";
    private static final String TAG = "AdActivity";
    private static C4980x2 advertisement;
    private static C3967la bidPayload;
    private static C4099n1 eventListener;
    private static InterfaceC5105yV presenterDelegate;
    private boolean isReceiverRegistered;
    private C2984aL mraidAdWidget;
    private C4304pL mraidPresenter;
    private String placementRefId = "";
    private final C3308e00 ringerModeReceiver = new C3308e00();
    private C4154nf0 unclosedAd;

    private final void hideSystemUi() {
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        AbstractC2995aW.p(insetsController, "getInsetsController(window, window.decorView)");
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsetsCompat.Type.systemBars());
    }

    private final void onConcurrentPlaybackError(String str) {
        C2544Kh c2544Kh = new C2544Kh();
        C4980x2 c4980x2 = advertisement;
        Ei0 ei0LogError$vungle_ads_release = c2544Kh.setLogEntry$vungle_ads_release(c4980x2 != null ? c4980x2.getLogEntry$vungle_ads_release() : null).logError$vungle_ads_release();
        C4099n1 c4099n1 = eventListener;
        if (c4099n1 != null) {
            c4099n1.onError(ei0LogError$vungle_ads_release, str);
        }
        C4917wJ.Companion.e(TAG, "onConcurrentPlaybackError: " + ei0LogError$vungle_ads_release.getLocalizedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final L60 m172onCreate$lambda0(InterfaceC3069bH interfaceC3069bH) {
        return (L60) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-4, reason: not valid java name */
    private static final InterfaceC4615ss m173onCreate$lambda4(InterfaceC3069bH interfaceC3069bH) {
        return (InterfaceC4615ss) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-5, reason: not valid java name */
    private static final InterfaceC5016xU m174onCreate$lambda5(InterfaceC3069bH interfaceC3069bH) {
        return (InterfaceC5016xU) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-6, reason: not valid java name */
    private static final C3257dS m175onCreate$lambda6(InterfaceC3069bH interfaceC3069bH) {
        return (C3257dS) interfaceC3069bH.getValue();
    }

    @VisibleForTesting(otherwise = 4)
    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    public final C2984aL getMraidAdWidget$vungle_ads_release() {
        return this.mraidAdWidget;
    }

    public final C4304pL getMraidPresenter$vungle_ads_release() {
        return this.mraidPresenter;
    }

    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        C4304pL c4304pL = this.mraidPresenter;
        if (c4304pL != null) {
            c4304pL.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC2995aW.q(configuration, "newConfig");
        try {
            super.onConfigurationChanged(configuration);
            int i = configuration.orientation;
            if (i == 2) {
                C4917wJ.Companion.d(TAG, "landscape");
            } else if (i == 1) {
                C4917wJ.Companion.d(TAG, "portrait");
            }
            C4304pL c4304pL = this.mraidPresenter;
            if (c4304pL != null) {
                c4304pL.onViewConfigurationChanged();
            }
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "onConfigurationChanged: " + e.getLocalizedMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hm, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13 */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String watermark$vungle_ads_release;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        B0 b0 = Companion;
        Intent intent = getIntent();
        AbstractC2995aW.p(intent, "intent");
        String placement = b0.getPlacement(intent);
        if (placement == null) {
            placement = "";
        }
        this.placementRefId = placement;
        C4980x2 c4980x2 = advertisement;
        C3457fi c3457fi = C3457fi.INSTANCE;
        C4664tU placement2 = c3457fi.getPlacement(placement);
        C4126nJ c4126nJ = 0;
        if (placement2 == null || c4980x2 == null) {
            C4099n1 c4099n1 = eventListener;
            if (c4099n1 != null) {
                c4099n1.onError(new X1("Can not play fullscreen ad").setLogEntry$vungle_ads_release(c4980x2 != null ? c4980x2.getLogEntry$vungle_ads_release() : 0).logError$vungle_ads_release(), this.placementRefId);
            }
            finish();
            return;
        }
        getWindow().getDecorView().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        try {
            C2984aL c2984aL = new C2984aL(this);
            ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
            EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
            InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(enumC4124nH, new C0(this));
            Intent intent2 = getIntent();
            AbstractC2995aW.p(intent2, "intent");
            String eventId = b0.getEventId(intent2);
            C4154nf0 c4154nf0 = eventId != null ? new C4154nf0(eventId, (String) c4126nJ, 2, (AbstractC2471Hm) c4126nJ) : null;
            this.unclosedAd = c4154nf0;
            if (c4154nf0 != null) {
                m172onCreate$lambda0(interfaceC3069bHH).recordUnclosedAd(c4154nf0);
            }
            c2984aL.setCloseDelegate(new G0(this, interfaceC3069bHH));
            c2984aL.setOnViewTouchListener(new H0(this));
            c2984aL.setOrientationDelegate(new I0(this));
            InterfaceC3069bH interfaceC3069bHH2 = AbstractC2340Cl.H(enumC4124nH, new D0(this));
            InterfaceC3069bH interfaceC3069bHH3 = AbstractC2340Cl.H(enumC4124nH, new E0(this));
            C5041xj0 c5041xj0 = new C5041xj0(c4980x2, placement2, ((C4893w20) m173onCreate$lambda4(interfaceC3069bHH2)).getOffloadExecutor(), m172onCreate$lambda0(interfaceC3069bHH), m174onCreate$lambda5(interfaceC3069bHH3));
            C3345eS c3345eSMake = m175onCreate$lambda6(AbstractC2340Cl.H(enumC4124nH, new F0(this))).make(c3457fi.omEnabled() && c4980x2.omEnabled());
            C4689tj0 jobExecutor = ((C4893w20) m173onCreate$lambda4(interfaceC3069bHH2)).getJobExecutor();
            c5041xj0.setWebViewObserver(c3345eSMake);
            this.ringerModeReceiver.setWebClient(c5041xj0);
            C4304pL c4304pL = new C4304pL(c2984aL, c4980x2, placement2, c5041xj0, jobExecutor, c3345eSMake, bidPayload, m174onCreate$lambda5(interfaceC3069bHH3));
            c4304pL.setEventListener(eventListener);
            c4304pL.setPresenterDelegate$vungle_ads_release(presenterDelegate);
            c4304pL.prepare();
            setContentView(c2984aL, c2984aL.getLayoutParams());
            C3573h1 adConfig = c4980x2.getAdConfig();
            if (adConfig != null && (watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release()) != null) {
                Cj0 cj0 = new Cj0(this, watermark$vungle_ads_release);
                ((FrameLayout) getWindow().getDecorView().findViewById(R.id.content)).addView(cj0);
                cj0.bringToFront();
            }
            this.mraidAdWidget = c2984aL;
            this.mraidPresenter = c4304pL;
        } catch (InstantiationException unused) {
            C4099n1 c4099n2 = eventListener;
            if (c4099n2 != null) {
                c4099n2.onError(new C3132c1().setLogEntry$vungle_ads_release(c4980x2.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), this.placementRefId);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C4304pL c4304pL = this.mraidPresenter;
        if (c4304pL != null) {
            c4304pL.detach((isChangingConfigurations() ? 1 : 0) | 2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC2995aW.q(intent, "intent");
        super.onNewIntent(intent);
        B0 b0 = Companion;
        Intent intent2 = getIntent();
        AbstractC2995aW.p(intent2, "getIntent()");
        String placement = b0.getPlacement(intent2);
        String placement2 = b0.getPlacement(intent);
        Intent intent3 = getIntent();
        AbstractC2995aW.p(intent3, "getIntent()");
        String eventId = b0.getEventId(intent3);
        String eventId2 = b0.getEventId(intent);
        if ((placement == null || placement2 == null || AbstractC2995aW.i(placement, placement2)) && (eventId == null || eventId2 == null || AbstractC2995aW.i(eventId, eventId2))) {
            return;
        }
        C4917wJ.Companion.d(TAG, AbstractC5044xl.m("Tried to play another placement ", placement2, " while playing ", placement));
        onConcurrentPlaybackError(placement2);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            if (this.isReceiverRegistered) {
                unregisterReceiver(this.ringerModeReceiver);
                this.isReceiverRegistered = false;
                C4917wJ.Companion.d(TAG, "unregisterReceiver(): " + this.ringerModeReceiver.hashCode());
            }
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "unregisterReceiver error: " + e.getLocalizedMessage());
        }
        C4304pL c4304pL = this.mraidPresenter;
        if (c4304pL != null) {
            c4304pL.stop();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        hideSystemUi();
        try {
            if (!this.isReceiverRegistered) {
                registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                this.isReceiverRegistered = true;
                C4917wJ.Companion.d(TAG, "registerReceiver(): " + this.ringerModeReceiver.hashCode());
            }
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "registerReceiver error: " + e.getLocalizedMessage());
        }
        C4304pL c4304pL = this.mraidPresenter;
        if (c4304pL != null) {
            c4304pL.start();
        }
    }

    public final void setMraidAdWidget$vungle_ads_release(C2984aL c2984aL) {
        this.mraidAdWidget = c2984aL;
    }

    public final void setMraidPresenter$vungle_ads_release(C4304pL c4304pL) {
        this.mraidPresenter = c4304pL;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        AbstractC2995aW.q(str, "<set-?>");
        this.placementRefId = str;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(i);
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPlacementRefId$vungle_ads_release$annotations() {
    }
}
