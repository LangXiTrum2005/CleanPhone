package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class V3 {
    private V3() {
    }

    public /* synthetic */ V3(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    public final W3 fromValue(int i) {
        W3 w3 = W3.ERROR_LOG_LEVEL_DEBUG;
        if (i == w3.getLevel()) {
            return w3;
        }
        W3 w4 = W3.ERROR_LOG_LEVEL_ERROR;
        if (i == w4.getLevel()) {
            return w4;
        }
        W3 w5 = W3.ERROR_LOG_LEVEL_OFF;
        return i == w5.getLevel() ? w5 : w4;
    }
}
