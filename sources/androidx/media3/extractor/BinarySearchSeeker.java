package androidx.media3.extractor;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class BinarySearchSeeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BinarySearchSeekMap f6716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimestampSeeker f6717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SeekOperationParams f6718c;
    public final int d;

    public static class BinarySearchSeekMap implements SeekMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SeekTimestampConverter f6719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6721c;
        public final long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f6722e;
        public final long f;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j, long j2, long j3, long j4, long j5) {
            this.f6719a = seekTimestampConverter;
            this.f6720b = j;
            this.f6721c = j2;
            this.d = j3;
            this.f6722e = j4;
            this.f = j5;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long getDurationUs() {
            return this.f6720b;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekMap.SeekPoints getSeekPoints(long j) {
            SeekPoint seekPoint = new SeekPoint(j, SeekOperationParams.a(this.f6719a.a(j), 0L, this.f6721c, this.d, this.f6722e, this.f));
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isSeekable() {
            return true;
        }
    }

    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter, com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
        public final long a(long j) {
            return j;
        }
    }

    public static class SeekOperationParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6725c;
        public long d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f6726e;
        public long f;
        public long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f6727h;

        public SeekOperationParams(long j, long j2, long j3, long j4, long j5, long j6) {
            this.f6723a = j;
            this.f6724b = j2;
            this.f6726e = j3;
            this.f = j4;
            this.g = j5;
            this.f6725c = j6;
            this.f6727h = a(j2, 0L, j3, j4, j5, j6);
        }

        public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return Util.k(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    public interface SeekTimestampConverter {
        long a(long j);
    }

    public static final class TimestampSearchResult {
        public static final TimestampSearchResult d = new TimestampSearchResult(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6730c;

        public TimestampSearchResult(int i2, long j, long j2) {
            this.f6728a = i2;
            this.f6729b = j;
            this.f6730c = j2;
        }
    }

    public interface TimestampSeeker {
        default void a() {
        }

        TimestampSearchResult b(DefaultExtractorInput defaultExtractorInput, long j);
    }

    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j, long j2, long j3, long j4, long j5, int i2) {
        this.f6717b = timestampSeeker;
        this.d = i2;
        this.f6716a = new BinarySearchSeekMap(seekTimestampConverter, j, j2, j3, j4, j5);
    }

    public static int b(DefaultExtractorInput defaultExtractorInput, long j, PositionHolder positionHolder) {
        if (j == defaultExtractorInput.d) {
            return 0;
        }
        positionHolder.f6793a = j;
        return 1;
    }

    public final int a(DefaultExtractorInput defaultExtractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        while (true) {
            SeekOperationParams seekOperationParams = this.f6718c;
            Assertions.f(seekOperationParams);
            long j = seekOperationParams.f;
            long j2 = seekOperationParams.g;
            long j3 = seekOperationParams.f6727h;
            long j4 = j2 - j;
            long j5 = this.d;
            TimestampSeeker timestampSeeker = this.f6717b;
            if (j4 <= j5) {
                this.f6718c = null;
                timestampSeeker.a();
                return b(defaultExtractorInput, j, positionHolder);
            }
            long j6 = j3 - defaultExtractorInput.d;
            if (j6 < 0 || j6 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                return b(defaultExtractorInput, j3, positionHolder);
            }
            defaultExtractorInput.skipFully((int) j6);
            defaultExtractorInput.f = 0;
            TimestampSearchResult timestampSearchResultB = timestampSeeker.b(defaultExtractorInput, seekOperationParams.f6724b);
            int i2 = timestampSearchResultB.f6728a;
            if (i2 == -3) {
                this.f6718c = null;
                timestampSeeker.a();
                return b(defaultExtractorInput, j3, positionHolder);
            }
            long j7 = timestampSearchResultB.f6729b;
            long j8 = timestampSearchResultB.f6730c;
            if (i2 == -2) {
                seekOperationParams.d = j7;
                seekOperationParams.f = j8;
                seekOperationParams.f6727h = SeekOperationParams.a(seekOperationParams.f6724b, j7, seekOperationParams.f6726e, j8, seekOperationParams.g, seekOperationParams.f6725c);
            } else {
                if (i2 != -1) {
                    if (i2 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j9 = j8 - defaultExtractorInput.d;
                    if (j9 >= 0 && j9 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        defaultExtractorInput.skipFully((int) j9);
                    }
                    this.f6718c = null;
                    timestampSeeker.a();
                    return b(defaultExtractorInput, j8, positionHolder);
                }
                seekOperationParams.f6726e = j7;
                seekOperationParams.g = j8;
                seekOperationParams.f6727h = SeekOperationParams.a(seekOperationParams.f6724b, seekOperationParams.d, j7, seekOperationParams.f, j8, seekOperationParams.f6725c);
            }
        }
    }

    public final void c(long j) {
        SeekOperationParams seekOperationParams = this.f6718c;
        if (seekOperationParams == null || seekOperationParams.f6723a != j) {
            BinarySearchSeekMap binarySearchSeekMap = this.f6716a;
            this.f6718c = new SeekOperationParams(j, binarySearchSeekMap.f6719a.a(j), binarySearchSeekMap.f6721c, binarySearchSeekMap.d, binarySearchSeekMap.f6722e, binarySearchSeekMap.f);
        }
    }
}
