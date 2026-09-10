package androidx.media3.exoplayer.offline;

import android.os.Handler;
import androidx.media3.common.Timeline;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadHelper {

    /* JADX INFO: renamed from: androidx.media3.exoplayer.offline.DownloadHelper$1, reason: invalid class name */
    class AnonymousClass1 implements VideoRendererEventListener {
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.offline.DownloadHelper$2, reason: invalid class name */
    class AnonymousClass2 implements AudioRendererEventListener {
    }

    public interface Callback {
    }

    public static final class DownloadTrackSelection extends BaseTrackSelection {

        public static final class Factory implements ExoTrackSelection.Factory {
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final int getSelectedIndex() {
            return 0;
        }
    }

    public static final class FakeBandwidthMeter implements BandwidthMeter {
        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public final TransferListener a() {
            return null;
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public final void b(BandwidthMeter.EventListener eventListener) {
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public final void d(Handler handler, BandwidthMeter.EventListener eventListener) {
        }
    }

    public static class LiveContentUnsupportedException extends IOException {
    }

    public static final class MediaPreparer implements MediaSource.MediaSourceCaller, MediaPeriod.Callback, Handler.Callback {
        public Timeline X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public MediaPeriod[] f6326Y;

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public final void b(MediaPeriod mediaPeriod) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public final void e(SequenceableLoader sequenceableLoader) {
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            throw null;
         */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                int r0 = r4.what
                r1 = 1
                r2 = 0
                if (r0 == r1) goto L28
                r1 = 2
                if (r0 == r1) goto L21
                r1 = 3
                if (r0 == r1) goto L1c
                r4 = 4
                r1 = 0
                if (r0 == r4) goto L11
                return r1
            L11:
                androidx.media3.exoplayer.source.MediaPeriod[] r4 = r3.f6326Y
                if (r4 == 0) goto L1b
                int r0 = r4.length
                if (r0 <= 0) goto L1b
                r4 = r4[r1]
                throw r2
            L1b:
                throw r2
            L1c:
                java.lang.Object r4 = r4.obj
                androidx.media3.exoplayer.source.MediaPeriod r4 = (androidx.media3.exoplayer.source.MediaPeriod) r4
                throw r2
            L21:
                androidx.media3.exoplayer.source.MediaPeriod[] r4 = r3.f6326Y     // Catch: java.io.IOException -> L27
                if (r4 != 0) goto L26
                throw r2
            L26:
                throw r2
            L27:
                throw r2
            L28:
                int r4 = androidx.media3.exoplayer.analytics.PlayerId.d
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.offline.DownloadHelper.MediaPreparer.handleMessage(android.os.Message):boolean");
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
        public final void u(BaseMediaSource baseMediaSource, Timeline timeline) {
            if (this.X != null) {
                return;
            }
            if (timeline.m(0, new Timeline.Window(), 0L).a()) {
                new LiveContentUnsupportedException();
                throw null;
            }
            this.X = timeline;
            int iH = timeline.h();
            MediaPeriod[] mediaPeriodArr = new MediaPeriod[iH];
            this.f6326Y = mediaPeriodArr;
            if (iH > 0) {
                timeline.l(0);
                throw null;
            }
            for (int i2 = 0; i2 < iH; i2++) {
                mediaPeriodArr[i2].f(this, 0L);
            }
        }
    }

    public static final class UnreleaseableRendererCapabilitiesList implements RendererCapabilitiesList {
    }

    static {
        DefaultTrackSelector.Parameters parameters = DefaultTrackSelector.Parameters.D;
        parameters.getClass();
        DefaultTrackSelector.Parameters.Builder builder = new DefaultTrackSelector.Parameters.Builder(parameters);
        builder.q = true;
        builder.x = false;
        new DefaultTrackSelector.Parameters(builder);
    }
}
