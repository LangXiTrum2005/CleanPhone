package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.internal.jdk8.JDK8PlatformImplementations;
import kotlin.random.jdk8.PlatformThreadLocalRandom;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/random/Random;", "", "Default", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Random {
    public static final Default X = new Default();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final AbstractPlatformRandom f43340Y;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\tJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "defaultRandom", "Lkotlin/random/Random;", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Default extends Random implements Serializable {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Serialized implements Serializable {
            public static final Serialized X = new Serialized();
            private static final long serialVersionUID = 0;

            private final Object readResolve() {
                return Random.X;
            }
        }

        private final Object writeReplace() {
            return Serialized.X;
        }

        @Override // kotlin.random.Random
        public final int a(int i2) {
            return Random.f43340Y.a(i2);
        }

        @Override // kotlin.random.Random
        public final int d() {
            return Random.f43340Y.d();
        }

        @Override // kotlin.random.Random
        public final int e(int i2) {
            return Random.f43340Y.e(i2);
        }

        @Override // kotlin.random.Random
        public final long g() {
            return Random.f43340Y.g();
        }

        @Override // kotlin.random.Random
        public final long h(long j, long j2) {
            throw null;
        }
    }

    static {
        f43340Y = JDK8PlatformImplementations.b(34) ? new PlatformThreadLocalRandom() : new FallbackThreadLocalRandom();
    }

    public abstract int a(int i2);

    public int d() {
        return a(32);
    }

    public int e(int i2) {
        int iD;
        int i3;
        if (i2 <= 0) {
            throw new IllegalArgumentException(RandomKt.a(0, Integer.valueOf(i2)).toString());
        }
        if (i2 > 0 || i2 == Integer.MIN_VALUE) {
            if (((-i2) & i2) == i2) {
                return a(31 - Integer.numberOfLeadingZeros(i2));
            }
            do {
                iD = d() >>> 1;
                i3 = iD % i2;
            } while ((i2 - 1) + (iD - i3) < 0);
            return i3;
        }
        while (true) {
            int iD2 = d();
            if (iD2 >= 0 && iD2 < i2) {
                return iD2;
            }
        }
    }

    public long g() {
        return (((long) d()) << 32) + ((long) d());
    }

    public long h(long j, long j2) {
        long jG;
        long j3;
        long jA;
        int iD;
        if (j2 <= j) {
            throw new IllegalArgumentException(RandomKt.a(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i2 = (int) j4;
                int i3 = (int) (j4 >>> 32);
                if (i2 != 0) {
                    iD = a(31 - Integer.numberOfLeadingZeros(i2));
                } else if (i3 == 1) {
                    iD = d();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i3))) << 32) + (((long) d()) & 4294967295L);
                }
                jA = ((long) iD) & 4294967295L;
            } else {
                do {
                    jG = g() >>> 1;
                    j3 = jG % j4;
                } while ((j4 - 1) + (jG - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jG2 = g();
            if (j <= jG2 && jG2 < j2) {
                return jG2;
            }
        }
    }
}
