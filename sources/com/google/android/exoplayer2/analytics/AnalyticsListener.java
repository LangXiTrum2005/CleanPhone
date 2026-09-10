package com.google.android.exoplayer2.analytics;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Objects;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public interface AnalyticsListener {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface EventFlags {
    }

    public static final class EventTime {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Timeline f17214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17215c;
        public final MediaSource.MediaPeriodId d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f17216e;
        public final Timeline f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f17217h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f17218i;
        public final long j;

        public EventTime(long j, Timeline timeline, int i2, MediaSource.MediaPeriodId mediaPeriodId, long j2, Timeline timeline2, int i3, MediaSource.MediaPeriodId mediaPeriodId2, long j3, long j4) {
            this.f17213a = j;
            this.f17214b = timeline;
            this.f17215c = i2;
            this.d = mediaPeriodId;
            this.f17216e = j2;
            this.f = timeline2;
            this.g = i3;
            this.f17217h = mediaPeriodId2;
            this.f17218i = j3;
            this.j = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && EventTime.class == obj.getClass()) {
                EventTime eventTime = (EventTime) obj;
                if (this.f17213a == eventTime.f17213a && this.f17215c == eventTime.f17215c && this.f17216e == eventTime.f17216e && this.g == eventTime.g && this.f17218i == eventTime.f17218i && this.j == eventTime.j && Objects.a(this.f17214b, eventTime.f17214b) && Objects.a(this.d, eventTime.d) && Objects.a(this.f, eventTime.f) && Objects.a(this.f17217h, eventTime.f17217h)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f17213a), this.f17214b, Integer.valueOf(this.f17215c), this.d, Long.valueOf(this.f17216e), this.f, Integer.valueOf(this.g), this.f17217h, Long.valueOf(this.f17218i), Long.valueOf(this.j)});
        }
    }

    public static final class Events {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlagSet f17219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray f17220b;

        public Events(FlagSet flagSet, SparseArray sparseArray) {
            this.f17219a = flagSet;
            SparseBooleanArray sparseBooleanArray = flagSet.f18903a;
            SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                int iA = flagSet.a(i2);
                EventTime eventTime = (EventTime) sparseArray.get(iA);
                eventTime.getClass();
                sparseArray2.append(iA, eventTime);
            }
            this.f17220b = sparseArray2;
        }

        public final boolean a(int i2) {
            return this.f17219a.f18903a.get(i2);
        }

        public final EventTime b(int i2) {
            EventTime eventTime = (EventTime) this.f17220b.get(i2);
            eventTime.getClass();
            return eventTime;
        }
    }

    default void B(EventTime eventTime, VideoSize videoSize) {
    }

    default void D(EventTime eventTime) {
    }

    default void F(EventTime eventTime, float f) {
    }

    default void G(EventTime eventTime, boolean z2) {
    }

    default void H(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    default void I(EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
    }

    default void J(EventTime eventTime, String str) {
    }

    default void K(EventTime eventTime, boolean z2) {
    }

    default void b(EventTime eventTime, String str) {
    }

    default void c(EventTime eventTime, int i2) {
    }

    default void d(EventTime eventTime, Exception exc) {
    }

    default void e(EventTime eventTime) {
    }

    default void f(EventTime eventTime, int i2) {
    }

    default void h(EventTime eventTime, Metadata metadata) {
    }

    default void j(Player player, Events events) {
    }

    default void k(EventTime eventTime, int i2) {
    }

    default void n(EventTime eventTime, int i2, int i3) {
    }

    default void o(EventTime eventTime, boolean z2) {
    }

    default void q(EventTime eventTime, int i2) {
    }

    default void r(EventTime eventTime, Tracks tracks) {
    }

    default void s(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void v(EventTime eventTime, PlaybackException playbackException) {
    }

    default void w(EventTime eventTime) {
    }

    default void x(EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    default void y(EventTime eventTime, int i2, long j, long j2) {
    }

    default void a(EventTime eventTime) {
    }

    default void t(EventTime eventTime) {
    }

    default void z(EventTime eventTime) {
    }

    default void A(EventTime eventTime, int i2) {
    }

    default void C(EventTime eventTime, Format format) {
    }

    default void E(EventTime eventTime, Object obj) {
    }

    default void L(EventTime eventTime, int i2) {
    }

    default void i(EventTime eventTime, String str) {
    }

    default void l(EventTime eventTime, String str) {
    }

    default void m(EventTime eventTime, Format format) {
    }

    default void g(EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
    }

    default void p(EventTime eventTime, int i2, boolean z2) {
    }

    default void u(int i2, long j, EventTime eventTime) {
    }
}
