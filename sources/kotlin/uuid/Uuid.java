package kotlin.uuid;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.HexExtensionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0007J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/uuid/Uuid;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Uuid implements Comparable<Uuid>, Serializable {
    public static final Companion Z = new Companion();
    public static final Uuid e0 = new Uuid(0, 0);
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f44733Y;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/uuid/Uuid$Companion;", "", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Uuid a(long j, long j2) {
            return (j == 0 && j2 == 0) ? Uuid.e0 : new Uuid(j, j2);
        }

        public static Uuid b(String uuidString) {
            String strConcat;
            Intrinsics.f(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return a(HexExtensionsKt.b(0, 16, uuidString), HexExtensionsKt.b(16, 32, uuidString));
            }
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (uuidString.length() <= 64) {
                    strConcat = uuidString;
                } else {
                    String strSubstring = uuidString.substring(0, 64);
                    Intrinsics.e(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb.append(strConcat);
                sb.append("\" of length ");
                sb.append(uuidString.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jB = HexExtensionsKt.b(0, 8, uuidString);
            UuidKt__UuidKt.b(8, uuidString);
            long jB2 = HexExtensionsKt.b(9, 13, uuidString);
            UuidKt__UuidKt.b(13, uuidString);
            long jB3 = HexExtensionsKt.b(14, 18, uuidString);
            UuidKt__UuidKt.b(18, uuidString);
            long jB4 = HexExtensionsKt.b(19, 23, uuidString);
            UuidKt__UuidKt.b(23, uuidString);
            return a((jB << 32) | (jB2 << 16) | jB3, (jB4 << 48) | HexExtensionsKt.b(24, 36, uuidString));
        }
    }

    public Uuid(long j, long j2) {
        this.X = j;
        this.f44733Y = j2;
    }

    private final Object writeReplace() {
        return new UuidSerialized(this.X, this.f44733Y);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Uuid uuid) {
        Uuid other = uuid;
        Intrinsics.f(other, "other");
        long j = this.X;
        long j2 = other.X;
        return j != j2 ? Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) : Long.compare(this.f44733Y ^ Long.MIN_VALUE, other.f44733Y ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.X == uuid.X && this.f44733Y == uuid.f44733Y;
    }

    public final int hashCode() {
        return Long.hashCode(this.X ^ this.f44733Y);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        UuidKt__UuidJVMKt.a(this.X, bArr, 0, 0, 4);
        bArr[8] = 45;
        UuidKt__UuidJVMKt.a(this.X, bArr, 9, 4, 6);
        bArr[13] = 45;
        UuidKt__UuidJVMKt.a(this.X, bArr, 14, 6, 8);
        bArr[18] = 45;
        UuidKt__UuidJVMKt.a(this.f44733Y, bArr, 19, 0, 2);
        bArr[23] = 45;
        UuidKt__UuidJVMKt.a(this.f44733Y, bArr, 24, 2, 8);
        return StringsKt.n(bArr);
    }
}
