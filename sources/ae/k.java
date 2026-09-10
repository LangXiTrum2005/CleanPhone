package ae;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3509a;

    public k(String str) {
        this.f3509a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return i.j(this.f3509a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f3509a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f3509a.equals(((k) obj).f3509a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f3509a);
    }

    public final int hashCode() {
        return this.f3509a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f3509a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return i.j(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f3509a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return i.j(str).longValue();
        }
    }

    public final String toString() {
        return this.f3509a;
    }
}
