package lm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f45561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xl.f f45563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yl.b f45565f;

    public m(Object obj, Object obj2, xl.f fVar, xl.f fVar2, String filePath, yl.b bVar) {
        kotlin.jvm.internal.n.f(filePath, "filePath");
        this.f45560a = obj;
        this.f45561b = obj2;
        this.f45562c = fVar;
        this.f45563d = fVar2;
        this.f45564e = filePath;
        this.f45565f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f45560a.equals(mVar.f45560a) && kotlin.jvm.internal.n.a(this.f45561b, mVar.f45561b) && kotlin.jvm.internal.n.a(this.f45562c, mVar.f45562c) && this.f45563d.equals(mVar.f45563d) && kotlin.jvm.internal.n.a(this.f45564e, mVar.f45564e) && this.f45565f.equals(mVar.f45565f);
    }

    public final int hashCode() {
        int iHashCode = this.f45560a.hashCode() * 31;
        Object obj = this.f45561b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f45562c;
        return this.f45565f.hashCode() + d5.u.e((this.f45563d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31, 31, this.f45564e);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f45560a + ", compilerVersion=" + this.f45561b + ", languageVersion=" + this.f45562c + ", expectedVersion=" + this.f45563d + ", filePath=" + this.f45564e + ", classId=" + this.f45565f + ')';
    }
}
