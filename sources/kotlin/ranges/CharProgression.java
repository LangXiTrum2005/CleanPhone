package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/CharProgression;", "", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CharProgression implements Iterable<Character>, KMappedMarker {
    public final char X = (char) ProgressionUtilKt.a(1, 0, 1);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f43341Y = 1;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CharProgression)) {
            return false;
        }
        if (isEmpty() && ((CharProgression) obj).isEmpty()) {
            return true;
        }
        CharProgression charProgression = (CharProgression) obj;
        charProgression.getClass();
        return this.X == charProgression.X && this.f43341Y == charProgression.f43341Y;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return ((this.X + 31) * 31) + this.f43341Y;
    }

    public boolean isEmpty() {
        int i2 = this.f43341Y;
        char c2 = this.X;
        if (i2 > 0) {
            if (Intrinsics.h(1, c2) <= 0) {
                return false;
            }
        } else if (Intrinsics.h(1, c2) >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new CharProgressionIterator(this.X, this.f43341Y);
    }

    public String toString() {
        StringBuilder sb;
        char c2 = this.X;
        int i2 = this.f43341Y;
        if (i2 > 0) {
            sb = new StringBuilder("\u0001..");
            sb.append(c2);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder("\u0001 downTo ");
            sb.append(c2);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
