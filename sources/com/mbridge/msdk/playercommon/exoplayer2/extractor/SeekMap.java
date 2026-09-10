package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface SeekMap {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class SeekPoints {
        public final SeekPoint first;
        public final SeekPoint second;

        public SeekPoints(SeekPoint seekPoint) {
            this(seekPoint, seekPoint);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SeekPoints.class == obj.getClass()) {
                SeekPoints seekPoints = (SeekPoints) obj;
                if (this.first.equals(seekPoints.first) && this.second.equals(seekPoints.second)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.second.hashCode() + (this.first.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder(X3.j.f27834d);
            sb2.append(this.first);
            if (this.first.equals(this.second)) {
                str = "";
            } else {
                str = ", " + this.second;
            }
            return e.q(str, X3.j.f27836e, sb2);
        }

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            this.first = (SeekPoint) Assertions.checkNotNull(seekPoint);
            this.second = (SeekPoint) Assertions.checkNotNull(seekPoint2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Unseekable implements SeekMap {
        private final long durationUs;
        private final SeekPoints startSeekPoints;

        public Unseekable(long j10) {
            this(j10, 0L);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public SeekPoints getSeekPoints(long j10) {
            return this.startSeekPoints;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return false;
        }

        public Unseekable(long j10, long j11) {
            this.durationUs = j10;
            this.startSeekPoints = new SeekPoints(j11 == 0 ? SeekPoint.START : new SeekPoint(0L, j11));
        }
    }

    long getDurationUs();

    SeekPoints getSeekPoints(long j10);

    boolean isSeekable();
}
