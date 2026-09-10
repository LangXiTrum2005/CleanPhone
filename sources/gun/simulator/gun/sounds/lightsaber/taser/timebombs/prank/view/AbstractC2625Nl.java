package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2625Nl extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2625Nl(String str, int i) {
        super(str);
        if (i != 1) {
        } else {
            Preconditions.checkNotEmpty(str, "Detail message must not be empty");
            super(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2625Nl(String str, Throwable th, int i) {
        super(str, th);
        if (i != 1) {
        } else {
            Preconditions.checkNotEmpty(str, "Detail message must not be empty");
            super(str, th);
        }
    }
}
