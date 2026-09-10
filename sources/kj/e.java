package kj;

import cc.a2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f44670c;

    public e(Long l, boolean z10, boolean z11) {
        this.f44668a = z10;
        this.f44669b = z11;
        this.f44670c = l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(e.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        e eVar = (e) obj;
        return a2.g(Boolean.valueOf(this.f44668a), Boolean.valueOf(eVar.f44668a)) && a2.g(Boolean.valueOf(this.f44669b), Boolean.valueOf(eVar.f44669b)) && a2.g(this.f44670c, eVar.f44670c);
    }

    public final int hashCode() {
        return a2.i(this.f44670c) + ((a2.i(Boolean.valueOf(this.f44669b)) + ((a2.i(Boolean.valueOf(this.f44668a)) + (e.class.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GeneralOptions(allowMultiple=" + this.f44668a + ", usePhotoPicker=" + this.f44669b + ", limit=" + this.f44670c + ")";
    }
}
