package mc;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f45952b;

    public c(String str, Map map) {
        this.f45951a = str;
        this.f45952b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f45951a.equals(cVar.f45951a) && this.f45952b.equals(cVar.f45952b);
    }

    public final int hashCode() {
        return this.f45952b.hashCode() + (this.f45951a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f45951a + ", properties=" + this.f45952b.values() + "}";
    }
}
