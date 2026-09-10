package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import com.google.common.base.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements ListenerSet.Event, Function {
    public final /* synthetic */ int X;

    public /* synthetic */ i(int i2) {
        this.X = i2;
    }

    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return new DefaultAnalyticsCollector((Clock) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        Player.Listener listener = (Player.Listener) obj;
        switch (this.X) {
            case 0:
                int i2 = ExoPlayerImpl.l0;
                listener.onPlayerError(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), 1003));
                break;
            default:
                listener.onRenderedFirstFrame();
                break;
        }
    }
}
