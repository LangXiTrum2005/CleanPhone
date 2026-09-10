package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class DefaultLoadControl implements LoadControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultAllocator f5842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5844c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5845e;
    public final int f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f5846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5847i;

    public static final class Builder {
    }

    public static class PlayerLoadingState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5849b;
    }

    public DefaultLoadControl() {
        DefaultAllocator defaultAllocator = new DefaultAllocator();
        g(2500, 0, "bufferForPlaybackMs", "0");
        g(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        g(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        g(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        g(50000, 50000, "maxBufferMs", "minBufferMs");
        g(0, 0, "backBufferDurationMs", "0");
        this.f5842a = defaultAllocator;
        long j = 50000;
        this.f5843b = Util.I(j);
        this.f5844c = Util.I(j);
        this.d = Util.I(2500);
        this.f5845e = Util.I(5000);
        this.f = -1;
        this.g = Util.I(0);
        this.f5846h = new HashMap();
        this.f5847i = -1L;
    }

    public static void g(int i2, int i3, String str, String str2) {
        Assertions.a(str + " cannot be less than " + str2, i2 >= i3);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final boolean a(LoadControl.Parameters parameters) {
        int i2;
        long jRound = parameters.f5913b;
        float f = parameters.f5914c;
        int i3 = Util.f5683a;
        if (f != 1.0f) {
            jRound = Math.round(jRound / ((double) f));
        }
        long jMin = parameters.d ? this.f5845e : this.d;
        long j = parameters.f5915e;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin <= 0 || jRound >= jMin) {
            return true;
        }
        DefaultAllocator defaultAllocator = this.f5842a;
        synchronized (defaultAllocator) {
            i2 = defaultAllocator.f6560e * defaultAllocator.f6558b;
        }
        return i2 >= h();
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final void b(PlayerId playerId) {
        long id = Thread.currentThread().getId();
        long j = this.f5847i;
        Assertions.d("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.f5847i = id;
        HashMap map = this.f5846h;
        if (!map.containsKey(playerId)) {
            map.put(playerId, new PlayerLoadingState());
        }
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) map.get(playerId);
        playerLoadingState.getClass();
        int i2 = this.f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        playerLoadingState.f5849b = i2;
        playerLoadingState.f5848a = false;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final void c(PlayerId playerId) {
        HashMap map = this.f5846h;
        if (map.remove(playerId) != null) {
            i();
        }
        if (map.isEmpty()) {
            this.f5847i = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final boolean d(LoadControl.Parameters parameters) {
        int i2;
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) this.f5846h.get(parameters.f5912a);
        playerLoadingState.getClass();
        DefaultAllocator defaultAllocator = this.f5842a;
        synchronized (defaultAllocator) {
            i2 = defaultAllocator.f6560e * defaultAllocator.f6558b;
        }
        boolean z2 = i2 >= h();
        float f = parameters.f5914c;
        long j = this.f5844c;
        long jMin = this.f5843b;
        if (f > 1.0f) {
            jMin = Math.min(Util.v(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = parameters.f5913b;
        if (j2 < jMax) {
            playerLoadingState.f5848a = !z2;
            if (z2 && j2 < 500000) {
                Log.g("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z2) {
            playerLoadingState.f5848a = false;
        }
        return playerLoadingState.f5848a;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final void e(PlayerId playerId) {
        if (this.f5846h.remove(playerId) != null) {
            i();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.LoadControl
    public final void f(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) this.f5846h.get(playerId);
        playerLoadingState.getClass();
        int iMax = this.f;
        if (iMax == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 < rendererArr.length) {
                    if (exoTrackSelectionArr[i2] != null) {
                        switch (rendererArr[i2].getTrackType()) {
                            case -2:
                                i4 = 0;
                                i3 += i4;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i4 = 144310272;
                                i3 += i4;
                                break;
                            case 1:
                                i3 += i4;
                                break;
                            case 2:
                                i4 = 131072000;
                                i3 += i4;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                i3 += i4;
                                break;
                        }
                    }
                    i2++;
                } else {
                    iMax = Math.max(13107200, i3);
                }
            }
        }
        playerLoadingState.f5849b = iMax;
        i();
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final DefaultAllocator getAllocator() {
        return this.f5842a;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final long getBackBufferDurationUs() {
        return this.g;
    }

    public final int h() {
        Iterator it = this.f5846h.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((PlayerLoadingState) it.next()).f5849b;
        }
        return i2;
    }

    public final void i() {
        if (!this.f5846h.isEmpty()) {
            this.f5842a.c(h());
            return;
        }
        DefaultAllocator defaultAllocator = this.f5842a;
        synchronized (defaultAllocator) {
            if (defaultAllocator.f6557a) {
                defaultAllocator.c(0);
            }
        }
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final boolean retainBackBufferFromKeyframe() {
        return false;
    }
}
