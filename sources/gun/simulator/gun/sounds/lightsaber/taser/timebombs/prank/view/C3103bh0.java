package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3103bh0 extends AbstractC5170z9 {
    public final Object i;

    public C3103bh0(C4215oK c4215oK, Object obj) {
        super(Collections.emptyList());
        j(c4215oK);
        this.i = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final float b() {
        return 1.0f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final Object e() {
        C4215oK c4215oK = this.e;
        float f = this.d;
        Object obj = this.i;
        return c4215oK.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final Object f(C5090yG c5090yG, float f) {
        return e();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final void i(float f) {
        this.d = f;
    }
}
