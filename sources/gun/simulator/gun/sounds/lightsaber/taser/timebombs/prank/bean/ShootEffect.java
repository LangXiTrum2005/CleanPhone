package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;

/* JADX INFO: loaded from: classes4.dex */
public final class ShootEffect {
    private final int effectId;
    private final String effectName;
    private final int effectNameId;

    public /* synthetic */ ShootEffect(int i, int i2, String str, int i3, AbstractC2471Hm abstractC2471Hm) {
        this(i, i2, (i3 & 4) != 0 ? null : str);
    }

    public final int getEffectId() {
        return this.effectId;
    }

    public final String getEffectName() {
        return this.effectName;
    }

    public final int getEffectNameId() {
        return this.effectNameId;
    }

    public ShootEffect(int i, int i2, String str) {
        this.effectId = i;
        this.effectNameId = i2;
        this.effectName = str;
    }
}
