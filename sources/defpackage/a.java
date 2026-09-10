package defpackage;

import j1.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f3310a;

    public a(Boolean bool) {
        this.f3310a = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return a.a.l(f.C(this.f3310a), f.C(((a) obj).f3310a));
    }

    public final int hashCode() {
        return f.C(this.f3310a).hashCode();
    }

    public final String toString() {
        return "IsEnabledMessage(enabled=" + this.f3310a + ")";
    }
}
