package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;

/* JADX INFO: loaded from: classes.dex */
final class VideoFrameRenderControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositingVideoSinkProvider.FrameRendererImpl f6660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VideoFrameReleaseControl f6661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VideoFrameReleaseControl.FrameReleaseInfo f6662c = new VideoFrameReleaseControl.FrameReleaseInfo();
    public final TimedValueQueue d = new TimedValueQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimedValueQueue f6663e = new TimedValueQueue();
    public final LongArrayQueue f;
    public VideoSize g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VideoSize f6664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6665i;
    public long j;

    public interface FrameRenderer {
    }

    public VideoFrameRenderControl(CompositingVideoSinkProvider.FrameRendererImpl frameRendererImpl, VideoFrameReleaseControl videoFrameReleaseControl) {
        this.f6660a = frameRendererImpl;
        this.f6661b = videoFrameReleaseControl;
        LongArrayQueue longArrayQueue = new LongArrayQueue();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        longArrayQueue.f5654a = 0;
        longArrayQueue.f5655b = 0;
        longArrayQueue.f5656c = new long[iHighestOneBit];
        longArrayQueue.d = iHighestOneBit - 1;
        this.f = longArrayQueue;
        this.f6664h = VideoSize.f5552e;
        this.j = -9223372036854775807L;
    }

    public final void a() {
        LongArrayQueue longArrayQueue = this.f;
        longArrayQueue.f5654a = 0;
        longArrayQueue.f5655b = 0;
        this.j = -9223372036854775807L;
        TimedValueQueue timedValueQueue = this.f6663e;
        if (timedValueQueue.h() > 0) {
            Assertions.b(timedValueQueue.h() > 0);
            while (timedValueQueue.h() > 1) {
                timedValueQueue.e();
            }
            Object objE = timedValueQueue.e();
            objE.getClass();
            timedValueQueue.a(0L, (Long) objE);
        }
        VideoSize videoSize = this.g;
        TimedValueQueue timedValueQueue2 = this.d;
        if (videoSize != null) {
            timedValueQueue2.b();
            return;
        }
        if (timedValueQueue2.h() > 0) {
            Assertions.b(timedValueQueue2.h() > 0);
            while (timedValueQueue2.h() > 1) {
                timedValueQueue2.e();
            }
            Object objE2 = timedValueQueue2.e();
            objE2.getClass();
            this.g = (VideoSize) objE2;
        }
    }
}
