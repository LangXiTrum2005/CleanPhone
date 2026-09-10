package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes.dex */
public interface MediaSource {

    public static final class MediaPeriodId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f6384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6386c;
        public final long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6387e;

        public MediaPeriodId(Object obj) {
            this(obj, -1L);
        }

        public final MediaPeriodId a(Object obj) {
            if (this.f6384a.equals(obj)) {
                return this;
            }
            return new MediaPeriodId(obj, this.f6385b, this.f6386c, this.d, this.f6387e);
        }

        public final boolean b() {
            return this.f6385b != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaPeriodId)) {
                return false;
            }
            MediaPeriodId mediaPeriodId = (MediaPeriodId) obj;
            return this.f6384a.equals(mediaPeriodId.f6384a) && this.f6385b == mediaPeriodId.f6385b && this.f6386c == mediaPeriodId.f6386c && this.d == mediaPeriodId.d && this.f6387e == mediaPeriodId.f6387e;
        }

        public final int hashCode() {
            return ((((((((this.f6384a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f6385b) * 31) + this.f6386c) * 31) + ((int) this.d)) * 31) + this.f6387e;
        }

        public MediaPeriodId(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public MediaPeriodId(Object obj, long j, int i2) {
            this(obj, -1, -1, j, i2);
        }

        public MediaPeriodId(Object obj, int i2, int i3, long j, int i4) {
            this.f6384a = obj;
            this.f6385b = i2;
            this.f6386c = i3;
            this.d = j;
            this.f6387e = i4;
        }
    }

    public interface MediaSourceCaller {
        void u(BaseMediaSource baseMediaSource, Timeline timeline);
    }

    MediaPeriod A(MediaPeriodId mediaPeriodId, Allocator allocator, long j);

    void C(Handler handler, DrmSessionEventListener drmSessionEventListener);

    void F(DrmSessionEventListener drmSessionEventListener);

    void G(MediaPeriod mediaPeriod);

    void I(MediaSourceCaller mediaSourceCaller, TransferListener transferListener, PlayerId playerId);

    void L(MediaSourceCaller mediaSourceCaller);

    default void M(MediaItem mediaItem) {
    }

    void Q(MediaSourceCaller mediaSourceCaller);

    void R(MediaSourceCaller mediaSourceCaller);

    MediaItem m();

    void maybeThrowSourceInfoRefreshError();

    default boolean r() {
        return !(this instanceof ConcatenatingMediaSource);
    }

    default Timeline s() {
        return null;
    }

    void v(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    void x(MediaSourceEventListener mediaSourceEventListener);

    public interface Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Factory f6383a = MediaSourceFactory.f6393b;

        MediaSource a(MediaItem mediaItem);

        default void b(boolean z2) {
        }

        default void c(DefaultSubtitleParserFactory defaultSubtitleParserFactory) {
        }
    }
}
