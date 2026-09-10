package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class CR extends Ei0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CR(String str) {
        super(EnumC4719u30.API_REQUEST_ERROR, str, null);
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
    }
}
