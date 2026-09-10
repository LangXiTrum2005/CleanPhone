package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/UInt;", "", "Companion", "data", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
public final class UInt implements Comparable<UInt> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Companion f43256Y = new Companion();
    public final int X;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lkotlin/UInt$Companion;", "", "Lkotlin/UInt;", "MIN_VALUE", "I", "MAX_VALUE", "", "SIZE_BYTES", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public static String a(int i2) {
        return String.valueOf(((long) i2) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(UInt uInt) {
        return Intrinsics.h(this.X ^ Integer.MIN_VALUE, uInt.X ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UInt) {
            return this.X == ((UInt) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.X);
    }

    public final String toString() {
        return a(this.X);
    }
}
