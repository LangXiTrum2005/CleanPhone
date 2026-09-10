package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.Format;
import androidx.media3.common.util.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface VideoSink {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    public static final class VideoSinkException extends Exception {
        public final Format X;

        public VideoSinkException(Exception exc, Format format) {
            super(exc);
            this.X = format;
        }
    }

    void b();

    Surface c();

    void e(VideoFrameMetadataListener videoFrameMetadataListener);

    long f(long j, boolean z2);

    void g();

    void h(List list);

    boolean i();

    boolean isEnded();

    boolean isInitialized();

    boolean isReady();

    void j(Format format);

    void k(Format format);

    void l(boolean z2);

    void m();

    void n(Surface surface, Size size);

    void o(long j);

    void p();

    void q();

    void r(boolean z2);

    void release();

    void render(long j, long j2);

    void s(Listener listener, Executor executor);

    void setPlaybackSpeed(float f);

    public interface Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Listener f6668a = new AnonymousClass1();

        void a();

        void d();

        /* JADX INFO: renamed from: androidx.media3.exoplayer.video.VideoSink$Listener$1, reason: invalid class name */
        public class AnonymousClass1 implements Listener {
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void a() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void d() {
            }
        }
    }
}
