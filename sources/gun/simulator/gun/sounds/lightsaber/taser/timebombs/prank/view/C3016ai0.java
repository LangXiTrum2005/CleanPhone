package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ai0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3016ai0 {
    private C3016ai0() {
    }

    public /* synthetic */ C3016ai0(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    public final C3105bi0 getAdSizeWithWidth(Context context, int i) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        int iIntValue = ((Number) Th0.INSTANCE.getDeviceWidthAndHeightWithOrientation(context, 0).b).intValue();
        if (i < 0) {
            i = 0;
        }
        C3105bi0 c3105bi0 = new C3105bi0(i, iIntValue);
        if (c3105bi0.getWidth() == 0) {
            c3105bi0.setAdaptiveWidth$vungle_ads_release(true);
        }
        c3105bi0.setAdaptiveHeight$vungle_ads_release(true);
        return c3105bi0;
    }

    public final C3105bi0 getAdSizeWithWidthAndHeight(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        C3105bi0 c3105bi0 = new C3105bi0(i, i2);
        if (c3105bi0.getWidth() == 0) {
            c3105bi0.setAdaptiveWidth$vungle_ads_release(true);
        }
        if (c3105bi0.getHeight() == 0) {
            c3105bi0.setAdaptiveHeight$vungle_ads_release(true);
        }
        return c3105bi0;
    }

    public final C3105bi0 getAdSizeWithWidthAndMaxHeight(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        C3105bi0 c3105bi0 = new C3105bi0(i, i2);
        if (c3105bi0.getWidth() == 0) {
            c3105bi0.setAdaptiveWidth$vungle_ads_release(true);
        }
        c3105bi0.setAdaptiveHeight$vungle_ads_release(true);
        return c3105bi0;
    }

    public final C3105bi0 getValidAdSizeFromSize(int i, int i2, String str) {
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        C4664tU placement = C3457fi.INSTANCE.getPlacement(str);
        if (placement != null) {
            if (!placement.isInline()) {
                placement = null;
            }
            if (placement != null) {
                return C3105bi0.Companion.getAdSizeWithWidthAndHeight(i, i2);
            }
        }
        C3105bi0 c3105bi0 = C3105bi0.MREC;
        if (i >= c3105bi0.getWidth() && i2 >= c3105bi0.getHeight()) {
            return c3105bi0;
        }
        C3105bi0 c3105bi1 = C3105bi0.BANNER_LEADERBOARD;
        if (i >= c3105bi1.getWidth() && i2 >= c3105bi1.getHeight()) {
            return c3105bi1;
        }
        C3105bi0 c3105bi2 = C3105bi0.BANNER;
        if (i >= c3105bi2.getWidth() && i2 >= c3105bi2.getHeight()) {
            return c3105bi2;
        }
        C3105bi0 c3105bi3 = C3105bi0.BANNER_SHORT;
        return (i < c3105bi3.getWidth() || i2 < c3105bi3.getHeight()) ? getAdSizeWithWidthAndHeight(i, i2) : c3105bi3;
    }
}
