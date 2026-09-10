package m0;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.view.Display;
import android.view.RoundedCorner;
import com.google.android.gms.internal.ads.f6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static r1.c a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return r1.c.f49256d;
        }
        f6 f6Var = new f6();
        boolean z11 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
        f6Var.f14258a = true;
        f6Var.f14259b = z11;
        f6Var.f14260c = z10;
        return f6Var.a();
    }

    public static y b(int i10, Display display) {
        RoundedCorner roundedCorner;
        int i11;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i10)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i11 = 1;
            if (position != 1) {
                i11 = 2;
                if (position != 2) {
                    i11 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(l1.d.e(position, "Invalid position: "));
                    }
                }
            }
        } else {
            i11 = 0;
        }
        return new y(i11, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static void c(com.google.android.gms.internal.consent_sdk.x xVar, q1.j jVar) {
        LogSessionId logSessionIdA = jVar.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ((MediaFormat) xVar.f23261b).setString("log-session-id", logSessionIdA.getStringId());
    }
}
