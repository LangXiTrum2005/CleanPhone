package kotlin.time;

import com.smartdigimkt.o1.b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0007J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/time/Instant;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Instant implements Comparable<Instant>, Serializable {
    public static final Instant Z = new Instant(-31557014167219200L, 0);
    public static final Instant e0 = new Instant(31556889864403199L, 999999999);
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f44722Y;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/Instant$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public Instant(long j, int i2) {
        this.X = j;
        this.f44722Y = i2;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    private final Object writeReplace() {
        Clock clock = InstantJvmKt.f44723a;
        return new InstantSerialized(this.X, this.f44722Y);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        int i2;
        Instant other = instant;
        Intrinsics.f(other, "other");
        long j = this.X;
        long j2 = other.X;
        if (j < j2) {
            i2 = -1;
        } else {
            i2 = j == j2 ? 0 : 1;
        }
        return i2 != 0 ? i2 : Intrinsics.h(this.f44722Y, other.f44722Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.X == instant.X && this.f44722Y == instant.f44722Y;
    }

    public final int hashCode() {
        return (this.f44722Y * 51) + Long.hashCode(this.X);
    }

    public final String toString() {
        int[] iArr;
        int i2;
        StringBuilder sb = new StringBuilder();
        long j = this.X;
        long j2 = j / 86400;
        long j3 = 0;
        if ((j ^ 86400) < 0 && j2 * 86400 != j) {
            j2--;
        }
        long j4 = j % 86400;
        int i3 = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = (j2 + ((long) 719528)) - ((long) 60);
        if (j5 < 0) {
            long j6 = 146097;
            long j7 = ((j5 + 1) / j6) - 1;
            j3 = ((long) 400) * j7;
            j5 += (-j7) * j6;
        }
        long j8 = 400;
        long j9 = ((j8 * j5) + ((long) 591)) / ((long) 146097);
        long j10 = 365;
        long j11 = 4;
        long j12 = 100;
        long j13 = j5 - ((j9 / j8) + (((j9 / j11) + (j10 * j9)) - (j9 / j12)));
        if (j13 < 0) {
            j9--;
            j13 = j5 - ((j9 / j8) + (((j9 / j11) + (j10 * j9)) - (j9 / j12)));
        }
        int i4 = (int) j13;
        int i5 = ((i4 * 5) + 2) / 153;
        int i6 = ((i5 + 2) % 12) + 1;
        int i7 = (i4 - (((i5 * 306) + 5) / 10)) + 1;
        int i8 = (int) (j9 + j3 + ((long) (i5 / 10)));
        int i9 = i3 / b.l2;
        int i10 = i3 - (i9 * b.l2);
        int i11 = i10 / 60;
        int i12 = i10 - (i11 * 60);
        int i13 = this.f44722Y;
        UnboundLocalDateTime unboundLocalDateTime = new UnboundLocalDateTime(i8, i6, i7, i9, i11, i12, i13);
        int i14 = 0;
        if (Math.abs(i8) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i8 >= 0) {
                sb2.append(i8 + 10000);
                Intrinsics.e(sb2.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb2.append(i8 - 10000);
                Intrinsics.e(sb2.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i8 >= 10000) {
                sb.append('+');
            }
            sb.append(i8);
        }
        sb.append('-');
        InstantKt.a(sb, sb, i6);
        sb.append('-');
        InstantKt.a(sb, sb, i7);
        sb.append('T');
        InstantKt.a(sb, sb, i9);
        sb.append(AbstractJsonLexerKt.COLON);
        InstantKt.a(sb, sb, i11);
        sb.append(AbstractJsonLexerKt.COLON);
        InstantKt.a(sb, sb, i12);
        if (i13 != 0) {
            sb.append('.');
            while (true) {
                iArr = InstantKt.f44724a;
                int i15 = i14 + 1;
                int i16 = iArr[i15];
                i2 = unboundLocalDateTime.g;
                if (i2 % i16 != 0) {
                    break;
                }
                i14 = i15;
            }
            int i17 = i14 - (i14 % 3);
            String strValueOf = String.valueOf((i2 / iArr[i17]) + iArr[9 - i17]);
            Intrinsics.d(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            Intrinsics.e(strSubstring, "substring(...)");
            sb.append(strSubstring);
        }
        sb.append('Z');
        return sb.toString();
    }
}
