package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f18132Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ j(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f18132Y = obj;
        this.Z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.f18132Y;
                ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = (ExoPlayerImplInternal.PlaybackInfoUpdate) this.Z;
                int i2 = exoPlayerImpl.C - playbackInfoUpdate.f17068c;
                exoPlayerImpl.C = i2;
                boolean z2 = true;
                if (playbackInfoUpdate.d) {
                    exoPlayerImpl.D = playbackInfoUpdate.f17069e;
                    exoPlayerImpl.f17035E = true;
                }
                if (playbackInfoUpdate.f) {
                    exoPlayerImpl.f17036F = playbackInfoUpdate.g;
                }
                if (i2 == 0) {
                    Timeline timeline = playbackInfoUpdate.f17067b.f17176a;
                    if (!exoPlayerImpl.a0.f17176a.p() && timeline.p()) {
                        exoPlayerImpl.f17047b0 = -1;
                        exoPlayerImpl.f17049c0 = 0L;
                    }
                    if (!timeline.p()) {
                        List listAsList = Arrays.asList(((PlaylistTimeline) timeline).j0);
                        Assertions.d(listAsList.size() == exoPlayerImpl.f17054n.size());
                        for (int i3 = 0; i3 < listAsList.size(); i3++) {
                            ((ExoPlayerImpl.MediaSourceHolderSnapshot) exoPlayerImpl.f17054n.get(i3)).f17061b = (Timeline) listAsList.get(i3);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (exoPlayerImpl.f17035E) {
                        if (playbackInfoUpdate.f17067b.f17177b.equals(exoPlayerImpl.a0.f17177b) && playbackInfoUpdate.f17067b.d == exoPlayerImpl.a0.r) {
                            z2 = false;
                        }
                        if (z2) {
                            if (timeline.p() || playbackInfoUpdate.f17067b.f17177b.a()) {
                                j = playbackInfoUpdate.f17067b.d;
                            } else {
                                PlaybackInfo playbackInfo = playbackInfoUpdate.f17067b;
                                MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.f17177b;
                                long j2 = playbackInfo.d;
                                Object obj = mediaPeriodId.f18347a;
                                Timeline.Period period = exoPlayerImpl.m;
                                timeline.g(obj, period);
                                j = j2 + period.f0;
                            }
                        }
                    } else {
                        z2 = false;
                    }
                    long j3 = j;
                    exoPlayerImpl.f17035E = false;
                    exoPlayerImpl.x(playbackInfoUpdate.f17067b, 1, exoPlayerImpl.f17036F, z2, exoPlayerImpl.D, j3);
                    return;
                }
                return;
            default:
                PlayerMessage playerMessage = (PlayerMessage) this.Z;
                ((ExoPlayerImplInternal) this.f18132Y).getClass();
                try {
                    synchronized (playerMessage) {
                    }
                    try {
                        playerMessage.f17189a.handleMessage(playerMessage.d, playerMessage.f17192e);
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
