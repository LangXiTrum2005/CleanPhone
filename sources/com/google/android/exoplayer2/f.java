package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f18130Y;

    public /* synthetic */ f(Object obj, int i2) {
        this.X = i2;
        this.f18130Y = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        Object obj2 = this.f18130Y;
        Player.Listener listener = (Player.Listener) obj;
        switch (this.X) {
            case 0:
                int i2 = ExoPlayerImpl.f17032d0;
                listener.onMediaMetadataChanged((MediaMetadata) obj2);
                break;
            case 1:
                listener.onMediaMetadataChanged(ExoPlayerImpl.this.f17037I);
                break;
            case 2:
                listener.onCues((List) obj2);
                break;
            case 3:
                listener.onCues((CueGroup) obj2);
                break;
            case 4:
                listener.onMetadata((Metadata) obj2);
                break;
            case 5:
                listener.onDeviceInfoChanged((DeviceInfo) obj2);
                break;
            default:
                listener.onVideoSizeChanged((VideoSize) obj2);
                break;
        }
    }
}
