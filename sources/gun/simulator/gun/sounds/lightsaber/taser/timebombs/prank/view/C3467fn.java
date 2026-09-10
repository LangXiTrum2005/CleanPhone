package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3467fn implements InterfaceC2484Hz {
    public static final int[] b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i, ArrayList arrayList) {
        if (AbstractC2995aW.S(b, i, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }
}
