package defpackage;

import a.a;
import j1.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f5073a;

    public b(Boolean bool) {
        this.f5073a = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return a.l(f.C(this.f5073a), f.C(((b) obj).f5073a));
    }

    public final int hashCode() {
        return f.C(this.f5073a).hashCode();
    }

    public final String toString() {
        return "ToggleMessage(enable=" + this.f5073a + ")";
    }
}
