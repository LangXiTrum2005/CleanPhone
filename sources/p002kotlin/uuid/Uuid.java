package p002kotlin.uuid;

import com.ironsource.C3414a2;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;
import patroclinal.monoploid;
import patroclinal.triweekly;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001.B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%R \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010\u0006\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010(¨\u0006/"}, d2 = {"Lkotlin/uuid/Uuid;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "mostSignificantBits", "leastSignificantBits", "<init>", "(JJ)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "toString", "()Ljava/lang/String;", "toHexDashString", "toHexString", "", "toByteArray", "()[B", "Lpatroclinal/triweekly;", "toUByteArray-TcUX1vc", "toUByteArray", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "compareTo", "(Lkotlin/uuid/Uuid;)I", "hashCode", "()I", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "Companion", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Uuid implements Comparable<Uuid>, Serializable {
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final Uuid f32091kowloon = new Uuid(0, 0);

    /* JADX INFO: renamed from: kotlin.uuid.Uuid$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Uuid.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlin/uuid/Uuid$attabal;", "", "<init>", "()V", "", "mostSignificantBits", "leastSignificantBits", "Lkotlin/uuid/Uuid;", "attabal", "(JJ)Lkotlin/uuid/Uuid;", "", "uuidString", "dern", "(Ljava/lang/String;)Lkotlin/uuid/Uuid;", "NIL", "Lkotlin/uuid/Uuid;", "saneness", "()Lkotlin/uuid/Uuid;", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uuid attabal(long mostSignificantBits, long leastSignificantBits) {
            return (mostSignificantBits == 0 && leastSignificantBits == 0) ? saneness() : new Uuid(mostSignificantBits, leastSignificantBits, null);
        }

        public final Uuid dern(String uuidString) {
            Intrinsics.checkNotNullParameter(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return attabal.wireman(uuidString);
            }
            if (length == 36) {
                return attabal.marial(uuidString);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + saneness.cutely(uuidString, 64) + "\" of length " + uuidString.length());
        }

        public final Uuid saneness() {
            return Uuid.f32091kowloon;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Uuid(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return attabal.saneness(this);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) other;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        attabal.dern(bArr, 0, this.mostSignificantBits);
        attabal.dern(bArr, 8, this.leastSignificantBits);
        return bArr;
    }

    public final String toHexDashString() {
        byte[] bArr = new byte[36];
        attabal.attabal(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        attabal.attabal(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        attabal.attabal(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        attabal.attabal(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        attabal.attabal(this.leastSignificantBits, bArr, 24, 2, 8);
        return dovishness.rotuma(bArr);
    }

    public final String toHexString() {
        byte[] bArr = new byte[32];
        attabal.attabal(this.mostSignificantBits, bArr, 0, 0, 8);
        attabal.attabal(this.leastSignificantBits, bArr, 16, 0, 8);
        return dovishness.rotuma(bArr);
    }

    public String toString() {
        return toHexDashString();
    }

    /* JADX INFO: renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m3361toUByteArrayTcUX1vc() {
        return triweekly.marial(toByteArray());
    }

    public Uuid(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Uuid other) {
        Intrinsics.checkNotNullParameter(other, "other");
        long j = this.mostSignificantBits;
        return j != other.mostSignificantBits ? Long.compare(monoploid.dern(j) ^ Long.MIN_VALUE, monoploid.dern(other.mostSignificantBits) ^ Long.MIN_VALUE) : Long.compare(monoploid.dern(this.leastSignificantBits) ^ Long.MIN_VALUE, monoploid.dern(other.leastSignificantBits) ^ Long.MIN_VALUE);
    }

    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }
}
