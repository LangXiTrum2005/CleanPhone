package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f6765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jk.d f6766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f6768e;

    public t(Object obj, i iVar, jk.d dVar, Object obj2, Throwable th2) {
        this.f6764a = obj;
        this.f6765b = iVar;
        this.f6766c = dVar;
        this.f6767d = obj2;
        this.f6768e = th2;
    }

    public static t a(t tVar, i iVar, Throwable th2, int i10) {
        Object obj = tVar.f6764a;
        if ((i10 & 2) != 0) {
            iVar = tVar.f6765b;
        }
        i iVar2 = iVar;
        jk.d dVar = tVar.f6766c;
        Object obj2 = tVar.f6767d;
        if ((i10 & 16) != 0) {
            th2 = tVar.f6768e;
        }
        return new t(obj, iVar2, dVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.n.a(this.f6764a, tVar.f6764a) && kotlin.jvm.internal.n.a(this.f6765b, tVar.f6765b) && kotlin.jvm.internal.n.a(this.f6766c, tVar.f6766c) && kotlin.jvm.internal.n.a(this.f6767d, tVar.f6767d) && kotlin.jvm.internal.n.a(this.f6768e, tVar.f6768e);
    }

    public final int hashCode() {
        Object obj = this.f6764a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f6765b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        jk.d dVar = this.f6766c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Object obj2 = this.f6767d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f6768e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f6764a + ", cancelHandler=" + this.f6765b + ", onCancellation=" + this.f6766c + ", idempotentResume=" + this.f6767d + ", cancelCause=" + this.f6768e + ')';
    }

    public /* synthetic */ t(Object obj, i iVar, jk.d dVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : iVar, (i10 & 4) != 0 ? null : dVar, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
