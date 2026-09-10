package androidx.media3.exoplayer.analytics;

import android.media.AudioProfile;
import android.media.MediaDrm;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static /* bridge */ /* synthetic */ AudioProfile c(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent e(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* synthetic */ NetworkEvent.Builder f() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder g() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ PlaybackMetrics.Builder h() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder i() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder k(int i2) {
        return new TrackChangeEvent.Builder(i2);
    }
}
