package androidx.media3.exoplayer;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ListenerSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ListenerSet.Event, MediaPeriodHolder.Factory {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f6250Y;

    public /* synthetic */ f(Object obj, int i2) {
        this.X = i2;
        this.f6250Y = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        Object obj2 = this.f6250Y;
        Player.Listener listener = (Player.Listener) obj;
        switch (this.X) {
            case 0:
                int i2 = ExoPlayerImpl.l0;
                listener.onMediaMetadataChanged((MediaMetadata) obj2);
                break;
            case 1:
                int i3 = ExoPlayerImpl.l0;
                listener.onTrackSelectionParametersChanged((TrackSelectionParameters) obj2);
                break;
            case 2:
                listener.onMediaMetadataChanged(ExoPlayerImpl.this.O);
                break;
            case 3:
            default:
                listener.onVideoSizeChanged((VideoSize) obj2);
                break;
            case 4:
                listener.onCues((CueGroup) obj2);
                break;
            case 5:
                listener.onMetadata((Metadata) obj2);
                break;
            case 6:
                listener.onCues((List) obj2);
                break;
        }
    }
}
