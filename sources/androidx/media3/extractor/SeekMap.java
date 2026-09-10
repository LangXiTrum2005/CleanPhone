package androidx.media3.extractor;

import android.support.v4.media.a;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes.dex */
public interface SeekMap {

    public static final class SeekPoints {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SeekPoint f6794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SeekPoint f6795b;

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            this.f6794a = seekPoint;
            this.f6795b = seekPoint2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SeekPoints.class == obj.getClass()) {
                SeekPoints seekPoints = (SeekPoints) obj;
                if (this.f6794a.equals(seekPoints.f6794a) && this.f6795b.equals(seekPoints.f6795b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f6795b.hashCode() + (this.f6794a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder(d9.i.d);
            SeekPoint seekPoint = this.f6794a;
            sb.append(seekPoint);
            SeekPoint seekPoint2 = this.f6795b;
            if (seekPoint.equals(seekPoint2)) {
                str = "";
            } else {
                str = ", " + seekPoint2;
            }
            return a.r(sb, str, d9.i.f24752e);
        }
    }

    public static class Unseekable implements SeekMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SeekPoints f6797b;

        public Unseekable(long j) {
            this(j, 0L);
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long getDurationUs() {
            return this.f6796a;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekPoints getSeekPoints(long j) {
            return this.f6797b;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isSeekable() {
            return false;
        }

        public Unseekable(long j, long j2) {
            this.f6796a = j;
            SeekPoint seekPoint = j2 == 0 ? SeekPoint.f6798c : new SeekPoint(0L, j2);
            this.f6797b = new SeekPoints(seekPoint, seekPoint);
        }
    }

    long getDurationUs();

    SeekPoints getSeekPoints(long j);

    boolean isSeekable();
}
