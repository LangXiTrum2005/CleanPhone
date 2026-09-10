package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4337pj {
    public static boolean a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            return version.major() > 2;
        }
        if (version.minor() != 1) {
            return version.minor() > 1;
        }
        return version.patch() >= 0;
    }

    public static boolean b() {
        return C4512rj.d;
    }
}
