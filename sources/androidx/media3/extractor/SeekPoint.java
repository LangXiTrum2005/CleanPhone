package androidx.media3.extractor;

import android.support.v4.media.a;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes.dex */
public final class SeekPoint {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SeekPoint f6798c = new SeekPoint(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6800b;

    public SeekPoint(long j, long j2) {
        this.f6799a = j;
        this.f6800b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekPoint.class == obj.getClass()) {
            SeekPoint seekPoint = (SeekPoint) obj;
            if (this.f6799a == seekPoint.f6799a && this.f6800b == seekPoint.f6800b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f6799a) * 31) + ((int) this.f6800b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f6799a);
        sb.append(", position=");
        return a.j(this.f6800b, d9.i.f24752e, sb);
    }
}
