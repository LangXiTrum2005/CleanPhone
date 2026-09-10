package androidx.media3.exoplayer.analytics;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.base.Objects;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface AnalyticsListener {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface EventFlags {
    }

    public static final class EventTime {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Timeline f5991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5992c;
        public final MediaSource.MediaPeriodId d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f5993e;
        public final Timeline f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f5994h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f5995i;
        public final long j;

        public EventTime(long j, Timeline timeline, int i2, MediaSource.MediaPeriodId mediaPeriodId, long j2, Timeline timeline2, int i3, MediaSource.MediaPeriodId mediaPeriodId2, long j3, long j4) {
            this.f5990a = j;
            this.f5991b = timeline;
            this.f5992c = i2;
            this.d = mediaPeriodId;
            this.f5993e = j2;
            this.f = timeline2;
            this.g = i3;
            this.f5994h = mediaPeriodId2;
            this.f5995i = j3;
            this.j = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && EventTime.class == obj.getClass()) {
                EventTime eventTime = (EventTime) obj;
                if (this.f5990a == eventTime.f5990a && this.f5992c == eventTime.f5992c && this.f5993e == eventTime.f5993e && this.g == eventTime.g && this.f5995i == eventTime.f5995i && this.j == eventTime.j && Objects.a(this.f5991b, eventTime.f5991b) && Objects.a(this.d, eventTime.d) && Objects.a(this.f, eventTime.f) && Objects.a(this.f5994h, eventTime.f5994h)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f5990a), this.f5991b, Integer.valueOf(this.f5992c), this.d, Long.valueOf(this.f5993e), this.f, Integer.valueOf(this.g), this.f5994h, Long.valueOf(this.f5995i), Long.valueOf(this.j)});
        }
    }

    public static final class Events {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlagSet f5996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray f5997b;

        public Events(FlagSet flagSet, SparseArray sparseArray) {
            this.f5996a = flagSet;
            SparseBooleanArray sparseBooleanArray = flagSet.f5397a;
            SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                int iA = flagSet.a(i2);
                EventTime eventTime = (EventTime) sparseArray.get(iA);
                eventTime.getClass();
                sparseArray2.append(iA, eventTime);
            }
            this.f5997b = sparseArray2;
        }

        public final boolean a(int i2) {
            return this.f5996a.f5397a.get(i2);
        }

        public final EventTime b(int i2) {
            EventTime eventTime = (EventTime) this.f5997b.get(i2);
            eventTime.getClass();
            return eventTime;
        }
    }

    default void A(EventTime eventTime, String str) {
    }

    default void C(EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void D(EventTime eventTime, String str) {
    }

    default void E(EventTime eventTime, int i2) {
    }

    default void H(EventTime eventTime) {
    }

    default void J(EventTime eventTime, Tracks tracks) {
    }

    default void K(EventTime eventTime, int i2) {
    }

    default void L(EventTime eventTime, VideoSize videoSize) {
    }

    default void M(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    default void N(Player player, Events events) {
    }

    default void O(EventTime eventTime) {
    }

    default void a(EventTime eventTime, boolean z2) {
    }

    default void d(EventTime eventTime, boolean z2) {
    }

    default void e(EventTime eventTime, Metadata metadata) {
    }

    default void f(EventTime eventTime, boolean z2) {
    }

    default void g(EventTime eventTime, PlaybackException playbackException) {
    }

    default void h(EventTime eventTime, boolean z2, int i2) {
    }

    default void j(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void k(EventTime eventTime) {
    }

    default void o(EventTime eventTime, int i2) {
    }

    default void p(EventTime eventTime, Exception exc) {
    }

    default void r(EventTime eventTime, int i2, int i3) {
    }

    default void s(EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
    }

    default void t(EventTime eventTime, int i2) {
    }

    default void u(EventTime eventTime, float f) {
    }

    default void v(EventTime eventTime, boolean z2) {
    }

    default void w(EventTime eventTime, int i2) {
    }

    default void x(EventTime eventTime, int i2, long j, long j2) {
    }

    default void y(EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void z(EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    default void I(EventTime eventTime) {
    }

    default void c(EventTime eventTime) {
    }

    default void l(EventTime eventTime) {
    }

    default void B(EventTime eventTime, String str) {
    }

    default void G(EventTime eventTime, int i2) {
    }

    default void P(EventTime eventTime, String str) {
    }

    default void b(EventTime eventTime, Object obj) {
    }

    default void i(EventTime eventTime, Format format) {
    }

    default void m(EventTime eventTime, Format format) {
    }

    default void q(EventTime eventTime, int i2) {
    }

    default void F(int i2, long j, EventTime eventTime) {
    }

    default void n(EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
    }
}
