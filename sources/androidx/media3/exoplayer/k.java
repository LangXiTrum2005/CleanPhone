package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ boolean f6261Y;

    public /* synthetic */ k(boolean z2, int i2) {
        this.X = i2;
        this.f6261Y = z2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        boolean z2 = this.f6261Y;
        Player.Listener listener = (Player.Listener) obj;
        switch (this.X) {
            case 0:
                int i2 = ExoPlayerImpl.l0;
                listener.onShuffleModeEnabledChanged(z2);
                break;
            default:
                listener.onSkipSilenceEnabledChanged(z2);
                break;
        }
    }
}
