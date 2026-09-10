package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f43220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocalDateTime f43221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ZoneOffset f43222c;
    private final ZoneOffset d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f43220a, ((b) obj).f43220a);
    }

    b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f43220a = localDateTime.a0(zoneOffset);
        this.f43221b = localDateTime;
        this.f43222c = zoneOffset;
        this.d = zoneOffset2;
    }

    b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f43220a = j;
        this.f43221b = LocalDateTime.f0(j, 0, zoneOffset);
        this.f43222c = zoneOffset;
        this.d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        a.c(this.f43220a, objectOutput);
        a.d(this.f43222c, objectOutput);
        a.d(this.d, objectOutput);
    }

    public final long Q() {
        return this.f43220a;
    }

    public final LocalDateTime r() {
        return this.f43221b;
    }

    public final ZoneOffset U() {
        return this.f43222c;
    }

    public final ZoneOffset J() {
        return this.d;
    }

    public final Duration C() {
        return Duration.U(this.d.getTotalSeconds() - this.f43222c.getTotalSeconds());
    }

    public final LocalDateTime p() {
        return this.f43221b.i0(this.d.getTotalSeconds() - this.f43222c.getTotalSeconds());
    }

    public final boolean Y() {
        return this.d.getTotalSeconds() > this.f43222c.getTotalSeconds();
    }

    final List V() {
        return Y() ? Collections.EMPTY_LIST : j$.time.b.b(new Object[]{this.f43222c, this.d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43220a == bVar.f43220a && this.f43222c.equals(bVar.f43222c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f43221b.hashCode() ^ this.f43222c.hashCode()) ^ Integer.rotateLeft(this.d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(Y() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f43221b);
        sb.append(this.f43222c);
        sb.append(" to ");
        sb.append(this.d);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
