package com.google.android.exoplayer2.offline;

import android.os.Handler;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadHelper {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DownloadHelper$1, reason: invalid class name */
    class AnonymousClass1 implements VideoRendererEventListener {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DownloadHelper$2, reason: invalid class name */
    class AnonymousClass2 implements AudioRendererEventListener {
    }

    public interface Callback {
    }

    public static final class DownloadTrackSelection extends BaseTrackSelection {

        public static final class Factory implements ExoTrackSelection.Factory {
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public final int getSelectedIndex() {
            return 0;
        }
    }

    public static final class FakeBandwidthMeter implements BandwidthMeter {
        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public final TransferListener a() {
            return null;
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public final void b(BandwidthMeter.EventListener eventListener) {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public final void d(Handler handler, BandwidthMeter.EventListener eventListener) {
        }
    }

    public static class LiveContentUnsupportedException extends IOException {
    }

    public static final class MediaPreparer implements MediaSource.MediaSourceCaller, MediaPeriod.Callback, Handler.Callback {
        public Timeline X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public MediaPeriod[] f18260Y;

        @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
        public final void F(BaseMediaSource baseMediaSource, Timeline timeline) {
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
            this.f18260Y = mediaPeriodArr;
            if (iH > 0) {
                timeline.l(0);
                throw null;
            }
            for (int i2 = 0; i2 < iH; i2++) {
                mediaPeriodArr[i2].d(this, 0L);
            }
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public final void a(SequenceableLoader sequenceableLoader) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public final void f(MediaPeriod mediaPeriod) {
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
                r1 = 0
                if (r0 == 0) goto L27
                r2 = 1
                if (r0 == r2) goto L20
                r2 = 2
                if (r0 == r2) goto L1b
                r4 = 3
                r2 = 0
                if (r0 == r4) goto L10
                return r2
            L10:
                com.google.android.exoplayer2.source.MediaPeriod[] r4 = r3.f18260Y
                if (r4 == 0) goto L1a
                int r0 = r4.length
                if (r0 <= 0) goto L1a
                r4 = r4[r2]
                throw r1
            L1a:
                throw r1
            L1b:
                java.lang.Object r4 = r4.obj
                com.google.android.exoplayer2.source.MediaPeriod r4 = (com.google.android.exoplayer2.source.MediaPeriod) r4
                throw r1
            L20:
                com.google.android.exoplayer2.source.MediaPeriod[] r4 = r3.f18260Y     // Catch: java.io.IOException -> L26
                if (r4 != 0) goto L25
                throw r1
            L25:
                throw r1
            L26:
                throw r1
            L27:
                int r4 = com.google.android.exoplayer2.analytics.PlayerId.f17257b
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadHelper.MediaPreparer.handleMessage(android.os.Message):boolean");
        }
    }

    static {
        DefaultTrackSelector.Parameters parameters = DefaultTrackSelector.Parameters.Q0;
        parameters.getClass();
        DefaultTrackSelector.Parameters.Builder builder = new DefaultTrackSelector.Parameters.Builder(parameters);
        builder.x = true;
        builder.f18678J = false;
        new DefaultTrackSelector.Parameters(builder);
    }
}
