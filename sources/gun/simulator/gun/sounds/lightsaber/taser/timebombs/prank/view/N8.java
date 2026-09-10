package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class N8 extends Q1 {
    private final C3105bi0 adSize;
    private C3105bi0 updatedAdSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N8(Context context, C3105bi0 c3105bi0) {
        super(context);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(c3105bi0, "adSize");
        this.adSize = c3105bi0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q1
    public void adLoadedAndUpdateConfigure$vungle_ads_release(C4980x2 c4980x2) {
        AbstractC2995aW.q(c4980x2, "advertisement");
        super.adLoadedAndUpdateConfigure$vungle_ads_release(c4980x2);
        if (this.adSize.isAdaptiveWidth$vungle_ads_release() || this.adSize.isAdaptiveHeight$vungle_ads_release()) {
            C4839vT deviceWidthAndHeightWithOrientation = Th0.INSTANCE.getDeviceWidthAndHeightWithOrientation(getContext(), 0);
            int iIntValue = ((Number) deviceWidthAndHeightWithOrientation.f5132a).intValue();
            int iIntValue2 = ((Number) deviceWidthAndHeightWithOrientation.b).intValue();
            int iAdWidth = this.adSize.isAdaptiveWidth$vungle_ads_release() ? c4980x2.adWidth() : this.adSize.getWidth();
            int iAdHeight = this.adSize.isAdaptiveHeight$vungle_ads_release() ? c4980x2.adHeight() : this.adSize.getHeight();
            int iMin = Math.min(iIntValue, iAdWidth);
            int iMin2 = Math.min(iIntValue2, iAdHeight);
            if (this.adSize.isAdaptiveHeight$vungle_ads_release() && this.adSize.getHeight() > 0) {
                iMin2 = Math.min(this.adSize.getHeight(), iMin2);
            }
            this.updatedAdSize = new C3105bi0(iMin, iMin2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q1
    public C3105bi0 getAdSizeForAdRequest() {
        return this.adSize;
    }

    public final C3105bi0 getUpdatedAdSize$vungle_ads_release() {
        return this.updatedAdSize;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q1
    public boolean isValidAdSize(C3105bi0 c3105bi0) {
        if (c3105bi0 != null) {
            return c3105bi0.isValidSize$vungle_ads_release();
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q1
    public boolean isValidAdTypeForPlacement(C4664tU c4664tU) {
        AbstractC2995aW.q(c4664tU, "placement");
        return c4664tU.isBanner() || c4664tU.isMREC() || c4664tU.isInline();
    }

    public final void setUpdatedAdSize$vungle_ads_release(C3105bi0 c3105bi0) {
        this.updatedAdSize = c3105bi0;
    }

    public final A2 wrapCallback$vungle_ads_release(InterfaceC5156z2 interfaceC5156z2) {
        AbstractC2995aW.q(interfaceC5156z2, "adPlayCallback");
        return new M8(interfaceC5156z2, this);
    }
}
