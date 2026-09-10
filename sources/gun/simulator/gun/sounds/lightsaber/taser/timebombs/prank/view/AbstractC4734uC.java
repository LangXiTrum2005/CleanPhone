package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4734uC extends AbstractC2995aW {
    public Object[] f;
    public int g;
    public boolean h;

    public final void G0(int i) {
        Object[] objArr = this.f;
        if (objArr.length < i) {
            this.f = Arrays.copyOf(objArr, AbstractC2995aW.y(objArr.length, i));
            this.h = false;
        } else if (this.h) {
            this.f = (Object[]) objArr.clone();
            this.h = false;
        }
    }
}
