package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/ULong;", "", "Companion", "data", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
public final class ULong implements Comparable<ULong> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Companion f43258Y = new Companion();
    public final long X;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/ULong$Companion;", "", "Lkotlin/ULong;", "MIN_VALUE", "J", "MAX_VALUE", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public static String a(long j) {
        if (j >= 0) {
            CharsKt.b(10);
            String string = Long.toString(j, 10);
            Intrinsics.e(string, "toString(...)");
            return string;
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        CharsKt.b(10);
        String string2 = Long.toString(j3, 10);
        Intrinsics.e(string2, "toString(...)");
        CharsKt.b(10);
        String string3 = Long.toString(j4, 10);
        Intrinsics.e(string3, "toString(...)");
        return string2.concat(string3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(ULong uLong) {
        long j = uLong.X;
        long j2 = this.X ^ Long.MIN_VALUE;
        long j3 = j ^ Long.MIN_VALUE;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ULong) {
            return this.X == ((ULong) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.X);
    }

    public final String toString() {
        return a(this.X);
    }
}
