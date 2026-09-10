package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class JR extends Ei0 {
    public JR() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JR(String str) {
        super(EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE, str, null);
        AbstractC2995aW.q(str, NotificationCompat.CATEGORY_MESSAGE);
    }

    public /* synthetic */ JR(String str, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? "No space left on device" : str);
    }
}
