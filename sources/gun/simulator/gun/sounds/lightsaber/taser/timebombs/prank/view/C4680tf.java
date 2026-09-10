package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.internal.network.VungleApiClient;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4680tf {
    private static final String TAG = "ClickCoordinateTracker";
    private final C4980x2 advertisement;
    private final Context context;
    private final C3977lf currentClick;
    private final Executor executor;
    private final InterfaceC3069bH executors$delegate;
    private final InterfaceC3069bH vungleApiClient$delegate;
    public static final C4065mf Companion = new C4065mf(null);
    private static final String MACRO_REQ_WIDTH = Pattern.quote("{{{req_width}}}");
    private static final String MACRO_REQ_HEIGHT = Pattern.quote("{{{req_height}}}");
    private static final String MACRO_WIDTH = Pattern.quote("{{{width}}}");
    private static final String MACRO_HEIGHT = Pattern.quote("{{{height}}}");
    private static final String MACRO_DOWN_X = Pattern.quote("{{{down_x}}}");
    private static final String MACRO_DOWN_Y = Pattern.quote("{{{down_y}}}");
    private static final String MACRO_UP_X = Pattern.quote("{{{up_x}}}");
    private static final String MACRO_UP_Y = Pattern.quote("{{{up_y}}}");

    public C4680tf(Context context, C4980x2 c4980x2, Executor executor) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(c4980x2, "advertisement");
        AbstractC2995aW.q(executor, "executor");
        this.context = context;
        this.advertisement = c4980x2;
        this.executor = executor;
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
        this.vungleApiClient$delegate = AbstractC2340Cl.H(enumC4124nH, new C4504rf(context));
        this.executors$delegate = AbstractC2340Cl.H(enumC4124nH, new C4592sf(context));
        this.currentClick = new C3977lf(new C4153nf(Integer.MIN_VALUE, Integer.MIN_VALUE), new C4153nf(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    private final int getDeviceHeight() {
        return new C4241of(this.context).getDeviceHeight();
    }

    private final int getDeviceWidth() {
        return new C4241of(this.context).getDeviceWidth();
    }

    private final InterfaceC4615ss getExecutors() {
        return (InterfaceC4615ss) this.executors$delegate.getValue();
    }

    private final int getRequestedHeight() {
        int iAdHeight = this.advertisement.adHeight();
        return iAdHeight == 0 ? getDeviceHeight() : Th0.INSTANCE.dpToPixels(this.context, iAdHeight);
    }

    private final int getRequestedWidth() {
        int iAdWidth = this.advertisement.adWidth();
        return iAdWidth == 0 ? getDeviceWidth() : Th0.INSTANCE.dpToPixels(this.context, iAdWidth);
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    private final void sendClickCoordinates() {
        List<String> tpatUrls$default = C4980x2.getTpatUrls$default(this.advertisement, C4980x2.TPAT_CLICK_COORDINATES_URLS, null, null, 6, null);
        List list = tpatUrls$default;
        if (list == null || list.isEmpty()) {
            new C3272dd0(EnumC4719u30.EMPTY_TPAT_ERROR, "Empty urls for tpat: video.clickCoordinates").setLogEntry$vungle_ads_release(this.advertisement.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
            return;
        }
        int requestedWidth = getRequestedWidth();
        int requestedHeight = getRequestedHeight();
        int requestedWidth2 = getRequestedWidth();
        int requestedHeight2 = getRequestedHeight();
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        Context context = this.context;
        EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
        C3624hd0 c3624hd0 = new C3624hd0(getVungleApiClient(), this.advertisement.getLogEntry$vungle_ads_release(), ((C4893w20) getExecutors()).getIoExecutor(), m277sendClickCoordinates$lambda0(AbstractC2340Cl.H(enumC4124nH, new C4329pf(context))), m278sendClickCoordinates$lambda1(AbstractC2340Cl.H(enumC4124nH, new C4417qf(this.context))));
        for (String str : tpatUrls$default) {
            String str2 = MACRO_REQ_WIDTH;
            AbstractC2995aW.p(str2, "MACRO_REQ_WIDTH");
            Pattern patternCompile = Pattern.compile(str2);
            AbstractC2995aW.p(patternCompile, "compile(pattern)");
            String strValueOf = String.valueOf(requestedWidth);
            AbstractC2995aW.q(str, "input");
            AbstractC2995aW.q(strValueOf, "replacement");
            String strReplaceAll = patternCompile.matcher(str).replaceAll(strValueOf);
            AbstractC2995aW.p(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            String str3 = MACRO_REQ_HEIGHT;
            AbstractC2995aW.p(str3, "MACRO_REQ_HEIGHT");
            Pattern patternCompile2 = Pattern.compile(str3);
            AbstractC2995aW.p(patternCompile2, "compile(pattern)");
            String strValueOf2 = String.valueOf(requestedHeight);
            AbstractC2995aW.q(strValueOf2, "replacement");
            String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(strValueOf2);
            AbstractC2995aW.p(strReplaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
            String str4 = MACRO_WIDTH;
            AbstractC2995aW.p(str4, "MACRO_WIDTH");
            Pattern patternCompile3 = Pattern.compile(str4);
            AbstractC2995aW.p(patternCompile3, "compile(pattern)");
            String strValueOf3 = String.valueOf(requestedWidth2);
            AbstractC2995aW.q(strValueOf3, "replacement");
            String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll(strValueOf3);
            AbstractC2995aW.p(strReplaceAll3, "nativePattern.matcher(in…).replaceAll(replacement)");
            String str5 = MACRO_HEIGHT;
            AbstractC2995aW.p(str5, "MACRO_HEIGHT");
            Pattern patternCompile4 = Pattern.compile(str5);
            AbstractC2995aW.p(patternCompile4, "compile(pattern)");
            String strValueOf4 = String.valueOf(requestedHeight2);
            AbstractC2995aW.q(strValueOf4, "replacement");
            String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll(strValueOf4);
            AbstractC2995aW.p(strReplaceAll4, "nativePattern.matcher(in…).replaceAll(replacement)");
            String str6 = MACRO_DOWN_X;
            AbstractC2995aW.p(str6, "MACRO_DOWN_X");
            Pattern patternCompile5 = Pattern.compile(str6);
            AbstractC2995aW.p(patternCompile5, "compile(pattern)");
            String strValueOf5 = String.valueOf(this.currentClick.getDownCoordinate().getX());
            AbstractC2995aW.q(strValueOf5, "replacement");
            String strReplaceAll5 = patternCompile5.matcher(strReplaceAll4).replaceAll(strValueOf5);
            AbstractC2995aW.p(strReplaceAll5, "nativePattern.matcher(in…).replaceAll(replacement)");
            String str7 = MACRO_DOWN_Y;
            AbstractC2995aW.p(str7, "MACRO_DOWN_Y");
            Pattern patternCompile6 = Pattern.compile(str7);
            AbstractC2995aW.p(patternCompile6, "compile(pattern)");
            String strValueOf6 = String.valueOf(this.currentClick.getDownCoordinate().getY());
            AbstractC2995aW.q(strValueOf6, "replacement");
            String strReplaceAll6 = patternCompile6.matcher(strReplaceAll5).replaceAll(strValueOf6);
            AbstractC2995aW.p(strReplaceAll6, "nativePattern.matcher(in…).replaceAll(replacement)");
            String str8 = MACRO_UP_X;
            AbstractC2995aW.p(str8, "MACRO_UP_X");
            Pattern patternCompile7 = Pattern.compile(str8);
            AbstractC2995aW.p(patternCompile7, "compile(pattern)");
            String strValueOf7 = String.valueOf(this.currentClick.getUpCoordinate().getX());
            AbstractC2995aW.q(strValueOf7, "replacement");
            String strReplaceAll7 = patternCompile7.matcher(strReplaceAll6).replaceAll(strValueOf7);
            AbstractC2995aW.p(strReplaceAll7, "nativePattern.matcher(in…).replaceAll(replacement)");
            String str9 = MACRO_UP_Y;
            AbstractC2995aW.p(str9, "MACRO_UP_Y");
            Pattern patternCompile8 = Pattern.compile(str9);
            AbstractC2995aW.p(patternCompile8, "compile(pattern)");
            String strValueOf8 = String.valueOf(this.currentClick.getUpCoordinate().getY());
            AbstractC2995aW.q(strValueOf8, "replacement");
            String strReplaceAll8 = patternCompile8.matcher(strReplaceAll7).replaceAll(strValueOf8);
            AbstractC2995aW.p(strReplaceAll8, "nativePattern.matcher(in…).replaceAll(replacement)");
            c3624hd0.sendTpat(strReplaceAll8, this.executor);
        }
    }

    /* JADX INFO: renamed from: sendClickCoordinates$lambda-0, reason: not valid java name */
    private static final ZT m277sendClickCoordinates$lambda0(InterfaceC3069bH interfaceC3069bH) {
        return (ZT) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: sendClickCoordinates$lambda-1, reason: not valid java name */
    private static final L60 m278sendClickCoordinates$lambda1(InterfaceC3069bH interfaceC3069bH) {
        return (L60) interfaceC3069bH.getValue();
    }

    public final C3977lf getCurrentClick$vungle_ads_release() {
        return this.currentClick;
    }

    public final void trackCoordinate(MotionEvent motionEvent) {
        AbstractC2995aW.q(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (this.advertisement.isClickCoordinatesTrackingEnabled()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.currentClick.setDownCoordinate(new C4153nf((int) motionEvent.getX(), (int) motionEvent.getY()));
            } else {
                if (action != 1) {
                    return;
                }
                this.currentClick.setUpCoordinate(new C4153nf((int) motionEvent.getX(), (int) motionEvent.getY()));
                if (this.currentClick.ready()) {
                    sendClickCoordinates();
                }
            }
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getCurrentClick$vungle_ads_release$annotations() {
    }
}
