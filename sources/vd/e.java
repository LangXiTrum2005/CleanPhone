package vd;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52569a;

    public e(String sessionId) {
        n.f(sessionId, "sessionId");
        this.f52569a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && n.a(this.f52569a, ((e) obj).f52569a);
    }

    public final int hashCode() {
        return this.f52569a.hashCode();
    }

    public final String toString() {
        return wi.d.k(new StringBuilder("SessionDetails(sessionId="), this.f52569a, ')');
    }
}
