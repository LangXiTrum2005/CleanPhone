package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ULongProgression implements Iterable<ULong>, KMappedMarker {
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f43348Y;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ULongProgression() {
        long j;
        long j2 = 0;
        if (Long.compare(Long.MAX_VALUE, Long.MIN_VALUE) < 0) {
            long j3 = -1;
            if (1 < 0) {
                j = (0 ^ Long.MIN_VALUE) < (1 ^ Long.MIN_VALUE) ? 0L : 0 - 1;
            } else if (0 >= 0) {
                j = 0 % 1;
            } else {
                long j4 = 0 - ((((0 >>> 1) / 1) << 1) * 1);
                j = j4 - ((j4 ^ Long.MIN_VALUE) >= (1 ^ Long.MIN_VALUE) ? 1L : 0L);
            }
            if (1 < 0) {
                if (((-1) ^ Long.MIN_VALUE) >= (1 ^ Long.MIN_VALUE)) {
                    j3 = (-1) - 1;
                }
            } else if (-1 >= 0) {
                j3 = (-1) % 1;
            } else {
                long j5 = (-1) - (((((-1) >>> 1) / 1) << 1) * 1);
                j3 = j5 - ((j5 ^ Long.MIN_VALUE) >= (1 ^ Long.MIN_VALUE) ? 1L : 0L);
            }
            int iCompare = Long.compare(j ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
            long j6 = j - j3;
            j2 = 0 - (iCompare < 0 ? j6 + 1 : j6);
        }
        this.X = j2;
        this.f43348Y = 1L;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ULongProgression)) {
            return false;
        }
        if (isEmpty() && ((ULongProgression) obj).isEmpty()) {
            return true;
        }
        ULongProgression uLongProgression = (ULongProgression) obj;
        uLongProgression.getClass();
        return this.X == uLongProgression.X && this.f43348Y == uLongProgression.f43348Y;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.X;
        int i2 = ((((int) (-4294967296L)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f43348Y;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.f43348Y;
        long j2 = this.X;
        if (j > 0) {
            return Long.compare(Long.MAX_VALUE, Long.MIN_VALUE ^ j2) > 0;
        }
        return Long.compare(Long.MAX_VALUE, Long.MIN_VALUE ^ j2) < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<ULong> iterator() {
        return new ULongProgressionIterator(this.X, this.f43348Y);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.f43348Y;
        long j2 = this.X;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append((Object) ULong.a(-1L));
            sb.append("..");
            sb.append((Object) ULong.a(j2));
            sb.append(" step ");
        } else {
            sb = new StringBuilder();
            sb.append((Object) ULong.a(-1L));
            sb.append(" downTo ");
            sb.append((Object) ULong.a(j2));
            sb.append(" step ");
            j = -j;
        }
        sb.append(j);
        return sb.toString();
    }
}
