package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaDrm;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3472fq {
    @DoNotInline
    public static boolean a(@Nullable Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    @DoNotInline
    public static int b(Throwable th) {
        return Ug0.u(Ug0.v(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
