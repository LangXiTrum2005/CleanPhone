package kotlin.ranges;

import android.support.v4.media.a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/LongProgression;", "", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class LongProgression implements Iterable<Long>, KMappedMarker {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LongProgression)) {
            return false;
        }
        if (isEmpty() && ((LongProgression) obj).isEmpty()) {
            return true;
        }
        ((LongProgression) obj).getClass();
        return 0 == 0 && 0 == 0;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        return (int) ((((0 ^ (0 >>> 32)) + j) * j) + (0 ^ (0 >>> 32)));
    }

    public boolean isEmpty() {
        if (0 > 0) {
            return 1 > 0;
        }
        return 1 < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new LongProgressionIterator(0L, 0L);
    }

    public String toString() {
        StringBuilder sbV;
        long j = 0;
        if (0 > 0) {
            sbV = a.v(0L, "1..", " step ");
        } else {
            sbV = a.v(0L, "1 downTo ", " step ");
            j = -0L;
        }
        sbV.append(j);
        return sbV.toString();
    }
}
