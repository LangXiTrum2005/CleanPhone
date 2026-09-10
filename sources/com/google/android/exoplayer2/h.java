package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements ListenerSet.IterationFinishedEvent, ExoPlayerImplInternal.PlaybackInfoUpdateListener, ListenerSet.Event {
    public final /* synthetic */ ExoPlayerImpl X;

    public /* synthetic */ h(ExoPlayerImpl exoPlayerImpl) {
        this.X = exoPlayerImpl;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public void f(Object obj, FlagSet flagSet) {
        int i2 = ExoPlayerImpl.f17032d0;
        ExoPlayerImpl exoPlayerImpl = this.X;
        exoPlayerImpl.getClass();
        ((Player.Listener) obj).onEvents(exoPlayerImpl.f, new Player.Events(flagSet));
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onAvailableCommandsChanged(this.X.H);
    }
}
