package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class Fi0 {
    public static final Fi0 INSTANCE;
    private static String headerUa;

    static {
        Fi0 fi0 = new Fi0();
        INSTANCE = fi0;
        headerUa = fi0.defaultHeader();
    }

    private Fi0() {
    }

    private final String defaultHeader() {
        return (AbstractC2995aW.i("Amazon", Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/").concat("7.4.3");
    }

    public final String getHeaderUa() {
        return headerUa;
    }

    public final void reset() {
        headerUa = defaultHeader();
    }

    public final void setHeaderUa(String str) {
        AbstractC2995aW.q(str, "<set-?>");
        headerUa = str;
    }
}
