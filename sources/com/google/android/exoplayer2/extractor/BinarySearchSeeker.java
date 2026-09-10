package com.google.android.exoplayer2.extractor;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BinarySearchSeeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BinarySearchSeekMap f17502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimestampSeeker f17503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SeekOperationParams f17504c;
    public final int d;

    public static class BinarySearchSeekMap implements SeekMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SeekTimestampConverter f17505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17507c;
        public final long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f17508e;
        public final long f;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j, long j2, long j3, long j4, long j5) {
            this.f17505a = seekTimestampConverter;
            this.f17506b = j;
            this.f17507c = j2;
            this.d = j3;
            this.f17508e = j4;
            this.f = j5;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public final long getDurationUs() {
            return this.f17506b;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public final SeekMap.SeekPoints getSeekPoints(long j) {
            SeekPoint seekPoint = new SeekPoint(j, SeekOperationParams.a(this.f17505a.a(j), 0L, this.f17507c, this.d, this.f17508e, this.f));
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public final boolean isSeekable() {
            return true;
        }
    }

    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
        public final long a(long j) {
            return j;
        }
    }

    public static class SeekOperationParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17511c;
        public long d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f17512e;
        public long f;
        public long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f17513h;

        public SeekOperationParams(long j, long j2, long j3, long j4, long j5, long j6) {
            this.f17509a = j;
            this.f17510b = j2;
            this.f17512e = j3;
            this.f = j4;
            this.g = j5;
            this.f17511c = j6;
            this.f17513h = a(j2, 0L, j3, j4, j5, j6);
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
        public final int f17514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17516c;

        public TimestampSearchResult(int i2, long j, long j2) {
            this.f17514a = i2;
            this.f17515b = j;
            this.f17516c = j2;
        }
    }

    public interface TimestampSeeker {
        default void a() {
        }

        TimestampSearchResult b(DefaultExtractorInput defaultExtractorInput, long j);
    }

    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j, long j2, long j3, long j4, long j5, int i2) {
        this.f17503b = timestampSeeker;
        this.d = i2;
        this.f17502a = new BinarySearchSeekMap(seekTimestampConverter, j, j2, j3, j4, j5);
    }

    public static int b(DefaultExtractorInput defaultExtractorInput, long j, PositionHolder positionHolder) {
        if (j == defaultExtractorInput.d) {
            return 0;
        }
        positionHolder.f17554a = j;
        return 1;
    }

    public final int a(DefaultExtractorInput defaultExtractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        while (true) {
            SeekOperationParams seekOperationParams = this.f17504c;
            Assertions.e(seekOperationParams);
            long j = seekOperationParams.f;
            long j2 = seekOperationParams.g;
            long j3 = seekOperationParams.f17513h;
            long j4 = j2 - j;
            long j5 = this.d;
            TimestampSeeker timestampSeeker = this.f17503b;
            if (j4 <= j5) {
                this.f17504c = null;
                timestampSeeker.a();
                return b(defaultExtractorInput, j, positionHolder);
            }
            long j6 = j3 - defaultExtractorInput.d;
            if (j6 < 0 || j6 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                return b(defaultExtractorInput, j3, positionHolder);
            }
            defaultExtractorInput.skipFully((int) j6);
            defaultExtractorInput.f = 0;
            TimestampSearchResult timestampSearchResultB = timestampSeeker.b(defaultExtractorInput, seekOperationParams.f17510b);
            int i2 = timestampSearchResultB.f17514a;
            if (i2 == -3) {
                this.f17504c = null;
                timestampSeeker.a();
                return b(defaultExtractorInput, j3, positionHolder);
            }
            long j7 = timestampSearchResultB.f17515b;
            long j8 = timestampSearchResultB.f17516c;
            if (i2 == -2) {
                seekOperationParams.d = j7;
                seekOperationParams.f = j8;
                seekOperationParams.f17513h = SeekOperationParams.a(seekOperationParams.f17510b, j7, seekOperationParams.f17512e, j8, seekOperationParams.g, seekOperationParams.f17511c);
            } else {
                if (i2 != -1) {
                    if (i2 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j9 = j8 - defaultExtractorInput.d;
                    if (j9 >= 0 && j9 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        defaultExtractorInput.skipFully((int) j9);
                    }
                    this.f17504c = null;
                    timestampSeeker.a();
                    return b(defaultExtractorInput, j8, positionHolder);
                }
                seekOperationParams.f17512e = j7;
                seekOperationParams.g = j8;
                seekOperationParams.f17513h = SeekOperationParams.a(seekOperationParams.f17510b, seekOperationParams.d, j7, seekOperationParams.f, j8, seekOperationParams.f17511c);
            }
        }
    }

    public final void c(long j) {
        SeekOperationParams seekOperationParams = this.f17504c;
        if (seekOperationParams == null || seekOperationParams.f17509a != j) {
            BinarySearchSeekMap binarySearchSeekMap = this.f17502a;
            this.f17504c = new SeekOperationParams(j, binarySearchSeekMap.f17505a.a(j), binarySearchSeekMap.f17507c, binarySearchSeekMap.d, binarySearchSeekMap.f17508e, binarySearchSeekMap.f);
        }
    }
}
