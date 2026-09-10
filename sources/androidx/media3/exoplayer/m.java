package androidx.media3.exoplayer;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements ListenerSet.IterationFinishedEvent, ExoPlayerImplInternal.PlaybackInfoUpdateListener, ListenerSet.Event {
    public final /* synthetic */ ExoPlayerImpl X;

    public /* synthetic */ m(ExoPlayerImpl exoPlayerImpl) {
        this.X = exoPlayerImpl;
    }

    public void a(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        int i2 = ExoPlayerImpl.l0;
        ExoPlayerImpl exoPlayerImpl = this.X;
        exoPlayerImpl.getClass();
        exoPlayerImpl.f5884i.post(new n(0, exoPlayerImpl, playbackInfoUpdate));
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void c(Object obj, FlagSet flagSet) {
        int i2 = ExoPlayerImpl.l0;
        ExoPlayerImpl exoPlayerImpl = this.X;
        exoPlayerImpl.getClass();
        ((Player.Listener) obj).onEvents(exoPlayerImpl.f, new Player.Events(flagSet));
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onAvailableCommandsChanged(this.X.f5870N);
    }
}
