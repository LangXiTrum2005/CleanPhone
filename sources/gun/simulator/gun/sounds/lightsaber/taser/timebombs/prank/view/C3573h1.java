package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3573h1 {
    public static final int AUTO_ROTATE = 2;
    public static final C3397f1 Companion = new C3397f1(null);
    public static final int IMMEDIATE_BACK = 2;
    public static final int LANDSCAPE = 1;
    public static final int PORTRAIT = 0;
    private static final String WATERMARK = "WATERMARK";
    private int settings;
    private Map<String, String> extras = new LinkedHashMap();
    private int adOrientation = 2;

    public final int getAdOrientation() {
        return this.adOrientation;
    }

    public final int getSettings() {
        return this.settings;
    }

    public final String getWatermark$vungle_ads_release() {
        return this.extras.get(WATERMARK);
    }

    public final void setAdOrientation(int i) {
        this.adOrientation = i;
    }

    public final void setBackButtonImmediatelyEnabled(boolean z) {
        this.settings = z ? this.settings | 2 : this.settings & (-3);
    }

    public final void setWatermark(String str) {
        AbstractC2995aW.q(str, MBridgeConstans.EXTRA_KEY_WM);
        this.extras.put(WATERMARK, str);
    }

    public static /* synthetic */ void getAdOrientation$annotations() {
    }
}
