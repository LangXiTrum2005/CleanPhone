package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SQ extends Q1 implements InterfaceC4046mR {
    public static final RQ Companion = new RQ(null);
    public static final String TOKEN_APP_DESCRIPTION = "APP_DESCRIPTION";
    public static final String TOKEN_APP_ICON = "APP_ICON";
    public static final String TOKEN_APP_NAME = "APP_NAME";
    public static final String TOKEN_APP_RATING_VALUE = "APP_RATING_VALUE";
    public static final String TOKEN_CTA_BUTTON_TEXT = "CTA_BUTTON_TEXT";
    public static final String TOKEN_CTA_BUTTON_URL = "CTA_BUTTON_URL";
    public static final String TOKEN_MAIN_IMAGE = "MAIN_IMAGE";
    public static final String TOKEN_OM_SDK_DATA = "OM_SDK_DATA";
    public static final String TOKEN_SPONSORED_BY = "SPONSORED_BY";
    public static final String TOKEN_VUNGLE_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";
    public static final String TOKEN_VUNGLE_PRIVACY_URL = "VUNGLE_PRIVACY_URL";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQ(Context context) {
        super(context);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q1
    public C3105bi0 getAdSizeForAdRequest() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4046mR
    public List<String> getImpressionUrls() {
        C3967la bidPayload = getBidPayload();
        if (bidPayload != null) {
            return bidPayload.getImpression();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4046mR
    public String getPlacementRefId() {
        C4664tU placement = getPlacement();
        if (placement != null) {
            return placement.getReferenceId();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q1
    public boolean isValidAdSize(C3105bi0 c3105bi0) {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q1
    public boolean isValidAdTypeForPlacement(C4664tU c4664tU) {
        AbstractC2995aW.q(c4664tU, "placement");
        return c4664tU.isNative();
    }
}
