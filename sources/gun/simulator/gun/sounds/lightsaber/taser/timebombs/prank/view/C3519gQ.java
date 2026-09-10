package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3519gQ implements Ca0, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4415a;

    public C3519gQ(int i) {
        FW.n(i, "expectedValuesPerKey");
        this.f4415a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ca0
    public final Object get() {
        return new ArrayList(this.f4415a);
    }
}
