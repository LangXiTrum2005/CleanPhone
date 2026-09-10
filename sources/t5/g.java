package t5;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f50517a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && n.a(this.f50517a, ((g) obj).f50517a);
    }

    public final int hashCode() {
        return this.f50517a.hashCode();
    }

    public final String toString() {
        return defpackage.e.o("Note(note=", this.f50517a, ")");
    }
}
