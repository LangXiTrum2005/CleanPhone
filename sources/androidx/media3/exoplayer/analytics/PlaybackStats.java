package androidx.media3.exoplayer.analytics;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStats {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6033c;
    public final List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6034e;
    public final List f;

    public static final class EventTimeAndException {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndException.class != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public static final class EventTimeAndFormat {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndFormat.class != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public static final class EventTimeAndPlaybackState {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndPlaybackState.class != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        new PlaybackStats(0, new long[16], list, list, -9223372036854775807L, 0, 0, 0, 0, -9223372036854775807L, 0, 0, 0, 0, 0, -9223372036854775807L, 0, list, list, 0L, 0L, 0L, 0L, 0L, 0L, 0, 0, -1, -1L, 0, -1L, 0L, 0L, 0L, 0L, 0, 0, 0, list, list);
    }

    public PlaybackStats(int i2, long[] jArr, List list, List list2, long j, int i3, int i4, int i5, int i6, long j2, int i7, int i8, int i9, int i10, int i11, long j3, int i12, List list3, List list4, long j4, long j5, long j6, long j7, long j8, long j9, int i13, int i14, int i15, long j10, int i16, long j11, long j12, long j13, long j14, long j15, int i17, int i18, int i19, List list5, List list6) {
        this.f6031a = Collections.unmodifiableList(list);
        this.f6032b = Collections.unmodifiableList(list2);
        this.f6033c = Collections.unmodifiableList(list3);
        this.d = Collections.unmodifiableList(list4);
        this.f6034e = Collections.unmodifiableList(list5);
        this.f = Collections.unmodifiableList(list6);
    }
}
