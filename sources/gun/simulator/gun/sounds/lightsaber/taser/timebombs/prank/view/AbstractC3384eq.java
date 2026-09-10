package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3384eq {
    @DoNotInline
    public static boolean a(@Nullable Throwable th) {
        return th instanceof DeniedByServerException;
    }

    @DoNotInline
    public static boolean b(@Nullable Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
