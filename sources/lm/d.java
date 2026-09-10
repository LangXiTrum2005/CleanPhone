package lm;

import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vl.f f45527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl.j f45528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vl.a f45529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f45530d;

    public d(vl.f nameResolver, tl.j classProto, vl.a aVar, j0 sourceElement) {
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        kotlin.jvm.internal.n.f(classProto, "classProto");
        kotlin.jvm.internal.n.f(sourceElement, "sourceElement");
        this.f45527a = nameResolver;
        this.f45528b = classProto;
        this.f45529c = aVar;
        this.f45530d = sourceElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.n.a(this.f45527a, dVar.f45527a) && kotlin.jvm.internal.n.a(this.f45528b, dVar.f45528b) && kotlin.jvm.internal.n.a(this.f45529c, dVar.f45529c) && kotlin.jvm.internal.n.a(this.f45530d, dVar.f45530d);
    }

    public final int hashCode() {
        return this.f45530d.hashCode() + ((this.f45529c.hashCode() + ((this.f45528b.hashCode() + (this.f45527a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f45527a + ", classProto=" + this.f45528b + ", metadataVersion=" + this.f45529c + ", sourceElement=" + this.f45530d + ')';
    }
}
