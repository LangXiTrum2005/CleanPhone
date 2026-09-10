package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.webkit.URLUtil;

/* JADX INFO: loaded from: classes4.dex */
public final class Zg0 {
    public static final Zg0 INSTANCE = new Zg0();

    private Zg0() {
    }

    public final boolean isUrlValid(String str) {
        return (str == null || str.length() == 0 || (!URLUtil.isHttpsUrl(str) && !URLUtil.isHttpUrl(str))) ? false : true;
    }
}
