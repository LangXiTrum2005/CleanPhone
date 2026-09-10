package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3105bi0 {
    private final int height;
    private boolean isAdaptiveHeight;
    private boolean isAdaptiveWidth;
    private final int width;
    public static final C3016ai0 Companion = new C3016ai0(null);
    public static final C3105bi0 BANNER = new C3105bi0(EnumC4719u30.WEBVIEW_ERROR_VALUE, 50);
    public static final C3105bi0 BANNER_SHORT = new C3105bi0(300, 50);
    public static final C3105bi0 BANNER_LEADERBOARD = new C3105bi0(728, 90);
    public static final C3105bi0 MREC = new C3105bi0(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    public C3105bi0(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static final C3105bi0 getAdSizeWithWidth(Context context, int i) {
        return Companion.getAdSizeWithWidth(context, i);
    }

    public static final C3105bi0 getAdSizeWithWidthAndHeight(int i, int i2) {
        return Companion.getAdSizeWithWidthAndHeight(i, i2);
    }

    public static final C3105bi0 getAdSizeWithWidthAndMaxHeight(int i, int i2) {
        return Companion.getAdSizeWithWidthAndMaxHeight(i, i2);
    }

    public static final C3105bi0 getValidAdSizeFromSize(int i, int i2, String str) {
        return Companion.getValidAdSizeFromSize(i, i2, str);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAdaptiveHeight$vungle_ads_release() {
        return this.isAdaptiveHeight;
    }

    public final boolean isAdaptiveWidth$vungle_ads_release() {
        return this.isAdaptiveWidth;
    }

    public final boolean isValidSize$vungle_ads_release() {
        return this.width >= 0 && this.height >= 0;
    }

    public final void setAdaptiveHeight$vungle_ads_release(boolean z) {
        this.isAdaptiveHeight = z;
    }

    public final void setAdaptiveWidth$vungle_ads_release(boolean z) {
        this.isAdaptiveWidth = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VungleAdSize(width=");
        sb.append(this.width);
        sb.append(", height=");
        return DM.k(sb, this.height, ')');
    }
}
