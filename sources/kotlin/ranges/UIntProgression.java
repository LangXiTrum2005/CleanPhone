package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class UIntProgression implements Iterable<UInt>, KMappedMarker {
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f43346Y;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public UIntProgression() {
        int i2 = 0;
        if (Integer.compare(Integer.MAX_VALUE, Integer.MIN_VALUE) < 0) {
            long j = ((long) 1) & 4294967295L;
            int i3 = (int) ((((long) 0) & 4294967295L) % j);
            int i4 = (int) ((((long) (-1)) & 4294967295L) % j);
            int iCompare = Integer.compare(i3 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i4);
            int i5 = i3 - i4;
            i2 = 0 - (iCompare < 0 ? i5 + 1 : i5);
        }
        this.X = i2;
        this.f43346Y = 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UIntProgression)) {
            return false;
        }
        if (isEmpty() && ((UIntProgression) obj).isEmpty()) {
            return true;
        }
        UIntProgression uIntProgression = (UIntProgression) obj;
        uIntProgression.getClass();
        return this.X == uIntProgression.X && this.f43346Y == uIntProgression.f43346Y;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((-31) + this.X) * 31) + this.f43346Y;
    }

    public boolean isEmpty() {
        int i2 = this.f43346Y;
        int i3 = this.X;
        if (i2 > 0) {
            return Integer.compare(Integer.MAX_VALUE, i3 ^ Integer.MIN_VALUE) > 0;
        }
        return Integer.compare(Integer.MAX_VALUE, i3 ^ Integer.MIN_VALUE) < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<UInt> iterator() {
        return new UIntProgressionIterator(this.X, this.f43346Y);
    }

    public String toString() {
        StringBuilder sb;
        int i2 = this.X;
        int i3 = this.f43346Y;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append((Object) UInt.a(-1));
            sb.append("..");
            sb.append((Object) UInt.a(i2));
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append((Object) UInt.a(-1));
            sb.append(" downTo ");
            sb.append((Object) UInt.a(i2));
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
