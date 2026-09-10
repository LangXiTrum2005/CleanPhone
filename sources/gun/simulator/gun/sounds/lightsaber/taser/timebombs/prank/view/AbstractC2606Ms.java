package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2606Ms {
    @DoNotInline
    public static WU a(Context context, C2736Rs c2736Rs, boolean z) {
        MediaMetricsManager mediaMetricsManagerB = AbstractC4043mO.b(context.getSystemService("media_metrics"));
        C4219oO c4219oO = mediaMetricsManagerB == null ? null : new C4219oO(context, mediaMetricsManagerB.createPlaybackSession());
        if (c4219oO == null) {
            AbstractC4038mJ.f();
            return new WU(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            C4167nm c4167nm = (C4167nm) c2736Rs.q;
            c4167nm.getClass();
            c4167nm.f.a(c4219oO);
        }
        return new WU(c4219oO.c.getSessionId());
    }
}
