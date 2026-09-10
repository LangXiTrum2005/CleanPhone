package androidx.media3.ui;

import androidx.media3.common.Player;
import androidx.media3.common.util.Util;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class WearUnsuitableOutputPlaybackSuppressionResolverListener implements Player.Listener {
    static {
        TimeUnit.MINUTES.toMillis(5L);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onEvents(Player player, Player.Events events) {
        if (Util.f5683a >= 20) {
            throw null;
        }
    }
}
