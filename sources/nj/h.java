package nj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46782c;

    public h(String str, String str2, String str3) {
        this.f46780a = str;
        this.f46781b = str2;
        this.f46782c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(h.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        h hVar = (h) obj;
        return x7.a.n(this.f46780a, hVar.f46780a) && x7.a.n(this.f46781b, hVar.f46781b) && x7.a.n(this.f46782c, hVar.f46782c);
    }

    public final int hashCode() {
        return x7.a.o(this.f46782c) + ((x7.a.o(this.f46781b) + ((x7.a.o(this.f46780a) + (h.class.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return defpackage.e.q(this.f46782c, ")", defpackage.e.v("ShortcutItemMessage(type=", this.f46780a, ", localizedTitle=", this.f46781b, ", icon="));
    }
}
