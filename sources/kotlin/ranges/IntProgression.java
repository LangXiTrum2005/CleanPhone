package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class IntProgression implements Iterable<Integer>, KMappedMarker {
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f43343Y;
    public final int Z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public IntProgression(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.X = i2;
        this.f43343Y = ProgressionUtilKt.a(i2, i3, i4);
        this.Z = i4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IntProgression)) {
            return false;
        }
        if (isEmpty() && ((IntProgression) obj).isEmpty()) {
            return true;
        }
        IntProgression intProgression = (IntProgression) obj;
        return this.X == intProgression.X && this.f43343Y == intProgression.f43343Y && this.Z == intProgression.Z;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.X * 31) + this.f43343Y) * 31) + this.Z;
    }

    public boolean isEmpty() {
        int i2 = this.Z;
        int i3 = this.f43343Y;
        int i4 = this.X;
        if (i2 > 0) {
            return i4 > i3;
        }
        return i4 < i3;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new IntProgressionIterator(this.X, this.f43343Y, this.Z);
    }

    public String toString() {
        StringBuilder sb;
        int i2 = this.f43343Y;
        int i3 = this.X;
        int i4 = this.Z;
        if (i4 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i2);
            sb.append(" step ");
            sb.append(i4);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i2);
            sb.append(" step ");
            sb.append(-i4);
        }
        return sb.toString();
    }
}
