package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.internal.network.VungleApiClient;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4582sa {
    public static final C4319pa Companion = new C4319pa(null);
    private static final String TAG = "BidTokenEncoder";
    public static final int TOKEN_VERSION = 6;
    private C3586h70 bidTokenRequestedMetric;
    private final Context context;
    private long enterBackgroundTime;
    private final VE json;
    private int ordinalView;

    public C4582sa(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.context = context;
        this.bidTokenRequestedMetric = new C3586h70(B30.BID_TOKEN_REQUESTED);
        this.json = WD.b(C4494ra.INSTANCE);
        C5064y0.Companion.addLifecycleListener(new C4143na(this));
    }

    /* JADX INFO: renamed from: constructV6Token$lambda-0, reason: not valid java name */
    private static final VungleApiClient m275constructV6Token$lambda0(InterfaceC3069bH interfaceC3069bH) {
        return (VungleApiClient) interfaceC3069bH.getValue();
    }

    private final C4231oa generateBidToken() {
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.bidTokenRequestedMetric, (C4126nJ) null, (String) null, 6, (Object) null);
        try {
            String strConstructV6Token$vungle_ads_release = constructV6Token$vungle_ads_release();
            C4829vJ c4829vJ = C4917wJ.Companion;
            c4829vJ.d(TAG, "BidToken: " + strConstructV6Token$vungle_ads_release);
            try {
                String str = "6:" + C4296pD.INSTANCE.convertForSending(strConstructV6Token$vungle_ads_release);
                c4829vJ.d(TAG, "After conversion: " + str);
                return new C4231oa(str, "");
            } catch (Exception e) {
                String str2 = "Fail to gzip token data. " + e.getLocalizedMessage();
                new C2664Oy(str2).logErrorNoReturnValue$vungle_ads_release();
                return new C4231oa("", str2);
            }
        } catch (Exception e2) {
            String str3 = "Failed to encode TokenParameters. " + e2.getLocalizedMessage();
            new C4737uF(str3).logErrorNoReturnValue$vungle_ads_release();
            return new C4231oa("", str3);
        }
    }

    @VisibleForTesting
    public final String constructV6Token$vungle_ads_release() {
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        VungleApiClient vungleApiClientM275constructV6Token$lambda0 = m275constructV6Token$lambda0(AbstractC2340Cl.H(EnumC4124nH.f4736a, new C4407qa(this.context)));
        C3457fi c3457fi = C3457fi.INSTANCE;
        C2543Kg c2543KgRequestBody = vungleApiClientM275constructV6Token$lambda0.requestBody(!c3457fi.signalsDisabled(), c3457fi.fpdEnabled());
        C4537s00 c4537s00 = new C4537s00(c2543KgRequestBody.getDevice(), c2543KgRequestBody.getUser(), c2543KgRequestBody.getExt(), new C4274p00(Fi0.INSTANCE.getHeaderUa()), this.ordinalView);
        VE ve = this.json;
        return ve.b(AbstractC3375el.V(ve.b, AbstractC3263dY.d(C4537s00.class)), c4537s00);
    }

    public final C4231oa encode() {
        this.ordinalView++;
        return generateBidToken();
    }

    public final long getEnterBackgroundTime$vungle_ads_release() {
        return this.enterBackgroundTime;
    }

    public final int getOrdinalView$vungle_ads_release() {
        return this.ordinalView;
    }

    @VisibleForTesting(otherwise = 2)
    public final void onPause$vungle_ads_release() {
        C4917wJ.Companion.d(TAG, "BidTokenEncoder#onBackground()");
        this.enterBackgroundTime = System.currentTimeMillis();
    }

    @VisibleForTesting(otherwise = 2)
    public final void onResume$vungle_ads_release() {
        C4917wJ.Companion.d(TAG, "BidTokenEncoder#onForeground()");
        if (System.currentTimeMillis() > this.enterBackgroundTime + C3457fi.INSTANCE.getSessionTimeout()) {
            this.ordinalView = 0;
            this.enterBackgroundTime = 0L;
        }
    }

    public final void setEnterBackgroundTime$vungle_ads_release(long j) {
        this.enterBackgroundTime = j;
    }

    public final void setOrdinalView$vungle_ads_release(int i) {
        this.ordinalView = i;
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getEnterBackgroundTime$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getOrdinalView$vungle_ads_release$annotations() {
    }
}
