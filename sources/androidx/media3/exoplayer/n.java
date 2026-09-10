package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f6324Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ n(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f6324Y = obj;
        this.Z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = true;
        switch (this.X) {
            case 0:
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.f6324Y;
                ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = (ExoPlayerImplInternal.PlaybackInfoUpdate) this.Z;
                int i2 = exoPlayerImpl.H - playbackInfoUpdate.f5901c;
                exoPlayerImpl.H = i2;
                if (playbackInfoUpdate.d) {
                    exoPlayerImpl.f5868I = playbackInfoUpdate.f5902e;
                    exoPlayerImpl.f5869J = true;
                }
                if (i2 == 0) {
                    Timeline timeline = playbackInfoUpdate.f5900b.f5962a;
                    if (!exoPlayerImpl.i0.f5962a.p() && timeline.p()) {
                        exoPlayerImpl.j0 = -1;
                        exoPlayerImpl.k0 = 0L;
                    }
                    if (!timeline.p()) {
                        List listAsList = Arrays.asList(((PlaylistTimeline) timeline).f5979i);
                        Assertions.e(listAsList.size() == exoPlayerImpl.o.size());
                        for (int i3 = 0; i3 < listAsList.size(); i3++) {
                            ((ExoPlayerImpl.MediaSourceHolderSnapshot) exoPlayerImpl.o.get(i3)).f5893b = (Timeline) listAsList.get(i3);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (exoPlayerImpl.f5869J) {
                        if (playbackInfoUpdate.f5900b.f5963b.equals(exoPlayerImpl.i0.f5963b) && playbackInfoUpdate.f5900b.d == exoPlayerImpl.i0.s) {
                            z2 = false;
                        }
                        if (z2) {
                            if (timeline.p() || playbackInfoUpdate.f5900b.f5963b.b()) {
                                j = playbackInfoUpdate.f5900b.d;
                            } else {
                                PlaybackInfo playbackInfo = playbackInfoUpdate.f5900b;
                                MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.f5963b;
                                long j2 = playbackInfo.d;
                                Object obj = mediaPeriodId.f6384a;
                                Timeline.Period period = exoPlayerImpl.f5886n;
                                timeline.g(obj, period);
                                j = j2 + period.f5511e;
                            }
                        }
                    } else {
                        z2 = false;
                    }
                    long j3 = j;
                    exoPlayerImpl.f5869J = false;
                    exoPlayerImpl.a0(playbackInfoUpdate.f5900b, 1, z2, exoPlayerImpl.f5868I, j3, -1, false);
                    return;
                }
                return;
            default:
                PlayerMessage playerMessage = (PlayerMessage) this.Z;
                int i4 = ExoPlayerImplInternal.W0;
                ((ExoPlayerImplInternal) this.f6324Y).getClass();
                try {
                    synchronized (playerMessage) {
                    }
                    try {
                        playerMessage.f5971a.handleMessage(playerMessage.d, playerMessage.f5974e);
                        return;
                    } finally {
                        playerMessage.b(true);
                    }
                } catch (ExoPlaybackException e2) {
                    Log.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
                    throw new RuntimeException(e2);
                }
        }
    }
}
