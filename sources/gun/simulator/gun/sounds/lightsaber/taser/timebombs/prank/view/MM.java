package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class MM {
    public static /* synthetic */ PlaybackErrorEvent.Builder b() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder g(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ PlaybackStateEvent.Builder i() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder j(int i) {
        return new TrackChangeEvent.Builder(i);
    }
}
